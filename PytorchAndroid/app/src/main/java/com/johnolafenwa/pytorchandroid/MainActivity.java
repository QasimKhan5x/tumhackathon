package com.johnolafenwa.pytorchandroid;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.pytorch.IValue;
import org.pytorch.LiteModuleLoader;
import org.pytorch.Module;
import org.pytorch.Tensor;
import org.pytorch.torchvision.TensorImageUtils;
import org.pytorch.MemoryFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    int cameraRequestCode = 001;


    Dialog mVideoDialog;
    VideoView mVideoFullScreen;
    MediaController controller;
    ImageView crossimg;
    Module module = null;
    Button btn_gallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        Button capture = findViewById(R.id.capture);
        btn_gallery=findViewById( R.id.gallery );

        Bitmap bitmap = null;

        try {
            // creating bitmap from packaged into app android asset 'image.jpg',
            // app/src/main/assets/image.jpg
            //bitmap = BitmapFactory.decodeStream(getAssets().open("septoria.jpeg"));
            // loading serialized torchscript module from packaged into app android asset model.pt,
            // app/src/model/assets/model.pt
            module = LiteModuleLoader.load(assetFilePath(this, "model11.pt"));
        } catch (IOException e) {
            Log.e("PytorchHelloWorld", "Error reading assets", e);
            finish();
        }
        Log.i("LoadModel", "Model loaded successfully!");
        // showing image on UI

//        mVideoDialog = new Dialog(this);
//        mVideoDialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
//        mVideoDialog.setContentView(R.layout.selection_theme);
//
//        mVideoFullScreen = (VideoView) mVideoDialog.findViewById(R.id.videoView);
//        crossimg= (ImageView) mVideoDialog.findViewById( R.id.cross );
//        crossimg.setImageResource(R.drawable.cancel);
//
//        // controller = new MediaController(this);
//
//
//        mVideoFullScreen.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videoclip);
//
//        MediaController mediaController = new MediaController(this);
//        //link mediaController to videoView
//        mediaController.setAnchorView(mVideoFullScreen);
//        //allow mediaController to control our videoView
//        mVideoFullScreen.setMediaController(mediaController);
//        mVideoFullScreen.start();
//        mVideoDialog.getWindow().setBackgroundDrawable((new ColorDrawable( Color.TRANSPARENT)));
//        mVideoDialog.show();
//
//        crossimg.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                mVideoDialog.dismiss();
//
//            }
//        } );


        capture.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,cameraRequestCode);


            }


        });
        btn_gallery.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult( galleryIntent,3 );
            }
        } );

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        if(resultCode == RESULT_OK && data !=null ){

            if(requestCode == cameraRequestCode) {
                Intent resultView = new Intent( this, Result.class );
//
              //  resultView.putExtra( "imagedata", data.getExtras() );
//
                Bitmap imageBitmap = (Bitmap) data.getExtras().get( "data" );

//            ImageView imageView = findViewById(R.id.image);
//            imageView.setImageBitmap(bitmap);
                Log.i( "ImageSet", "Image set on UI" );
                String pred=Inference(imageBitmap);


                resultView.putExtra("pred",pred);
              startActivity(resultView);
            }
         else if(requestCode==3){
                Uri selectedImage = data.getData();
                ImageView imageView = findViewById(R.id.imagex);
                imageView.setImageURI(selectedImage);
                Intent intent2= new Intent( this, Result.class );

                BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
                Bitmap bitmap = drawable.getBitmap();
                String pred=Inference(bitmap);
                intent2.putExtra( "pred",pred );
                startActivity(intent2);
            }

        }


////
   }
   public String Inference(Bitmap imageBitmap )
   {
       // preparing input tensor
       final Tensor inputTensor = TensorImageUtils.bitmapToFloat32Tensor(imageBitmap,
               TensorImageUtils.TORCHVISION_NORM_MEAN_RGB, TensorImageUtils.TORCHVISION_NORM_STD_RGB, MemoryFormat.CHANNELS_LAST);
       Log.i("PrepareInputTensor", "Input ready for processing");
       // running the model
       final Tensor outputTensor = module.forward(IValue.from(inputTensor)).toTensor();
       Log.i("TensorShape", Arrays.toString(outputTensor.shape()));
       // getting tensor content as java array of floats
       final float[] scores = outputTensor.getDataAsFloatArray();

       // searching for the index with maximum score
       float maxScore = -Float.MAX_VALUE;
       int maxScoreIdx = -1;
       for (int i = 0; i < scores.length; i++) {
           if (scores[i] > maxScore) {
               maxScore = scores[i];
               maxScoreIdx = i;
           }
       }

       String pred = Constants.IMAGENET_CLASSES[maxScoreIdx];
       return pred;
   }




    /**
     * Copies specified asset to the file in /files app directory and returns this file absolute path.
     *
     * @return absolute file path
     */
    public static String assetFilePath(Context context, String assetName) throws IOException {
        File file = new File(context.getFilesDir(), assetName);
        if (file.exists() && file.length() > 0) {
            return file.getAbsolutePath();
        }

        try (InputStream is = context.getAssets().open(assetName)) {
            try (OutputStream os = new FileOutputStream(file)) {
                byte[] buffer = new byte[4 * 1024];
                int read;
                while ((read = is.read(buffer)) != -1) {
                    os.write(buffer, 0, read);
                }
                os.flush();
            }
            return file.getAbsolutePath();
        }
    }
}

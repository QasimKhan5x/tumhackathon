package com.johnolafenwa.pytorchandroid;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URI;

public class Result extends AppCompatActivity {
     MediaPlayer music;
    ImageView play;
    ImageView pause ;
    ImageView stop;
    TextView textView ;
    VideoView healthyanim;
    String pred;
    TextView suggestion;
    //TextView headingsuggestion;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_result );

        play = findViewById( R.id.imageplay );
        pause = findViewById( R.id.imagepause );
        stop = findViewById( R.id.imagestop );
        healthyanim=findViewById( R.id.healthanimation );
       // headingsuggestion=findViewById( R.id.headingSuggestion );

        textView = findViewById( R.id.label );

        //suggestion = findViewById( R.id.labelSuggestion );

       // Bitmap imageBitmap = (Bitmap) getIntent().getBundleExtra( "imagedata" ).get( "data" );

        pred = getIntent().getStringExtra( "pred" );

        ImageView imageView = findViewById( R.id.image );
//        imageView.setImageResource( R.drawable.powdery );
//
//        play.setVisibility( View.VISIBLE );
//        pause.setVisibility( View.VISIBLE );
//        stop.setVisibility( View.VISIBLE );
//        textView.setVisibility( View.GONE );
//        healthyanim.setVisibility( View.GONE );
//        imageView.setVisibility( View.VISIBLE);
//        headingsuggestion.setVisibility( View.GONE );
//        suggestion.setVisibility(View.VISIBLE);

//        healthyanim.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.healthyanimation);
//
//        MediaController mediaController = new MediaController(this);
//        //link mediaController to videoView
//        mediaController.setAnchorView(healthyanim);
//        //allow mediaController to control our videoView
//       healthyanim.setMediaController(mediaController);
//        healthyanim.start();
//        String videopath="android.resource://" + getPackageName() + "/" + R.raw.healthyanimation;
//        Uri uri= Uri.parse( videopath );
//        healthyanim.setVideoURI( uri );

//        textView.setText("Disease:"+ "Nkwammoaa a ??ba akyiri yi");
//        suggestion.setText( "Nnuru a w??de kum fungi a w??de petepete so no ne ??kwan a etu mp??n sen biara a w??fa so siw ??yare a ??ba akyiri no ano. W?? turoy??fo a w??taa y?? ne w??n a w??y?? aguadi mu no, wobetumi de nnuru a ??b?? ho ban te s?? chlorothalonil (e.g., Bravo, Echo, Equus, anaa Daconil) ne Mancozeb (Manzate) adi dwuma. K?? so petepete afifide so dap??n biara na ama woab?? afifide ho ban afi ??yare mmoawa foforo ho. Wobetumi ay?? afifide a ??yare no ay?? k??se no atoro na w??asie anaas?? w??ahyew. Kwati s?? wob??ma afifide a ??yare ay?? compost.\n" +
//                "\n" );
//        music = MediaPlayer.create( Result.this, R.raw.twispeaker );
//            music.start();
//
//            play.setOnClickListener( new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (music.isPlaying()) {
//                        music.stop();
//                        music.start();
//                    } else {
//                        music.start();
//                    }
//
//                }
//            } );
//            pause.setOnClickListener( new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    music.pause();
//                }
//            } );
//            stop.setOnClickListener( new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    music.stop();
//                    music = MediaPlayer.create( Result.this, R.raw.twispeaker );
//                }
//            } );

////////////////////////////////////////////////////////////////// hardcode check above
        if (pred.equals( "Late_blight" )) {
          //  suggestion.setText( "Nnuru a w??de kum fungi a w??de petepete so no ne ??kwan a etu mp??n sen biara a w??fa so siw ??yare a ??ba akyiri no ano. W?? turoy??fo a w??taa y?? ne w??n a w??y?? aguadi mu no, wobetumi de nnuru a ??b?? ho ban te s?? chlorothalonil (e.g., Bravo, Echo, Equus, anaa Daconil) ne Mancozeb (Manzate) adi dwuma. K?? so petepete afifide so dap??n biara na ama woab?? afifide ho ban afi ??yare mmoawa foforo ho. Wobetumi ay?? afifide a ??yare no ay?? k??se no atoro na w??asie anaas?? w??ahyew. Kwati s?? wob??ma afifide a ??yare ay?? compost." );
          //  textView.setText( "Disease" + "Nkwammoaa a ??ba akyiri yi" );
       imageView.setImageResource( R.drawable.lateblight );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
       // headingsuggestion.setVisibility( View.GONE );
      //  suggestion.setVisibility(View.VISIBLE);
            music = MediaPlayer.create( Result.this, R.raw.lateblightly );
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.lateblightly );
                }
            } );

        } else if (pred.equals( "healthy" )) {
        play.setVisibility( View.GONE );
        pause.setVisibility( View.GONE );
        stop.setVisibility( View.GONE );
        textView.setVisibility( View.GONE );
        imageView.setVisibility( View.GONE);
       // headingsuggestion.setVisibility( View.GONE );

    //    suggestion.setVisibility(View.GONE);

        healthyanim.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.healthyanimation);
        healthyanim.setVisibility( View.VISIBLE );
        MediaController mediaController = new MediaController(this);
        //link mediaController to videoView
        mediaController.setAnchorView(healthyanim);
        //allow mediaController to control our videoView
       healthyanim.setMediaController(mediaController);
        healthyanim.start();


        } else if (pred.equals( "Early_blight" )) {
            music = MediaPlayer.create( Result.this, R.raw.earlyblight );
      //      suggestion.setText( "Fa Bonide Liquid Copper Fungicide concentrate anaa Bonide Tomato & Vegetable petepete afifide no so yiye (ahaban ase nso). Saa ayaresa abien yi nyinaa y?? nea w??mfa nnuru nni dwuma wom. Mfa nnuru a ekum mmoawa, nnuru a ekum fungi, nnuru a w??de y?? asase anaa nnuru a ekum wura npetepete so w?? ??hyew a ??k?? soro mu. Nsuo gu w???afifide so da a edi kan ansa na wob??petepete so, nsu a wode b??ma no ho hia!" );
       //     textView.setText( "Disease" + "Blight a ??ba nt??m" );
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.earlyblight );
                }
            } );
        } else if (pred.equals( "Septoria_leaf_spot" )) {
            music = MediaPlayer.create( Result.this, R.raw.septoria );
          //  suggestion.setText( "1) Yi nhaban a ??yare no fi aduaba no ase. 2) Ma mframa a ??twa afifide no ho hyia no tu mp??n. 3) Fa mulch twa afifide no ase ho hyia. 4) Mfa nsuo a ??w?? soro nni dwuma. 5) Siw nwura ano. 6) Nnua tomato bio w?? beae koro no ara a tomato a yare no nyin no. 7) Fa nnuru a w??de petepete so a ekum fungi di dwuma." );
          //  textView.setText( "Disease:" + "Septoria ahaban a ??w?? h?? no" );

              imageView.setImageResource( R.drawable.septoria );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
    //    headingsuggestion.setVisibility( View.GONE );
     //   suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.septoria );
                }
            } );
        } else if (pred.equals( "Tomato_Yellow_Leaf_Curl_Virus" )) {
         //   suggestion.setText( "Fa neonicotinoid nnuru a ekum nkoekoemmoa, te s?? dinotefuran (Venom) imidacloprid (AdmirePro, Alias, Nuprid, Widow, ne afoforo) anaa thiamethoxam (Platinum), di dwuma s?? asase a wode gu so anaas?? fa nsu a w??de gugu nn??bae so no so bere a wode tomato anaa ??mo redua no." );
         //   textView.setText( "Disease" + "Tomato Ahaban K??k???? a ??y?? Curl Virus" );
            music = MediaPlayer.create( Result.this, R.raw.tomatoyellow );
    imageView.setImageResource( R.drawable.tomatoyellow );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
     //   headingsuggestion.setVisibility( View.GONE );
      //  suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.tomatoyellow );
                }
            } );
        } else if (pred.equals( "Bacterial_spot" )) {
            music = MediaPlayer.create( Result.this, R.raw.bacterialspot );
          //  suggestion.setText( "Wontumi nsa ??yare mmoawa a ??w?? h?? no yare. Yi afifide a ??yare no w?? mu no fi afuw mu anaa dan a ??y?? hyew mu na amma mmoawa no antr??w ak?? afifide a ??w?? ap??wmuden mu. Hye, sie anaa fa compost hyew afifide a ??yare no aka no na NNNI nnuaba a ??yare no wom." );
          //  textView.setText( "Disease:" + "Bacterial spot a ??w?? h??" );
              imageView.setImageResource( R.drawable.bacterialspot );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
     //   headingsuggestion.setVisibility( View.GONE );
      //  suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.bacterialspot );
                }
            } );
        } else if (pred.equals( "Target_Spot" )) {
            music = MediaPlayer.create( Result.this, R.raw.targetspot );
           // suggestion.setText( "Fa nnuru a w??de kum fungi a chlorothalonil, mancozeb, ne k??bere oxychloride wom di dwuma na ama woatumi adi baabi a wop?? s?? wok?? no yiye w?? nhwehw??mu s??hw?? ahorow mu.\n" +
                 //   "\n" );
           // textView.setText( "Disease:" + "Beae a W??de Si H??" );
              imageView.setImageResource( R.drawable.targetspot );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
     //   headingsuggestion.setVisibility( View.GONE );
      //  suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.targetspot );
                }
            } );
        }
        else if(pred.equals( "Tomato_mosaic_virus" )){  music = MediaPlayer.create( Result.this, R.raw.tomatomosaic );
       // suggestion.setText( "Nnuru biara nni h?? a wobetumi apaw a etu mp??n ko tia ??yare mmoawa yi. Nnua tomato bio w?? ha. Hohoro wo nsa ne nnwinnade s??nea ??b??y?? a mmoawa no rentr??w nk?? afifide afoforo mu." );
       // textView.setText( "Disease: " + "Tomato mosaic mmoawa a w??de y?? mmoawa" );
              imageView.setImageResource( R.drawable.tomatomosaic );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
     //   headingsuggestion.setVisibility( View.GONE );
     //   suggestion.setVisibility(View.VISIBLE);
        music.start();
        play.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (music.isPlaying()) {
                    music.stop();
                    music.start();
                } else {
                    music.start();
                }

            }
        } );
        pause.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.pause();
            }
        } );
        stop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.stop();
                music = MediaPlayer.create( Result.this, R.raw.tomatomosaic);
            }
        } );
    }
        else if(pred.equals( "Leaf_Mold" )){
            music = MediaPlayer.create( Result.this, R.raw.leafmold );
       // suggestion.setText( "S?? w??de nnuru a ekum fungi gu so bere a yare no ho s??nkyer??nne di kan ada adi no a, ebetumi atew ahaban mu nsu a ??y?? f?? no tr??w so k??se.\n" +
                //"\n" );
      //  textView.setText("Disease:" +"Ahaban Nkuku" );

              imageView.setImageResource( R.drawable.leafmold );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
      //  headingsuggestion.setVisibility( View.GONE );
     //   suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.leafmold );
                }
            } );}
        else if(pred.equals( "Spider_mites Two-spotted_spider_mite" )){  music = MediaPlayer.create( Result.this, R.raw.spidermites );
       // suggestion.setText( "S?? ??yare mmoawa no ntr??w a, ??nde na mmoawa a w??s??e nn??bae no w?? mp??tam h??. Ebia aduru a w??de petepete so no b??y?? nea etu mp??n. S?? wopetepete afuw no f?? bi p?? so a, petepete so w?? beae a ??y?? anamm??n 100 kosi 200 a ??boro baabi a mmoawa no ahy?? no ma no.\n" +
                //"\n" );
      //  textView.setText( "Disease: "+"Spider Mites Ak??re a ??w?? nsensanee abien" );
              imageView.setImageResource( R.drawable.spidermite );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
      //  headingsuggestion.setVisibility( View.GONE );
       // suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.spidermites );
                }
            } );}
else if(pred.equals( "powdery mildew " )) {
            music = MediaPlayer.create( Result.this, R.raw.powdermildew );
           // suggestion.setText( "Tomato powdery mildew no nyin w?? afifide a adwennwene wom so, enti ma aduannuru pii, nsu ne aduru a w??de hy?? mu a ??b??ma w??adi w??n ahiade ho dwuma. S?? tomato powdery mildew abu so w?? mo mmeae a, fa nufusu f?? biako ne nsu f?? anum afrafra petepete afifide so w?? ??kwan a ??b??ma woatumi asiw ano dap??n biara, fi ase w?? ahohuru bere mfinimfini." );
           // textView.setText( "Disease: " + "powdery a ??y?? akisikuru" );
              imageView.setImageResource( R.drawable.powdery );

        play.setVisibility( View.VISIBLE );
        pause.setVisibility( View.VISIBLE );
        stop.setVisibility( View.VISIBLE );
        textView.setVisibility( View.GONE );
        healthyanim.setVisibility( View.GONE );
        imageView.setVisibility( View.VISIBLE);
   //     headingsuggestion.setVisibility( View.GONE );
   //     suggestion.setVisibility(View.VISIBLE);
            music.start();
            play.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (music.isPlaying()) {
                        music.stop();
                        music.start();
                    } else {
                        music.start();
                    }

                }
            } );
            pause.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.pause();
                }
            } );
            stop.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    music.stop();
                    music = MediaPlayer.create( Result.this, R.raw.powdermildew );
                }
            } );
        }
       }
    @Override
    protected void onPause() {

        super.onPause();
        music.stop();


    }
    @Override
    public void onBackPressed() {
        if (healthyanim != null) {
            healthyanim.stopPlayback();
            this.finish();
        }
        else {
            super.onBackPressed();
            this.finish();
        }
    }

}

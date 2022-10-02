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

//        textView.setText("Disease:"+ "Nkwammoaa a ɛba akyiri yi");
//        suggestion.setText( "Nnuru a wɔde kum fungi a wɔde petepete so no ne ɔkwan a etu mpɔn sen biara a wɔfa so siw ɔyare a ɛba akyiri no ano. Wɔ turoyɛfo a wɔtaa yɛ ne wɔn a wɔyɛ aguadi mu no, wobetumi de nnuru a ɛbɔ ho ban te sɛ chlorothalonil (e.g., Bravo, Echo, Equus, anaa Daconil) ne Mancozeb (Manzate) adi dwuma. Kɔ so petepete afifide so dapɛn biara na ama woabɔ afifide ho ban afi ɔyare mmoawa foforo ho. Wobetumi ayɛ afifide a ɔyare no ayɛ kɛse no atoro na wɔasie anaasɛ wɔahyew. Kwati sɛ wobɛma afifide a ɛyare ayɛ compost.\n" +
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
          //  suggestion.setText( "Nnuru a wɔde kum fungi a wɔde petepete so no ne ɔkwan a etu mpɔn sen biara a wɔfa so siw ɔyare a ɛba akyiri no ano. Wɔ turoyɛfo a wɔtaa yɛ ne wɔn a wɔyɛ aguadi mu no, wobetumi de nnuru a ɛbɔ ho ban te sɛ chlorothalonil (e.g., Bravo, Echo, Equus, anaa Daconil) ne Mancozeb (Manzate) adi dwuma. Kɔ so petepete afifide so dapɛn biara na ama woabɔ afifide ho ban afi ɔyare mmoawa foforo ho. Wobetumi ayɛ afifide a ɔyare no ayɛ kɛse no atoro na wɔasie anaasɛ wɔahyew. Kwati sɛ wobɛma afifide a ɛyare ayɛ compost." );
          //  textView.setText( "Disease" + "Nkwammoaa a ɛba akyiri yi" );
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
      //      suggestion.setText( "Fa Bonide Liquid Copper Fungicide concentrate anaa Bonide Tomato & Vegetable petepete afifide no so yiye (ahaban ase nso). Saa ayaresa abien yi nyinaa yɛ nea wɔmfa nnuru nni dwuma wom. Mfa nnuru a ekum mmoawa, nnuru a ekum fungi, nnuru a wɔde yɛ asase anaa nnuru a ekum wura npetepete so wɔ ɔhyew a ɛkɔ soro mu. Nsuo gu w’afifide so da a edi kan ansa na wobɛpetepete so, nsu a wode bɛma no ho hia!" );
       //     textView.setText( "Disease" + "Blight a ɛba ntɛm" );
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
          //  suggestion.setText( "1) Yi nhaban a ɛyare no fi aduaba no ase. 2) Ma mframa a ɛtwa afifide no ho hyia no tu mpɔn. 3) Fa mulch twa afifide no ase ho hyia. 4) Mfa nsuo a ɛwɔ soro nni dwuma. 5) Siw nwura ano. 6) Nnua tomato bio wɔ beae koro no ara a tomato a yare no nyin no. 7) Fa nnuru a wɔde petepete so a ekum fungi di dwuma." );
          //  textView.setText( "Disease:" + "Septoria ahaban a ɛwɔ hɔ no" );

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
         //   suggestion.setText( "Fa neonicotinoid nnuru a ekum nkoekoemmoa, te sɛ dinotefuran (Venom) imidacloprid (AdmirePro, Alias, Nuprid, Widow, ne afoforo) anaa thiamethoxam (Platinum), di dwuma sɛ asase a wode gu so anaasɛ fa nsu a wɔde gugu nnɔbae so no so bere a wode tomato anaa ɛmo redua no." );
         //   textView.setText( "Disease" + "Tomato Ahaban Kɔkɔɔ a Ɛyɛ Curl Virus" );
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
          //  suggestion.setText( "Wontumi nsa ɔyare mmoawa a ɛwɔ hɔ no yare. Yi afifide a ɔyare no wɔ mu no fi afuw mu anaa dan a ɛyɛ hyew mu na amma mmoawa no antrɛw akɔ afifide a ɛwɔ apɔwmuden mu. Hye, sie anaa fa compost hyew afifide a ɔyare no aka no na NNNI nnuaba a ɔyare no wom." );
          //  textView.setText( "Disease:" + "Bacterial spot a ɛwɔ hɔ" );
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
           // suggestion.setText( "Fa nnuru a wɔde kum fungi a chlorothalonil, mancozeb, ne kɔbere oxychloride wom di dwuma na ama woatumi adi baabi a wopɛ sɛ wokɔ no yiye wɔ nhwehwɛmu sɔhwɛ ahorow mu.\n" +
                 //   "\n" );
           // textView.setText( "Disease:" + "Beae a Wɔde Si Hɔ" );
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
       // suggestion.setText( "Nnuru biara nni hɔ a wobetumi apaw a etu mpɔn ko tia ɔyare mmoawa yi. Nnua tomato bio wɔ ha. Hohoro wo nsa ne nnwinnade sɛnea ɛbɛyɛ a mmoawa no rentrɛw nkɔ afifide afoforo mu." );
       // textView.setText( "Disease: " + "Tomato mosaic mmoawa a wɔde yɛ mmoawa" );
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
       // suggestion.setText( "Sɛ wɔde nnuru a ekum fungi gu so bere a yare no ho sɛnkyerɛnne di kan ada adi no a, ebetumi atew ahaban mu nsu a ɛyɛ fĩ no trɛw so kɛse.\n" +
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
       // suggestion.setText( "Sɛ ɔyare mmoawa no ntrɛw a, ɛnde na mmoawa a wɔsɛe nnɔbae no wɔ mpɔtam hɔ. Ebia aduru a wɔde petepete so no bɛyɛ nea etu mpɔn. Sɛ wopetepete afuw no fã bi pɛ so a, petepete so wɔ beae a ɛyɛ anammɔn 100 kosi 200 a ɛboro baabi a mmoawa no ahyɛ no ma no.\n" +
                //"\n" );
      //  textView.setText( "Disease: "+"Spider Mites Akɔre a ɛwɔ nsensanee abien" );
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
           // suggestion.setText( "Tomato powdery mildew no nyin wɔ afifide a adwennwene wom so, enti ma aduannuru pii, nsu ne aduru a wɔde hyɛ mu a ɛbɛma wɔadi wɔn ahiade ho dwuma. Sɛ tomato powdery mildew abu so wɔ mo mmeae a, fa nufusu fã biako ne nsu fã anum afrafra petepete afifide so wɔ ɔkwan a ɛbɛma woatumi asiw ano dapɛn biara, fi ase wɔ ahohuru bere mfinimfini." );
           // textView.setText( "Disease: " + "powdery a ɛyɛ akisikuru" );
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

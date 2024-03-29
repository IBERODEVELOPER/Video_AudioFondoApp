package com.informatico.ibero.video_audiofondoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Para el video*/
        VideoView videoup=(VideoView)findViewById(R.id.Videovup);
        //capturamos la orientacion del dispositivo
        int orientacion = getResources().getConfiguration().orientation;
        //consultamos si el dispositivo ests en LANDSCAPE
        if(orientacion == Configuration.ORIENTATION_LANDSCAPE){
            //ocultamos el action bar
           getSupportActionBar().hide();
        }else{//mostramos el action bar
            getSupportActionBar().show();
        }
        //activamos el controlador
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoup);
        //direccion del video
        //Uri path = Uri.parse("android.resource://com.informatico.ibero.video_audiofondoapp/"+R.raw.cat1);
        Uri path = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.cat1);
        //lo damos el controlador al video
        videoup.setMediaController(mc);
        //le damos la direccion al video de donde se cargara
        videoup.setVideoURI(path);
        //Lanzamos el video para su reproduccion
        videoup.start();

    }
}
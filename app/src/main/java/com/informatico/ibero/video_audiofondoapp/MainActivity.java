package com.informatico.ibero.video_audiofondoapp;

import androidx.appcompat.app.AppCompatActivity;

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
        //activamos el controlador
        MediaController mc = new MediaController(this);
        //direccion del video
        Uri path = Uri.parse("android.resource://informatico.to.audioapp/"+R.raw.video1);
        //lo damos el controlador al video
        videoup.setMediaController(mc);
        //le damos la direccion al video de donde se cargara
        videoup.setVideoURI(path);
        //Lanzamos el video para su reproduccion
        videoup.start();

    }
    public void MusicadeFondo(){
 /*musica de fondo*/
//Creamos un objeto de la clase para darla la ruta del archivo
        MediaPlayer reproductor=MediaPlayer.create(this,R.raw.musica1);
        //setLooping nospermite que se vuelva a reproducir el audio
        reproductor.setLooping(true);
        //Iniciamos la reproduccion de audio audio
        reproductor.start();
    }
}
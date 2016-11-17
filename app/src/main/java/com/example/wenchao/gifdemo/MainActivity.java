package com.example.wenchao.gifdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.wenchao.gifdemo.view.GifView;

public class MainActivity extends AppCompatActivity {
    private GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifView = (GifView) findViewById(R.id.gif_view);
        gifView.setMovieResource(R.raw.angel);
    }
}

package com.bkacad.tu.backgroundrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Load lai hinh
        Picasso.get().load("http://source.unsplash.com/300x300").into(img);
    }
}
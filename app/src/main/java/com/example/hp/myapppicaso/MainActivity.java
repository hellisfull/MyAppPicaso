package com.example.hp.myapppicaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView im1,im2,im3,im4,im5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im1=(ImageView)findViewById(R.id.imageView2);
        im2=(ImageView)findViewById(R.id.imma2);
        im3=(ImageView)findViewById(R.id.immm);
        im4=(ImageView)findViewById(R.id.immmmmm);
        im5=(ImageView)findViewById(R.id.imageView);
        Picasso.with(getApplicationContext())
                .load("http://jonvilma.com/images/apple-16.jpg")
                .placeholder(R.drawable.pic)
                .error(R.drawable.error)
                .into(im1);
        Picasso.with(getApplicationContext())
                .load("https://cdn.vox-cdn.com/thumbor/04IR7Ys7wbrRP0NTy3esBcIGVA0=/0x0:2040x1360/1200x800/filters:focal(857x517:1183x843)/cdn.vox-cdn.com/uploads/chorus_image/image/54908393/apple-macbook-event-20161027-7271.0.0.jpg")
                .into(im2);
        Picasso.with(getApplicationContext())
                .load("https://yt3.ggpht.com/-KdgJnz1HIdQ/AAAAAAAAAAI/AAAAAAAAAAA/4vVN7slJqj4/s900-c-k-no-mo-rj-c0xffffff/photo.jpg")
                .into(im3);
        Picasso.with(getApplicationContext())
                .load("https://pbs.twimg.com/profile_images/826558134906929157/NkPLMpA4.jpg")
                .into(im4);
        Picasso.with(getApplicationContext())
                .load("http://cdn.wccftech.com/wp-content/uploads/2017/03/Apple-Disney-Rumours-01-Header.jpg")
                .into(im5);

    }

}

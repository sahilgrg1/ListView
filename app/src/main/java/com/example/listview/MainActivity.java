package com.example.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity
{
private CircleImageView circleImageView;
private Button btn,btn2;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleImageView = findViewById(R.id.profile_image);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://theme4press.com/wp-content/uploads/2015/11/featured-small-circular.jpg").into(circleImageView);
            }
        });
        img = findViewById(R.id.imgee);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Web.class);
                intent.putExtra("url","https://www.facebook.com/");
                startActivity(intent);

            }
        });
        btn2 = findViewById(R.id.butt2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("textPlain");
                intent.putExtra(Intent.EXTRA_TEXT,"hello bro just checking");
                startActivity(Intent.createChooser(intent,"Via share"));

            }
        });



    }
}

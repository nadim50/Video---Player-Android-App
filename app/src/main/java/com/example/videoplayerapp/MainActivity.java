package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout q1,q2,q3,q4,q5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1=findViewById(R.id.q1);
        q2=findViewById(R.id.q2);
        q3=findViewById(R.id.q3);
        q4=findViewById(R.id.q4);
        q5=findViewById(R.id.q5);

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Content.url="https://www.youtube.com/embed/MMyHqqgbWUs";
                Intent i=new Intent(MainActivity.this,Content.class);
                startActivity(i);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Content.url="https://www.youtube.com/embed/VLyktW15HXI";
                Intent i=new Intent(MainActivity.this,Content.class);
                startActivity(i);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Content.url="https://www.youtube.com/embed/iFY0WpGIYU4";
                Intent i=new Intent(MainActivity.this,Content.class);
                startActivity(i);
            }
        });

        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Content.url="https://www.youtube.com/embed/Lq2exqu0TkQ";
                Intent i=new Intent(MainActivity.this,Content.class);
                startActivity(i);
            }
        });

        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Content.url="https://www.youtube.com/embed/4suTpr2hCc4";
                Intent i=new Intent(MainActivity.this,Content.class);
                startActivity(i);
            }
        });



    }
}
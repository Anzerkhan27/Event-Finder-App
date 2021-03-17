package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashscreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen1);
        ImageView imageView = (ImageView)findViewById(R.id.imageView1);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);
        TextView textView = (TextView)findViewById(R.id.developerName);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade2);
        textView.startAnimation(animation2);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen1.this,SplashAcitivty.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}

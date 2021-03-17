package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {
TextView textView ;
TextView textView1;
TextView textView2;
TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        textView = (TextView)findViewById(R.id.nameTextview);
        textView1 = (TextView)findViewById(R.id.surnameTextView);
        textView2= (TextView)findViewById(R.id.emailTextView);
        textView3 = (TextView)findViewById(R.id.mobileNoTextView);

        textView.setText(getIntent().getStringExtra("FirstName"));
        textView1.setText(getIntent().getStringExtra("Surname"));
        textView2.setText(getIntent().getStringExtra("Email"));
        textView3.setText(getIntent().getStringExtra("MobileNo"));



    }
}

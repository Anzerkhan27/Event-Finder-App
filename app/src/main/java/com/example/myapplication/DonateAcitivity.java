package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DonateAcitivity extends AppCompatActivity {
    EditText amountInput;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_donate_acitivity);
      amountInput = (EditText)findViewById(R.id.amountEditText);
      amountInput.setInputType(InputType.TYPE_CLASS_NUMBER);
        Button donateButton = (Button)findViewById(R.id.donateButton);
        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView)findViewById(R.id.donationSuccessTextView);
                textView.setText("Donation successful");

            }
        });


        }


    }




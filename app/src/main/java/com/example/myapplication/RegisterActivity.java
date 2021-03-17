package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class RegisterActivity extends AppCompatActivity {
    EditText firstName;
    EditText surname;
    EditText email;
    EditText mobileNo;
AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firstName = (EditText)findViewById(R.id.fistNameEditText);
        surname = (EditText)findViewById(R.id.surnameEditText);
        email = (EditText)findViewById(R.id.emailEditText);
        mobileNo = (EditText)findViewById(R.id.mobileNoEditText);


        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(RegisterActivity.this,R.id.fistNameEditText, RegexTemplate.NOT_EMPTY,R.string.invalid_name);
        awesomeValidation.addValidation(RegisterActivity.this,R.id.surnameEditText, RegexTemplate.NOT_EMPTY,R.string.invalid_name);
        awesomeValidation.addValidation(RegisterActivity.this,R.id.mobileNoEditText, "[4-9]{1}[0-9]{9}$",R.string.invalid_mobile);
        awesomeValidation.addValidation(RegisterActivity.this,R.id.emailEditText, Patterns.EMAIL_ADDRESS,R.string.invalid_email);
        Button submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (awesomeValidation.validate()){
                String name = firstName.getText().toString();
                String name2 = surname.getText().toString();
                String name3 = email.getText().toString();
                String name4 = mobileNo.getText().toString();

                Intent intent = new Intent(RegisterActivity.this, ConfirmationActivity.class);
                intent.putExtra("FirstName", name);
                intent.putExtra("Surname", name2);
                intent.putExtra("Email", name3);
                intent.putExtra("MobileNo", name4);
                startActivity(intent);
            }

            }
        });

    }

}

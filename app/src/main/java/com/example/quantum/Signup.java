package com.example.quantum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button signup_register=(Button)findViewById(R.id.signup_register);
        signup_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email_register=(EditText)findViewById(R.id.email_register);
                EditText mobileno_register=(EditText)findViewById(R.id.mobileno_register);

            }
        });
    }
}
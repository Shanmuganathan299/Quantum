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

        Button register_signup=(Button)findViewById(R.id.register_signup);
        register_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email=(EditText)findViewById(R.id.email);
                EditText mobileno=(EditText)findViewById(R.id.mobileno);

            }
        });
    }
}
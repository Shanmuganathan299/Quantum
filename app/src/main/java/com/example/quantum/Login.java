package com.example.quantum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button signup_register=(Button)findViewById(R.id.signup_register);
        signup_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mobileno_register=(EditText)findViewById(R.id.mobileno_register);
                Intent startIntent=new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(startIntent);

            }
        });

    }
}
package com.example.quantum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signup_register=(Button)findViewById(R.id.signup_register);
        Button register_home=(Button)findViewById(R.id.register_home);
        register_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent=new Intent(getApplicationContext(),Signup.class);
                startActivity(StartIntent);
            }
        });
        signup_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent=new Intent(getApplicationContext(),Login.class);
                startActivity(StartIntent);
            }
        });
    }
}
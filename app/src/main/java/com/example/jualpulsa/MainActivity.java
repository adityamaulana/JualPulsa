package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button TombolSignIn, TombolSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TombolSignIn = findViewById(R.id.TombolSignIn);
        TombolSignUp = findViewById(R.id.TombolSignUp);

        TombolSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Daftar.class);
                startActivity(i);
            }
        });

        TombolSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });

    }
}
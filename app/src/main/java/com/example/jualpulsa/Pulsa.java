package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pulsa extends AppCompatActivity {

    Button Nom10K, Nom20K, Nom25K, Nom30K, Nom50K, Nom75K, Nom100K, Nom150K, Nom200K, Nom500K;
    EditText NotelYangDiisi;
    String Nominal, Metode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsa);

        Nom10K = findViewById(R.id.Nominal10K);
        Nom20K = findViewById(R.id.Nominal20K);
        Nom25K = findViewById(R.id.Nominal25K);
        Nom30K = findViewById(R.id.Nominal30K);
        Nom50K = findViewById(R.id.Nominal50K);
        Nom75K = findViewById(R.id.Nominal75K);
        Nom100K = findViewById(R.id.Nominal100K);
        Nom150K = findViewById(R.id.Nominal150K);
        Nom200K = findViewById(R.id.Nominal200K);
        Nom500K = findViewById(R.id.Nominal500K);

        NotelYangDiisi = findViewById(R.id.NotelYangInginDiisiPulsa);

        Bundle bundle = getIntent().getExtras();

        String Notel = bundle.getString("a");

        NotelYangDiisi.setText(Notel);

        Nom10K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom10K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });

        Nom20K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom20K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });

        Nom25K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom25K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });

        Nom30K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom30K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });

        Nom50K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom50K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });

        Nom75K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom75K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });

        Nom100K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom100K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });

        Nom150K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom150K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });

        Nom200K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom200K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });

        Nom500K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nominal = Nom500K.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                Intent i = new Intent(getApplicationContext(), MetodePembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });
    }
}
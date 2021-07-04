package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MetodePembayaranPulsa extends AppCompatActivity {

    Button BankBRI, BankBNI, BankBCA, BankMandiri;

    String Nominal, Metode, TerimaBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran_pulsa);

        BankBRI = findViewById(R.id.TombolPaymentBRI);
        BankBNI = findViewById(R.id.TombolPaymentBNI);
        BankBCA = findViewById(R.id.TombolPaymentBCA);
        BankMandiri = findViewById(R.id.TombolPaymentMandiri);

        Bundle bundle = getIntent(). getExtras();

        String Nominal = bundle.getString("a");

        BankBRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Metode = BankBRI.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                b.putString("b", Metode.trim());

                Intent i = new Intent(getApplicationContext(), KonfirmasiPembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });

        BankBNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Metode = BankBNI.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                b.putString("b", Metode.trim());

                Intent i = new Intent(getApplicationContext(), KonfirmasiPembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);

            }
        });

        BankBCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Metode = BankBCA.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                b.putString("b", Metode.trim());

                Intent i = new Intent(getApplicationContext(), KonfirmasiPembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });

        BankMandiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Metode = BankMandiri.getText().toString();

                Bundle b = new Bundle();

                b.putString("a", Nominal.trim());

                b.putString("b", Metode.trim());


                Intent i = new Intent(getApplicationContext(), KonfirmasiPembayaranPulsa.class);

                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
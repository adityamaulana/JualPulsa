package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class KonfirmasiPembayaranPulsa extends AppCompatActivity {

    TextView NominalPembayaran, MetodeYangDipakai;
    Button TombolKonfirmasiPembayaran;
    String Nominal, Metode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_pembayaran_pulsa);

        NominalPembayaran = findViewById(R.id.NominalPembayaranTextView);
        MetodeYangDipakai = findViewById(R.id.MetodeYangDipakaiTextView);
        TombolKonfirmasiPembayaran = findViewById(R.id.TombolKonfirmasiPembayaran);

        Bundle bundle = getIntent().getExtras();

        String Nominal = bundle.getString("a");
        String Metode = bundle.getString("b");

        NominalPembayaran.setText(Nominal);
        MetodeYangDipakai.setText(Metode);

        TombolKonfirmasiPembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TombolKonfirmasiPembayaran.isClickable();

                Toast t = Toast.makeText(getApplicationContext(),
                        "Transaksi Terkonfirmasi",
                        Toast.LENGTH_LONG);

                t.show();

                Intent i = new Intent(getApplicationContext(), SelesaiTransaksi.class);
                startActivity(i);

            }
        });
    }
}
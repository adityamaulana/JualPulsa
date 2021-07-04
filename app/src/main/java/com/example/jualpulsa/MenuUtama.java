package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuUtama extends AppCompatActivity {

    Button TombolBeliPulsa;
    TextView NomorYangTercantum;
    String Notel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        TombolBeliPulsa = findViewById(R.id.TombolBeliPulsa);
        NomorYangTercantum = findViewById(R.id.NomorYangTercantumTextView);

        Bundle bundle = getIntent().getExtras();

        String Notel = bundle.getString("a");

        NomorYangTercantum.setText(Notel);

        TombolBeliPulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b = new Bundle();

                b.putString("a", Notel.trim());

                Intent i = new Intent(getApplicationContext(), Pulsa.class);
                i.putExtras(b);
                startActivity(i);

            }
        });
    }
}
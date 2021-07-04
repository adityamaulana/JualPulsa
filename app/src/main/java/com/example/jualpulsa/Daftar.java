package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Daftar extends AppCompatActivity {

    EditText EditTextPhone, EditTextName;
    Button TombolSignUp2, TombolSignIn2;
    String Nama, Notel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        TombolSignUp2 = findViewById(R.id.TombolSignUp2);
        EditTextName = findViewById(R.id.EditTextName);
        EditTextPhone = findViewById(R.id.EditTextPhone);
        TombolSignIn2 = findViewById(R.id.TombolSignIn2);

        TombolSignUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Nama = EditTextName.getText().toString();

                Notel = EditTextPhone.getText().toString();

                if (Nama.isEmpty() || Notel.isEmpty()) {

                    Toast t = Toast.makeText(getApplicationContext(),
                            "Nama dan Nomor Telepon Wajib Diisi",
                            Toast.LENGTH_LONG);
                    t.show();

                }else if (Nama.isEmpty() || (Notel.length() <9 )) {

                    TombolSignUp2.setError("Nomor Telepon Tidak Valid");

                } else {

                    Bundle b = new Bundle();

                    b.putString("a", Notel.trim());

                    Intent i = new Intent(getApplicationContext(), MenuUtama.class);

                    i.putExtras(b);
                    startActivity(i);

                }
            }

        });

        TombolSignIn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);

            }
        });
    }
}
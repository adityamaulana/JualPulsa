package com.example.jualpulsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button TombolSignIn3;
    EditText EditTextPhone2;
    String Notel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TombolSignIn3 = findViewById(R.id.TombolSignIn3);

        EditTextPhone2 = findViewById(R.id.EditTextPhone2);

        TombolSignIn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Notel = EditTextPhone2.getText().toString();

                if (Notel.isEmpty()){

                    Toast t = Toast.makeText(getApplicationContext(),
                        "Membutuhkan Nomor Telepon Untuk Login",
                        Toast.LENGTH_LONG);
                t.show();

                }else{

                    if (Notel.length() <9 ) {

                        EditTextPhone2.setError("Nomor Telepon Tidak Valid");

                    } else {

                        Bundle b = new Bundle();

                        b.putString("a", Notel.trim());

                        Intent i = new Intent(getApplicationContext(), MenuUtama.class);

                        i.putExtras(b);
                        startActivity(i);

                    }
                }
            }
        });
    }
}
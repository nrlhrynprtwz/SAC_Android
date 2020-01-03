package com.sacmakassar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_costumer extends AppCompatActivity {
    Button login;
    TextView lupapass, daftar, userlogin, passlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_costumer);

        login = findViewById(R.id.btnLogin);
        lupapass = findViewById(R.id.tvLupapass);
        daftar = findViewById(R.id.tvdaftar);
        userlogin = findViewById(R.id.userlogin);
        passlogin =findViewById(R.id.passlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent login= new Intent(getApplicationContext(), SAC_Costumer.class);
                    startActivity(login);

            }
        });

        lupapass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login= new Intent(getApplicationContext(), lupa_password.class);
                startActivity(login);
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login= new Intent(getApplicationContext(), daftar_costumer.class);
                startActivity(login);
            }
        });
    }
}

package com.sacmakassar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); // Waktu loading 3 Detik
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } finally {
                    Intent login= new Intent(getApplicationContext(), login_costumer.class);
                    startActivity(login);
                    finish();
                }
            }
        });
        thread.start();
    }
}

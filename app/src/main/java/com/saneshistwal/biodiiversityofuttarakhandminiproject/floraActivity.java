package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class floraActivity extends AppCompatActivity {
    private Button toHome, toFauna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora);
        toHome = findViewById(R.id.btFloraToHome);
        toFauna = findViewById(R.id.btFloraToFauna);

        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(floraActivity.this,browserPage.class));
            }
        });

        toFauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(floraActivity.this,faunaActivity.class));
            }
        });



    }
}
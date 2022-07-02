package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class faunaActivity extends AppCompatActivity {
        Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauna);
        home = findViewById(R.id.btFaunaToHome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(faunaActivity.this,browserPage.class));
            }
        });
    }
}
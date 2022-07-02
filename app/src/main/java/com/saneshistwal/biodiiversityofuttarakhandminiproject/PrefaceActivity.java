package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PrefaceActivity extends AppCompatActivity {
    private ImageView backHome;
    private Button toLogin,toRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preface);
        backHome = findViewById(R.id.ivIcon);
        toLogin = findViewById(R.id.btLoginFromPreface);
        toRegister = findViewById(R.id.btRegisterFromPreface);

        //
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrefaceActivity.this,MainActivity.class));
            }
        });


        //
        toRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrefaceActivity.this,register_page.class));
            }
        });


        //

    }
}
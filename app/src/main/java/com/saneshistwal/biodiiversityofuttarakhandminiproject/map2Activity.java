package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class map2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}
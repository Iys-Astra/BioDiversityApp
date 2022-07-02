package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class browserPage extends AppCompatActivity {
    FirebaseAuth mAuth;
    Button logout;
    TextView toReview;
    ImageView map,flora,fauna,images,bioReserves;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_page);
        logout = findViewById(R.id.btLogout);
        mAuth = FirebaseAuth.getInstance();
        map = findViewById(R.id.ivMap);
        flora = findViewById(R.id.ivFlora);
        fauna = findViewById(R.id.ivFauna);
        images = findViewById(R.id.ivImages);
        bioReserves = findViewById(R.id.ivBioReserves);
        toReview = findViewById(R.id.tvToRegisterPage);
        //
        FirebaseDatabase.getInstance().getReference().child("Programming Knowledge").child("Android").setValue("abcd");
        Objects.requireNonNull(getSupportActionBar()).hide();


        //
        toReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browserPage.this,reviewActivity.class));
            }
        });



        //
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browserPage.this,map2Activity.class));
            }
        });


        //
        flora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browserPage.this,floraActivity.class));
            }
        });


        //
        fauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browserPage.this,faunaActivity.class));
            }
        });


        //
        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browserPage.this,imagesActivity.class));
            }
        });


        //
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                startActivity(new Intent(browserPage.this,LoginPage.class));
            }
        });

        bioReserves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browserPage.this,bioReserves_page.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mAuth.signOut();
        startActivity(new Intent(browserPage.this,LoginPage.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null)
        {
            startActivity(new Intent(browserPage.this,register_page.class));
        }
    }
}
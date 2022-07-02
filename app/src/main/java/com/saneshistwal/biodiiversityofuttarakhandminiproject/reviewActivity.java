package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class reviewActivity extends AppCompatActivity {
    Button submit;
    EditText text_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        text_name = findViewById(R.id.etReview);
        submit = findViewById(R.id.btSubmit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = text_name.getText().toString().trim();
                if(TextUtils.isEmpty(text))
                {
                    Toast.makeText(reviewActivity.this, "Please enter some text", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(reviewActivity.this, "Review getting processed", Toast.LENGTH_SHORT).show();

                    FirebaseDatabase.getInstance().getReference().child("Review").push().child("Android").setValue(text);
                    text_name.setText("");
                    text = text_name.getText().toString().trim();
                    startActivity(new Intent(reviewActivity.this,browserPage.class));
                    Toast.makeText(reviewActivity.this, "Thanks for your feedback . Reverting back to browser page", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
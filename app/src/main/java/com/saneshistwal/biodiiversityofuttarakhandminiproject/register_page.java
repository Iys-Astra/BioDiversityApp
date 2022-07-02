package com.saneshistwal.biodiiversityofuttarakhandminiproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register_page extends AppCompatActivity {
    private Button homeButton,submit;
    private TextView registerToLogin;
    private EditText email,password;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        submit = findViewById(R.id.registerButton);
        homeButton = findViewById(R.id.homeButton);
        registerToLogin = findViewById(R.id.toLoginPage);
        email = findViewById(R.id.registerEmail);
        password = findViewById(R.id.registerPassword);
        mAuth = FirebaseAuth.getInstance();

        //
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register_page.this,MainActivity.class));
            }
        });

        //
        registerToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register_page.this,LoginPage.class));
            }
        });

        //
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();
            }
        });

    }
    private void createUser()
    {
        String gEmail = email.getText().toString();
        String gPassword = password.getText().toString();

        if(TextUtils.isEmpty(gEmail))
        {
            email.setError("Email cannot be empty");
            email.requestFocus();
        }
        else if(TextUtils.isEmpty(gPassword))
        {
            password.setError("Password cannot be empty");
        }
        else
        {
            mAuth.createUserWithEmailAndPassword(gEmail,gPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        Toast.makeText(register_page.this, "Successfully User Created", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(register_page.this,LoginPage.class));
                    }
                    else {
                        Toast.makeText(register_page.this, "Registration Error "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }
}
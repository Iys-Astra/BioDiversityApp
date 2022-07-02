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

public class LoginPage extends AppCompatActivity {
    FirebaseAuth mAuth;
    EditText etEmail,etPassword;
    Button btSubmit;
    TextView tvToRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mAuth = FirebaseAuth.getInstance();
        etEmail = findViewById(R.id.etLoginEmail);
        etPassword = findViewById(R.id.etPassword);
        btSubmit = findViewById(R.id.btSubmitLogin);
        tvToRegister = findViewById(R.id.tvLoginToRegister);


        //
        tvToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginPage.this,register_page.class));
            }
        });


        //
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            login();
            }
        });

    }
private void login()
{
    String email = etEmail.getText().toString();
    String password = etPassword.getText().toString();
    if(TextUtils.isEmpty(email))
    {
        etEmail.setError("Email cannot be empty");
        etEmail.requestFocus();
    }
    else if(TextUtils.isEmpty(password))
    {
        etPassword.setError("Password cannot be empty");
    }
    else
    {
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
           if(task.isSuccessful())
           {
               Toast.makeText(LoginPage.this, "Successfully User login", Toast.LENGTH_SHORT).show();
               startActivity(new Intent(LoginPage.this,browserPage.class));
           }
           else
           {
               Toast.makeText(LoginPage.this, "Unsuccessfully User login" + task.getException(), Toast.LENGTH_SHORT).show();
           }
            }
        });
    }
}

}
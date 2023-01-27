package com.example.garagesale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText emailOrUsername, inputPasswordLogin;
    Button Login;
    TextView tVNewRegister, forgotPass, tVemailError, tVPasswordError;//1


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailOrUsername = findViewById(R.id.inputEmailLogin);
        tVNewRegister = findViewById(R.id.tVNewRegister); //2
        forgotPass = findViewById(R.id.tVForgotpassword);

    }
    public void NewRegister(View view) {//3
        Intent RegisterActivityIntent = new Intent(this, RegisterActivity.class);
        startActivity(RegisterActivityIntent);
    }

    public void Forgotpassword(View view) {
        Intent intent = new Intent(this, ResetPasswordActivity.class);
        startActivity(intent);
    }

    public void EmailLogin(View view) {
    }
}
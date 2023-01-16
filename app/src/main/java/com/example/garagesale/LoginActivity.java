package com.example.garagesale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button Login;
    TextView Register;
    TextView ForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Register = findViewById(R.id.tVNewRegister);
        ForgotPass = findViewById(R.id.tVForgotpassword);

    }

    public void NewRegister(View view) {
        Intent RegisterActivityIntent = new Intent(this, RegisterActivity.class);
        startActivity(RegisterActivityIntent);
    }

    public void Forgotpassword(View view) {
        Intent intent = new  Intent(this, ResetPasswordActivity.class);
        startActivity(intent);
    }
//
//    private void startActivities(Intent registerActivityIntent) {
//    }


}
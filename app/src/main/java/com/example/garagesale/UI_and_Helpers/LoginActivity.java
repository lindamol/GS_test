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
//To Validat the email address.
//So some of the email addresses that will be valid via this email validation technique are:
//
//username@domain.com
//user.name@domain.com
//user-name@domain.com
//username@domain.co.in
//user_name@domain.com
//Here's a shortlist of some email addresses that will be invalid via this email validation:
//
//username.@domain.com
//.user.name@domain.com
//user-name@domain.com.
//username@.com
//  @Test
//    public void testUsingStrictRegex() {
//        emailAddress = "username@domain.com";
//        regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
//            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
//        assertTrue(EmailValidation.patternMatches(emailAddress, regexPattern));
//    }


/* AJ Notes
Google sign in video: https://www.youtube.com/watch?v=bBJF1M5h_UU&ab_channel=CodingWithTea
*/


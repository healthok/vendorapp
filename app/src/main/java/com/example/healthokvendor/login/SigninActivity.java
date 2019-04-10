package com.example.healthokvendor.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.healthokvendor.R;
import com.example.healthokvendor.home.HomeActivity;

public class SigninActivity extends AppCompatActivity {
    private String TAG = "SigninActivity";
    private TextView skip, forgot_password;
    private EditText phone_no , password;
    private LinearLayout signup_here;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Log.e(TAG,"start signin activity");

        skip = (TextView) findViewById(R.id.btn_skip);
        forgot_password=(TextView) findViewById(R.id.forgot_password);
        signup_here=(LinearLayout) findViewById(R.id.layout_signup_here);
        phone_no = (EditText) findViewById(R.id.phone_number);
        password = (EditText) findViewById(R.id.password);


        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this , HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this , ForgotPasswordActivity.class);
                startActivity(intent);

            }
        });

        signup_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this , SignUpActivity.class);
                startActivity(intent);

            }
        });


    }
}

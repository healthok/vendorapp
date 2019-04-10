package com.example.healthokvendor.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.healthokvendor.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    private String TAG = " Forgot Password";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
}

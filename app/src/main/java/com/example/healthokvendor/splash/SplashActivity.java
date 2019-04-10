package com.example.healthokvendor.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.healthokvendor.R;
import com.example.healthokvendor.Utility.SharePreferenceUtils;
import com.example.healthokvendor.home.HomeActivity;
import com.example.healthokvendor.login.SigninActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
                init();
    }
    public void init(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //if user registered user
                //then show home screen
                //else show login screen
                //key register user(temporary)
                if (SharePreferenceUtils.getInstance().getString("register_user").equalsIgnoreCase("")){
                    //not registered user so login screen
                    Intent intent = new Intent(SplashActivity.this, SigninActivity.class);
                    startActivity(intent);
                }else{
                    //home screen
                    Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                finish();

            }
        }, 3000);



    }
}

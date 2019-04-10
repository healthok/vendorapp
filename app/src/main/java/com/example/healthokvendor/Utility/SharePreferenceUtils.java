package com.example.healthokvendor.Utility;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.healthokvendor.MyApp;

public class SharePreferenceUtils {


    private static String PREFERENCE_NAME="healthokvendor";
    private static SharePreferenceUtils sharePreferenceUtils;
    private SharedPreferences sharedPreferences;

    private SharePreferenceUtils(Context context){


        PREFERENCE_NAME = PREFERENCE_NAME + context.getPackageName();
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }



    public static SharePreferenceUtils getInstance(){
        if (sharePreferenceUtils == null) {
            sharePreferenceUtils = new SharePreferenceUtils(MyApp.getContext());
        }
        return  sharePreferenceUtils;
    }

    //login response user_id 1234
//for String
    public void saveString(String key , String Val){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, Val);
        editor.commit();
    }

    public String getString(String key, String defVal){
        return sharedPreferences.getString(key , defVal);
    }
    public String getString(String key){
        return sharedPreferences.getString(key , "");
    }

//for Integer
    //for float



}

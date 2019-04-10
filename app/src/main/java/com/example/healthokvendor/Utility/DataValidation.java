package com.example.healthokvendor.Utility;

import android.text.TextUtils;

import java.util.regex.Pattern;

public class DataValidation {

    //full name - must contain letters no number no speacial symbol
    //address- can contain character letters, number, few symbols
    //phone no must be 10 digit long
    //password - length >6,no space

    public static String PERSON_FULLNAME = "[a-zA-Z]*";
    public static String ADDRESS = "[a-zA-Z.+-.0-9]*";
    public static String PHONE_NUMBER = "[0-9]*";

    public static Boolean isValidPassword(String password) {
        Boolean valid = false;
        if (password.trim().length() > 6) {
            valid = true;

        }
        return valid;
    }

    public static Boolean isValidFullName(String fullname) {
        Boolean valid = false;
        if (TextUtils.isEmpty(fullname.trim())) {
            if (Pattern.compile(PERSON_FULLNAME).matcher(fullname).matches()) {
                valid = true;
            }
        }

        return valid;
    }

    public static Boolean isValidAddress(String address) {
        Boolean valid = false;
        if (TextUtils.isEmpty(address.trim())) {
            if (Pattern.compile(ADDRESS).matcher(address).matches()) {
                valid = true;
            }
        }
        return valid;


    }

    public static Boolean isValidPhoneNumber(String phonenumber) {
        Boolean valid = false;
        if (TextUtils.isEmpty(phonenumber.trim()) && phonenumber.length() > 9) {
            if (Pattern.compile(PHONE_NUMBER).matcher(phonenumber).matches()) ;
            {
                valid = true;
            }
        }
        return valid;
    }


}

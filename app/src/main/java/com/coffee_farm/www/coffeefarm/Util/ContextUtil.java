package com.coffee_farm.www.coffeefarm.Util;

import android.content.Context;
import android.content.SharedPreferences;

import com.coffee_farm.www.coffeefarm.Data.User;

/**
 * Created by the on 2017-11-23.
 */

public class ContextUtil {

    private static final String prefName = "CoffeeFarm";

    private static final String USER_ID = "USER_ID";
    private static final String USER_LOGIN_ID = "USER_LOGIN_ID";
    private static final String USER_PW = "USER_PW";
    private static final String USER_NAME = "USER_NAME";
    private static final String USER_EMAIL = "USER_EMAIL";
    private static final String USER_ADDRESS = "USER_ADDRESS";
    private static final String USER_PHONE = "USER_PHONE";

    public static User userinfo;

    public static void login(Context context, User user){

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        pref.edit().putInt(USER_ID, user.getId()).apply();
        pref.edit().putString(USER_LOGIN_ID, user.getLogin_id()).apply();
        pref.edit().putString(USER_PW, user.getPassword()).apply();
        pref.edit().putString(USER_NAME, user.getName());
        pref.edit().putString(USER_EMAIL, user.getName());
        pref.edit().putString(USER_ADDRESS, user.getName());
        pref.edit().putString(USER_PHONE, user.getName());

    }

    public static void logout(Context context){

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        pref.edit().putInt(USER_ID, 0).apply();
        pref.edit().putString(USER_LOGIN_ID, "").apply();
        pref.edit().putString(USER_PW, "").apply();
        pref.edit().putString(USER_NAME, "").apply();
        pref.edit().putString(USER_EMAIL, "").apply();
        pref.edit().putString(USER_ADDRESS, "").apply();
        pref.edit().putString(USER_PHONE, "").apply();

    }

    public static User getLoginUserInfo(Context context){



        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        if (pref.getInt(USER_ID, 0) != 0){

            userinfo = new User();

            userinfo.setId(pref.getInt(USER_ID, 0));
            userinfo.setLogin_id(pref.getString(USER_LOGIN_ID, ""));
            userinfo.setPassword(pref.getString(USER_PW, ""));
            userinfo.setName(pref.getString(USER_NAME, ""));
            userinfo.setName(pref.getString(USER_EMAIL, ""));
            userinfo.setName(pref.getString(USER_ADDRESS, ""));
            userinfo.setName(pref.getString(USER_PHONE, ""));
        }else {
            userinfo = null;
        }

        return userinfo;
    }



}

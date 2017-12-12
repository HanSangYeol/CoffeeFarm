package com.coffee_farm.www.coffeefarm.Util;

import android.content.Context;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by the on 2017-09-07.
 */

public class ServerUtil {
    private static final String TAG = ServerUtil.class.getSimpleName();
    private final static String BASE_URL = "http://192.168.20.15:8080/";


    public interface JsonResponseHandler {
        void onResponse(JSONObject json);
    }


    // 로그인
    public static void login(final Context context, String id, String pw, final JsonResponseHandler handler) {
        String url = BASE_URL + "tje/login";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("login_id", id);
        data.put("pw", pw);

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }

    // 회원 가입 기능
    public static void sign_up(final Context context, final String id,
                               final String pw, final String name, final String email, final String address,
                               final String phone, final JsonResponseHandler handler) {
        String url = BASE_URL + "tje/insert_sign_up";

        Map<String, String> data = new HashMap<String, String>();
        data.put("login_id", id);
        data.put("pw", pw);
        data.put("name", name);
        data.put("email", email);
        data.put("address", address);
        data.put("phone", phone);

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


}

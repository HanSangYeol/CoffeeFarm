package com.coffee_farm.www.coffeefarm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.coffee_farm.www.coffeefarm.Data.User;
import com.coffee_farm.www.coffeefarm.Util.ContextUtil;
import com.coffee_farm.www.coffeefarm.Util.ServerUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends BaseActivity {

    public static LoginActivity loginActivity;

    private android.widget.ImageView backBtn;
    private android.widget.EditText inputidEdt;
    private android.widget.EditText inputpwEdt;
    private android.widget.TextView loginBtn;
    private android.widget.CheckBox autologinCkb;
    private android.widget.TextView findidBtn;
    private android.widget.TextView findpwBtn;
    private android.widget.TextView signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindView();
        setupEvents();
        setValues();
    }

    @Override
    public void setValues() {

        loginActivity = this;

    }

    @Override
    public void setupEvents() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServerUtil.login(mContext, inputidEdt.getText().toString(),
                        inputpwEdt.getText().toString(), new ServerUtil.JsonResponseHandler() {
                    @Override
                    public void onResponse(JSONObject json) {
                        try {
                            JSONArray jsonArray = json.getJSONArray("user");

                            JSONObject user = jsonArray.getJSONObject(0);

                            User tempUser = User.getUserFromJsonObject(user);

                            if (inputidEdt.getText().toString().equals(tempUser.getLogin_id())){
                                if (inputpwEdt.getText().toString().equals(tempUser.getPassword())){
                                    ContextUtil.login(mContext, tempUser);
                                    Toast.makeText(mContext, "로그인 성공", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent();
                                    intent.putExtra("로그인성공", 1);
                                    setResult(RESULT_OK, intent);
                                    finish();

                                    Log.d("test", ContextUtil.getLoginUserInfo(mContext).getName());
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });

            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void bindView() {
        this.signupBtn = (TextView) findViewById(R.id.signupBtn);
        this.findpwBtn = (TextView) findViewById(R.id.findpwBtn);
        this.findidBtn = (TextView) findViewById(R.id.findidBtn);
        this.autologinCkb = (CheckBox) findViewById(R.id.autologinCkb);
        this.loginBtn = (TextView) findViewById(R.id.loginBtn);
        this.inputpwEdt = (EditText) findViewById(R.id.inputpwEdt);
        this.inputidEdt = (EditText) findViewById(R.id.inputidEdt);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);

    }
}

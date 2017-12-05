package com.coffee_farm.www.coffeefarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

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
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

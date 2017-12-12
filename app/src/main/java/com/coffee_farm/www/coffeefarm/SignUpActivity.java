package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.coffee_farm.www.coffeefarm.Util.ServerUtil;

import org.json.JSONObject;

public class SignUpActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.EditText inputidEdt;
    private android.widget.EditText inputpwEdt;
    private android.widget.EditText inputnameEdt;
    private android.widget.EditText inputemailEdt;
    private android.widget.EditText inputaddressEdt;
    private android.widget.EditText inputphoneEdt;
    private android.widget.LinearLayout signupBtn;
    private LinearLayout blankcheckid;
    private LinearLayout blankcheckpw;
    private LinearLayout blankcheckname;
    private LinearLayout blankcheckemail;
    private LinearLayout blankcheckaddress;
    private LinearLayout blankcheckphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
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

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checkId = true;
                if (inputidEdt.getText().toString().equals("")) {
                    blankcheckid.setVisibility(View.VISIBLE);
                    checkId = false;
                }else {
                    blankcheckid.setVisibility(View.GONE);
                }
                boolean checkPw = true;
                if (inputpwEdt.getText().toString().equals("")) {
                    blankcheckpw.setVisibility(View.VISIBLE);
                    checkPw = false;
                }else {
                    blankcheckpw.setVisibility(View.GONE);
                }
                boolean checkname = true;
                if (inputnameEdt.getText().toString().equals("")) {
                    blankcheckname.setVisibility(View.VISIBLE);
                    checkPw = false;
                }else {
                    blankcheckname.setVisibility(View.GONE);
                }
                boolean checkemail = true;
                if (inputemailEdt.getText().toString().equals("")) {
                    blankcheckemail.setVisibility(View.VISIBLE);
                    checkPw = false;
                }else {
                    blankcheckemail.setVisibility(View.GONE);
                }
                boolean checkaddress = true;
                if (inputaddressEdt.getText().toString().equals("")) {
                    blankcheckaddress.setVisibility(View.VISIBLE);
                    checkPw = false;
                }else {
                    blankcheckaddress.setVisibility(View.GONE);
                }
                boolean checkphone = true;
                if (inputphoneEdt.getText().toString().equals("")) {
                    blankcheckphone.setVisibility(View.VISIBLE);
                    checkPw = false;
                }else {
                    blankcheckphone.setVisibility(View.GONE);
                }
                if (checkId && checkPw && checkname && checkemail && checkaddress && checkphone){
                    ServerUtil.sign_up(mContext, inputidEdt.getText().toString(), inputpwEdt.getText().toString(),
                            inputnameEdt.getText().toString(), inputemailEdt.getText().toString(),
                            inputaddressEdt.getText().toString(), inputphoneEdt.getText().toString(), new ServerUtil.JsonResponseHandler() {
                                @Override
                                public void onResponse(JSONObject json) {


                                    LoginActivity.loginActivity.finish();
                                    finish();
                                }
                            });
                }

            }
        });


    }

    @Override
    public void bindView() {
        this.signupBtn = (LinearLayout) findViewById(R.id.signupBtn);
        this.blankcheckphone = (LinearLayout) findViewById(R.id.blankcheckphone);
        this.inputphoneEdt = (EditText) findViewById(R.id.inputphoneEdt);
        this.blankcheckaddress = (LinearLayout) findViewById(R.id.blankcheckaddress);
        this.inputaddressEdt = (EditText) findViewById(R.id.inputaddressEdt);
        this.blankcheckemail = (LinearLayout) findViewById(R.id.blankcheckemail);
        this.inputemailEdt = (EditText) findViewById(R.id.inputemailEdt);
        this.blankcheckname = (LinearLayout) findViewById(R.id.blankcheckname);
        this.inputnameEdt = (EditText) findViewById(R.id.inputnameEdt);
        this.blankcheckpw = (LinearLayout) findViewById(R.id.blankcheckpw);
        this.inputpwEdt = (EditText) findViewById(R.id.inputpwEdt);
        this.blankcheckid = (LinearLayout) findViewById(R.id.blankcheckid);
        this.inputidEdt = (EditText) findViewById(R.id.inputidEdt);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}

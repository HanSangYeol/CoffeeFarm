package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.EditText inputidEdt;
    private android.widget.EditText inputpwEdt;
    private android.widget.EditText inputnameEdt;
    private android.widget.EditText inputemailEdt;
    private android.widget.EditText inputaddressEdt;
    private android.widget.EditText inputphoneEdt;

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

    }

    @Override
    public void bindView() {

        this.inputphoneEdt = (EditText) findViewById(R.id.inputphoneEdt);
        this.inputaddressEdt = (EditText) findViewById(R.id.inputaddressEdt);
        this.inputemailEdt = (EditText) findViewById(R.id.inputemailEdt);
        this.inputnameEdt = (EditText) findViewById(R.id.inputnameEdt);
        this.inputpwEdt = (EditText) findViewById(R.id.inputpwEdt);
        this.inputidEdt = (EditText) findViewById(R.id.inputidEdt);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);

    }
}

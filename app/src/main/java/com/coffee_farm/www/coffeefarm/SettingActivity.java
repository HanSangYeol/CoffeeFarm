package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.coffee_farm.www.coffeefarm.Util.ContextUtil;

public class SettingActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.TextView logoutBtn;
    private TextView idTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        bindView();
        setupEvents();
        setValues();
    }

    @Override
    public void setValues() {
        if (ContextUtil.getLoginUserInfo(mContext) == null){
            idTxt.setText("");
        }else {
            idTxt.setText(ContextUtil.getLoginUserInfo(mContext).getLogin_id());
        }


    }

    @Override
    public void setupEvents() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContextUtil.logout(mContext);
                finish();
            }
        });

    }

    @Override
    public void bindView() {
        this.logoutBtn = (TextView) findViewById(R.id.logoutBtn);
        this.idTxt = (TextView) findViewById(R.id.idTxt);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}

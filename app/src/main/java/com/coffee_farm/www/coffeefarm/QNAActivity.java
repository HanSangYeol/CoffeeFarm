package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class QNAActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);
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

    }
}

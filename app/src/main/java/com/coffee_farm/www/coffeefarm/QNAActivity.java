package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

public class QNAActivity extends BaseActivity {


    private BottomNavigationView bottomTab;

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

        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);

    }
}

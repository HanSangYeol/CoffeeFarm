package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

public class MyPageRelationActivity extends BaseActivity {


    private BottomNavigationView bottomTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page_relation);
        bindView();
        setupEvents();
        setValues();

    }

    @Override
    public void setValues() {

    }

    @Override
    public void setupEvents() {

        bottomTab.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        return true;
                    case R.id.navigation_kategorie:
                        return true;
                    case R.id.navigation_mypage:
                        return true;
                }
                return false;
            }
        });



    }

    @Override
    public void bindView() {

        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);

    }
}

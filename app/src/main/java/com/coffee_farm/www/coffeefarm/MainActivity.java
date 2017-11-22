package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {


    private LinearLayout homeFragLayout;
    private LinearLayout kategorieFragLayout;
    private LinearLayout mypageFragLayout;
    private BottomNavigationView bottomTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setupEvents();
        setValues();

    }

    @Override
    public void setValues() {

    }

    @Override
    public void setupEvents() {

        final LinearLayout[] frags = {homeFragLayout, kategorieFragLayout, mypageFragLayout};

        bottomTab.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        homeFragLayout.setVisibility(View.VISIBLE);
                        kategorieFragLayout.setVisibility(View.GONE);
                        mypageFragLayout.setVisibility(View.GONE);
                        return true;
                    case R.id.navigation_kategorie:
                        homeFragLayout.setVisibility(View.GONE);
                        kategorieFragLayout.setVisibility(View.VISIBLE);
                        mypageFragLayout.setVisibility(View.GONE);
                        return true;
                    case R.id.navigation_mypage:
                        homeFragLayout.setVisibility(View.GONE);
                        kategorieFragLayout.setVisibility(View.GONE);
                        mypageFragLayout.setVisibility(View.VISIBLE);
                        return true;
                }
                return false;
            }
        });


    }

    @Override
    public void bindView() {
        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);
        this.mypageFragLayout = (LinearLayout) findViewById(R.id.mypageFragLayout);
        this.kategorieFragLayout = (LinearLayout) findViewById(R.id.kategorieFragLayout);
        this.homeFragLayout = (LinearLayout) findViewById(R.id.homeFragLayout);

    }
}

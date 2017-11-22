package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabItem;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private android.support.design.widget.TabItem tabItem1;
    private android.support.design.widget.TabItem tabItem2;
    private android.support.design.widget.TabItem tabItem3;
    private android.support.design.widget.TabItem tabItem4;
    private android.support.design.widget.TabItem tabItem5;
    private android.support.design.widget.TabItem tabItem6;
    private android.support.design.widget.TabItem tabItem7;
    private android.support.design.widget.TabItem tabItem8;
    private android.support.v4.view.ViewPager viewpager;
    private BottomNavigationView bottomTab;
    private android.widget.LinearLayout container;
    private LinearLayout homeFragLayout;
    private LinearLayout kategorieFragLayout;
    private LinearLayout mypageFragLayout;


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
        this.container = (LinearLayout) findViewById(R.id.container);
        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);
        this.viewpager = (ViewPager) findViewById(R.id.viewpager);
        this.mypageFragLayout = (LinearLayout) findViewById(R.id.mypageFragLayout);
        this.kategorieFragLayout = (LinearLayout) findViewById(R.id.kategorieFragLayout);
        this.homeFragLayout = (LinearLayout) findViewById(R.id.homeFragLayout);
        this.tabItem8 = (TabItem) findViewById(R.id.tabItem8);
        this.tabItem7 = (TabItem) findViewById(R.id.tabItem7);
        this.tabItem6 = (TabItem) findViewById(R.id.tabItem6);
        this.tabItem5 = (TabItem) findViewById(R.id.tabItem5);
        this.tabItem4 = (TabItem) findViewById(R.id.tabItem4);
        this.tabItem3 = (TabItem) findViewById(R.id.tabItem3);
        this.tabItem2 = (TabItem) findViewById(R.id.tabItem2);
        this.tabItem1 = (TabItem) findViewById(R.id.tabItem1);

    }
}

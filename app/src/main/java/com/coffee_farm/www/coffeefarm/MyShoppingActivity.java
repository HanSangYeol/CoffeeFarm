package com.coffee_farm.www.coffeefarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MyShoppingActivity extends BaseActivity {

    int RESULT_NUM = 0;


    private BottomNavigationView bottomTab;
    private android.widget.LinearLayout orderinquiryLayout;
    private android.widget.LinearLayout itemofinterestLayout;
    private android.widget.LinearLayout canceledinquiryLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shopping);
        RESULT_NUM = getIntent().getIntExtra("myshoppingNumbering", 0);
        bindView();
        setupEvents();
        setValues();

    }

    @Override
    public void setValues() {


        LinearLayout[] layout = {orderinquiryLayout, itemofinterestLayout, canceledinquiryLayout};

        for (LinearLayout linearLayout : layout){
            linearLayout.setVisibility(View.GONE);
        }

        layout[RESULT_NUM].setVisibility(View.VISIBLE);


    }

    @Override
    public void setupEvents() {

        bottomTab.setSelectedItemId(R.id.navigation_mypage);
        bottomTab.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent = new Intent();
                        intent.putExtra("return_home", 0);
                        setResult(RESULT_OK, intent);
                        finish();
                        return true;
                    case R.id.navigation_kategorie:
                        intent = new Intent();
                        intent.putExtra("return_home", 1);
                        setResult(RESULT_OK, intent);
                        finish();
                        return true;
                    case R.id.navigation_mypage:
                        intent = new Intent();
                        intent.putExtra("return_home", 2);
                        setResult(RESULT_OK, intent);
                        finish();
                        return true;
                }

                return false;
            }
        });


    }

    @Override
    public void bindView() {

        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);
        this.canceledinquiryLayout = (LinearLayout) findViewById(R.id.canceledinquiryLayout);
        this.itemofinterestLayout = (LinearLayout) findViewById(R.id.itemofinterestLayout);
        this.orderinquiryLayout = (LinearLayout) findViewById(R.id.orderinquiryLayout);

    }
}

package com.coffee_farm.www.coffeefarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation.MaterialFragment;

public class CategoryRelationActivity extends BaseActivity {

    int RESULT_NUM;


    private BottomNavigationView bottomTab;
    private android.widget.LinearLayout noticeFragLayout;
    private android.widget.LinearLayout protuctReviewsFragLayout;
    private android.widget.LinearLayout questionFragLayout;
    private android.widget.LinearLayout coffeeNewsFragLayout;
    private android.widget.LinearLayout matetialFragLayout;
    private android.widget.LinearLayout attractionVisitFragLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_relation);
        RESULT_NUM = getIntent().getIntExtra("categoryNumbering", 0);
        Log.d("categoryNumbering", RESULT_NUM+"");
        bindView();
        setupEvents();
        setValues();

    }

    @Override
    public void setValues() {

        LinearLayout[] layout = {noticeFragLayout, protuctReviewsFragLayout, questionFragLayout, coffeeNewsFragLayout,
                matetialFragLayout, attractionVisitFragLayout};

        for (LinearLayout linearLayout : layout){
            linearLayout.setVisibility(View.GONE);
        }

        layout[RESULT_NUM].setVisibility(View.VISIBLE);


    }

    @Override
    public void setupEvents() {

        bottomTab.setSelectedItemId(R.id.navigation_kategorie);
        bottomTab.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent = new Intent(mContext, MainActivity.class);
                        intent.putExtra("return_home", 0);
                        startActivity(intent);
                        finish();
                        return true;
                    case R.id.navigation_kategorie:
                        intent = new Intent(mContext, MainActivity.class);
                        intent.putExtra("return_home", 1);
                        startActivity(intent);
                        finish();
                        return true;
                    case R.id.navigation_mypage:
                        intent = new Intent(mContext, MainActivity.class);
                        intent.putExtra("return_home", 2);
                        startActivity(intent);
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
        this.attractionVisitFragLayout = (LinearLayout) findViewById(R.id.attractionVisitFragLayout);
        this.matetialFragLayout = (LinearLayout) findViewById(R.id.matetialFragLayout);
        this.coffeeNewsFragLayout = (LinearLayout) findViewById(R.id.coffeeNewsFragLayout);
        this.questionFragLayout = (LinearLayout) findViewById(R.id.questionFragLayout);
        this.protuctReviewsFragLayout = (LinearLayout) findViewById(R.id.protuctReviewsFragLayout);
        this.noticeFragLayout = (LinearLayout) findViewById(R.id.noticeFragLayout);

    }
}

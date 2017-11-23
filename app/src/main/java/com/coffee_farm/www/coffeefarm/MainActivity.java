package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.coffee_farm.www.coffeefarm.Fragment.CategorieFragment;

public class MainActivity extends BaseActivity {


    long backPressedTimeInMillis = 0;


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
                        CategorieFragment.categorieFragment.changeFrag(0);
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
    public void onBackPressed() {
        long currentTimeInMillis = System.currentTimeMillis();

        if (currentTimeInMillis - backPressedTimeInMillis < 2000) {
//            2초 이내에 백버튼을 다시 눌렀으니 종료해야 함.
            finish();
            return;
        }
        else {
//            최초로 백버튼을 눌렀거나, 혹은 2초 이상의 시간이 지난 후에 누름.
            Toast.makeText(mContext, "한번 더 누르면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show();
        }

        backPressedTimeInMillis = currentTimeInMillis;
    }

    @Override
    public void bindView() {
        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);
        this.mypageFragLayout = (LinearLayout) findViewById(R.id.mypageFragLayout);
        this.kategorieFragLayout = (LinearLayout) findViewById(R.id.kategorieFragLayout);
        this.homeFragLayout = (LinearLayout) findViewById(R.id.homeFragLayout);

    }
}

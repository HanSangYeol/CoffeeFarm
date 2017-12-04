package com.coffee_farm.www.coffeefarm;

import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.coffee_farm.www.coffeefarm.Adapter.HomeFragmentAdapter;
import com.coffee_farm.www.coffeefarm.Adapter.ProductDetailFragmentAdapter;

public class ProductDetailActivity extends BaseActivity {

    private android.widget.ImageView productImg;
    private android.widget.ImageView backBtn;
    private android.widget.ImageView cartBtn;
    private android.widget.ImageView homeBtn;
    private android.support.design.widget.TabItem tabItem1;
    private android.support.design.widget.TabItem tabItem2;
    private android.support.design.widget.TabLayout tabLayout;
    private android.support.v4.view.ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        bindView();
        setupEvents();
        setValues();
    }

    @Override
    public void setValues() {

        viewpager.setAdapter(new ProductDetailFragmentAdapter(getSupportFragmentManager()));
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewpager));


    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void bindView() {
        this.viewpager = (ViewPager) findViewById(R.id.viewpager);
        this.tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        this.tabItem2 = (TabItem) findViewById(R.id.tabItem2);
        this.tabItem1 = (TabItem) findViewById(R.id.tabItem1);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
        this.cartBtn = (ImageView) findViewById(R.id.cartBtn);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
        this.productImg = (ImageView) findViewById(R.id.productImg);

    }
}

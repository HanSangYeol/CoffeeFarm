package com.coffee_farm.www.coffeefarm.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.coffee_farm.www.coffeefarm.Adapter.HomeFragmentAdapter;
import com.coffee_farm.www.coffeefarm.LoginActivity;
import com.coffee_farm.www.coffeefarm.R;
import com.coffee_farm.www.coffeefarm.ShoppingBasketActivity;
import com.coffee_farm.www.coffeefarm.Util.ContextUtil;

/**
 * Created by the on 2017-11-22.
 */

public class HomeFragment extends Fragment {

    int REQUEST_LOGIN = 1001;

    private android.support.design.widget.TabItem tabItem1;
    private android.support.design.widget.TabItem tabItem2;
    private android.support.design.widget.TabItem tabItem3;
    private android.support.design.widget.TabItem tabItem4;
    private android.support.design.widget.TabItem tabItem5;
    private android.support.design.widget.TabItem tabItem6;
    private android.support.design.widget.TabItem tabItem7;
    private android.support.design.widget.TabItem tabItem8;
    private android.support.design.widget.TabItem tabItem9;
    private android.support.v4.view.ViewPager viewpager;
    private android.support.design.widget.TabLayout tabLayout;

    public static HomeFragment homeFragment;
    private android.widget.ImageView shoppingbasketBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        this.shoppingbasketBtn = (ImageView) view.findViewById(R.id.shoppingbasketBtn);
        this.tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        this.viewpager = (ViewPager) view.findViewById(R.id.viewpager);
        this.tabItem9 = (TabItem) view.findViewById(R.id.tabItem9);
        this.tabItem8 = (TabItem) view.findViewById(R.id.tabItem8);
        this.tabItem7 = (TabItem) view.findViewById(R.id.tabItem7);
        this.tabItem6 = (TabItem) view.findViewById(R.id.tabItem6);
        this.tabItem5 = (TabItem) view.findViewById(R.id.tabItem5);
        this.tabItem4 = (TabItem) view.findViewById(R.id.tabItem4);
        this.tabItem3 = (TabItem) view.findViewById(R.id.tabItem3);
        this.tabItem2 = (TabItem) view.findViewById(R.id.tabItem2);
        this.tabItem1 = (TabItem) view.findViewById(R.id.tabItem1);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setupEvents() {

        shoppingbasketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                if (ContextUtil.getLoginUserInfo(getActivity()) == null){
                    intent = new Intent(getActivity(), LoginActivity.class);

                    startActivityForResult(intent, REQUEST_LOGIN);
                }else {
                    intent = new Intent(getActivity(), ShoppingBasketActivity.class);

                    startActivity(intent);
                }

            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_LOGIN){
            if (resultCode == Activity.RESULT_OK){

            }
        }
    }

    private void setValues() {
        viewpager.setAdapter(new HomeFragmentAdapter(getChildFragmentManager()));
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewpager));

        homeFragment = this;
    }

    public void changeFrag(){

        TabLayout.Tab tab = tabLayout.getTabAt(0);
        tab.select();
    }

}

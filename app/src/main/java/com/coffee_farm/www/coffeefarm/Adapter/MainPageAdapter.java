package com.coffee_farm.www.coffeefarm.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.coffee_farm.www.coffeefarm.Fragment.HomeFragment;
import com.coffee_farm.www.coffeefarm.Fragment.KategorieFragment;
import com.coffee_farm.www.coffeefarm.Fragment.MyPageFragment;

/**
 * Created by the on 2017-11-22.
 */

public class MainPageAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    public MainPageAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new KategorieFragment();
            case 2:
                return new MyPageFragment();
            default:
                return null;
        }
    }
}

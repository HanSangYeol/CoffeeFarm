package com.coffee_farm.www.coffeefarm.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.coffee_farm.www.coffeefarm.Fragment.Home.AllViewFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.BeanFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.CoffeeMachineFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.EsprossoFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.GreenBeanFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.HandDripFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.PresentSetFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.SetProductFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.TeebagFragment;
import com.coffee_farm.www.coffeefarm.Fragment.ProductDetail.DetailDescriptionFragment;
import com.coffee_farm.www.coffeefarm.Fragment.ProductDetail.PurchaseInfoFragment;

/**
 * Created by the on 2017-12-04.
 */

public class ProductDetailFragmentAdapter extends FragmentStatePagerAdapter {


    final int PAGE_COUNT = 2;

    public ProductDetailFragmentAdapter(FragmentManager fm){
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
                return new DetailDescriptionFragment();
            case 1:
                return new PurchaseInfoFragment();
            default:
                return null;
        }
    }
}

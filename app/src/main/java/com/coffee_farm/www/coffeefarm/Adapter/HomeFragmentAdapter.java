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
import com.coffee_farm.www.coffeefarm.Fragment.HomeFragment;
import com.coffee_farm.www.coffeefarm.Fragment.CategorieFragment;
import com.coffee_farm.www.coffeefarm.Fragment.MyPageFragment;

/**
 * Created by the on 2017-11-22.
 */

public class HomeFragmentAdapter extends FragmentStatePagerAdapter {

    final int PAGE_COUNT = 9;

    public HomeFragmentAdapter(FragmentManager fm){
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
                return new AllViewFragment();
            case 1:
                return new GreenBeanFragment();
            case 2:
                return new BeanFragment();
            case 3:
                return new TeebagFragment();
            case 4:
                return new SetProductFragment();
            case 5:
                return new PresentSetFragment();
            case 6:
                return new EsprossoFragment();
            case 7:
                return new HandDripFragment();
            case 8:
                return new CoffeeMachineFragment();
            default:
                return null;
        }
    }
}

package com.coffee_farm.www.coffeefarm.Fragment.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-22.
 */

public class EsprossoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vIew = inflater.inflate(R.layout.fragment_espresso, container, false);
        return vIew;
    }
}

package com.coffee_farm.www.coffeefarm.Fragment.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-22.
 */

public class AllViewFragment extends Fragment {

    private android.widget.ViewFlipper mainViewFlipper;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vIew = inflater.inflate(R.layout.fragment_allview, container, false);
        this.mainViewFlipper = (ViewFlipper) vIew.findViewById(R.id.mainViewFlipper);
        return vIew;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        Animation showIn= AnimationUtils.loadAnimation(getActivity(), android.R.anim.slide_in_left);

        mainViewFlipper.setInAnimation(showIn);

        mainViewFlipper.setOutAnimation(getActivity(), android.R.anim.slide_out_right);


    }

    private void setupEvents() {
    }
}

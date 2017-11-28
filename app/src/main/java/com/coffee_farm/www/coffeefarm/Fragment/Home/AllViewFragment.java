package com.coffee_farm.www.coffeefarm.Fragment.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-22.
 */

public class AllViewFragment extends Fragment {

    private android.widget.ViewFlipper mainViewFlipper;
    private android.widget.ListView noticeListView;
    private ViewFlipper newItemViewFlipper;
    private ViewFlipper bestItemViewFlipper;
    private ViewFlipper mdChoiceViewFlipper;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vIew = inflater.inflate(R.layout.fragment_allview, container, false);
        this.mdChoiceViewFlipper = (ViewFlipper) vIew.findViewById(R.id.mdChoiceViewFlipper);
        this.bestItemViewFlipper = (ViewFlipper) vIew.findViewById(R.id.bestItemViewFlipper);
        this.newItemViewFlipper = (ViewFlipper) vIew.findViewById(R.id.newItemViewFlipper);
        this.noticeListView = (ListView) vIew.findViewById(R.id.noticeListView);
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
        Animation showIn = AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_in);
        mainViewFlipper.setInAnimation(showIn);
        mainViewFlipper.setOutAnimation(getActivity(), android.R.anim.fade_out);
        mainViewFlipper.setFlipInterval(5000);//플리핑 간격(1000ms)
        mainViewFlipper.startFlipping();

        newItemViewFlipper.setInAnimation(showIn);
        newItemViewFlipper.setOutAnimation(getActivity(), android.R.anim.fade_out);
        newItemViewFlipper.setFlipInterval(5000);//플리핑 간격(1000ms)
        newItemViewFlipper.startFlipping();

        bestItemViewFlipper.setInAnimation(showIn);
        bestItemViewFlipper.setOutAnimation(getActivity(), android.R.anim.fade_out);
        bestItemViewFlipper.setFlipInterval(5000);//플리핑 간격(1000ms)
        bestItemViewFlipper.startFlipping();

        mdChoiceViewFlipper.setInAnimation(showIn);
        mdChoiceViewFlipper.setOutAnimation(getActivity(), android.R.anim.fade_out);
        mdChoiceViewFlipper.setFlipInterval(5000);//플리핑 간격(1000ms)
        mdChoiceViewFlipper.startFlipping();


    }

    private void setupEvents() {
    }
}

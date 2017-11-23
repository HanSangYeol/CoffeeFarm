package com.coffee_farm.www.coffeefarm.Fragment.Categorie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.coffee_farm.www.coffeefarm.Fragment.CategorieFragment;
import com.coffee_farm.www.coffeefarm.Fragment.Home.GreenBeanFragment;
import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-22.
 */

public class Categorie_HomeFragment extends Fragment {

    private android.widget.LinearLayout greenbeanBtn;
    private android.widget.LinearLayout beanBtn;
    private android.widget.LinearLayout teebagBtn;
    private android.widget.LinearLayout setproductBtn;
    private android.widget.LinearLayout presentsetBtn;
    private android.widget.LinearLayout espressoBtn;
    private android.widget.LinearLayout handdripBtn;
    private android.widget.LinearLayout coffeeMachineBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categorie_home, container, false);
        this.coffeeMachineBtn = (LinearLayout) view.findViewById(R.id.coffeeMachineBtn);
        this.handdripBtn = (LinearLayout) view.findViewById(R.id.handdripBtn);
        this.espressoBtn = (LinearLayout) view.findViewById(R.id.espressoBtn);
        this.presentsetBtn = (LinearLayout) view.findViewById(R.id.presentsetBtn);
        this.setproductBtn = (LinearLayout) view.findViewById(R.id.setproductBtn);
        this.teebagBtn = (LinearLayout) view.findViewById(R.id.teebagBtn);
        this.beanBtn = (LinearLayout) view.findViewById(R.id.beanBtn);
        this.greenbeanBtn = (LinearLayout) view.findViewById(R.id.greenbeanBtn);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setupEvents() {
        greenbeanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setValues() {
    }

}

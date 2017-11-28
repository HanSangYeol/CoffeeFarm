package com.coffee_farm.www.coffeefarm.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.coffee_farm.www.coffeefarm.CategoryRelationActivity;
import com.coffee_farm.www.coffeefarm.MainActivity;
import com.coffee_farm.www.coffeefarm.R;

import java.security.PublicKey;

import javax.xml.transform.Result;

/**
 * Created by the on 2017-11-22.
 */

public class CategorieFragment extends Fragment {

    int REQUEST_ACTIVITY = 1000;

    private android.widget.LinearLayout homeFragLayout;
    private android.widget.LinearLayout greenbeanFragLayout;
    private android.widget.LinearLayout beanFragLayout;
    private android.widget.LinearLayout teebagFragLayout;
    private android.widget.LinearLayout setproductFragLayout;
    private android.widget.LinearLayout presentFragLayout;
    private android.widget.LinearLayout espressoFragLayout;
    private android.widget.LinearLayout handdripFragLayout;
    private android.widget.LinearLayout coffeeMachineFragLayout;
    private android.widget.LinearLayout noticeLayout;
    private android.widget.LinearLayout reviewLayout;
    private android.widget.LinearLayout qaLayout;
    private android.widget.LinearLayout newsLayout;
    private android.widget.LinearLayout dataLayout;
    private android.widget.LinearLayout visitLayout;

    public static CategorieFragment categorieFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categorie, container, false);
        this.visitLayout = (LinearLayout) view.findViewById(R.id.visitLayout);
        this.dataLayout = (LinearLayout) view.findViewById(R.id.dataLayout);
        this.newsLayout = (LinearLayout) view.findViewById(R.id.newsLayout);
        this.qaLayout = (LinearLayout) view.findViewById(R.id.qaLayout);
        this.reviewLayout = (LinearLayout) view.findViewById(R.id.reviewLayout);
        this.noticeLayout = (LinearLayout) view.findViewById(R.id.noticeLayout);
        this.coffeeMachineFragLayout = (LinearLayout) view.findViewById(R.id.coffeeMachineFragLayout);
        this.handdripFragLayout = (LinearLayout) view.findViewById(R.id.handdripFragLayout);
        this.espressoFragLayout = (LinearLayout) view.findViewById(R.id.espressoFragLayout);
        this.presentFragLayout = (LinearLayout) view.findViewById(R.id.presentFragLayout);
        this.setproductFragLayout = (LinearLayout) view.findViewById(R.id.setproductFragLayout);
        this.teebagFragLayout = (LinearLayout) view.findViewById(R.id.teebagFragLayout);
        this.beanFragLayout = (LinearLayout) view.findViewById(R.id.beanFragLayout);
        this.greenbeanFragLayout = (LinearLayout) view.findViewById(R.id.greenbeanFragLayout);
        this.homeFragLayout = (LinearLayout) view.findViewById(R.id.homeFragLayout);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setEvents();
        setValues();
    }

    private void setValues() {

        categorieFragment = this;

    }

    private void setEvents() {
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryRelationActivity.class);
                intent.putExtra("categoryNumbering", Integer.parseInt(view.getTag().toString()));
                startActivityForResult(intent, REQUEST_ACTIVITY);

                Log.d("test", view.getTag().toString());
            }
        };
        noticeLayout.setOnClickListener(onClickListener);
        reviewLayout.setOnClickListener(onClickListener);
        qaLayout.setOnClickListener(onClickListener);
        newsLayout.setOnClickListener(onClickListener);
        dataLayout.setOnClickListener(onClickListener);
        visitLayout.setOnClickListener(onClickListener);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_ACTIVITY){
            if (resultCode == Activity.RESULT_OK){
                int RETURN_ACTIVITY = data.getIntExtra("return_home", 0);
                if (RETURN_ACTIVITY == 0){
                    ((MainActivity)getActivity()).bottomTab.setSelectedItemId(R.id.navigation_home);
                }else if (RETURN_ACTIVITY == 1){
                    ((MainActivity)getActivity()).bottomTab.setSelectedItemId(R.id.navigation_kategorie);
                }else {
                    ((MainActivity)getActivity()).bottomTab.setSelectedItemId(R.id.navigation_mypage);
                }
            }
        }
    }

    public void changeFrag(int index){
        final LinearLayout[] frag = {homeFragLayout, greenbeanFragLayout, beanFragLayout, teebagFragLayout, setproductFragLayout,
                presentFragLayout, espressoFragLayout, handdripFragLayout, coffeeMachineFragLayout};

        for (LinearLayout linearLayout : frag) {
            linearLayout.setVisibility(View.GONE);
        }

        frag[index].setVisibility(View.VISIBLE);
    }



}

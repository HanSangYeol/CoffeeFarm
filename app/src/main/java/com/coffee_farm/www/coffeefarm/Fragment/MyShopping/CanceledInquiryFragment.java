package com.coffee_farm.www.coffeefarm.Fragment.MyShopping;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-30.
 */

public class CanceledInquiryFragment extends Fragment {

    private android.widget.ImageView detailvisibleBtn;
    private android.widget.ImageView detailgoneBtn;
    private android.widget.LinearLayout detailLayout;
    private android.widget.ImageView easyvisibleBtn;
    private android.widget.ImageView easygoneBtn;
    private android.widget.LinearLayout easyLayout;
    private android.widget.ListView cancelListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_canceled_inquiry, container, false);
        this.cancelListView = (ListView) view.findViewById(R.id.cancelListView);
        this.easyLayout = (LinearLayout) view.findViewById(R.id.easyLayout);
        this.easygoneBtn = (ImageView) view.findViewById(R.id.easygoneBtn);
        this.easyvisibleBtn = (ImageView) view.findViewById(R.id.easyvisibleBtn);
        this.detailLayout = (LinearLayout) view.findViewById(R.id.detailLayout);
        this.detailgoneBtn = (ImageView) view.findViewById(R.id.detailgoneBtn);
        this.detailvisibleBtn = (ImageView) view.findViewById(R.id.detailvisibleBtn);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View.OnClickListener visibleClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView[] visible = {detailvisibleBtn, easyvisibleBtn};
                ImageView[] gone = {detailgoneBtn, easygoneBtn};
                LinearLayout[] contentLayout = {detailLayout, easyLayout};

                int index = Integer.parseInt(view.getTag().toString());

                visible[index].setVisibility(View.GONE);
                gone[index].setVisibility(View.VISIBLE);
                contentLayout[index].setVisibility(View.VISIBLE);
            }
        };
        View.OnClickListener goneClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView[] visible = {detailvisibleBtn, easyvisibleBtn};
                ImageView[] gone = {detailgoneBtn, easygoneBtn};
                LinearLayout[] contentLayout = {detailLayout, easyLayout};

                int index = Integer.parseInt(view.getTag().toString());

                visible[index].setVisibility(View.VISIBLE);
                gone[index].setVisibility(View.GONE);
                contentLayout[index].setVisibility(View.GONE);
            }
        };

        detailvisibleBtn.setOnClickListener(visibleClickListener);
        detailgoneBtn.setOnClickListener(goneClickListener);

        easyvisibleBtn.setOnClickListener(visibleClickListener);
        easygoneBtn.setOnClickListener(goneClickListener);
    }
}

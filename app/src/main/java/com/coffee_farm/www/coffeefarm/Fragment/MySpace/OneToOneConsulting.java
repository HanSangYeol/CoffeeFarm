package com.coffee_farm.www.coffeefarm.Fragment.MySpace;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-12-01.
 */

public class OneToOneConsulting extends Fragment {

    private android.widget.ImageView backBtn;
    private android.widget.TextView okBtn;
    private android.widget.EditText titleEdt;
    private android.widget.EditText contentEdt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onetooneconsulting, container, false);
        this.contentEdt = (EditText) view.findViewById(R.id.contentEdt);
        this.titleEdt = (EditText) view.findViewById(R.id.titleEdt);
        this.okBtn = (TextView) view.findViewById(R.id.okBtn);
        this.backBtn = (ImageView) view.findViewById(R.id.backBtn);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
    }

    private void setupEvents() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}

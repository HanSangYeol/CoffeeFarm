package com.coffee_farm.www.coffeefarm.Fragment.MyInfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-12-01.
 */

public class WithdrawalFragment extends Fragment {

    int REQUEST_MYINFO = 1002;

    private android.widget.Spinner withdrawalSpinner;
    private android.widget.ImageView backBtn;
    private android.widget.LinearLayout okBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_withdrawal, container, false);
        this.okBtn = (LinearLayout) view.findViewById(R.id.okBtn);
        this.backBtn = (ImageView) view.findViewById(R.id.backBtn);
        this.withdrawalSpinner = (Spinner) view.findViewById(R.id.withdrawalSpinner);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {


        String[] str = getResources().getStringArray(R.array.withdrawalreason);
        ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.withdrawalreason, R.layout.spinner_layout);
        mAdapter.setDropDownViewResource(R.layout.spinner_layout);
        withdrawalSpinner.setAdapter(mAdapter);

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

package com.coffee_farm.www.coffeefarm.Fragment.MyInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-12-01.
 */

public class EditMembershipInfoFragment extends Fragment {

    int REQUEST_MYINFO = 1002;

    private android.widget.ImageView backBtn;
    private LinearLayout infoeditEdt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editmembershipinfo, container, false);
        this.infoeditEdt = (LinearLayout) view.findViewById(R.id.infoeditEdt);
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

        infoeditEdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}

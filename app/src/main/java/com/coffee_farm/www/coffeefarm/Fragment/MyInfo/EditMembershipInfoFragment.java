package com.coffee_farm.www.coffeefarm.Fragment.MyInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-12-01.
 */

public class EditMembershipInfoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editmembershipinfo, container, false);
        return view;
    }

}

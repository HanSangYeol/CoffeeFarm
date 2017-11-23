package com.coffee_farm.www.coffeefarm.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffee_farm.www.coffeefarm.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by the on 2017-11-22.
 */

public class MyPageFragment extends Fragment {

    private de.hdodenhof.circleimageview.CircleImageView profileimage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mypage, container, false);
        this.profileimage = (CircleImageView) view.findViewById(R.id.profile_image);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

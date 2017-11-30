package com.coffee_farm.www.coffeefarm.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffee_farm.www.coffeefarm.MainActivity;
import com.coffee_farm.www.coffeefarm.MyShoppingActivity;
import com.coffee_farm.www.coffeefarm.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by the on 2017-11-22.
 */

public class MyPageFragment extends Fragment {

    int REQUEST_ACTIVITY = 1000;

    private CircleImageView orderinquiryBtn;
    private CircleImageView itemofinterestBtn;
    private CircleImageView canceledinquiryBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mypage, container, false);
        this.canceledinquiryBtn = (CircleImageView) view.findViewById(R.id.canceledinquiryBtn);
        this.itemofinterestBtn = (CircleImageView) view.findViewById(R.id.itemofinterestBtn);
        this.orderinquiryBtn = (CircleImageView) view.findViewById(R.id.orderinquiryBtn);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        orderinquiryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyShoppingActivity.class);
                startActivityForResult(intent, REQUEST_ACTIVITY);
            }
        });
    }

    private void setupEvents() {
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
}

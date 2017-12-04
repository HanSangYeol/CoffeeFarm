package com.coffee_farm.www.coffeefarm.Fragment.MyShopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.coffee_farm.www.coffeefarm.R;
import com.coffee_farm.www.coffeefarm.ShoppingBasketActivity;

/**
 * Created by the on 2017-11-30.
 */

public class ItemOfInterestFragment extends Fragment {

    private android.widget.ImageView backBtn;
    private ImageView cartBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_of_interest, container, false);
        this.cartBtn = (ImageView) view.findViewById(R.id.cartBtn);
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
        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ShoppingBasketActivity.class);
                startActivity(intent);
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}

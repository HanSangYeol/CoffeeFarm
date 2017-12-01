package com.coffee_farm.www.coffeefarm.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.coffee_farm.www.coffeefarm.MainActivity;
import com.coffee_farm.www.coffeefarm.MyInfoActivity;
import com.coffee_farm.www.coffeefarm.MyShoppingActivity;
import com.coffee_farm.www.coffeefarm.MySpaceActivity;
import com.coffee_farm.www.coffeefarm.R;
import com.coffee_farm.www.coffeefarm.ShoppingBasketActivity;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by the on 2017-11-22.
 */

public class MyPageFragment extends Fragment {

    int REQUEST_ACTIVITY = 1000;

    private CircleImageView orderinquiryBtn;
    private CircleImageView itemofinterestBtn;
    private CircleImageView canceledinquiryBtn;
    private CircleImageView profileImg;
    private android.widget.LinearLayout consultingBtn;
    private android.widget.LinearLayout myconsultingBtn;
    private android.widget.LinearLayout estimateconsultingBtn;
    private android.widget.LinearLayout myreviewsBtn;
    private android.widget.LinearLayout couponBtn;
    private android.widget.LinearLayout savedmoneyBtn;
    private android.widget.LinearLayout pointBtn;
    private android.widget.LinearLayout personalpaymentBtn;
    private android.widget.LinearLayout offlinecouponBtn;
    private LinearLayout taxcalculationBtn;
    private LinearLayout editmembershipinfoBtn;
    private LinearLayout withdrawalBtn;
    private android.widget.ImageView shoppingbasketBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mypage, container, false);
        this.shoppingbasketBtn = (ImageView) view.findViewById(R.id.shoppingbasketBtn);
        this.withdrawalBtn = (LinearLayout) view.findViewById(R.id.withdrawalBtn);
        this.editmembershipinfoBtn = (LinearLayout) view.findViewById(R.id.editmembershipinfoBtn);
        this.taxcalculationBtn = (LinearLayout) view.findViewById(R.id.taxcalculationBtn);
        this.offlinecouponBtn = (LinearLayout) view.findViewById(R.id.offlinecouponBtn);
        this.personalpaymentBtn = (LinearLayout) view.findViewById(R.id.personalpaymentBtn);
        this.pointBtn = (LinearLayout) view.findViewById(R.id.pointBtn);
        this.savedmoneyBtn = (LinearLayout) view.findViewById(R.id.savedmoneyBtn);
        this.couponBtn = (LinearLayout) view.findViewById(R.id.couponBtn);
        this.myreviewsBtn = (LinearLayout) view.findViewById(R.id.myreviewsBtn);
        this.estimateconsultingBtn = (LinearLayout) view.findViewById(R.id.estimateconsultingBtn);
        this.myconsultingBtn = (LinearLayout) view.findViewById(R.id.myconsultingBtn);
        this.consultingBtn = (LinearLayout) view.findViewById(R.id.consultingBtn);
        this.profileImg = (CircleImageView) view.findViewById(R.id.profileImg);
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

    }

    private void setupEvents() {
        shoppingbasketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ShoppingBasketActivity.class);
                startActivity(intent);
            }
        });
        View.OnClickListener myshoppingListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyShoppingActivity.class);
                intent.putExtra("myshoppingNumbering", Integer.parseInt(view.getTag().toString()));
                startActivityForResult(intent, REQUEST_ACTIVITY);
            }
        };
        View.OnClickListener myspaceListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MySpaceActivity.class);
                intent.putExtra("myspaceNumbering", Integer.parseInt(view.getTag().toString()));
                startActivityForResult(intent, REQUEST_ACTIVITY);
            }
        };
        View.OnClickListener myinfoListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyInfoActivity.class);
                intent.putExtra("myinfoNumbering", Integer.parseInt(view.getTag().toString()));
                startActivityForResult(intent, REQUEST_ACTIVITY);
            }
        };
        View.OnClickListener preparingListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "준비 중인 기능입니다", Toast.LENGTH_SHORT).show();
            }
        };
        View.OnClickListener taxListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "세금 계산서 발행은 1:1문의로 문의해주세요", Toast.LENGTH_SHORT).show();
            }
        };
        orderinquiryBtn.setOnClickListener(myshoppingListener);
        itemofinterestBtn.setOnClickListener(myshoppingListener);
        canceledinquiryBtn.setOnClickListener(myshoppingListener);
        consultingBtn.setOnClickListener(myspaceListener);
        myconsultingBtn.setOnClickListener(preparingListener);
        estimateconsultingBtn.setOnClickListener(preparingListener);
        myreviewsBtn.setOnClickListener(preparingListener);
        couponBtn.setOnClickListener(myspaceListener);
        savedmoneyBtn.setOnClickListener(myspaceListener);
        pointBtn.setOnClickListener(myspaceListener);
        personalpaymentBtn.setOnClickListener(preparingListener);
        offlinecouponBtn.setOnClickListener(myspaceListener);
        taxcalculationBtn.setOnClickListener(taxListener);
        editmembershipinfoBtn.setOnClickListener(myinfoListener);
        withdrawalBtn.setOnClickListener(myinfoListener);

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

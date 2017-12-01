package com.coffee_farm.www.coffeefarm.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.coffee_farm.www.coffeefarm.Data.Cancel;
import com.coffee_farm.www.coffeefarm.Data.Coupon;
import com.coffee_farm.www.coffeefarm.R;

import java.util.List;

/**
 * Created by the on 2017-12-01.
 */

public class CouponAdapter extends ArrayAdapter<Coupon> {


    Context mContext;
    List<Coupon> mList;
    LayoutInflater inf;

    public CouponAdapter(Context context, List<Coupon> list){
        super(context, R.layout.coupon_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.coupon_list_item, null);
        }

        return row;
    }

    @Override
    public int getCount() {
        return 10;
    }
}

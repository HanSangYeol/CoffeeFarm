package com.coffee_farm.www.coffeefarm.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.coffee_farm.www.coffeefarm.Data.Cafe;
import com.coffee_farm.www.coffeefarm.Data.Order;
import com.coffee_farm.www.coffeefarm.R;

import java.util.List;

/**
 * Created by the on 2017-11-30.
 */

public class OrderAdapter extends ArrayAdapter<Order>{


    Context mContext;
    List<Order> mList;
    LayoutInflater inf;

    public OrderAdapter(Context context, List<Order> list){
        super(context, R.layout.order_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.order_list_item, null);
        }

        return row;
    }

    @Override
    public int getCount() {
        return 10;
    }
}

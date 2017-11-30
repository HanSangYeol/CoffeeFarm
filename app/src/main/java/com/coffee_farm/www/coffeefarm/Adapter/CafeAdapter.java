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
import com.coffee_farm.www.coffeefarm.R;

import java.util.List;

/**
 * Created by the on 2017-11-30.
 */

public class CafeAdapter extends ArrayAdapter<Cafe> {

    Context mContext;
    List<Cafe> mList;
    LayoutInflater inf;

    public CafeAdapter(Context context, List<Cafe> list){
        super(context, R.layout.attractionvisit_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.attractionvisit_list_item, null);
        }

        ImageView representationImg = (ImageView)row.findViewById(R.id.representationImg);

        Glide.with(mContext).load("https://scontent-sea1-1.cdninstagram.com/t51.2885-15/s480x480/e35/c3.0.1074.1074/20346957_1459022627497090_5230844771492167680_n.jpg?ig_cache_key=MTU2ODI1OTMxNTU5OTczOTk0OQ%3D%3D.2.c").into(representationImg);

        return row;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

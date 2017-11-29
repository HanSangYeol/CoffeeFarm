package com.coffee_farm.www.coffeefarm.Adapter;

import android.content.Context;
import android.icu.text.UFormat;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coffee_farm.www.coffeefarm.Data.Notice;
import com.coffee_farm.www.coffeefarm.R;

import java.util.List;

/**
 * Created by the on 2017-11-28.
 */

public class NoticeAdapter extends ArrayAdapter<Notice> {

    private Context mContext;
    List<Notice> mList;
    LayoutInflater inf;

    public NoticeAdapter(Context context, List<Notice> list){
        super(context, R.layout.notice_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null){
            row = inf.inflate(R.layout.notice_list_item, null);
        }

        TextView titleTxt = (TextView) row.findViewById(R.id.titleTxt);
        TextView dateTxt = (TextView) row.findViewById(R.id.dateTxt);
        final LinearLayout contentLayout = (LinearLayout) row.findViewById(R.id.contentLayout);
        final ImageView visibleBtn = (ImageView) row.findViewById(R.id.visibleBtn);
        final ImageView goneBtn = (ImageView) row.findViewById(R.id.goneBtn);

        visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visibleBtn.setVisibility(View.GONE);
                goneBtn.setVisibility(View.VISIBLE);
                contentLayout.setVisibility(View.VISIBLE);
            }
        });
        goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goneBtn.setVisibility(View.GONE);
                visibleBtn.setVisibility(View.VISIBLE);
                contentLayout.setVisibility(View.GONE);
            }
        });


        return row;
    }

    @Override
    public int getCount() {
        return 10;
    }
}

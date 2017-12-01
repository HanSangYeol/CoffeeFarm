package com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.coffee_farm.www.coffeefarm.Adapter.NoticeAdapter;
import com.coffee_farm.www.coffeefarm.Data.Notice;
import com.coffee_farm.www.coffeefarm.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-11-28.
 */

public class NoticeFragment extends Fragment {


    private ListView noticeListView;
    List<Notice> noticeList = new ArrayList<>();
    NoticeAdapter mNoticeAdapter;
    private android.widget.ImageView backBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notice, container, false);
        this.backBtn = (ImageView) view.findViewById(R.id.backBtn);
        this.noticeListView = (ListView) view.findViewById(R.id.noticeListView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();



    }

    private void setValues() {
        mNoticeAdapter = new NoticeAdapter(getActivity(), noticeList);
        noticeListView.setAdapter(mNoticeAdapter);
    }

    private void setupEvents() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}

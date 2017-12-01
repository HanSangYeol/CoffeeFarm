package com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.coffee_farm.www.coffeefarm.Adapter.ReviewAdapter;
import com.coffee_farm.www.coffeefarm.Data.Review;
import com.coffee_farm.www.coffeefarm.R;

import java.util.List;

/**
 * Created by the on 2017-11-28.
 */

public class ProductReviewsFragment extends Fragment {

    ReviewAdapter reviewAdapter;
    List<Review> reviewList;

    private android.widget.ImageView visibleBtn;
    private android.widget.ImageView goneBtn;
    private android.widget.TextView nicknameTxt;
    private android.widget.TextView viewsTxt;
    private android.widget.TextView dateTxt;
    private android.widget.LinearLayout noticeLayout;
    private android.widget.ListView reviewListView;
    private ImageView backBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_productreviews, container, false);
        this.backBtn = (ImageView) view.findViewById(R.id.backBtn);
        this.reviewListView = (ListView) view.findViewById(R.id.reviewListView);
        this.noticeLayout = (LinearLayout) view.findViewById(R.id.noticeLayout);
        this.dateTxt = (TextView) view.findViewById(R.id.dateTxt);
        this.viewsTxt = (TextView) view.findViewById(R.id.viewsTxt);
        this.nicknameTxt = (TextView) view.findViewById(R.id.nicknameTxt);
        this.goneBtn = (ImageView) view.findViewById(R.id.goneBtn);
        this.visibleBtn = (ImageView) view.findViewById(R.id.visibleBtn);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {

        // TODO - ListView ViewType 참조조

        reviewAdapter = new ReviewAdapter(getActivity(), reviewList);
        reviewListView.setAdapter(reviewAdapter);

    }

    private void setupEvents() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
        visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visibleBtn.setVisibility(View.GONE);
                goneBtn.setVisibility(View.VISIBLE);
                noticeLayout.setVisibility(View.VISIBLE);
            }
        });
        goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visibleBtn.setVisibility(View.VISIBLE);
                goneBtn.setVisibility(View.GONE);
                noticeLayout.setVisibility(View.GONE);
            }
        });
    }
}

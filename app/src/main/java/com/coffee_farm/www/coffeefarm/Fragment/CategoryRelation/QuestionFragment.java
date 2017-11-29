package com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.coffee_farm.www.coffeefarm.QNAActivity;
import com.coffee_farm.www.coffeefarm.QuestionActivity;
import com.coffee_farm.www.coffeefarm.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by the on 2017-11-28.
 */

public class QuestionFragment extends Fragment {

    private de.hdodenhof.circleimageview.CircleImageView questionImg;
    private de.hdodenhof.circleimageview.CircleImageView qnaImg;
    private android.widget.ImageView q1visibleBtn;
    private android.widget.ImageView q1goneBtn;
    private android.widget.LinearLayout q1contentLayout;
    private android.widget.ImageView q2visibleBtn;
    private android.widget.ImageView q2goneBtn;
    private android.widget.LinearLayout q2contentLayout;
    private android.widget.ImageView q3visibleBtn;
    private android.widget.ImageView q3goneBtn;
    private android.widget.LinearLayout q3contentLayout;
    private android.widget.ImageView q4visibleBtn;
    private android.widget.ImageView q4goneBtn;
    private android.widget.LinearLayout q4contentLayout;
    private android.widget.ImageView q5visibleBtn;
    private android.widget.ImageView q5goneBtn;
    private android.widget.LinearLayout q5contentLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);
        this.q5contentLayout = (LinearLayout) view.findViewById(R.id.q5contentLayout);
        this.q5goneBtn = (ImageView) view.findViewById(R.id.q5goneBtn);
        this.q5visibleBtn = (ImageView) view.findViewById(R.id.q5visibleBtn);
        this.q4contentLayout = (LinearLayout) view.findViewById(R.id.q4contentLayout);
        this.q4goneBtn = (ImageView) view.findViewById(R.id.q4goneBtn);
        this.q4visibleBtn = (ImageView) view.findViewById(R.id.q4visibleBtn);
        this.q3contentLayout = (LinearLayout) view.findViewById(R.id.q3contentLayout);
        this.q3goneBtn = (ImageView) view.findViewById(R.id.q3goneBtn);
        this.q3visibleBtn = (ImageView) view.findViewById(R.id.q3visibleBtn);
        this.q2contentLayout = (LinearLayout) view.findViewById(R.id.q2contentLayout);
        this.q2goneBtn = (ImageView) view.findViewById(R.id.q2goneBtn);
        this.q2visibleBtn = (ImageView) view.findViewById(R.id.q2visibleBtn);
        this.q1contentLayout = (LinearLayout) view.findViewById(R.id.q1contentLayout);
        this.q1goneBtn = (ImageView) view.findViewById(R.id.q1goneBtn);
        this.q1visibleBtn = (ImageView) view.findViewById(R.id.q1visibleBtn);
        this.qnaImg = (CircleImageView) view.findViewById(R.id.qnaImg);
        this.questionImg = (CircleImageView) view.findViewById(R.id.questionImg);
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

        q1visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1visibleBtn.setVisibility(View.GONE);
                q1goneBtn.setVisibility(View.VISIBLE);
                q1contentLayout.setVisibility(View.VISIBLE);
            }
        });
        q1goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1visibleBtn.setVisibility(View.VISIBLE);
                q1goneBtn.setVisibility(View.GONE);
                q1contentLayout.setVisibility(View.GONE);
            }
        });
        q2visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q2visibleBtn.setVisibility(View.GONE);
                q2goneBtn.setVisibility(View.VISIBLE);
                q2contentLayout.setVisibility(View.VISIBLE);
            }
        });
        q2goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q2visibleBtn.setVisibility(View.VISIBLE);
                q2goneBtn.setVisibility(View.GONE);
                q2contentLayout.setVisibility(View.GONE);
            }
        });
        q3visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q3visibleBtn.setVisibility(View.GONE);
                q3goneBtn.setVisibility(View.VISIBLE);
                q3contentLayout.setVisibility(View.VISIBLE);
            }
        });
        q3goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q3visibleBtn.setVisibility(View.VISIBLE);
                q3goneBtn.setVisibility(View.GONE);
                q3contentLayout.setVisibility(View.GONE);
            }
        });
        q4visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q4visibleBtn.setVisibility(View.GONE);
                q4goneBtn.setVisibility(View.VISIBLE);
                q4contentLayout.setVisibility(View.VISIBLE);
            }
        });
        q4goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q4visibleBtn.setVisibility(View.VISIBLE);
                q4goneBtn.setVisibility(View.GONE);
                q4contentLayout.setVisibility(View.GONE);
            }
        });
        q5visibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q5visibleBtn.setVisibility(View.GONE);
                q5goneBtn.setVisibility(View.VISIBLE);
                q5contentLayout.setVisibility(View.VISIBLE);
            }
        });
        q5goneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q5visibleBtn.setVisibility(View.VISIBLE);
                q5goneBtn.setVisibility(View.GONE);
                q5contentLayout.setVisibility(View.GONE);
            }
        });
        questionImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QuestionActivity.class);
                startActivity(intent);
            }
        });
        qnaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QNAActivity.class);
                startActivity(intent);
            }
        });
    }
}

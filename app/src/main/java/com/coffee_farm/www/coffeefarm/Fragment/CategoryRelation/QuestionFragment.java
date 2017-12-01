package com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation;

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

import com.coffee_farm.www.coffeefarm.QNAActivity;
import com.coffee_farm.www.coffeefarm.QuestionActivity;
import com.coffee_farm.www.coffeefarm.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by the on 2017-11-28.
 */

public class QuestionFragment extends Fragment {

    int REQUEST_ACTIVITY = 1001;

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
    private ImageView backBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);
        this.backBtn = (ImageView) view.findViewById(R.id.backBtn);
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
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        View.OnClickListener visibleClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView[] visible = {q1visibleBtn, q2visibleBtn, q3visibleBtn, q4visibleBtn, q5visibleBtn};
                ImageView[] gone = {q1goneBtn, q2goneBtn, q3goneBtn, q4goneBtn, q5goneBtn};
                LinearLayout[] contentLayout = {q1contentLayout, q2contentLayout, q3contentLayout, q4contentLayout, q5contentLayout};

                int index = Integer.parseInt(view.getTag().toString());

                visible[index].setVisibility(View.GONE);
                gone[index].setVisibility(View.VISIBLE);
                contentLayout[index].setVisibility(View.VISIBLE);
            }
        };
        View.OnClickListener goneClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView[] visible = {q1visibleBtn, q2visibleBtn, q3visibleBtn, q4visibleBtn, q5visibleBtn};
                ImageView[] gone = {q1goneBtn, q2goneBtn, q3goneBtn, q4goneBtn, q5goneBtn};
                LinearLayout[] contentLayout = {q1contentLayout, q2contentLayout, q3contentLayout, q4contentLayout, q5contentLayout};

                int index = Integer.parseInt(view.getTag().toString());

                visible[index].setVisibility(View.VISIBLE);
                gone[index].setVisibility(View.GONE);
                contentLayout[index].setVisibility(View.GONE);
            }
        };

        q1visibleBtn.setOnClickListener(visibleClickListener);
        q1goneBtn.setOnClickListener(goneClickListener);

        q2visibleBtn.setOnClickListener(visibleClickListener);
        q2goneBtn.setOnClickListener(goneClickListener);

        q3visibleBtn.setOnClickListener(visibleClickListener);
        q3goneBtn.setOnClickListener(goneClickListener);

        q4visibleBtn.setOnClickListener(visibleClickListener);
        q4goneBtn.setOnClickListener(goneClickListener);

        q5visibleBtn.setOnClickListener(visibleClickListener);
        q5goneBtn.setOnClickListener(goneClickListener);

        questionImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QuestionActivity.class);
                startActivityForResult(intent, REQUEST_ACTIVITY);
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_ACTIVITY){
            if (resultCode == Activity.RESULT_OK){
                getActivity().setResult(Activity.RESULT_OK, data);
                getActivity().finish();

            }
        }
    }
}

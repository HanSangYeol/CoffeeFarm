package com.coffee_farm.www.coffeefarm.Fragment.Home;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.coffee_farm.www.coffeefarm.Data.Product.PresentSet;
import com.coffee_farm.www.coffeefarm.Data.Product.ProductSet;
import com.coffee_farm.www.coffeefarm.ProductDetailActivity;
import com.coffee_farm.www.coffeefarm.R;
import com.coffee_farm.www.coffeefarm.Util.GlobalUtil;

import org.apmem.tools.layouts.FlowLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-11-22.
 */

public class PresentSetFragment extends Fragment {

    DisplayMetrics displayMetrics = new DisplayMetrics();

    private List<String> filterKind = new ArrayList<>();

    private android.widget.TextView categoryName;
    private android.widget.TextView categoryCount;
    private android.widget.Spinner spinner;
    private org.apmem.tools.layouts.FlowLayout flowLayout;
    private TextView allview;
    private TextView kind1;
    private TextView kind2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vIew = inflater.inflate(R.layout.fragment_presentset, container, false);
        this.kind2 = (TextView) vIew.findViewById(R.id.kind2);
        this.kind1 = (TextView) vIew.findViewById(R.id.kind1);
        this.allview = (TextView) vIew.findViewById(R.id.allview);
        this.flowLayout = (FlowLayout) vIew.findViewById(R.id.flowLayout);
        this.spinner = (Spinner) vIew.findViewById(R.id.spinner);
        this.categoryCount = (TextView) vIew.findViewById(R.id.categoryCount);
        this.categoryName = (TextView) vIew.findViewById(R.id.categoryName);
        return vIew;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }


    private void setValues() {

        String[] str = getResources().getStringArray(R.array.spinnerArray);
        ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.spinnerArray, R.layout.spinner_layout);
        mAdapter.setDropDownViewResource(R.layout.spinner_layout);
        spinner.setAdapter(mAdapter);

        drawLayout();
    }

    private void setupEvents() {

        allview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoryName.setText(allview.getText().toString());
                filterKind.clear();
                drawLayout();
            }
        });

        View.OnClickListener kindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterKind.clear();
                int kindNum = Integer.parseInt(view.getTag().toString());
                if (kindNum == 0) {
                    filterKind.add("드립티백세트");
                    categoryName.setText("드립티백세트");
                } else if (kindNum == 1) {
                    filterKind.add("원두제품세트");
                    categoryName.setText("원두제품세트");
                }
                drawLayout();

            }
        };
        kind1.setOnClickListener(kindClickListener);
        kind2.setOnClickListener(kindClickListener);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    void drawLayout() {


        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels - (int) convertDpToPixel(30, getActivity());

        GlobalUtil.PRESENTSET_DATA();

        flowLayout.removeAllViews();
        LayoutInflater inf = LayoutInflater.from(getActivity());

//        몇번째 데이터인지 체크.
        int pageNum = 0;
        for (PresentSet presentsetdata : GlobalUtil.PRESENTSET_LIST) {

            boolean isDraw = false;

            if (filterKind.size() == 0) {
                isDraw = true;
            } else {
                if (filterKind.contains(presentsetdata.getKind())) {
                    isDraw = true;
                }
            }

            if (isDraw) {

//            XML로 그려낸 이미지뷰 받아오기.
                final View view = inf.inflate(R.layout.product_item, null);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getActivity(), ProductDetailActivity.class);
                        startActivity(intent);
                    }
                });


                view.setLayoutParams(new ViewGroup.LayoutParams(width / 3, height / 3));
//            뷰의 태그에는, 내 자신이 몇번째 페이지인지 기록.
                view.setTag(pageNum);
//            기록이 끝나고 나면 페이지 숫자를 하나 증가.
                pageNum++;

//            데이터

                TextView titleTxt = (TextView) view.findViewById(R.id.titleTxt);
                ImageView titleImg = (ImageView) view.findViewById(R.id.titleImg);
                titleTxt.setText(presentsetdata.getTitle());
//            titleImg.setLayoutParams(new ViewGroup.LayoutParams(width/3, 100));
                Glide.with(getActivity()).load(presentsetdata.getTitle_Img()).into(titleImg);

                flowLayout.addView(view);
            }


        }
        String count = String.valueOf(pageNum);

        categoryCount.setText(count);

    }


    public static float convertDpToPixel(float dp, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return px;
    }

}

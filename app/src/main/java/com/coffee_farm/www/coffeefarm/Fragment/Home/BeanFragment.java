package com.coffee_farm.www.coffeefarm.Fragment.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import com.coffee_farm.www.coffeefarm.Adapter.GridViewAdapter;
import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-22.
 */

public class BeanFragment extends Fragment {

    private android.widget.TextView categoryName;
    private android.widget.TextView categoryCount;
    private android.widget.Spinner spinner;
    private android.widget.GridView gridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vIew = inflater.inflate(R.layout.fragment_bean, container, false);
        this.gridView = (GridView) vIew.findViewById(R.id.gridView);
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
        int img[] = {R.drawable.greenbean, R.drawable.greenbean, R.drawable.greenbean, R.drawable.greenbean, R.drawable.greenbean};

        // 커스텀 아답타 생성
        GridViewAdapter adapter = new GridViewAdapter(
                getActivity().getApplicationContext(),
                R.layout.product_item, img);    // 데이터

        gridView.setAdapter(adapter);  // 커스텀 어뎁터를 GridView 에 적용

        String[] str = getResources().getStringArray(R.array.spinnerArray);
        ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.spinnerArray, R.layout.spinner_layout);
        mAdapter.setDropDownViewResource(R.layout.spinner_layout);
        spinner.setAdapter(mAdapter);
    }

    private void setupEvents() {
        // GridView 아이템을 클릭하면 position을 넘겨줄수있슴
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}

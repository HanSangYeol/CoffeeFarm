package com.coffee_farm.www.coffeefarm.Fragment.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.coffee_farm.www.coffeefarm.Adapter.GridViewAdapter;
import com.coffee_farm.www.coffeefarm.R;

/**
 * Created by the on 2017-11-22.
 */

public class GreenBeanFragment extends Fragment {

    private android.widget.GridView gridView1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vIew = inflater.inflate(R.layout.fragment_greenbean, container, false);
        this.gridView1 = (GridView) vIew.findViewById(R.id.gridView1);
        return vIew;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        int img[] = {R.drawable.bean, R.drawable.bean, R.drawable.bean, R.drawable.bean, R.drawable.bean, R.drawable.bean,};

        // 커스텀 아답타 생성
        GridViewAdapter adapter = new GridViewAdapter(
                getActivity().getApplicationContext(),
                R.layout.product_item, img);    // 데이터

        gridView1.setAdapter(adapter);  // 커스텀 어뎁터를 GridView 에 적용


        // GridView 아이템을 클릭하면 position을 넘겨줄수있슴
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });


    }
}

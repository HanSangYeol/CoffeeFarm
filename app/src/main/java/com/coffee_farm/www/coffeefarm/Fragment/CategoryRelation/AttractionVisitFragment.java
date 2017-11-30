package com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.coffee_farm.www.coffeefarm.Adapter.CafeAdapter;
import com.coffee_farm.www.coffeefarm.Data.Cafe;
import com.coffee_farm.www.coffeefarm.R;

import java.util.List;

/**
 * Created by the on 2017-11-28.
 */

public class AttractionVisitFragment extends Fragment {

    CafeAdapter cafeAdapter;
    List<Cafe> cafeList;
    private android.widget.ListView cafeListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractionvisit, container, false);
        this.cafeListView = (ListView) view.findViewById(R.id.cafeListView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        cafeAdapter = new CafeAdapter(getActivity(), cafeList);
        cafeListView.setAdapter(cafeAdapter);
    }

    private void setupEvents() {
    }
}

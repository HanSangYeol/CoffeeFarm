package com.coffee_farm.www.coffeefarm.Fragment.CategoryRelation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.coffee_farm.www.coffeefarm.R;

import java.util.ArrayList;

/**
 * Created by the on 2017-11-28.
 */

public class NoticeFragment extends Fragment {

    private ArrayList<String> mGroupList = null;
    private ArrayList<ArrayList<String>> mChildList = null;
    private ArrayList<String> mChildListContent = null;
    private android.widget.ListView noticeListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notice, container, false);
        this.noticeListView = (ListView) view.findViewById(R.id.noticeListView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



//
//            mGroupList = new ArrayList<String>();
//            mChildList = new ArrayList<ArrayList<String>>();
//            mChildListContent = new ArrayList<String>();
//
//            mGroupList.add("가위");
//            mGroupList.add("바위");
//            mGroupList.add("보");
//
//            mChildListContent.add("1");
//            mChildListContent.add("2");
//            mChildListContent.add("3");
//
//            mChildList.add(mChildListContent);
//            mChildList.add(mChildListContent);
//            mChildList.add(mChildListContent);
//
//        noticeListView.setAdapter(new BaseExpandableAdapter(this, mGroupList, mChildList));
//
//            // 그룹 클릭 했을 경우 이벤트
//        noticeListView.setOnGroupClickListener(new OnGroupClickListener() {
//                @Override
//                public boolean onGroupClick(ExpandableListView parent, View v,
//                                            int groupPosition, long id) {
//                    Toast.makeText(getApplicationContext(), "g click = " + groupPosition,
//                            Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//            });
//
//            // 차일드 클릭 했을 경우 이벤트
//            mListView.setOnChildClickListener(new OnChildClickListener() {
//                @Override
//                public boolean onChildClick(ExpandableListView parent, View v,
//                                            int groupPosition, int childPosition, long id) {
//                    Toast.makeText(getApplicationContext(), "c click = " + childPosition,
//                            Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//            });
//
//            // 그룹이 닫힐 경우 이벤트
//            mListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {
//                @Override
//                public void onGroupCollapse(int groupPosition) {
//                    Toast.makeText(getApplicationContext(), "g Collapse = " + groupPosition,
//                            Toast.LENGTH_SHORT).show();
//                }
//            });
//
//            // 그룹이 열릴 경우 이벤트
//            mListView.setOnGroupExpandListener(new OnGroupExpandListener() {
//                @Override
//                public void onGroupExpand(int groupPosition) {
//                    Toast.makeText(getApplicationContext(), "g Expand = " + groupPosition,
//                            Toast.LENGTH_SHORT).show();
//                }
//            });
//        }

    }
}

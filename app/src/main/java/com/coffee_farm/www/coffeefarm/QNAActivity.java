package com.coffee_farm.www.coffeefarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

import com.coffee_farm.www.coffeefarm.Adapter.QuestionAdapter;
import com.coffee_farm.www.coffeefarm.Data.Question;

import java.util.List;

public class QNAActivity extends BaseActivity {


    private BottomNavigationView bottomTab;
    QuestionAdapter questionAdapter;
    List<Question> questionList;
    private android.widget.ListView qnaListView;
    private android.widget.ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);
        bindView();
        setupEvents();
        setValues();

    }

    @Override
    public void setValues() {

        questionAdapter = new QuestionAdapter(mContext, questionList);
        qnaListView.setAdapter(questionAdapter);

        bottomTab.setSelectedItemId(R.id.navigation_kategorie);
        bottomTab.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent = new Intent();
                        intent.putExtra("return_home", 0);
                        setResult(RESULT_OK, intent);
                        finish();
                        return true;
                    case R.id.navigation_kategorie:
                        intent = new Intent();
                        intent.putExtra("return_home", 1);
                        setResult(RESULT_OK, intent);
                        finish();
                        return true;
                    case R.id.navigation_mypage:
                        intent = new Intent();
                        intent.putExtra("return_home", 2);
                        setResult(RESULT_OK, intent);
                        finish();
                        return true;
                }

                return false;
            }
        });

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void bindView() {
        this.bottomTab = (BottomNavigationView) findViewById(R.id.bottomTab);
        this.qnaListView = (ListView) findViewById(R.id.qnaListView);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}

package com.example.tennis_booking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    EditText edt1;
    TextView tv;
    RecyclerView rv;
    private ArrayList<SearchItem> searchData = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    SearchAdapter searchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        edt1 = (EditText) findViewById(R.id.edtSearch1);
        edt1.requestFocus();

        //set dữ liệu cho search
        rv = findViewById(R.id.rvSearch);

        Resources res = getResources();
        Drawable tennis1 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts, null);
        Drawable tennis2 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_2, null);
        Drawable tennis3 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_3, null);
        Drawable tennis4 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_4, null);
        Drawable tennis5 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_5, null);
        Drawable tennis6 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_6, null);
        Drawable tennis7 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_7, null);
        Drawable tennis8 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_8, null);
        Drawable tennis9 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_9, null);
        Drawable tennis10 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_10, null);
        Drawable tennis11 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_11, null);
        Drawable tennis12 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_12, null);

        SearchItem searchItem1 = new SearchItem("Tennis Lakeview", tennis1);
        SearchItem searchItem2 = new SearchItem("Tennis The Estern", tennis2);
        SearchItem searchItem3 = new SearchItem("Tennis Villa Park", tennis3);
        SearchItem searchItem4 = new SearchItem("Tennis Stratford", tennis4);
        SearchItem searchItem5 = new SearchItem("Tennis Oakland", tennis5);
        SearchItem searchItem6 = new SearchItem("Tennis Nova Sport", tennis6);
        SearchItem searchItem7 = new SearchItem("Tennis Quận 9", tennis7);
        SearchItem searchItem8 = new SearchItem("Tennis Lan Anh", tennis8);
        SearchItem searchItem9 = new SearchItem("Tennis Đồng khởi", tennis9);
        SearchItem searchItem10 = new SearchItem("Tennis Newstar", tennis10);
        SearchItem searchItem11 = new SearchItem("Tennis Chúa hề", tennis11);
        SearchItem searchItem12 = new SearchItem("Tennis The boss", tennis12);

        searchData.add(searchItem1);
        searchData.add(searchItem2);
        searchData.add(searchItem3);
        searchData.add(searchItem4);
        searchData.add(searchItem5);
        searchData.add(searchItem6);
        searchData.add(searchItem7);
        searchData.add(searchItem8);
        searchData.add(searchItem9);
        searchData.add(searchItem10);
        searchData.add(searchItem11);
        searchData.add(searchItem12);

        linearLayoutManager = new LinearLayoutManager(SearchActivity.this, LinearLayoutManager.VERTICAL, false);

        searchAdapter = new SearchAdapter(searchData);

        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(searchAdapter);

        tv = (TextView) findViewById(R.id.tvBack);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
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

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView rv1;
    EditText edt;
    private ArrayList<CourtItem> courtData = new ArrayList<>();
    private ArrayList<CourtItem> courtData1 = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    LinearLayoutManager linearLayoutManager1;
    HomeAdapter homeAdapter;
    HomeAdapter homeAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Thêm dữ liệu vào trong recycle view
        rv = findViewById(R.id.rvSearch);
        rv1 = findViewById(R.id.rvNearMe);

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

        //set data cho court On Discount
        CourtItem courtItem1 = new CourtItem( tennis1,"Tennis Lakeview", "11.2km", "đ50.000/h");
        CourtItem courtItem2 = new CourtItem( tennis2,"Tennis The Estern", "9.2km", "đ55.000/h");
        CourtItem courtItem3 = new CourtItem( tennis3,"Tennis Villa Park", "5.8km", "đ40.000/h");
        CourtItem courtItem4 = new CourtItem( tennis4,"Tennis Stratford", "6.2km", "đ45.000/h");
        CourtItem courtItem5 = new CourtItem( tennis5,"Tennis Oakland", "6.6km", "đ50.000/h");
        CourtItem courtItem6 = new CourtItem( tennis6,"Tennis Nova Sport", "2.3km", "đ53.000/h");

        courtData.add(courtItem1);
        courtData.add(courtItem2);
        courtData.add(courtItem3);
        courtData.add(courtItem4);
        courtData.add(courtItem5);
        courtData.add(courtItem6);

        //Set data cho court Near me

        CourtItem courtItem7 = new CourtItem( tennis7,"Tennis Quận 9", "3.2km", "đ55.000/h");
        CourtItem courtItem8 = new CourtItem( tennis8,"Tennis Lan Anh", "2.8km", "đ40.000/h");
        CourtItem courtItem9 = new CourtItem( tennis9,"Tennis Đồng khởi", "1.3km", "đ45.000/h");
        CourtItem courtItem10 = new CourtItem( tennis10,"Tennis New Star", "2.4km", "đ50.000/h");
        CourtItem courtItem11 = new CourtItem( tennis11,"Tennis Chúa hề", "3.8km", "đ53.000/h");
        CourtItem courtItem12 = new CourtItem( tennis12,"Tennis The boss", "1.9km", "đ50.000/h");

        courtData1.add(courtItem7);
        courtData1.add(courtItem8);
        courtData1.add(courtItem9);
        courtData1.add(courtItem10);
        courtData1.add(courtItem11);
        courtData1.add(courtItem12);


        linearLayoutManager = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManager1 = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);

        homeAdapter = new HomeAdapter(courtData);
        homeAdapter1 = new HomeAdapter(courtData1);

        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(homeAdapter);

        rv1.setLayoutManager(linearLayoutManager1);
        rv1.setAdapter(homeAdapter1);

        //Xử lí nút search

        edt = (EditText) findViewById(R.id.edtSearch);
        edt.setShowSoftInputOnFocus(false);
        edt.setFocusableInTouchMode(false);
        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }

}
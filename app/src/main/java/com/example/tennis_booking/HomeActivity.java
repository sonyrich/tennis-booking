package com.example.tennis_booking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rv;
    private ArrayList<CourtItem> courtData = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rv = findViewById(R.id.rvCourt);

        Resources res = getResources();
        Drawable tennis1 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts, null);
        Drawable tennis2 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_2, null);
        Drawable tennis3 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_3, null);
        Drawable tennis4 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_4, null);
        Drawable tennis5 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_5, null);
        Drawable tennis6 = ResourcesCompat.getDrawable(res, R.drawable.tennis_courts_6, null);

        //set data cho court
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

        linearLayoutManager = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        homeAdapter = new HomeAdapter(courtData);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(homeAdapter);

    }

}
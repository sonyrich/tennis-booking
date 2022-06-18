package com.example.tennis_booking;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements HomeAdapter.itemClickListener{

    private RecyclerView rv;
    private RecyclerView rv1;
    private EditText edt;
    private ImageView img;

    private ArrayList<CourtItem> courtData = new ArrayList<>();
    private ArrayList<CourtItem> courtData1 = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private LinearLayoutManager linearLayoutManager1;
    private HomeAdapter homeAdapter;
    private HomeAdapter homeAdapter1;

    public HomeFragment(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<CourtItem> CourtModelList = new ArrayList<>();

        rv = (RecyclerView) rootView.findViewById(R.id.rvOnDiscount);
        rv1 = (RecyclerView) rootView.findViewById(R.id.rvNearMe);

        float sao4 = 4.5F;

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

        CourtItem courtItem1 = new CourtItem( tennis1, (float) 5,"Tennis Lakeview", "11.2km", "đ50.000/h");
        CourtItem courtItem2 = new CourtItem( tennis2, (float) 3.3,"Tennis The Estern", "9.2km", "đ55.000/h");
        CourtItem courtItem3 = new CourtItem( tennis3, (float) 3.3,"Tennis Villa Park", "5.8km", "đ40.000/h");
        CourtItem courtItem4 = new CourtItem( tennis4, (float) 3.3,"Tennis Stratford", "6.2km", "đ45.000/h");
        CourtItem courtItem5 = new CourtItem( tennis5, (float) 3.3,"Tennis Oakland", "6.6km", "đ50.000/h");
        CourtItem courtItem6 = new CourtItem( tennis6, (float) 3.3,"Tennis Nova Sport", "2.3km", "đ53.000/h");

        courtData.add(courtItem1);
        courtData.add(courtItem2);
        courtData.add(courtItem3);
        courtData.add(courtItem4);
        courtData.add(courtItem5);
        courtData.add(courtItem6);

        CourtItem courtItem7 = new CourtItem( tennis7, (float) 3.3,"Tennis Quận 9", "3.2km", "đ55.000/h");
        CourtItem courtItem8 = new CourtItem( tennis8, (float) 3.3,"Tennis Lan Anh", "2.8km", "đ40.000/h");
        CourtItem courtItem9 = new CourtItem( tennis9, (float) 3.3,"Tennis Đồng khởi", "1.3km", "đ45.000/h");
        CourtItem courtItem10 = new CourtItem( tennis10, (float) 3.3,"Tennis New Star", "2.4km", "đ50.000/h");
        CourtItem courtItem11 = new CourtItem( tennis11, (float) 3.3,"Tennis Chúa hề", "3.8km", "đ53.000/h");
        CourtItem courtItem12 = new CourtItem( tennis12, (float) 3.3,"Tennis The boss", "1.9km", "đ50.000/h");

        courtData1.add(courtItem7);
        courtData1.add(courtItem8);
        courtData1.add(courtItem9);
        courtData1.add(courtItem10);
        courtData1.add(courtItem11);
        courtData1.add(courtItem12);

        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        homeAdapter = new HomeAdapter(courtData, this);
        homeAdapter1 = new HomeAdapter(courtData1, this);

        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(homeAdapter);

        rv1.setLayoutManager(linearLayoutManager1);
        rv1.setAdapter(homeAdapter1);

        // xử lí nút search
        edt = (EditText) rootView.findViewById(R.id.edtSearch);
        edt.setShowSoftInputOnFocus(false);
        edt.setFocusableInTouchMode(false);
        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

        //Xử lí nhấn message
        img = (ImageView) rootView.findViewById(R.id.imgMessage);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MessagesActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getContext(), CourtDetailActivity.class);
        startActivity(intent);
    }
}
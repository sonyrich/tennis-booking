package com.example.tennis_booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CouponListActivity extends AppCompatActivity{
    private LinearLayout llbalck, ll2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_list);

        llbalck = (LinearLayout) findViewById(R.id.llbalck);
        llbalck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CouponListActivity.this, CouponDetailActivity.class);
                startActivity(intent);
            }
        });

        ll2 = (LinearLayout) findViewById(R.id.ll2);
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CouponListActivity.this, DateBookingActivity.class);
                startActivity(intent);
            }
        });
    }
}

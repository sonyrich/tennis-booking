package com.example.tennis_booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class DateBookingActivity extends AppCompatActivity /*implements DatePickerDialog.OnDateSetListener*/ {

    Button booking_btn;
    ViewPager mViewPager;
    Button img;
    TextView tvBack, tv_seemore;

    int[] images = {R.drawable.tennis_courts, R.drawable.tennis_courts_2, R.drawable.tennis_courts_3, R.drawable.tennis_courts_4,
            R.drawable.tennis_courts_5, R.drawable.tennis_courts_6, R.drawable.tennis_courts_7, R.drawable.tennis_courts_8};
    ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_booking);

        booking_btn = findViewById(R.id.booking_btn);
        booking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TimePickingActivity.class);
                startActivity(intent);
            }
        });

        img = (Button) findViewById(R.id.message_btn);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DateBookingActivity.this, MessagesActivity.class);
                startActivity(intent);
            }
        });

        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
        mViewPagerAdapter = new ViewPagerAdapter(DateBookingActivity.this, images);
        mViewPager.setAdapter(mViewPagerAdapter);


        tvBack = (TextView)  findViewById(R.id.tv_back_date_booking);
        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DateBookingActivity.this, NavigatorActivity.class);
                startActivity(intent);
            }
        });

        tv_seemore = (TextView) findViewById(R.id.tv_seemore);
        tv_seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DateBookingActivity.this, CommentListActivity.class);
                startActivity(intent);
            }
        });
    }
}

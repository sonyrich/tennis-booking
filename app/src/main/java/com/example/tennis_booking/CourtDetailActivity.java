package com.example.tennis_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtDetailActivity extends AppCompatActivity {
    TextView tv_booking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_detail);

        tv_booking = (TextView) findViewById(R.id.tv_booking);
        tv_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtDetailActivity.this, DateBookingActivity.class);
                startActivity(intent);
            }
        });
    }
}
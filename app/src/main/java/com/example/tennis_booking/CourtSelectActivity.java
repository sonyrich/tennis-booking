package com.example.tennis_booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CourtSelectActivity extends AppCompatActivity {

    Button btn;
    TextView tv_back_court_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_select);

        btn = (Button) findViewById(R.id.booking_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtSelectActivity.this, SuccessBookingActivity.class);
                startActivity(intent);
            }
        });

        tv_back_court_select = (TextView) findViewById(R.id.tv_back_court_select);
        tv_back_court_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtSelectActivity.this, TimePickingActivity.class);
                startActivity(intent);
            }
        });
    }
}

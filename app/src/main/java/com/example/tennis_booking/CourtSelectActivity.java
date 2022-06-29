package com.example.tennis_booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CourtSelectActivity extends AppCompatActivity {

    Button btn;
    TextView tv_back_court_select;
    ConstraintLayout layout_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_select);

        tv_back_court_select = (TextView) findViewById(R.id.tv_back_court_select);
        tv_back_court_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtSelectActivity.this, DateBookingActivity.class);
                startActivity(intent);
            }
        });

        layout_1 = (ConstraintLayout) findViewById(R.id.layout_1);
        layout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtSelectActivity.this, PaySectionActivity.class);
                startActivity(intent);   }
        });
    }
}

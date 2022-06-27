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

public class CourtSelectActivity extends AppCompatActivity {

    Button btn;
    TextView tv_back_court_select, tv_style;
    LinearLayout llayout_1;
    ImageView court1, court2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_select);

        btn = (Button) findViewById(R.id.booking_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtSelectActivity.this, TimePickingActivity.class);
                startActivity(intent);
            }
        });

        tv_back_court_select = (TextView) findViewById(R.id.tv_back_court_select);
        tv_back_court_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourtSelectActivity.this, DateBookingActivity.class);
                startActivity(intent);
            }
        });

        llayout_1 = (LinearLayout) findViewById(R.id.llayout_1);
        tv_style = (TextView) findViewById(R.id.tv_stype);
        llayout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });

        court1 = (ImageView) findViewById(R.id.court1);
        court2 = (ImageView) findViewById(R.id.court2);
        court1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                court1.setImageResource(R.drawable.select);
                court2.setImageDrawable(null);
            }
        });

        court2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                court2.setImageResource(R.drawable.select);
                court1.setImageDrawable(null);
            }
        });
    }

    private void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this, llayout_1);
        popupMenu.getMenuInflater().inflate(R.menu.court_style_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mn_1_vs: tv_style.setText("Court for 1vs1");
                        break;
                    case R.id.mn_2_vs: tv_style.setText("Court for 2vs2");
                        break;
                }
                return false;
            }
        });

        popupMenu.show();
    }
}

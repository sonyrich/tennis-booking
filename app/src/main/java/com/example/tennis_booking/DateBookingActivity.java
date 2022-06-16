package com.example.tennis_booking;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.ViewPager;

import java.text.DateFormat;

public class DateBookingActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    Button booking_btn;
    TextView ed_calendar;

    // creating object of ViewPager
    ViewPager mViewPager;

    // images array
    int[] images = {R.drawable.tennis_courts, R.drawable.tennis_courts_2, R.drawable.tennis_courts_3, R.drawable.tennis_courts_4,
            R.drawable.tennis_courts_5, R.drawable.tennis_courts_6, R.drawable.tennis_courts_7, R.drawable.tennis_courts_8};

    // Creating Object of ViewPagerAdapter
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

        ed_calendar = (TextView) findViewById(R.id.ed_calendar);
        ed_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });

        // Initializing the ViewPager Object
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);

        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(DateBookingActivity.this, images);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        ed_calendar.setText(currentDateString);
    }
}

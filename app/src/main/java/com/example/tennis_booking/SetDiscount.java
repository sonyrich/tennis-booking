package com.example.tennis_booking;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;

public class SetDiscount extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    TextView txtBack;
    TextView txtHome;
    Button btnSet;
    ImageView imageDate;
    TextView txtDate;
    Spinner spinner5;
    Spinner spinner6;
    Spinner spinner7;
    Spinner spinner8;
    Spinner spinner9;
    Spinner spinner10;
    Spinner spinner11;
    Spinner spinner12;
    Spinner spinner13;
    Spinner spinner14;
    Spinner spinner15;
    Spinner spinner16;
    Spinner spinner17;
    Spinner spinner18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_discount);
        txtHome = (TextView) findViewById(R.id.txtHome4);
        txtBack = (TextView) findViewById(R.id.txtBack4);
        btnSet = (Button) findViewById(R.id.btnSet);
        imageDate = (ImageView) findViewById(R.id.imageDate2);
        txtDate = (TextView) findViewById(R.id.txtDate3);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner9 = (Spinner) findViewById(R.id.spinner9);
        spinner10 = (Spinner) findViewById(R.id.spinner10);
        spinner11 = (Spinner) findViewById(R.id.spinner11);
        spinner12 = (Spinner) findViewById(R.id.spinner12);
        spinner13 = (Spinner) findViewById(R.id.spinner13);
        spinner14 = (Spinner) findViewById(R.id.spinner14);
        spinner15 = (Spinner) findViewById(R.id.spinner15);
        spinner16 = (Spinner) findViewById(R.id.spinner16);
        spinner17 = (Spinner) findViewById(R.id.spinner17);
        spinner18 = (Spinner) findViewById(R.id.spinner18);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.timeAM, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.timePM, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner5.setAdapter(adapter1);
        spinner6.setAdapter(adapter2);
        spinner7.setAdapter(adapter1);
        spinner8.setAdapter(adapter2);
        spinner9.setAdapter(adapter1);
        spinner10.setAdapter(adapter2);
        spinner11.setAdapter(adapter1);
        spinner12.setAdapter(adapter2);
        spinner13.setAdapter(adapter1);
        spinner14.setAdapter(adapter2);
        spinner15.setAdapter(adapter1);
        spinner16.setAdapter(adapter2);
        spinner17.setAdapter(adapter1);
        spinner18.setAdapter(adapter2);

        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDiscount.this,ListCourse2.class);
                startActivity(intent);
            }
        });
        txtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDiscount.this,HomeFragment.class);
                startActivity(intent);
            }
        });
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetDiscount.this,ListCourse2.class);
                startActivity(intent);
            }
        });
        imageDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        txtDate.setText(currentDateString);
    }
}
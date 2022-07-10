package com.example.tennis_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCourse2 extends AppCompatActivity {
    ImageView imageCourse;
    TextView txtName;
    Button btnDiscount;
    TextView txtHome;
    TextView txtCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_course);

        imageCourse = (ImageView) findViewById(R.id.imageView5);
        txtName = (TextView) findViewById(R.id.txtName);
        txtHome = (TextView) findViewById(R.id.txtHome2);
        txtCreate = (TextView) findViewById(R.id.txtCreate);
        btnDiscount = (Button) findViewById(R.id.btnDiscount);

        txtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imageCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListCourse2.this, UpdateCourse.class);
                startActivity(intent);
            }
        });
        txtName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListCourse2.this, UpdateCourse.class);
                startActivity(intent);
            }
        });
        txtCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListCourse2.this, CreateCourse2.class);
                startActivity(intent);
            }
        });
        btnDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListCourse2.this, CouponDetailActivity.class);
                startActivity(intent);
            }
        });

    }
}
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
    Button btnRevenues;
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
        btnRevenues = (Button) findViewById(R.id.btnRevenues);

        imageCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListCourse2.this, CreateCourse2.class);
                startActivity(intent);
            }
        });
        txtName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListCourse2.this, CreateCourse2.class);
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
        btnRevenues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
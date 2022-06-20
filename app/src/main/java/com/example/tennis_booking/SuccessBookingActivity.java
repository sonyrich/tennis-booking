package com.example.tennis_booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessBookingActivity extends AppCompatActivity {

    Button ntn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_booking);

        ntn = (Button) findViewById(R.id.backtohome_btn);
        ntn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuccessBookingActivity.this, NavigatorActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.tennis_booking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MOCKMomoActivity extends AppCompatActivity {

    Button mockbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_confirmation_activity);

        mockbtn = (Button) findViewById(R.id.mockbtn);
        mockbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOCKMomoActivity.this, SuccessBookingActivity.class);
                startActivity(intent);
            }
        });
    }
}

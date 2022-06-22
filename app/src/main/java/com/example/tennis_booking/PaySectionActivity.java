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

public class PaySectionActivity extends AppCompatActivity {

    TextView tv_paymethod;
    LinearLayout llayout_paymethod;
    ImageView iv_paymethod;
    Button booking_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_section);

        llayout_paymethod = (LinearLayout) findViewById(R.id.llayout_paymethod);
        tv_paymethod = (TextView) findViewById(R.id.tv_paymethod);
        iv_paymethod = (ImageView) findViewById(R.id.iv_paymethod);
        llayout_paymethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });

        booking_btn = (Button) findViewById(R.id.booking_btn);
        booking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaySectionActivity.this, SuccessBookingActivity.class);
                startActivity(intent);
            }
        });
    }

    private void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this, llayout_paymethod);
        popupMenu.getMenuInflater().inflate(R.menu.payment_method_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_momo: tv_paymethod.setText("Momo");
                        iv_paymethod.setImageResource(R.drawable.momo);
                        break;
                    case R.id.ic_zalopay: tv_paymethod.setText("Zalopay");
                        iv_paymethod.setImageResource(R.drawable.zalopay);
                        break;
                    case R.id.ic_mocagrab: tv_paymethod.setText("Moca|Grab");
                        iv_paymethod.setImageResource(R.drawable.moca);
                        break;
                    case R.id.ic_visa: tv_paymethod.setText("Visa card");
                        iv_paymethod.setImageResource(R.drawable.visa);
                        break;
                    case R.id.ic_debitcard: tv_paymethod.setText("Debit card");
                        iv_paymethod.setImageResource(R.drawable.card);
                        break;
                    case R.id.ic_cash: tv_paymethod.setText("Cash");
                        iv_paymethod.setImageResource(R.drawable.tienne);
                        break;
                }
                return false;
            }
        });

        popupMenu.show();
    }
}

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PaySectionActivity extends AppCompatActivity implements HomeAdapter.itemClickListener{

    private TextView tv_paymethod;
    private LinearLayout llayout_paymethod;
    private ImageView iv_paymethod;
    private Button booking_btn;
    private RecyclerView rvCoupon;
    private LinearLayoutManager linearLayoutManager;
    private CouponAdapter couponAdapter;
    private ArrayList<CouponItem> couponData = new ArrayList<>();

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
                Intent intent = new Intent(PaySectionActivity.this, MOCKMomoActivity.class);
                startActivity(intent);
            }
        });

        CouponItem couponItem = new CouponItem("BLACKFRIDAYC#JAVA", "Black Friday giảm 50%", "Exp: 10/7/2022");
        CouponItem couponItem1 = new CouponItem("FIRSTTIMEBOOKA6D3", "Giảm 20% lần đầu đặt sân", "Exp: 10/7/2022");
        CouponItem couponItem2 = new CouponItem("MOMOFLUTTERE5G1", "Momo giảm 20k sân nhỏ", "Exp: 10/7/2022");
        CouponItem couponItem3 = new CouponItem("ZALOPAYDART9VOS", "ZaloPay giảm 50k sân lớn", "Exp: 10/7/2022");
        CouponItem couponItem4 = new CouponItem("GIAMCHOCO1A0ME", "Giảm 1k cho có giảm", "Exp: 10/7/2022");
        CouponItem couponItem5 = new CouponItem("BANLANHAT2GT1", "Giảm 90% cho em bé", "Exp: 10/7/2022");

        couponData.add(couponItem);
        couponData.add(couponItem1);
        couponData.add(couponItem2);
        couponData.add(couponItem3);
        couponData.add(couponItem4);
        couponData.add(couponItem5);

        rvCoupon = (RecyclerView) findViewById(R.id.rvCoupon);

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        couponAdapter = new CouponAdapter(couponData, this::onItemClick);

        rvCoupon.setLayoutManager(linearLayoutManager);
        rvCoupon.setAdapter(couponAdapter);
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

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, DateBookingActivity.class);
        startActivity(intent);
    }
}

package com.example.tennis_booking;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CouponAdapter extends RecyclerView.Adapter<CouponAdapter.MyHolder> {
    ArrayList<CouponItem> couponList;
    private itemClickListener mItemClickListener;

    public CouponAdapter(ArrayList<CouponItem> couponList, itemClickListener mItemClickListener) {
        this.couponList = couponList;
        this.mItemClickListener = mItemClickListener;
    }

    @NonNull
    @Override
    public CouponAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.coupon_item, parent, false);
        return new MyHolder(v, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CouponAdapter.MyHolder holder, int position) {
        holder.coupon_title.setText(couponList.get(position).getCouponTitle());
        holder.coupon_desc.setText(couponList.get(position).getcouponDesc());
        holder.coupon_expired.setText(couponList.get(position).getCouponExp());
    }

    @Override
    public int getItemCount() {
        return couponList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView coupon_title;
        TextView coupon_desc;
        TextView coupon_expired;

        itemClickListener clickListener;

        public MyHolder(@NonNull View itemView, itemClickListener clickListener) {
            super(itemView);
            Context context = itemView.getContext();
            coupon_title = itemView.findViewById(R.id.coupon_title);
            coupon_desc = itemView.findViewById(R.id.coupon_desc);
            coupon_expired = itemView.findViewById(R.id.coupon_expired);

            this.clickListener = clickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition());
        }
    }

    public interface itemClickListener {
        void onItemClick(int position);
    }
}

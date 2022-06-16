package com.example.tennis_booking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyHolder>{
    ArrayList<CourtItem> CourtModelList;

    public HomeAdapter(ArrayList<CourtItem> courtModelList) {
        this.CourtModelList = courtModelList;
    }

    @NonNull
    @Override
    public HomeAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.imgCourt.setImageDrawable(CourtModelList.get(position).getImgCourt());
        holder.tvCourtName.setText(CourtModelList.get(position).getCourtName());
        holder.tvCourDistance.setText(CourtModelList.get(position).getCourtDistance());
        holder.tvCourPrice.setText(CourtModelList.get(position).getCourtPrice());
    }

    @Override
    public int getItemCount() {
        return CourtModelList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView imgCourt;
        TextView tvCourtName;
        TextView tvCourDistance;
        TextView tvCourPrice;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imgCourt = itemView.findViewById(R.id.imgCourt);
            tvCourtName = itemView.findViewById(R.id.tvCourtName);
            tvCourDistance = itemView.findViewById(R.id.tvCourtDistance);
            tvCourPrice = itemView.findViewById(R.id.tvCourtPrice);
        }
    }
}

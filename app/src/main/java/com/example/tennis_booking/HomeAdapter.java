package com.example.tennis_booking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyHolder>{
    ArrayList<CourtItem> CourtModelList;
    private itemClickListener mItemClickListener;

    public HomeAdapter(ArrayList<CourtItem> courtModelList, itemClickListener clickListener) {
        this.CourtModelList = courtModelList;
        this.mItemClickListener = clickListener;
    }

    @NonNull
    @Override
    public HomeAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1, parent, false);
        return new MyHolder(v, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.imgCourt.setImageDrawable(CourtModelList.get(position).getImgCourt());
        holder.courtRatingBar.setRating(CourtModelList.get(position).getRatingBar());
        holder.tvCourtName.setText(CourtModelList.get(position).getCourtName());
        holder.tvCourDistance.setText(CourtModelList.get(position).getCourtDistance());
        holder.tvCourPrice.setText(CourtModelList.get(position).getCourtPrice());
    }

    @Override
    public int getItemCount() {
        return CourtModelList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgCourt;
        RatingBar courtRatingBar;
        TextView tvCourtName;
        TextView tvCourDistance;
        TextView tvCourPrice;

        itemClickListener clickListener;

        public MyHolder(@NonNull View itemView, itemClickListener clickListener) {
            super(itemView);
            Context context = itemView.getContext();
            imgCourt = itemView.findViewById(R.id.imgCourt);
            courtRatingBar = itemView.findViewById(R.id.cardRatingBar);
            tvCourtName = itemView.findViewById(R.id.tvCourtName);
            tvCourDistance = itemView.findViewById(R.id.tvCourtDistance);
            tvCourPrice = itemView.findViewById(R.id.tvCourtPrice);
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

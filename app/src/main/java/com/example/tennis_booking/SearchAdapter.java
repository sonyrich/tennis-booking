package com.example.tennis_booking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.MyHolder> {
    ArrayList<SearchItem> SearchItemList;

    public SearchAdapter(ArrayList<SearchItem> searchItemList) {
        this.SearchItemList = searchItemList;
    }
    @NonNull
    @Override
    public SearchAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trend_search, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tvSearchName.setText(SearchItemList.get(position).getSearchName());
        holder.searchImg.setImageDrawable(SearchItemList.get(position).getSearchImg());
    }

    @Override
    public int getItemCount() {
        return SearchItemList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView tvSearchName;
        ImageView searchImg;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tvSearchName = itemView.findViewById(R.id.tvSearchName);
            searchImg = itemView.findViewById(R.id.imgSearch);
        }
    }
}

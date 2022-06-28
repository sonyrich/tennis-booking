package com.example.tennis_booking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class CommentAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Comment> commentList;

    public CommentAdapter(Context context, int layout, List<Comment> commentList) {
        this.context = context;
        this.layout = layout;
        this.commentList = commentList;
    }

    @Override
    public int getCount() {
        return commentList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView txtTen, date, comment;
        ImageView imgAcc;
        RatingBar ratingBar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.txtTen = (TextView) convertView.findViewById(R.id.tv_name1);
            holder.date = (TextView) convertView.findViewById(R.id.datepost);
            holder.comment = (TextView) convertView.findViewById(R.id.comment);
            holder.imgAcc = (ImageView) convertView.findViewById(R.id.img_account1);
            holder.ratingBar = (RatingBar) convertView.findViewById(R.id.rb_1);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Comment comment = commentList.get(position);
        holder.txtTen.setText(comment.getName());
        holder.date.setText(comment.getDate().toString());
        holder.comment.setText(comment.getComment());
        holder.imgAcc.setImageResource(comment.getImg());
        holder.ratingBar.setRating(comment.getRating());
        return convertView;
    }
}

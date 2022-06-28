package com.example.tennis_booking;

import android.text.SpannableStringBuilder;

import java.util.Date;

public class Comment {
    private String name;
    private Date date;
    private SpannableStringBuilder comment = new SpannableStringBuilder();
    private int img;
    private int rating;

    public Comment(String name, Date date, SpannableStringBuilder comment, int img, int rating) {
        this.name = name;
        this.date = date;
        this.comment = comment;
        this.img = img;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SpannableStringBuilder getComment() {
        return comment;
    }

    public void setComment(SpannableStringBuilder comment) {
        this.comment = comment;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

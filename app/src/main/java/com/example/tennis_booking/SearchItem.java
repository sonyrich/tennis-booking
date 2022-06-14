package com.example.tennis_booking;

import android.graphics.drawable.Drawable;

public class SearchItem {
    public String searchName;
    public Drawable searchImg;

    public SearchItem(String searchName, Drawable searchImg) {
        this.searchName = searchName;
        this.searchImg = searchImg;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public Drawable getSearchImg() {
        return searchImg;
    }

    public void setSearchImg(Drawable searchImg) {
        this.searchImg = searchImg;
    }
}

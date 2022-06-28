package com.example.tennis_booking;

import android.graphics.drawable.Drawable;

public class CourtItem {

    public Drawable imgCourt;
    public Float ratingBar;
    public String courtName;
    public String courtDistance;
    public String courtDiscountPrice;
    public String courtPrice;
    public String ratingPoint;

    public CourtItem(Drawable imgCourt, Float ratingBar, String courtName, String courtDistance,String courtDiscountPrice, String courtPrice, String ratingPoint) {
        this.imgCourt = imgCourt;
        this.ratingBar = ratingBar;
        this.courtName = courtName;
        this.courtDistance = courtDistance;
        this.courtDiscountPrice = courtDiscountPrice;
        this.courtPrice = courtPrice;
        this.ratingPoint = ratingPoint;
    }

    public Drawable getImgCourt() {
        return imgCourt;
    }

    public void setImgCourt(Drawable imgCourt) {
        this.imgCourt = imgCourt;
    }

    public Float getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(Float ratingBar) {
        this.ratingBar = ratingBar;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getCourtDistance() {
        return courtDistance;
    }

    public String getCourtDiscountPrice() {
        return courtDiscountPrice;
    }

    public void setCourtDiscountPrice(String courtDiscountPrice) {
        this.courtDiscountPrice = courtDiscountPrice;
    }

    public void setCourtDistance(String courtDistance) {
        this.courtDistance = courtDistance;
    }

    public String getCourtPrice() {
        return courtPrice;
    }

    public void setCourtPrice(String courtPrice) {
        this.courtPrice = courtPrice;
    }

    public String getRatingPoint() {
        return ratingPoint;
    }

    public void setRatingPoint(String ratingPoint) {
        this.ratingPoint = ratingPoint;
    }
}

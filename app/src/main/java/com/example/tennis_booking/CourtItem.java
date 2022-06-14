package com.example.tennis_booking;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class CourtItem {

    public Drawable imgCourt;
    public String courtName;
    public String courtDistance;
    public String courtPrice;

    public CourtItem(Drawable imgCourt, String courtName, String courtDistance, String courtPrice) {
        this.imgCourt = imgCourt;
        this.courtName = courtName;
        this.courtDistance = courtDistance;
        this.courtPrice = courtPrice;
    }

    public Drawable getImgCourt() {
        return imgCourt;
    }

    public void setImgCourt(Drawable imgCourt) {
        this.imgCourt = imgCourt;
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

    public void setCourtDistance(String courtDistance) {
        this.courtDistance = courtDistance;
    }

    public String getCourtPrice() {
        return courtPrice;
    }

    public void setCourtPrice(String courtPrice) {
        this.courtPrice = courtPrice;
    }
}

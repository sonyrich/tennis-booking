package com.example.tennis_booking;

public class CouponItem {
    public String couponTitle;
    public String couponDesc;
    public String couponCourt;
    public String couponExp;

    public CouponItem(String couponTitle, String couponDesc, String couponCourt,String couponExp) {
        this.couponTitle = couponTitle;
        this.couponDesc = couponDesc;
        this.couponCourt = couponCourt;
        this.couponExp = couponExp;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getcouponDesc() {
        return couponDesc;
    }

    public void setcouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    public String getCouponCourt() {
        return couponCourt;
    }

    public void setCouponCourt(String couponCourt) {
        this.couponCourt = couponCourt;
    }

    public String getCouponExp() {
        return couponExp;
    }

    public void setCouponExp(String couponExp) {
        this.couponExp = couponExp;
    }
}

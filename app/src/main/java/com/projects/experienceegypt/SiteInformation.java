package com.projects.experienceegypt;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class SiteInformation {
    private String name;
    private String address;
    private String information_link;
    private int img_res;


    public SiteInformation(String name, String address, String information_link, int img_res) {
        this.name = name;
        this.address = address;
        this.information_link = information_link;
        this.img_res = img_res;
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInformation_link() {
        return information_link;
    }

    public void setInformation_link(String information_link) {
        this.information_link = information_link;
    }
}

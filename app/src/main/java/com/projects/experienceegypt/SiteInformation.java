package com.projects.experienceegypt;

public class SiteInformation {
    private String name;
    private String address;
    private String information_link;

    public SiteInformation(String name, String address, String information_link) {
        this.name = name;
        this.address = address;
        this.information_link = information_link;
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

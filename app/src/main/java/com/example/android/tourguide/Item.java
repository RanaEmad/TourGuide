package com.example.android.tourguide;

public class Item {

    private String name;
    private String image;
    public Item(String name, String image){
        this.name=name;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
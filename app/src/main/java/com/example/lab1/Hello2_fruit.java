package com.example.lab1;

public class Hello2_fruit {
    private String name;//给水果命名
    private int imageId;//水果图片ID

    //水果列表listview
    public Hello2_fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}

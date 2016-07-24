package com.omen.www.listview02;

/**
 * Created by lsx on 2016/7/24.
 */
public class Fruit {
    private String name;
    private int ImageId;

    public Fruit(String name,int imageId ) {
        this.ImageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getName() {
        return name;
    }
}

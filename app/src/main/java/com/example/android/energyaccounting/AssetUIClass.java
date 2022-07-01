package com.example.android.energyaccounting;

public class AssetUIClass {

    private int imageID;
    private String imageName;

    public AssetUIClass(int imageID, String imageName) {
        this.imageID = imageID;
        this.imageName = imageName;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}

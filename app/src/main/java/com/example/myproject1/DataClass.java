package com.example.myproject1;

public class DataClass {

    private String dataTitle;
    private String dataDesc;
    private String dataPrice;
    private String dataLoc;
    private String dataImage;

    private String key;
    public String getKey() {
        return key; }

    public void setKey(String key) { this.key = key; }
    public String getDataTitle() {
        return dataTitle;
    }
    public String getDataDesc() {
        return dataDesc;
    }
    public String getDataPrice() {
        return dataPrice;
    }
    public String getDataLoc() {
        return dataLoc;
    }
    public String getDataImage() {
        return dataImage;
    }
    public DataClass(String dataTitle, String dataDesc, String dataPrice, String dataLoc, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataPrice = dataPrice;
        this.dataLoc = dataLoc;
        this.dataImage = dataImage;
    }
    public DataClass() {

    }
}


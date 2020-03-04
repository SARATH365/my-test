package com.sarath.myapplication.pojo;

public class Catagory {

    String catogoryName;
    String catogoryId;

    public Catagory(String menuCategory, String menuCategoryId)
    {
        this.catogoryName=menuCategory;
        this.catogoryId=menuCategoryId;
    }


    public String getCatogoryName() {
        return catogoryName;
    }

    public void setCatogoryName(String catogoryName) {
        this.catogoryName = catogoryName;

    }


}


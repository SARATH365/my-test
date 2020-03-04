package com.sarath.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableMenuList {

    @SerializedName("menu_category")
    @Expose
    private String menuCategory;
    @SerializedName("menu_category_id")
    @Expose
    private String menuCategoryId;
    @SerializedName("menu_category_image")
    @Expose
    private String menuCategoryImage;
    @SerializedName("nexturl")
    @Expose
    private String nexturl;
    @SerializedName("category_dishes")
    @Expose
    private List<CategoryDish> categoryDishes = null;

    public String getMenuCategory() {
        return menuCategory;
    }

    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }

    public String getMenuCategoryId() {
        return menuCategoryId;
    }

    public void setMenuCategoryId(String menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }

    public String getMenuCategoryImage() {
        return menuCategoryImage;
    }

    public void setMenuCategoryImage(String menuCategoryImage) {
        this.menuCategoryImage = menuCategoryImage;
    }

    public String getNexturl() {
        return nexturl;
    }

    public void setNexturl(String nexturl) {
        this.nexturl = nexturl;
    }

    public List<CategoryDish> getCategoryDishes() {
        return categoryDishes;
    }

    public void setCategoryDishes(List<CategoryDish> categoryDishes) {
        this.categoryDishes = categoryDishes;
    }

}

package com.sarath.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryDish {

    @SerializedName("dish_id")
    @Expose
    private String dishId;
    @SerializedName("dish_name")
    @Expose
    private String dishName;
    @SerializedName("dish_price")
    @Expose
    private float dishPrice;
    @SerializedName("dish_image")
    @Expose
    private String dishImage;
    @SerializedName("dish_currency")
    @Expose
    private String dishCurrency;
    @SerializedName("dish_calories")
    @Expose
    private float dishCalories;
    @SerializedName("dish_description")
    @Expose
    private String dishDescription;
    @SerializedName("dish_Availability")
    @Expose
    private boolean dishAvailability;
    @SerializedName("dish_Type")
    @Expose
    private int dishType;
    @SerializedName("nexturl")
    @Expose
    private String nexturl;
    @SerializedName("addonCat")
    @Expose
    private List<AddonCat> addonCat = null;

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public float getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(float dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishImage() {
        return dishImage;
    }

    public void setDishImage(String dishImage) {
        this.dishImage = dishImage;
    }

    public String getDishCurrency() {
        return dishCurrency;
    }

    public void setDishCurrency(String dishCurrency) {
        this.dishCurrency = dishCurrency;
    }

    public float getDishCalories() {
        return dishCalories;
    }

    public void setDishCalories(float dishCalories) {
        this.dishCalories = dishCalories;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public boolean isDishAvailability() {
        return dishAvailability;
    }

    public void setDishAvailability(boolean dishAvailability) {
        this.dishAvailability = dishAvailability;
    }

    public int getDishType() {
        return dishType;
    }

    public void setDishType(int dishType) {
        this.dishType = dishType;
    }

    public String getNexturl() {
        return nexturl;
    }

    public void setNexturl(String nexturl) {
        this.nexturl = nexturl;
    }

    public List<AddonCat> getAddonCat() {
        return addonCat;
    }

    public void setAddonCat(List<AddonCat> addonCat) {
        this.addonCat = addonCat;
    }

}
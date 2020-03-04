package com.sarath.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Restaurant {

    @SerializedName("restaurant_id")
    @Expose
    private String restaurantId;
    @SerializedName("restaurant_name")
    @Expose
    private String restaurantName;
    @SerializedName("restaurant_image")
    @Expose
    private String restaurantImage;
    @SerializedName("table_id")
    @Expose
    private String tableId;
    @SerializedName("table_name")
    @Expose
    private String tableName;
    @SerializedName("branch_name")
    @Expose
    private String branchName;
    @SerializedName("nexturl")
    @Expose
    private String nexturl;
    @SerializedName("table_menu_list")
    @Expose
    private List<TableMenuList> tableMenuList = null;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(String restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getNexturl() {
        return nexturl;
    }

    public void setNexturl(String nexturl) {
        this.nexturl = nexturl;
    }

    public List<TableMenuList> getTableMenuList() {
        return tableMenuList;
    }

    public void setTableMenuList(List<TableMenuList> tableMenuList) {
        this.tableMenuList = tableMenuList;
    }

}

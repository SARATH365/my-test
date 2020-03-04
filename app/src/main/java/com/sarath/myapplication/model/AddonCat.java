package com.sarath.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddonCat {

    @SerializedName("addon_category")
    @Expose
    private String addonCategory;
    @SerializedName("addon_category_id")
    @Expose
    private String addonCategoryId;
    @SerializedName("addon_selection")
    @Expose
    private int addonSelection;
    @SerializedName("nexturl")
    @Expose
    private String nexturl;
    @SerializedName("addons")
    @Expose
    private List<Addon> addons = null;

    public String getAddonCategory() {
        return addonCategory;
    }

    public void setAddonCategory(String addonCategory) {
        this.addonCategory = addonCategory;
    }

    public String getAddonCategoryId() {
        return addonCategoryId;
    }

    public void setAddonCategoryId(String addonCategoryId) {
        this.addonCategoryId = addonCategoryId;
    }

    public int getAddonSelection() {
        return addonSelection;
    }

    public void setAddonSelection(int addonSelection) {
        this.addonSelection = addonSelection;
    }

    public String getNexturl() {
        return nexturl;
    }

    public void setNexturl(String nexturl) {
        this.nexturl = nexturl;
    }

    public List<Addon> getAddons() {
        return addons;
    }

    public void setAddons(List<Addon> addons) {
        this.addons = addons;
    }

}

package com.android.thememanager.model;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PageItem implements Serializable {
    public static final String AD_INFO_BUNDLE_KEY = "ad_info";
    private static final long serialVersionUID = 3;
    private int index;
    private String name;
    private int recommendMaxCol;
    private String resourceStamp;
    private int showType;
    private ItemType type;
    private String value;
    private List<RecommendItem> recommendItems = new ArrayList();
    private Bundle extraMeta = new Bundle();

    public static class ItemShowType {
        public static int SHOW_TYPE_SCROLL_BIT = 1;
    }

    public enum ItemType {
        UNKNOWN,
        SHOPWINDOW,
        BUTTON,
        WEBVIEWURL,
        WEBVIEWHTML,
        MESSAGE,
        PICTURE,
        EXCHANGE,
        HOTWORDS,
        MULTIPLEBUTTON,
        SHOPWINDOWNEW,
        MULTIPLESUBJECT,
        TITLENEW,
        HOTCOLORS,
        LOCALMULTIPLEBUTTON,
        ADTAG
    }

    public void addRecommendItem(RecommendItem recommendItem) {
        this.recommendItems.add(recommendItem);
    }

    public void clearRecommendItems() {
        this.recommendItems.clear();
    }

    public Bundle getExtraMeta() {
        return this.extraMeta;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public List<RecommendItem> getRecommendItems() {
        return this.recommendItems;
    }

    public int getRecommendMaxCol() {
        return this.recommendMaxCol;
    }

    public String getResourceStamp() {
        return this.resourceStamp;
    }

    public int getShowType() {
        return this.showType;
    }

    public ItemType getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setExtraMeta(Bundle extraMeta) {
        this.extraMeta = extraMeta;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecommendItems(List<RecommendItem> recommendItems) {
        this.recommendItems = recommendItems;
    }

    public void setRecommendMaxCol(int recommendMaxCol) {
        this.recommendMaxCol = recommendMaxCol;
    }

    public void setResourceStamp(String resourceStamp) {
        this.resourceStamp = resourceStamp;
    }

    public void setShowType(int showType) {
        this.showType = showType;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

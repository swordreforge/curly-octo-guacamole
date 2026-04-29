package com.android.thememanager.v9.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class UILink implements Serializable {
    public static final String EXTERNAL_HREF = "EXTERNAL_HREF";
    public static final String HREF = "HREF";
    public static final String NONE = "NONE";
    public static final String PRODUCT_DETAIL = "PRODUCT_DETAIL";
    public static final String SEARCH = "SEARCH";
    public static final String SUBJECT = "SUBJECT";
    public static final String UI_PAGE = "UI_PAGE";
    public static final String UI_SEARCH = "UI_SEARCH";
    private static final long serialVersionUID = 1;
    public String adTagId;
    public String link;
    public String productType;
    public String title;
    public String trackId;
    public String type;

    public String toString() {
        return "UILink{link = " + this.link + ", type = " + this.type + ", title = " + this.title + ", tagId = " + this.adTagId + ", trackId = " + this.trackId + "}";
    }
}

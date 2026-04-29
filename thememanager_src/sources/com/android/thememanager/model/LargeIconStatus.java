package com.android.thememanager.model;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconStatus {
    public static final int LARGE_STATUS_DEFAULT = 0;
    public static final int LARGE_STATUS_DOWNLAODING = 1;
    public boolean hasBought;
    public String id;
    public boolean selected;
    public int status;

    public LargeIconStatus(String id, boolean selected, int status, boolean hasBought) {
        this.id = id;
        this.selected = selected;
        this.status = status;
        this.hasBought = hasBought;
    }
}

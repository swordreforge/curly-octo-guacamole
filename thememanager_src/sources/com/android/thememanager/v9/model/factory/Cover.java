package com.android.thememanager.v9.model.factory;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class Cover implements Serializable {
    public static final int DYNAMIC_VIDEO_WALLPAPER = 7;
    public static final int EXTERNAL_COVER = 10;
    public static final int FAVORITE_COVER = 8;
    public static final int MIWALLPAPER = 5;
    public static final int MY_COVER = 9;
    public static final int NORMAL_ONLINE_COVER = 0;
    public static final int PHOTO_COVER = 2;
    public static final int PRECUST_ONLINE_COVER = 1;
    public static final int RECENTLY_COVER = 3;
    public static final int SYSTEM_COVER = 4;
    public static final int VIDEO_WALLPAPER = 6;
    private static final long serialVersionUID = 2;
    public String cover;
    public String displayCount;
    public String imageUrl;
    public String name;
    private int type;
    public String uuid;

    public Cover(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
}

package com.android.thememanager.v9.model;

import com.android.thememanager.v9.model.factory.UIBullet;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIPage implements Serializable {
    public static final String FONT = "FONT";
    public static final String FONT_CATEGORY = "FONT_CATEGORY";
    public static final String HOME_PAGE = "HOME_PAGE";
    public static final String HYBRID = "HYBRID";
    public static final String LIVE_WALLPAPER = "LIVE_WALLPAPER";
    public static final String RESOURCE_CATEGORY = "RESOURCE_CATEGORY";
    public static final String RINGTONE = "RINGTONE";
    public static final String RINGTONE_CATEGORY = "RINGTONE_CATEGORY";
    public static final String THEME = "THEME";
    public static final String THEME_CATEGORY = "THEME_CATEGORY";
    public static final String VIDEO_WALLPAPER = "VIDEO_WALLPAPER";
    public static final String WALLPAPER = "WALLPAPER";
    public static final String WALLPAPER_CATEGORY = "WALLPAPER_CATEGORY";
    private static final long serialVersionUID = 2;
    public List<String> adTagIds;
    public String background;
    public List<UIBullet> bullets;
    public List<UICard> cards;
    public String category;
    public boolean hasMore;
    public String name;
    public List<String> tabPageUuids;
    public List<String> tabTitles;
    public String title;
    public String uuid;
}

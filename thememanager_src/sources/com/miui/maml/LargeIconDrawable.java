package com.miui.maml;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class LargeIconDrawable extends MamlDrawable {
    public static final String DRAWABLE_TYPE_ANIMATING = "animating_icons";
    public static final String DRAWABLE_TYPE_FANCY = "fancy_icons";
    public static final String DRAWABLE_TYPE_LAYER_ANIMATING = "layer_animating_icons";
    public static final String DRAWABLE_TYPE_PAIR = "pair";
    public static final String DRAWABLE_TYPE_RES = "res";
    private int enableIconMask;
    private int isPairApp;
    private String localId;
    private String mActivityName;
    private Drawable mDrawable;
    private String mDrawableType;
    private String mPackageName;
    private String mType;
    private String uuid;

    public String getActivityName() {
        return this.mActivityName;
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public String getDrawableType() {
        return this.mDrawableType;
    }

    public int getEnableIconMask() {
        return this.enableIconMask;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getType() {
        return this.mType;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int isPairApp() {
        return this.isPairApp;
    }

    public void setActivityName(String str) {
        this.mActivityName = str;
    }

    public void setDrawable(Drawable drawable) {
        this.mDrawable = drawable;
    }

    public void setDrawableType(String str) {
        this.mDrawableType = str;
    }

    public void setEnableIconMask(int i2) {
        this.enableIconMask = i2;
    }

    public void setLocalId(String str) {
        this.localId = str;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setPairApp(int i2) {
        this.isPairApp = i2;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}

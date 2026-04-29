package com.android.thememanager.model;

/* JADX INFO: loaded from: classes2.dex */
public interface CleanMessage {
    public static final int MSG_TYPE_HEAVY_CLEAN = 1;
    public static final int MSG_TYPE_LIGHT_CLEAN = 0;
    public static final int MSG_TYPE_ON_DESTROY_CLEAN = 4;
    public static final int MSG_TYPE_ON_PAUSE_CLEAN = 2;
    public static final int MSG_TYPE_ON_STOP_CLEAN = 3;

    void onClean(int cleanMsg);
}

package com.android.thememanager.basemodule.local;

import com.android.thememanager.basemodule.local.ld6;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.local.y */
/* JADX INFO: compiled from: ResourceDownloadListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1755y {
    void handleDownloadComplete(String downloadPath, String taskId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras);

    void handleDownloadProgressUpdate(String downloadPath, String taskId, String extraData, int currBytes, int totalBytes);

    void handleDownloadStatusChange(String downloadPath, String taskId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes);
}

package com.android.thememanager.detail.video.model;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoResource {
    String getDisplayName();

    String getDownloadFileName();

    String getDownloadFilePath();

    String getDownloadTaskId();

    String getDownloadUrl();

    String getExtraTag();

    long getOriginFileSizeBytes();

    Uri getPreviewUri();

    boolean isDownloaded();

    boolean isStoragePath();
}

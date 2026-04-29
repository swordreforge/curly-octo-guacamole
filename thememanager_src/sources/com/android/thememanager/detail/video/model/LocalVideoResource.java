package com.android.thememanager.detail.video.model;

import android.net.Uri;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import java.io.File;
import miuix.core.util.C7083n;

/* JADX INFO: loaded from: classes2.dex */
public class LocalVideoResource implements VideoResource {
    private final String mDownloadFileName;
    private String mMimeType;
    private final String mPath;
    private String mVideoType;

    public LocalVideoResource(String path) {
        this.mPath = path;
        this.mDownloadFileName = C7083n.m25584g(path);
        VideoWallpaperUtils.getMimeType(this, path);
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDisplayName() {
        return this.mDownloadFileName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadFileName() {
        return this.mDownloadFileName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadFilePath() {
        if (isStoragePath()) {
            return this.mPath;
        }
        return C1788k.f10167c + this.mDownloadFileName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadTaskId() {
        return null;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadUrl() {
        return null;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getExtraTag() {
        return null;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public long getOriginFileSizeBytes() {
        return -1L;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public Uri getPreviewUri() {
        return Uri.fromFile(new File(getDownloadFilePath()));
    }

    public String getVideoType() {
        return this.mVideoType;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public boolean isDownloaded() {
        return true;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public boolean isStoragePath() {
        String str = this.mPath;
        return str != null && str.startsWith("/");
    }

    public void setMimeType(String type) {
        this.mMimeType = type;
    }

    public void setVideoType(String type) {
        this.mVideoType = type;
    }
}

package com.android.thememanager.detail.video.model;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.toq;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import java.io.File;
import miuix.core.util.C7083n;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteVideoResource implements VideoResource {
    private final String mDisplayName;
    private final String mDownloadFileName;
    private final String mDownloadUrl;
    private final long mOriginFileSizeBytes;
    private final String mPreviewUrl;
    private final String mTag;

    public RemoteVideoResource(String url, String previewUrl, String displayName, String onlineId, long fileSizeBytes, String tag) {
        this.mDownloadFileName = displayName + toq.n96 + onlineId + ((tag == null || !tag.contains(VideoInfoUtils.VIDEO_PRECUST) || tag.contains("loop")) ? "" : "-noLoop");
        this.mDownloadUrl = url;
        this.mPreviewUrl = previewUrl;
        this.mDisplayName = displayName;
        this.mOriginFileSizeBytes = fileSizeBytes;
        this.mTag = tag;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDisplayName() {
        return this.mDisplayName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadFileName() {
        return this.mDownloadFileName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadFilePath() {
        return C1788k.f10167c + this.mDownloadFileName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadTaskId() {
        return this.mDownloadFileName;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getDownloadUrl() {
        return this.mDownloadUrl;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public String getExtraTag() {
        return this.mTag;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public long getOriginFileSizeBytes() {
        return this.mOriginFileSizeBytes;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public Uri getPreviewUri() {
        return Uri.parse(TextUtils.isEmpty(this.mPreviewUrl) ? this.mDownloadUrl : this.mPreviewUrl);
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public boolean isDownloaded() {
        File file = new File(getDownloadFilePath());
        boolean z2 = file.exists() && file.length() == getOriginFileSizeBytes();
        if (z2) {
            return z2;
        }
        File file2 = new File(C1788k.f10167c + C7083n.m25584g(this.mDownloadUrl));
        boolean z3 = file2.exists() && file2.length() == getOriginFileSizeBytes();
        if (z3) {
            file2.renameTo(file);
        }
        return z3;
    }

    @Override // com.android.thememanager.detail.video.model.VideoResource
    public boolean isStoragePath() {
        return false;
    }
}

package com.android.thememanager.ad.advideo;

import android.content.Context;
import com.android.thememanager.ad.C1656y;
import com.android.thememanager.ad.model.VideoAdResponse;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;

/* JADX INFO: renamed from: com.android.thememanager.ad.advideo.q */
/* JADX INFO: compiled from: StaggerAdVideoLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C1645q extends C1644k<VideoAdResponse> {

    /* JADX INFO: renamed from: k */
    private String f9494k;

    public C1645q(Context context, String info) {
        super(context);
        this.f9494k = info;
        onContentChanged();
    }

    @Override // com.android.thememanager.ad.advideo.C1644k, android.content.AsyncTaskLoader
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public VideoAdResponse loadInBackground() {
        VideoAdResponse videoAdResponse = new VideoAdResponse();
        videoAdResponse.defaultAdInfo = null;
        String str = this.f9494k;
        videoAdResponse.adInfo = str;
        AdInfo adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(str);
        if (adInfoCheckAndGetAdInfo != null) {
            C1656y.m6535k(adInfoCheckAndGetAdInfo.videoUrl, videoAdResponse);
        }
        return videoAdResponse;
    }
}

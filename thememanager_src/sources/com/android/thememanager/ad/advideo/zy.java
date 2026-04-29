package com.android.thememanager.ad.advideo;

import android.content.Context;
import android.util.Log;
import com.android.thememanager.ad.C1656y;
import com.android.thememanager.ad.model.VideoAdResponse;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.ld6;
import com.google.gson.C4871g;

/* JADX INFO: compiled from: EncourageAdVideoLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends C1644k<VideoAdResponse> {

    /* JADX INFO: renamed from: k */
    private Resource f9496k;

    public zy(Context context, Resource resource) {
        super(context);
        this.f9496k = resource;
        onContentChanged();
    }

    @Override // com.android.thememanager.ad.advideo.C1644k, android.content.AsyncTaskLoader
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public VideoAdResponse loadInBackground() {
        Exception e2;
        VideoAdResponse videoAdResponse;
        try {
            videoAdResponse = (VideoAdResponse) new C4871g().n7h(C1915g.f7l8(ld6.gvn7(this.f9496k.getOnlineId())), VideoAdResponse.class);
            try {
                AdInfo adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(videoAdResponse.adInfo);
                C1656y.m6535k(adInfoCheckAndGetAdInfo != null ? adInfoCheckAndGetAdInfo.videoUrl : videoAdResponse.defaultAdInfo.videoUrl, videoAdResponse);
            } catch (Exception e3) {
                e2 = e3;
                Log.w(zy.class.getSimpleName(), "EncourageAdVideoLoader happens error = " + e2);
            }
        } catch (Exception e4) {
            e2 = e4;
            videoAdResponse = null;
        }
        return videoAdResponse;
    }
}

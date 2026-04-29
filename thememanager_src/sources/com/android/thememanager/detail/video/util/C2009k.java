package com.android.thememanager.detail.video.util;

import android.util.ArrayMap;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.local.zy;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.router.detail.entity.VideoInfo;

/* JADX INFO: renamed from: com.android.thememanager.detail.video.util.k */
/* JADX INFO: compiled from: DownloadEventUploadWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2009k implements com.android.thememanager.basemodule.local.zy, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: k */
    private final com.android.thememanager.basemodule.local.zy f11465k;

    /* JADX INFO: renamed from: q */
    private final VideoInfo f11466q;

    public C2009k(com.android.thememanager.basemodule.local.zy wrapper, VideoInfo videoInfo) {
        this.f11465k = wrapper;
        this.f11466q = videoInfo;
    }

    @Override // com.android.thememanager.basemodule.local.zy
    /* JADX INFO: renamed from: k */
    public void mo6857k() {
        String str;
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.irh));
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("name", this.f11466q.name);
        arrayMapM6679k.put("entryType", f7l8.m6607g());
        arrayMapM6679k.put("resourceType", "videowallpaper");
        arrayMapM6679k.put("productId", this.f11466q.onlineId);
        VideoInfo videoInfo = this.f11466q;
        String str2 = videoInfo.trackId;
        if (str2 == null) {
            str2 = videoInfo.onlineId;
        }
        if (C1807g.zurt()) {
            str = "sensor".equals(this.f11466q.videoType) ? com.android.thememanager.basemodule.analysis.toq.goq : com.android.thememanager.basemodule.analysis.toq.h7;
            arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.wtm, C1807g.m7083t(bf2.toq.toq()) ? com.android.thememanager.basemodule.analysis.toq.vj : com.android.thememanager.basemodule.analysis.toq.kqdm);
        } else {
            str = com.android.thememanager.basemodule.analysis.toq.h7;
        }
        C1708s.f7l8().ld6().dd(C1706p.m6650h(str, str2, null, com.android.thememanager.basemodule.analysis.toq.irh, arrayMapM6679k));
        kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.h7, this.f11466q.trackId, com.android.thememanager.basemodule.analysis.toq.irh);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.h7, this.f11466q.trackId, com.android.thememanager.basemodule.analysis.toq.irh));
        this.f11465k.mo6857k();
    }

    @Override // com.android.thememanager.basemodule.local.zy
    /* JADX INFO: renamed from: n */
    public void mo6858n() {
        kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.h7, this.f11466q.trackId, com.android.thememanager.basemodule.analysis.toq.thtw);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.h7, this.f11466q.trackId, com.android.thememanager.basemodule.analysis.toq.thtw));
        this.f11465k.mo6858n();
    }

    @Override // com.android.thememanager.basemodule.local.zy
    /* JADX INFO: renamed from: q */
    public void mo6859q() {
        kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.h7, this.f11466q.trackId, com.android.thememanager.basemodule.analysis.toq.vd);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.h7, this.f11466q.trackId, com.android.thememanager.basemodule.analysis.toq.vd));
        this.f11465k.mo6859q();
    }

    @Override // com.android.thememanager.basemodule.local.zy
    public void toq(zy.InterfaceC1756k listener) {
        this.f11465k.toq(listener);
    }
}

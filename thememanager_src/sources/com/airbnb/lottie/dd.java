package com.airbnb.lottie;

import android.graphics.Bitmap;
import zy.uv6;

/* JADX INFO: compiled from: LottieImageAsset.java */
/* JADX INFO: loaded from: classes.dex */
public class dd {

    /* JADX INFO: renamed from: g */
    @zy.dd
    private Bitmap f7927g;

    /* JADX INFO: renamed from: k */
    private final int f7928k;

    /* JADX INFO: renamed from: n */
    private final String f7929n;

    /* JADX INFO: renamed from: q */
    private final String f7930q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f55944toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f55945zy;

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public dd(int i2, int i3, String str, String str2, String str3) {
        this.f7928k = i2;
        this.f55944toq = i3;
        this.f55945zy = str;
        this.f7930q = str2;
        this.f7929n = str3;
    }

    public boolean f7l8() {
        return this.f7927g != null || (this.f7930q.startsWith("data:") && this.f7930q.indexOf("base64,") > 0);
    }

    /* JADX INFO: renamed from: g */
    public int m5954g() {
        return this.f7928k;
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public Bitmap m5955k() {
        return this.f7927g;
    }

    /* JADX INFO: renamed from: n */
    public String m5956n() {
        return this.f55945zy;
    }

    /* JADX INFO: renamed from: q */
    public int m5957q() {
        return this.f55944toq;
    }

    public String toq() {
        return this.f7929n;
    }

    /* JADX INFO: renamed from: y */
    public void m5958y(@zy.dd Bitmap bitmap) {
        this.f7927g = bitmap;
    }

    public String zy() {
        return this.f7930q;
    }
}

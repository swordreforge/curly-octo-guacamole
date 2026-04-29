package com.android.thememanager.clockmessage.model;

/* JADX INFO: renamed from: com.android.thememanager.clockmessage.model.k */
/* JADX INFO: compiled from: ClockMessage.java */
/* JADX INFO: loaded from: classes.dex */
public class C1873k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57851f7l8 = "post";

    /* JADX INFO: renamed from: g */
    public static final String f10652g = "activity";

    /* JADX INFO: renamed from: n */
    public static final String f10653n = "hide";

    /* JADX INFO: renamed from: y */
    public static final String f10654y = "feed";

    /* JADX INFO: renamed from: k */
    public String f10655k;

    /* JADX INFO: renamed from: q */
    public long f10656q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f57852toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public String f57853zy;

    public static C1873k toq() {
        C1873k c1873k = new C1873k();
        c1873k.f10655k = "hide";
        c1873k.f57852toq = 0;
        c1873k.f57853zy = "";
        c1873k.f10656q = System.currentTimeMillis();
        return c1873k;
    }

    /* JADX INFO: renamed from: k */
    public boolean m7389k() {
        return "post".equals(this.f10655k) || f10654y.equals(this.f10655k);
    }
}

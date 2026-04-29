package com.android.thememanager;

import miuix.provider.C7317k;

/* JADX INFO: compiled from: WallpaperSettingInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class n5r1 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60583zy = "-";

    /* JADX INFO: renamed from: k */
    private String f13427k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f60584toq;

    public n5r1(String setting) {
        m8408g(setting);
    }

    /* JADX INFO: renamed from: g */
    private void m8408g(String setting) {
        if (p029m.zy.toq(setting)) {
            return;
        }
        String[] strArrSplit = setting.split("-");
        if (strArrSplit.length == 1) {
            this.f13427k = strArrSplit[0];
        } else if (strArrSplit.length > 1) {
            this.f13427k = strArrSplit[0];
            this.f60584toq = Long.parseLong(strArrSplit[1]);
        }
    }

    /* JADX INFO: renamed from: k */
    private static n5r1 m8409k(boolean isLockScreen) {
        return new n5r1(C7317k.k.m26508p(bf2.toq.toq().getContentResolver(), isLockScreen ? ncyb.f13432q : ncyb.f60592zy, ncyb.f60589qrj));
    }

    /* JADX INFO: renamed from: q */
    public static n5r1 m8410q(String type, boolean isLockScreen) {
        return new n5r1(type, zy(isLockScreen));
    }

    private static long zy(boolean isLockScreen) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis != m8409k(isLockScreen).toq()) {
            return jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis == Long.MAX_VALUE) {
            return 0L;
        }
        return jCurrentTimeMillis + 1;
    }

    /* JADX INFO: renamed from: n */
    public String m8411n() {
        return this.f13427k;
    }

    public String toString() {
        return this.f13427k + "-" + this.f60584toq;
    }

    public long toq() {
        return this.f60584toq;
    }

    private n5r1(String wallpaperType, long id) {
        this.f13427k = wallpaperType;
        this.f60584toq = id;
    }
}

package com.android.thememanager.basemodule.account;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.account.g */
/* JADX INFO: compiled from: UserInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class C1685g {

    /* JADX INFO: renamed from: k */
    public String f9637k;

    /* JADX INFO: renamed from: n */
    public String f9638n;

    /* JADX INFO: renamed from: q */
    public String f9639q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f57421toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public String f57422zy;

    /* JADX INFO: renamed from: k */
    public static boolean m6574k(C1685g l2, C1685g r2) {
        if (l2 == null && r2 == null) {
            return true;
        }
        if (l2 == null || r2 == null) {
            return false;
        }
        return l2.equals(r2);
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof C1685g)) {
            return false;
        }
        C1685g c1685g = (C1685g) o2;
        return TextUtils.equals(this.f9637k, c1685g.f9637k) && TextUtils.equals(this.f57421toq, c1685g.f57421toq) && TextUtils.equals(this.f57422zy, c1685g.f57422zy) && TextUtils.equals(this.f9639q, c1685g.f9639q);
    }
}

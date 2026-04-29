package com.xiaomi.accountsdk.utils;

import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: MiuiVersionDev.java */
/* JADX INFO: loaded from: classes3.dex */
public class zurt implements Comparable<zurt> {

    /* JADX INFO: renamed from: g */
    private static volatile zurt f31066g;

    /* JADX INFO: renamed from: y */
    private static final Pattern f31067y = Pattern.compile("^(\\d)\\.(\\d{1,2})\\.(\\d{1,2})$");

    /* JADX INFO: renamed from: k */
    public final int f31068k;

    /* JADX INFO: renamed from: n */
    public final int f31069n;

    /* JADX INFO: renamed from: q */
    public final int f31070q;

    public zurt(int i2, int i3, int i4) {
        this.f31068k = i2;
        this.f31070q = i3;
        this.f31069n = i4;
    }

    /* JADX INFO: renamed from: n */
    private int m19166n() {
        return this.f31069n + (this.f31070q * 100) + (this.f31068k * 10000);
    }

    /* JADX INFO: renamed from: q */
    public static zurt m19167q() {
        if (f31066g != null) {
            return f31066g;
        }
        String str = Build.VERSION.INCREMENTAL;
        if (str == null) {
            return null;
        }
        Matcher matcher = f31067y.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        zurt zurtVar = new zurt(Integer.valueOf(matcher.group(1)).intValue(), Integer.valueOf(matcher.group(2)).intValue(), Integer.valueOf(matcher.group(3)).intValue());
        f31066g = zurtVar;
        return zurtVar;
    }

    public static boolean zy(zurt zurtVar, boolean z2) {
        zurt zurtVarM19167q = m19167q();
        return zurtVarM19167q == null ? z2 : zurtVarM19167q.compareTo(zurtVar) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zurt)) {
            return false;
        }
        zurt zurtVar = (zurt) obj;
        return this.f31068k == zurtVar.f31068k && this.f31070q == zurtVar.f31070q && this.f31069n == zurtVar.f31069n;
    }

    public int hashCode() {
        return (((this.f31068k * 31) + this.f31070q) * 31) + this.f31069n;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(zurt zurtVar) {
        if (zurtVar != null) {
            return m19166n() - zurtVar.m19166n();
        }
        throw new IllegalArgumentException("another == null");
    }
}

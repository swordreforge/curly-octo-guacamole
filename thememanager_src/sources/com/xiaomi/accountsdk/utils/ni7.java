package com.xiaomi.accountsdk.utils;

import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: MiuiVersionStable.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 implements Comparable<ni7> {

    /* JADX INFO: renamed from: g */
    private static final Pattern f31047g = Pattern.compile("^V(\\d+)\\.(\\d+)\\.\\d+\\.\\d+\\.[A-Z]{7}$");

    /* JADX INFO: renamed from: n */
    private static volatile ni7 f31048n;

    /* JADX INFO: renamed from: k */
    public final int f31049k;

    /* JADX INFO: renamed from: q */
    public final int f31050q;

    public ni7(int i2, int i3) {
        this.f31049k = i2;
        this.f31050q = i3;
    }

    /* JADX INFO: renamed from: n */
    private int m19120n() {
        return (this.f31049k * 100) + this.f31050q;
    }

    /* JADX INFO: renamed from: q */
    public static ni7 m19121q() {
        if (f31048n != null) {
            return f31048n;
        }
        String str = Build.VERSION.INCREMENTAL;
        if (str == null) {
            return null;
        }
        Matcher matcher = f31047g.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        ni7 ni7Var = new ni7(Integer.valueOf(matcher.group(1)).intValue(), Integer.valueOf(matcher.group(2)).intValue());
        f31048n = ni7Var;
        return ni7Var;
    }

    public static boolean zy(ni7 ni7Var, boolean z2) {
        ni7 ni7VarM19121q = m19121q();
        return ni7VarM19121q == null ? z2 : ni7VarM19121q.compareTo(ni7Var) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni7)) {
            return false;
        }
        ni7 ni7Var = (ni7) obj;
        return this.f31049k == ni7Var.f31049k && this.f31050q == ni7Var.f31050q;
    }

    public int hashCode() {
        return (this.f31049k * 31) + this.f31050q;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(ni7 ni7Var) {
        if (ni7Var != null) {
            return m19120n() - ni7Var.m19120n();
        }
        throw new IllegalArgumentException("another == null");
    }
}

package com.xiaomi.analytics.internal;

import com.xiaomi.onetrack.util.C5814z;

/* JADX INFO: renamed from: com.xiaomi.analytics.internal.n */
/* JADX INFO: compiled from: Version.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5605n implements Comparable<C5605n> {

    /* JADX INFO: renamed from: k */
    public int f31171k;

    /* JADX INFO: renamed from: n */
    public int f31172n;

    /* JADX INFO: renamed from: q */
    public int f31173q;

    public C5605n(int i2, int i3, int i4) {
        this.f31171k = i2;
        this.f31173q = i3;
        this.f31172n = i4;
    }

    public String toString() {
        return this.f31171k + "." + this.f31173q + "." + this.f31172n;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5605n c5605n) {
        if (c5605n == null) {
            return 1;
        }
        int i2 = this.f31171k;
        int i3 = c5605n.f31171k;
        if (i2 != i3) {
            return i2 - i3;
        }
        int i4 = this.f31173q;
        int i5 = c5605n.f31173q;
        return i4 != i5 ? i4 - i5 : this.f31172n - c5605n.f31172n;
    }

    public boolean zy(C5605n c5605n) {
        return c5605n != null && this.f31171k == c5605n.f31171k && this.f31173q == c5605n.f31173q;
    }

    public C5605n(String str) {
        this.f31171k = 1;
        this.f31173q = 0;
        this.f31172n = 0;
        try {
            String[] strArrSplit = str.split(C5814z.f32495a);
            this.f31171k = Integer.parseInt(strArrSplit[0]);
            this.f31173q = Integer.parseInt(strArrSplit[1]);
            this.f31172n = Integer.parseInt(strArrSplit[2]);
        } catch (Exception unused) {
        }
    }
}

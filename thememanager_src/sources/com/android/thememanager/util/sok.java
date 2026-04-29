package com.android.thememanager.util;

import com.android.thememanager.settings.C2687z;

/* JADX INFO: compiled from: Triple.java */
/* JADX INFO: loaded from: classes2.dex */
public class sok<F, S, T> {

    /* JADX INFO: renamed from: k */
    public final F f16799k;

    /* JADX INFO: renamed from: q */
    public C2687z.k f16800q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final S f61413toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final T f61414zy;

    public sok(F first, S second, T third) {
        this(first, second, third, null);
    }

    /* JADX INFO: renamed from: k */
    public static <F, S, T> sok<F, S, T> m9995k(F f2, S s2, T t2) {
        return new sok<>(f2, s2, t2);
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof sok)) {
            return false;
        }
        sok sokVar = (sok) o2;
        return this.f16799k.equals(sokVar.f16799k) && this.f61413toq.equals(sokVar.f61413toq) && this.f61414zy.equals(sokVar.f61414zy);
    }

    public int hashCode() {
        F f2 = this.f16799k;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s2 = this.f61413toq;
        int iHashCode2 = iHashCode ^ (s2 == null ? 0 : s2.hashCode());
        T t2 = this.f61414zy;
        return iHashCode2 ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Triple{" + this.f16799k + " " + this.f61413toq + " " + this.f61414zy + "}";
    }

    public sok(F first, S second, T third, C2687z.k paras) {
        this.f16799k = first;
        this.f61413toq = second;
        this.f61414zy = third;
        this.f16800q = paras;
    }
}

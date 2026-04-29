package com.android.thememanager.util;

/* JADX INFO: compiled from: Tuple3.java */
/* JADX INFO: loaded from: classes2.dex */
public class cfr<T1, T2, T3> {

    /* JADX INFO: renamed from: k */
    public final T1 f16370k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final T2 f61217toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final T3 f61218zy;

    public cfr(T1 first, T2 second, T3 third) {
        this.f16370k = first;
        this.f61217toq = second;
        this.f61218zy = third;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m9664k(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof cfr)) {
            return false;
        }
        cfr cfrVar = (cfr) o2;
        return m9664k(cfrVar.f16370k, this.f16370k) && m9664k(cfrVar.f61217toq, this.f61217toq) && m9664k(cfrVar.f61218zy, this.f61218zy);
    }

    public int hashCode() {
        T1 t1 = this.f16370k;
        int iHashCode = t1 == null ? 0 : t1.hashCode();
        T2 t2 = this.f61217toq;
        int iHashCode2 = iHashCode ^ (t2 == null ? 0 : t2.hashCode());
        T3 t3 = this.f61218zy;
        return iHashCode2 ^ (t3 != null ? t3.hashCode() : 0);
    }
}

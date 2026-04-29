package androidx.core.util;

import zy.lvui;

/* JADX INFO: renamed from: androidx.core.util.p */
/* JADX INFO: compiled from: Pair.java */
/* JADX INFO: loaded from: classes.dex */
public class C0639p<F, S> {

    /* JADX INFO: renamed from: k */
    public final F f3889k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final S f50633toq;

    public C0639p(F f2, S s2) {
        this.f3889k = f2;
        this.f50633toq = s2;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static <A, B> C0639p<A, B> m2981k(A a2, B b2) {
        return new C0639p<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0639p)) {
            return false;
        }
        C0639p c0639p = (C0639p) obj;
        return C0642s.m2985k(c0639p.f3889k, this.f3889k) && C0642s.m2985k(c0639p.f50633toq, this.f50633toq);
    }

    public int hashCode() {
        F f2 = this.f3889k;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s2 = this.f50633toq;
        return iHashCode ^ (s2 != null ? s2.hashCode() : 0);
    }

    @lvui
    public String toString() {
        return "Pair{" + this.f3889k + " " + this.f50633toq + "}";
    }
}

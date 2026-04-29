package com.airbnb.lottie.model;

import androidx.core.util.C0639p;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.model.s */
/* JADX INFO: compiled from: MutablePair.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class C1473s<T> {

    /* JADX INFO: renamed from: k */
    @dd
    T f8091k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    T f56107toq;

    /* JADX INFO: renamed from: k */
    private static boolean m6094k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0639p)) {
            return false;
        }
        C0639p c0639p = (C0639p) obj;
        return m6094k(c0639p.f3889k, this.f8091k) && m6094k(c0639p.f50633toq, this.f56107toq);
    }

    public int hashCode() {
        T t2 = this.f8091k;
        int iHashCode = t2 == null ? 0 : t2.hashCode();
        T t3 = this.f56107toq;
        return iHashCode ^ (t3 != null ? t3.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f8091k + " " + this.f56107toq + "}";
    }

    public void toq(T t2, T t3) {
        this.f8091k = t2;
        this.f56107toq = t3;
    }
}

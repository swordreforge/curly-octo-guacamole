package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: renamed from: com.google.common.collect.t */
/* JADX INFO: compiled from: CollectPreconditions.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class C4524t {
    C4524t() {
    }

    /* JADX INFO: renamed from: k */
    static void m15983k(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: n */
    static void m15984n(boolean z2) {
        com.google.common.base.jk.y9n(z2, "no calls to next() since the last call to remove()");
    }

    /* JADX INFO: renamed from: q */
    static void m15985q(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i2);
    }

    @CanIgnoreReturnValue
    static int toq(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    @CanIgnoreReturnValue
    static long zy(long j2, String str) {
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j2);
    }
}

package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class m2t {
    private m2t() {
    }

    static <E> Set<E> f7l8() {
        return a9.create();
    }

    /* JADX INFO: renamed from: g */
    static <E> Set<E> m15826g(int i2) {
        return jp0y.createWithExpectedSize(i2);
    }

    /* JADX INFO: renamed from: k */
    static <T> T[] m15827k(Object[] objArr, int i2, int i3, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i2, i3, tArr.getClass());
    }

    static e5 ld6(e5 e5Var) {
        return e5Var.x2();
    }

    /* JADX INFO: renamed from: n */
    static <K, V> Map<K, V> m15828n(int i2) {
        return fti.createWithExpectedSize(i2);
    }

    /* JADX INFO: renamed from: p */
    static int m15829p(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: q */
    static <E> Set<E> m15830q(int i2) {
        return a9.createWithExpectedSize(i2);
    }

    /* JADX INFO: renamed from: s */
    static int m15831s(int i2) {
        return i2;
    }

    static <T> T[] toq(T[] tArr, int i2) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
    }

    /* JADX INFO: renamed from: y */
    static <K, V> Map<K, V> m15832y() {
        return jk.create();
    }

    static <K, V> Map<K, V> zy(int i2) {
        return jk.createWithExpectedSize(i2);
    }
}

package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ObjectArrays.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class r25n {
    private r25n() {
    }

    static Object[] f7l8(Object[] objArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, objArr.length);
        if (i3 == 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, i2, objArr2, 0, i3);
        return objArr2;
    }

    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static <T> T[] m15972g(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) m15977s(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    static Object m15973k(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i2);
    }

    static void ld6(Object[] objArr, int i2, int i3) {
        Object obj = objArr[i2];
        objArr[i2] = objArr[i3];
        objArr[i3] = obj;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T[] m15974n(T[] tArr, @NullableDecl T t2) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t2;
        return tArr2;
    }

    static <T> T[] n7h(Object[] objArr, int i2, int i3, T[] tArr) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, objArr.length);
        if (tArr.length < i3) {
            tArr = (T[]) m15975p(tArr, i3);
        } else if (tArr.length > i3) {
            tArr[i3] = null;
        }
        System.arraycopy(objArr, i2, tArr, 0, i3);
        return tArr;
    }

    /* JADX INFO: renamed from: p */
    public static <T> T[] m15975p(T[] tArr, int i2) {
        return (T[]) m2t.toq(tArr, i2);
    }

    /* JADX INFO: renamed from: q */
    public static <T> T[] m15976q(@NullableDecl T t2, T[] tArr) {
        T[] tArr2 = (T[]) m15975p(tArr, tArr.length + 1);
        tArr2[0] = t2;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    static <T> T[] qrj(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) m15975p(tArr, size);
        }
        m15978y(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    @wlev.zy
    /* JADX INFO: renamed from: s */
    public static <T> T[] m15977s(Class<T> cls, int i2) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
    }

    @CanIgnoreReturnValue
    static Object[] toq(Object... objArr) {
        return zy(objArr, objArr.length);
    }

    static Object[] x2(Collection<?> collection) {
        return m15978y(collection, new Object[collection.size()]);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    private static Object[] m15978y(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    @CanIgnoreReturnValue
    static Object[] zy(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            m15973k(objArr[i3], i3);
        }
        return objArr;
    }
}

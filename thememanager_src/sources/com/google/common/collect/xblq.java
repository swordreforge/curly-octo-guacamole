package com.google.common.collect;

import com.google.common.math.C4723q;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: TopKSelector.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class xblq<T> {

    /* JADX INFO: renamed from: k */
    private final int f26695k;

    /* JADX INFO: renamed from: n */
    @NullableDecl
    private T f26696n;

    /* JADX INFO: renamed from: q */
    private int f26697q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Comparator<? super T> f68236toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final T[] f68237zy;

    private xblq(Comparator<? super T> comparator, int i2) {
        this.f68236toq = (Comparator) com.google.common.base.jk.fti(comparator, "comparator");
        this.f26695k = i2;
        com.google.common.base.jk.ld6(i2 >= 0, "k must be nonnegative, was %s", i2);
        this.f68237zy = (T[]) new Object[i2 * 2];
        this.f26697q = 0;
        this.f26696n = null;
    }

    /* JADX INFO: renamed from: k */
    public static <T extends Comparable<? super T>> xblq<T> m16075k(int i2) {
        return toq(i2, kx3.natural());
    }

    private void ld6() {
        int i2 = (this.f26695k * 2) - 1;
        int iM16542h = C4723q.m16542h(i2 + 0, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (iMax >= i2) {
                break;
            }
            int iM16078y = m16078y(iMax, i2, ((iMax + i2) + 1) >>> 1);
            int i5 = this.f26695k;
            if (iM16078y <= i5) {
                if (iM16078y >= i5) {
                    break;
                }
                iMax = Math.max(iM16078y, iMax + 1);
                i4 = iM16078y;
            } else {
                i2 = iM16078y - 1;
            }
            i3++;
            if (i3 >= iM16542h) {
                Arrays.sort(this.f68237zy, iMax, i2, this.f68236toq);
                break;
            }
        }
        this.f26697q = this.f26695k;
        this.f26696n = this.f68237zy[i4];
        while (true) {
            i4++;
            if (i4 >= this.f26695k) {
                return;
            }
            if (this.f68236toq.compare(this.f68237zy[i4], this.f26696n) > 0) {
                this.f26696n = this.f68237zy[i4];
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static <T> xblq<T> m16076q(int i2, Comparator<? super T> comparator) {
        return new xblq<>(comparator, i2);
    }

    /* JADX INFO: renamed from: s */
    private void m16077s(int i2, int i3) {
        T[] tArr = this.f68237zy;
        T t2 = tArr[i2];
        tArr[i2] = tArr[i3];
        tArr[i3] = t2;
    }

    public static <T> xblq<T> toq(int i2, Comparator<? super T> comparator) {
        return new xblq<>(kx3.from(comparator).reverse(), i2);
    }

    /* JADX INFO: renamed from: y */
    private int m16078y(int i2, int i3, int i4) {
        T[] tArr = this.f68237zy;
        T t2 = tArr[i4];
        tArr[i4] = tArr[i3];
        int i5 = i2;
        while (i2 < i3) {
            if (this.f68236toq.compare(this.f68237zy[i2], t2) < 0) {
                m16077s(i5, i2);
                i5++;
            }
            i2++;
        }
        T[] tArr2 = this.f68237zy;
        tArr2[i3] = tArr2[i5];
        tArr2[i5] = t2;
        return i5;
    }

    public static <T extends Comparable<? super T>> xblq<T> zy(int i2) {
        return m16076q(i2, kx3.natural());
    }

    public void f7l8(Iterator<? extends T> it) {
        while (it.hasNext()) {
            m16080n(it.next());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m16079g(Iterable<? extends T> iterable) {
        f7l8(iterable.iterator());
    }

    /* JADX INFO: renamed from: n */
    public void m16080n(@NullableDecl T t2) {
        int i2 = this.f26695k;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f26697q;
        if (i3 == 0) {
            this.f68237zy[0] = t2;
            this.f26696n = t2;
            this.f26697q = 1;
            return;
        }
        if (i3 < i2) {
            T[] tArr = this.f68237zy;
            this.f26697q = i3 + 1;
            tArr[i3] = t2;
            if (this.f68236toq.compare(t2, this.f26696n) > 0) {
                this.f26696n = t2;
                return;
            }
            return;
        }
        if (this.f68236toq.compare(t2, this.f26696n) < 0) {
            T[] tArr2 = this.f68237zy;
            int i4 = this.f26697q;
            int i5 = i4 + 1;
            this.f26697q = i5;
            tArr2[i4] = t2;
            if (i5 == this.f26695k * 2) {
                ld6();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public List<T> m16081p() {
        Arrays.sort(this.f68237zy, 0, this.f26697q, this.f68236toq);
        int i2 = this.f26697q;
        int i3 = this.f26695k;
        if (i2 > i3) {
            T[] tArr = this.f68237zy;
            Arrays.fill(tArr, i3, tArr.length, (Object) null);
            int i4 = this.f26695k;
            this.f26697q = i4;
            this.f26696n = this.f68237zy[i4 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f68237zy, this.f26697q)));
    }
}

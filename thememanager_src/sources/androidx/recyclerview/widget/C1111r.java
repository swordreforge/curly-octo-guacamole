package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r */
/* JADX INFO: compiled from: TileList.java */
/* JADX INFO: loaded from: classes.dex */
class C1111r<T> {

    /* JADX INFO: renamed from: k */
    final int f6091k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final SparseArray<k<T>> f52292toq = new SparseArray<>(10);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    k<T> f52293zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$k */
    /* JADX INFO: compiled from: TileList.java */
    public static class k<T> {

        /* JADX INFO: renamed from: k */
        public final T[] f6092k;

        /* JADX INFO: renamed from: q */
        k<T> f6093q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f52294toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f52295zy;

        public k(Class<T> cls, int i2) {
            this.f6092k = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        }

        /* JADX INFO: renamed from: k */
        boolean m5111k(int i2) {
            int i3 = this.f52294toq;
            return i3 <= i2 && i2 < i3 + this.f52295zy;
        }

        T toq(int i2) {
            return this.f6092k[i2 - this.f52294toq];
        }
    }

    public C1111r(int i2) {
        this.f6091k = i2;
    }

    /* JADX INFO: renamed from: g */
    public int m5107g() {
        return this.f52292toq.size();
    }

    /* JADX INFO: renamed from: k */
    public k<T> m5108k(k<T> kVar) {
        int iIndexOfKey = this.f52292toq.indexOfKey(kVar.f52294toq);
        if (iIndexOfKey < 0) {
            this.f52292toq.put(kVar.f52294toq, kVar);
            return null;
        }
        k<T> kVarValueAt = this.f52292toq.valueAt(iIndexOfKey);
        this.f52292toq.setValueAt(iIndexOfKey, kVar);
        if (this.f52293zy == kVarValueAt) {
            this.f52293zy = kVar;
        }
        return kVarValueAt;
    }

    /* JADX INFO: renamed from: n */
    public k<T> m5109n(int i2) {
        k<T> kVar = this.f52292toq.get(i2);
        if (this.f52293zy == kVar) {
            this.f52293zy = null;
        }
        this.f52292toq.delete(i2);
        return kVar;
    }

    /* JADX INFO: renamed from: q */
    public T m5110q(int i2) {
        k<T> kVar = this.f52293zy;
        if (kVar == null || !kVar.m5111k(i2)) {
            int iIndexOfKey = this.f52292toq.indexOfKey(i2 - (i2 % this.f6091k));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.f52293zy = this.f52292toq.valueAt(iIndexOfKey);
        }
        return this.f52293zy.toq(i2);
    }

    public void toq() {
        this.f52292toq.clear();
    }

    public k<T> zy(int i2) {
        if (i2 < 0 || i2 >= this.f52292toq.size()) {
            return null;
        }
        return this.f52292toq.valueAt(i2);
    }
}

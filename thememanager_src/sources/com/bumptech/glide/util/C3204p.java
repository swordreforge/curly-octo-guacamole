package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.util.p */
/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3204p<T, Y> {

    /* JADX INFO: renamed from: k */
    private final Map<T, k<Y>> f19087k = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: q */
    private long f19088q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f63077toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f63078zy;

    /* JADX INFO: renamed from: com.bumptech.glide.util.p$k */
    /* JADX INFO: compiled from: LruCache.java */
    static final class k<Y> {

        /* JADX INFO: renamed from: k */
        final Y f19089k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f63079toq;

        k(Y y3, int i2) {
            this.f19089k = y3;
            this.f63079toq = i2;
        }
    }

    public C3204p(long j2) {
        this.f63077toq = j2;
        this.f63078zy = j2;
    }

    /* JADX INFO: renamed from: p */
    private void m11240p() {
        cdj(this.f63078zy);
    }

    protected synchronized void cdj(long j2) {
        while (this.f19088q > j2) {
            Iterator<Map.Entry<T, k<Y>>> it = this.f19087k.entrySet().iterator();
            Map.Entry<T, k<Y>> next = it.next();
            k<Y> value = next.getValue();
            this.f19088q -= (long) value.f63079toq;
            T key = next.getKey();
            it.remove();
            n7h(key, value.f19089k);
        }
    }

    @dd
    /* JADX INFO: renamed from: h */
    public synchronized Y m11241h(@lvui T t2) {
        k<Y> kVarRemove = this.f19087k.remove(t2);
        if (kVarRemove == null) {
            return null;
        }
        this.f19088q -= (long) kVarRemove.f63079toq;
        return kVarRemove.f19089k;
    }

    @dd
    public synchronized Y kja0(@lvui T t2, @dd Y y3) {
        int iQrj = qrj(y3);
        long j2 = iQrj;
        if (j2 >= this.f63078zy) {
            n7h(t2, y3);
            return null;
        }
        if (y3 != null) {
            this.f19088q += j2;
        }
        k<Y> kVarPut = this.f19087k.put(t2, y3 == null ? null : new k<>(y3, iQrj));
        if (kVarPut != null) {
            this.f19088q -= (long) kVarPut.f63079toq;
            if (!kVarPut.f19089k.equals(y3)) {
                n7h(t2, kVarPut.f19089k);
            }
        }
        m11240p();
        return kVarPut != null ? kVarPut.f19089k : null;
    }

    @dd
    public synchronized Y ld6(@lvui T t2) {
        k<Y> kVar;
        kVar = this.f19087k.get(t2);
        return kVar != null ? kVar.f19089k : null;
    }

    /* JADX INFO: renamed from: n */
    public synchronized long m11242n() {
        return this.f63078zy;
    }

    protected void n7h(@lvui T t2, @dd Y y3) {
    }

    /* JADX INFO: renamed from: q */
    public synchronized long m11243q() {
        return this.f19088q;
    }

    protected int qrj(@dd Y y3) {
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public synchronized boolean m11244s(@lvui T t2) {
        return this.f19087k.containsKey(t2);
    }

    public void toq() {
        cdj(0L);
    }

    protected synchronized int x2() {
        return this.f19087k.size();
    }

    public synchronized void zy(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f63078zy = Math.round(this.f63077toq * f2);
        m11240p();
    }
}

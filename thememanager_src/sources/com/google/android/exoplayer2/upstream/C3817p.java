package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.upstream.cache.C3780s;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.p */
/* JADX INFO: compiled from: CachedRegionTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3817p implements InterfaceC3775k.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f66896f7l8 = -1;

    /* JADX INFO: renamed from: g */
    private static final String f23075g = "CachedRegionTracker";

    /* JADX INFO: renamed from: y */
    public static final int f23076y = -2;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3775k f23077k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f66897toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C3398q f66898zy;

    /* JADX INFO: renamed from: q */
    private final TreeSet<k> f23079q = new TreeSet<>();

    /* JADX INFO: renamed from: n */
    private final k f23078n = new k(0, 0);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.p$k */
    /* JADX INFO: compiled from: CachedRegionTracker.java */
    private static class k implements Comparable<k> {

        /* JADX INFO: renamed from: k */
        public long f23080k;

        /* JADX INFO: renamed from: n */
        public int f23081n;

        /* JADX INFO: renamed from: q */
        public long f23082q;

        public k(long j2, long j3) {
            this.f23080k = j2;
            this.f23082q = j3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(k kVar) {
            return com.google.android.exoplayer2.util.lrht.cdj(this.f23080k, kVar.f23080k);
        }
    }

    public C3817p(InterfaceC3775k interfaceC3775k, String str, C3398q c3398q) {
        this.f23077k = interfaceC3775k;
        this.f66897toq = str;
        this.f66898zy = c3398q;
        synchronized (this) {
            Iterator<C3780s> itDescendingIterator = interfaceC3775k.mo13382h(str, this).descendingIterator();
            while (itDescendingIterator.hasNext()) {
                m13509y(itDescendingIterator.next());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m13508s(@zy.dd k kVar, @zy.dd k kVar2) {
        return (kVar == null || kVar2 == null || kVar.f23082q != kVar2.f23080k) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    private void m13509y(C3780s c3780s) {
        long j2 = c3780s.f22935q;
        k kVar = new k(j2, c3780s.f22934n + j2);
        k kVarFloor = this.f23079q.floor(kVar);
        k kVarCeiling = this.f23079q.ceiling(kVar);
        boolean zM13508s = m13508s(kVarFloor, kVar);
        if (m13508s(kVar, kVarCeiling)) {
            if (zM13508s) {
                kVarFloor.f23082q = kVarCeiling.f23082q;
                kVarFloor.f23081n = kVarCeiling.f23081n;
            } else {
                kVar.f23082q = kVarCeiling.f23082q;
                kVar.f23081n = kVarCeiling.f23081n;
                this.f23079q.add(kVar);
            }
            this.f23079q.remove(kVarCeiling);
            return;
        }
        if (!zM13508s) {
            int iBinarySearch = Arrays.binarySearch(this.f66898zy.f20153g, kVar.f23082q);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            kVar.f23081n = iBinarySearch;
            this.f23079q.add(kVar);
            return;
        }
        kVarFloor.f23082q = kVar.f23082q;
        int i2 = kVarFloor.f23081n;
        while (true) {
            C3398q c3398q = this.f66898zy;
            if (i2 >= c3398q.f20155q - 1) {
                break;
            }
            int i3 = i2 + 1;
            if (c3398q.f20153g[i3] > kVarFloor.f23082q) {
                break;
            } else {
                i2 = i3;
            }
        }
        kVarFloor.f23081n = i2;
    }

    public synchronized int f7l8(long j2) {
        int i2;
        k kVar = this.f23078n;
        kVar.f23080k = j2;
        k kVarFloor = this.f23079q.floor(kVar);
        if (kVarFloor != null) {
            long j3 = kVarFloor.f23082q;
            if (j2 <= j3 && (i2 = kVarFloor.f23081n) != -1) {
                C3398q c3398q = this.f66898zy;
                if (i2 == c3398q.f20155q - 1) {
                    if (j3 == c3398q.f20153g[i2] + ((long) c3398q.f20154n[i2])) {
                        return -2;
                    }
                }
                return (int) ((c3398q.f20157y[i2] + ((c3398q.f64380f7l8[i2] * (j3 - c3398q.f20153g[i2])) / ((long) c3398q.f20154n[i2]))) / 1000);
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k.toq
    /* JADX INFO: renamed from: k */
    public synchronized void mo13365k(InterfaceC3775k interfaceC3775k, C3780s c3780s) {
        m13509y(c3780s);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k.toq
    /* JADX INFO: renamed from: n */
    public void mo13366n(InterfaceC3775k interfaceC3775k, C3780s c3780s, C3780s c3780s2) {
    }

    /* JADX INFO: renamed from: p */
    public void m13510p() {
        this.f23077k.ki(this.f66897toq, this);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k.toq
    /* JADX INFO: renamed from: q */
    public synchronized void mo13367q(InterfaceC3775k interfaceC3775k, C3780s c3780s) {
        long j2 = c3780s.f22935q;
        k kVar = new k(j2, c3780s.f22934n + j2);
        k kVarFloor = this.f23079q.floor(kVar);
        if (kVarFloor == null) {
            com.google.android.exoplayer2.util.ni7.m13702q(f23075g, "Removed a span we were not aware of");
            return;
        }
        this.f23079q.remove(kVarFloor);
        long j3 = kVarFloor.f23080k;
        long j4 = kVar.f23080k;
        if (j3 < j4) {
            k kVar2 = new k(j3, j4);
            int iBinarySearch = Arrays.binarySearch(this.f66898zy.f20153g, kVar2.f23082q);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            kVar2.f23081n = iBinarySearch;
            this.f23079q.add(kVar2);
        }
        long j5 = kVarFloor.f23082q;
        long j6 = kVar.f23082q;
        if (j5 > j6) {
            k kVar3 = new k(j6 + 1, j5);
            kVar3.f23081n = kVarFloor.f23081n;
            this.f23079q.add(kVar3);
        }
    }
}

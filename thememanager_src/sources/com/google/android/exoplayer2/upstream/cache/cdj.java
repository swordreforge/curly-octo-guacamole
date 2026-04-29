package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: LeastRecentlyUsedCacheEvictor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj implements InterfaceC3779q {

    /* JADX INFO: renamed from: k */
    private final long f22891k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final TreeSet<C3780s> f66756toq = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.upstream.cache.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return cdj.m13363y((C3780s) obj, (C3780s) obj2);
        }
    });

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f66757zy;

    public cdj(long j2) {
        this.f22891k = j2;
    }

    /* JADX INFO: renamed from: s */
    private void m13362s(InterfaceC3775k interfaceC3775k, long j2) {
        while (this.f66757zy + j2 > this.f22891k && !this.f66756toq.isEmpty()) {
            interfaceC3775k.ld6(this.f66756toq.first());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static int m13363y(C3780s c3780s, C3780s c3780s2) {
        long j2 = c3780s.f22936s;
        long j3 = c3780s2.f22936s;
        return j2 - j3 == 0 ? c3780s.compareTo(c3780s2) : j2 < j3 ? -1 : 1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3779q
    /* JADX INFO: renamed from: g */
    public void mo13364g() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k.toq
    /* JADX INFO: renamed from: k */
    public void mo13365k(InterfaceC3775k interfaceC3775k, C3780s c3780s) {
        this.f66756toq.add(c3780s);
        this.f66757zy += c3780s.f22934n;
        m13362s(interfaceC3775k, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k.toq
    /* JADX INFO: renamed from: n */
    public void mo13366n(InterfaceC3775k interfaceC3775k, C3780s c3780s, C3780s c3780s2) {
        mo13367q(interfaceC3775k, c3780s);
        mo13365k(interfaceC3775k, c3780s2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3775k.toq
    /* JADX INFO: renamed from: q */
    public void mo13367q(InterfaceC3775k interfaceC3775k, C3780s c3780s) {
        this.f66756toq.remove(c3780s);
        this.f66757zy -= c3780s.f22934n;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3779q
    public boolean toq() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3779q
    public void zy(InterfaceC3775k interfaceC3775k, String str, long j2, long j3) {
        if (j3 != -1) {
            m13362s(interfaceC3775k, j3);
        }
    }
}

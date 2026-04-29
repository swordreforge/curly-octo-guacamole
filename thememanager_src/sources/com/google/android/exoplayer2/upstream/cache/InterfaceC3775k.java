package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;
import zy.dd;
import zy.y9n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.k */
/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3775k {

    /* JADX INFO: renamed from: k */
    public static final long f22913k = -1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.k$k */
    /* JADX INFO: compiled from: Cache.java */
    public static class k extends IOException {
        public k(String str) {
            super(str);
        }

        public k(Throwable th) {
            super(th);
        }

        public k(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.k$toq */
    /* JADX INFO: compiled from: Cache.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo13365k(InterfaceC3775k interfaceC3775k, C3780s c3780s);

        /* JADX INFO: renamed from: n */
        void mo13366n(InterfaceC3775k interfaceC3775k, C3780s c3780s, C3780s c3780s2);

        /* JADX INFO: renamed from: q */
        void mo13367q(InterfaceC3775k interfaceC3775k, C3780s c3780s);
    }

    NavigableSet<C3780s> cdj(String str);

    long f7l8(String str, long j2, long j3);

    @dd
    @y9n
    /* JADX INFO: renamed from: g */
    C3780s mo13381g(String str, long j2, long j3) throws k;

    /* JADX INFO: renamed from: h */
    NavigableSet<C3780s> mo13382h(String str, toq toqVar);

    /* JADX INFO: renamed from: k */
    long mo13383k();

    void ki(String str, toq toqVar);

    boolean kja0(String str, long j2, long j3);

    @y9n
    void ld6(C3780s c3780s);

    /* JADX INFO: renamed from: n */
    long mo13384n(String str, long j2, long j3);

    @y9n
    void n7h(String str);

    /* JADX INFO: renamed from: p */
    void mo13385p(C3780s c3780s);

    @y9n
    /* JADX INFO: renamed from: q */
    void mo13386q(String str, n7h n7hVar) throws k;

    @y9n
    void qrj(File file, long j2) throws k;

    @y9n
    void release();

    /* JADX INFO: renamed from: s */
    long mo13387s();

    @y9n
    File toq(String str, long j2, long j3) throws k;

    @y9n
    C3780s x2(String str, long j2, long j3) throws InterruptedException, k;

    /* JADX INFO: renamed from: y */
    Set<String> mo13388y();

    qrj zy(String str);
}

package com.xiaomi.accountsdk.request;

/* JADX INFO: compiled from: IPStrategyConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static long f72953f7l8 = 3600000;

    /* JADX INFO: renamed from: g */
    static final String f30991g = "111.13.142.141";

    /* JADX INFO: renamed from: k */
    private static final long f30992k = 0;

    /* JADX INFO: renamed from: n */
    static final String f30993n = "183.84.5.8";

    /* JADX INFO: renamed from: p */
    private static long f30994p = 2;

    /* JADX INFO: renamed from: q */
    private static final int f30995q = 2;

    /* JADX INFO: renamed from: s */
    private static long f30996s = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final long f72954toq = 3600000;

    /* JADX INFO: renamed from: y */
    private static long f30997y = 604800000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final long f72955zy = 604800000;

    static void f7l8(long j2) {
        f72953f7l8 = j2;
    }

    /* JADX INFO: renamed from: g */
    static void m19026g(long j2) {
        f30997y = j2;
    }

    /* JADX INFO: renamed from: k */
    static long m19027k() {
        return f30997y;
    }

    /* JADX INFO: renamed from: n */
    public static void m19028n(qrj qrjVar) {
        if (qrjVar != null) {
            f72953f7l8 = qrjVar.zy(f72953f7l8);
            f30997y = qrjVar.m18986k(f30997y);
            f30996s = qrjVar.n7h(f30996s);
            f30994p = qrjVar.m18988p(f30994p);
        }
    }

    /* JADX INFO: renamed from: q */
    static long m19029q() {
        return f30994p;
    }

    /* JADX INFO: renamed from: s */
    static void m19030s(long j2) {
        f30994p = j2;
    }

    static long toq() {
        return f72953f7l8;
    }

    /* JADX INFO: renamed from: y */
    static void m19031y(long j2) {
        f30996s = j2;
    }

    static long zy() {
        return f30996s;
    }
}

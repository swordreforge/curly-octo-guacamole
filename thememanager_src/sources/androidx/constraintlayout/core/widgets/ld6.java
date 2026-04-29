package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.widgets.C0341n;

/* JADX INFO: compiled from: Optimizer.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final int f47823cdj = 2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f47824f7l8 = 32;

    /* JADX INFO: renamed from: g */
    public static final int f2032g = 16;

    /* JADX INFO: renamed from: h */
    static final int f2033h = 1;

    /* JADX INFO: renamed from: k */
    public static final int f2034k = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final int f47825kja0 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f47826ld6 = 512;

    /* JADX INFO: renamed from: n */
    public static final int f2035n = 8;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static boolean[] f47827n7h = new boolean[3];

    /* JADX INFO: renamed from: p */
    public static final int f2036p = 256;

    /* JADX INFO: renamed from: q */
    public static final int f2037q = 4;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f47828qrj = 257;

    /* JADX INFO: renamed from: s */
    public static final int f2038s = 128;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f47829toq = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f47830x2 = 1024;

    /* JADX INFO: renamed from: y */
    public static final int f2039y = 64;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f47831zy = 2;

    /* JADX INFO: renamed from: k */
    static void m1308k(C0339g c0339g, C0296n c0296n, C0341n c0341n) {
        c0341n.f2048i = -1;
        c0341n.f47878fn3e = -1;
        C0341n.toq toqVar = c0339g.f47886hb[0];
        C0341n.toq toqVar2 = C0341n.toq.WRAP_CONTENT;
        if (toqVar != toqVar2 && c0341n.f47886hb[0] == C0341n.toq.MATCH_PARENT) {
            int i2 = c0341n.f47905ncyb.f47953f7l8;
            int iM1313a = c0339g.m1313a() - c0341n.f47903n5r1.f47953f7l8;
            C0343q c0343q = c0341n.f47905ncyb;
            c0343q.f2072s = c0296n.fn3e(c0343q);
            C0343q c0343q2 = c0341n.f47903n5r1;
            c0343q2.f2072s = c0296n.fn3e(c0343q2);
            c0296n.m1116g(c0341n.f47905ncyb.f2072s, i2);
            c0296n.m1116g(c0341n.f47903n5r1.f2072s, iM1313a);
            c0341n.f2048i = 2;
            c0341n.n2t(i2, iM1313a);
        }
        if (c0339g.f47886hb[1] == toqVar2 || c0341n.f47886hb[1] != C0341n.toq.MATCH_PARENT) {
            return;
        }
        int i3 = c0341n.f2051l.f47953f7l8;
        int iJk = c0339g.jk() - c0341n.f47887hyr.f47953f7l8;
        C0343q c0343q3 = c0341n.f2051l;
        c0343q3.f2072s = c0296n.fn3e(c0343q3);
        C0343q c0343q4 = c0341n.f47887hyr;
        c0343q4.f2072s = c0296n.fn3e(c0343q4);
        c0296n.m1116g(c0341n.f2051l.f2072s, i3);
        c0296n.m1116g(c0341n.f47887hyr.f2072s, iJk);
        if (c0341n.f47932zp > 0 || c0341n.a98o() == 8) {
            C0343q c0343q5 = c0341n.f2045f;
            c0343q5.f2072s = c0296n.fn3e(c0343q5);
            c0296n.m1116g(c0341n.f2045f.f2072s, c0341n.f47932zp + i3);
        }
        c0341n.f47878fn3e = 2;
        c0341n.r25n(i3, iJk);
    }

    public static final boolean toq(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}

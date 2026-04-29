package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.a9;
import com.google.android.exoplayer2.source.ads.zy;
import com.google.android.exoplayer2.util.lrht;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: ServerSideInsertedAdsUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj {
    private qrj() {
    }

    public static long f7l8(long j2, a9 a9Var, zy zyVar) {
        return a9Var.zy() ? m12591s(j2, a9Var.f65325toq, a9Var.f65326zy, zyVar) : m12589p(j2, a9Var.f21226n, zyVar);
    }

    /* JADX INFO: renamed from: g */
    public static long m12586g(gc3c gc3cVar, zy zyVar) {
        pc pcVarD8wk = gc3cVar.d8wk();
        if (pcVarD8wk.ni7()) {
            return C3548p.f65257toq;
        }
        long j2 = pcVarD8wk.m12485p(gc3cVar.ktq(), new pc.toq()).f21149g;
        return j2 == C3548p.f65257toq ? C3548p.f65257toq : m12589p(j2, -1, zyVar);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: k */
    public static zy m12587k(zy zyVar, long j2, long j3, long j4) {
        long jM12588n = m12588n(j2, -1, zyVar);
        int i2 = zyVar.f21306y;
        while (i2 < zyVar.f21304q && zyVar.m12619q(i2).f21316k != Long.MIN_VALUE && zyVar.m12619q(i2).f21316k <= jM12588n) {
            i2++;
        }
        long j5 = j3 - j2;
        zy zyVarKi = zyVar.m12616i(i2, jM12588n).t8r(i2, true).m12618p(i2, 1).ld6(i2, j5).ki(i2, j4);
        long j6 = (-j5) + j4;
        for (int i3 = i2 + 1; i3 < zyVarKi.f21304q; i3++) {
            long j7 = zyVarKi.m12619q(i3).f21316k;
            if (j7 != Long.MIN_VALUE) {
                zyVarKi = zyVarKi.qrj(i3, j7 + j6);
            }
        }
        return zyVarKi;
    }

    /* JADX INFO: renamed from: n */
    public static long m12588n(long j2, int i2, zy zyVar) {
        if (i2 == -1) {
            i2 = zyVar.f21304q;
        }
        long j3 = 0;
        for (int i3 = zyVar.f21306y; i3 < i2; i3++) {
            zy.C3576k c3576kM12619q = zyVar.m12619q(i3);
            long j4 = c3576kM12619q.f21316k;
            if (j4 == Long.MIN_VALUE || j4 > j2 - j3) {
                break;
            }
            for (int i4 = 0; i4 < toq(zyVar, i3); i4++) {
                j3 += c3576kM12619q.f21321y[i4];
            }
            long j5 = c3576kM12619q.f21320s;
            j3 -= j5;
            long j6 = c3576kM12619q.f21316k;
            long j7 = j2 - j3;
            if (j5 + j6 > j7) {
                return Math.max(j6, j7);
            }
        }
        return j2 - j3;
    }

    /* JADX INFO: renamed from: p */
    public static long m12589p(long j2, int i2, zy zyVar) {
        if (i2 == -1) {
            i2 = zyVar.f21304q;
        }
        long j3 = 0;
        for (int i3 = zyVar.f21306y; i3 < i2; i3++) {
            zy.C3576k c3576kM12619q = zyVar.m12619q(i3);
            long j4 = c3576kM12619q.f21316k;
            if (j4 == Long.MIN_VALUE || j4 > j2) {
                break;
            }
            long j5 = j4 + j3;
            for (int i4 = 0; i4 < toq(zyVar, i3); i4++) {
                j3 += c3576kM12619q.f21321y[i4];
            }
            long j6 = c3576kM12619q.f21320s;
            j3 -= j6;
            if (c3576kM12619q.f21316k + j6 > j2) {
                return Math.max(j5, j2 + j3);
            }
        }
        return j2 + j3;
    }

    /* JADX INFO: renamed from: q */
    public static long m12590q(long j2, int i2, int i3, zy zyVar) {
        int i4;
        zy.C3576k c3576kM12619q = zyVar.m12619q(i2);
        long j3 = j2 - c3576kM12619q.f21316k;
        int i5 = zyVar.f21306y;
        while (true) {
            i4 = 0;
            if (i5 >= i2) {
                break;
            }
            zy.C3576k c3576kM12619q2 = zyVar.m12619q(i5);
            while (i4 < toq(zyVar, i5)) {
                j3 -= c3576kM12619q2.f21321y[i4];
                i4++;
            }
            j3 += c3576kM12619q2.f21320s;
            i5++;
        }
        if (i3 < toq(zyVar, i2)) {
            while (i4 < i3) {
                j3 -= c3576kM12619q.f21321y[i4];
                i4++;
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: s */
    public static long m12591s(long j2, int i2, int i3, zy zyVar) {
        int i4;
        zy.C3576k c3576kM12619q = zyVar.m12619q(i2);
        long j3 = j2 + c3576kM12619q.f21316k;
        int i5 = zyVar.f21306y;
        while (true) {
            i4 = 0;
            if (i5 >= i2) {
                break;
            }
            zy.C3576k c3576kM12619q2 = zyVar.m12619q(i5);
            while (i4 < toq(zyVar, i5)) {
                j3 += c3576kM12619q2.f21321y[i4];
                i4++;
            }
            j3 -= c3576kM12619q2.f21320s;
            i5++;
        }
        if (i3 < toq(zyVar, i2)) {
            while (i4 < i3) {
                j3 += c3576kM12619q.f21321y[i4];
                i4++;
            }
        }
        return j3;
    }

    public static int toq(zy zyVar, int i2) {
        int i3 = zyVar.m12619q(i2).f21319q;
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: renamed from: y */
    public static long m12592y(gc3c gc3cVar, zy zyVar) {
        pc pcVarD8wk = gc3cVar.d8wk();
        if (pcVarD8wk.ni7()) {
            return C3548p.f65257toq;
        }
        pc.toq toqVarM12485p = pcVarD8wk.m12485p(gc3cVar.ktq(), new pc.toq());
        if (!lrht.zy(toqVarM12485p.ld6(), zyVar.f21302k)) {
            return C3548p.f65257toq;
        }
        if (!gc3cVar.mo12088r()) {
            return m12589p(lrht.v0af(gc3cVar.getCurrentPosition()) - toqVarM12485p.ki(), -1, zyVar);
        }
        return m12591s(lrht.v0af(gc3cVar.getCurrentPosition()), gc3cVar.mo12091v(), gc3cVar.h7am(), zyVar);
    }

    public static long zy(long j2, a9 a9Var, zy zyVar) {
        return a9Var.zy() ? m12590q(j2, a9Var.f65325toq, a9Var.f65326zy, zyVar) : m12588n(j2, a9Var.f21226n, zyVar);
    }
}

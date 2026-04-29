package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes2.dex */
public final class yz extends pc {

    /* JADX INFO: renamed from: c */
    private final boolean f21746c;

    /* JADX INFO: renamed from: e */
    @zy.dd
    private final Object f21747e;

    /* JADX INFO: renamed from: f */
    private final boolean f21748f;

    /* JADX INFO: renamed from: h */
    private final long f21749h;

    /* JADX INFO: renamed from: i */
    private final long f21750i;

    /* JADX INFO: renamed from: j */
    @zy.dd
    private final tfm f21751j;

    /* JADX INFO: renamed from: l */
    private final boolean f21752l;

    /* JADX INFO: renamed from: o */
    @zy.dd
    private final tfm.f7l8 f21753o;

    /* JADX INFO: renamed from: p */
    private final long f21754p;

    /* JADX INFO: renamed from: r */
    private final long f21755r;

    /* JADX INFO: renamed from: s */
    private final long f21756s;

    /* JADX INFO: renamed from: t */
    private final long f21757t;

    /* JADX INFO: renamed from: z */
    private final long f21758z;

    /* JADX INFO: renamed from: m */
    private static final Object f21745m = new Object();

    /* JADX INFO: renamed from: b */
    private static final tfm f21744b = new tfm.zy().jk("SinglePeriodTimeline").eqxt(Uri.EMPTY).m13065k();

    @Deprecated
    public yz(long j2, boolean z2, boolean z3, boolean z5, @zy.dd Object obj, @zy.dd Object obj2) {
        this(j2, j2, 0L, 0L, z2, z3, z5, obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.pc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.pc.C3550q fn3e(int r25, com.google.android.exoplayer2.pc.C3550q r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.google.android.exoplayer2.util.C3844k.zy(r3, r1, r2)
            long r1 = r0.f21755r
            boolean r14 = r0.f21748f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f21746c
            if (r5 != 0) goto L2e
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r5 = r0.f21758z
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.google.android.exoplayer2.pc.C3550q.f21121o
            com.google.android.exoplayer2.tfm r5 = r0.f21751j
            java.lang.Object r6 = r0.f21747e
            long r7 = r0.f21756s
            long r9 = r0.f21754p
            long r11 = r0.f21749h
            boolean r13 = r0.f21752l
            com.google.android.exoplayer2.tfm$f7l8 r15 = r0.f21753o
            long r1 = r0.f21758z
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f21757t
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.pc$q r1 = r3.qrj(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.yz.fn3e(int, com.google.android.exoplayer2.pc$q, long):com.google.android.exoplayer2.pc$q");
    }

    @Override // com.google.android.exoplayer2.pc
    /* JADX INFO: renamed from: g */
    public int mo12147g(Object obj) {
        return f21745m.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.pc
    public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
        C3844k.zy(i2, 0, 1);
        return toqVar.ni7(null, z2 ? f21745m : null, 0, this.f21750i, -this.f21757t);
    }

    @Override // com.google.android.exoplayer2.pc
    public int qrj() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.pc
    public Object t8r(int i2) {
        C3844k.zy(i2, 0, 1);
        return f21745m;
    }

    @Override // com.google.android.exoplayer2.pc
    public int zurt() {
        return 1;
    }

    public yz(long j2, boolean z2, boolean z3, boolean z5, @zy.dd Object obj, tfm tfmVar) {
        this(j2, j2, 0L, 0L, z2, z3, z5, obj, tfmVar);
    }

    @Deprecated
    public yz(long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z5, @zy.dd Object obj, @zy.dd Object obj2) {
        this(C3548p.f65257toq, C3548p.f65257toq, C3548p.f65257toq, j2, j3, j4, j5, z2, z3, z5, obj, obj2);
    }

    public yz(long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z5, @zy.dd Object obj, tfm tfmVar) {
        this(C3548p.f65257toq, C3548p.f65257toq, C3548p.f65257toq, j2, j3, j4, j5, z2, z3, false, obj, tfmVar, z5 ? tfmVar.f22146g : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public yz(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2, boolean z3, boolean z5, @zy.dd Object obj, @zy.dd Object obj2) {
        tfm tfmVar = f21744b;
        this(j2, j3, j4, j5, j6, j7, j8, z2, z3, false, obj, tfmVar.toq().oc(obj2).m13065k(), z5 ? tfmVar.f22146g : null);
    }

    @Deprecated
    public yz(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2, boolean z3, @zy.dd Object obj, tfm tfmVar, @zy.dd tfm.f7l8 f7l8Var) {
        this(j2, j3, j4, j5, j6, j7, j8, z2, z3, false, obj, tfmVar, f7l8Var);
    }

    public yz(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2, boolean z3, boolean z5, @zy.dd Object obj, tfm tfmVar, @zy.dd tfm.f7l8 f7l8Var) {
        this.f21756s = j2;
        this.f21754p = j3;
        this.f21749h = j4;
        this.f21750i = j5;
        this.f21758z = j6;
        this.f21757t = j7;
        this.f21755r = j8;
        this.f21752l = z2;
        this.f21748f = z3;
        this.f21746c = z5;
        this.f21747e = obj;
        this.f21751j = (tfm) C3844k.f7l8(tfmVar);
        this.f21753o = f7l8Var;
    }
}

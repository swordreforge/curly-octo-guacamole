package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import java.util.Arrays;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a9 {

    /* JADX INFO: renamed from: k */
    private static final String f19735k = "VorbisUtil";

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.a9$k */
    /* JADX INFO: compiled from: VorbisUtil.java */
    private static final class C3332k {

        /* JADX INFO: renamed from: k */
        public final int f19736k;

        /* JADX INFO: renamed from: n */
        public final boolean f19737n;

        /* JADX INFO: renamed from: q */
        public final int f19738q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63665toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long[] f63666zy;

        public C3332k(int i2, int i3, long[] jArr, int i4, boolean z2) {
            this.f19736k = i2;
            this.f63665toq = i3;
            this.f63666zy = jArr;
            this.f19738q = i4;
            this.f19737n = z2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.a9$q */
    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class C3333q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final int f63667f7l8;

        /* JADX INFO: renamed from: g */
        public final int f19739g;

        /* JADX INFO: renamed from: k */
        public final int f19740k;

        /* JADX INFO: renamed from: n */
        public final int f19741n;

        /* JADX INFO: renamed from: p */
        public final byte[] f19742p;

        /* JADX INFO: renamed from: q */
        public final int f19743q;

        /* JADX INFO: renamed from: s */
        public final boolean f19744s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63668toq;

        /* JADX INFO: renamed from: y */
        public final int f19745y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63669zy;

        public C3333q(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2, byte[] bArr) {
            this.f19740k = i2;
            this.f63668toq = i3;
            this.f63669zy = i4;
            this.f19743q = i5;
            this.f19741n = i6;
            this.f19739g = i7;
            this.f63667f7l8 = i8;
            this.f19745y = i9;
            this.f19744s = z2;
            this.f19742p = bArr;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final String f19746k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final String[] f63670toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63671zy;

        public toq(String str, String[] strArr, int i2) {
            this.f19746k = str;
            this.f63670toq = strArr;
            this.f63671zy = i2;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        public final boolean f19747k;

        /* JADX INFO: renamed from: q */
        public final int f19748q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63672toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63673zy;

        public zy(boolean z2, int i2, int i3, int i4) {
            this.f19747k = z2;
            this.f63672toq = i2;
            this.f63673zy = i3;
            this.f19748q = i4;
        }
    }

    private a9() {
    }

    private static void f7l8(jk jkVar) throws sok {
        int iM11740n = jkVar.m11740n(6) + 1;
        for (int i2 = 0; i2 < iM11740n; i2++) {
            if (jkVar.m11740n(16) > 2) {
                throw sok.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            jkVar.m11742y(24);
            jkVar.m11742y(24);
            jkVar.m11742y(24);
            int iM11740n2 = jkVar.m11740n(6) + 1;
            jkVar.m11742y(8);
            int[] iArr = new int[iM11740n2];
            for (int i3 = 0; i3 < iM11740n2; i3++) {
                iArr[i3] = ((jkVar.m11741q() ? jkVar.m11740n(5) : 0) * 8) + jkVar.m11740n(3);
            }
            for (int i4 = 0; i4 < iM11740n2; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((iArr[i4] & (1 << i5)) != 0) {
                        jkVar.m11742y(8);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static zy[] m11674g(jk jkVar) {
        int iM11740n = jkVar.m11740n(6) + 1;
        zy[] zyVarArr = new zy[iM11740n];
        for (int i2 = 0; i2 < iM11740n; i2++) {
            zyVarArr[i2] = new zy(jkVar.m11741q(), jkVar.m11740n(16), jkVar.m11740n(16), jkVar.m11740n(8));
        }
        return zyVarArr;
    }

    /* JADX INFO: renamed from: k */
    public static int m11675k(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static zy[] ld6(gvn7 gvn7Var, int i2) throws sok {
        x2(5, gvn7Var, false);
        int iJp0y = gvn7Var.jp0y() + 1;
        jk jkVar = new jk(gvn7Var.m13598q());
        jkVar.m11742y(gvn7Var.m13596n() * 8);
        for (int i3 = 0; i3 < iJp0y; i3++) {
            zy(jkVar);
        }
        int iM11740n = jkVar.m11740n(6) + 1;
        for (int i4 = 0; i4 < iM11740n; i4++) {
            if (jkVar.m11740n(16) != 0) {
                throw sok.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m11678q(jkVar);
        f7l8(jkVar);
        m11676n(i2, jkVar);
        zy[] zyVarArrM11674g = m11674g(jkVar);
        if (jkVar.m11741q()) {
            return zyVarArrM11674g;
        }
        throw sok.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    /* JADX INFO: renamed from: n */
    private static void m11676n(int i2, jk jkVar) throws sok {
        int iM11740n = jkVar.m11740n(6) + 1;
        for (int i3 = 0; i3 < iM11740n; i3++) {
            int iM11740n2 = jkVar.m11740n(16);
            if (iM11740n2 != 0) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("mapping type other than 0 not supported: ");
                sb.append(iM11740n2);
                com.google.android.exoplayer2.util.ni7.m13702q(f19735k, sb.toString());
            } else {
                int iM11740n3 = jkVar.m11741q() ? jkVar.m11740n(4) + 1 : 1;
                if (jkVar.m11741q()) {
                    int iM11740n4 = jkVar.m11740n(8) + 1;
                    for (int i4 = 0; i4 < iM11740n4; i4++) {
                        int i5 = i2 - 1;
                        jkVar.m11742y(m11675k(i5));
                        jkVar.m11742y(m11675k(i5));
                    }
                }
                if (jkVar.m11740n(2) != 0) {
                    throw sok.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iM11740n3 > 1) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        jkVar.m11742y(4);
                    }
                }
                for (int i7 = 0; i7 < iM11740n3; i7++) {
                    jkVar.m11742y(8);
                    jkVar.m11742y(8);
                    jkVar.m11742y(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C3333q m11677p(gvn7 gvn7Var) throws sok {
        x2(1, gvn7Var, false);
        int iFu4 = gvn7Var.fu4();
        int iJp0y = gvn7Var.jp0y();
        int iFu42 = gvn7Var.fu4();
        int iKi = gvn7Var.ki();
        if (iKi <= 0) {
            iKi = -1;
        }
        int iKi2 = gvn7Var.ki();
        if (iKi2 <= 0) {
            iKi2 = -1;
        }
        int iKi3 = gvn7Var.ki();
        if (iKi3 <= 0) {
            iKi3 = -1;
        }
        int iJp0y2 = gvn7Var.jp0y();
        return new C3333q(iFu4, iJp0y, iFu42, iKi, iKi2, iKi3, (int) Math.pow(2.0d, iJp0y2 & 15), (int) Math.pow(2.0d, (iJp0y2 & com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg) >> 4), (gvn7Var.jp0y() & 1) > 0, Arrays.copyOf(gvn7Var.m13598q(), gvn7Var.m13591g()));
    }

    /* JADX INFO: renamed from: q */
    private static void m11678q(jk jkVar) throws sok {
        int iM11740n = jkVar.m11740n(6) + 1;
        for (int i2 = 0; i2 < iM11740n; i2++) {
            int iM11740n2 = jkVar.m11740n(16);
            if (iM11740n2 == 0) {
                jkVar.m11742y(8);
                jkVar.m11742y(16);
                jkVar.m11742y(16);
                jkVar.m11742y(6);
                jkVar.m11742y(8);
                int iM11740n3 = jkVar.m11740n(4) + 1;
                for (int i3 = 0; i3 < iM11740n3; i3++) {
                    jkVar.m11742y(8);
                }
            } else {
                if (iM11740n2 != 1) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("floor type greater than 1 not decodable: ");
                    sb.append(iM11740n2);
                    throw sok.createForMalformedContainer(sb.toString(), null);
                }
                int iM11740n4 = jkVar.m11740n(5);
                int i4 = -1;
                int[] iArr = new int[iM11740n4];
                for (int i5 = 0; i5 < iM11740n4; i5++) {
                    int iM11740n5 = jkVar.m11740n(4);
                    iArr[i5] = iM11740n5;
                    if (iM11740n5 > i4) {
                        i4 = iM11740n5;
                    }
                }
                int i6 = i4 + 1;
                int[] iArr2 = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr2[i7] = jkVar.m11740n(3) + 1;
                    int iM11740n6 = jkVar.m11740n(2);
                    if (iM11740n6 > 0) {
                        jkVar.m11742y(8);
                    }
                    for (int i8 = 0; i8 < (1 << iM11740n6); i8++) {
                        jkVar.m11742y(8);
                    }
                }
                jkVar.m11742y(2);
                int iM11740n7 = jkVar.m11740n(4);
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < iM11740n4; i11++) {
                    i9 += iArr2[iArr[i11]];
                    while (i10 < i9) {
                        jkVar.m11742y(iM11740n7);
                        i10++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static toq m11679s(gvn7 gvn7Var, boolean z2, boolean z3) throws sok {
        if (z2) {
            x2(3, gvn7Var, false);
        }
        String strJk = gvn7Var.jk((int) gvn7Var.zurt());
        int length = 11 + strJk.length();
        long jZurt = gvn7Var.zurt();
        String[] strArr = new String[(int) jZurt];
        int length2 = length + 4;
        for (int i2 = 0; i2 < jZurt; i2++) {
            String strJk2 = gvn7Var.jk((int) gvn7Var.zurt());
            strArr[i2] = strJk2;
            length2 = length2 + 4 + strJk2.length();
        }
        if (z3 && (gvn7Var.jp0y() & 1) == 0) {
            throw sok.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new toq(strJk, strArr, length2 + 1);
    }

    private static long toq(long j2, long j3) {
        return (long) Math.floor(Math.pow(j2, 1.0d / j3));
    }

    public static boolean x2(int i2, gvn7 gvn7Var, boolean z2) throws sok {
        if (gvn7Var.m13594k() < 7) {
            if (z2) {
                return false;
            }
            int iM13594k = gvn7Var.m13594k();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(iM13594k);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
        if (gvn7Var.jp0y() != i2) {
            if (z2) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i2));
            throw sok.createForMalformedContainer(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "), null);
        }
        if (gvn7Var.jp0y() == 118 && gvn7Var.jp0y() == 111 && gvn7Var.jp0y() == 114 && gvn7Var.jp0y() == 98 && gvn7Var.jp0y() == 105 && gvn7Var.jp0y() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw sok.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    /* JADX INFO: renamed from: y */
    public static toq m11680y(gvn7 gvn7Var) throws sok {
        return m11679s(gvn7Var, true, true);
    }

    private static C3332k zy(jk jkVar) throws sok {
        if (jkVar.m11740n(24) != 5653314) {
            int iZy = jkVar.zy();
            StringBuilder sb = new StringBuilder(66);
            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb.append(iZy);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
        int iM11740n = jkVar.m11740n(16);
        int iM11740n2 = jkVar.m11740n(24);
        long[] jArr = new long[iM11740n2];
        boolean zM11741q = jkVar.m11741q();
        long qVar = 0;
        if (zM11741q) {
            int iM11740n3 = jkVar.m11740n(5) + 1;
            int i2 = 0;
            while (i2 < iM11740n2) {
                int iM11740n4 = jkVar.m11740n(m11675k(iM11740n2 - i2));
                for (int i3 = 0; i3 < iM11740n4 && i2 < iM11740n2; i3++) {
                    jArr[i2] = iM11740n3;
                    i2++;
                }
                iM11740n3++;
            }
        } else {
            boolean zM11741q2 = jkVar.m11741q();
            for (int i4 = 0; i4 < iM11740n2; i4++) {
                if (!zM11741q2) {
                    jArr[i4] = jkVar.m11740n(5) + 1;
                } else if (jkVar.m11741q()) {
                    jArr[i4] = jkVar.m11740n(5) + 1;
                } else {
                    jArr[i4] = 0;
                }
            }
        }
        int iM11740n5 = jkVar.m11740n(4);
        if (iM11740n5 > 2) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("lookup type greater than 2 not decodable: ");
            sb2.append(iM11740n5);
            throw sok.createForMalformedContainer(sb2.toString(), null);
        }
        if (iM11740n5 == 1 || iM11740n5 == 2) {
            jkVar.m11742y(32);
            jkVar.m11742y(32);
            int iM11740n6 = jkVar.m11740n(4) + 1;
            jkVar.m11742y(1);
            if (iM11740n5 != 1) {
                qVar = ((long) iM11740n2) * ((long) iM11740n);
            } else if (iM11740n != 0) {
                qVar = toq(iM11740n2, iM11740n);
            }
            jkVar.m11742y((int) (qVar * ((long) iM11740n6)));
        }
        return new C3332k(iM11740n, iM11740n2, jArr, iM11740n5, zM11741q);
    }
}

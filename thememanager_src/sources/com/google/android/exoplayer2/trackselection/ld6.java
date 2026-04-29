package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.h7am;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.common.collect.se;
import java.util.Arrays;
import zy.dd;
import zy.yz;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ld6 extends zurt {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private C3709k f66054zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.ld6$k */
    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class C3709k {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f66055ld6 = 3;

        /* JADX INFO: renamed from: p */
        public static final int f22327p = 2;

        /* JADX INFO: renamed from: s */
        public static final int f22328s = 1;

        /* JADX INFO: renamed from: y */
        public static final int f22329y = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final C3629x f66056f7l8;

        /* JADX INFO: renamed from: g */
        private final int[][][] f22330g;

        /* JADX INFO: renamed from: k */
        private final int f22331k;

        /* JADX INFO: renamed from: n */
        private final int[] f22332n;

        /* JADX INFO: renamed from: q */
        private final C3629x[] f22333q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String[] f66057toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int[] f66058zy;

        @yz
        C3709k(String[] strArr, int[] iArr, C3629x[] c3629xArr, int[] iArr2, int[][][] iArr3, C3629x c3629x) {
            this.f66057toq = strArr;
            this.f66058zy = iArr;
            this.f22333q = c3629xArr;
            this.f22330g = iArr3;
            this.f22332n = iArr2;
            this.f66056f7l8 = c3629x;
            this.f22331k = iArr.length;
        }

        public C3629x f7l8(int i2) {
            return this.f22333q[i2];
        }

        /* JADX INFO: renamed from: g */
        public int m13141g(int i2) {
            return this.f66058zy[i2];
        }

        /* JADX INFO: renamed from: k */
        public int m13142k(int i2, int i3, boolean z2) {
            int i4 = this.f22333q[i2].toq(i3).f21222k;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                int iM13147y = m13147y(i2, i3, i6);
                if (iM13147y == 4 || (z2 && iM13147y == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            return toq(i2, i3, Arrays.copyOf(iArr, i5));
        }

        /* JADX INFO: renamed from: n */
        public int m13143n(int i2) {
            int iMax = 0;
            for (int[] iArr : this.f22330g[i2]) {
                for (int i3 : iArr) {
                    int iWvg = cv06.wvg(i3);
                    int i4 = 2;
                    if (iWvg == 0 || iWvg == 1 || iWvg == 2) {
                        i4 = 1;
                    } else if (iWvg != 3) {
                        if (iWvg == 4) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    iMax = Math.max(iMax, i4);
                }
            }
            return iMax;
        }

        /* JADX INFO: renamed from: p */
        public C3629x m13144p() {
            return this.f66056f7l8;
        }

        /* JADX INFO: renamed from: q */
        public String m13145q(int i2) {
            return this.f66057toq[i2];
        }

        /* JADX INFO: renamed from: s */
        public int m13146s(int i2) {
            int iMax = 0;
            for (int i3 = 0; i3 < this.f22331k; i3++) {
                if (this.f66058zy[i3] == i2) {
                    iMax = Math.max(iMax, m13143n(i3));
                }
            }
            return iMax;
        }

        public int toq(int i2, int i3, int[] iArr) {
            int i4 = 0;
            int iMin = 16;
            String str = null;
            boolean z2 = false;
            int i5 = 0;
            while (i4 < iArr.length) {
                String str2 = this.f22333q[i2].toq(i3).toq(iArr[i4]).f23682r;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z2 |= !lrht.zy(str, str2);
                }
                iMin = Math.min(iMin, cv06.m11558s(this.f22330g[i2][i3][i4]));
                i4++;
                i5 = i6;
            }
            return z2 ? Math.min(iMin, this.f22332n[i2]) : iMin;
        }

        /* JADX INFO: renamed from: y */
        public int m13147y(int i2, int i3, int i4) {
            return cv06.wvg(this.f22330g[i2][i3][i4]);
        }

        public int zy() {
            return this.f22331k;
        }
    }

    /* JADX INFO: renamed from: p */
    private static int m13138p(cv06[] cv06VarArr, C3564a c3564a, int[] iArr, boolean z2) throws com.google.android.exoplayer2.ki {
        int length = cv06VarArr.length;
        boolean z3 = true;
        int i2 = 0;
        for (int i3 = 0; i3 < cv06VarArr.length; i3++) {
            cv06 cv06Var = cv06VarArr[i3];
            int iMax = 0;
            for (int i4 = 0; i4 < c3564a.f21222k; i4++) {
                iMax = Math.max(iMax, cv06.wvg(cv06Var.mo11518k(c3564a.toq(i4))));
            }
            boolean z5 = iArr[i3] == 0;
            if (iMax > i2 || (iMax == i2 && z2 && !z3 && z5)) {
                length = i3;
                z3 = z5;
                i2 = iMax;
            }
        }
        return length;
    }

    private static int[] qrj(cv06[] cv06VarArr) throws com.google.android.exoplayer2.ki {
        int length = cv06VarArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = cv06VarArr[i2].fn3e();
        }
        return iArr;
    }

    @yz
    /* JADX INFO: renamed from: s */
    static pjz9 m13139s(n7h[] n7hVarArr, C3709k c3709k) {
        se.C4520k c4520k = new se.C4520k();
        for (int i2 = 0; i2 < c3709k.zy(); i2++) {
            C3629x c3629xF7l8 = c3709k.f7l8(i2);
            n7h n7hVar = n7hVarArr[i2];
            for (int i3 = 0; i3 < c3629xF7l8.f21701k; i3++) {
                C3564a qVar = c3629xF7l8.toq(i3);
                int i4 = qVar.f21222k;
                int[] iArr = new int[i4];
                boolean[] zArr = new boolean[i4];
                for (int i5 = 0; i5 < qVar.f21222k; i5++) {
                    iArr[i5] = c3709k.m13147y(i2, i3, i5);
                    zArr[i5] = (n7hVar == null || n7hVar.qrj() != qVar || n7hVar.x2(i5) == -1) ? false : true;
                }
                c4520k.mo15569k(new pjz9.C3551k(qVar, iArr, c3709k.m13141g(i2), zArr));
            }
        }
        C3629x c3629xM13144p = c3709k.m13144p();
        for (int i6 = 0; i6 < c3629xM13144p.f21701k; i6++) {
            C3564a qVar2 = c3629xM13144p.toq(i6);
            int[] iArr2 = new int[qVar2.f21222k];
            Arrays.fill(iArr2, 0);
            c4520k.mo15569k(new pjz9.C3551k(qVar2, iArr2, wvg.x2(qVar2.toq(0).f23682r), new boolean[qVar2.f21222k]));
        }
        return new pjz9(c4520k.mo15570n());
    }

    private static int[] x2(cv06 cv06Var, C3564a c3564a) throws com.google.android.exoplayer2.ki {
        int[] iArr = new int[c3564a.f21222k];
        for (int i2 = 0; i2 < c3564a.f21222k; i2++) {
            iArr[i2] = cv06Var.mo11518k(c3564a.toq(i2));
        }
        return iArr;
    }

    @Override // com.google.android.exoplayer2.trackselection.zurt
    public final ni7 f7l8(cv06[] cv06VarArr, C3629x c3629x, fti.C3596k c3596k, pc pcVar) throws com.google.android.exoplayer2.ki {
        int[] iArr = new int[cv06VarArr.length + 1];
        int length = cv06VarArr.length + 1;
        C3564a[][] c3564aArr = new C3564a[length][];
        int[][][] iArr2 = new int[cv06VarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = c3629x.f21701k;
            c3564aArr[i2] = new C3564a[i3];
            iArr2[i2] = new int[i3][];
        }
        int[] iArrQrj = qrj(cv06VarArr);
        for (int i4 = 0; i4 < c3629x.f21701k; i4++) {
            C3564a qVar = c3629x.toq(i4);
            int iM13138p = m13138p(cv06VarArr, qVar, iArr, wvg.x2(qVar.toq(0).f23682r) == 5);
            int[] iArrX2 = iM13138p == cv06VarArr.length ? new int[qVar.f21222k] : x2(cv06VarArr[iM13138p], qVar);
            int i5 = iArr[iM13138p];
            c3564aArr[iM13138p][i5] = qVar;
            iArr2[iM13138p][i5] = iArrX2;
            iArr[iM13138p] = i5 + 1;
        }
        C3629x[] c3629xArr = new C3629x[cv06VarArr.length];
        String[] strArr = new String[cv06VarArr.length];
        int[] iArr3 = new int[cv06VarArr.length];
        for (int i6 = 0; i6 < cv06VarArr.length; i6++) {
            int i7 = iArr[i6];
            c3629xArr[i6] = new C3629x((C3564a[]) lrht.z4(c3564aArr[i6], i7));
            iArr2[i6] = (int[][]) lrht.z4(iArr2[i6], i7);
            strArr[i6] = cv06VarArr[i6].getName();
            iArr3[i6] = cv06VarArr[i6].mo11551n();
        }
        C3709k c3709k = new C3709k(strArr, iArr3, c3629xArr, iArrQrj, iArr2, new C3629x((C3564a[]) lrht.z4(c3564aArr[cv06VarArr.length], iArr[cv06VarArr.length])));
        Pair<h7am[], InterfaceC3715s[]> pairN7h = n7h(c3709k, iArr2, iArrQrj, c3596k, pcVar);
        return new ni7((h7am[]) pairN7h.first, (InterfaceC3715s[]) pairN7h.second, m13139s((n7h[]) pairN7h.second, c3709k), c3709k);
    }

    @Override // com.google.android.exoplayer2.trackselection.zurt
    /* JADX INFO: renamed from: g */
    public final void mo13140g(@dd Object obj) {
        this.f66054zy = (C3709k) obj;
    }

    @dd
    public final C3709k ld6() {
        return this.f66054zy;
    }

    protected abstract Pair<h7am[], InterfaceC3715s[]> n7h(C3709k c3709k, int[][][] iArr, int[] iArr2, fti.C3596k c3596k, pc pcVar) throws com.google.android.exoplayer2.ki;
}

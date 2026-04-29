package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.x9kr;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp3.y */
/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3369y implements f7l8 {

    /* JADX INFO: renamed from: y */
    private static final String f19952y = "VbriSeeker";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final long f64067f7l8;

    /* JADX INFO: renamed from: g */
    private final long f19953g;

    /* JADX INFO: renamed from: n */
    private final long[] f19954n;

    /* JADX INFO: renamed from: q */
    private final long[] f19955q;

    private C3369y(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f19955q = jArr;
        this.f19954n = jArr2;
        this.f19953g = j2;
        this.f64067f7l8 = j3;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static C3369y m11825k(long j2, long j3, x9kr.C3269k c3269k, gvn7 gvn7Var) {
        int iJp0y;
        gvn7Var.hyr(10);
        int iKja0 = gvn7Var.kja0();
        if (iKja0 <= 0) {
            return null;
        }
        int i2 = c3269k.f19508q;
        long jKtq = lrht.ktq(iKja0, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), i2);
        int iLvui = gvn7Var.lvui();
        int iLvui2 = gvn7Var.lvui();
        int iLvui3 = gvn7Var.lvui();
        gvn7Var.hyr(2);
        long j4 = j3 + ((long) c3269k.f63529zy);
        long[] jArr = new long[iLvui];
        long[] jArr2 = new long[iLvui];
        int i3 = 0;
        long j5 = j3;
        while (i3 < iLvui) {
            int i4 = iLvui2;
            long j6 = j4;
            jArr[i3] = (((long) i3) * jKtq) / ((long) iLvui);
            jArr2[i3] = Math.max(j5, j6);
            if (iLvui3 == 1) {
                iJp0y = gvn7Var.jp0y();
            } else if (iLvui3 == 2) {
                iJp0y = gvn7Var.lvui();
            } else if (iLvui3 == 3) {
                iJp0y = gvn7Var.oc();
            } else {
                if (iLvui3 != 4) {
                    return null;
                }
                iJp0y = gvn7Var.eqxt();
            }
            j5 += (long) (iJp0y * i4);
            i3++;
            j4 = j6;
            iLvui2 = i4;
        }
        if (j2 != -1 && j2 != j5) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j5);
            ni7.qrj(f19952y, sb.toString());
        }
        return new C3369y(jArr, jArr2, jKtq, j5);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: g */
    public long mo11813g() {
        return this.f64067f7l8;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        int iM13667p = lrht.m13667p(this.f19955q, j2, true, true);
        wvg wvgVar = new wvg(this.f19955q[iM13667p], this.f19954n[iM13667p]);
        if (wvgVar.f20458k >= j2 || iM13667p == this.f19955q.length - 1) {
            return new o1t.C3388k(wvgVar);
        }
        int i2 = iM13667p + 1;
        return new o1t.C3388k(wvgVar, new wvg(this.f19955q[i2], this.f19954n[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f19953g;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: y */
    public long mo11814y(long j2) {
        return this.f19955q[lrht.m13667p(this.f19954n, j2, true, true)];
    }
}

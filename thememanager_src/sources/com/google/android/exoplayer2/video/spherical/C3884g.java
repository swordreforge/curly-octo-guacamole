package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.jp0y;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.video.spherical.C3886n;
import java.util.ArrayList;
import java.util.zip.Inflater;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.g */
/* JADX INFO: compiled from: ProjectionDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3884g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67212f7l8 = 10000;

    /* JADX INFO: renamed from: g */
    private static final int f23510g = 1886547818;

    /* JADX INFO: renamed from: k */
    private static final int f23511k = 2037673328;

    /* JADX INFO: renamed from: n */
    private static final int f23512n = 1835365224;

    /* JADX INFO: renamed from: q */
    private static final int f23513q = 1684433976;

    /* JADX INFO: renamed from: s */
    private static final int f23514s = 128000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f67213toq = 1836279920;

    /* JADX INFO: renamed from: y */
    private static final int f23515y = 32000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f67214zy = 1918990112;

    private C3884g() {
    }

    @dd
    private static ArrayList<C3886n.toq> f7l8(gvn7 gvn7Var) {
        ArrayList<C3886n.toq> arrayList = new ArrayList<>();
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        while (iM13596n < iM13591g) {
            int iKja0 = gvn7Var.kja0() + iM13596n;
            if (iKja0 <= iM13596n || iKja0 > iM13591g) {
                return null;
            }
            if (gvn7Var.kja0() == f23512n) {
                C3886n.toq toqVarM13847q = m13847q(gvn7Var);
                if (toqVarM13847q == null) {
                    return null;
                }
                arrayList.add(toqVarM13847q);
            }
            gvn7Var.n5r1(iKja0);
            iM13596n = iKja0;
        }
        return arrayList;
    }

    @dd
    /* JADX INFO: renamed from: g */
    private static ArrayList<C3886n.toq> m13844g(gvn7 gvn7Var) {
        int iKja0;
        gvn7Var.hyr(8);
        int iM13596n = gvn7Var.m13596n();
        int iM13591g = gvn7Var.m13591g();
        while (iM13596n < iM13591g && (iKja0 = gvn7Var.kja0() + iM13596n) > iM13596n && iKja0 <= iM13591g) {
            int iKja02 = gvn7Var.kja0();
            if (iKja02 == f23511k || iKja02 == f67213toq) {
                gvn7Var.m13595l(iKja0);
                return m13846n(gvn7Var);
            }
            gvn7Var.n5r1(iKja0);
            iM13596n = iKja0;
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static C3886n m13845k(byte[] bArr, int i2) {
        ArrayList<C3886n.toq> arrayListM13844g;
        gvn7 gvn7Var = new gvn7(bArr);
        try {
            arrayListM13844g = zy(gvn7Var) ? m13844g(gvn7Var) : m13846n(gvn7Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListM13844g = null;
        }
        if (arrayListM13844g == null) {
            return null;
        }
        int size = arrayListM13844g.size();
        if (size == 1) {
            return new C3886n(arrayListM13844g.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new C3886n(arrayListM13844g.get(0), arrayListM13844g.get(1), i2);
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static ArrayList<C3886n.toq> m13846n(gvn7 gvn7Var) {
        if (gvn7Var.jp0y() != 0) {
            return null;
        }
        gvn7Var.hyr(7);
        int iKja0 = gvn7Var.kja0();
        if (iKja0 == f23513q) {
            gvn7 gvn7Var2 = new gvn7();
            Inflater inflater = new Inflater(true);
            try {
                if (!lrht.vq(gvn7Var, gvn7Var2, inflater)) {
                    return null;
                }
                inflater.end();
                gvn7Var = gvn7Var2;
            } finally {
                inflater.end();
            }
        } else if (iKja0 != f67214zy) {
            return null;
        }
        return f7l8(gvn7Var);
    }

    @dd
    /* JADX INFO: renamed from: q */
    private static C3886n.toq m13847q(gvn7 gvn7Var) {
        int iKja0 = gvn7Var.kja0();
        if (iKja0 > 10000) {
            return null;
        }
        float[] fArr = new float[iKja0];
        for (int i2 = 0; i2 < iKja0; i2++) {
            fArr[i2] = gvn7Var.n7h();
        }
        int iKja02 = gvn7Var.kja0();
        if (iKja02 > f23515y) {
            return null;
        }
        double d2 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iKja0) * 2.0d) / dLog);
        jp0y jp0yVar = new jp0y(gvn7Var.m13598q());
        int i3 = 8;
        jp0yVar.cdj(gvn7Var.m13596n() * 8);
        float[] fArr2 = new float[iKja02 * 5];
        int i4 = 5;
        int[] iArr = new int[5];
        int i5 = 0;
        int i6 = 0;
        while (i5 < iKja02) {
            int i7 = 0;
            while (i7 < i4) {
                int qVar = iArr[i7] + toq(jp0yVar.m13627y(iCeil));
                if (qVar >= iKja0 || qVar < 0) {
                    return null;
                }
                fArr2[i6] = fArr[qVar];
                iArr[i7] = qVar;
                i7++;
                i6++;
                i4 = 5;
            }
            i5++;
            i4 = 5;
        }
        jp0yVar.cdj((jp0yVar.m13623n() + 7) & (-8));
        int i8 = 32;
        int iM13627y = jp0yVar.m13627y(32);
        C3886n.zy[] zyVarArr = new C3886n.zy[iM13627y];
        int i9 = 0;
        while (i9 < iM13627y) {
            int iM13627y2 = jp0yVar.m13627y(i3);
            int iM13627y3 = jp0yVar.m13627y(i3);
            int iM13627y4 = jp0yVar.m13627y(i8);
            if (iM13627y4 > f23514s) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iKja02) * d2) / dLog);
            float[] fArr3 = new float[iM13627y4 * 3];
            float[] fArr4 = new float[iM13627y4 * 2];
            int qVar2 = 0;
            for (int i10 = 0; i10 < iM13627y4; i10++) {
                qVar2 += toq(jp0yVar.m13627y(iCeil2));
                if (qVar2 < 0 || qVar2 >= iKja02) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = qVar2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            zyVarArr[i9] = new C3886n.zy(iM13627y2, fArr3, fArr4, iM13627y3);
            i9++;
            i8 = 32;
            d2 = 2.0d;
            i3 = 8;
        }
        return new C3886n.toq(zyVarArr);
    }

    private static int toq(int i2) {
        return (-(i2 & 1)) ^ (i2 >> 1);
    }

    private static boolean zy(gvn7 gvn7Var) {
        gvn7Var.hyr(4);
        int iKja0 = gvn7Var.kja0();
        gvn7Var.n5r1(0);
        return iKja0 == 1886547818;
    }
}

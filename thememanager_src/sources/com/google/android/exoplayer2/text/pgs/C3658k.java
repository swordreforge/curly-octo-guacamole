package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.pgs.k */
/* JADX INFO: compiled from: PgsDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3658k extends AbstractC3653g {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f65706fn3e = 22;

    /* JADX INFO: renamed from: i */
    private static final int f21930i = 21;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final byte f65707ni7 = 120;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f65708t8r = 20;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f65709zurt = 128;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final k f65710cdj;

    /* JADX INFO: renamed from: h */
    private final gvn7 f21931h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private Inflater f65711ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final gvn7 f65712kja0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.pgs.k$k */
    /* JADX INFO: compiled from: PgsDecoder.java */
    private static final class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f65713f7l8;

        /* JADX INFO: renamed from: g */
        private int f21932g;

        /* JADX INFO: renamed from: n */
        private int f21934n;

        /* JADX INFO: renamed from: q */
        private int f21935q;

        /* JADX INFO: renamed from: s */
        private int f21936s;

        /* JADX INFO: renamed from: y */
        private int f21937y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f65715zy;

        /* JADX INFO: renamed from: k */
        private final gvn7 f21933k = new gvn7();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int[] f65714toq = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void f7l8(gvn7 gvn7Var, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            gvn7Var.hyr(2);
            Arrays.fill(this.f65714toq, 0);
            int i3 = i2 / 5;
            int i4 = 0;
            while (i4 < i3) {
                int iJp0y = gvn7Var.jp0y();
                int iJp0y2 = gvn7Var.jp0y();
                int iJp0y3 = gvn7Var.jp0y();
                int iJp0y4 = gvn7Var.jp0y();
                int iJp0y5 = gvn7Var.jp0y();
                double d2 = iJp0y2;
                double d4 = iJp0y3 - 128;
                int i5 = (int) ((1.402d * d4) + d2);
                int i6 = i4;
                double d5 = iJp0y4 - 128;
                this.f65714toq[iJp0y] = lrht.t8r((int) (d2 + (d5 * 1.772d)), 0, 255) | (lrht.t8r((int) ((d2 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255) << 8) | (iJp0y5 << 24) | (lrht.t8r(i5, 0, 255) << 16);
                i4 = i6 + 1;
            }
            this.f65715zy = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m12916g(gvn7 gvn7Var, int i2) {
            if (i2 < 19) {
                return;
            }
            this.f21935q = gvn7Var.lvui();
            this.f21934n = gvn7Var.lvui();
            gvn7Var.hyr(11);
            this.f21932g = gvn7Var.lvui();
            this.f65713f7l8 = gvn7Var.lvui();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m12918n(gvn7 gvn7Var, int i2) {
            int iOc;
            if (i2 < 4) {
                return;
            }
            gvn7Var.hyr(3);
            int i3 = i2 - 4;
            if ((gvn7Var.jp0y() & 128) != 0) {
                if (i3 < 7 || (iOc = gvn7Var.oc()) < 4) {
                    return;
                }
                this.f21937y = gvn7Var.lvui();
                this.f21936s = gvn7Var.lvui();
                this.f21933k.dd(iOc - 4);
                i3 -= 7;
            }
            int iM13596n = this.f21933k.m13596n();
            int iM13591g = this.f21933k.m13591g();
            if (iM13596n >= iM13591g || i3 <= 0) {
                return;
            }
            int iMin = Math.min(i3, iM13591g - iM13596n);
            gvn7Var.ld6(this.f21933k.m13598q(), iM13596n, iMin);
            this.f21933k.n5r1(iM13596n + iMin);
        }

        @dd
        /* JADX INFO: renamed from: q */
        public com.google.android.exoplayer2.text.toq m12919q() {
            int iJp0y;
            if (this.f21935q == 0 || this.f21934n == 0 || this.f21937y == 0 || this.f21936s == 0 || this.f21933k.m13591g() == 0 || this.f21933k.m13596n() != this.f21933k.m13591g() || !this.f65715zy) {
                return null;
            }
            this.f21933k.n5r1(0);
            int i2 = this.f21937y * this.f21936s;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int iJp0y2 = this.f21933k.jp0y();
                if (iJp0y2 != 0) {
                    iJp0y = i3 + 1;
                    iArr[i3] = this.f65714toq[iJp0y2];
                } else {
                    int iJp0y3 = this.f21933k.jp0y();
                    if (iJp0y3 != 0) {
                        iJp0y = ((iJp0y3 & 64) == 0 ? iJp0y3 & 63 : ((iJp0y3 & 63) << 8) | this.f21933k.jp0y()) + i3;
                        Arrays.fill(iArr, i3, iJp0y, (iJp0y3 & 128) == 0 ? 0 : this.f65714toq[this.f21933k.jp0y()]);
                    }
                }
                i3 = iJp0y;
            }
            return new toq.zy().ki(Bitmap.createBitmap(iArr, this.f21937y, this.f21936s, Bitmap.Config.ARGB_8888)).ni7(this.f21932g / this.f21935q).fu4(0).m12937i(this.f65713f7l8 / this.f21934n, 0).fn3e(0).o1t(this.f21937y / this.f21935q).t8r(this.f21936s / this.f21934n).m12938k();
        }

        /* JADX INFO: renamed from: y */
        public void m12920y() {
            this.f21935q = 0;
            this.f21934n = 0;
            this.f21932g = 0;
            this.f65713f7l8 = 0;
            this.f21937y = 0;
            this.f21936s = 0;
            this.f21933k.dd(0);
            this.f65715zy = false;
        }
    }

    public C3658k() {
        super("PgsDecoder");
        this.f65712kja0 = new gvn7();
        this.f21931h = new gvn7();
        this.f65710cdj = new k();
    }

    @dd
    private static com.google.android.exoplayer2.text.toq mcp(gvn7 gvn7Var, k kVar) {
        int iM13591g = gvn7Var.m13591g();
        int iJp0y = gvn7Var.jp0y();
        int iLvui = gvn7Var.lvui();
        int iM13596n = gvn7Var.m13596n() + iLvui;
        com.google.android.exoplayer2.text.toq toqVarM12919q = null;
        if (iM13596n > iM13591g) {
            gvn7Var.n5r1(iM13591g);
            return null;
        }
        if (iJp0y != 128) {
            switch (iJp0y) {
                case 20:
                    kVar.f7l8(gvn7Var, iLvui);
                    break;
                case 21:
                    kVar.m12918n(gvn7Var, iLvui);
                    break;
                case 22:
                    kVar.m12916g(gvn7Var, iLvui);
                    break;
            }
        } else {
            toqVarM12919q = kVar.m12919q();
            kVar.m12920y();
        }
        gvn7Var.n5r1(iM13596n);
        return toqVarM12919q;
    }

    /* JADX INFO: renamed from: t */
    private void m12915t(gvn7 gvn7Var) {
        if (gvn7Var.m13594k() <= 0 || gvn7Var.m13602y() != 120) {
            return;
        }
        if (this.f65711ki == null) {
            this.f65711ki = new Inflater();
        }
        if (lrht.vq(gvn7Var, this.f21931h, this.f65711ki)) {
            gvn7Var.ncyb(this.f21931h.m13598q(), this.f21931h.m13591g());
        }
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected f7l8 o1t(byte[] bArr, int i2, boolean z2) throws C3660s {
        this.f65712kja0.ncyb(bArr, i2);
        m12915t(this.f65712kja0);
        this.f65710cdj.m12920y();
        ArrayList arrayList = new ArrayList();
        while (this.f65712kja0.m13594k() >= 3) {
            com.google.android.exoplayer2.text.toq toqVarMcp = mcp(this.f65712kja0, this.f65710cdj);
            if (toqVarMcp != null) {
                arrayList.add(toqVarMcp);
            }
        }
        return new toq(Collections.unmodifiableList(arrayList));
    }
}

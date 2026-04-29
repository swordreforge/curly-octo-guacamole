package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.trackselection.C3708k;
import com.google.android.exoplayer2.util.jp0y;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f65655cdj = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f65656fn3e = 18;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f65657fu4 = 34;

    /* JADX INFO: renamed from: h */
    private static final int f21857h = 3;

    /* JADX INFO: renamed from: i */
    private static final int f21858i = 17;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f65658ki = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f65659kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f65660ld6 = 18;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f65661n7h = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f65662ni7 = 33;

    /* JADX INFO: renamed from: p */
    private static final int f21859p = 17;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f65664qrj = 20;

    /* JADX INFO: renamed from: s */
    private static final int f21860s = 16;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f65665t8r = 16;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f65667x2 = 19;

    /* JADX INFO: renamed from: y */
    private static final String f21862y = "DvbParser";

    /* JADX INFO: renamed from: z */
    private static final int f21863z = 240;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f65668zurt = 32;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Bitmap f65669f7l8;

    /* JADX INFO: renamed from: g */
    private final C3652y f21864g;

    /* JADX INFO: renamed from: k */
    private final Paint f21865k;

    /* JADX INFO: renamed from: n */
    private final C3649k f21866n;

    /* JADX INFO: renamed from: q */
    private final C7961toq f21867q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Paint f65670toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Canvas f65671zy;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final byte[] f65663o1t = {0, 7, 8, com.google.common.base.zy.f68111cdj};

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final byte[] f65666wvg = {0, 119, -120, -1};

    /* JADX INFO: renamed from: t */
    private static final byte[] f21861t = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class f7l8 {

        /* JADX INFO: renamed from: g */
        public final int f21868g;

        /* JADX INFO: renamed from: k */
        public final int f21869k;

        /* JADX INFO: renamed from: n */
        public final int f21870n;

        /* JADX INFO: renamed from: q */
        public final int f21871q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65672toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f65673zy;

        public f7l8(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f21869k = i2;
            this.f65672toq = i3;
            this.f65673zy = i4;
            this.f21871q = i5;
            this.f21870n = i6;
            this.f21868g = i7;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.toq$g */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C3648g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final int f65674f7l8;

        /* JADX INFO: renamed from: g */
        public final int f21872g;

        /* JADX INFO: renamed from: k */
        public final int f21873k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public final SparseArray<f7l8> f65675ld6;

        /* JADX INFO: renamed from: n */
        public final int f21874n;

        /* JADX INFO: renamed from: p */
        public final int f21875p;

        /* JADX INFO: renamed from: q */
        public final int f21876q;

        /* JADX INFO: renamed from: s */
        public final int f21877s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f65676toq;

        /* JADX INFO: renamed from: y */
        public final int f21878y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f65677zy;

        public C3648g(int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<f7l8> sparseArray) {
            this.f21873k = i2;
            this.f65676toq = z2;
            this.f65677zy = i3;
            this.f21876q = i4;
            this.f21874n = i5;
            this.f21872g = i6;
            this.f65674f7l8 = i7;
            this.f21878y = i8;
            this.f21877s = i9;
            this.f21875p = i10;
            this.f65675ld6 = sparseArray;
        }

        /* JADX INFO: renamed from: k */
        public void m12901k(C3648g c3648g) {
            SparseArray<f7l8> sparseArray = c3648g.f65675ld6;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.f65675ld6.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.toq$k */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C3649k {

        /* JADX INFO: renamed from: k */
        public final int f21879k;

        /* JADX INFO: renamed from: q */
        public final int[] f21880q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int[] f65678toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int[] f65679zy;

        public C3649k(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f21879k = i2;
            this.f65678toq = iArr;
            this.f65679zy = iArr2;
            this.f21880q = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.toq$n */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C3650n {

        /* JADX INFO: renamed from: k */
        public final int f21881k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65680toq;

        public C3650n(int i2, int i3) {
            this.f21881k = i2;
            this.f65680toq = i3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.toq$q */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C3651q {

        /* JADX INFO: renamed from: k */
        public final int f21882k;

        /* JADX INFO: renamed from: q */
        public final SparseArray<C3650n> f21883q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65681toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f65682zy;

        public C3651q(int i2, int i3, int i4, SparseArray<C3650n> sparseArray) {
            this.f21882k = i2;
            this.f65681toq = i3;
            this.f65682zy = i4;
            this.f21883q = sparseArray;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C7961toq {

        /* JADX INFO: renamed from: g */
        public final int f21884g;

        /* JADX INFO: renamed from: k */
        public final int f21885k;

        /* JADX INFO: renamed from: n */
        public final int f21886n;

        /* JADX INFO: renamed from: q */
        public final int f21887q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65683toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f65684zy;

        public C7961toq(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f21885k = i2;
            this.f65683toq = i3;
            this.f65684zy = i4;
            this.f21887q = i5;
            this.f21886n = i6;
            this.f21884g = i7;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.toq$y */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C3652y {

        /* JADX INFO: renamed from: k */
        public final int f21889k;

        /* JADX INFO: renamed from: s */
        @dd
        public C3651q f21892s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f65686toq;

        /* JADX INFO: renamed from: y */
        @dd
        public C7961toq f21893y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final SparseArray<C3648g> f65687zy = new SparseArray<>();

        /* JADX INFO: renamed from: q */
        public final SparseArray<C3649k> f21891q = new SparseArray<>();

        /* JADX INFO: renamed from: n */
        public final SparseArray<zy> f21890n = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<C3649k> f21888g = new SparseArray<>();

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final SparseArray<zy> f65685f7l8 = new SparseArray<>();

        public C3652y(int i2, int i3) {
            this.f21889k = i2;
            this.f65686toq = i3;
        }

        /* JADX INFO: renamed from: k */
        public void m12902k() {
            this.f65687zy.clear();
            this.f21891q.clear();
            this.f21890n.clear();
            this.f21888g.clear();
            this.f65685f7l8.clear();
            this.f21893y = null;
            this.f21892s = null;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class zy {

        /* JADX INFO: renamed from: k */
        public final int f21894k;

        /* JADX INFO: renamed from: q */
        public final byte[] f21895q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f65688toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final byte[] f65689zy;

        public zy(int i2, boolean z2, byte[] bArr, byte[] bArr2) {
            this.f21894k = i2;
            this.f65688toq = z2;
            this.f65689zy = bArr;
            this.f21895q = bArr2;
        }
    }

    public toq(int i2, int i3) {
        Paint paint = new Paint();
        this.f21865k = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f65670toq = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f65671zy = new Canvas();
        this.f21867q = new C7961toq(C3708k.f66031jk, 575, 0, C3708k.f66031jk, 0, 575);
        this.f21866n = new C3649k(0, zy(), m12898q(), m12896n());
        this.f21864g = new C3652y(i2, i3);
    }

    private static void cdj(jp0y jp0yVar, C3652y c3652y) {
        C3648g c3648g;
        int iM13627y = jp0yVar.m13627y(8);
        int iM13627y2 = jp0yVar.m13627y(16);
        int iM13627y3 = jp0yVar.m13627y(16);
        int iM13625q = jp0yVar.m13625q() + iM13627y3;
        if (iM13627y3 * 8 > jp0yVar.toq()) {
            ni7.qrj(f21862y, "Data field length exceeds limit");
            jp0yVar.t8r(jp0yVar.toq());
            return;
        }
        switch (iM13627y) {
            case 16:
                if (iM13627y2 == c3652y.f21889k) {
                    C3651q c3651q = c3652y.f21892s;
                    C3651q c3651qKja0 = kja0(jp0yVar, iM13627y3);
                    if (c3651qKja0.f65682zy != 0) {
                        c3652y.f21892s = c3651qKja0;
                        c3652y.f65687zy.clear();
                        c3652y.f21891q.clear();
                        c3652y.f21890n.clear();
                    } else if (c3651q != null && c3651q.f65681toq != c3651qKja0.f65681toq) {
                        c3652y.f21892s = c3651qKja0;
                    }
                }
                break;
            case 17:
                C3651q c3651q2 = c3652y.f21892s;
                if (iM13627y2 == c3652y.f21889k && c3651q2 != null) {
                    C3648g c3648gM12894h = m12894h(jp0yVar, iM13627y3);
                    if (c3651q2.f65682zy == 0 && (c3648g = c3652y.f65687zy.get(c3648gM12894h.f21873k)) != null) {
                        c3648gM12894h.m12901k(c3648g);
                    }
                    c3652y.f65687zy.put(c3648gM12894h.f21873k, c3648gM12894h);
                }
                break;
            case 18:
                if (iM13627y2 == c3652y.f21889k) {
                    C3649k c3649kX2 = x2(jp0yVar, iM13627y3);
                    c3652y.f21891q.put(c3649kX2.f21879k, c3649kX2);
                } else if (iM13627y2 == c3652y.f65686toq) {
                    C3649k c3649kX22 = x2(jp0yVar, iM13627y3);
                    c3652y.f21888g.put(c3649kX22.f21879k, c3649kX22);
                }
                break;
            case 19:
                if (iM13627y2 == c3652y.f21889k) {
                    zy zyVarN7h = n7h(jp0yVar);
                    c3652y.f21890n.put(zyVarN7h.f21894k, zyVarN7h);
                } else if (iM13627y2 == c3652y.f65686toq) {
                    zy zyVarN7h2 = n7h(jp0yVar);
                    c3652y.f65685f7l8.put(zyVarN7h2.f21894k, zyVarN7h2);
                }
                break;
            case 20:
                if (iM13627y2 == c3652y.f21889k) {
                    c3652y.f21893y = qrj(jp0yVar);
                }
                break;
        }
        jp0yVar.m13622i(iM13625q - jp0yVar.m13625q());
    }

    private static int f7l8(jp0y jp0yVar, int[] iArr, @dd byte[] bArr, int i2, int i3, @dd Paint paint, Canvas canvas) {
        boolean z2;
        int i4;
        int iM13627y;
        int iM13627y2;
        int i5 = i2;
        boolean z3 = false;
        while (true) {
            int iM13627y3 = jp0yVar.m13627y(2);
            if (iM13627y3 != 0) {
                z2 = z3;
                i4 = 1;
            } else {
                if (jp0yVar.f7l8()) {
                    iM13627y = jp0yVar.m13627y(3) + 3;
                    iM13627y2 = jp0yVar.m13627y(2);
                } else {
                    if (jp0yVar.f7l8()) {
                        z2 = z3;
                        i4 = 1;
                    } else {
                        int iM13627y4 = jp0yVar.m13627y(2);
                        if (iM13627y4 == 0) {
                            z2 = true;
                        } else if (iM13627y4 == 1) {
                            z2 = z3;
                            i4 = 2;
                        } else if (iM13627y4 == 2) {
                            iM13627y = jp0yVar.m13627y(4) + 12;
                            iM13627y2 = jp0yVar.m13627y(2);
                        } else if (iM13627y4 != 3) {
                            z2 = z3;
                        } else {
                            iM13627y = jp0yVar.m13627y(8) + 29;
                            iM13627y2 = jp0yVar.m13627y(2);
                        }
                        iM13627y3 = 0;
                        i4 = 0;
                    }
                    iM13627y3 = 0;
                }
                z2 = z3;
                i4 = iM13627y;
                iM13627y3 = iM13627y2;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iM13627y3 = bArr[iM13627y3];
                }
                paint.setColor(iArr[iM13627y3]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z2) {
                return i5;
            }
            z3 = z2;
        }
    }

    /* JADX INFO: renamed from: g */
    private static int m12893g(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX INFO: renamed from: h */
    private static C3648g m12894h(jp0y jp0yVar, int i2) {
        int iM13627y;
        int iM13627y2;
        int iM13627y3 = jp0yVar.m13627y(8);
        jp0yVar.t8r(4);
        boolean zF7l8 = jp0yVar.f7l8();
        jp0yVar.t8r(3);
        int i3 = 16;
        int iM13627y4 = jp0yVar.m13627y(16);
        int iM13627y5 = jp0yVar.m13627y(16);
        int iM13627y6 = jp0yVar.m13627y(3);
        int iM13627y7 = jp0yVar.m13627y(3);
        int i4 = 2;
        jp0yVar.t8r(2);
        int iM13627y8 = jp0yVar.m13627y(8);
        int iM13627y9 = jp0yVar.m13627y(8);
        int iM13627y10 = jp0yVar.m13627y(4);
        int iM13627y11 = jp0yVar.m13627y(2);
        jp0yVar.t8r(2);
        int i5 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int iM13627y12 = jp0yVar.m13627y(i3);
            int iM13627y13 = jp0yVar.m13627y(i4);
            int iM13627y14 = jp0yVar.m13627y(i4);
            int iM13627y15 = jp0yVar.m13627y(12);
            int i6 = iM13627y11;
            jp0yVar.t8r(4);
            int iM13627y16 = jp0yVar.m13627y(12);
            i5 -= 6;
            if (iM13627y13 == 1 || iM13627y13 == 2) {
                i5 -= 2;
                iM13627y = jp0yVar.m13627y(8);
                iM13627y2 = jp0yVar.m13627y(8);
            } else {
                iM13627y = 0;
                iM13627y2 = 0;
            }
            sparseArray.put(iM13627y12, new f7l8(iM13627y13, iM13627y14, iM13627y15, iM13627y16, iM13627y, iM13627y2));
            iM13627y11 = i6;
            i4 = 2;
            i3 = 16;
        }
        return new C3648g(iM13627y3, zF7l8, iM13627y4, iM13627y5, iM13627y6, iM13627y7, iM13627y8, iM13627y9, iM13627y10, iM13627y11, sparseArray);
    }

    /* JADX INFO: renamed from: k */
    private static byte[] m12895k(int i2, int i3, jp0y jp0yVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) jp0yVar.m13627y(i3);
        }
        return bArr;
    }

    private static C3651q kja0(jp0y jp0yVar, int i2) {
        int iM13627y = jp0yVar.m13627y(8);
        int iM13627y2 = jp0yVar.m13627y(4);
        int iM13627y3 = jp0yVar.m13627y(2);
        jp0yVar.t8r(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int iM13627y4 = jp0yVar.m13627y(8);
            jp0yVar.t8r(8);
            i3 -= 6;
            sparseArray.put(iM13627y4, new C3650n(jp0yVar.m13627y(16), jp0yVar.m13627y(16)));
        }
        return new C3651q(iM13627y, iM13627y2, iM13627y3, sparseArray);
    }

    private static void ld6(zy zyVar, C3649k c3649k, int i2, int i3, int i4, @dd Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? c3649k.f21880q : i2 == 2 ? c3649k.f65679zy : c3649k.f65678toq;
        m12897p(zyVar.f65689zy, iArr, i2, i3, i4, paint, canvas);
        m12897p(zyVar.f21895q, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    /* JADX INFO: renamed from: n */
    private static int[] m12896n() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = m12893g(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = m12893g(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = m12893g(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = m12893g(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = m12893g(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static zy n7h(jp0y jp0yVar) {
        byte[] bArr;
        int iM13627y = jp0yVar.m13627y(16);
        jp0yVar.t8r(4);
        int iM13627y2 = jp0yVar.m13627y(2);
        boolean zF7l8 = jp0yVar.f7l8();
        jp0yVar.t8r(1);
        byte[] bArr2 = lrht.f23228g;
        if (iM13627y2 != 1) {
            if (iM13627y2 == 0) {
                int iM13627y3 = jp0yVar.m13627y(16);
                int iM13627y4 = jp0yVar.m13627y(16);
                if (iM13627y3 > 0) {
                    bArr2 = new byte[iM13627y3];
                    jp0yVar.ld6(bArr2, 0, iM13627y3);
                }
                if (iM13627y4 > 0) {
                    bArr = new byte[iM13627y4];
                    jp0yVar.ld6(bArr, 0, iM13627y4);
                }
            }
            return new zy(iM13627y, zF7l8, bArr2, bArr);
        }
        jp0yVar.t8r(jp0yVar.m13627y(8) * 16);
        bArr = bArr2;
        return new zy(iM13627y, zF7l8, bArr2, bArr);
    }

    /* JADX INFO: renamed from: p */
    private static void m12897p(byte[] bArr, int[] iArr, int i2, int i3, int i4, @dd Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        jp0y jp0yVar = new jp0y(bArr);
        int iF7l8 = i3;
        int i5 = i4;
        byte[] bArrM12895k = null;
        byte[] bArrM12895k2 = null;
        byte[] bArrM12895k3 = null;
        while (jp0yVar.toq() != 0) {
            int iM13627y = jp0yVar.m13627y(8);
            if (iM13627y != 240) {
                switch (iM13627y) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArrM12895k == null ? f65666wvg : bArrM12895k;
                        } else if (i2 != 2) {
                            bArr2 = null;
                            iF7l8 = f7l8(jp0yVar, iArr, bArr2, iF7l8, i5, paint, canvas);
                            jp0yVar.zy();
                        } else {
                            bArr3 = bArrM12895k3 == null ? f65663o1t : bArrM12895k3;
                        }
                        bArr2 = bArr3;
                        iF7l8 = f7l8(jp0yVar, iArr, bArr2, iF7l8, i5, paint, canvas);
                        jp0yVar.zy();
                        break;
                    case 17:
                        iF7l8 = m12900y(jp0yVar, iArr, i2 == 3 ? bArrM12895k2 == null ? f21861t : bArrM12895k2 : null, iF7l8, i5, paint, canvas);
                        jp0yVar.zy();
                        break;
                    case 18:
                        iF7l8 = m12899s(jp0yVar, iArr, null, iF7l8, i5, paint, canvas);
                        break;
                    default:
                        switch (iM13627y) {
                            case 32:
                                bArrM12895k3 = m12895k(4, 4, jp0yVar);
                                break;
                            case 33:
                                bArrM12895k = m12895k(4, 8, jp0yVar);
                                break;
                            case 34:
                                bArrM12895k2 = m12895k(16, 8, jp0yVar);
                                break;
                        }
                        break;
                }
            } else {
                i5 += 2;
                iF7l8 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private static int[] m12898q() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = m12893g(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = m12893g(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static C7961toq qrj(jp0y jp0yVar) {
        int i2;
        int i3;
        int i4;
        int iM13627y;
        jp0yVar.t8r(4);
        boolean zF7l8 = jp0yVar.f7l8();
        jp0yVar.t8r(3);
        int iM13627y2 = jp0yVar.m13627y(16);
        int iM13627y3 = jp0yVar.m13627y(16);
        if (zF7l8) {
            int iM13627y4 = jp0yVar.m13627y(16);
            int iM13627y5 = jp0yVar.m13627y(16);
            int iM13627y6 = jp0yVar.m13627y(16);
            iM13627y = jp0yVar.m13627y(16);
            i4 = iM13627y5;
            i3 = iM13627y6;
            i2 = iM13627y4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = iM13627y2;
            iM13627y = iM13627y3;
        }
        return new C7961toq(iM13627y2, iM13627y3, i2, i4, i3, iM13627y);
    }

    /* JADX INFO: renamed from: s */
    private static int m12899s(jp0y jp0yVar, int[] iArr, @dd byte[] bArr, int i2, int i3, @dd Paint paint, Canvas canvas) {
        boolean z2;
        int iM13627y;
        int i4 = i2;
        boolean z3 = false;
        while (true) {
            int iM13627y2 = jp0yVar.m13627y(8);
            if (iM13627y2 != 0) {
                z2 = z3;
                iM13627y = 1;
            } else if (jp0yVar.f7l8()) {
                z2 = z3;
                iM13627y = jp0yVar.m13627y(7);
                iM13627y2 = jp0yVar.m13627y(8);
            } else {
                int iM13627y3 = jp0yVar.m13627y(7);
                if (iM13627y3 != 0) {
                    z2 = z3;
                    iM13627y = iM13627y3;
                    iM13627y2 = 0;
                } else {
                    z2 = true;
                    iM13627y2 = 0;
                    iM13627y = 0;
                }
            }
            if (iM13627y != 0 && paint != null) {
                if (bArr != null) {
                    iM13627y2 = bArr[iM13627y2];
                }
                paint.setColor(iArr[iM13627y2]);
                canvas.drawRect(i4, i3, i4 + iM13627y, i3 + 1, paint);
            }
            i4 += iM13627y;
            if (z2) {
                return i4;
            }
            z3 = z2;
        }
    }

    private static C3649k x2(jp0y jp0yVar, int i2) {
        int iM13627y;
        int i3;
        int iM13627y2;
        int iM13627y3;
        int iM13627y4;
        int i4 = 8;
        int iM13627y5 = jp0yVar.m13627y(8);
        jp0yVar.t8r(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int[] iArrZy = zy();
        int[] iArrM12898q = m12898q();
        int[] iArrM12896n = m12896n();
        while (i6 > 0) {
            int iM13627y6 = jp0yVar.m13627y(i4);
            int iM13627y7 = jp0yVar.m13627y(i4);
            int i7 = i6 - 2;
            int[] iArr = (iM13627y7 & 128) != 0 ? iArrZy : (iM13627y7 & 64) != 0 ? iArrM12898q : iArrM12896n;
            if ((iM13627y7 & 1) != 0) {
                iM13627y3 = jp0yVar.m13627y(i4);
                iM13627y4 = jp0yVar.m13627y(i4);
                iM13627y = jp0yVar.m13627y(i4);
                iM13627y2 = jp0yVar.m13627y(i4);
                i3 = i7 - 4;
            } else {
                int iM13627y8 = jp0yVar.m13627y(6) << i5;
                int iM13627y9 = jp0yVar.m13627y(4) << 4;
                iM13627y = jp0yVar.m13627y(4) << 4;
                i3 = i7 - 2;
                iM13627y2 = jp0yVar.m13627y(i5) << 6;
                iM13627y3 = iM13627y8;
                iM13627y4 = iM13627y9;
            }
            if (iM13627y3 == 0) {
                iM13627y2 = 255;
                iM13627y4 = 0;
                iM13627y = 0;
            }
            double d2 = iM13627y3;
            double d4 = iM13627y4 - 128;
            double d5 = iM13627y - 128;
            iArr[iM13627y6] = m12893g((byte) (255 - (iM13627y2 & 255)), lrht.t8r((int) (d2 + (1.402d * d4)), 0, 255), lrht.t8r((int) ((d2 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), lrht.t8r((int) (d2 + (d5 * 1.772d)), 0, 255));
            i6 = i3;
            iM13627y5 = iM13627y5;
            i4 = 8;
            i5 = 2;
        }
        return new C3649k(iM13627y5, iArrZy, iArrM12898q, iArrM12896n);
    }

    /* JADX INFO: renamed from: y */
    private static int m12900y(jp0y jp0yVar, int[] iArr, @dd byte[] bArr, int i2, int i3, @dd Paint paint, Canvas canvas) {
        boolean z2;
        int i4;
        int iM13627y;
        int i5 = i2;
        boolean z3 = false;
        while (true) {
            int iM13627y2 = jp0yVar.m13627y(4);
            int i6 = 2;
            if (iM13627y2 != 0) {
                z2 = z3;
                i4 = 1;
            } else if (jp0yVar.f7l8()) {
                if (jp0yVar.f7l8()) {
                    int iM13627y3 = jp0yVar.m13627y(2);
                    if (iM13627y3 != 0) {
                        if (iM13627y3 != 1) {
                            if (iM13627y3 == 2) {
                                iM13627y = jp0yVar.m13627y(4) + 9;
                                iM13627y2 = jp0yVar.m13627y(4);
                            } else if (iM13627y3 != 3) {
                                z2 = z3;
                                iM13627y2 = 0;
                                i4 = 0;
                            } else {
                                iM13627y = jp0yVar.m13627y(8) + 25;
                                iM13627y2 = jp0yVar.m13627y(4);
                            }
                        }
                        z2 = z3;
                        i4 = i6;
                        iM13627y2 = 0;
                    } else {
                        z2 = z3;
                        i4 = 1;
                        iM13627y2 = 0;
                    }
                } else {
                    iM13627y = jp0yVar.m13627y(2) + 4;
                    iM13627y2 = jp0yVar.m13627y(4);
                }
                z2 = z3;
                i4 = iM13627y;
            } else {
                int iM13627y4 = jp0yVar.m13627y(3);
                if (iM13627y4 != 0) {
                    i6 = iM13627y4 + 2;
                    z2 = z3;
                    i4 = i6;
                    iM13627y2 = 0;
                } else {
                    z2 = true;
                    iM13627y2 = 0;
                    i4 = 0;
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iM13627y2 = bArr[iM13627y2];
                }
                paint.setColor(iArr[iM13627y2]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z2) {
                return i5;
            }
            z3 = z2;
        }
    }

    private static int[] zy() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public void ki() {
        this.f21864g.m12902k();
    }

    public List<com.google.android.exoplayer2.text.toq> toq(byte[] bArr, int i2) {
        int i3;
        SparseArray<f7l8> sparseArray;
        jp0y jp0yVar = new jp0y(bArr, i2);
        while (jp0yVar.toq() >= 48 && jp0yVar.m13627y(8) == 15) {
            cdj(jp0yVar, this.f21864g);
        }
        C3652y c3652y = this.f21864g;
        C3651q c3651q = c3652y.f21892s;
        if (c3651q == null) {
            return Collections.emptyList();
        }
        C7961toq c7961toq = c3652y.f21893y;
        if (c7961toq == null) {
            c7961toq = this.f21867q;
        }
        Bitmap bitmap = this.f65669f7l8;
        if (bitmap == null || c7961toq.f21885k + 1 != bitmap.getWidth() || c7961toq.f65683toq + 1 != this.f65669f7l8.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c7961toq.f21885k + 1, c7961toq.f65683toq + 1, Bitmap.Config.ARGB_8888);
            this.f65669f7l8 = bitmapCreateBitmap;
            this.f65671zy.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C3650n> sparseArray2 = c3651q.f21883q;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f65671zy.save();
            C3650n c3650nValueAt = sparseArray2.valueAt(i4);
            C3648g c3648g = this.f21864g.f65687zy.get(sparseArray2.keyAt(i4));
            int i5 = c3650nValueAt.f21881k + c7961toq.f65684zy;
            int i6 = c3650nValueAt.f65680toq + c7961toq.f21886n;
            this.f65671zy.clipRect(i5, i6, Math.min(c3648g.f65677zy + i5, c7961toq.f21887q), Math.min(c3648g.f21876q + i6, c7961toq.f21884g));
            C3649k c3649k = this.f21864g.f21891q.get(c3648g.f65674f7l8);
            if (c3649k == null && (c3649k = this.f21864g.f21888g.get(c3648g.f65674f7l8)) == null) {
                c3649k = this.f21866n;
            }
            SparseArray<f7l8> sparseArray3 = c3648g.f65675ld6;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i7);
                f7l8 f7l8VarValueAt = sparseArray3.valueAt(i7);
                zy zyVar = this.f21864g.f21890n.get(iKeyAt);
                zy zyVar2 = zyVar == null ? this.f21864g.f65685f7l8.get(iKeyAt) : zyVar;
                if (zyVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    ld6(zyVar2, c3649k, c3648g.f21872g, f7l8VarValueAt.f65673zy + i5, i6 + f7l8VarValueAt.f21871q, zyVar2.f65688toq ? null : this.f21865k, this.f65671zy);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (c3648g.f65676toq) {
                int i8 = c3648g.f21872g;
                this.f65670toq.setColor(i8 == 3 ? c3649k.f21880q[c3648g.f21878y] : i8 == 2 ? c3649k.f65679zy[c3648g.f21877s] : c3649k.f65678toq[c3648g.f21875p]);
                this.f65671zy.drawRect(i5, i6, c3648g.f65677zy + i5, c3648g.f21876q + i6, this.f65670toq);
            }
            arrayList.add(new toq.zy().ki(Bitmap.createBitmap(this.f65669f7l8, i5, i6, c3648g.f65677zy, c3648g.f21876q)).ni7(i5 / c7961toq.f21885k).fu4(0).m12937i(i6 / c7961toq.f65683toq, 0).fn3e(0).o1t(c3648g.f65677zy / c7961toq.f21885k).t8r(c3648g.f21876q / c7961toq.f65683toq).m12938k());
            this.f65671zy.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f65671zy.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }
}

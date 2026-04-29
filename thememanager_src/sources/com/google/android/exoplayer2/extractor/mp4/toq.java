package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.fn3e;
import com.google.android.exoplayer2.extractor.mp4.AbstractC3373k;
import com.google.android.exoplayer2.extractor.ts.wvg;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.video.C3873k;
import com.google.android.exoplayer2.video.C3874n;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.se;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64285f7l8 = 1935832172;

    /* JADX INFO: renamed from: g */
    private static final int f20062g = 1852009592;

    /* JADX INFO: renamed from: k */
    private static final String f20063k = "AtomParsers";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f64286ld6 = 1986618469;

    /* JADX INFO: renamed from: n */
    private static final int f20064n = 1852009571;

    /* JADX INFO: renamed from: p */
    private static final int f20065p = 1952807028;

    /* JADX INFO: renamed from: q */
    private static final int f20066q = 1835365473;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final byte[] f64287qrj = lrht.dr("OpusHead");

    /* JADX INFO: renamed from: s */
    private static final int f20067s = 1937072756;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f64288toq = 1668047728;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64289x2 = 4;

    /* JADX INFO: renamed from: y */
    private static final int f20068y = 1936684398;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f64290zy = 1835299937;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.toq$g */
    /* JADX INFO: compiled from: AtomParsers.java */
    private static final class C3381g {

        /* JADX INFO: renamed from: k */
        private final int f20069k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f64291toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f64292zy;

        public C3381g(int i2, long j2, int i3) {
            this.f20069k = i2;
            this.f64291toq = j2;
            this.f64292zy = i3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.toq$k */
    /* JADX INFO: compiled from: AtomParsers.java */
    private static final class C3382k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final gvn7 f64293f7l8;

        /* JADX INFO: renamed from: g */
        private final gvn7 f20070g;

        /* JADX INFO: renamed from: k */
        public final int f20071k;

        /* JADX INFO: renamed from: n */
        private final boolean f20072n;

        /* JADX INFO: renamed from: q */
        public long f20073q;

        /* JADX INFO: renamed from: s */
        private int f20074s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f64294toq;

        /* JADX INFO: renamed from: y */
        private int f20075y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f64295zy;

        public C3382k(gvn7 gvn7Var, gvn7 gvn7Var2, boolean z2) throws sok {
            this.f64293f7l8 = gvn7Var;
            this.f20070g = gvn7Var2;
            this.f20072n = z2;
            gvn7Var2.n5r1(12);
            this.f20071k = gvn7Var2.eqxt();
            gvn7Var.n5r1(12);
            this.f20074s = gvn7Var.eqxt();
            com.google.android.exoplayer2.extractor.qrj.m11923k(gvn7Var.kja0() == 1, "first_chunk must be 1");
            this.f64294toq = -1;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11881k() {
            int i2 = this.f64294toq + 1;
            this.f64294toq = i2;
            if (i2 == this.f20071k) {
                return false;
            }
            this.f20073q = this.f20072n ? this.f20070g.d2ok() : this.f20070g.d3();
            if (this.f64294toq == this.f20075y) {
                this.f64295zy = this.f64293f7l8.eqxt();
                this.f64293f7l8.hyr(4);
                int i3 = this.f20074s - 1;
                this.f20074s = i3;
                this.f20075y = i3 > 0 ? this.f64293f7l8.eqxt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.toq$n */
    /* JADX INFO: compiled from: AtomParsers.java */
    static final class C3383n implements InterfaceC7954toq {

        /* JADX INFO: renamed from: k */
        private final gvn7 f20076k;

        /* JADX INFO: renamed from: n */
        private int f20077n;

        /* JADX INFO: renamed from: q */
        private int f20078q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f64296toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f64297zy;

        public C3383n(AbstractC3373k.toq toqVar) {
            gvn7 gvn7Var = toqVar.f64230n2t;
            this.f20076k = gvn7Var;
            gvn7Var.n5r1(12);
            this.f64297zy = gvn7Var.eqxt() & 255;
            this.f64296toq = gvn7Var.eqxt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.toq.InterfaceC7954toq
        /* JADX INFO: renamed from: k */
        public int mo11882k() {
            int i2 = this.f64297zy;
            if (i2 == 8) {
                return this.f20076k.jp0y();
            }
            if (i2 == 16) {
                return this.f20076k.lvui();
            }
            int i3 = this.f20078q;
            this.f20078q = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f20077n & 15;
            }
            int iJp0y = this.f20076k.jp0y();
            this.f20077n = iJp0y;
            return (iJp0y & wvg.f64659wvg) >> 4;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.toq.InterfaceC7954toq
        public int toq() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.toq.InterfaceC7954toq
        public int zy() {
            return this.f64296toq;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.toq$q */
    /* JADX INFO: compiled from: AtomParsers.java */
    static final class C3384q implements InterfaceC7954toq {

        /* JADX INFO: renamed from: k */
        private final int f20079k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f64298toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final gvn7 f64299zy;

        public C3384q(AbstractC3373k.toq toqVar, xwq3 xwq3Var) {
            gvn7 gvn7Var = toqVar.f64230n2t;
            this.f64299zy = gvn7Var;
            gvn7Var.n5r1(12);
            int iEqxt = gvn7Var.eqxt();
            if (com.google.android.exoplayer2.util.wvg.f67095d3.equals(xwq3Var.f23682r)) {
                int iM13674x = lrht.m13674x(xwq3Var.f23687w, xwq3Var.f23686v);
                if (iEqxt == 0 || iEqxt % iM13674x != 0) {
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(iM13674x);
                    sb.append(", stsz sample size: ");
                    sb.append(iEqxt);
                    ni7.qrj(toq.f20063k, sb.toString());
                    iEqxt = iM13674x;
                }
            }
            this.f20079k = iEqxt == 0 ? -1 : iEqxt;
            this.f64298toq = gvn7Var.eqxt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.toq.InterfaceC7954toq
        /* JADX INFO: renamed from: k */
        public int mo11882k() {
            int i2 = this.f20079k;
            return i2 == -1 ? this.f64299zy.eqxt() : i2;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.toq.InterfaceC7954toq
        public int toq() {
            return this.f20079k;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.toq.InterfaceC7954toq
        public int zy() {
            return this.f64298toq;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    private interface InterfaceC7954toq {
        /* JADX INFO: renamed from: k */
        int mo11882k();

        int toq();

        int zy();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    private static final class zy {

        /* JADX INFO: renamed from: n */
        public static final int f20080n = 8;

        /* JADX INFO: renamed from: k */
        public final C3372h[] f20081k;

        /* JADX INFO: renamed from: q */
        public int f20082q = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        public xwq3 f64300toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f64301zy;

        public zy(int i2) {
            this.f20081k = new C3372h[i2];
        }
    }

    private toq() {
    }

    private static float cdj(gvn7 gvn7Var, int i2) {
        gvn7Var.n5r1(i2 + 8);
        return gvn7Var.eqxt() / gvn7Var.eqxt();
    }

    @dd
    static Pair<Integer, C3372h> f7l8(gvn7 gvn7Var, int i2, int i3) throws sok {
        int i4 = i2 + 8;
        int i5 = -1;
        String strJk = null;
        Integer numValueOf = null;
        int i6 = 0;
        while (i4 - i2 < i3) {
            gvn7Var.n5r1(i4);
            int iKja0 = gvn7Var.kja0();
            int iKja02 = gvn7Var.kja0();
            if (iKja02 == 1718775137) {
                numValueOf = Integer.valueOf(gvn7Var.kja0());
            } else if (iKja02 == 1935894637) {
                gvn7Var.hyr(4);
                strJk = gvn7Var.jk(4);
            } else if (iKja02 == 1935894633) {
                i5 = i4;
                i6 = iKja0;
            }
            i4 += iKja0;
        }
        if (!C3548p.f65236oki.equals(strJk) && !C3548p.f65231o05.equals(strJk) && !C3548p.f65214m58i.equals(strJk) && !C3548p.f65146cnbm.equals(strJk)) {
            return null;
        }
        com.google.android.exoplayer2.extractor.qrj.m11923k(numValueOf != null, "frma atom is mandatory");
        com.google.android.exoplayer2.extractor.qrj.m11923k(i5 != -1, "schi atom is mandatory");
        C3372h c3372hM11871i = m11871i(gvn7Var, i5, i6, strJk);
        com.google.android.exoplayer2.extractor.qrj.m11923k(c3372hM11871i != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (C3372h) lrht.ld6(c3372hM11871i));
    }

    @dd
    private static Metadata fn3e(gvn7 gvn7Var, int i2) {
        gvn7Var.hyr(12);
        while (gvn7Var.m13596n() < i2) {
            int iM13596n = gvn7Var.m13596n();
            int iKja0 = gvn7Var.kja0();
            if (gvn7Var.kja0() == 1935766900) {
                if (iKja0 < 14) {
                    return null;
                }
                gvn7Var.hyr(5);
                int iJp0y = gvn7Var.jp0y();
                if (iJp0y != 12 && iJp0y != 13) {
                    return null;
                }
                float f2 = iJp0y == 12 ? 240.0f : 120.0f;
                gvn7Var.hyr(1);
                return new Metadata(new SmtaMetadataEntry(f2, gvn7Var.jp0y()));
            }
            gvn7Var.n5r1(iM13596n + iKja0);
        }
        return null;
    }

    private static void fu4(gvn7 gvn7Var, int i2, int i3, int i4, int i5, String str, zy zyVar) {
        gvn7Var.n5r1(i3 + 8 + 8);
        String str2 = com.google.android.exoplayer2.util.wvg.f23315u;
        se seVarOf = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i6 = (i4 - 8) - 8;
                byte[] bArr = new byte[i6];
                gvn7Var.ld6(bArr, 0, i6);
                seVarOf = se.of(bArr);
                str2 = com.google.android.exoplayer2.util.wvg.f67090bo;
            } else if (i2 == 2004251764) {
                str2 = com.google.android.exoplayer2.util.wvg.f67146y2;
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else {
                if (i2 != 1664495672) {
                    throw new IllegalStateException();
                }
                zyVar.f20082q = 1;
                str2 = com.google.android.exoplayer2.util.wvg.f67091c8jq;
            }
        }
        zyVar.f64300toq = new xwq3.toq().m13944l(i5).m13945m(str2).m13940c(str).m13939b(j2).hyr(seVarOf).a9();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m11869g(com.google.android.exoplayer2.util.gvn7 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, @zy.dd com.google.android.exoplayer2.drm.DrmInitData r29, com.google.android.exoplayer2.extractor.mp4.toq.zy r30, int r31) throws com.google.android.exoplayer2.sok {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.toq.m11869g(com.google.android.exoplayer2.util.gvn7, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.toq$zy, int):void");
    }

    /* JADX INFO: renamed from: h */
    private static long m11870h(gvn7 gvn7Var) {
        gvn7Var.n5r1(8);
        gvn7Var.hyr(AbstractC3373k.zy(gvn7Var.kja0()) != 0 ? 16 : 8);
        return gvn7Var.d3();
    }

    @dd
    /* JADX INFO: renamed from: i */
    private static C3372h m11871i(gvn7 gvn7Var, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            gvn7Var.n5r1(i6);
            int iKja0 = gvn7Var.kja0();
            if (gvn7Var.kja0() == 1952804451) {
                int iZy = AbstractC3373k.zy(gvn7Var.kja0());
                gvn7Var.hyr(1);
                if (iZy == 0) {
                    gvn7Var.hyr(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int iJp0y = gvn7Var.jp0y();
                    i4 = iJp0y & 15;
                    i5 = (iJp0y & wvg.f64659wvg) >> 4;
                }
                boolean z2 = gvn7Var.jp0y() == 1;
                int iJp0y2 = gvn7Var.jp0y();
                byte[] bArr2 = new byte[16];
                gvn7Var.ld6(bArr2, 0, 16);
                if (z2 && iJp0y2 == 0) {
                    int iJp0y3 = gvn7Var.jp0y();
                    bArr = new byte[iJp0y3];
                    gvn7Var.ld6(bArr, 0, iJp0y3);
                }
                return new C3372h(z2, str, iJp0y2, bArr2, i5, i4, bArr);
            }
            i6 += iKja0;
        }
    }

    private static void jk(gvn7 gvn7Var, int i2, int i3, int i4, int i5, int i6, @dd DrmInitData drmInitData, zy zyVar, int i7) throws sok {
        DrmInitData drmInitData2;
        int i8;
        int i9;
        byte[] bArr;
        float f2;
        List<byte[]> list;
        String str;
        int i10 = i3;
        int i11 = i4;
        DrmInitData drmInitDataZy = drmInitData;
        zy zyVar2 = zyVar;
        gvn7Var.n5r1(i10 + 8 + 8);
        gvn7Var.hyr(16);
        int iLvui = gvn7Var.lvui();
        int iLvui2 = gvn7Var.lvui();
        gvn7Var.hyr(50);
        int iM13596n = gvn7Var.m13596n();
        int iIntValue = i2;
        if (iIntValue == 1701733238) {
            Pair<Integer, C3372h> pairT8r = t8r(gvn7Var, i10, i11);
            if (pairT8r != null) {
                iIntValue = ((Integer) pairT8r.first).intValue();
                drmInitDataZy = drmInitDataZy == null ? null : drmInitDataZy.zy(((C3372h) pairT8r.second).f64119toq);
                zyVar2.f20081k[i7] = (C3372h) pairT8r.second;
            }
            gvn7Var.n5r1(iM13596n);
        }
        String str2 = com.google.android.exoplayer2.util.wvg.f23313s;
        String str3 = iIntValue == 1831958048 ? com.google.android.exoplayer2.util.wvg.f67092cdj : iIntValue == 1211250227 ? com.google.android.exoplayer2.util.wvg.f23313s : null;
        float fCdj = 1.0f;
        byte[] bArrKi = null;
        String str4 = null;
        List<byte[]> listOf = null;
        int i12 = -1;
        int qVar = -1;
        int i13 = -1;
        int iZy = -1;
        ByteBuffer byteBuffer = null;
        boolean z2 = false;
        while (true) {
            if (iM13596n - i10 >= i11) {
                drmInitData2 = drmInitDataZy;
                break;
            }
            gvn7Var.n5r1(iM13596n);
            int iM13596n2 = gvn7Var.m13596n();
            String str5 = str2;
            int iKja0 = gvn7Var.kja0();
            if (iKja0 == 0) {
                drmInitData2 = drmInitDataZy;
                if (gvn7Var.m13596n() - i10 == i11) {
                    break;
                }
            } else {
                drmInitData2 = drmInitDataZy;
            }
            com.google.android.exoplayer2.extractor.qrj.m11923k(iKja0 > 0, "childAtomSize must be positive");
            int iKja02 = gvn7Var.kja0();
            if (iKja02 == 1635148611) {
                com.google.android.exoplayer2.extractor.qrj.m11923k(str3 == null, null);
                gvn7Var.n5r1(iM13596n2 + 8);
                C3873k qVar2 = C3873k.toq(gvn7Var);
                listOf = qVar2.f23421k;
                zyVar2.f64301zy = qVar2.f67179toq;
                if (!z2) {
                    fCdj = qVar2.f23422n;
                }
                str4 = qVar2.f23420g;
                str = com.google.android.exoplayer2.util.wvg.f23310p;
            } else if (iKja02 == 1752589123) {
                com.google.android.exoplayer2.extractor.qrj.m11923k(str3 == null, null);
                gvn7Var.n5r1(iM13596n2 + 8);
                com.google.android.exoplayer2.video.f7l8 f7l8VarM13788k = com.google.android.exoplayer2.video.f7l8.m13788k(gvn7Var);
                listOf = f7l8VarM13788k.f23396k;
                zyVar2.f64301zy = f7l8VarM13788k.f67171toq;
                if (!z2) {
                    fCdj = f7l8VarM13788k.f23397n;
                }
                str4 = f7l8VarM13788k.f23395g;
                str = com.google.android.exoplayer2.util.wvg.f67117ld6;
            } else {
                if (iKja02 == 1685480259 || iKja02 == 1685485123) {
                    i8 = iLvui2;
                    i9 = iIntValue;
                    bArr = bArrKi;
                    f2 = fCdj;
                    list = listOf;
                    C3874n c3874nM13798k = C3874n.m13798k(gvn7Var);
                    if (c3874nM13798k != null) {
                        str4 = c3874nM13798k.f67182zy;
                        str3 = com.google.android.exoplayer2.util.wvg.f67126ni7;
                    }
                } else if (iKja02 == 1987076931) {
                    com.google.android.exoplayer2.extractor.qrj.m11923k(str3 == null, null);
                    str = iIntValue == 1987063864 ? com.google.android.exoplayer2.util.wvg.f67143x2 : com.google.android.exoplayer2.util.wvg.f67133qrj;
                } else if (iKja02 == 1635135811) {
                    com.google.android.exoplayer2.extractor.qrj.m11923k(str3 == null, null);
                    str = com.google.android.exoplayer2.util.wvg.f67124n7h;
                } else if (iKja02 == 1668050025) {
                    ByteBuffer byteBufferM11872k = byteBuffer == null ? m11872k() : byteBuffer;
                    byteBufferM11872k.position(21);
                    byteBufferM11872k.putShort(gvn7Var.mcp());
                    byteBufferM11872k.putShort(gvn7Var.mcp());
                    byteBuffer = byteBufferM11872k;
                    i8 = iLvui2;
                    i9 = iIntValue;
                    iM13596n += iKja0;
                    i10 = i3;
                    i11 = i4;
                    zyVar2 = zyVar;
                    str2 = str5;
                    drmInitDataZy = drmInitData2;
                    iIntValue = i9;
                    iLvui2 = i8;
                } else if (iKja02 == 1835295606) {
                    ByteBuffer byteBufferM11872k2 = byteBuffer == null ? m11872k() : byteBuffer;
                    short sMcp = gvn7Var.mcp();
                    short sMcp2 = gvn7Var.mcp();
                    short sMcp3 = gvn7Var.mcp();
                    i9 = iIntValue;
                    short sMcp4 = gvn7Var.mcp();
                    short sMcp5 = gvn7Var.mcp();
                    List<byte[]> list2 = listOf;
                    short sMcp6 = gvn7Var.mcp();
                    byte[] bArr2 = bArrKi;
                    short sMcp7 = gvn7Var.mcp();
                    float f3 = fCdj;
                    short sMcp8 = gvn7Var.mcp();
                    long jD3 = gvn7Var.d3();
                    long jD32 = gvn7Var.d3();
                    i8 = iLvui2;
                    byteBufferM11872k2.position(1);
                    byteBufferM11872k2.putShort(sMcp5);
                    byteBufferM11872k2.putShort(sMcp6);
                    byteBufferM11872k2.putShort(sMcp);
                    byteBufferM11872k2.putShort(sMcp2);
                    byteBufferM11872k2.putShort(sMcp3);
                    byteBufferM11872k2.putShort(sMcp4);
                    byteBufferM11872k2.putShort(sMcp7);
                    byteBufferM11872k2.putShort(sMcp8);
                    byteBufferM11872k2.putShort((short) (jD3 / 10000));
                    byteBufferM11872k2.putShort((short) (jD32 / 10000));
                    byteBuffer = byteBufferM11872k2;
                    listOf = list2;
                    bArrKi = bArr2;
                    fCdj = f3;
                    iM13596n += iKja0;
                    i10 = i3;
                    i11 = i4;
                    zyVar2 = zyVar;
                    str2 = str5;
                    drmInitDataZy = drmInitData2;
                    iIntValue = i9;
                    iLvui2 = i8;
                } else {
                    i8 = iLvui2;
                    i9 = iIntValue;
                    bArr = bArrKi;
                    f2 = fCdj;
                    list = listOf;
                    if (iKja02 == 1681012275) {
                        com.google.android.exoplayer2.extractor.qrj.m11923k(str3 == null, null);
                        str3 = str5;
                    } else if (iKja02 == 1702061171) {
                        com.google.android.exoplayer2.extractor.qrj.m11923k(str3 == null, null);
                        Pair<String, byte[]> pairM11876s = m11876s(gvn7Var, iM13596n2);
                        String str6 = (String) pairM11876s.first;
                        byte[] bArr3 = (byte[]) pairM11876s.second;
                        listOf = bArr3 != null ? se.of(bArr3) : list;
                        str3 = str6;
                        bArrKi = bArr;
                        fCdj = f2;
                        iM13596n += iKja0;
                        i10 = i3;
                        i11 = i4;
                        zyVar2 = zyVar;
                        str2 = str5;
                        drmInitDataZy = drmInitData2;
                        iIntValue = i9;
                        iLvui2 = i8;
                    } else if (iKja02 == 1885434736) {
                        fCdj = cdj(gvn7Var, iM13596n2);
                        listOf = list;
                        bArrKi = bArr;
                        z2 = true;
                        iM13596n += iKja0;
                        i10 = i3;
                        i11 = i4;
                        zyVar2 = zyVar;
                        str2 = str5;
                        drmInitDataZy = drmInitData2;
                        iIntValue = i9;
                        iLvui2 = i8;
                    } else if (iKja02 == 1937126244) {
                        bArrKi = ki(gvn7Var, iM13596n2, iKja0);
                        listOf = list;
                        fCdj = f2;
                        iM13596n += iKja0;
                        i10 = i3;
                        i11 = i4;
                        zyVar2 = zyVar;
                        str2 = str5;
                        drmInitDataZy = drmInitData2;
                        iIntValue = i9;
                        iLvui2 = i8;
                    } else if (iKja02 == 1936995172) {
                        int iJp0y = gvn7Var.jp0y();
                        gvn7Var.hyr(3);
                        if (iJp0y == 0) {
                            int iJp0y2 = gvn7Var.jp0y();
                            if (iJp0y2 == 0) {
                                i12 = 0;
                            } else if (iJp0y2 == 1) {
                                i12 = 1;
                            } else if (iJp0y2 == 2) {
                                i12 = 2;
                            } else if (iJp0y2 == 3) {
                                i12 = 3;
                            }
                        }
                    } else if (iKja02 == 1668246642) {
                        int iKja03 = gvn7Var.kja0();
                        if (iKja03 == f20062g || iKja03 == f20064n) {
                            int iLvui3 = gvn7Var.lvui();
                            int iLvui4 = gvn7Var.lvui();
                            gvn7Var.hyr(2);
                            boolean z3 = iKja0 == 19 && (gvn7Var.jp0y() & 128) != 0;
                            qVar = com.google.android.exoplayer2.video.zy.toq(iLvui3);
                            i13 = z3 ? 1 : 2;
                            iZy = com.google.android.exoplayer2.video.zy.zy(iLvui4);
                        } else {
                            String strValueOf = String.valueOf(AbstractC3373k.m11849k(iKja03));
                            ni7.qrj(f20063k, strValueOf.length() != 0 ? "Unsupported color type: ".concat(strValueOf) : new String("Unsupported color type: "));
                        }
                    }
                }
                listOf = list;
                bArrKi = bArr;
                fCdj = f2;
                iM13596n += iKja0;
                i10 = i3;
                i11 = i4;
                zyVar2 = zyVar;
                str2 = str5;
                drmInitDataZy = drmInitData2;
                iIntValue = i9;
                iLvui2 = i8;
            }
            str3 = str;
            i8 = iLvui2;
            i9 = iIntValue;
            iM13596n += iKja0;
            i10 = i3;
            i11 = i4;
            zyVar2 = zyVar;
            str2 = str5;
            drmInitDataZy = drmInitData2;
            iIntValue = i9;
            iLvui2 = i8;
        }
        int i14 = iLvui2;
        byte[] bArr4 = bArrKi;
        float f4 = fCdj;
        List<byte[]> list3 = listOf;
        if (str3 == null) {
            return;
        }
        xwq3.toq toqVarLvui = new xwq3.toq().m13944l(i5).m13945m(str3).d3(str4).bf2(iLvui).ncyb(i14).nn86(f4).m13946o(i6).hb(bArr4).y9n(i12).hyr(list3).lvui(drmInitData2);
        int i15 = qVar;
        int i16 = i13;
        int i17 = iZy;
        if (i15 != -1 || i16 != -1 || i17 != -1 || byteBuffer != null) {
            toqVarLvui.oc(new com.google.android.exoplayer2.video.zy(i15, i16, i17, byteBuffer != null ? byteBuffer.array() : null));
        }
        zyVar.f64300toq = toqVarLvui.a9();
    }

    /* JADX INFO: renamed from: k */
    private static ByteBuffer m11872k() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @dd
    private static byte[] ki(gvn7 gvn7Var, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            gvn7Var.n5r1(i4);
            int iKja0 = gvn7Var.kja0();
            if (gvn7Var.kja0() == 1886547818) {
                return Arrays.copyOfRange(gvn7Var.m13598q(), i4, iKja0 + i4);
            }
            i4 += iKja0;
        }
        return null;
    }

    private static void kja0(gvn7 gvn7Var, int i2, int i3, int i4, zy zyVar) {
        gvn7Var.n5r1(i3 + 8 + 8);
        if (i2 == 1835365492) {
            gvn7Var.wvg();
            String strWvg = gvn7Var.wvg();
            if (strWvg != null) {
                zyVar.f64300toq = new xwq3.toq().m13944l(i4).m13945m(strWvg).a9();
            }
        }
    }

    private static int ld6(gvn7 gvn7Var) {
        gvn7Var.n5r1(16);
        return gvn7Var.kja0();
    }

    @dd
    private static Metadata mcp(gvn7 gvn7Var, int i2) {
        gvn7Var.hyr(8);
        m11873n(gvn7Var);
        while (gvn7Var.m13596n() < i2) {
            int iM13596n = gvn7Var.m13596n();
            int iKja0 = gvn7Var.kja0();
            if (gvn7Var.kja0() == 1768715124) {
                gvn7Var.n5r1(iM13596n);
                return x2(gvn7Var, iM13596n + iKja0);
            }
            gvn7Var.n5r1(iM13596n + iKja0);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m11873n(gvn7 gvn7Var) {
        int iM13596n = gvn7Var.m13596n();
        gvn7Var.hyr(4);
        if (gvn7Var.kja0() != 1751411826) {
            iM13596n += 4;
        }
        gvn7Var.n5r1(iM13596n);
    }

    @dd
    public static Metadata n7h(AbstractC3373k.k kVar) {
        AbstractC3373k.toq toqVarM11853y = kVar.m11853y(AbstractC3373k.f64215y2);
        AbstractC3373k.toq toqVarM11853y2 = kVar.m11853y(AbstractC3373k.f64200uj2j);
        AbstractC3373k.toq toqVarM11853y3 = kVar.m11853y(AbstractC3373k.f64164jz5);
        if (toqVarM11853y == null || toqVarM11853y2 == null || toqVarM11853y3 == null || ld6(toqVarM11853y.f64230n2t) != f64290zy) {
            return null;
        }
        gvn7 gvn7Var = toqVarM11853y2.f64230n2t;
        gvn7Var.n5r1(12);
        int iKja0 = gvn7Var.kja0();
        String[] strArr = new String[iKja0];
        for (int i2 = 0; i2 < iKja0; i2++) {
            int iKja02 = gvn7Var.kja0();
            gvn7Var.hyr(4);
            strArr[i2] = gvn7Var.jk(iKja02 - 8);
        }
        gvn7 gvn7Var2 = toqVarM11853y3.f64230n2t;
        gvn7Var2.n5r1(8);
        ArrayList arrayList = new ArrayList();
        while (gvn7Var2.m13594k() > 8) {
            int iM13596n = gvn7Var2.m13596n();
            int iKja03 = gvn7Var2.kja0();
            int iKja04 = gvn7Var2.kja0() - 1;
            if (iKja04 < 0 || iKja04 >= iKja0) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(iKja04);
                ni7.qrj(f20063k, sb.toString());
            } else {
                MdtaMetadataEntry mdtaMetadataEntryM11888g = C3386y.m11888g(gvn7Var2, iM13596n + iKja03, strArr[iKja04]);
                if (mdtaMetadataEntryM11888g != null) {
                    arrayList.add(mdtaMetadataEntryM11888g);
                }
            }
            gvn7Var2.n5r1(iM13596n + iKja03);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static zy ni7(gvn7 gvn7Var, int i2, int i3, String str, @dd DrmInitData drmInitData, boolean z2) throws sok {
        int i4;
        gvn7Var.n5r1(12);
        int iKja0 = gvn7Var.kja0();
        zy zyVar = new zy(iKja0);
        for (int i5 = 0; i5 < iKja0; i5++) {
            int iM13596n = gvn7Var.m13596n();
            int iKja02 = gvn7Var.kja0();
            com.google.android.exoplayer2.extractor.qrj.m11923k(iKja02 > 0, "childAtomSize must be positive");
            int iKja03 = gvn7Var.kja0();
            if (iKja03 == 1635148593 || iKja03 == 1635148595 || iKja03 == 1701733238 || iKja03 == 1831958048 || iKja03 == 1836070006 || iKja03 == 1752589105 || iKja03 == 1751479857 || iKja03 == 1932670515 || iKja03 == 1211250227 || iKja03 == 1987063864 || iKja03 == 1987063865 || iKja03 == 1635135537 || iKja03 == 1685479798 || iKja03 == 1685479729 || iKja03 == 1685481573 || iKja03 == 1685481521) {
                i4 = iM13596n;
                jk(gvn7Var, iKja03, i4, iKja02, i2, i3, drmInitData, zyVar, i5);
            } else if (iKja03 == 1836069985 || iKja03 == 1701733217 || iKja03 == 1633889587 || iKja03 == 1700998451 || iKja03 == 1633889588 || iKja03 == 1835823201 || iKja03 == 1685353315 || iKja03 == 1685353317 || iKja03 == 1685353320 || iKja03 == 1685353324 || iKja03 == 1685353336 || iKja03 == 1935764850 || iKja03 == 1935767394 || iKja03 == 1819304813 || iKja03 == 1936684916 || iKja03 == 1953984371 || iKja03 == 778924082 || iKja03 == 778924083 || iKja03 == 1835557169 || iKja03 == 1835560241 || iKja03 == 1634492771 || iKja03 == 1634492791 || iKja03 == 1970037111 || iKja03 == 1332770163 || iKja03 == 1716281667) {
                i4 = iM13596n;
                m11869g(gvn7Var, iKja03, iM13596n, iKja02, i2, str, z2, drmInitData, zyVar, i5);
            } else {
                if (iKja03 == 1414810956 || iKja03 == 1954034535 || iKja03 == 2004251764 || iKja03 == 1937010800 || iKja03 == 1664495672) {
                    fu4(gvn7Var, iKja03, iM13596n, iKja02, i2, str, zyVar);
                } else if (iKja03 == 1835365492) {
                    kja0(gvn7Var, iKja03, iM13596n, i2, zyVar);
                } else if (iKja03 == 1667329389) {
                    zyVar.f64300toq = new xwq3.toq().m13944l(i2).m13945m(com.google.android.exoplayer2.util.wvg.f67112ikck).a9();
                }
                i4 = iM13596n;
            }
            gvn7Var.n5r1(i4 + iKja02);
        }
        return zyVar;
    }

    @dd
    private static kja0 o1t(AbstractC3373k.k kVar, AbstractC3373k.toq toqVar, long j2, @dd DrmInitData drmInitData, boolean z2, boolean z3) throws sok {
        AbstractC3373k.toq toqVar2;
        long j3;
        long[] jArr;
        long[] jArr2;
        AbstractC3373k.k kVarF7l8;
        Pair<long[], long[]> pairM11878y;
        AbstractC3373k.k kVar2 = (AbstractC3373k.k) C3844k.f7l8(kVar.f7l8(AbstractC3373k.f64125bf2));
        int iM11875q = m11875q(ld6(((AbstractC3373k.toq) C3844k.f7l8(kVar2.m11853y(AbstractC3373k.f64215y2))).f64230n2t));
        if (iM11875q == -1) {
            return null;
        }
        C3381g c3381gM11879z = m11879z(((AbstractC3373k.toq) C3844k.f7l8(kVar.m11853y(AbstractC3373k.f64172lv5))).f64230n2t);
        long jKtq = C3548p.f65257toq;
        if (j2 == C3548p.f65257toq) {
            toqVar2 = toqVar;
            j3 = c3381gM11879z.f64291toq;
        } else {
            toqVar2 = toqVar;
            j3 = j2;
        }
        long jM11870h = m11870h(toqVar2.f64230n2t);
        if (j3 != C3548p.f65257toq) {
            jKtq = lrht.ktq(j3, 1000000L, jM11870h);
        }
        long j4 = jKtq;
        AbstractC3373k.k kVar3 = (AbstractC3373k.k) C3844k.f7l8(((AbstractC3373k.k) C3844k.f7l8(kVar2.f7l8(AbstractC3373k.f64156i1))).f7l8(AbstractC3373k.f64122a98o));
        Pair<Long, String> pairQrj = qrj(((AbstractC3373k.toq) C3844k.f7l8(kVar2.m11853y(AbstractC3373k.f64126bo))).f64230n2t);
        zy zyVarNi7 = ni7(((AbstractC3373k.toq) C3844k.f7l8(kVar3.m11853y(AbstractC3373k.f64129c8jq))).f64230n2t, c3381gM11879z.f20069k, c3381gM11879z.f64292zy, (String) pairQrj.second, drmInitData, z3);
        if (z2 || (kVarF7l8 = kVar.f7l8(AbstractC3373k.f64195t8iq)) == null || (pairM11878y = m11878y(kVarF7l8)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM11878y.first;
            jArr2 = (long[]) pairM11878y.second;
            jArr = jArr3;
        }
        if (zyVarNi7.f64300toq == null) {
            return null;
        }
        return new kja0(c3381gM11879z.f20069k, iM11875q, ((Long) pairQrj.first).longValue(), jM11870h, j4, zyVarNi7.f64300toq, zyVarNi7.f20082q, zyVarNi7.f20081k, zyVarNi7.f64301zy, jArr, jArr2);
    }

    /* JADX INFO: renamed from: p */
    private static int m11874p(gvn7 gvn7Var) {
        int iJp0y = gvn7Var.jp0y();
        int i2 = iJp0y & 127;
        while ((iJp0y & 128) == 128) {
            iJp0y = gvn7Var.jp0y();
            i2 = (i2 << 7) | (iJp0y & 127);
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    private static int m11875q(int i2) {
        if (i2 == f20068y) {
            return 1;
        }
        if (i2 == f64286ld6) {
            return 2;
        }
        if (i2 == f20065p || i2 == f64285f7l8 || i2 == f20067s || i2 == f64288toq) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    private static Pair<Long, String> qrj(gvn7 gvn7Var) {
        gvn7Var.n5r1(8);
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        gvn7Var.hyr(iZy == 0 ? 8 : 16);
        long jD3 = gvn7Var.d3();
        gvn7Var.hyr(iZy == 0 ? 4 : 8);
        int iLvui = gvn7Var.lvui();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((iLvui >> 10) & 31) + 96));
        sb.append((char) (((iLvui >> 5) & 31) + 96));
        sb.append((char) ((iLvui & 31) + 96));
        return Pair.create(Long.valueOf(jD3), sb.toString());
    }

    /* JADX INFO: renamed from: s */
    private static Pair<String, byte[]> m11876s(gvn7 gvn7Var, int i2) {
        gvn7Var.n5r1(i2 + 8 + 4);
        gvn7Var.hyr(1);
        m11874p(gvn7Var);
        gvn7Var.hyr(2);
        int iJp0y = gvn7Var.jp0y();
        if ((iJp0y & 128) != 0) {
            gvn7Var.hyr(2);
        }
        if ((iJp0y & 64) != 0) {
            gvn7Var.hyr(gvn7Var.lvui());
        }
        if ((iJp0y & 32) != 0) {
            gvn7Var.hyr(2);
        }
        gvn7Var.hyr(1);
        m11874p(gvn7Var);
        String strM13751y = com.google.android.exoplayer2.util.wvg.m13751y(gvn7Var.jp0y());
        if (com.google.android.exoplayer2.util.wvg.f67113jk.equals(strM13751y) || com.google.android.exoplayer2.util.wvg.f67125ncyb.equals(strM13751y) || com.google.android.exoplayer2.util.wvg.f23306l.equals(strM13751y)) {
            return Pair.create(strM13751y, null);
        }
        gvn7Var.hyr(12);
        gvn7Var.hyr(1);
        int iM11874p = m11874p(gvn7Var);
        byte[] bArr = new byte[iM11874p];
        gvn7Var.ld6(bArr, 0, iM11874p);
        return Pair.create(strM13751y, bArr);
    }

    /* JADX INFO: renamed from: t */
    public static Pair<Metadata, Metadata> m11877t(AbstractC3373k.toq toqVar) {
        gvn7 gvn7Var = toqVar.f64230n2t;
        gvn7Var.n5r1(8);
        Metadata metadataMcp = null;
        Metadata metadataFn3e = null;
        while (gvn7Var.m13594k() >= 8) {
            int iM13596n = gvn7Var.m13596n();
            int iKja0 = gvn7Var.kja0();
            int iKja02 = gvn7Var.kja0();
            if (iKja02 == 1835365473) {
                gvn7Var.n5r1(iM13596n);
                metadataMcp = mcp(gvn7Var, iM13596n + iKja0);
            } else if (iKja02 == 1936553057) {
                gvn7Var.n5r1(iM13596n);
                metadataFn3e = fn3e(gvn7Var, iM13596n + iKja0);
            }
            gvn7Var.n5r1(iM13596n + iKja0);
        }
        return Pair.create(metadataMcp, metadataFn3e);
    }

    @dd
    private static Pair<Integer, C3372h> t8r(gvn7 gvn7Var, int i2, int i3) throws sok {
        Pair<Integer, C3372h> pairF7l8;
        int iM13596n = gvn7Var.m13596n();
        while (iM13596n - i2 < i3) {
            gvn7Var.n5r1(iM13596n);
            int iKja0 = gvn7Var.kja0();
            com.google.android.exoplayer2.extractor.qrj.m11923k(iKja0 > 0, "childAtomSize must be positive");
            if (gvn7Var.kja0() == 1936289382 && (pairF7l8 = f7l8(gvn7Var, iM13596n, iKja0)) != null) {
                return pairF7l8;
            }
            iM13596n += iKja0;
        }
        return null;
    }

    private static boolean toq(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[lrht.t8r(4, 0, length)] && jArr[lrht.t8r(jArr.length - 4, 0, length)] < j4 && j4 <= j2;
    }

    public static List<ki> wvg(AbstractC3373k.k kVar, fn3e fn3eVar, long j2, @dd DrmInitData drmInitData, boolean z2, boolean z3, com.google.common.base.t8r<kja0, kja0> t8rVar) throws sok {
        kja0 kja0VarApply;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < kVar.f64228ngy.size(); i2++) {
            AbstractC3373k.k kVar2 = kVar.f64228ngy.get(i2);
            if (kVar2.f20018k == 1953653099 && (kja0VarApply = t8rVar.apply(o1t(kVar2, (AbstractC3373k.toq) C3844k.f7l8(kVar.m11853y(AbstractC3373k.f64216y9n)), j2, drmInitData, z2, z3))) != null) {
                arrayList.add(zurt(kja0VarApply, (AbstractC3373k.k) C3844k.f7l8(((AbstractC3373k.k) C3844k.f7l8(((AbstractC3373k.k) C3844k.f7l8(kVar2.f7l8(AbstractC3373k.f64125bf2))).f7l8(AbstractC3373k.f64156i1))).f7l8(AbstractC3373k.f64122a98o)), fn3eVar));
            }
        }
        return arrayList;
    }

    @dd
    private static Metadata x2(gvn7 gvn7Var, int i2) {
        gvn7Var.hyr(8);
        ArrayList arrayList = new ArrayList();
        while (gvn7Var.m13596n() < i2) {
            Metadata.Entry entryZy = C3386y.zy(gvn7Var);
            if (entryZy != null) {
                arrayList.add(entryZy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @dd
    /* JADX INFO: renamed from: y */
    private static Pair<long[], long[]> m11878y(AbstractC3373k.k kVar) {
        AbstractC3373k.toq toqVarM11853y = kVar.m11853y(AbstractC3373k.f20013u);
        if (toqVarM11853y == null) {
            return null;
        }
        gvn7 gvn7Var = toqVarM11853y.f64230n2t;
        gvn7Var.n5r1(8);
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        int iEqxt = gvn7Var.eqxt();
        long[] jArr = new long[iEqxt];
        long[] jArr2 = new long[iEqxt];
        for (int i2 = 0; i2 < iEqxt; i2++) {
            jArr[i2] = iZy == 1 ? gvn7Var.d2ok() : gvn7Var.d3();
            jArr2[i2] = iZy == 1 ? gvn7Var.o1t() : gvn7Var.kja0();
            if (gvn7Var.mcp() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            gvn7Var.hyr(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX INFO: renamed from: z */
    private static C3381g m11879z(gvn7 gvn7Var) {
        boolean z2;
        gvn7Var.n5r1(8);
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        gvn7Var.hyr(iZy == 0 ? 8 : 16);
        int iKja0 = gvn7Var.kja0();
        gvn7Var.hyr(4);
        int iM13596n = gvn7Var.m13596n();
        int i2 = iZy == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z2 = true;
                break;
            }
            if (gvn7Var.m13598q()[iM13596n + i4] != -1) {
                z2 = false;
                break;
            }
            i4++;
        }
        long j2 = C3548p.f65257toq;
        if (z2) {
            gvn7Var.hyr(i2);
        } else {
            long jD3 = iZy == 0 ? gvn7Var.d3() : gvn7Var.d2ok();
            if (jD3 != 0) {
                j2 = jD3;
            }
        }
        gvn7Var.hyr(16);
        int iKja02 = gvn7Var.kja0();
        int iKja03 = gvn7Var.kja0();
        gvn7Var.hyr(4);
        int iKja04 = gvn7Var.kja0();
        int iKja05 = gvn7Var.kja0();
        if (iKja02 == 0 && iKja03 == 65536 && iKja04 == -65536 && iKja05 == 0) {
            i3 = 90;
        } else if (iKja02 == 0 && iKja03 == -65536 && iKja04 == 65536 && iKja05 == 0) {
            i3 = 270;
        } else if (iKja02 == -65536 && iKja03 == 0 && iKja04 == 0 && iKja05 == -65536) {
            i3 = 180;
        }
        return new C3381g(iKja0, j2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0430 A[EDGE_INSN: B:207:0x0430->B:169:0x0430 BREAK  A[LOOP:2: B:152:0x03d2->B:168:0x0428], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.extractor.mp4.ki zurt(com.google.android.exoplayer2.extractor.mp4.kja0 r37, com.google.android.exoplayer2.extractor.mp4.AbstractC3373k.k r38, com.google.android.exoplayer2.extractor.fn3e r39) throws com.google.android.exoplayer2.sok {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.toq.zurt(com.google.android.exoplayer2.extractor.mp4.kja0, com.google.android.exoplayer2.extractor.mp4.k$k, com.google.android.exoplayer2.extractor.fn3e):com.google.android.exoplayer2.extractor.mp4.ki");
    }

    private static int zy(gvn7 gvn7Var, int i2, int i3, int i4) throws sok {
        int iM13596n = gvn7Var.m13596n();
        com.google.android.exoplayer2.extractor.qrj.m11923k(iM13596n >= i3, null);
        while (iM13596n - i3 < i4) {
            gvn7Var.n5r1(iM13596n);
            int iKja0 = gvn7Var.kja0();
            com.google.android.exoplayer2.extractor.qrj.m11923k(iKja0 > 0, "childAtomSize must be positive");
            if (gvn7Var.kja0() == i2) {
                return iM13596n;
            }
            iM13596n += iKja0;
        }
        return -1;
    }
}

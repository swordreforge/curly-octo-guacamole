package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fn3e;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.mp4.AbstractC3373k;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import zy.dd;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements InterfaceC3397p {

    /* JADX INFO: renamed from: c */
    private static final int f19967c = 0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f64079dd = 4;

    /* JADX INFO: renamed from: e */
    private static final int f19968e = 4;

    /* JADX INFO: renamed from: f */
    private static final int f19969f = 100;

    /* JADX INFO: renamed from: l */
    private static final int f19970l = 1936025959;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final int f64081lrht = 1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f64082lvui = 1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final String f64084ncyb = "FragmentedMp4Extractor";

    /* JADX INFO: renamed from: r */
    public static final int f19971r = 2;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f64085uv6 = 2;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final int f64086vyq = 3;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f64087x9kr = 16;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f64088a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final ArrayDeque<toq> f64089cdj;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private InterfaceC3401t[] f64090d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f64091eqxt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final SparseArray<zy> f64092f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private long f64093fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f64094fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private long f64095fu4;

    /* JADX INFO: renamed from: g */
    private final List<xwq3> f19972g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.x2 f64096gvn7;

    /* JADX INFO: renamed from: h */
    private final ArrayDeque<AbstractC3373k.k> f19973h;

    /* JADX INFO: renamed from: i */
    private int f19974i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f64097jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f64098jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private final InterfaceC3401t f64099ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final gvn7 f64100kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final byte[] f64101ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @dd
    private zy f64102mcp;

    /* JADX INFO: renamed from: n */
    @dd
    private final kja0 f19975n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.emsg.toq f64103n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @dd
    private gvn7 f64104ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private long f64105o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private InterfaceC3401t[] f64106oc;

    /* JADX INFO: renamed from: p */
    private final gvn7 f19976p;

    /* JADX INFO: renamed from: q */
    private final int f19977q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private final C3847l f64107qrj;

    /* JADX INFO: renamed from: s */
    private final gvn7 f19978s;

    /* JADX INFO: renamed from: t */
    private long f19979t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f64108t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private long f64109wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final gvn7 f64110x2;

    /* JADX INFO: renamed from: y */
    private final gvn7 f19980y;

    /* JADX INFO: renamed from: z */
    private int f19981z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f64111zurt;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.kja0 f64078d2ok = new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.extractor.mp4.g
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return f7l8.x2();
        }
    };

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final byte[] f64083n5r1 = {-94, 57, 79, 82, 90, -101, 79, com.google.common.base.zy.f68119fu4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final xwq3 f64080hyr = new xwq3.toq().m13945m(wvg.f23298d).a9();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.f7l8$k */
    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3370k {
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        public final long f19982k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f64112toq;

        public toq(long j2, int i2) {
            this.f19982k = j2;
            this.f64112toq = i2;
        }
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    private static final class zy {

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f64113qrj = 8;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f64114f7l8;

        /* JADX INFO: renamed from: g */
        public int f19983g;

        /* JADX INFO: renamed from: k */
        public final InterfaceC3401t f19984k;

        /* JADX INFO: renamed from: n */
        public com.google.android.exoplayer2.extractor.mp4.zy f19985n;

        /* JADX INFO: renamed from: q */
        public ki f19987q;

        /* JADX INFO: renamed from: s */
        public int f19988s;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f64117x2;

        /* JADX INFO: renamed from: y */
        public int f19989y;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final cdj f64116toq = new cdj();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final gvn7 f64118zy = new gvn7();

        /* JADX INFO: renamed from: p */
        private final gvn7 f19986p = new gvn7(1);

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private final gvn7 f64115ld6 = new gvn7();

        public zy(InterfaceC3401t interfaceC3401t, ki kiVar, com.google.android.exoplayer2.extractor.mp4.zy zyVar) {
            this.f19984k = interfaceC3401t;
            this.f19987q = kiVar;
            this.f19985n = zyVar;
            m11844p(kiVar, zyVar);
        }

        @dd
        public C3372h f7l8() {
            if (!this.f64117x2) {
                return null;
            }
            int i2 = ((com.google.android.exoplayer2.extractor.mp4.zy) lrht.ld6(this.f64116toq.f19961k)).f20096k;
            C3372h qVar = this.f64116toq.f64073n7h;
            if (qVar == null) {
                qVar = this.f19987q.f20020k.toq(i2);
            }
            if (qVar == null || !qVar.f19991k) {
                return null;
            }
            return qVar;
        }

        /* JADX INFO: renamed from: g */
        public int m11842g() {
            return !this.f64117x2 ? this.f19987q.f20022q[this.f19983g] : this.f64116toq.f19965s[this.f19983g];
        }

        public void ld6() {
            this.f64116toq.m11827g();
            this.f19983g = 0;
            this.f19989y = 0;
            this.f64114f7l8 = 0;
            this.f19988s = 0;
            this.f64117x2 = false;
        }

        /* JADX INFO: renamed from: n */
        public long m11843n() {
            return !this.f64117x2 ? this.f19987q.f20019g[this.f19983g] : this.f64116toq.zy(this.f19983g);
        }

        public void n7h(DrmInitData drmInitData) {
            C3372h qVar = this.f19987q.f20020k.toq(((com.google.android.exoplayer2.extractor.mp4.zy) lrht.ld6(this.f64116toq.f19961k)).f20096k);
            this.f19984k.mo11931q(this.f19987q.f20020k.f20024g.toq().lvui(drmInitData.zy(qVar != null ? qVar.f64119toq : null)).a9());
        }

        /* JADX INFO: renamed from: p */
        public void m11844p(ki kiVar, com.google.android.exoplayer2.extractor.mp4.zy zyVar) {
            this.f19987q = kiVar;
            this.f19985n = zyVar;
            this.f19984k.mo11931q(kiVar.f20020k.f20024g);
            ld6();
        }

        /* JADX INFO: renamed from: q */
        public long m11845q() {
            return !this.f64117x2 ? this.f19987q.f64233zy[this.f19983g] : this.f64116toq.f64069f7l8[this.f19989y];
        }

        public void qrj() {
            C3372h c3372hF7l8 = f7l8();
            if (c3372hF7l8 == null) {
                return;
            }
            gvn7 gvn7Var = this.f64116toq.f64071kja0;
            int i2 = c3372hF7l8.f19993q;
            if (i2 != 0) {
                gvn7Var.hyr(i2);
            }
            if (this.f64116toq.f7l8(this.f19983g)) {
                gvn7Var.hyr(gvn7Var.lvui() * 6);
            }
        }

        /* JADX INFO: renamed from: s */
        public int m11846s(int i2, int i3) {
            gvn7 gvn7Var;
            C3372h c3372hF7l8 = f7l8();
            if (c3372hF7l8 == null) {
                return 0;
            }
            int length = c3372hF7l8.f19993q;
            if (length != 0) {
                gvn7Var = this.f64116toq.f64071kja0;
            } else {
                byte[] bArr = (byte[]) lrht.ld6(c3372hF7l8.f19992n);
                this.f64115ld6.ncyb(bArr, bArr.length);
                gvn7 gvn7Var2 = this.f64115ld6;
                length = bArr.length;
                gvn7Var = gvn7Var2;
            }
            boolean zF7l8 = this.f64116toq.f7l8(this.f19983g);
            boolean z2 = zF7l8 || i3 != 0;
            this.f19986p.m13598q()[0] = (byte) ((z2 ? 128 : 0) | length);
            this.f19986p.n5r1(0);
            this.f19984k.mo11928g(this.f19986p, 1, 1);
            this.f19984k.mo11928g(gvn7Var, length, 1);
            if (!z2) {
                return length + 1;
            }
            if (!zF7l8) {
                this.f64118zy.dd(8);
                byte[] bArrM13598q = this.f64118zy.m13598q();
                bArrM13598q[0] = 0;
                bArrM13598q[1] = 1;
                bArrM13598q[2] = (byte) ((i3 >> 8) & 255);
                bArrM13598q[3] = (byte) (i3 & 255);
                bArrM13598q[4] = (byte) ((i2 >> 24) & 255);
                bArrM13598q[5] = (byte) ((i2 >> 16) & 255);
                bArrM13598q[6] = (byte) ((i2 >> 8) & 255);
                bArrM13598q[7] = (byte) (i2 & 255);
                this.f19984k.mo11928g(this.f64118zy, 8, 1);
                return length + 1 + 8;
            }
            gvn7 gvn7Var3 = this.f64116toq.f64071kja0;
            int iLvui = gvn7Var3.lvui();
            gvn7Var3.hyr(-2);
            int i4 = (iLvui * 6) + 2;
            if (i3 != 0) {
                this.f64118zy.dd(i4);
                byte[] bArrM13598q2 = this.f64118zy.m13598q();
                gvn7Var3.ld6(bArrM13598q2, 0, i4);
                int i5 = (((bArrM13598q2[2] & 255) << 8) | (bArrM13598q2[3] & 255)) + i3;
                bArrM13598q2[2] = (byte) ((i5 >> 8) & 255);
                bArrM13598q2[3] = (byte) (i5 & 255);
                gvn7Var3 = this.f64118zy;
            }
            this.f19984k.mo11928g(gvn7Var3, i4, 1);
            return length + 1 + i4;
        }

        public void x2(long j2) {
            int i2 = this.f19983g;
            while (true) {
                cdj cdjVar = this.f64116toq;
                if (i2 >= cdjVar.f19959g || cdjVar.zy(i2) >= j2) {
                    return;
                }
                if (this.f64116toq.f64072ld6[i2]) {
                    this.f19988s = i2;
                }
                i2++;
            }
        }

        /* JADX INFO: renamed from: y */
        public boolean m11847y() {
            this.f19983g++;
            if (!this.f64117x2) {
                return false;
            }
            int i2 = this.f64114f7l8 + 1;
            this.f64114f7l8 = i2;
            int[] iArr = this.f64116toq.f19966y;
            int i3 = this.f19989y;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f19989y = i3 + 1;
            this.f64114f7l8 = 0;
            return false;
        }

        public int zy() {
            int i2 = !this.f64117x2 ? this.f19987q.f64231f7l8[this.f19983g] : this.f64116toq.f64072ld6[this.f19983g] ? 1 : 0;
            return f7l8() != null ? i2 | 1073741824 : i2;
        }
    }

    public f7l8() {
        this(0);
    }

    private static Pair<Integer, com.google.android.exoplayer2.extractor.mp4.zy> a9(gvn7 gvn7Var) {
        gvn7Var.n5r1(12);
        return Pair.create(Integer.valueOf(gvn7Var.kja0()), new com.google.android.exoplayer2.extractor.mp4.zy(gvn7Var.kja0() - 1, gvn7Var.kja0(), gvn7Var.kja0(), gvn7Var.kja0()));
    }

    private void cdj(AbstractC3373k.k kVar) throws sok {
        fn3e(kVar, this.f64092f7l8, this.f19975n != null, this.f19977q, this.f64101ld6);
        DrmInitData drmInitDataM11837s = m11837s(kVar.f64229pjz9);
        if (drmInitDataM11837s != null) {
            int size = this.f64092f7l8.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f64092f7l8.valueAt(i2).n7h(drmInitDataM11837s);
            }
        }
        if (this.f64105o1t != C3548p.f65257toq) {
            int size2 = this.f64092f7l8.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f64092f7l8.valueAt(i3).x2(this.f64105o1t);
            }
            this.f64105o1t = C3548p.f65257toq;
        }
    }

    private void d2ok(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int size = this.f64092f7l8.size();
        long j2 = Long.MAX_VALUE;
        zy zyVarValueAt = null;
        for (int i2 = 0; i2 < size; i2++) {
            cdj cdjVar = this.f64092f7l8.valueAt(i2).f64116toq;
            if (cdjVar.f19960h) {
                long j3 = cdjVar.f19964q;
                if (j3 < j2) {
                    zyVarValueAt = this.f64092f7l8.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (zyVarValueAt == null) {
            this.f64108t8r = 3;
            return;
        }
        int position = (int) (j2 - ld6Var.getPosition());
        if (position < 0) {
            throw sok.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        ld6Var.cdj(position);
        zyVarValueAt.f64116toq.m11828k(ld6Var);
    }

    private void d3(long j2) throws sok {
        while (!this.f19973h.isEmpty() && this.f19973h.peek().f64227n2t == j2) {
            n7h(this.f19973h.pop());
        }
        f7l8();
    }

    private static boolean dd(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783;
    }

    private void eqxt(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int i2 = ((int) this.f64093fn3e) - this.f64111zurt;
        gvn7 gvn7Var = this.f64104ni7;
        if (gvn7Var != null) {
            ld6Var.readFully(gvn7Var.m13598q(), 8, i2);
            m11832h(new AbstractC3373k.toq(this.f19974i, gvn7Var), ld6Var.getPosition());
        } else {
            ld6Var.cdj(i2);
        }
        d3(ld6Var.getPosition());
    }

    private void f7l8() {
        this.f64108t8r = 0;
        this.f64111zurt = 0;
    }

    private static void fn3e(AbstractC3373k.k kVar, SparseArray<zy> sparseArray, boolean z2, int i2, byte[] bArr) throws sok {
        int size = kVar.f64228ngy.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3373k.k kVar2 = kVar.f64228ngy.get(i3);
            if (kVar2.f20018k == 1953653094) {
                jk(kVar2, sparseArray, z2, i2, bArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int fti(com.google.android.exoplayer2.extractor.mp4.f7l8.zy r34, int r35, int r36, com.google.android.exoplayer2.util.gvn7 r37, int r38) throws com.google.android.exoplayer2.sok {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.f7l8.fti(com.google.android.exoplayer2.extractor.mp4.f7l8$zy, int, int, com.google.android.exoplayer2.util.gvn7, int):int");
    }

    private static void fu4(AbstractC3373k.k kVar, @dd String str, cdj cdjVar) throws sok {
        byte[] bArr = null;
        gvn7 gvn7Var = null;
        gvn7 gvn7Var2 = null;
        for (int i2 = 0; i2 < kVar.f64229pjz9.size(); i2++) {
            AbstractC3373k.toq toqVar = kVar.f64229pjz9.get(i2);
            gvn7 gvn7Var3 = toqVar.f64230n2t;
            int i3 = toqVar.f20018k;
            if (i3 == 1935828848) {
                gvn7Var3.n5r1(12);
                if (gvn7Var3.kja0() == f19970l) {
                    gvn7Var = gvn7Var3;
                }
            } else if (i3 == 1936158820) {
                gvn7Var3.n5r1(12);
                if (gvn7Var3.kja0() == f19970l) {
                    gvn7Var2 = gvn7Var3;
                }
            }
        }
        if (gvn7Var == null || gvn7Var2 == null) {
            return;
        }
        gvn7Var.n5r1(8);
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        gvn7Var.hyr(4);
        if (iZy == 1) {
            gvn7Var.hyr(4);
        }
        if (gvn7Var.kja0() != 1) {
            throw sok.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        gvn7Var2.n5r1(8);
        int iZy2 = AbstractC3373k.zy(gvn7Var2.kja0());
        gvn7Var2.hyr(4);
        if (iZy2 == 1) {
            if (gvn7Var2.d3() == 0) {
                throw sok.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (iZy2 >= 2) {
            gvn7Var2.hyr(4);
        }
        if (gvn7Var2.d3() != 1) {
            throw sok.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        gvn7Var2.hyr(1);
        int iJp0y = gvn7Var2.jp0y();
        int i4 = (iJp0y & com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg) >> 4;
        int i5 = iJp0y & 15;
        boolean z2 = gvn7Var2.jp0y() == 1;
        if (z2) {
            int iJp0y2 = gvn7Var2.jp0y();
            byte[] bArr2 = new byte[16];
            gvn7Var2.ld6(bArr2, 0, 16);
            if (iJp0y2 == 0) {
                int iJp0y3 = gvn7Var2.jp0y();
                bArr = new byte[iJp0y3];
                gvn7Var2.ld6(bArr, 0, iJp0y3);
            }
            cdjVar.f64076x2 = true;
            cdjVar.f64073n7h = new C3372h(z2, str, iJp0y2, bArr2, i4, i5, bArr);
        }
    }

    /* JADX INFO: renamed from: g */
    private static int m11831g(int i2) throws sok {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i2);
        throw sok.createForMalformedContainer(sb.toString(), null);
    }

    private static void gvn7(gvn7 gvn7Var, cdj cdjVar, byte[] bArr) throws sok {
        gvn7Var.n5r1(8);
        gvn7Var.ld6(bArr, 0, 16);
        if (Arrays.equals(bArr, f64083n5r1)) {
            m11840z(gvn7Var, 16, cdjVar);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m11832h(AbstractC3373k.toq toqVar, long j2) throws sok {
        if (!this.f19973h.isEmpty()) {
            this.f19973h.peek().m11851n(toqVar);
            return;
        }
        int i2 = toqVar.f20018k;
        if (i2 != 1936286840) {
            if (i2 == 1701671783) {
                kja0(toqVar.f64230n2t);
            }
        } else {
            Pair<Long, C3398q> pairWvg = wvg(toqVar.f64230n2t, j2);
            this.f19979t = ((Long) pairWvg.first).longValue();
            this.f64096gvn7.cdj((o1t) pairWvg.second);
            this.f64091eqxt = true;
        }
    }

    /* JADX INFO: renamed from: i */
    private static long m11833i(gvn7 gvn7Var) {
        gvn7Var.n5r1(8);
        return AbstractC3373k.zy(gvn7Var.kja0()) == 0 ? gvn7Var.d3() : gvn7Var.d2ok();
    }

    private static void jk(AbstractC3373k.k kVar, SparseArray<zy> sparseArray, boolean z2, int i2, byte[] bArr) throws sok {
        zy zyVarMcp = mcp(((AbstractC3373k.toq) C3844k.f7l8(kVar.m11853y(AbstractC3373k.f64154hb))).f64230n2t, sparseArray, z2);
        if (zyVarMcp == null) {
            return;
        }
        cdj cdjVar = zyVarMcp.f64116toq;
        long j2 = cdjVar.f64068cdj;
        boolean z3 = cdjVar.f64070ki;
        zyVarMcp.ld6();
        zyVarMcp.f64117x2 = true;
        AbstractC3373k.toq toqVarM11853y = kVar.m11853y(AbstractC3373k.f64183nn86);
        if (toqVarM11853y == null || (i2 & 2) != 0) {
            cdjVar.f64068cdj = j2;
            cdjVar.f64070ki = z3;
        } else {
            cdjVar.f64068cdj = m11838t(toqVarM11853y.f64230n2t);
            cdjVar.f64070ki = true;
        }
        jp0y(kVar, zyVarMcp, i2);
        C3372h qVar = zyVarMcp.f19987q.f20020k.toq(((com.google.android.exoplayer2.extractor.mp4.zy) C3844k.f7l8(cdjVar.f19961k)).f20096k);
        AbstractC3373k.toq toqVarM11853y2 = kVar.m11853y(AbstractC3373k.f64189qkj8);
        if (toqVarM11853y2 != null) {
            ni7((C3372h) C3844k.f7l8(qVar), toqVarM11853y2.f64230n2t, cdjVar);
        }
        AbstractC3373k.toq toqVarM11853y3 = kVar.m11853y(AbstractC3373k.f64145fnq8);
        if (toqVarM11853y3 != null) {
            zurt(toqVarM11853y3.f64230n2t, cdjVar);
        }
        AbstractC3373k.toq toqVarM11853y4 = kVar.m11853y(AbstractC3373k.f64136d8wk);
        if (toqVarM11853y4 != null) {
            o1t(toqVarM11853y4.f64230n2t, cdjVar);
        }
        fu4(kVar, qVar != null ? qVar.f64119toq : null, cdjVar);
        int size = kVar.f64229pjz9.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3373k.toq toqVar = kVar.f64229pjz9.get(i3);
            if (toqVar.f20018k == 1970628964) {
                gvn7(toqVar.f64230n2t, cdjVar, bArr);
            }
        }
    }

    private static void jp0y(AbstractC3373k.k kVar, zy zyVar, int i2) throws sok {
        List<AbstractC3373k.toq> list = kVar.f64229pjz9;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC3373k.toq toqVar = list.get(i5);
            if (toqVar.f20018k == 1953658222) {
                gvn7 gvn7Var = toqVar.f64230n2t;
                gvn7Var.n5r1(12);
                int iEqxt = gvn7Var.eqxt();
                if (iEqxt > 0) {
                    i4 += iEqxt;
                    i3++;
                }
            }
        }
        zyVar.f19989y = 0;
        zyVar.f64114f7l8 = 0;
        zyVar.f19983g = 0;
        zyVar.f64116toq.m11829n(i3, i4);
        int i6 = 0;
        int iFti = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC3373k.toq toqVar2 = list.get(i7);
            if (toqVar2.f20018k == 1953658222) {
                iFti = fti(zyVar, i6, i2, toqVar2.f64230n2t, iFti);
                i6++;
            }
        }
    }

    private void ki(AbstractC3373k.k kVar) throws sok {
        int i2 = 0;
        C3844k.m13631p(this.f19975n == null, "Unexpected moov box.");
        DrmInitData drmInitDataM11837s = m11837s(kVar.f64229pjz9);
        AbstractC3373k.k kVar2 = (AbstractC3373k.k) C3844k.f7l8(kVar.f7l8(AbstractC3373k.f64132ch));
        SparseArray<com.google.android.exoplayer2.extractor.mp4.zy> sparseArray = new SparseArray<>();
        int size = kVar2.f64229pjz9.size();
        long jM11833i = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3373k.toq toqVar = kVar2.f64229pjz9.get(i3);
            int i4 = toqVar.f20018k;
            if (i4 == 1953654136) {
                Pair<Integer, com.google.android.exoplayer2.extractor.mp4.zy> pairA9 = a9(toqVar.f64230n2t);
                sparseArray.put(((Integer) pairA9.first).intValue(), (com.google.android.exoplayer2.extractor.mp4.zy) pairA9.second);
            } else if (i4 == 1835362404) {
                jM11833i = m11833i(toqVar.f64230n2t);
            }
        }
        List<ki> listWvg = com.google.android.exoplayer2.extractor.mp4.toq.wvg(kVar, new fn3e(), jM11833i, drmInitDataM11837s, (this.f19977q & 16) != 0, false, new com.google.common.base.t8r() { // from class: com.google.android.exoplayer2.extractor.mp4.n
            @Override // com.google.common.base.t8r
            public final Object apply(Object obj) {
                return this.f20045k.qrj((kja0) obj);
            }
        });
        int size2 = listWvg.size();
        if (this.f64092f7l8.size() != 0) {
            C3844k.m13633s(this.f64092f7l8.size() == size2);
            while (i2 < size2) {
                ki kiVar = listWvg.get(i2);
                kja0 kja0Var = kiVar.f20020k;
                this.f64092f7l8.get(kja0Var.f20025k).m11844p(kiVar, m11839y(sparseArray, kja0Var.f20025k));
                i2++;
            }
            return;
        }
        while (i2 < size2) {
            ki kiVar2 = listWvg.get(i2);
            kja0 kja0Var2 = kiVar2.f20020k;
            this.f64092f7l8.put(kja0Var2.f20025k, new zy(this.f64096gvn7.toq(i2, kja0Var2.f64238toq), kiVar2, m11839y(sparseArray, kja0Var2.f20025k)));
            this.f64109wvg = Math.max(this.f64109wvg, kja0Var2.f20026n);
            i2++;
        }
        this.f64096gvn7.mo11753i();
    }

    private void kja0(gvn7 gvn7Var) {
        long jKtq;
        String str;
        long jKtq2;
        String str2;
        long jD3;
        long jM13647k;
        if (this.f64090d3.length == 0) {
            return;
        }
        gvn7Var.n5r1(8);
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        if (iZy == 0) {
            String str3 = (String) C3844k.f7l8(gvn7Var.wvg());
            String str4 = (String) C3844k.f7l8(gvn7Var.wvg());
            long jD32 = gvn7Var.d3();
            jKtq = lrht.ktq(gvn7Var.d3(), 1000000L, jD32);
            long j2 = this.f19979t;
            long j3 = j2 != C3548p.f65257toq ? j2 + jKtq : -9223372036854775807L;
            str = str3;
            jKtq2 = lrht.ktq(gvn7Var.d3(), 1000L, jD32);
            str2 = str4;
            jD3 = gvn7Var.d3();
            jM13647k = j3;
        } else {
            if (iZy != 1) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Skipping unsupported emsg version: ");
                sb.append(iZy);
                ni7.qrj(f64084ncyb, sb.toString());
                return;
            }
            long jD33 = gvn7Var.d3();
            jM13647k = lrht.ktq(gvn7Var.d2ok(), 1000000L, jD33);
            long jKtq3 = lrht.ktq(gvn7Var.d3(), 1000L, jD33);
            long jD34 = gvn7Var.d3();
            str = (String) C3844k.f7l8(gvn7Var.wvg());
            jKtq2 = jKtq3;
            jD3 = jD34;
            str2 = (String) C3844k.f7l8(gvn7Var.wvg());
            jKtq = -9223372036854775807L;
        }
        byte[] bArr = new byte[gvn7Var.m13594k()];
        gvn7Var.ld6(bArr, 0, gvn7Var.m13594k());
        gvn7 gvn7Var2 = new gvn7(this.f64103n7h.m12288k(new EventMessage(str, str2, jKtq2, jD3, bArr)));
        int iM13594k = gvn7Var2.m13594k();
        for (InterfaceC3401t interfaceC3401t : this.f64090d3) {
            gvn7Var2.n5r1(0);
            interfaceC3401t.zy(gvn7Var2, iM13594k);
        }
        if (jM13647k == C3548p.f65257toq) {
            this.f64089cdj.addLast(new toq(jKtq, iM13594k));
            this.f19981z += iM13594k;
            return;
        }
        C3847l c3847l = this.f64107qrj;
        if (c3847l != null) {
            jM13647k = c3847l.m13647k(jM13647k);
        }
        for (InterfaceC3401t interfaceC3401t2 : this.f64090d3) {
            interfaceC3401t2.mo11930n(jM13647k, 1, iM13594k, 0, null);
        }
    }

    private void ld6() {
        int i2;
        InterfaceC3401t[] interfaceC3401tArr = new InterfaceC3401t[2];
        this.f64090d3 = interfaceC3401tArr;
        InterfaceC3401t interfaceC3401t = this.f64099ki;
        int i3 = 0;
        if (interfaceC3401t != null) {
            interfaceC3401tArr[0] = interfaceC3401t;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.f19977q & 4) != 0) {
            interfaceC3401tArr[i2] = this.f64096gvn7.toq(100, 5);
            i2++;
            i4 = 101;
        }
        InterfaceC3401t[] interfaceC3401tArr2 = (InterfaceC3401t[]) lrht.z4(this.f64090d3, i2);
        this.f64090d3 = interfaceC3401tArr2;
        for (InterfaceC3401t interfaceC3401t2 : interfaceC3401tArr2) {
            interfaceC3401t2.mo11931q(f64080hyr);
        }
        this.f64106oc = new InterfaceC3401t[this.f19972g.size()];
        while (i3 < this.f64106oc.length) {
            InterfaceC3401t qVar = this.f64096gvn7.toq(i4, 3);
            qVar.mo11931q(this.f19972g.get(i3));
            this.f64106oc[i3] = qVar;
            i3++;
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean lvui(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int qVar;
        zy zyVarM11835p = this.f64102mcp;
        Throwable th = null;
        if (zyVarM11835p == null) {
            zyVarM11835p = m11835p(this.f64092f7l8);
            if (zyVarM11835p == null) {
                int position = (int) (this.f64095fu4 - ld6Var.getPosition());
                if (position < 0) {
                    throw sok.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                ld6Var.cdj(position);
                f7l8();
                return false;
            }
            int iM11845q = (int) (zyVarM11835p.m11845q() - ld6Var.getPosition());
            if (iM11845q < 0) {
                ni7.qrj(f64084ncyb, "Ignoring negative offset to sample data.");
                iM11845q = 0;
            }
            ld6Var.cdj(iM11845q);
            this.f64102mcp = zyVarM11835p;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.f64108t8r == 3) {
            int iM11842g = zyVarM11835p.m11842g();
            this.f64097jk = iM11842g;
            if (zyVarM11835p.f19983g < zyVarM11835p.f19988s) {
                ld6Var.cdj(iM11842g);
                zyVarM11835p.qrj();
                if (!zyVarM11835p.m11847y()) {
                    this.f64102mcp = null;
                }
                this.f64108t8r = 3;
                return true;
            }
            if (zyVarM11835p.f19987q.f20020k.f64236f7l8 == 1) {
                this.f64097jk = iM11842g - 8;
                ld6Var.cdj(8);
            }
            if (wvg.f67097dd.equals(zyVarM11835p.f19987q.f20020k.f20024g.f23682r)) {
                this.f64088a9 = zyVarM11835p.m11846s(this.f64097jk, 7);
                com.google.android.exoplayer2.audio.zy.m11542k(this.f64097jk, this.f64110x2);
                zyVarM11835p.f19984k.zy(this.f64110x2, 7);
                this.f64088a9 += 7;
            } else {
                this.f64088a9 = zyVarM11835p.m11846s(this.f64097jk, 0);
            }
            this.f64097jk += this.f64088a9;
            this.f64108t8r = 4;
            this.f64094fti = 0;
        }
        kja0 kja0Var = zyVarM11835p.f19987q.f20020k;
        InterfaceC3401t interfaceC3401t = zyVarM11835p.f19984k;
        long jM11843n = zyVarM11835p.m11843n();
        C3847l c3847l = this.f64107qrj;
        if (c3847l != null) {
            jM11843n = c3847l.m13647k(jM11843n);
        }
        long j2 = jM11843n;
        if (kja0Var.f20027p == 0) {
            while (true) {
                int i4 = this.f64088a9;
                int i5 = this.f64097jk;
                if (i4 >= i5) {
                    break;
                }
                this.f64088a9 += interfaceC3401t.toq(ld6Var, i5 - i4, false);
            }
        } else {
            byte[] bArrM13598q = this.f19978s.m13598q();
            bArrM13598q[0] = 0;
            bArrM13598q[1] = 0;
            bArrM13598q[2] = 0;
            int i6 = kja0Var.f20027p;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f64088a9 < this.f64097jk) {
                int i9 = this.f64094fti;
                if (i9 == 0) {
                    ld6Var.readFully(bArrM13598q, i8, i7);
                    this.f19978s.n5r1(0);
                    int iKja0 = this.f19978s.kja0();
                    if (iKja0 < i3) {
                        throw sok.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.f64094fti = iKja0 - 1;
                    this.f19980y.n5r1(0);
                    interfaceC3401t.zy(this.f19980y, i2);
                    interfaceC3401t.zy(this.f19978s, i3);
                    this.f64098jp0y = (this.f64106oc.length <= 0 || !C3856t.f7l8(kja0Var.f20024g.f23682r, bArrM13598q[i2])) ? 0 : i3;
                    this.f64088a9 += 5;
                    this.f64097jk += i8;
                } else {
                    if (this.f64098jp0y) {
                        this.f19976p.dd(i9);
                        ld6Var.readFully(this.f19976p.m13598q(), 0, this.f64094fti);
                        interfaceC3401t.zy(this.f19976p, this.f64094fti);
                        qVar = this.f64094fti;
                        int iCdj = C3856t.cdj(this.f19976p.m13598q(), this.f19976p.m13591g());
                        this.f19976p.n5r1(wvg.f67117ld6.equals(kja0Var.f20024g.f23682r) ? 1 : 0);
                        this.f19976p.m13595l(iCdj);
                        com.google.android.exoplayer2.extractor.zy.m12058k(j2, this.f19976p, this.f64106oc);
                    } else {
                        qVar = interfaceC3401t.toq(ld6Var, i9, false);
                    }
                    this.f64088a9 += qVar;
                    this.f64094fti -= qVar;
                    th = null;
                    i2 = 4;
                    i3 = 1;
                }
            }
        }
        int iZy = zyVarM11835p.zy();
        C3372h c3372hF7l8 = zyVarM11835p.f7l8();
        interfaceC3401t.mo11930n(j2, iZy, this.f64097jk, 0, c3372hF7l8 != null ? c3372hF7l8.f64120zy : null);
        t8r(j2);
        if (!zyVarM11835p.m11847y()) {
            this.f64102mcp = null;
        }
        this.f64108t8r = 3;
        return true;
    }

    @dd
    private static zy mcp(gvn7 gvn7Var, SparseArray<zy> sparseArray, boolean z2) {
        gvn7Var.n5r1(8);
        int qVar = AbstractC3373k.toq(gvn7Var.kja0());
        zy zyVarValueAt = z2 ? sparseArray.valueAt(0) : sparseArray.get(gvn7Var.kja0());
        if (zyVarValueAt == null) {
            return null;
        }
        if ((qVar & 1) != 0) {
            long jD2ok = gvn7Var.d2ok();
            cdj cdjVar = zyVarValueAt.f64116toq;
            cdjVar.f64077zy = jD2ok;
            cdjVar.f19964q = jD2ok;
        }
        com.google.android.exoplayer2.extractor.mp4.zy zyVar = zyVarValueAt.f19985n;
        zyVarValueAt.f64116toq.f19961k = new com.google.android.exoplayer2.extractor.mp4.zy((qVar & 2) != 0 ? gvn7Var.kja0() - 1 : zyVar.f20096k, (qVar & 8) != 0 ? gvn7Var.kja0() : zyVar.f64327toq, (qVar & 16) != 0 ? gvn7Var.kja0() : zyVar.f64328zy, (qVar & 32) != 0 ? gvn7Var.kja0() : zyVar.f20097q);
        return zyVarValueAt;
    }

    private void n7h(AbstractC3373k.k kVar) throws sok {
        int i2 = kVar.f20018k;
        if (i2 == 1836019574) {
            ki(kVar);
        } else if (i2 == 1836019558) {
            cdj(kVar);
        } else {
            if (this.f19973h.isEmpty()) {
                return;
            }
            this.f19973h.peek().m11852q(kVar);
        }
    }

    private static void ni7(C3372h c3372h, gvn7 gvn7Var, cdj cdjVar) throws sok {
        int i2;
        int i3 = c3372h.f19993q;
        gvn7Var.n5r1(8);
        if ((AbstractC3373k.toq(gvn7Var.kja0()) & 1) == 1) {
            gvn7Var.hyr(8);
        }
        int iJp0y = gvn7Var.jp0y();
        int iEqxt = gvn7Var.eqxt();
        int i4 = cdjVar.f19959g;
        if (iEqxt > i4) {
            StringBuilder sb = new StringBuilder(78);
            sb.append("Saiz sample count ");
            sb.append(iEqxt);
            sb.append(" is greater than fragment sample count");
            sb.append(i4);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
        if (iJp0y == 0) {
            boolean[] zArr = cdjVar.f64074qrj;
            i2 = 0;
            for (int i5 = 0; i5 < iEqxt; i5++) {
                int iJp0y2 = gvn7Var.jp0y();
                i2 += iJp0y2;
                zArr[i5] = iJp0y2 > i3;
            }
        } else {
            i2 = (iJp0y * iEqxt) + 0;
            Arrays.fill(cdjVar.f64074qrj, 0, iEqxt, iJp0y > i3);
        }
        Arrays.fill(cdjVar.f64074qrj, iEqxt, cdjVar.f19959g, false);
        if (i2 > 0) {
            cdjVar.m11830q(i2);
        }
    }

    private static void o1t(gvn7 gvn7Var, cdj cdjVar) throws sok {
        m11840z(gvn7Var, 0, cdjVar);
    }

    private boolean oc(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        if (this.f64111zurt == 0) {
            if (!ld6Var.mo11729p(this.f64100kja0.m13598q(), 0, 8, true)) {
                return false;
            }
            this.f64111zurt = 8;
            this.f64100kja0.n5r1(0);
            this.f64093fn3e = this.f64100kja0.d3();
            this.f19974i = this.f64100kja0.kja0();
        }
        long j2 = this.f64093fn3e;
        if (j2 == 1) {
            ld6Var.readFully(this.f64100kja0.m13598q(), 8, 8);
            this.f64111zurt += 8;
            this.f64093fn3e = this.f64100kja0.d2ok();
        } else if (j2 == 0) {
            long length = ld6Var.getLength();
            if (length == -1 && !this.f19973h.isEmpty()) {
                length = this.f19973h.peek().f64227n2t;
            }
            if (length != -1) {
                this.f64093fn3e = (length - ld6Var.getPosition()) + ((long) this.f64111zurt);
            }
        }
        if (this.f64093fn3e < this.f64111zurt) {
            throw sok.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = ld6Var.getPosition() - ((long) this.f64111zurt);
        int i2 = this.f19974i;
        if ((i2 == 1836019558 || i2 == 1835295092) && !this.f64091eqxt) {
            this.f64096gvn7.cdj(new o1t.toq(this.f64109wvg, position));
            this.f64091eqxt = true;
        }
        if (this.f19974i == 1836019558) {
            int size = this.f64092f7l8.size();
            for (int i3 = 0; i3 < size; i3++) {
                cdj cdjVar = this.f64092f7l8.valueAt(i3).f64116toq;
                cdjVar.f64075toq = position;
                cdjVar.f19964q = position;
                cdjVar.f64077zy = position;
            }
        }
        int i4 = this.f19974i;
        if (i4 == 1835295092) {
            this.f64102mcp = null;
            this.f64095fu4 = position + this.f64093fn3e;
            this.f64108t8r = 2;
            return true;
        }
        if (m11836r(i4)) {
            long position2 = (ld6Var.getPosition() + this.f64093fn3e) - 8;
            this.f19973h.push(new AbstractC3373k.k(this.f19974i, position2));
            if (this.f64093fn3e == this.f64111zurt) {
                d3(position2);
            } else {
                f7l8();
            }
        } else if (dd(this.f19974i)) {
            if (this.f64111zurt != 8) {
                throw sok.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            long j3 = this.f64093fn3e;
            if (j3 > 2147483647L) {
                throw sok.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            gvn7 gvn7Var = new gvn7((int) j3);
            System.arraycopy(this.f64100kja0.m13598q(), 0, gvn7Var.m13598q(), 0, 8);
            this.f64104ni7 = gvn7Var;
            this.f64108t8r = 1;
        } else {
            if (this.f64093fn3e > 2147483647L) {
                throw sok.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f64104ni7 = null;
            this.f64108t8r = 1;
        }
        return true;
    }

    @dd
    /* JADX INFO: renamed from: p */
    private static zy m11835p(SparseArray<zy> sparseArray) {
        int size = sparseArray.size();
        zy zyVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            zy zyVarValueAt = sparseArray.valueAt(i2);
            if ((zyVarValueAt.f64117x2 || zyVarValueAt.f19983g != zyVarValueAt.f19987q.f64232toq) && (!zyVarValueAt.f64117x2 || zyVarValueAt.f19989y != zyVarValueAt.f64116toq.f19962n)) {
                long jM11845q = zyVarValueAt.m11845q();
                if (jM11845q < j2) {
                    zyVar = zyVarValueAt;
                    j2 = jM11845q;
                }
            }
        }
        return zyVar;
    }

    /* JADX INFO: renamed from: r */
    private static boolean m11836r(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    @dd
    /* JADX INFO: renamed from: s */
    private static DrmInitData m11837s(List<AbstractC3373k.toq> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3373k.toq toqVar = list.get(i2);
            if (toqVar.f20018k == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM13598q = toqVar.f64230n2t.m13598q();
                UUID uuidM11883g = x2.m11883g(bArrM13598q);
                if (uuidM11883g == null) {
                    ni7.qrj(f64084ncyb, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidM11883g, wvg.f23301g, bArrM13598q));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    /* JADX INFO: renamed from: t */
    private static long m11838t(gvn7 gvn7Var) {
        gvn7Var.n5r1(8);
        return AbstractC3373k.zy(gvn7Var.kja0()) == 1 ? gvn7Var.d2ok() : gvn7Var.d3();
    }

    private void t8r(long j2) {
        while (!this.f64089cdj.isEmpty()) {
            toq toqVarRemoveFirst = this.f64089cdj.removeFirst();
            this.f19981z -= toqVarRemoveFirst.f64112toq;
            long jM13647k = toqVarRemoveFirst.f19982k + j2;
            C3847l c3847l = this.f64107qrj;
            if (c3847l != null) {
                jM13647k = c3847l.m13647k(jM13647k);
            }
            for (InterfaceC3401t interfaceC3401t : this.f64090d3) {
                interfaceC3401t.mo11930n(jM13647k, 1, toqVarRemoveFirst.f64112toq, this.f19981z, null);
            }
        }
    }

    private static Pair<Long, C3398q> wvg(gvn7 gvn7Var, long j2) throws sok {
        long jD2ok;
        long jD2ok2;
        gvn7Var.n5r1(8);
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        gvn7Var.hyr(4);
        long jD3 = gvn7Var.d3();
        if (iZy == 0) {
            jD2ok = gvn7Var.d3();
            jD2ok2 = gvn7Var.d3();
        } else {
            jD2ok = gvn7Var.d2ok();
            jD2ok2 = gvn7Var.d2ok();
        }
        long j3 = jD2ok;
        long j4 = j2 + jD2ok2;
        long jKtq = lrht.ktq(j3, 1000000L, jD3);
        gvn7Var.hyr(2);
        int iLvui = gvn7Var.lvui();
        int[] iArr = new int[iLvui];
        long[] jArr = new long[iLvui];
        long[] jArr2 = new long[iLvui];
        long[] jArr3 = new long[iLvui];
        long j5 = jKtq;
        int i2 = 0;
        long j6 = j3;
        while (i2 < iLvui) {
            int iKja0 = gvn7Var.kja0();
            if ((iKja0 & Integer.MIN_VALUE) != 0) {
                throw sok.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long jD32 = gvn7Var.d3();
            iArr[i2] = iKja0 & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = j5;
            long j7 = j6 + jD32;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = iLvui;
            int[] iArr2 = iArr;
            long jKtq2 = lrht.ktq(j7, 1000000L, jD3);
            jArr4[i2] = jKtq2 - jArr5[i2];
            gvn7Var.hyr(4);
            j4 += (long) iArr2[i2];
            i2++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iLvui = i3;
            j6 = j7;
            j5 = jKtq2;
        }
        return Pair.create(Long.valueOf(jKtq), new C3398q(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] x2() {
        return new InterfaceC3397p[]{new f7l8()};
    }

    /* JADX INFO: renamed from: y */
    private com.google.android.exoplayer2.extractor.mp4.zy m11839y(SparseArray<com.google.android.exoplayer2.extractor.mp4.zy> sparseArray, int i2) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (com.google.android.exoplayer2.extractor.mp4.zy) C3844k.f7l8(sparseArray.get(i2));
    }

    /* JADX INFO: renamed from: z */
    private static void m11840z(gvn7 gvn7Var, int i2, cdj cdjVar) throws sok {
        gvn7Var.n5r1(i2 + 8);
        int qVar = AbstractC3373k.toq(gvn7Var.kja0());
        if ((qVar & 1) != 0) {
            throw sok.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (qVar & 2) != 0;
        int iEqxt = gvn7Var.eqxt();
        if (iEqxt == 0) {
            Arrays.fill(cdjVar.f64074qrj, 0, cdjVar.f19959g, false);
            return;
        }
        int i3 = cdjVar.f19959g;
        if (iEqxt == i3) {
            Arrays.fill(cdjVar.f64074qrj, 0, iEqxt, z2);
            cdjVar.m11830q(gvn7Var.m13594k());
            cdjVar.toq(gvn7Var);
        } else {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(iEqxt);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
    }

    private static void zurt(gvn7 gvn7Var, cdj cdjVar) throws sok {
        gvn7Var.n5r1(8);
        int iKja0 = gvn7Var.kja0();
        if ((AbstractC3373k.toq(iKja0) & 1) == 1) {
            gvn7Var.hyr(8);
        }
        int iEqxt = gvn7Var.eqxt();
        if (iEqxt == 1) {
            cdjVar.f19964q += AbstractC3373k.zy(iKja0) == 0 ? gvn7Var.d3() : gvn7Var.d2ok();
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected saio entry count: ");
            sb.append(iEqxt);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        int size = this.f64092f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f64092f7l8.valueAt(i2).ld6();
        }
        this.f64089cdj.clear();
        this.f19981z = 0;
        this.f64105o1t = j3;
        this.f19973h.clear();
        f7l8();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        this.f64096gvn7 = x2Var;
        f7l8();
        ld6();
        kja0 kja0Var = this.f19975n;
        if (kja0Var != null) {
            this.f64092f7l8.put(0, new zy(x2Var.toq(0, kja0Var.f64238toq), new ki(this.f19975n, new long[0], new int[0], 0, new long[0], new int[0], 0L), new com.google.android.exoplayer2.extractor.mp4.zy(0, 0, 0, 0)));
            this.f64096gvn7.mo11753i();
        }
    }

    @dd
    protected kja0 qrj(@dd kja0 kja0Var) {
        return kja0Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return n7h.toq(ld6Var);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        while (true) {
            int i2 = this.f64108t8r;
            if (i2 != 0) {
                if (i2 == 1) {
                    eqxt(ld6Var);
                } else if (i2 == 2) {
                    d2ok(ld6Var);
                } else if (lvui(ld6Var)) {
                    return 0;
                }
            } else if (!oc(ld6Var)) {
                return -1;
            }
        }
    }

    public f7l8(int i2) {
        this(i2, null);
    }

    public f7l8(int i2, @dd C3847l c3847l) {
        this(i2, c3847l, null, Collections.emptyList());
    }

    public f7l8(int i2, @dd C3847l c3847l, @dd kja0 kja0Var) {
        this(i2, c3847l, kja0Var, Collections.emptyList());
    }

    public f7l8(int i2, @dd C3847l c3847l, @dd kja0 kja0Var, List<xwq3> list) {
        this(i2, c3847l, kja0Var, list, null);
    }

    public f7l8(int i2, @dd C3847l c3847l, @dd kja0 kja0Var, List<xwq3> list, @dd InterfaceC3401t interfaceC3401t) {
        this.f19977q = i2;
        this.f64107qrj = c3847l;
        this.f19975n = kja0Var;
        this.f19972g = Collections.unmodifiableList(list);
        this.f64099ki = interfaceC3401t;
        this.f64103n7h = new com.google.android.exoplayer2.metadata.emsg.toq();
        this.f64100kja0 = new gvn7(16);
        this.f19980y = new gvn7(C3856t.f67070toq);
        this.f19978s = new gvn7(5);
        this.f19976p = new gvn7();
        byte[] bArr = new byte[16];
        this.f64101ld6 = bArr;
        this.f64110x2 = new gvn7(bArr);
        this.f19973h = new ArrayDeque<>();
        this.f64089cdj = new ArrayDeque<>();
        this.f64092f7l8 = new SparseArray<>();
        this.f64109wvg = C3548p.f65257toq;
        this.f64105o1t = C3548p.f65257toq;
        this.f19979t = C3548p.f65257toq;
        this.f64096gvn7 = com.google.android.exoplayer2.extractor.x2.we;
        this.f64090d3 = new InterfaceC3401t[0];
        this.f64106oc = new InterfaceC3401t[0];
    }
}

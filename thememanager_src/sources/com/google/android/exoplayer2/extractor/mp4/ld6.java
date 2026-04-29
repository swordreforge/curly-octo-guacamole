package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fn3e;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.mcp;
import com.google.android.exoplayer2.extractor.mp4.AbstractC3373k;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 implements InterfaceC3397p, o1t {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f64240a9 = 4;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f64241d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f64242d3 = 3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f64243eqxt = 1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f64244fti = 0;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f64245gvn7 = 2;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f64246jk = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f64247jp0y = 1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final long f64248lvui = 262144;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f64249mcp = 1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f64250oc = 0;

    /* JADX INFO: renamed from: r */
    private static final long f20031r = 10485760;

    /* JADX INFO: renamed from: t */
    public static final com.google.android.exoplayer2.extractor.kja0 f20032t = new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.extractor.mp4.s
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return ld6.ki();
        }
    };

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f64251cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final gvn7 f64252f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.x2 f64253fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f64254fu4;

    /* JADX INFO: renamed from: g */
    private final gvn7 f20033g;

    /* JADX INFO: renamed from: h */
    @dd
    private gvn7 f20034h;

    /* JADX INFO: renamed from: i */
    private int f20035i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f64255ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f64256kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final List<Metadata.Entry> f64257ld6;

    /* JADX INFO: renamed from: n */
    private final gvn7 f20036n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f64258n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private long[][] f64259ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f64260o1t;

    /* JADX INFO: renamed from: p */
    private final qrj f20037p;

    /* JADX INFO: renamed from: q */
    private final int f20038q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f64261qrj;

    /* JADX INFO: renamed from: s */
    private final ArrayDeque<AbstractC3373k.k> f20039s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f64262t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @dd
    private MotionPhotoMetadata f64263wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f64264x2;

    /* JADX INFO: renamed from: y */
    private final gvn7 f20040y;

    /* JADX INFO: renamed from: z */
    private long f20041z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private toq[] f64265zurt;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.ld6$k */
    /* JADX INFO: compiled from: Mp4Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3375k {
    }

    /* JADX INFO: compiled from: Mp4Extractor.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        public final kja0 f20042k;

        /* JADX INFO: renamed from: n */
        public int f20043n;

        /* JADX INFO: renamed from: q */
        @dd
        public final mcp f20044q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final ki f64266toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final InterfaceC3401t f64267zy;

        public toq(kja0 kja0Var, ki kiVar, InterfaceC3401t interfaceC3401t) {
            this.f20042k = kja0Var;
            this.f64266toq = kiVar;
            this.f64267zy = interfaceC3401t;
            this.f20044q = wvg.f67144x9kr.equals(kja0Var.f20024g.f23682r) ? new mcp() : null;
        }
    }

    public ld6() {
        this(0);
    }

    private static boolean a9(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kja0 cdj(kja0 kja0Var) {
        return kja0Var;
    }

    private void fn3e(long j2) throws sok {
        while (!this.f20039s.isEmpty() && this.f20039s.peek().f64227n2t == j2) {
            AbstractC3373k.k kVarPop = this.f20039s.pop();
            if (kVarPop.f20018k == 1836019574) {
                fu4(kVarPop);
                this.f20039s.clear();
                this.f64264x2 = 2;
            } else if (!this.f20039s.isEmpty()) {
                this.f20039s.peek().m11852q(kVarPop);
            }
        }
        if (this.f64264x2 != 2) {
            n7h();
        }
    }

    private void fti(toq toqVar, long j2) {
        ki kiVar = toqVar.f64266toq;
        int iM11854k = kiVar.m11854k(j2);
        if (iM11854k == -1) {
            iM11854k = kiVar.toq(j2);
        }
        toqVar.f20043n = iM11854k;
    }

    private void fu4(AbstractC3373k.k kVar) throws sok {
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        List<ki> list;
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = this.f64260o1t == 1;
        fn3e fn3eVar = new fn3e();
        AbstractC3373k.toq toqVarM11853y = kVar.m11853y(AbstractC3373k.f64193se);
        if (toqVarM11853y != null) {
            Pair<Metadata, Metadata> pairM11877t = com.google.android.exoplayer2.extractor.mp4.toq.m11877t(toqVarM11853y);
            Metadata metadata3 = (Metadata) pairM11877t.first;
            Metadata metadata4 = (Metadata) pairM11877t.second;
            if (metadata3 != null) {
                fn3eVar.zy(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        AbstractC3373k.k kVarF7l8 = kVar.f7l8(AbstractC3373k.f64150gc3c);
        Metadata metadataN7h = kVarF7l8 != null ? com.google.android.exoplayer2.extractor.mp4.toq.n7h(kVarF7l8) : null;
        List<ki> listWvg = com.google.android.exoplayer2.extractor.mp4.toq.wvg(kVar, fn3eVar, C3548p.f65257toq, null, (this.f20038q & 1) != 0, z2, new com.google.common.base.t8r() { // from class: com.google.android.exoplayer2.extractor.mp4.p
            @Override // com.google.common.base.t8r
            public final Object apply(Object obj) {
                return ld6.cdj((kja0) obj);
            }
        });
        com.google.android.exoplayer2.extractor.x2 x2Var = (com.google.android.exoplayer2.extractor.x2) C3844k.f7l8(this.f64253fn3e);
        int size = listWvg.size();
        int i4 = 0;
        int size2 = -1;
        long j2 = C3548p.f65257toq;
        while (i4 < size) {
            ki kiVar = listWvg.get(i4);
            if (kiVar.f64232toq == 0) {
                list = listWvg;
                i2 = size;
                arrayList = arrayList2;
            } else {
                kja0 kja0Var = kiVar.f20020k;
                int i5 = size2;
                arrayList = arrayList2;
                long j3 = kja0Var.f20026n;
                if (j3 == C3548p.f65257toq) {
                    j3 = kiVar.f20023y;
                }
                long jMax = Math.max(j2, j3);
                list = listWvg;
                i2 = size;
                toq toqVar = new toq(kja0Var, kiVar, x2Var.toq(i4, kja0Var.f64238toq));
                int i6 = wvg.f67144x9kr.equals(kja0Var.f20024g.f23682r) ? kiVar.f20021n * 16 : kiVar.f20021n + 30;
                xwq3.toq qVar = kja0Var.f20024g.toq();
                qVar.lrht(i6);
                if (kja0Var.f64238toq == 2 && j3 > 0 && (i3 = kiVar.f64232toq) > 1) {
                    qVar.x9kr(i3 / (j3 / 1000000.0f));
                }
                C3386y.ld6(kja0Var.f64238toq, fn3eVar, qVar);
                int i7 = kja0Var.f64238toq;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.f64257ld6.isEmpty() ? null : new Metadata(this.f64257ld6);
                C3386y.x2(i7, metadata2, metadataN7h, qVar, metadataArr);
                toqVar.f64267zy.mo11931q(qVar.a9());
                size2 = (kja0Var.f64238toq == 2 && i5 == -1) ? arrayList.size() : i5;
                arrayList.add(toqVar);
                j2 = jMax;
            }
            i4++;
            arrayList2 = arrayList;
            listWvg = list;
            size = i2;
        }
        this.f64254fu4 = size2;
        this.f20041z = j2;
        toq[] toqVarArr = (toq[]) arrayList2.toArray(new toq[0]);
        this.f64265zurt = toqVarArr;
        this.f64259ni7 = qrj(toqVarArr);
        x2Var.mo11753i();
        x2Var.cdj(this);
    }

    /* JADX INFO: renamed from: h */
    private int m11856h(long j2) {
        int i2 = -1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        boolean z3 = true;
        long j5 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < ((toq[]) lrht.ld6(this.f64265zurt)).length; i4++) {
            toq toqVar = this.f64265zurt[i4];
            int i5 = toqVar.f20043n;
            ki kiVar = toqVar.f64266toq;
            if (i5 != kiVar.f64232toq) {
                long j6 = kiVar.f64233zy[i5];
                long j7 = ((long[][]) lrht.ld6(this.f64259ni7))[i4][i5];
                long j8 = j6 - j2;
                boolean z5 = j8 < 0 || j8 >= 262144;
                if ((!z5 && z3) || (z5 == z3 && j8 < j5)) {
                    z3 = z5;
                    j5 = j8;
                    i3 = i4;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z2 = z5;
                    i2 = i4;
                    j3 = j7;
                }
            }
        }
        return (j3 == Long.MAX_VALUE || !z2 || j4 < j3 + f20031r) ? i3 : i2;
    }

    /* JADX INFO: renamed from: i */
    private void m11857i(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        this.f64252f7l8.dd(8);
        ld6Var.fn3e(this.f64252f7l8.m13598q(), 0, 8);
        com.google.android.exoplayer2.extractor.mp4.toq.m11873n(this.f64252f7l8);
        ld6Var.cdj(this.f64252f7l8.m13596n());
        ld6Var.mo11730y();
    }

    private static boolean jk(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] ki() {
        return new InterfaceC3397p[]{new ld6()};
    }

    private static int kja0(ki kiVar, long j2) {
        int iM11854k = kiVar.m11854k(j2);
        return iM11854k == -1 ? kiVar.toq(j2) : iM11854k;
    }

    private int mcp(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        int iZy = this.f20037p.zy(ld6Var, fu4Var, this.f64257ld6);
        if (iZy == 1 && fu4Var.f19818k == 0) {
            n7h();
        }
        return iZy;
    }

    private void n7h() {
        this.f64264x2 = 0;
        this.f64256kja0 = 0;
    }

    private static int ni7(gvn7 gvn7Var) {
        gvn7Var.n5r1(8);
        int iX2 = x2(gvn7Var.kja0());
        if (iX2 != 0) {
            return iX2;
        }
        gvn7Var.hyr(4);
        while (gvn7Var.m13594k() > 0) {
            int iX22 = x2(gvn7Var.kja0());
            if (iX22 != 0) {
                return iX22;
            }
        }
        return 0;
    }

    private boolean o1t(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        AbstractC3373k.k kVarPeek;
        if (this.f64256kja0 == 0) {
            if (!ld6Var.mo11729p(this.f20040y.m13598q(), 0, 8, true)) {
                zurt();
                return false;
            }
            this.f64256kja0 = 8;
            this.f20040y.n5r1(0);
            this.f64258n7h = this.f20040y.d3();
            this.f64261qrj = this.f20040y.kja0();
        }
        long j2 = this.f64258n7h;
        if (j2 == 1) {
            ld6Var.readFully(this.f20040y.m13598q(), 8, 8);
            this.f64256kja0 += 8;
            this.f64258n7h = this.f20040y.d2ok();
        } else if (j2 == 0) {
            long length = ld6Var.getLength();
            if (length == -1 && (kVarPeek = this.f20039s.peek()) != null) {
                length = kVarPeek.f64227n2t;
            }
            if (length != -1) {
                this.f64258n7h = (length - ld6Var.getPosition()) + ((long) this.f64256kja0);
            }
        }
        if (this.f64258n7h < this.f64256kja0) {
            throw sok.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (jk(this.f64261qrj)) {
            long position = ld6Var.getPosition();
            long j3 = this.f64258n7h;
            int i2 = this.f64256kja0;
            long j4 = (position + j3) - ((long) i2);
            if (j3 != i2 && this.f64261qrj == 1835365473) {
                m11857i(ld6Var);
            }
            this.f20039s.push(new AbstractC3373k.k(this.f64261qrj, j4));
            if (this.f64258n7h == this.f64256kja0) {
                fn3e(j4);
            } else {
                n7h();
            }
        } else if (a9(this.f64261qrj)) {
            C3844k.m13633s(this.f64256kja0 == 8);
            C3844k.m13633s(this.f64258n7h <= 2147483647L);
            gvn7 gvn7Var = new gvn7((int) this.f64258n7h);
            System.arraycopy(this.f20040y.m13598q(), 0, gvn7Var.m13598q(), 0, 8);
            this.f20034h = gvn7Var;
            this.f64264x2 = 1;
        } else {
            m11860z(ld6Var.getPosition() - ((long) this.f64256kja0));
            this.f20034h = null;
            this.f64264x2 = 1;
        }
        return true;
    }

    private static long[][] qrj(toq[] toqVarArr) {
        long[][] jArr = new long[toqVarArr.length][];
        int[] iArr = new int[toqVarArr.length];
        long[] jArr2 = new long[toqVarArr.length];
        boolean[] zArr = new boolean[toqVarArr.length];
        for (int i2 = 0; i2 < toqVarArr.length; i2++) {
            jArr[i2] = new long[toqVarArr[i2].f64266toq.f64232toq];
            jArr2[i2] = toqVarArr[i2].f64266toq.f20019g[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < toqVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < toqVarArr.length; i5++) {
                if (!zArr[i5]) {
                    long j4 = jArr2[i5];
                    if (j4 <= j3) {
                        i4 = i5;
                        j3 = j4;
                    }
                }
            }
            int i6 = iArr[i4];
            long[] jArr3 = jArr[i4];
            jArr3[i6] = j2;
            ki kiVar = toqVarArr[i4].f64266toq;
            j2 += (long) kiVar.f20022q[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr3.length) {
                jArr2[i4] = kiVar.f20019g[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: t */
    private int m11859t(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        int i2;
        fu4 fu4Var2;
        long position = ld6Var.getPosition();
        if (this.f64251cdj == -1) {
            int iM11856h = m11856h(position);
            this.f64251cdj = iM11856h;
            if (iM11856h == -1) {
                return -1;
            }
        }
        toq toqVar = ((toq[]) lrht.ld6(this.f64265zurt))[this.f64251cdj];
        InterfaceC3401t interfaceC3401t = toqVar.f64267zy;
        int i3 = toqVar.f20043n;
        ki kiVar = toqVar.f64266toq;
        long j2 = kiVar.f64233zy[i3];
        int i4 = kiVar.f20022q[i3];
        mcp mcpVar = toqVar.f20044q;
        long j3 = (j2 - position) + ((long) this.f64255ki);
        if (j3 < 0) {
            i2 = 1;
            fu4Var2 = fu4Var;
        } else {
            if (j3 < 262144) {
                if (toqVar.f20042k.f64236f7l8 == 1) {
                    j3 += 8;
                    i4 -= 8;
                }
                ld6Var.cdj((int) j3);
                kja0 kja0Var = toqVar.f20042k;
                if (kja0Var.f20027p == 0) {
                    if (wvg.f67097dd.equals(kja0Var.f20024g.f23682r)) {
                        if (this.f64262t8r == 0) {
                            com.google.android.exoplayer2.audio.zy.m11542k(i4, this.f64252f7l8);
                            interfaceC3401t.zy(this.f64252f7l8, 7);
                            this.f64262t8r += 7;
                        }
                        i4 += 7;
                    } else if (mcpVar != null) {
                        mcpVar.m11782q(ld6Var);
                    }
                    while (true) {
                        int i5 = this.f64262t8r;
                        if (i5 >= i4) {
                            break;
                        }
                        int qVar = interfaceC3401t.toq(ld6Var, i4 - i5, false);
                        this.f64255ki += qVar;
                        this.f64262t8r += qVar;
                        this.f20035i -= qVar;
                    }
                } else {
                    byte[] bArrM13598q = this.f20033g.m13598q();
                    bArrM13598q[0] = 0;
                    bArrM13598q[1] = 0;
                    bArrM13598q[2] = 0;
                    int i6 = toqVar.f20042k.f20027p;
                    int i7 = 4 - i6;
                    while (this.f64262t8r < i4) {
                        int i8 = this.f20035i;
                        if (i8 == 0) {
                            ld6Var.readFully(bArrM13598q, i7, i6);
                            this.f64255ki += i6;
                            this.f20033g.n5r1(0);
                            int iKja0 = this.f20033g.kja0();
                            if (iKja0 < 0) {
                                throw sok.createForMalformedContainer("Invalid NAL length", null);
                            }
                            this.f20035i = iKja0;
                            this.f20036n.n5r1(0);
                            interfaceC3401t.zy(this.f20036n, 4);
                            this.f64262t8r += 4;
                            i4 += i7;
                        } else {
                            int qVar2 = interfaceC3401t.toq(ld6Var, i8, false);
                            this.f64255ki += qVar2;
                            this.f64262t8r += qVar2;
                            this.f20035i -= qVar2;
                        }
                    }
                }
                int i9 = i4;
                ki kiVar2 = toqVar.f64266toq;
                long j4 = kiVar2.f20019g[i3];
                int i10 = kiVar2.f64231f7l8[i3];
                if (mcpVar != null) {
                    mcpVar.zy(interfaceC3401t, j4, i10, i9, 0, null);
                    if (i3 + 1 == toqVar.f64266toq.f64232toq) {
                        mcpVar.m11781k(interfaceC3401t, null);
                    }
                } else {
                    interfaceC3401t.mo11930n(j4, i10, i9, 0, null);
                }
                toqVar.f20043n++;
                this.f64251cdj = -1;
                this.f64255ki = 0;
                this.f64262t8r = 0;
                this.f20035i = 0;
                return 0;
            }
            fu4Var2 = fu4Var;
            i2 = 1;
        }
        fu4Var2.f19818k = j2;
        return i2;
    }

    private static long t8r(ki kiVar, long j2, long j3) {
        int iKja0 = kja0(kiVar, j2);
        return iKja0 == -1 ? j3 : Math.min(kiVar.f64233zy[iKja0], j3);
    }

    private boolean wvg(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        boolean z2;
        long j2 = this.f64258n7h - ((long) this.f64256kja0);
        long position = ld6Var.getPosition() + j2;
        gvn7 gvn7Var = this.f20034h;
        if (gvn7Var != null) {
            ld6Var.readFully(gvn7Var.m13598q(), this.f64256kja0, (int) j2);
            if (this.f64261qrj == 1718909296) {
                this.f64260o1t = ni7(gvn7Var);
            } else if (!this.f20039s.isEmpty()) {
                this.f20039s.peek().m11851n(new AbstractC3373k.toq(this.f64261qrj, gvn7Var));
            }
        } else {
            if (j2 >= 262144) {
                fu4Var.f19818k = ld6Var.getPosition() + j2;
                z2 = true;
                fn3e(position);
                return (z2 || this.f64264x2 == 2) ? false : true;
            }
            ld6Var.cdj((int) j2);
        }
        z2 = false;
        fn3e(position);
        if (z2) {
        }
    }

    private static int x2(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: z */
    private void m11860z(long j2) {
        if (this.f64261qrj == 1836086884) {
            int i2 = this.f64256kja0;
            this.f64263wvg = new MotionPhotoMetadata(0L, j2, C3548p.f65257toq, j2 + ((long) i2), this.f64258n7h - ((long) i2));
        }
    }

    private void zurt() {
        if (this.f64260o1t != 2 || (this.f20038q & 2) == 0) {
            return;
        }
        com.google.android.exoplayer2.extractor.x2 x2Var = (com.google.android.exoplayer2.extractor.x2) C3844k.f7l8(this.f64253fn3e);
        x2Var.toq(0, 4).mo11931q(new xwq3.toq().uv6(this.f64263wvg == null ? null : new Metadata(this.f64263wvg)).a9());
        x2Var.mo11753i();
        x2Var.cdj(new o1t.toq(C3548p.f65257toq));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f20039s.clear();
        this.f64256kja0 = 0;
        this.f64251cdj = -1;
        this.f64255ki = 0;
        this.f64262t8r = 0;
        this.f20035i = 0;
        if (j2 == 0) {
            if (this.f64264x2 != 3) {
                n7h();
                return;
            } else {
                this.f20037p.f7l8();
                this.f64257ld6.clear();
                return;
            }
        }
        toq[] toqVarArr = this.f64265zurt;
        if (toqVarArr != null) {
            for (toq toqVar : toqVarArr) {
                fti(toqVar, j3);
                mcp mcpVar = toqVar.f20044q;
                if (mcpVar != null) {
                    mcpVar.toq();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        long j3;
        long jT8r;
        long j4;
        long j5;
        int qVar;
        if (((toq[]) C3844k.f7l8(this.f64265zurt)).length == 0) {
            return new o1t.C3388k(com.google.android.exoplayer2.extractor.wvg.f64718zy);
        }
        int i2 = this.f64254fu4;
        if (i2 != -1) {
            ki kiVar = this.f64265zurt[i2].f64266toq;
            int iKja0 = kja0(kiVar, j2);
            if (iKja0 == -1) {
                return new o1t.C3388k(com.google.android.exoplayer2.extractor.wvg.f64718zy);
            }
            long j6 = kiVar.f20019g[iKja0];
            j3 = kiVar.f64233zy[iKja0];
            if (j6 >= j2 || iKja0 >= kiVar.f64232toq - 1 || (qVar = kiVar.toq(j2)) == -1 || qVar == iKja0) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = kiVar.f20019g[qVar];
                j5 = kiVar.f64233zy[qVar];
            }
            jT8r = j5;
            j2 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            jT8r = -1;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            toq[] toqVarArr = this.f64265zurt;
            if (i3 >= toqVarArr.length) {
                break;
            }
            if (i3 != this.f64254fu4) {
                ki kiVar2 = toqVarArr[i3].f64266toq;
                long jT8r2 = t8r(kiVar2, j2, j3);
                if (j4 != C3548p.f65257toq) {
                    jT8r = t8r(kiVar2, j4, jT8r);
                }
                j3 = jT8r2;
            }
            i3++;
        }
        com.google.android.exoplayer2.extractor.wvg wvgVar = new com.google.android.exoplayer2.extractor.wvg(j2, j3);
        return j4 == C3548p.f65257toq ? new o1t.C3388k(wvgVar) : new o1t.C3388k(wvgVar, new com.google.android.exoplayer2.extractor.wvg(j4, jT8r));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        this.f64253fn3e = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f20041z;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return n7h.m11862n(ld6Var, (this.f20038q & 2) != 0);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        while (true) {
            int i2 = this.f64264x2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return m11859t(ld6Var, fu4Var);
                    }
                    if (i2 == 3) {
                        return mcp(ld6Var, fu4Var);
                    }
                    throw new IllegalStateException();
                }
                if (wvg(ld6Var, fu4Var)) {
                    return 1;
                }
            } else if (!o1t(ld6Var)) {
                return -1;
            }
        }
    }

    public ld6(int i2) {
        this.f20038q = i2;
        this.f64264x2 = (i2 & 4) != 0 ? 3 : 0;
        this.f20037p = new qrj();
        this.f64257ld6 = new ArrayList();
        this.f20040y = new gvn7(16);
        this.f20039s = new ArrayDeque<>();
        this.f20036n = new gvn7(C3856t.f67070toq);
        this.f20033g = new gvn7(4);
        this.f64252f7l8 = new gvn7();
        this.f64251cdj = -1;
    }
}

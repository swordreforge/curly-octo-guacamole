package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.gcp;
import com.google.common.collect.lw;
import com.google.common.collect.nsb;
import com.google.common.collect.se;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import zy.InterfaceC7842s;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.k */
/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3708k extends zy {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final float f66029a9 = 0.7f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final float f66030fti = 0.75f;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f66031jk = 719;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final long f66032jp0y = 1000;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f66033mcp = 1279;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f66034o1t = 10000;

    /* JADX INFO: renamed from: t */
    public static final int f22315t = 25000;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f66035wvg = 25000;

    /* JADX INFO: renamed from: z */
    private static final String f22316z = "AdaptiveTrackSelection";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final float f66036cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f66037fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.source.chunk.n7h f66038fu4;

    /* JADX INFO: renamed from: h */
    private final float f22317h;

    /* JADX INFO: renamed from: i */
    private float f22318i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final se<k> f66039ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f66040kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final long f66041ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f66042n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private long f66043ni7;

    /* JADX INFO: renamed from: p */
    private final InterfaceC3808n f22319p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final long f66044qrj;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final InterfaceC3850n f66045t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final long f66046x2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f66047zurt;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.k$k */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        public final long f22320k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f66048toq;

        public k(long j2, long j3) {
            this.f22320k = j2;
            this.f66048toq = j3;
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f22320k == kVar.f22320k && this.f66048toq == kVar.f66048toq;
        }

        public int hashCode() {
            return (((int) this.f22320k) * 31) + ((int) this.f66048toq);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.k$toq */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class toq implements InterfaceC3715s.toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final float f66049f7l8;

        /* JADX INFO: renamed from: g */
        private final float f22321g;

        /* JADX INFO: renamed from: k */
        private final int f22322k;

        /* JADX INFO: renamed from: n */
        private final int f22323n;

        /* JADX INFO: renamed from: q */
        private final int f22324q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f66050toq;

        /* JADX INFO: renamed from: y */
        private final InterfaceC3850n f22325y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f66051zy;

        public toq() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s.toq
        /* JADX INFO: renamed from: k */
        public final InterfaceC3715s[] mo12416k(InterfaceC3715s.k[] kVarArr, InterfaceC3808n interfaceC3808n, fti.C3596k c3596k, pc pcVar) {
            se seVarMcp = C3708k.mcp(kVarArr);
            InterfaceC3715s[] interfaceC3715sArr = new InterfaceC3715s[kVarArr.length];
            for (int i2 = 0; i2 < kVarArr.length; i2++) {
                InterfaceC3715s.k kVar = kVarArr[i2];
                if (kVar != null) {
                    int[] iArr = kVar.f66064toq;
                    if (iArr.length != 0) {
                        interfaceC3715sArr[i2] = iArr.length == 1 ? new C3712p(kVar.f22341k, iArr[0], kVar.f66065zy) : toq(kVar.f22341k, iArr, kVar.f66065zy, interfaceC3808n, (se) seVarMcp.get(i2));
                    }
                }
            }
            return interfaceC3715sArr;
        }

        protected C3708k toq(C3564a c3564a, int[] iArr, int i2, InterfaceC3808n interfaceC3808n, se<k> seVar) {
            return new C3708k(c3564a, iArr, i2, interfaceC3808n, this.f22322k, this.f66050toq, this.f66051zy, this.f22324q, this.f22323n, this.f22321g, this.f66049f7l8, seVar, this.f22325y);
        }

        public toq(int i2, int i3, int i4, float f2) {
            this(i2, i3, i4, C3708k.f66033mcp, C3708k.f66031jk, f2, 0.75f, InterfaceC3850n.f23248k);
        }

        public toq(int i2, int i3, int i4, int i5, int i6, float f2) {
            this(i2, i3, i4, i5, i6, f2, 0.75f, InterfaceC3850n.f23248k);
        }

        public toq(int i2, int i3, int i4, float f2, float f3, InterfaceC3850n interfaceC3850n) {
            this(i2, i3, i4, C3708k.f66033mcp, C3708k.f66031jk, f2, f3, interfaceC3850n);
        }

        public toq(int i2, int i3, int i4, int i5, int i6, float f2, float f3, InterfaceC3850n interfaceC3850n) {
            this.f22322k = i2;
            this.f66050toq = i3;
            this.f66051zy = i4;
            this.f22324q = i5;
            this.f22323n = i6;
            this.f22321g = f2;
            this.f66049f7l8 = f3;
            this.f22325y = interfaceC3850n;
        }
    }

    public C3708k(C3564a c3564a, int[] iArr, InterfaceC3808n interfaceC3808n) {
        this(c3564a, iArr, 0, interfaceC3808n, 10000L, 25000L, 25000L, f66033mcp, f66031jk, 0.7f, 0.75f, se.of(), InterfaceC3850n.f23248k);
    }

    private long a9(List<? extends com.google.android.exoplayer2.source.chunk.n7h> list) {
        if (list.isEmpty()) {
            return C3548p.f65257toq;
        }
        com.google.android.exoplayer2.source.chunk.n7h n7hVar = (com.google.android.exoplayer2.source.chunk.n7h) nsb.ni7(list);
        long j2 = n7hVar.f65337f7l8;
        if (j2 == C3548p.f65257toq) {
            return C3548p.f65257toq;
        }
        long j3 = n7hVar.f21370y;
        return j3 != C3548p.f65257toq ? j3 - j2 : C3548p.f65257toq;
    }

    private static se<Integer> d3(long[][] jArr) {
        lw lwVarMo15734p = gcp.m15724y().m15727k().mo15725k();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long[] jArr2 = jArr[i2];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    long[] jArr3 = jArr[i2];
                    double dLog = 0.0d;
                    if (i3 >= jArr3.length) {
                        break;
                    }
                    long j2 = jArr3[i3];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i3] = dLog;
                    i3++;
                }
                int i4 = length - 1;
                double d2 = dArr[i4] - dArr[0];
                int i5 = 0;
                while (i5 < i4) {
                    double d4 = dArr[i5];
                    i5++;
                    lwVarMo15734p.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d4 + dArr[i5]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i2));
                }
            }
        }
        return se.copyOf(lwVarMo15734p.values());
    }

    private long eqxt(long j2) {
        return (j2 > C3548p.f65257toq ? 1 : (j2 == C3548p.f65257toq ? 0 : -1)) != 0 && (j2 > this.f66041ld6 ? 1 : (j2 == this.f66041ld6 ? 0 : -1)) <= 0 ? (long) (j2 * this.f66036cdj) : this.f66041ld6;
    }

    private static long[][] gvn7(InterfaceC3715s.k[] kVarArr) {
        long[][] jArr = new long[kVarArr.length][];
        for (int i2 = 0; i2 < kVarArr.length; i2++) {
            InterfaceC3715s.k kVar = kVarArr[i2];
            if (kVar == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[kVar.f66064toq.length];
                int i3 = 0;
                while (true) {
                    if (i3 >= kVar.f66064toq.length) {
                        break;
                    }
                    jArr[i2][i3] = kVar.f22341k.toq(r5[i3]).f23672h;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    private long jk(long j2) {
        long jOc = oc(j2);
        if (this.f66039ki.isEmpty()) {
            return jOc;
        }
        int i2 = 1;
        while (i2 < this.f66039ki.size() - 1 && this.f66039ki.get(i2).f22320k < jOc) {
            i2++;
        }
        k kVar = this.f66039ki.get(i2 - 1);
        k kVar2 = this.f66039ki.get(i2);
        long j3 = kVar.f22320k;
        float f2 = (jOc - j3) / (kVar2.f22320k - j3);
        return kVar.f66048toq + ((long) (f2 * (kVar2.f66048toq - r2)));
    }

    private long jp0y(com.google.android.exoplayer2.source.chunk.kja0[] kja0VarArr, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list) {
        int i2 = this.f66037fn3e;
        if (i2 < kja0VarArr.length && kja0VarArr[i2].next()) {
            com.google.android.exoplayer2.source.chunk.kja0 kja0Var = kja0VarArr[this.f66037fn3e];
            return kja0Var.toq() - kja0Var.mo12656k();
        }
        for (com.google.android.exoplayer2.source.chunk.kja0 kja0Var2 : kja0VarArr) {
            if (kja0Var2.next()) {
                return kja0Var2.toq() - kja0Var2.mo12656k();
            }
        }
        return a9(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static se<se<k>> mcp(InterfaceC3715s.k[] kVarArr) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3715s.k kVar : kVarArr) {
            if (kVar == null || kVar.f66064toq.length <= 1) {
                arrayList.add(null);
            } else {
                se.C4520k c4520kBuilder = se.builder();
                c4520kBuilder.mo15569k(new k(0L, 0L));
                arrayList.add(c4520kBuilder);
            }
        }
        long[][] jArrGvn7 = gvn7(kVarArr);
        int[] iArr = new int[jArrGvn7.length];
        long[] jArr = new long[jArrGvn7.length];
        for (int i2 = 0; i2 < jArrGvn7.length; i2++) {
            long[] jArr2 = jArrGvn7[i2];
            jArr[i2] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        o1t(arrayList, jArr);
        se<Integer> seVarD3 = d3(jArrGvn7);
        for (int i3 = 0; i3 < seVarD3.size(); i3++) {
            int iIntValue = seVarD3.get(i3).intValue();
            int i4 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i4;
            jArr[iIntValue] = jArrGvn7[iIntValue][i4];
            o1t(arrayList, jArr);
        }
        for (int i5 = 0; i5 < kVarArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        o1t(arrayList, jArr);
        se.C4520k c4520kBuilder2 = se.builder();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            se.C4520k c4520k = (se.C4520k) arrayList.get(i6);
            c4520kBuilder2.mo15569k(c4520k == null ? se.of() : c4520k.mo15570n());
        }
        return c4520kBuilder2.mo15570n();
    }

    private static void o1t(List<se.C4520k<k>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            se.C4520k<k> c4520k = list.get(i2);
            if (c4520k != null) {
                c4520k.mo15569k(new k(j2, jArr[i2]));
            }
        }
    }

    private long oc(long j2) {
        long jMo12412n = (long) (this.f22319p.mo12412n() * this.f22317h);
        long jM13487k = this.f22319p.m13487k();
        if (jM13487k == C3548p.f65257toq || j2 == C3548p.f65257toq) {
            return (long) (jMo12412n / this.f22318i);
        }
        float f2 = j2;
        return (long) ((jMo12412n * Math.max((f2 / this.f22318i) - jM13487k, 0.0f)) / f2);
    }

    /* JADX INFO: renamed from: t */
    private int m13132t(long j2, long j3) {
        long jJk = jk(j3);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f22346q; i3++) {
            if (j2 == Long.MIN_VALUE || !mo13152n(i3, j2)) {
                xwq3 xwq3VarF7l8 = f7l8(i3);
                if (wvg(xwq3VarF7l8, xwq3VarF7l8.f23672h, jJk)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    protected boolean d2ok(long j2, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list) {
        long j3 = this.f66043ni7;
        return j3 == C3548p.f65257toq || j2 - j3 >= 1000 || !(list.isEmpty() || ((com.google.android.exoplayer2.source.chunk.n7h) nsb.ni7(list)).equals(this.f66038fu4));
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public int fn3e() {
        return this.f66047zurt;
    }

    protected long fti() {
        return this.f66044qrj;
    }

    @Override // com.google.android.exoplayer2.trackselection.zy, com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: h */
    public int mo13134h(long j2, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list) {
        int i2;
        int i3;
        long jMo13575q = this.f66045t8r.mo13575q();
        if (!d2ok(jMo13575q, list)) {
            return list.size();
        }
        this.f66043ni7 = jMo13575q;
        this.f66038fu4 = list.isEmpty() ? null : (com.google.android.exoplayer2.source.chunk.n7h) nsb.ni7(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jCh = lrht.ch(list.get(size - 1).f65337f7l8 - j2, this.f22318i);
        long jFti = fti();
        if (jCh < jFti) {
            return size;
        }
        xwq3 xwq3VarF7l8 = f7l8(m13132t(jMo13575q, a9(list)));
        for (int i4 = 0; i4 < size; i4++) {
            com.google.android.exoplayer2.source.chunk.n7h n7hVar = list.get(i4);
            xwq3 xwq3Var = n7hVar.f21368q;
            if (lrht.ch(n7hVar.f65337f7l8 - j2, this.f22318i) >= jFti && xwq3Var.f23672h < xwq3VarF7l8.f23672h && (i2 = xwq3Var.f23679o) != -1 && i2 <= this.f66040kja0 && (i3 = xwq3Var.f23674j) != -1 && i3 <= this.f66042n7h && i2 < xwq3VarF7l8.f23679o) {
                return i4;
            }
        }
        return size;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: k */
    public int mo12414k() {
        return this.f66037fn3e;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public void ki(long j2, long j3, long j4, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list, com.google.android.exoplayer2.source.chunk.kja0[] kja0VarArr) {
        long jMo13575q = this.f66045t8r.mo13575q();
        long jJp0y = jp0y(kja0VarArr, list);
        int i2 = this.f66047zurt;
        if (i2 == 0) {
            this.f66047zurt = 1;
            this.f66037fn3e = m13132t(jMo13575q, jJp0y);
            return;
        }
        int i3 = this.f66037fn3e;
        int iCdj = list.isEmpty() ? -1 : cdj(((com.google.android.exoplayer2.source.chunk.n7h) nsb.ni7(list)).f21368q);
        if (iCdj != -1) {
            i2 = ((com.google.android.exoplayer2.source.chunk.n7h) nsb.ni7(list)).f21367n;
            i3 = iCdj;
        }
        int iM13132t = m13132t(jMo13575q, jJp0y);
        if (!mo13152n(i3, jMo13575q)) {
            xwq3 xwq3VarF7l8 = f7l8(i3);
            xwq3 xwq3VarF7l82 = f7l8(iM13132t);
            if ((xwq3VarF7l82.f23672h > xwq3VarF7l8.f23672h && j3 < eqxt(j4)) || (xwq3VarF7l82.f23672h < xwq3VarF7l8.f23672h && j3 >= this.f66046x2)) {
                iM13132t = i3;
            }
        }
        if (iM13132t != i3) {
            i2 = 3;
        }
        this.f66047zurt = i2;
        this.f66037fn3e = iM13132t;
    }

    @Override // com.google.android.exoplayer2.trackselection.zy, com.google.android.exoplayer2.trackselection.InterfaceC3715s
    @InterfaceC7842s
    public void kja0() {
        this.f66043ni7 = C3548p.f65257toq;
        this.f66038fu4 = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    @dd
    /* JADX INFO: renamed from: p */
    public Object mo12415p() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.zy, com.google.android.exoplayer2.trackselection.InterfaceC3715s
    @InterfaceC7842s
    /* JADX INFO: renamed from: q */
    public void mo13135q() {
        this.f66038fu4 = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.zy, com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: s */
    public void mo13136s(float f2) {
        this.f22318i = f2;
    }

    protected boolean wvg(xwq3 xwq3Var, int i2, long j2) {
        return ((long) i2) <= j2;
    }

    protected C3708k(C3564a c3564a, int[] iArr, int i2, InterfaceC3808n interfaceC3808n, long j2, long j3, long j4, int i3, int i4, float f2, float f3, List<k> list, InterfaceC3850n interfaceC3850n) {
        InterfaceC3808n interfaceC3808n2;
        long j5;
        super(c3564a, iArr, i2);
        if (j4 < j2) {
            com.google.android.exoplayer2.util.ni7.qrj(f22316z, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            interfaceC3808n2 = interfaceC3808n;
            j5 = j2;
        } else {
            interfaceC3808n2 = interfaceC3808n;
            j5 = j4;
        }
        this.f22319p = interfaceC3808n2;
        this.f66041ld6 = j2 * 1000;
        this.f66046x2 = j3 * 1000;
        this.f66044qrj = j5 * 1000;
        this.f66042n7h = i3;
        this.f66040kja0 = i4;
        this.f22317h = f2;
        this.f66036cdj = f3;
        this.f66039ki = se.copyOf((Collection) list);
        this.f66045t8r = interfaceC3850n;
        this.f22318i = 1.0f;
        this.f66047zurt = 0;
        this.f66043ni7 = C3548p.f65257toq;
    }
}

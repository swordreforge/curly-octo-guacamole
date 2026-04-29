package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.gcp;
import com.google.common.collect.lw;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MergingMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x9kr extends f7l8<Integer> {

    /* JADX INFO: renamed from: a */
    private static final int f21704a = -1;

    /* JADX INFO: renamed from: x */
    private static final tfm f21705x = new tfm.zy().jk("MergingMediaSource").m13065k();

    /* JADX INFO: renamed from: b */
    @zy.dd
    private toq f21706b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC3627s f21707c;

    /* JADX INFO: renamed from: e */
    private final Map<Object, Long> f21708e;

    /* JADX INFO: renamed from: f */
    private final ArrayList<fti> f21709f;

    /* JADX INFO: renamed from: j */
    private final lw<Object, C3625q> f21710j;

    /* JADX INFO: renamed from: l */
    private final pc[] f21711l;

    /* JADX INFO: renamed from: m */
    private long[][] f21712m;

    /* JADX INFO: renamed from: o */
    private int f21713o;

    /* JADX INFO: renamed from: r */
    private final fti[] f21714r;

    /* JADX INFO: renamed from: t */
    private final boolean f21715t;

    /* JADX INFO: renamed from: z */
    private final boolean f21716z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.x9kr$k */
    /* JADX INFO: compiled from: MergingMediaSource.java */
    private static final class C3630k extends fn3e {

        /* JADX INFO: renamed from: h */
        private final long[] f21717h;

        /* JADX INFO: renamed from: p */
        private final long[] f21718p;

        public C3630k(pc pcVar, Map<Object, Long> map) {
            super(pcVar);
            int iZurt = pcVar.zurt();
            this.f21717h = new long[pcVar.zurt()];
            pc.C3550q c3550q = new pc.C3550q();
            for (int i2 = 0; i2 < iZurt; i2++) {
                this.f21717h[i2] = pcVar.m12484i(i2, c3550q).f21128f;
            }
            int iQrj = pcVar.qrj();
            this.f21718p = new long[iQrj];
            pc.toq toqVar = new pc.toq();
            for (int i3 = 0; i3 < iQrj; i3++) {
                pcVar.ld6(i3, toqVar, true);
                long jLongValue = ((Long) C3844k.f7l8(map.get(toqVar.f21153q))).longValue();
                long[] jArr = this.f21718p;
                jLongValue = jLongValue == Long.MIN_VALUE ? toqVar.f21149g : jLongValue;
                jArr[i3] = jLongValue;
                long j2 = toqVar.f21149g;
                if (j2 != C3548p.f65257toq) {
                    long[] jArr2 = this.f21717h;
                    int i4 = toqVar.f21151n;
                    jArr2[i4] = jArr2[i4] - (j2 - jLongValue);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.android.exoplayer2.pc.C3550q fn3e(int r5, com.google.android.exoplayer2.pc.C3550q r6, long r7) {
            /*
                r4 = this;
                super.fn3e(r5, r6, r7)
                long[] r7 = r4.f21717h
                r0 = r7[r5]
                r6.f21128f = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f21134l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f21134l
            L20:
                r6.f21134l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.x9kr.C3630k.fn3e(int, com.google.android.exoplayer2.pc$q, long):com.google.android.exoplayer2.pc$q");
        }

        @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
        public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
            super.ld6(i2, toqVar, z2);
            toqVar.f21149g = this.f21718p[i2];
            return toqVar;
        }
    }

    /* JADX INFO: compiled from: MergingMediaSource.java */
    public static final class toq extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.x9kr$toq$k */
        /* JADX INFO: compiled from: MergingMediaSource.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC3631k {
        }

        public toq(int i2) {
            this.reason = i2;
        }
    }

    public x9kr(fti... ftiVarArr) {
        this(false, ftiVarArr);
    }

    private void hyr() {
        pc[] pcVarArr;
        pc.toq toqVar = new pc.toq();
        for (int i2 = 0; i2 < this.f21713o; i2++) {
            int i3 = 0;
            long j2 = Long.MIN_VALUE;
            while (true) {
                pcVarArr = this.f21711l;
                if (i3 >= pcVarArr.length) {
                    break;
                }
                long jN7h = pcVarArr[i3].m12485p(i2, toqVar).n7h();
                if (jN7h != C3548p.f65257toq) {
                    long j3 = jN7h + this.f21712m[i2][i3];
                    if (j2 == Long.MIN_VALUE || j3 < j2) {
                        j2 = j3;
                    }
                }
                i3++;
            }
            Object objT8r = pcVarArr[0].t8r(i2);
            this.f21708e.put(objT8r, Long.valueOf(j2));
            Iterator<C3625q> it = this.f21710j.get(objT8r).iterator();
            while (it.hasNext()) {
                it.next().m12814i(0L, j2);
            }
        }
    }

    private void ncyb() {
        pc.toq toqVar = new pc.toq();
        for (int i2 = 0; i2 < this.f21713o; i2++) {
            long j2 = -this.f21711l[0].m12485p(i2, toqVar).ki();
            int i3 = 1;
            while (true) {
                pc[] pcVarArr = this.f21711l;
                if (i3 < pcVarArr.length) {
                    this.f21712m[i2][i3] = j2 - (-pcVarArr[i3].m12485p(i2, toqVar).ki());
                    i3++;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        if (this.f21715t) {
            C3625q c3625q = (C3625q) jkVar;
            Iterator<Map.Entry<Object, C3625q>> it = this.f21710j.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C3625q> next = it.next();
                if (next.getValue().equals(c3625q)) {
                    this.f21710j.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            jkVar = c3625q.f21681k;
        }
        dd ddVar = (dd) jkVar;
        int i2 = 0;
        while (true) {
            fti[] ftiVarArr = this.f21714r;
            if (i2 >= ftiVarArr.length) {
                return;
            }
            ftiVarArr[i2].mo12564g(ddVar.toq(i2));
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        int length = this.f21714r.length;
        jk[] jkVarArr = new jk[length];
        int iMo12147g = this.f21711l[0].mo12147g(c3596k.f21225k);
        for (int i2 = 0; i2 < length; i2++) {
            jkVarArr[i2] = this.f21714r[i2].mo12565k(c3596k.mo12557k(this.f21711l[i2].t8r(iMo12147g)), toqVar, j2 - this.f21712m[iMo12147g][i2]);
        }
        dd ddVar = new dd(this.f21707c, this.f21712m[iMo12147g], jkVarArr);
        if (!this.f21715t) {
            return ddVar;
        }
        C3625q c3625q = new C3625q(ddVar, true, 0L, ((Long) C3844k.f7l8(this.f21708e.get(c3596k.f21225k))).longValue());
        this.f21710j.put(c3596k.f21225k, c3625q);
        return c3625q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    @zy.dd
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public fti.C3596k gvn7(Integer num, fti.C3596k c3596k) {
        if (num.intValue() == 0) {
            return c3596k;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void mcp() {
        super.mcp();
        Arrays.fill(this.f21711l, (Object) null);
        this.f21713o = -1;
        this.f21706b = null;
        this.f21709f.clear();
        Collections.addAll(this.f21709f, this.f21714r);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        fti[] ftiVarArr = this.f21714r;
        return ftiVarArr.length > 0 ? ftiVarArr[0].mo12566n() : f21705x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void lvui(Integer num, fti ftiVar, pc pcVar) {
        if (this.f21706b != null) {
            return;
        }
        if (this.f21713o == -1) {
            this.f21713o = pcVar.qrj();
        } else if (pcVar.qrj() != this.f21713o) {
            this.f21706b = new toq(0);
            return;
        }
        if (this.f21712m.length == 0) {
            this.f21712m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f21713o, this.f21711l.length);
        }
        this.f21709f.remove(ftiVar);
        this.f21711l[num.intValue()] = pcVar;
        if (this.f21709f.isEmpty()) {
            if (this.f21716z) {
                ncyb();
            }
            pc c3630k = this.f21711l[0];
            if (this.f21715t) {
                hyr();
                c3630k = new C3630k(c3630k, this.f21708e);
            }
            m12741t(c3630k);
        }
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.fti
    public void n7h() throws IOException {
        toq toqVar = this.f21706b;
        if (toqVar != null) {
            throw toqVar;
        }
        super.n7h();
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        super.wvg(uv6Var);
        for (int i2 = 0; i2 < this.f21714r.length; i2++) {
            dd(Integer.valueOf(i2), this.f21714r[i2]);
        }
    }

    public x9kr(boolean z2, fti... ftiVarArr) {
        this(z2, false, ftiVarArr);
    }

    public x9kr(boolean z2, boolean z3, fti... ftiVarArr) {
        this(z2, z3, new x2(), ftiVarArr);
    }

    public x9kr(boolean z2, boolean z3, InterfaceC3627s interfaceC3627s, fti... ftiVarArr) {
        this.f21716z = z2;
        this.f21715t = z3;
        this.f21714r = ftiVarArr;
        this.f21707c = interfaceC3627s;
        this.f21709f = new ArrayList<>(Arrays.asList(ftiVarArr));
        this.f21713o = -1;
        this.f21711l = new pc[ftiVarArr.length];
        this.f21712m = new long[0][];
        this.f21708e = new HashMap();
        this.f21710j = gcp.m15722q().m15727k().mo15725k();
    }
}

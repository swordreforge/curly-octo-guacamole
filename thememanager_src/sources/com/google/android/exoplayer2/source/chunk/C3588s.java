package com.google.android.exoplayer2.source.chunk;

import android.os.Looper;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.fn3e;
import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.source.InterfaceC3622o;
import com.google.android.exoplayer2.source.chunk.InterfaceC3586p;
import com.google.android.exoplayer2.source.hb;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.source.ni7;
import com.google.android.exoplayer2.source.wvg;
import com.google.android.exoplayer2.upstream.d3;
import com.google.android.exoplayer2.upstream.oc;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.s */
/* JADX INFO: compiled from: ChunkSampleStream.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3588s<T extends InterfaceC3586p> implements InterfaceC3603j, InterfaceC3622o, oc.toq<AbstractC3581g>, oc.InterfaceC3812g {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f65355bo = "ChunkSampleStream";

    /* JADX INFO: renamed from: a */
    private int f21394a;

    /* JADX INFO: renamed from: b */
    private long f21395b;

    /* JADX INFO: renamed from: c */
    private final zy f21396c;

    /* JADX INFO: renamed from: e */
    @dd
    private AbstractC3581g f21397e;

    /* JADX INFO: renamed from: f */
    private final hb[] f21398f;

    /* JADX INFO: renamed from: g */
    private final boolean[] f21399g;

    /* JADX INFO: renamed from: h */
    private final d3 f21400h;

    /* JADX INFO: renamed from: i */
    private final oc f21401i;

    /* JADX INFO: renamed from: j */
    private xwq3 f21402j;

    /* JADX INFO: renamed from: k */
    public final int f21403k;

    /* JADX INFO: renamed from: l */
    private final hb f21404l;

    /* JADX INFO: renamed from: m */
    private long f21405m;

    /* JADX INFO: renamed from: n */
    private final xwq3[] f21406n;

    /* JADX INFO: renamed from: o */
    @dd
    private toq<T> f21407o;

    /* JADX INFO: renamed from: p */
    private final lvui.C3611k f21408p;

    /* JADX INFO: renamed from: q */
    private final int[] f21409q;

    /* JADX INFO: renamed from: r */
    private final List<AbstractC3583k> f21410r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC3622o.k<C3588s<T>> f21411s;

    /* JADX INFO: renamed from: t */
    private final ArrayList<AbstractC3583k> f21412t;

    /* JADX INFO: renamed from: u */
    boolean f21413u;

    /* JADX INFO: renamed from: x */
    @dd
    private AbstractC3583k f21414x;

    /* JADX INFO: renamed from: y */
    private final T f21415y;

    /* JADX INFO: renamed from: z */
    private final C3589y f21416z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.s$k */
    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public final class k implements InterfaceC3603j {

        /* JADX INFO: renamed from: g */
        private boolean f21417g;

        /* JADX INFO: renamed from: k */
        public final C3588s<T> f21418k;

        /* JADX INFO: renamed from: n */
        private final int f21419n;

        /* JADX INFO: renamed from: q */
        private final hb f21420q;

        public k(C3588s<T> c3588s, hb hbVar, int i2) {
            this.f21418k = c3588s;
            this.f21420q = hbVar;
            this.f21419n = i2;
        }

        /* JADX INFO: renamed from: k */
        private void m12671k() {
            if (this.f21417g) {
                return;
            }
            C3588s.this.f21408p.m12763s(C3588s.this.f21409q[this.f21419n], C3588s.this.f21406n[this.f21419n], 0, null, C3588s.this.f21395b);
            this.f21417g = true;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public int cdj(long j2) {
            if (C3588s.this.d3()) {
                return 0;
            }
            int iFti = this.f21420q.fti(j2, C3588s.this.f21413u);
            if (C3588s.this.f21414x != null) {
                iFti = Math.min(iFti, C3588s.this.f21414x.m12653s(this.f21419n + 1) - this.f21420q.jk());
            }
            this.f21420q.ek5k(iFti);
            if (iFti > 0) {
                m12671k();
            }
            return iFti;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public boolean isReady() {
            return !C3588s.this.d3() && this.f21420q.d2ok(C3588s.this.f21413u);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        /* JADX INFO: renamed from: s */
        public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
            if (C3588s.this.d3()) {
                return -3;
            }
            if (C3588s.this.f21414x != null && C3588s.this.f21414x.m12653s(this.f21419n + 1) <= this.f21420q.jk()) {
                return -3;
            }
            m12671k();
            return this.f21420q.hyr(c3865v, c3297s, i2, C3588s.this.f21413u);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC3603j
        public void toq() {
        }

        public void zy() {
            C3844k.m13633s(C3588s.this.f21399g[this.f21419n]);
            C3588s.this.f21399g[this.f21419n] = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.s$toq */
    /* JADX INFO: compiled from: ChunkSampleStream.java */
    public interface toq<T extends InterfaceC3586p> {
        /* JADX INFO: renamed from: k */
        void m12672k(C3588s<T> c3588s);
    }

    public C3588s(int i2, @dd int[] iArr, @dd xwq3[] xwq3VarArr, T t2, InterfaceC3622o.k<C3588s<T>> kVar, com.google.android.exoplayer2.upstream.toq toqVar, long j2, fn3e fn3eVar, InterfaceC3312i.k kVar2, d3 d3Var, lvui.C3611k c3611k) {
        this.f21403k = i2;
        int i3 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f21409q = iArr;
        this.f21406n = xwq3VarArr == null ? new xwq3[0] : xwq3VarArr;
        this.f21415y = t2;
        this.f21411s = kVar;
        this.f21408p = c3611k;
        this.f21400h = d3Var;
        this.f21401i = new oc(f65355bo);
        this.f21416z = new C3589y();
        ArrayList<AbstractC3583k> arrayList = new ArrayList<>();
        this.f21412t = arrayList;
        this.f21410r = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f21398f = new hb[length];
        this.f21399g = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        hb[] hbVarArr = new hb[i4];
        hb hbVarLd6 = hb.ld6(toqVar, (Looper) C3844k.f7l8(Looper.myLooper()), fn3eVar, kVar2);
        this.f21404l = hbVarLd6;
        iArr2[0] = i2;
        hbVarArr[0] = hbVarLd6;
        while (i3 < length) {
            hb hbVarX2 = hb.x2(toqVar);
            this.f21398f[i3] = hbVarX2;
            int i5 = i3 + 1;
            hbVarArr[i5] = hbVarX2;
            iArr2[i5] = this.f21409q[i3];
            i3 = i5;
        }
        this.f21396c = new zy(iArr2, hbVarArr);
        this.f21405m = j2;
        this.f21395b = j2;
    }

    private int dd(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.f21412t.size()) {
                return this.f21412t.size() - 1;
            }
        } while (this.f21412t.get(i3).m12653s(0) <= i2);
        return i3 - 1;
    }

    private void eqxt(int i2) {
        AbstractC3583k abstractC3583k = this.f21412t.get(i2);
        xwq3 xwq3Var = abstractC3583k.f21368q;
        if (!xwq3Var.equals(this.f21402j)) {
            this.f21408p.m12763s(this.f21403k, xwq3Var, abstractC3583k.f21367n, abstractC3583k.f21365g, abstractC3583k.f65337f7l8);
        }
        this.f21402j = xwq3Var;
    }

    private AbstractC3583k fti() {
        return this.f21412t.get(r0.size() - 1);
    }

    private boolean gvn7(AbstractC3581g abstractC3581g) {
        return abstractC3581g instanceof AbstractC3583k;
    }

    private AbstractC3583k jk(int i2) {
        AbstractC3583k abstractC3583k = this.f21412t.get(i2);
        ArrayList<AbstractC3583k> arrayList = this.f21412t;
        lrht.uj2j(arrayList, i2, arrayList.size());
        this.f21394a = Math.max(this.f21394a, this.f21412t.size());
        int i3 = 0;
        this.f21404l.zurt(abstractC3583k.m12653s(0));
        while (true) {
            hb[] hbVarArr = this.f21398f;
            if (i3 >= hbVarArr.length) {
                return abstractC3583k;
            }
            hb hbVar = hbVarArr[i3];
            i3++;
            hbVar.zurt(abstractC3583k.m12653s(i3));
        }
    }

    private boolean jp0y(int i2) {
        int iJk;
        AbstractC3583k abstractC3583k = this.f21412t.get(i2);
        if (this.f21404l.jk() > abstractC3583k.m12653s(0)) {
            return true;
        }
        int i3 = 0;
        do {
            hb[] hbVarArr = this.f21398f;
            if (i3 >= hbVarArr.length) {
                return false;
            }
            iJk = hbVarArr[i3].jk();
            i3++;
        } while (iJk <= abstractC3583k.m12653s(i3));
        return true;
    }

    /* JADX INFO: renamed from: l */
    private void m12664l() {
        this.f21404l.lrht();
        for (hb hbVar : this.f21398f) {
            hbVar.lrht();
        }
    }

    private void mcp(int i2) {
        C3844k.m13633s(!this.f21401i.ld6());
        int size = this.f21412t.size();
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (!jp0y(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j2 = fti().f21370y;
        AbstractC3583k abstractC3583kJk = jk(i2);
        if (this.f21412t.isEmpty()) {
            this.f21405m = this.f21395b;
        }
        this.f21413u = false;
        this.f21408p.jk(this.f21403k, abstractC3583kJk.f65337f7l8, j2);
    }

    private void oc() {
        int iDd = dd(this.f21404l.jk(), this.f21394a - 1);
        while (true) {
            int i2 = this.f21394a;
            if (i2 > iDd) {
                return;
            }
            this.f21394a = i2 + 1;
            eqxt(i2);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m12665t(int i2) {
        int iMin = Math.min(dd(i2, 0), this.f21394a);
        if (iMin > 0) {
            lrht.uj2j(this.f21412t, 0, iMin);
            this.f21394a -= iMin;
        }
    }

    public T a9() {
        return this.f21415y;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3603j
    public int cdj(long j2) {
        if (d3()) {
            return 0;
        }
        int iFti = this.f21404l.fti(j2, this.f21413u);
        AbstractC3583k abstractC3583k = this.f21414x;
        if (abstractC3583k != null) {
            iFti = Math.min(iFti, abstractC3583k.m12653s(0) - this.f21404l.jk());
        }
        this.f21404l.ek5k(iFti);
        oc();
        return iFti;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public void mo12670y(AbstractC3581g abstractC3581g, long j2, long j3, boolean z2) {
        this.f21397e = null;
        this.f21414x = null;
        ni7 ni7Var = new ni7(abstractC3581g.f21366k, abstractC3581g.f65338toq, abstractC3581g.m12649g(), abstractC3581g.m12650n(), j2, j3, abstractC3581g.toq());
        this.f21400h.m13458q(abstractC3581g.f21366k);
        this.f21408p.ki(ni7Var, abstractC3581g.f65339zy, this.f21403k, abstractC3581g.f21368q, abstractC3581g.f21367n, abstractC3581g.f21365g, abstractC3581g.f65337f7l8, abstractC3581g.f21370y);
        if (z2) {
            return;
        }
        if (d3()) {
            m12664l();
        } else if (gvn7(abstractC3581g)) {
            jk(this.f21412t.size() - 1);
            if (this.f21412t.isEmpty()) {
                this.f21405m = this.f21395b;
            }
        }
        this.f21411s.mo12411y(this);
    }

    boolean d3() {
        return this.f21405m != C3548p.f65257toq;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    public void f7l8(long j2) {
        if (this.f21401i.m13501p() || d3()) {
            return;
        }
        if (!this.f21401i.ld6()) {
            int iM12659g = this.f21415y.m12659g(j2, this.f21410r);
            if (iM12659g < this.f21412t.size()) {
                mcp(iM12659g);
                return;
            }
            return;
        }
        AbstractC3581g abstractC3581g = (AbstractC3581g) C3844k.f7l8(this.f21397e);
        if (!(gvn7(abstractC3581g) && jp0y(this.f21412t.size() - 1)) && this.f21415y.m12660k(j2, abstractC3581g, this.f21410r)) {
            this.f21401i.f7l8();
            if (gvn7(abstractC3581g)) {
                this.f21414x = (AbstractC3583k) abstractC3581g;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public long mo12595g() {
        if (this.f21413u) {
            return Long.MIN_VALUE;
        }
        if (d3()) {
            return this.f21405m;
        }
        long jMax = this.f21395b;
        AbstractC3583k abstractC3583kFti = fti();
        if (!abstractC3583kFti.mo12655y()) {
            if (this.f21412t.size() > 1) {
                abstractC3583kFti = this.f21412t.get(r2.size() - 2);
            } else {
                abstractC3583kFti = null;
            }
        }
        if (abstractC3583kFti != null) {
            jMax = Math.max(jMax, abstractC3583kFti.f21370y);
        }
        return Math.max(jMax, this.f21404l.wvg());
    }

    public C3588s<T>.k hyr(long j2, int i2) {
        for (int i3 = 0; i3 < this.f21398f.length; i3++) {
            if (this.f21409q[i3] == i2) {
                C3844k.m13633s(!this.f21399g[i3]);
                this.f21399g[i3] = true;
                this.f21398f[i3].nn86(j2, true);
                return new k(this, this.f21398f[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3603j
    public boolean isReady() {
        return !d3() && this.f21404l.d2ok(this.f21413u);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        return this.f21401i.ld6();
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3812g
    public void ki() {
        this.f21404l.m12728f();
        for (hb hbVar : this.f21398f) {
            hbVar.m12728f();
        }
        this.f21415y.release();
        toq<T> toqVar = this.f21407o;
        if (toqVar != null) {
            toqVar.m12672k(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public void ld6(AbstractC3581g abstractC3581g, long j2, long j3) {
        this.f21397e = null;
        this.f21415y.zy(abstractC3581g);
        ni7 ni7Var = new ni7(abstractC3581g.f21366k, abstractC3581g.f65338toq, abstractC3581g.m12649g(), abstractC3581g.m12650n(), j2, j3, abstractC3581g.toq());
        this.f21400h.m13458q(abstractC3581g.f21366k);
        this.f21408p.fn3e(ni7Var, abstractC3581g.f65339zy, this.f21403k, abstractC3581g.f21368q, abstractC3581g.f21367n, abstractC3581g.f21365g, abstractC3581g.f65337f7l8, abstractC3581g.f21370y);
        this.f21411s.mo12411y(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        List<AbstractC3583k> listEmptyList;
        long j3;
        if (this.f21413u || this.f21401i.ld6() || this.f21401i.m13501p()) {
            return false;
        }
        boolean zD3 = d3();
        if (zD3) {
            listEmptyList = Collections.emptyList();
            j3 = this.f21405m;
        } else {
            listEmptyList = this.f21410r;
            j3 = fti().f21370y;
        }
        this.f21415y.f7l8(j2, j3, listEmptyList, this.f21416z);
        C3589y c3589y = this.f21416z;
        boolean z2 = c3589y.f65360toq;
        AbstractC3581g abstractC3581g = c3589y.f21424k;
        c3589y.m12677k();
        if (z2) {
            this.f21405m = C3548p.f65257toq;
            this.f21413u = true;
            return true;
        }
        if (abstractC3581g == null) {
            return false;
        }
        this.f21397e = abstractC3581g;
        if (gvn7(abstractC3581g)) {
            AbstractC3583k abstractC3583k = (AbstractC3583k) abstractC3581g;
            if (zD3) {
                long j4 = abstractC3583k.f65337f7l8;
                long j5 = this.f21405m;
                if (j4 != j5) {
                    this.f21404l.m12730j(j5);
                    for (hb hbVar : this.f21398f) {
                        hbVar.m12730j(this.f21405m);
                    }
                }
                this.f21405m = C3548p.f65257toq;
            }
            abstractC3583k.ld6(this.f21396c);
            this.f21412t.add(abstractC3583k);
        } else if (abstractC3581g instanceof qrj) {
            ((qrj) abstractC3581g).f7l8(this.f21396c);
        }
        this.f21408p.wvg(new ni7(abstractC3581g.f21366k, abstractC3581g.f65338toq, this.f21401i.n7h(abstractC3581g, this, this.f21400h.toq(abstractC3581g.f65339zy))), abstractC3581g.f65339zy, this.f21403k, abstractC3581g.f21368q, abstractC3581g.f21367n, abstractC3581g.f21365g, abstractC3581g.f65337f7l8, abstractC3581g.f21370y);
        return true;
    }

    public void n5r1(long j2) {
        boolean zNn86;
        this.f21395b = j2;
        if (d3()) {
            this.f21405m = j2;
            return;
        }
        AbstractC3583k abstractC3583k = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f21412t.size()) {
                break;
            }
            AbstractC3583k abstractC3583k2 = this.f21412t.get(i3);
            long j3 = abstractC3583k2.f65337f7l8;
            if (j3 == j2 && abstractC3583k2.f65340ld6 == C3548p.f65257toq) {
                abstractC3583k = abstractC3583k2;
                break;
            } else if (j3 > j2) {
                break;
            } else {
                i3++;
            }
        }
        if (abstractC3583k != null) {
            zNn86 = this.f21404l.m12727e(abstractC3583k.m12653s(0));
        } else {
            zNn86 = this.f21404l.nn86(j2, j2 < zy());
        }
        if (zNn86) {
            this.f21394a = dd(this.f21404l.jk(), 0);
            hb[] hbVarArr = this.f21398f;
            int length = hbVarArr.length;
            while (i2 < length) {
                hbVarArr[i2].nn86(j2, true);
                i2++;
            }
            return;
        }
        this.f21405m = j2;
        this.f21413u = false;
        this.f21412t.clear();
        this.f21394a = 0;
        if (!this.f21401i.ld6()) {
            this.f21401i.m13502y();
            m12664l();
            return;
        }
        this.f21404l.ki();
        hb[] hbVarArr2 = this.f21398f;
        int length2 = hbVarArr2.length;
        while (i2 < length2) {
            hbVarArr2[i2].ki();
            i2++;
        }
        this.f21401i.f7l8();
    }

    public void ncyb(@dd toq<T> toqVar) {
        this.f21407o = toqVar;
        this.f21404l.n5r1();
        for (hb hbVar : this.f21398f) {
            hbVar.n5r1();
        }
        this.f21401i.qrj(this);
    }

    /* JADX INFO: renamed from: q */
    public long m12668q(long j2, mbx mbxVar) {
        return this.f21415y.m12662q(j2, mbxVar);
    }

    @Override // com.google.android.exoplayer2.upstream.oc.toq
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public oc.zy mo12667h(AbstractC3581g abstractC3581g, long j2, long j3, IOException iOException, int i2) {
        oc.zy zyVarM13500s;
        long qVar = abstractC3581g.toq();
        boolean zGvn7 = gvn7(abstractC3581g);
        int size = this.f21412t.size() - 1;
        boolean z2 = (qVar != 0 && zGvn7 && jp0y(size)) ? false : true;
        ni7 ni7Var = new ni7(abstractC3581g.f21366k, abstractC3581g.f65338toq, abstractC3581g.m12649g(), abstractC3581g.m12650n(), j2, j3, qVar);
        d3.C3791q c3791q = new d3.C3791q(ni7Var, new wvg(abstractC3581g.f65339zy, this.f21403k, abstractC3581g.f21368q, abstractC3581g.f21367n, abstractC3581g.f21365g, lrht.zwy(abstractC3581g.f65337f7l8), lrht.zwy(abstractC3581g.f21370y)), iOException, i2);
        if (!this.f21415y.m12661n(abstractC3581g, z2, c3791q, this.f21400h)) {
            zyVarM13500s = null;
        } else if (z2) {
            zyVarM13500s = oc.f66891ld6;
            if (zGvn7) {
                C3844k.m13633s(jk(size) == abstractC3581g);
                if (this.f21412t.isEmpty()) {
                    this.f21405m = this.f21395b;
                }
            }
        } else {
            com.google.android.exoplayer2.util.ni7.qrj(f65355bo, "Ignoring attempt to cancel non-cancelable load.");
            zyVarM13500s = null;
        }
        if (zyVarM13500s == null) {
            long jMo13457k = this.f21400h.mo13457k(c3791q);
            zyVarM13500s = jMo13457k != C3548p.f65257toq ? oc.m13500s(false, jMo13457k) : oc.f66892x2;
        }
        boolean z3 = !zyVarM13500s.zy();
        this.f21408p.ni7(ni7Var, abstractC3581g.f65339zy, this.f21403k, abstractC3581g.f21368q, abstractC3581g.f21367n, abstractC3581g.f21365g, abstractC3581g.f65337f7l8, abstractC3581g.f21370y, iOException, z3);
        if (z3) {
            this.f21397e = null;
            this.f21400h.m13458q(abstractC3581g.f21366k);
            this.f21411s.mo12411y(this);
        }
        return zyVarM13500s;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3603j
    /* JADX INFO: renamed from: s */
    public int mo12610s(C3865v c3865v, C3297s c3297s, int i2) {
        if (d3()) {
            return -3;
        }
        AbstractC3583k abstractC3583k = this.f21414x;
        if (abstractC3583k != null && abstractC3583k.m12653s(0) <= this.f21404l.jk()) {
            return -3;
        }
        oc();
        return this.f21404l.hyr(c3865v, c3297s, i2, this.f21413u);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3603j
    public void toq() throws IOException {
        this.f21401i.toq();
        this.f21404l.dd();
        if (this.f21401i.ld6()) {
            return;
        }
        this.f21415y.toq();
    }

    public void x9kr() {
        ncyb(null);
    }

    public void zurt(long j2, boolean z2) {
        if (d3()) {
            return;
        }
        int iM12734z = this.f21404l.m12734z();
        this.f21404l.cdj(j2, z2, true);
        int iM12734z2 = this.f21404l.m12734z();
        if (iM12734z2 > iM12734z) {
            long jO1t = this.f21404l.o1t();
            int i2 = 0;
            while (true) {
                hb[] hbVarArr = this.f21398f;
                if (i2 >= hbVarArr.length) {
                    break;
                }
                hbVarArr[i2].cdj(jO1t, z2, this.f21399g[i2]);
                i2++;
            }
        }
        m12665t(iM12734z2);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    public long zy() {
        if (d3()) {
            return this.f21405m;
        }
        if (this.f21413u) {
            return Long.MIN_VALUE;
        }
        return fti().f21370y;
    }
}

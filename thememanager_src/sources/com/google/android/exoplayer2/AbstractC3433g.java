package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.source.InterfaceC3603j;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3863z;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.g */
/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3433g implements bek6, cv06 {

    /* JADX INFO: renamed from: g */
    private int f20468g;

    /* JADX INFO: renamed from: h */
    private long f20469h;

    /* JADX INFO: renamed from: i */
    private long f20470i;

    /* JADX INFO: renamed from: k */
    private final int f20471k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private h7am f20472n;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private xwq3[] f20473p;

    /* JADX INFO: renamed from: r */
    private boolean f20475r;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private InterfaceC3603j f20476s;

    /* JADX INFO: renamed from: t */
    private boolean f20477t;

    /* JADX INFO: renamed from: y */
    private int f20478y;

    /* JADX INFO: renamed from: q */
    private final C3865v f20474q = new C3865v();

    /* JADX INFO: renamed from: z */
    private long f20479z = Long.MIN_VALUE;

    public AbstractC3433g(int i2) {
        this.f20471k = i2;
    }

    protected final C3865v a9() {
        this.f20474q.m13776k();
        return this.f20474q;
    }

    protected void d2ok(long j2, boolean z2) throws ki {
    }

    protected final boolean d3() {
        return mo11548g() ? this.f20477t : ((InterfaceC3603j) C3844k.f7l8(this.f20476s)).isReady();
    }

    protected void dd() {
    }

    protected void eqxt(boolean z2, boolean z3) throws ki {
    }

    @Override // com.google.android.exoplayer2.cv06
    public int fn3e() throws ki {
        return 0;
    }

    protected final int fti() {
        return this.f20468g;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final long fu4() {
        return this.f20479z;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: g */
    public final boolean mo11548g() {
        return this.f20479z == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final int getState() {
        return this.f20478y;
    }

    protected final xwq3[] gvn7() {
        return (xwq3[]) C3844k.f7l8(this.f20473p);
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: h */
    public final cv06 mo11549h() {
        return this;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: i */
    public final void mo11550i(h7am h7amVar, xwq3[] xwq3VarArr, InterfaceC3603j interfaceC3603j, long j2, boolean z2, boolean z3, long j3, long j4) throws ki {
        C3844k.m13633s(this.f20478y == 0);
        this.f20472n = h7amVar;
        this.f20478y = 1;
        this.f20470i = j2;
        eqxt(z2, z3);
        kja0(xwq3VarArr, interfaceC3603j, j3, j4);
        d2ok(j2, z2);
    }

    protected final h7am jk() {
        return (h7am) C3844k.f7l8(this.f20472n);
    }

    protected final long jp0y() {
        return this.f20470i;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void kja0(xwq3[] xwq3VarArr, InterfaceC3603j interfaceC3603j, long j2, long j3) throws ki {
        C3844k.m13633s(!this.f20477t);
        this.f20476s = interfaceC3603j;
        if (this.f20479z == Long.MIN_VALUE) {
            this.f20479z = j2;
        }
        this.f20473p = xwq3VarArr;
        this.f20469h = j3;
        x9kr(xwq3VarArr, j2, j3);
    }

    /* JADX INFO: renamed from: l */
    protected int m12066l(long j2) {
        return ((InterfaceC3603j) C3844k.f7l8(this.f20476s)).cdj(j2 - this.f20469h);
    }

    protected void lvui() {
    }

    protected final ki mcp(Throwable th, @zy.dd xwq3 xwq3Var, boolean z2, int i2) {
        int iWvg;
        if (xwq3Var == null || this.f20475r) {
            iWvg = 4;
        } else {
            this.f20475r = true;
            try {
                iWvg = cv06.wvg(mo11518k(xwq3Var));
            } catch (ki unused) {
                iWvg = 4;
            } finally {
                this.f20475r = false;
            }
        }
        return ki.createForRenderer(th, getName(), fti(), xwq3Var, iWvg, z2, i2);
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: n */
    public final int mo11551n() {
        return this.f20471k;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final boolean n7h() {
        return this.f20477t;
    }

    protected final int ncyb(C3865v c3865v, C3297s c3297s, int i2) {
        int iMo12610s = ((InterfaceC3603j) C3844k.f7l8(this.f20476s)).mo12610s(c3865v, c3297s, i2);
        if (iMo12610s == -4) {
            if (c3297s.n7h()) {
                this.f20479z = Long.MIN_VALUE;
                return this.f20477t ? -4 : -3;
            }
            long j2 = c3297s.f19618s + this.f20469h;
            c3297s.f19618s = j2;
            this.f20479z = Math.max(this.f20479z, j2);
        } else if (iMo12610s == -5) {
            xwq3 xwq3Var = (xwq3) C3844k.f7l8(c3865v.f67166toq);
            if (xwq3Var.f23669e != Long.MAX_VALUE) {
                c3865v.f67166toq = xwq3Var.toq().m13939b(xwq3Var.f23669e + this.f20469h).a9();
            }
        }
        return iMo12610s;
    }

    @Override // com.google.android.exoplayer2.bek6
    @zy.dd
    public final InterfaceC3603j ni7() {
        return this.f20476s;
    }

    @Override // com.google.android.exoplayer2.bek6
    @zy.dd
    public InterfaceC3863z o1t() {
        return null;
    }

    protected void oc() {
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: q */
    public final void mo11552q() {
        C3844k.m13633s(this.f20478y == 1);
        this.f20474q.m13776k();
        this.f20478y = 0;
        this.f20476s = null;
        this.f20473p = null;
        this.f20477t = false;
        oc();
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void qrj() throws IOException {
        ((InterfaceC3603j) C3844k.f7l8(this.f20476s)).toq();
    }

    /* JADX INFO: renamed from: r */
    protected void mo11400r() throws ki {
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void reset() {
        C3844k.m13633s(this.f20478y == 0);
        this.f20474q.m13776k();
        lvui();
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void setIndex(int i2) {
        this.f20468g = i2;
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void start() throws ki {
        C3844k.m13633s(this.f20478y == 1);
        this.f20478y = 2;
        mo11400r();
    }

    @Override // com.google.android.exoplayer2.bek6
    public final void stop() {
        C3844k.m13633s(this.f20478y == 2);
        this.f20478y = 1;
        dd();
    }

    /* JADX INFO: renamed from: t */
    protected final ki m12067t(Throwable th, @zy.dd xwq3 xwq3Var, int i2) {
        return mcp(th, xwq3Var, false, i2);
    }

    @Override // com.google.android.exoplayer2.uj2j.toq
    public void x2(int i2, @zy.dd Object obj) throws ki {
    }

    protected void x9kr(xwq3[] xwq3VarArr, long j2, long j3) throws ki {
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: y */
    public final void mo11553y() {
        this.f20477t = true;
    }

    @Override // com.google.android.exoplayer2.bek6
    /* JADX INFO: renamed from: z */
    public final void mo11554z(long j2) throws ki {
        this.f20477t = false;
        this.f20470i = j2;
        this.f20479z = j2;
        d2ok(j2, false);
    }
}

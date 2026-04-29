package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.k */
/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3449k extends pc {

    /* JADX INFO: renamed from: h */
    private final boolean f20581h;

    /* JADX INFO: renamed from: p */
    private final InterfaceC3612m f20582p;

    /* JADX INFO: renamed from: s */
    private final int f20583s;

    public AbstractC3449k(boolean z2, InterfaceC3612m interfaceC3612m) {
        this.f20581h = z2;
        this.f20582p = interfaceC3612m;
        this.f20583s = interfaceC3612m.getLength();
    }

    public static Object a9(Object obj) {
        return ((Pair) obj).first;
    }

    private int eqxt(int i2, boolean z2) {
        if (z2) {
            return this.f20582p.toq(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }

    public static Object jk(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object jp0y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int oc(int i2, boolean z2) {
        if (z2) {
            return this.f20582p.zy(i2);
        }
        if (i2 < this.f20583s - 1) {
            return i2 + 1;
        }
        return -1;
    }

    protected abstract pc d2ok(int i2);

    protected abstract int d3(int i2);

    @Override // com.google.android.exoplayer2.pc
    public int f7l8(boolean z2) {
        int i2 = this.f20583s;
        if (i2 == 0) {
            return -1;
        }
        if (this.f20581h) {
            z2 = false;
        }
        int iMo12769q = z2 ? this.f20582p.mo12769q() : i2 - 1;
        while (d2ok(iMo12769q).ni7()) {
            iMo12769q = eqxt(iMo12769q, z2);
            if (iMo12769q == -1) {
                return -1;
            }
        }
        return d3(iMo12769q) + d2ok(iMo12769q).f7l8(z2);
    }

    @Override // com.google.android.exoplayer2.pc
    public final pc.C3550q fn3e(int i2, pc.C3550q c3550q, long j2) {
        int iMcp = mcp(i2);
        int iD3 = d3(iMcp);
        int iGvn7 = gvn7(iMcp);
        d2ok(iMcp).fn3e(i2 - iD3, c3550q, j2);
        Object objFti = fti(iMcp);
        if (!pc.C3550q.f21121o.equals(c3550q.f21133k)) {
            objFti = jp0y(objFti, c3550q.f21133k);
        }
        c3550q.f21133k = objFti;
        c3550q.f21126c += iGvn7;
        c3550q.f21127e += iGvn7;
        return c3550q;
    }

    protected abstract Object fti(int i2);

    @Override // com.google.android.exoplayer2.pc
    /* JADX INFO: renamed from: g */
    public final int mo12147g(Object obj) {
        int iMo12147g;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objA9 = a9(obj);
        Object objJk = jk(obj);
        int iWvg = wvg(objA9);
        if (iWvg == -1 || (iMo12147g = d2ok(iWvg).mo12147g(objJk)) == -1) {
            return -1;
        }
        return gvn7(iWvg) + iMo12147g;
    }

    protected abstract int gvn7(int i2);

    @Override // com.google.android.exoplayer2.pc
    public int ki(int i2, int i3, boolean z2) {
        if (this.f20581h) {
            if (i3 == 1) {
                i3 = 2;
            }
            z2 = false;
        }
        int iMcp = mcp(i2);
        int iD3 = d3(iMcp);
        int iKi = d2ok(iMcp).ki(i2 - iD3, i3 != 2 ? i3 : 0, z2);
        if (iKi != -1) {
            return iD3 + iKi;
        }
        int iEqxt = eqxt(iMcp, z2);
        while (iEqxt != -1 && d2ok(iEqxt).ni7()) {
            iEqxt = eqxt(iEqxt, z2);
        }
        if (iEqxt != -1) {
            return d3(iEqxt) + d2ok(iEqxt).f7l8(z2);
        }
        if (i3 == 2) {
            return f7l8(z2);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.pc
    public final pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
        int iMo12146t = mo12146t(i2);
        int iD3 = d3(iMo12146t);
        d2ok(iMo12146t).ld6(i2 - gvn7(iMo12146t), toqVar, z2);
        toqVar.f21151n += iD3;
        if (z2) {
            toqVar.f21153q = jp0y(fti(iMo12146t), C3844k.f7l8(toqVar.f21153q));
        }
        return toqVar;
    }

    protected abstract int mcp(int i2);

    @Override // com.google.android.exoplayer2.pc
    /* JADX INFO: renamed from: n */
    public int mo12148n(boolean z2) {
        if (this.f20583s == 0) {
            return -1;
        }
        if (this.f20581h) {
            z2 = false;
        }
        int iMo12766g = z2 ? this.f20582p.mo12766g() : 0;
        while (d2ok(iMo12766g).ni7()) {
            iMo12766g = oc(iMo12766g, z2);
            if (iMo12766g == -1) {
                return -1;
            }
        }
        return d3(iMo12766g) + d2ok(iMo12766g).mo12148n(z2);
    }

    @Override // com.google.android.exoplayer2.pc
    /* JADX INFO: renamed from: s */
    public int mo12149s(int i2, int i3, boolean z2) {
        if (this.f20581h) {
            if (i3 == 1) {
                i3 = 2;
            }
            z2 = false;
        }
        int iMcp = mcp(i2);
        int iD3 = d3(iMcp);
        int iMo12149s = d2ok(iMcp).mo12149s(i2 - iD3, i3 != 2 ? i3 : 0, z2);
        if (iMo12149s != -1) {
            return iD3 + iMo12149s;
        }
        int iOc = oc(iMcp, z2);
        while (iOc != -1 && d2ok(iOc).ni7()) {
            iOc = oc(iOc, z2);
        }
        if (iOc != -1) {
            return d3(iOc) + d2ok(iOc).mo12148n(z2);
        }
        if (i3 == 2) {
            return mo12148n(z2);
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    protected abstract int mo12146t(int i2);

    @Override // com.google.android.exoplayer2.pc
    public final Object t8r(int i2) {
        int iMo12146t = mo12146t(i2);
        return jp0y(fti(iMo12146t), d2ok(iMo12146t).t8r(i2 - gvn7(iMo12146t)));
    }

    protected abstract int wvg(Object obj);

    @Override // com.google.android.exoplayer2.pc
    public final pc.toq x2(Object obj, pc.toq toqVar) {
        Object objA9 = a9(obj);
        Object objJk = jk(obj);
        int iWvg = wvg(objA9);
        int iD3 = d3(iWvg);
        d2ok(iWvg).x2(objJk, toqVar);
        toqVar.f21151n += iD3;
        toqVar.f21153q = obj;
        return toqVar;
    }
}

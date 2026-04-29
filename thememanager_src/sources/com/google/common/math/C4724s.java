package com.google.common.math;

import com.google.common.base.jk;
import com.google.common.primitives.C4744q;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.math.s */
/* JADX INFO: compiled from: PairedStatsAccumulator.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4724s {

    /* JADX INFO: renamed from: k */
    private final x2 f27181k = new x2();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final x2 f68368toq = new x2();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f68369zy = 0.0d;

    /* JADX INFO: renamed from: n */
    private double m16551n(double d2) {
        if (d2 > 0.0d) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    /* JADX INFO: renamed from: q */
    private static double m16552q(double d2) {
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        if (d2 <= -1.0d) {
            return -1.0d;
        }
        return d2;
    }

    public final double f7l8() {
        jk.yz(zy() > 1);
        if (Double.isNaN(this.f68369zy)) {
            return Double.NaN;
        }
        double dT8r = this.f27181k.t8r();
        double dT8r2 = this.f68368toq.t8r();
        jk.yz(dT8r > 0.0d);
        jk.yz(dT8r2 > 0.0d);
        return m16552q(this.f68369zy / Math.sqrt(m16551n(dT8r * dT8r2)));
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC4721n m16553g() {
        jk.yz(zy() > 1);
        if (Double.isNaN(this.f68369zy)) {
            return AbstractC4721n.m16517k();
        }
        double dT8r = this.f27181k.t8r();
        if (dT8r > 0.0d) {
            return this.f68368toq.t8r() > 0.0d ? AbstractC4721n.m16516g(this.f27181k.ld6(), this.f68368toq.ld6()).toq(this.f68369zy / dT8r) : AbstractC4721n.toq(this.f68368toq.ld6());
        }
        jk.yz(this.f68368toq.t8r() > 0.0d);
        return AbstractC4721n.m16518s(this.f27181k.ld6());
    }

    /* JADX INFO: renamed from: k */
    public void m16554k(double d2, double d4) {
        this.f27181k.m16569k(d2);
        if (!C4744q.n7h(d2) || !C4744q.n7h(d4)) {
            this.f68369zy = Double.NaN;
        } else if (this.f27181k.m16573s() > 1) {
            this.f68369zy += (d2 - this.f27181k.ld6()) * (d4 - this.f68368toq.ld6());
        }
        this.f68368toq.m16569k(d4);
    }

    public ld6 ld6() {
        return this.f27181k.cdj();
    }

    /* JADX INFO: renamed from: p */
    public C4726y m16555p() {
        return new C4726y(this.f27181k.cdj(), this.f68368toq.cdj(), this.f68369zy);
    }

    /* JADX INFO: renamed from: s */
    public final double m16556s() {
        jk.yz(zy() > 1);
        return this.f68369zy / (zy() - 1);
    }

    public void toq(C4726y c4726y) {
        if (c4726y.count() == 0) {
            return;
        }
        this.f27181k.toq(c4726y.xStats());
        if (this.f68368toq.m16573s() == 0) {
            this.f68369zy = c4726y.sumOfProductsOfDeltas();
        } else {
            this.f68369zy += c4726y.sumOfProductsOfDeltas() + ((c4726y.xStats().mean() - this.f27181k.ld6()) * (c4726y.yStats().mean() - this.f68368toq.ld6()) * c4726y.count());
        }
        this.f68368toq.toq(c4726y.yStats());
    }

    public ld6 x2() {
        return this.f68368toq.cdj();
    }

    /* JADX INFO: renamed from: y */
    public double m16557y() {
        jk.yz(zy() != 0);
        return this.f68369zy / zy();
    }

    public long zy() {
        return this.f27181k.m16573s();
    }
}

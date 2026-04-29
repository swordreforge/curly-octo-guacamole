package com.google.common.math;

import com.google.common.base.jk;
import com.google.common.primitives.C4744q;
import java.util.Iterator;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: StatsAccumulator.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class x2 {

    /* JADX INFO: renamed from: k */
    private long f27187k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private double f68373toq = 0.0d;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f68374zy = 0.0d;

    /* JADX INFO: renamed from: q */
    private double f27189q = Double.NaN;

    /* JADX INFO: renamed from: n */
    private double f27188n = Double.NaN;

    /* JADX INFO: renamed from: y */
    static double m16566y(double d2, double d4) {
        if (C4744q.n7h(d2)) {
            return d4;
        }
        if (C4744q.n7h(d4) || d2 == d4) {
            return d2;
        }
        return Double.NaN;
    }

    public ld6 cdj() {
        return new ld6(this.f27187k, this.f68373toq, this.f68374zy, this.f27189q, this.f27188n);
    }

    public void f7l8(long... jArr) {
        for (long j2 : jArr) {
            m16569k(j2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m16567g(int... iArr) {
        for (int i2 : iArr) {
            m16569k(i2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final double m16568h() {
        jk.yz(this.f27187k > 1);
        if (Double.isNaN(this.f68374zy)) {
            return Double.NaN;
        }
        return zy.toq(this.f68374zy) / (this.f27187k - 1);
    }

    /* JADX INFO: renamed from: k */
    public void m16569k(double d2) {
        long j2 = this.f27187k;
        if (j2 == 0) {
            this.f27187k = 1L;
            this.f68373toq = d2;
            this.f27189q = d2;
            this.f27188n = d2;
            if (C4744q.n7h(d2)) {
                return;
            }
            this.f68374zy = Double.NaN;
            return;
        }
        this.f27187k = j2 + 1;
        if (C4744q.n7h(d2) && C4744q.n7h(this.f68373toq)) {
            double d4 = this.f68373toq;
            double d5 = d2 - d4;
            double d6 = d4 + (d5 / this.f27187k);
            this.f68373toq = d6;
            this.f68374zy += d5 * (d2 - d6);
        } else {
            this.f68373toq = m16566y(this.f68373toq, d2);
            this.f68374zy = Double.NaN;
        }
        this.f27189q = Math.min(this.f27189q, d2);
        this.f27188n = Math.max(this.f27188n, d2);
    }

    public final double ki() {
        return this.f68373toq * this.f27187k;
    }

    public final double kja0() {
        return Math.sqrt(m16568h());
    }

    public double ld6() {
        jk.yz(this.f27187k != 0);
        return this.f68373toq;
    }

    /* JADX INFO: renamed from: n */
    public void m16570n(double... dArr) {
        for (double d2 : dArr) {
            m16569k(d2);
        }
    }

    public final double n7h() {
        jk.yz(this.f27187k != 0);
        if (Double.isNaN(this.f68374zy)) {
            return Double.NaN;
        }
        if (this.f27187k == 1) {
            return 0.0d;
        }
        return zy.toq(this.f68374zy) / this.f27187k;
    }

    /* JADX INFO: renamed from: p */
    public double m16571p() {
        jk.yz(this.f27187k != 0);
        return this.f27188n;
    }

    /* JADX INFO: renamed from: q */
    public void m16572q(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            m16569k(it.next().doubleValue());
        }
    }

    public final double qrj() {
        return Math.sqrt(n7h());
    }

    /* JADX INFO: renamed from: s */
    public long m16573s() {
        return this.f27187k;
    }

    double t8r() {
        return this.f68374zy;
    }

    public void toq(ld6 ld6Var) {
        if (ld6Var.count() == 0) {
            return;
        }
        long j2 = this.f27187k;
        if (j2 == 0) {
            this.f27187k = ld6Var.count();
            this.f68373toq = ld6Var.mean();
            this.f68374zy = ld6Var.sumOfSquaresOfDeltas();
            this.f27189q = ld6Var.min();
            this.f27188n = ld6Var.max();
            return;
        }
        this.f27187k = j2 + ld6Var.count();
        if (C4744q.n7h(this.f68373toq) && C4744q.n7h(ld6Var.mean())) {
            double dMean = ld6Var.mean();
            double d2 = this.f68373toq;
            double d4 = dMean - d2;
            this.f68373toq = d2 + ((ld6Var.count() * d4) / this.f27187k);
            this.f68374zy += ld6Var.sumOfSquaresOfDeltas() + (d4 * (ld6Var.mean() - this.f68373toq) * ld6Var.count());
        } else {
            this.f68373toq = m16566y(this.f68373toq, ld6Var.mean());
            this.f68374zy = Double.NaN;
        }
        this.f27189q = Math.min(this.f27189q, ld6Var.min());
        this.f27188n = Math.max(this.f27188n, ld6Var.max());
    }

    public double x2() {
        jk.yz(this.f27187k != 0);
        return this.f27189q;
    }

    public void zy(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            m16569k(it.next().doubleValue());
        }
    }
}

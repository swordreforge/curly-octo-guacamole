package com.google.common.math;

import com.google.common.base.jk;
import com.google.errorprone.annotations.concurrent.LazyInit;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.math.n */
/* JADX INFO: compiled from: LinearTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public abstract class AbstractC4721n {

    /* JADX INFO: renamed from: com.google.common.math.n$toq */
    /* JADX INFO: compiled from: LinearTransformation.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final double f27170k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final double f68362toq;

        /* JADX INFO: renamed from: k */
        public AbstractC4721n m16524k(double d2, double d4) {
            jk.m15383q(com.google.common.math.zy.m16578q(d2) && com.google.common.math.zy.m16578q(d4));
            double d5 = this.f27170k;
            if (d2 != d5) {
                return toq((d4 - this.f68362toq) / (d2 - d5));
            }
            jk.m15383q(d4 != this.f68362toq);
            return new n(this.f27170k);
        }

        public AbstractC4721n toq(double d2) {
            jk.m15383q(!Double.isNaN(d2));
            return com.google.common.math.zy.m16578q(d2) ? new q(d2, this.f68362toq - (this.f27170k * d2)) : new n(this.f27170k);
        }

        private toq(double d2, double d4) {
            this.f27170k = d2;
            this.f68362toq = d4;
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.n$zy */
    /* JADX INFO: compiled from: LinearTransformation.java */
    private static final class zy extends AbstractC4721n {

        /* JADX INFO: renamed from: k */
        static final zy f27171k = new zy();

        private zy() {
        }

        @Override // com.google.common.math.AbstractC4721n
        public double f7l8() {
            return Double.NaN;
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: n */
        public boolean mo16519n() {
            return false;
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: q */
        public boolean mo16520q() {
            return false;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: y */
        public double mo16521y(double d2) {
            return Double.NaN;
        }

        @Override // com.google.common.math.AbstractC4721n
        public AbstractC4721n zy() {
            return this;
        }
    }

    /* JADX INFO: renamed from: g */
    public static toq m16516g(double d2, double d4) {
        jk.m15383q(com.google.common.math.zy.m16578q(d2) && com.google.common.math.zy.m16578q(d4));
        return new toq(d2, d4);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC4721n m16517k() {
        return zy.f27171k;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC4721n m16518s(double d2) {
        jk.m15383q(com.google.common.math.zy.m16578q(d2));
        return new n(d2);
    }

    public static AbstractC4721n toq(double d2) {
        jk.m15383q(com.google.common.math.zy.m16578q(d2));
        return new q(0.0d, d2);
    }

    public abstract double f7l8();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo16519n();

    /* JADX INFO: renamed from: q */
    public abstract boolean mo16520q();

    /* JADX INFO: renamed from: y */
    public abstract double mo16521y(double d2);

    public abstract AbstractC4721n zy();

    /* JADX INFO: renamed from: com.google.common.math.n$n */
    /* JADX INFO: compiled from: LinearTransformation.java */
    private static final class n extends AbstractC4721n {

        /* JADX INFO: renamed from: k */
        final double f27168k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @LazyInit
        AbstractC4721n f68359toq;

        n(double d2) {
            this.f27168k = d2;
            this.f68359toq = null;
        }

        /* JADX INFO: renamed from: p */
        private AbstractC4721n m16522p() {
            return new q(0.0d, this.f27168k, this);
        }

        @Override // com.google.common.math.AbstractC4721n
        public double f7l8() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: n */
        public boolean mo16519n() {
            return true;
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: q */
        public boolean mo16520q() {
            return false;
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f27168k));
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: y */
        public double mo16521y(double d2) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.AbstractC4721n
        public AbstractC4721n zy() {
            AbstractC4721n abstractC4721n = this.f68359toq;
            if (abstractC4721n != null) {
                return abstractC4721n;
            }
            AbstractC4721n abstractC4721nM16522p = m16522p();
            this.f68359toq = abstractC4721nM16522p;
            return abstractC4721nM16522p;
        }

        n(double d2, AbstractC4721n abstractC4721n) {
            this.f27168k = d2;
            this.f68359toq = abstractC4721n;
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.n$q */
    /* JADX INFO: compiled from: LinearTransformation.java */
    private static final class q extends AbstractC4721n {

        /* JADX INFO: renamed from: k */
        final double f27169k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final double f68360toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @LazyInit
        AbstractC4721n f68361zy;

        q(double d2, double d4) {
            this.f27169k = d2;
            this.f68360toq = d4;
            this.f68361zy = null;
        }

        /* JADX INFO: renamed from: p */
        private AbstractC4721n m16523p() {
            double d2 = this.f27169k;
            return d2 != 0.0d ? new q(1.0d / d2, (this.f68360toq * (-1.0d)) / d2, this) : new n(this.f68360toq, this);
        }

        @Override // com.google.common.math.AbstractC4721n
        public double f7l8() {
            return this.f27169k;
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: n */
        public boolean mo16519n() {
            return false;
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: q */
        public boolean mo16520q() {
            return this.f27169k == 0.0d;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f27169k), Double.valueOf(this.f68360toq));
        }

        @Override // com.google.common.math.AbstractC4721n
        /* JADX INFO: renamed from: y */
        public double mo16521y(double d2) {
            return (d2 * this.f27169k) + this.f68360toq;
        }

        @Override // com.google.common.math.AbstractC4721n
        public AbstractC4721n zy() {
            AbstractC4721n abstractC4721n = this.f68361zy;
            if (abstractC4721n != null) {
                return abstractC4721n;
            }
            AbstractC4721n abstractC4721nM16523p = m16523p();
            this.f68361zy = abstractC4721nM16523p;
            return abstractC4721nM16523p;
        }

        q(double d2, double d4, AbstractC4721n abstractC4721n) {
            this.f27169k = d2;
            this.f68360toq = d4;
            this.f68361zy = abstractC4721n;
        }
    }
}

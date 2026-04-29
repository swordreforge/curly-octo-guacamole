package com.miui.clock.hct;

/* JADX INFO: compiled from: Hct.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private double f29125k;

    /* JADX INFO: renamed from: q */
    private int f29126q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private double f71869toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private double f71870zy;

    private zy(int i2) {
        m17689s(i2);
    }

    /* JADX INFO: renamed from: k */
    public static zy m17688k(double d2, double d4, double d5) {
        return new zy(C5055q.ki(d2, d4, d5));
    }

    /* JADX INFO: renamed from: s */
    private void m17689s(int i2) {
        this.f29126q = i2;
        C5053k qVar = C5053k.toq(i2);
        this.f29125k = qVar.x2();
        this.f71869toq = qVar.ld6();
        this.f71870zy = toq.kja0(i2);
    }

    public static zy toq(int i2) {
        return new zy(i2);
    }

    public void f7l8(double d2) {
        m17689s(C5055q.ki(this.f29125k, d2, this.f71870zy));
    }

    /* JADX INFO: renamed from: g */
    public zy m17690g(f7l8 f7l8Var) {
        double[] dArrM17661i = C5053k.toq(ld6()).m17661i(f7l8Var, null);
        C5053k c5053kM17659y = C5053k.m17659y(dArrM17661i[0], dArrM17661i[1], dArrM17661i[2], f7l8.f71856ld6);
        return m17688k(c5053kM17659y.x2(), c5053kM17659y.ld6(), toq.m17680h(dArrM17661i[1]));
    }

    public int ld6() {
        return this.f29126q;
    }

    /* JADX INFO: renamed from: n */
    public double m17691n() {
        return this.f71870zy;
    }

    /* JADX INFO: renamed from: p */
    public void m17692p(double d2) {
        m17689s(C5055q.ki(this.f29125k, this.f71869toq, d2));
    }

    /* JADX INFO: renamed from: q */
    public double m17693q() {
        return this.f29125k;
    }

    /* JADX INFO: renamed from: y */
    public void m17694y(double d2) {
        m17689s(C5055q.ki(d2, this.f71869toq, this.f71870zy));
    }

    public double zy() {
        return this.f71869toq;
    }
}

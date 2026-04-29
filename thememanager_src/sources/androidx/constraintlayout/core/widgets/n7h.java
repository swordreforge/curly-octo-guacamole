package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.analyzer.toq;
import java.util.HashSet;

/* JADX INFO: compiled from: VirtualLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends C0342p {

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    private int f47945n2t = 0;

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    private int f47947pjz9 = 0;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    private int f47946ngy = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f47943lh = 0;

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    private int f47938bap7 = 0;

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    private int f47942h4b = 0;

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    private int f47949wlev = 0;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    private int f47941ga = 0;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private boolean f47940e5 = false;

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    private int f47939dxef = 0;

    /* JADX INFO: renamed from: vy, reason: collision with root package name */
    private int f47948vy = 0;

    /* JADX INFO: renamed from: a5id, reason: collision with root package name */
    protected toq.C0335k f47937a5id = new toq.C0335k();

    /* JADX INFO: renamed from: lw, reason: collision with root package name */
    toq.InterfaceC7855toq f47944lw = null;

    protected void bqie(boolean z2) {
        this.f47940e5 = z2;
    }

    public void btvn(int i2) {
        this.f47943lh = i2;
        this.f47941ga = i2;
    }

    public int cyoe() {
        return this.f47947pjz9;
    }

    public void ec(boolean z2) {
        int i2 = this.f47938bap7;
        if (i2 > 0 || this.f47942h4b > 0) {
            if (z2) {
                this.f47949wlev = this.f47942h4b;
                this.f47941ga = i2;
            } else {
                this.f47949wlev = i2;
                this.f47941ga = this.f47942h4b;
            }
        }
    }

    public void el(int i2, int i3, int i4, int i5) {
    }

    public void f1bi(int i2, int i3) {
        this.f47939dxef = i2;
        this.f47948vy = i3;
    }

    protected boolean g0ad() {
        C0341n c0341n = this.f2049j;
        toq.InterfaceC7855toq interfaceC7855toqKq2f = c0341n != null ? ((C0339g) c0341n).kq2f() : null;
        if (interfaceC7855toqKq2f == null) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f47951zwy) {
                return true;
            }
            C0341n c0341n2 = this.f47950nsb[i2];
            if (c0341n2 != null && !(c0341n2 instanceof C0345y)) {
                C0341n.toq toqVarO1t = c0341n2.o1t(0);
                C0341n.toq toqVarO1t2 = c0341n2.o1t(1);
                C0341n.toq toqVar = C0341n.toq.MATCH_CONSTRAINT;
                if (!(toqVarO1t == toqVar && c0341n2.f47906ni7 != 1 && toqVarO1t2 == toqVar && c0341n2.f47881fu4 != 1)) {
                    if (toqVarO1t == toqVar) {
                        toqVarO1t = C0341n.toq.WRAP_CONTENT;
                    }
                    if (toqVarO1t2 == toqVar) {
                        toqVarO1t2 = C0341n.toq.WRAP_CONTENT;
                    }
                    toq.C0335k c0335k = this.f47937a5id;
                    c0335k.f2011k = toqVarO1t;
                    c0335k.f47725toq = toqVarO1t2;
                    c0335k.f47726zy = c0341n2.m1313a();
                    this.f47937a5id.f2014q = c0341n2.jk();
                    interfaceC7855toqKq2f.toq(c0341n2, this.f47937a5id);
                    c0341n2.m2t(this.f47937a5id.f2012n);
                    c0341n2.pc(this.f47937a5id.f2010g);
                    c0341n2.bz2(this.f47937a5id.f47724f7l8);
                }
            }
            i2++;
        }
    }

    public void gb(int i2) {
        this.f47946ngy = i2;
        this.f47949wlev = i2;
    }

    public boolean imd() {
        return this.f47940e5;
    }

    public void kbj(int i2) {
        this.f47942h4b = i2;
    }

    public void kq2f(int i2) {
        this.f47938bap7 = i2;
        this.f47949wlev = i2;
        this.f47941ga = i2;
    }

    public int l05() {
        return this.f47939dxef;
    }

    public void o5() {
        for (int i2 = 0; i2 < this.f47951zwy; i2++) {
            C0341n c0341n = this.f47950nsb[i2];
            if (c0341n != null) {
                c0341n.wlev(true);
            }
        }
    }

    public void ob(int i2) {
        this.f47947pjz9 = i2;
    }

    public int r6ty() {
        return this.f47949wlev;
    }

    public int rp() {
        return this.f47948vy;
    }

    public void tww7(int i2) {
        this.f47946ngy = i2;
        this.f47945n2t = i2;
        this.f47943lh = i2;
        this.f47947pjz9 = i2;
        this.f47938bap7 = i2;
        this.f47942h4b = i2;
    }

    protected void wt(C0341n c0341n, C0341n.toq toqVar, int i2, C0341n.toq toqVar2, int i3) {
        while (this.f47944lw == null && m1318f() != null) {
            this.f47944lw = ((C0339g) m1318f()).kq2f();
        }
        toq.C0335k c0335k = this.f47937a5id;
        c0335k.f2011k = toqVar;
        c0335k.f47725toq = toqVar2;
        c0335k.f47726zy = i2;
        c0335k.f2014q = i3;
        this.f47944lw.toq(c0341n, c0335k);
        c0341n.m2t(this.f47937a5id.f2012n);
        c0341n.pc(this.f47937a5id.f2010g);
        c0341n.ebn(this.f47937a5id.f2016y);
        c0341n.bz2(this.f47937a5id.f47724f7l8);
    }

    public void xm(int i2) {
        this.f47945n2t = i2;
    }

    public int yp31() {
        return this.f47941ga;
    }

    public boolean yw(HashSet<C0341n> hashSet) {
        for (int i2 = 0; i2 < this.f47951zwy; i2++) {
            if (hashSet.contains(this.f47950nsb[i2])) {
                return true;
            }
        }
        return false;
    }

    public int zff0() {
        return this.f47945n2t;
    }

    @Override // androidx.constraintlayout.core.widgets.C0342p, androidx.constraintlayout.core.widgets.InterfaceC0344s
    public void zy(C0339g c0339g) {
        o5();
    }
}

package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C0265g;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.z */
/* JADX INFO: compiled from: ViewState.java */
/* JADX INFO: loaded from: classes.dex */
public class C0288z {

    /* JADX INFO: renamed from: k */
    public float f1694k;

    /* JADX INFO: renamed from: n */
    public int f1695n;

    /* JADX INFO: renamed from: q */
    public int f1696q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f47370toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f47371zy;

    /* JADX INFO: renamed from: k */
    public void m1085k(C0265g c0265g) {
        this.f47370toq = c0265g.x2();
        this.f47371zy = c0265g.ni7();
        this.f1696q = c0265g.cdj();
        this.f1695n = c0265g.m941y();
        this.f1694k = (int) c0265g.m932i();
    }

    public int toq() {
        return this.f1695n - this.f47371zy;
    }

    public int zy() {
        return this.f1696q - this.f47370toq;
    }
}

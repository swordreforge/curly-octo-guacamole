package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.C0334s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.p */
/* JADX INFO: compiled from: HelperWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class C0342p extends C0341n implements InterfaceC0344s {

    /* JADX INFO: renamed from: nsb, reason: collision with root package name */
    public C0341n[] f47950nsb = new C0341n[4];

    /* JADX INFO: renamed from: zwy, reason: collision with root package name */
    public int f47951zwy = 0;

    public int bih(int i2) {
        int i3;
        int i4;
        for (int i5 = 0; i5 < this.f47951zwy; i5++) {
            C0341n c0341n = this.f47950nsb[i5];
            if (i2 == 0 && (i4 = c0341n.f47915r8s8) != -1) {
                return i4;
            }
            if (i2 == 1 && (i3 = c0341n.f47900m4) != -1) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.InterfaceC0344s
    /* JADX INFO: renamed from: k */
    public void mo1333k(C0341n c0341n) {
        if (c0341n == this || c0341n == null) {
            return;
        }
        int i2 = this.f47951zwy + 1;
        C0341n[] c0341nArr = this.f47950nsb;
        if (i2 > c0341nArr.length) {
            this.f47950nsb = (C0341n[]) Arrays.copyOf(c0341nArr, c0341nArr.length * 2);
        }
        C0341n[] c0341nArr2 = this.f47950nsb;
        int i3 = this.f47951zwy;
        c0341nArr2[i3] = c0341n;
        this.f47951zwy = i3 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void n7h(C0341n c0341n, HashMap<C0341n, C0341n> map) {
        super.n7h(c0341n, map);
        C0342p c0342p = (C0342p) c0341n;
        this.f47951zwy = 0;
        int i2 = c0342p.f47951zwy;
        for (int i3 = 0; i3 < i2; i3++) {
            mo1333k(map.get(c0342p.f47950nsb[i3]));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.InterfaceC0344s
    public void toq() {
        this.f47951zwy = 0;
        Arrays.fill(this.f47950nsb, (Object) null);
    }

    public void z4t(ArrayList<androidx.constraintlayout.core.widgets.analyzer.kja0> arrayList, int i2, androidx.constraintlayout.core.widgets.analyzer.kja0 kja0Var) {
        for (int i3 = 0; i3 < this.f47951zwy; i3++) {
            kja0Var.m1268k(this.f47950nsb[i3]);
        }
        for (int i4 = 0; i4 < this.f47951zwy; i4++) {
            C0334s.m1286k(this.f47950nsb[i4], i2, arrayList, kja0Var);
        }
    }

    public void zy(C0339g c0339g) {
    }
}

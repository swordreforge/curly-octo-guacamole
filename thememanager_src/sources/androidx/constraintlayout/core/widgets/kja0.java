package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: compiled from: WidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 extends C0341n {

    /* JADX INFO: renamed from: nsb, reason: collision with root package name */
    public ArrayList<C0341n> f47822nsb;

    public kja0() {
        this.f47822nsb = new ArrayList<>();
    }

    public ArrayList<C0341n> bih() {
        return this.f47822nsb;
    }

    public C0339g ec() {
        C0341n c0341nM1318f = m1318f();
        C0339g c0339g = this instanceof C0339g ? (C0339g) this : null;
        while (c0341nM1318f != null) {
            C0341n c0341nM1318f2 = c0341nM1318f.m1318f();
            if (c0341nM1318f instanceof C0339g) {
                c0339g = (C0339g) c0341nM1318f;
            }
            c0341nM1318f = c0341nM1318f2;
        }
        return c0339g;
    }

    /* JADX INFO: renamed from: k */
    public void m1307k(C0341n c0341n) {
        this.f47822nsb.add(c0341n);
        if (c0341n.m1318f() != null) {
            ((kja0) c0341n.m1318f()).yw(c0341n);
        }
        c0341n.m58i(this);
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void ltg8() {
        this.f47822nsb.clear();
        super.ltg8();
    }

    public void o5() {
        ArrayList<C0341n> arrayList = this.f47822nsb;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0341n c0341n = this.f47822nsb.get(i2);
            if (c0341n instanceof kja0) {
                ((kja0) c0341n).o5();
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void oki(int i2, int i3) {
        super.oki(i2, i3);
        int size = this.f47822nsb.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f47822nsb.get(i4).oki(vyq(), m1317e());
        }
    }

    public void rp() {
        this.f47822nsb.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void sok(androidx.constraintlayout.core.zy zyVar) {
        super.sok(zyVar);
        int size = this.f47822nsb.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f47822nsb.get(i2).sok(zyVar);
        }
    }

    public void yw(C0341n c0341n) {
        this.f47822nsb.remove(c0341n);
        c0341n.ltg8();
    }

    public void z4t(C0341n... c0341nArr) {
        for (C0341n c0341n : c0341nArr) {
            m1307k(c0341n);
        }
    }

    public kja0(int i2, int i3, int i4, int i5) {
        super(i2, i3, i4, i5);
        this.f47822nsb = new ArrayList<>();
    }

    public kja0(int i2, int i3) {
        super(i2, i3);
        this.f47822nsb = new ArrayList<>();
    }
}

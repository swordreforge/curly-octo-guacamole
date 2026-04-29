package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.g */
/* JADX INFO: compiled from: DependencyNode.java */
/* JADX INFO: loaded from: classes.dex */
public class C0326g implements InterfaceC0333q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public int f47693f7l8;

    /* JADX INFO: renamed from: g */
    int f1960g;

    /* JADX INFO: renamed from: q */
    AbstractC0327h f1964q;

    /* JADX INFO: renamed from: k */
    public InterfaceC0333q f1961k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public boolean f47695toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public boolean f47697zy = false;

    /* JADX INFO: renamed from: n */
    k f1962n = k.UNKNOWN;

    /* JADX INFO: renamed from: y */
    int f1966y = 1;

    /* JADX INFO: renamed from: s */
    f7l8 f1965s = null;

    /* JADX INFO: renamed from: p */
    public boolean f1963p = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    List<InterfaceC0333q> f47694ld6 = new ArrayList();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    List<C0326g> f47696x2 = new ArrayList();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.g$k */
    /* JADX INFO: compiled from: DependencyNode.java */
    enum k {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C0326g(AbstractC0327h abstractC0327h) {
        this.f1964q = abstractC0327h;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q
    /* JADX INFO: renamed from: k */
    public void mo1253k(InterfaceC0333q interfaceC0333q) {
        Iterator<C0326g> it = this.f47696x2.iterator();
        while (it.hasNext()) {
            if (!it.next().f1963p) {
                return;
            }
        }
        this.f47697zy = true;
        InterfaceC0333q interfaceC0333q2 = this.f1961k;
        if (interfaceC0333q2 != null) {
            interfaceC0333q2.mo1253k(this);
        }
        if (this.f47695toq) {
            this.f1964q.mo1253k(this);
            return;
        }
        C0326g c0326g = null;
        int i2 = 0;
        for (C0326g c0326g2 : this.f47696x2) {
            if (!(c0326g2 instanceof f7l8)) {
                i2++;
                c0326g = c0326g2;
            }
        }
        if (c0326g != null && i2 == 1 && c0326g.f1963p) {
            f7l8 f7l8Var = this.f1965s;
            if (f7l8Var != null) {
                if (!f7l8Var.f1963p) {
                    return;
                } else {
                    this.f1960g = this.f1966y * f7l8Var.f47693f7l8;
                }
            }
            mo1252n(c0326g.f47693f7l8 + this.f1960g);
        }
        InterfaceC0333q interfaceC0333q3 = this.f1961k;
        if (interfaceC0333q3 != null) {
            interfaceC0333q3.mo1253k(this);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo1252n(int i2) {
        if (this.f1963p) {
            return;
        }
        this.f1963p = true;
        this.f47693f7l8 = i2;
        for (InterfaceC0333q interfaceC0333q : this.f47694ld6) {
            interfaceC0333q.mo1253k(interfaceC0333q);
        }
    }

    /* JADX INFO: renamed from: q */
    public String m1254q() {
        String str;
        String strM1332z = this.f1964q.f47699toq.m1332z();
        k kVar = this.f1962n;
        if (kVar == k.LEFT || kVar == k.RIGHT) {
            str = strM1332z + "_HORIZONTAL";
        } else {
            str = strM1332z + "_VERTICAL";
        }
        return str + ":" + this.f1962n.name();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1964q.f47699toq.m1332z());
        sb.append(":");
        sb.append(this.f1962n);
        sb.append("(");
        sb.append(this.f1963p ? Integer.valueOf(this.f47693f7l8) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f47696x2.size());
        sb.append(":d=");
        sb.append(this.f47694ld6.size());
        sb.append(">");
        return sb.toString();
    }

    public void toq(InterfaceC0333q interfaceC0333q) {
        this.f47694ld6.add(interfaceC0333q);
        if (this.f1963p) {
            interfaceC0333q.mo1253k(interfaceC0333q);
        }
    }

    public void zy() {
        this.f47696x2.clear();
        this.f47694ld6.clear();
        this.f1963p = false;
        this.f47693f7l8 = 0;
        this.f47697zy = false;
        this.f47695toq = false;
    }
}

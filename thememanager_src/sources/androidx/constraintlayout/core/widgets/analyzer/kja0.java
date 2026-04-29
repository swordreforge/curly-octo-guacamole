package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: WidgetGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final boolean f47701f7l8 = false;

    /* JADX INFO: renamed from: y */
    static int f1977y;

    /* JADX INFO: renamed from: q */
    int f1981q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f47702toq;

    /* JADX INFO: renamed from: k */
    ArrayList<C0341n> f1979k = new ArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    boolean f47703zy = false;

    /* JADX INFO: renamed from: n */
    ArrayList<C0329k> f1980n = null;

    /* JADX INFO: renamed from: g */
    private int f1978g = -1;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.kja0$k */
    /* JADX INFO: compiled from: WidgetGroup.java */
    class C0329k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f47704f7l8;

        /* JADX INFO: renamed from: g */
        int f1982g;

        /* JADX INFO: renamed from: k */
        WeakReference<C0341n> f1983k;

        /* JADX INFO: renamed from: n */
        int f1984n;

        /* JADX INFO: renamed from: q */
        int f1985q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f47705toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f47706zy;

        public C0329k(C0341n c0341n, C0296n c0296n, int i2) {
            this.f1983k = new WeakReference<>(c0341n);
            this.f47705toq = c0296n.dd(c0341n.f47905ncyb);
            this.f47706zy = c0296n.dd(c0341n.f2051l);
            this.f1985q = c0296n.dd(c0341n.f47903n5r1);
            this.f1984n = c0296n.dd(c0341n.f47887hyr);
            this.f1982g = c0296n.dd(c0341n.f2045f);
            this.f47704f7l8 = i2;
        }

        /* JADX INFO: renamed from: k */
        public void m1272k() {
            C0341n c0341n = this.f1983k.get();
            if (c0341n != null) {
                c0341n.mbx(this.f47705toq, this.f47706zy, this.f1985q, this.f1984n, this.f1982g, this.f47704f7l8);
            }
        }
    }

    public kja0(int i2) {
        int i3 = f1977y;
        f1977y = i3 + 1;
        this.f47702toq = i3;
        this.f1981q = i2;
    }

    private int cdj(C0296n c0296n, ArrayList<C0341n> arrayList, int i2) {
        int iDd;
        int iDd2;
        C0339g c0339g = (C0339g) arrayList.get(0).m1318f();
        c0296n.vyq();
        c0339g.f7l8(c0296n, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).f7l8(c0296n, false);
        }
        if (i2 == 0 && c0339g.f47809vy > 0) {
            androidx.constraintlayout.core.widgets.toq.toq(c0339g, c0296n, arrayList, 0);
        }
        if (i2 == 1 && c0339g.f47782a5id > 0) {
            androidx.constraintlayout.core.widgets.toq.toq(c0339g, c0296n, arrayList, 1);
        }
        try {
            c0296n.hyr();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f1980n = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f1980n.add(new C0329k(arrayList.get(i4), c0296n, i2));
        }
        if (i2 == 0) {
            iDd = c0296n.dd(c0339g.f47905ncyb);
            iDd2 = c0296n.dd(c0339g.f47903n5r1);
            c0296n.vyq();
        } else {
            iDd = c0296n.dd(c0339g.f2051l);
            iDd2 = c0296n.dd(c0339g.f47887hyr);
            c0296n.vyq();
        }
        return iDd2 - iDd;
    }

    private int ld6(int i2, C0341n c0341n) {
        C0341n.toq toqVarO1t = c0341n.o1t(i2);
        if (toqVarO1t == C0341n.toq.WRAP_CONTENT || toqVarO1t == C0341n.toq.MATCH_PARENT || toqVarO1t == C0341n.toq.FIXED) {
            return i2 == 0 ? c0341n.m1313a() : c0341n.jk();
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    private boolean m1264n(C0341n c0341n) {
        return this.f1979k.contains(c0341n);
    }

    /* JADX INFO: renamed from: y */
    private String m1265y() {
        int i2 = this.f1981q;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    public int f7l8() {
        return this.f1981q;
    }

    /* JADX INFO: renamed from: g */
    public int m1266g() {
        return this.f47702toq;
    }

    /* JADX INFO: renamed from: h */
    public int m1267h() {
        return this.f1979k.size();
    }

    /* JADX INFO: renamed from: k */
    public boolean m1268k(C0341n c0341n) {
        if (this.f1979k.contains(c0341n)) {
            return false;
        }
        this.f1979k.add(c0341n);
        return true;
    }

    public void kja0(int i2) {
        this.f1981q = i2;
    }

    public void n7h(boolean z2) {
        this.f47703zy = z2;
    }

    /* JADX INFO: renamed from: p */
    public boolean m1269p() {
        return this.f47703zy;
    }

    /* JADX INFO: renamed from: q */
    public void m1270q() {
        this.f1979k.clear();
    }

    public void qrj(int i2, kja0 kja0Var) {
        for (C0341n c0341n : this.f1979k) {
            kja0Var.m1268k(c0341n);
            if (i2 == 0) {
                c0341n.f47915r8s8 = kja0Var.m1266g();
            } else {
                c0341n.f47900m4 = kja0Var.m1266g();
            }
        }
        this.f1978g = kja0Var.f47702toq;
    }

    /* JADX INFO: renamed from: s */
    public boolean m1271s(kja0 kja0Var) {
        for (int i2 = 0; i2 < this.f1979k.size(); i2++) {
            if (kja0Var.m1264n(this.f1979k.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = m1265y() + " [" + this.f47702toq + "] <";
        Iterator<C0341n> it = this.f1979k.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().m1332z();
        }
        return str + " >";
    }

    public void toq() {
        if (this.f1980n != null && this.f47703zy) {
            for (int i2 = 0; i2 < this.f1980n.size(); i2++) {
                this.f1980n.get(i2).m1272k();
            }
        }
    }

    public int x2(C0296n c0296n, int i2) {
        if (this.f1979k.size() == 0) {
            return 0;
        }
        return cdj(c0296n, this.f1979k, i2);
    }

    public void zy(ArrayList<kja0> arrayList) {
        int size = this.f1979k.size();
        if (this.f1978g != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                kja0 kja0Var = arrayList.get(i2);
                if (this.f1978g == kja0Var.f47702toq) {
                    qrj(this.f1981q, kja0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}

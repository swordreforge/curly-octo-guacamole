package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ChainRun.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends AbstractC0327h {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    ArrayList<AbstractC0327h> f47730ld6;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f47731x2;

    public zy(C0341n c0341n, int i2) {
        super(c0341n);
        this.f47730ld6 = new ArrayList<>();
        this.f1968g = i2;
        fn3e();
    }

    private void fn3e() {
        C0341n c0341n;
        C0341n c0341n2 = this.f47699toq;
        C0341n c0341nM1315c = c0341n2.m1315c(this.f1968g);
        while (true) {
            C0341n c0341n3 = c0341nM1315c;
            c0341n = c0341n2;
            c0341n2 = c0341n3;
            if (c0341n2 == null) {
                break;
            } else {
                c0341nM1315c = c0341n2.m1315c(this.f1968g);
            }
        }
        this.f47699toq = c0341n;
        this.f47730ld6.add(c0341n.nn86(this.f1968g));
        C0341n c0341nM1322l = c0341n.m1322l(this.f1968g);
        while (c0341nM1322l != null) {
            this.f47730ld6.add(c0341nM1322l.nn86(this.f1968g));
            c0341nM1322l = c0341nM1322l.m1322l(this.f1968g);
        }
        for (AbstractC0327h abstractC0327h : this.f47730ld6) {
            int i2 = this.f1968g;
            if (i2 == 0) {
                abstractC0327h.f47699toq.f47935zy = this;
            } else if (i2 == 1) {
                abstractC0327h.f47699toq.f2056q = this;
            }
        }
        if ((this.f1968g == 0 && ((C0339g) this.f47699toq.m1318f()).xblq()) && this.f47730ld6.size() > 1) {
            ArrayList<AbstractC0327h> arrayList = this.f47730ld6;
            this.f47699toq = arrayList.get(arrayList.size() - 1).f47699toq;
        }
        this.f47731x2 = this.f1968g == 0 ? this.f47699toq.jp0y() : this.f47699toq.m1314b();
    }

    private C0341n ni7() {
        for (int size = this.f47730ld6.size() - 1; size >= 0; size--) {
            AbstractC0327h abstractC0327h = this.f47730ld6.get(size);
            if (abstractC0327h.f47699toq.a98o() != 8) {
                return abstractC0327h.f47699toq;
            }
        }
        return null;
    }

    private C0341n zurt() {
        for (int i2 = 0; i2 < this.f47730ld6.size(); i2++) {
            AbstractC0327h abstractC0327h = this.f47730ld6.get(i2);
            if (abstractC0327h.f47699toq.a98o() != 8) {
                return abstractC0327h.f47699toq;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: g */
    void mo1255g() {
        this.f47700zy = null;
        Iterator<AbstractC0327h> it = this.f47730ld6.iterator();
        while (it.hasNext()) {
            it.next().mo1255g();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: h */
    boolean mo1256h() {
        int size = this.f47730ld6.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f47730ld6.get(i2).mo1256h()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1253k(androidx.constraintlayout.core.widgets.analyzer.InterfaceC0333q r27) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.zy.mo1253k(androidx.constraintlayout.core.widgets.analyzer.q):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: n */
    public void mo1258n() {
        for (int i2 = 0; i2 < this.f47730ld6.size(); i2++) {
            this.f47730ld6.get(i2).mo1258n();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    void n7h() {
        this.f1974y.f1963p = false;
        this.f1973s.f1963p = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: p */
    public long mo1259p() {
        int size = this.f47730ld6.size();
        long jMo1259p = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0327h abstractC0327h = this.f47730ld6.get(i2);
            jMo1259p = jMo1259p + ((long) abstractC0327h.f1974y.f1960g) + abstractC0327h.mo1259p() + ((long) abstractC0327h.f1973s.f1960g);
        }
        return jMo1259p;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0327h
    /* JADX INFO: renamed from: q */
    void mo1260q() {
        Iterator<AbstractC0327h> it = this.f47730ld6.iterator();
        while (it.hasNext()) {
            it.next().mo1260q();
        }
        int size = this.f47730ld6.size();
        if (size < 1) {
            return;
        }
        C0341n c0341n = this.f47730ld6.get(0).f47699toq;
        C0341n c0341n2 = this.f47730ld6.get(size - 1).f47699toq;
        if (this.f1968g == 0) {
            C0343q c0343q = c0341n.f47905ncyb;
            C0343q c0343q2 = c0341n2.f47903n5r1;
            C0326g c0326gM1261s = m1261s(c0343q, 0);
            int iF7l8 = c0343q.f7l8();
            C0341n c0341nZurt = zurt();
            if (c0341nZurt != null) {
                iF7l8 = c0341nZurt.f47905ncyb.f7l8();
            }
            if (c0326gM1261s != null) {
                toq(this.f1974y, c0326gM1261s, iF7l8);
            }
            C0326g c0326gM1261s2 = m1261s(c0343q2, 0);
            int iF7l82 = c0343q2.f7l8();
            C0341n c0341nNi7 = ni7();
            if (c0341nNi7 != null) {
                iF7l82 = c0341nNi7.f47903n5r1.f7l8();
            }
            if (c0326gM1261s2 != null) {
                toq(this.f1973s, c0326gM1261s2, -iF7l82);
            }
        } else {
            C0343q c0343q3 = c0341n.f2051l;
            C0343q c0343q4 = c0341n2.f47887hyr;
            C0326g c0326gM1261s3 = m1261s(c0343q3, 1);
            int iF7l83 = c0343q3.f7l8();
            C0341n c0341nZurt2 = zurt();
            if (c0341nZurt2 != null) {
                iF7l83 = c0341nZurt2.f2051l.f7l8();
            }
            if (c0326gM1261s3 != null) {
                toq(this.f1974y, c0326gM1261s3, iF7l83);
            }
            C0326g c0326gM1261s4 = m1261s(c0343q4, 1);
            int iF7l84 = c0343q4.f7l8();
            C0341n c0341nNi72 = ni7();
            if (c0341nNi72 != null) {
                iF7l84 = c0341nNi72.f47887hyr.f7l8();
            }
            if (c0326gM1261s4 != null) {
                toq(this.f1973s, c0326gM1261s4, -iF7l84);
            }
        }
        this.f1974y.f1961k = this;
        this.f1973s.f1961k = this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f1968g == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC0327h abstractC0327h : this.f47730ld6) {
            sb.append("<");
            sb.append(abstractC0327h);
            sb.append("> ");
        }
        return sb.toString();
    }
}

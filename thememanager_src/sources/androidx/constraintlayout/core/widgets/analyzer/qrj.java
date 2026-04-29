package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0339g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: RunGroup.java */
/* JADX INFO: loaded from: classes.dex */
class qrj {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static int f47712ld6 = 0;

    /* JADX INFO: renamed from: p */
    public static final int f1995p = 2;

    /* JADX INFO: renamed from: s */
    public static final int f1996s = 1;

    /* JADX INFO: renamed from: y */
    public static final int f1997y = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    int f47713f7l8;

    /* JADX INFO: renamed from: g */
    int f1998g;

    /* JADX INFO: renamed from: q */
    AbstractC0327h f2001q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    AbstractC0327h f47715zy;

    /* JADX INFO: renamed from: k */
    public int f1999k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public boolean f47714toq = false;

    /* JADX INFO: renamed from: n */
    ArrayList<AbstractC0327h> f2000n = new ArrayList<>();

    public qrj(AbstractC0327h abstractC0327h, int i2) {
        this.f47715zy = null;
        this.f2001q = null;
        int i3 = f47712ld6;
        this.f1998g = i3;
        f47712ld6 = i3 + 1;
        this.f47715zy = abstractC0327h;
        this.f2001q = abstractC0327h;
        this.f47713f7l8 = i2;
    }

    /* JADX INFO: renamed from: g */
    private long m1282g(C0326g c0326g, long j2) {
        AbstractC0327h abstractC0327h = c0326g.f1964q;
        if (abstractC0327h instanceof ld6) {
            return j2;
        }
        int size = c0326g.f47694ld6.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0333q interfaceC0333q = c0326g.f47694ld6.get(i2);
            if (interfaceC0333q instanceof C0326g) {
                C0326g c0326g2 = (C0326g) interfaceC0333q;
                if (c0326g2.f1964q != abstractC0327h) {
                    jMax = Math.max(jMax, m1282g(c0326g2, ((long) c0326g2.f1960g) + j2));
                }
            }
        }
        if (c0326g != abstractC0327h.f1974y) {
            return jMax;
        }
        long jMo1259p = j2 + abstractC0327h.mo1259p();
        return Math.max(Math.max(jMax, m1282g(abstractC0327h.f1973s, jMo1259p)), jMo1259p - ((long) abstractC0327h.f1973s.f1960g));
    }

    /* JADX INFO: renamed from: n */
    private long m1283n(C0326g c0326g, long j2) {
        AbstractC0327h abstractC0327h = c0326g.f1964q;
        if (abstractC0327h instanceof ld6) {
            return j2;
        }
        int size = c0326g.f47694ld6.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0333q interfaceC0333q = c0326g.f47694ld6.get(i2);
            if (interfaceC0333q instanceof C0326g) {
                C0326g c0326g2 = (C0326g) interfaceC0333q;
                if (c0326g2.f1964q != abstractC0327h) {
                    jMin = Math.min(jMin, m1283n(c0326g2, ((long) c0326g2.f1960g) + j2));
                }
            }
        }
        if (c0326g != abstractC0327h.f1973s) {
            return jMin;
        }
        long jMo1259p = j2 - abstractC0327h.mo1259p();
        return Math.min(Math.min(jMin, m1283n(abstractC0327h.f1974y, jMo1259p)), jMo1259p - ((long) abstractC0327h.f1974y.f1960g));
    }

    private boolean zy(AbstractC0327h abstractC0327h, int i2) {
        C0326g c0326g;
        AbstractC0327h abstractC0327h2;
        C0326g c0326g2;
        AbstractC0327h abstractC0327h3;
        if (!abstractC0327h.f47699toq.f47877f7l8[i2]) {
            return false;
        }
        for (InterfaceC0333q interfaceC0333q : abstractC0327h.f1974y.f47694ld6) {
            if ((interfaceC0333q instanceof C0326g) && (abstractC0327h3 = (c0326g2 = (C0326g) interfaceC0333q).f1964q) != abstractC0327h && c0326g2 == abstractC0327h3.f1974y) {
                if (abstractC0327h instanceof zy) {
                    Iterator<AbstractC0327h> it = ((zy) abstractC0327h).f47730ld6.iterator();
                    while (it.hasNext()) {
                        zy(it.next(), i2);
                    }
                } else if (!(abstractC0327h instanceof ld6)) {
                    abstractC0327h.f47699toq.f47877f7l8[i2] = false;
                }
                zy(c0326g2.f1964q, i2);
            }
        }
        for (InterfaceC0333q interfaceC0333q2 : abstractC0327h.f1973s.f47694ld6) {
            if ((interfaceC0333q2 instanceof C0326g) && (abstractC0327h2 = (c0326g = (C0326g) interfaceC0333q2).f1964q) != abstractC0327h && c0326g == abstractC0327h2.f1974y) {
                if (abstractC0327h instanceof zy) {
                    Iterator<AbstractC0327h> it2 = ((zy) abstractC0327h).f47730ld6.iterator();
                    while (it2.hasNext()) {
                        zy(it2.next(), i2);
                    }
                } else if (!(abstractC0327h instanceof ld6)) {
                    abstractC0327h.f47699toq.f47877f7l8[i2] = false;
                }
                zy(c0326g.f1964q, i2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m1284k(AbstractC0327h abstractC0327h) {
        this.f2000n.add(abstractC0327h);
        this.f2001q = abstractC0327h;
    }

    /* JADX INFO: renamed from: q */
    public void m1285q(boolean z2, boolean z3) {
        if (z2) {
            AbstractC0327h abstractC0327h = this.f47715zy;
            if (abstractC0327h instanceof x2) {
                zy(abstractC0327h, 0);
            }
        }
        if (z3) {
            AbstractC0327h abstractC0327h2 = this.f47715zy;
            if (abstractC0327h2 instanceof n7h) {
                zy(abstractC0327h2, 1);
            }
        }
    }

    public long toq(C0339g c0339g, int i2) {
        long jMo1259p;
        int i3;
        AbstractC0327h abstractC0327h = this.f47715zy;
        if (abstractC0327h instanceof zy) {
            if (((zy) abstractC0327h).f1968g != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(abstractC0327h instanceof x2)) {
                return 0L;
            }
        } else if (!(abstractC0327h instanceof n7h)) {
            return 0L;
        }
        C0326g c0326g = (i2 == 0 ? c0339g.f2053n : c0339g.f2046g).f1974y;
        C0326g c0326g2 = (i2 == 0 ? c0339g.f2053n : c0339g.f2046g).f1973s;
        boolean zContains = abstractC0327h.f1974y.f47696x2.contains(c0326g);
        boolean zContains2 = this.f47715zy.f1973s.f47696x2.contains(c0326g2);
        long jMo1259p2 = this.f47715zy.mo1259p();
        if (zContains && zContains2) {
            long jM1282g = m1282g(this.f47715zy.f1974y, 0L);
            long jM1283n = m1283n(this.f47715zy.f1973s, 0L);
            long j2 = jM1282g - jMo1259p2;
            AbstractC0327h abstractC0327h2 = this.f47715zy;
            int i4 = abstractC0327h2.f1973s.f1960g;
            if (j2 >= (-i4)) {
                j2 += (long) i4;
            }
            int i5 = abstractC0327h2.f1974y.f1960g;
            long j3 = ((-jM1283n) - jMo1259p2) - ((long) i5);
            if (j3 >= i5) {
                j3 -= (long) i5;
            }
            float fFn3e = abstractC0327h2.f47699toq.fn3e(i2);
            float f2 = fFn3e > 0.0f ? (long) ((j3 / fFn3e) + (j2 / (1.0f - fFn3e))) : 0L;
            long j4 = ((long) ((f2 * fFn3e) + 0.5f)) + jMo1259p2 + ((long) ((f2 * (1.0f - fFn3e)) + 0.5f));
            AbstractC0327h abstractC0327h3 = this.f47715zy;
            jMo1259p = ((long) abstractC0327h3.f1974y.f1960g) + j4;
            i3 = abstractC0327h3.f1973s.f1960g;
        } else {
            if (zContains) {
                return Math.max(m1282g(this.f47715zy.f1974y, r12.f1960g), ((long) this.f47715zy.f1974y.f1960g) + jMo1259p2);
            }
            if (zContains2) {
                return Math.max(-m1283n(this.f47715zy.f1973s, r12.f1960g), ((long) (-this.f47715zy.f1973s.f1960g)) + jMo1259p2);
            }
            AbstractC0327h abstractC0327h4 = this.f47715zy;
            jMo1259p = ((long) abstractC0327h4.f1974y.f1960g) + abstractC0327h4.mo1259p();
            i3 = this.f47715zy.f1973s.f1960g;
        }
        return jMo1259p - ((long) i3);
    }
}

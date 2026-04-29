package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.C0263g;
import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.C0345y;
import androidx.constraintlayout.core.widgets.InterfaceC0344s;
import java.util.ArrayList;

/* JADX INFO: compiled from: BasicMeasure.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f47717f7l8 = 1073741824;

    /* JADX INFO: renamed from: g */
    public static final int f2003g = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f47718ld6 = -3;

    /* JADX INFO: renamed from: n */
    private static final int f2004n = 30;

    /* JADX INFO: renamed from: p */
    public static final int f2005p = -2;

    /* JADX INFO: renamed from: q */
    private static final boolean f2006q = false;

    /* JADX INFO: renamed from: s */
    public static final int f2007s = -1;

    /* JADX INFO: renamed from: y */
    public static final int f2008y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    private final ArrayList<C0341n> f2009k = new ArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C0335k f47719toq = new C0335k();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C0339g f47720zy;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.toq$k */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public static class C0335k {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static int f47721ld6 = 0;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static int f47722qrj = 2;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static int f47723x2 = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f47724f7l8;

        /* JADX INFO: renamed from: g */
        public int f2010g;

        /* JADX INFO: renamed from: k */
        public C0341n.toq f2011k;

        /* JADX INFO: renamed from: n */
        public int f2012n;

        /* JADX INFO: renamed from: p */
        public int f2013p;

        /* JADX INFO: renamed from: q */
        public int f2014q;

        /* JADX INFO: renamed from: s */
        public boolean f2015s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public C0341n.toq f47725toq;

        /* JADX INFO: renamed from: y */
        public boolean f2016y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f47726zy;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public interface InterfaceC7855toq {
        /* JADX INFO: renamed from: k */
        void mo1291k();

        void toq(C0341n c0341n, C0335k c0335k);
    }

    public toq(C0339g c0339g) {
        this.f47720zy = c0339g;
    }

    /* JADX INFO: renamed from: k */
    private boolean m1288k(InterfaceC7855toq interfaceC7855toq, C0341n c0341n, int i2) {
        this.f47719toq.f2011k = c0341n.gvn7();
        this.f47719toq.f47725toq = c0341n.bf2();
        this.f47719toq.f47726zy = c0341n.m1313a();
        this.f47719toq.f2014q = c0341n.jk();
        C0335k c0335k = this.f47719toq;
        c0335k.f2015s = false;
        c0335k.f2013p = i2;
        C0341n.toq toqVar = c0335k.f2011k;
        C0341n.toq toqVar2 = C0341n.toq.MATCH_CONSTRAINT;
        boolean z2 = toqVar == toqVar2;
        boolean z3 = c0335k.f47725toq == toqVar2;
        boolean z5 = z2 && c0341n.f47875ek5k > 0.0f;
        boolean z6 = z3 && c0341n.f47875ek5k > 0.0f;
        if (z5 && c0341n.f2064z[0] == 4) {
            c0335k.f2011k = C0341n.toq.FIXED;
        }
        if (z6 && c0341n.f2064z[1] == 4) {
            c0335k.f47725toq = C0341n.toq.FIXED;
        }
        interfaceC7855toq.toq(c0341n, c0335k);
        c0341n.m2t(this.f47719toq.f2012n);
        c0341n.pc(this.f47719toq.f2010g);
        c0341n.ebn(this.f47719toq.f2016y);
        c0341n.bz2(this.f47719toq.f47724f7l8);
        C0335k c0335k2 = this.f47719toq;
        c0335k2.f2013p = C0335k.f47721ld6;
        return c0335k2.f2015s;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[PHI: r10
      0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void toq(androidx.constraintlayout.core.widgets.C0339g r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.n> r0 = r13.f47822nsb
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.vwb(r1)
            androidx.constraintlayout.core.widgets.analyzer.toq$toq r2 = r13.kq2f()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.n> r5 = r13.f47822nsb
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.n r5 = (androidx.constraintlayout.core.widgets.C0341n) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.C0345y
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.C0340k
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.vq()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.x2 r6 = r5.f2053n
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.n7h r7 = r5.f2046g
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.f7l8 r6 = r6.f1970n
            boolean r6 = r6.f1963p
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.f7l8 r6 = r7.f1970n
            boolean r6 = r6.f1963p
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.n$toq r6 = r5.o1t(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.n$toq r8 = r5.o1t(r7)
            androidx.constraintlayout.core.widgets.n$toq r9 = androidx.constraintlayout.core.widgets.C0341n.toq.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.f47906ni7
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.f47881fu4
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.vwb(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.n7h
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.f47906ni7
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.ikck()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.f47881fu4
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.ikck()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.f47875ek5k
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.toq.C0335k.f47721ld6
            r12.m1288k(r2, r5, r6)
            androidx.constraintlayout.core.g r5 = r13.f47785bap7
            if (r5 == 0) goto Lac
            long r6 = r5.f47082zy
            r8 = 1
            long r6 = r6 + r8
            r5.f47082zy = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.mo1291k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.toq.toq(androidx.constraintlayout.core.widgets.g):void");
    }

    private void zy(C0339g c0339g, String str, int i2, int i3, int i4) {
        int iNcyb = c0339g.ncyb();
        int iX9kr = c0339g.x9kr();
        c0339g.gcp(0);
        c0339g.lw(0);
        c0339g.m2t(i3);
        c0339g.pc(i4);
        c0339g.gcp(iNcyb);
        c0339g.lw(iX9kr);
        this.f47720zy.ab(i2);
        this.f47720zy.o5();
    }

    /* JADX INFO: renamed from: n */
    public void m1289n(C0339g c0339g) {
        this.f2009k.clear();
        int size = c0339g.f47822nsb.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0341n c0341n = c0339g.f47822nsb.get(i2);
            C0341n.toq toqVarGvn7 = c0341n.gvn7();
            C0341n.toq toqVar = C0341n.toq.MATCH_CONSTRAINT;
            if (toqVarGvn7 == toqVar || c0341n.bf2() == toqVar) {
                this.f2009k.add(c0341n);
            }
        }
        c0339g.exv8();
    }

    /* JADX INFO: renamed from: q */
    public long m1290q(C0339g c0339g, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean zKbj;
        int i11;
        int i12;
        boolean z2;
        int i13;
        InterfaceC7855toq interfaceC7855toq;
        int i14;
        int i15;
        int i16;
        boolean z3;
        C0263g c0263g;
        InterfaceC7855toq interfaceC7855toqKq2f = c0339g.kq2f();
        int size = c0339g.f47822nsb.size();
        int iM1313a = c0339g.m1313a();
        int iJk = c0339g.jk();
        boolean qVar = androidx.constraintlayout.core.widgets.ld6.toq(i2, 128);
        boolean z5 = qVar || androidx.constraintlayout.core.widgets.ld6.toq(i2, 64);
        if (z5) {
            for (int i17 = 0; i17 < size; i17++) {
                C0341n c0341n = c0339g.f47822nsb.get(i17);
                C0341n.toq toqVarGvn7 = c0341n.gvn7();
                C0341n.toq toqVar = C0341n.toq.MATCH_CONSTRAINT;
                boolean z6 = (toqVarGvn7 == toqVar) && (c0341n.bf2() == toqVar) && c0341n.wvg() > 0.0f;
                if ((c0341n.ikck() && z6) || ((c0341n.mu() && z6) || (c0341n instanceof androidx.constraintlayout.core.widgets.n7h) || c0341n.ikck() || c0341n.mu())) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5 && (c0263g = C0296n.f47567mcp) != null) {
            c0263g.f1419n++;
        }
        boolean z7 = z5 & ((i5 == 1073741824 && i7 == 1073741824) || qVar);
        int i18 = 2;
        if (z7) {
            int iMin = Math.min(c0339g.dd(), i6);
            int iMin2 = Math.min(c0339g.m1326r(), i8);
            if (i5 == 1073741824 && c0339g.m1313a() != iMin) {
                c0339g.m2t(iMin);
                c0339g.exv8();
            }
            if (i7 == 1073741824 && c0339g.jk() != iMin2) {
                c0339g.pc(iMin2);
                c0339g.exv8();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                zKbj = c0339g.tww7(qVar);
                i11 = 2;
            } else {
                boolean zOb = c0339g.ob(qVar);
                if (i5 == 1073741824) {
                    zOb &= c0339g.kbj(qVar, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    zKbj = c0339g.kbj(qVar, 1) & zOb;
                    i11++;
                } else {
                    zKbj = zOb;
                }
            }
            if (zKbj) {
                c0339g.uf(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            zKbj = false;
            i11 = 0;
        }
        if (zKbj && i11 == 2) {
            return 0L;
        }
        int iXm = c0339g.xm();
        if (size > 0) {
            toq(c0339g);
        }
        m1289n(c0339g);
        int size2 = this.f2009k.size();
        if (size > 0) {
            zy(c0339g, "First pass", 0, iM1313a, iJk);
        }
        if (size2 > 0) {
            C0341n.toq toqVarGvn72 = c0339g.gvn7();
            C0341n.toq toqVar2 = C0341n.toq.WRAP_CONTENT;
            boolean z8 = toqVarGvn72 == toqVar2;
            boolean z9 = c0339g.bf2() == toqVar2;
            int iMax = Math.max(c0339g.m1313a(), this.f47720zy.ncyb());
            int iMax2 = Math.max(c0339g.jk(), this.f47720zy.x9kr());
            int i19 = 0;
            boolean zImd = false;
            while (i19 < size2) {
                C0341n c0341n2 = this.f2009k.get(i19);
                if (c0341n2 instanceof androidx.constraintlayout.core.widgets.n7h) {
                    int iM1313a2 = c0341n2.m1313a();
                    i14 = iXm;
                    int iJk2 = c0341n2.jk();
                    i15 = iJk;
                    boolean zM1288k = m1288k(interfaceC7855toqKq2f, c0341n2, C0335k.f47723x2) | zImd;
                    C0263g c0263g2 = c0339g.f47785bap7;
                    i16 = iM1313a;
                    if (c0263g2 != null) {
                        c0263g2.f1421q++;
                    }
                    int iM1313a3 = c0341n2.m1313a();
                    int iJk3 = c0341n2.jk();
                    if (iM1313a3 != iM1313a2) {
                        c0341n2.m2t(iM1313a3);
                        if (z8 && c0341n2.uv6() > iMax) {
                            iMax = Math.max(iMax, c0341n2.uv6() + c0341n2.ki(C0343q.toq.RIGHT).f7l8());
                        }
                        z3 = true;
                    } else {
                        z3 = zM1288k;
                    }
                    if (iJk3 != iJk2) {
                        c0341n2.pc(iJk3);
                        if (z9 && c0341n2.zurt() > iMax2) {
                            iMax2 = Math.max(iMax2, c0341n2.zurt() + c0341n2.ki(C0343q.toq.BOTTOM).f7l8());
                        }
                        z3 = true;
                    }
                    zImd = z3 | ((androidx.constraintlayout.core.widgets.n7h) c0341n2).imd();
                } else {
                    i14 = iXm;
                    i16 = iM1313a;
                    i15 = iJk;
                }
                i19++;
                iXm = i14;
                iJk = i15;
                iM1313a = i16;
                i18 = 2;
            }
            int i20 = iXm;
            int i21 = iM1313a;
            int i22 = iJk;
            int i23 = i18;
            int i24 = 0;
            while (i24 < i23) {
                int i25 = 0;
                while (i25 < size2) {
                    C0341n c0341n3 = this.f2009k.get(i25);
                    if (((c0341n3 instanceof InterfaceC0344s) && !(c0341n3 instanceof androidx.constraintlayout.core.widgets.n7h)) || (c0341n3 instanceof C0345y) || c0341n3.a98o() == 8 || ((z7 && c0341n3.f2053n.f1970n.f1963p && c0341n3.f2046g.f1970n.f1963p) || (c0341n3 instanceof androidx.constraintlayout.core.widgets.n7h))) {
                        z2 = z7;
                        i13 = size2;
                        interfaceC7855toq = interfaceC7855toqKq2f;
                    } else {
                        int iM1313a4 = c0341n3.m1313a();
                        int iJk4 = c0341n3.jk();
                        int iM1321i = c0341n3.m1321i();
                        int i26 = C0335k.f47723x2;
                        z2 = z7;
                        if (i24 == 1) {
                            i26 = C0335k.f47722qrj;
                        }
                        boolean zM1288k2 = m1288k(interfaceC7855toqKq2f, c0341n3, i26) | zImd;
                        C0263g c0263g3 = c0339g.f47785bap7;
                        i13 = size2;
                        interfaceC7855toq = interfaceC7855toqKq2f;
                        if (c0263g3 != null) {
                            c0263g3.f1421q++;
                        }
                        int iM1313a5 = c0341n3.m1313a();
                        int iJk5 = c0341n3.jk();
                        if (iM1313a5 != iM1313a4) {
                            c0341n3.m2t(iM1313a5);
                            if (z8 && c0341n3.uv6() > iMax) {
                                iMax = Math.max(iMax, c0341n3.uv6() + c0341n3.ki(C0343q.toq.RIGHT).f7l8());
                            }
                            zM1288k2 = true;
                        }
                        if (iJk5 != iJk4) {
                            c0341n3.pc(iJk5);
                            if (z9 && c0341n3.zurt() > iMax2) {
                                iMax2 = Math.max(iMax2, c0341n3.zurt() + c0341n3.ki(C0343q.toq.BOTTOM).f7l8());
                            }
                            zM1288k2 = true;
                        }
                        zImd = (!c0341n3.nmn5() || iM1321i == c0341n3.m1321i()) ? zM1288k2 : true;
                    }
                    i25++;
                    interfaceC7855toqKq2f = interfaceC7855toq;
                    z7 = z2;
                    size2 = i13;
                }
                boolean z10 = z7;
                int i27 = size2;
                InterfaceC7855toq interfaceC7855toq2 = interfaceC7855toqKq2f;
                if (!zImd) {
                    break;
                }
                i24++;
                zy(c0339g, "intermediate pass", i24, i21, i22);
                interfaceC7855toqKq2f = interfaceC7855toq2;
                z7 = z10;
                size2 = i27;
                i23 = 2;
                zImd = false;
            }
            i12 = i20;
        } else {
            i12 = iXm;
        }
        c0339g.xzl(i12);
        return 0L;
    }
}

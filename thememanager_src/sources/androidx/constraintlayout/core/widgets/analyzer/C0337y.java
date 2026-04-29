package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0340k;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.C0345y;
import androidx.constraintlayout.core.widgets.analyzer.toq;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.y */
/* JADX INFO: compiled from: Direct.java */
/* JADX INFO: loaded from: classes.dex */
public class C0337y {

    /* JADX INFO: renamed from: k */
    private static final boolean f2019k = false;

    /* JADX INFO: renamed from: q */
    private static final boolean f2021q = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f47728toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static toq.C0335k f47729zy = new toq.C0335k();

    /* JADX INFO: renamed from: n */
    private static int f2020n = 0;

    /* JADX INFO: renamed from: g */
    private static int f2018g = 0;

    private static void f7l8(int i2, C0341n c0341n, toq.InterfaceC7855toq interfaceC7855toq, C0341n c0341n2, boolean z2) {
        float fA9 = c0341n2.a9();
        int iM1334g = c0341n2.f47905ncyb.f2068g.m1334g() + c0341n2.f47905ncyb.f7l8();
        int iM1334g2 = c0341n2.f47903n5r1.f2068g.m1334g() - c0341n2.f47903n5r1.f7l8();
        if (iM1334g2 >= iM1334g) {
            int iM1313a = c0341n2.m1313a();
            if (c0341n2.a98o() != 8) {
                int i3 = c0341n2.f47906ni7;
                if (i3 == 2) {
                    iM1313a = (int) (c0341n2.a9() * 0.5f * (c0341n instanceof C0339g ? c0341n.m1313a() : c0341n.m1318f().m1313a()));
                } else if (i3 == 0) {
                    iM1313a = iM1334g2 - iM1334g;
                }
                iM1313a = Math.max(c0341n2.f47909o1t, iM1313a);
                int i4 = c0341n2.f47925wvg;
                if (i4 > 0) {
                    iM1313a = Math.min(i4, iM1313a);
                }
            }
            int i5 = iM1334g + ((int) ((fA9 * ((iM1334g2 - iM1334g) - iM1313a)) + 0.5f));
            c0341n2.jbh(i5, iM1313a + i5);
            toq(i2 + 1, c0341n2, interfaceC7855toq, z2);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m1292g(int i2, toq.InterfaceC7855toq interfaceC7855toq, C0341n c0341n, boolean z2) {
        float fA9 = c0341n.a9();
        int iM1334g = c0341n.f47905ncyb.f2068g.m1334g();
        int iM1334g2 = c0341n.f47903n5r1.f2068g.m1334g();
        int iF7l8 = c0341n.f47905ncyb.f7l8() + iM1334g;
        int iF7l82 = iM1334g2 - c0341n.f47903n5r1.f7l8();
        if (iM1334g == iM1334g2) {
            fA9 = 0.5f;
        } else {
            iM1334g = iF7l8;
            iM1334g2 = iF7l82;
        }
        int iM1313a = c0341n.m1313a();
        int i3 = (iM1334g2 - iM1334g) - iM1313a;
        if (iM1334g > iM1334g2) {
            i3 = (iM1334g - iM1334g2) - iM1313a;
        }
        int i4 = ((int) (i3 > 0 ? (fA9 * i3) + 0.5f : fA9 * i3)) + iM1334g;
        int i5 = i4 + iM1313a;
        if (iM1334g > iM1334g2) {
            i5 = i4 - iM1313a;
        }
        c0341n.jbh(i4, i5);
        toq(i2 + 1, c0341n, interfaceC7855toq, z2);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m1293k(int i2, C0341n c0341n) {
        C0341n.toq toqVar;
        C0341n.toq toqVar2;
        C0341n.toq toqVarGvn7 = c0341n.gvn7();
        C0341n.toq toqVarBf2 = c0341n.bf2();
        C0339g c0339g = c0341n.m1318f() != null ? (C0339g) c0341n.m1318f() : null;
        if (c0339g != null) {
            c0339g.gvn7();
            C0341n.toq toqVar3 = C0341n.toq.FIXED;
        }
        if (c0339g != null) {
            c0339g.bf2();
            C0341n.toq toqVar4 = C0341n.toq.FIXED;
        }
        C0341n.toq toqVar5 = C0341n.toq.FIXED;
        boolean z2 = toqVarGvn7 == toqVar5 || c0341n.fnq8() || toqVarGvn7 == C0341n.toq.WRAP_CONTENT || (toqVarGvn7 == (toqVar2 = C0341n.toq.MATCH_CONSTRAINT) && c0341n.f47906ni7 == 0 && c0341n.f47875ek5k == 0.0f && c0341n.lv5(0)) || (toqVarGvn7 == toqVar2 && c0341n.f47906ni7 == 1 && c0341n.bo(0, c0341n.m1313a()));
        boolean z3 = toqVarBf2 == toqVar5 || c0341n.qo() || toqVarBf2 == C0341n.toq.WRAP_CONTENT || (toqVarBf2 == (toqVar = C0341n.toq.MATCH_CONSTRAINT) && c0341n.f47881fu4 == 0 && c0341n.f47875ek5k == 0.0f && c0341n.lv5(1)) || (toqVarBf2 == toqVar && c0341n.f47881fu4 == 1 && c0341n.bo(1, c0341n.jk()));
        if (c0341n.f47875ek5k <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    private static void ld6(int i2, C0341n c0341n, toq.InterfaceC7855toq interfaceC7855toq) {
        C0343q c0343q;
        C0343q c0343q2;
        C0343q c0343q3;
        C0343q c0343q4;
        if (c0341n.g1()) {
            return;
        }
        f2018g++;
        if (!(c0341n instanceof C0339g) && c0341n.qkj8()) {
            int i3 = i2 + 1;
            if (m1293k(i3, c0341n)) {
                C0339g.mi1u(i3, c0341n, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
            }
        }
        C0343q c0343qKi = c0341n.ki(C0343q.toq.TOP);
        C0343q c0343qKi2 = c0341n.ki(C0343q.toq.BOTTOM);
        int iM1334g = c0343qKi.m1334g();
        int iM1334g2 = c0343qKi2.m1334g();
        if (c0343qKi.m1338n() != null && c0343qKi.kja0()) {
            Iterator<C0343q> it = c0343qKi.m1338n().iterator();
            while (it.hasNext()) {
                C0343q next = it.next();
                C0341n c0341n2 = next.f2071q;
                int i4 = i2 + 1;
                boolean zM1293k = m1293k(i4, c0341n2);
                if (c0341n2.qkj8() && zM1293k) {
                    C0339g.mi1u(i4, c0341n2, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
                }
                boolean z2 = (next == c0341n2.f2051l && (c0343q4 = c0341n2.f47887hyr.f2068g) != null && c0343q4.kja0()) || (next == c0341n2.f47887hyr && (c0343q3 = c0341n2.f2051l.f2068g) != null && c0343q3.kja0());
                C0341n.toq toqVarBf2 = c0341n2.bf2();
                C0341n.toq toqVar = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVarBf2 != toqVar || zM1293k) {
                    if (!c0341n2.qkj8()) {
                        C0343q c0343q5 = c0341n2.f2051l;
                        if (next == c0343q5 && c0341n2.f47887hyr.f2068g == null) {
                            int iF7l8 = c0343q5.f7l8() + iM1334g;
                            c0341n2.wx16(iF7l8, c0341n2.jk() + iF7l8);
                            ld6(i4, c0341n2, interfaceC7855toq);
                        } else {
                            C0343q c0343q6 = c0341n2.f47887hyr;
                            if (next == c0343q6 && c0343q5.f2068g == null) {
                                int iF7l82 = iM1334g - c0343q6.f7l8();
                                c0341n2.wx16(iF7l82 - c0341n2.jk(), iF7l82);
                                ld6(i4, c0341n2, interfaceC7855toq);
                            } else if (z2 && !c0341n2.mu()) {
                                m1298y(i4, interfaceC7855toq, c0341n2);
                            }
                        }
                    }
                } else if (c0341n2.bf2() == toqVar && c0341n2.f47891jk >= 0 && c0341n2.f47901mcp >= 0 && (c0341n2.a98o() == 8 || (c0341n2.f47881fu4 == 0 && c0341n2.wvg() == 0.0f))) {
                    if (!c0341n2.mu() && !c0341n2.vq() && z2 && !c0341n2.mu()) {
                        m1297s(i4, c0341n, interfaceC7855toq, c0341n2);
                    }
                }
            }
        }
        if (c0341n instanceof C0345y) {
            return;
        }
        if (c0343qKi2.m1338n() != null && c0343qKi2.kja0()) {
            Iterator<C0343q> it2 = c0343qKi2.m1338n().iterator();
            while (it2.hasNext()) {
                C0343q next2 = it2.next();
                C0341n c0341n3 = next2.f2071q;
                int i5 = i2 + 1;
                boolean zM1293k2 = m1293k(i5, c0341n3);
                if (c0341n3.qkj8() && zM1293k2) {
                    C0339g.mi1u(i5, c0341n3, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
                }
                boolean z3 = (next2 == c0341n3.f2051l && (c0343q2 = c0341n3.f47887hyr.f2068g) != null && c0343q2.kja0()) || (next2 == c0341n3.f47887hyr && (c0343q = c0341n3.f2051l.f2068g) != null && c0343q.kja0());
                C0341n.toq toqVarBf22 = c0341n3.bf2();
                C0341n.toq toqVar2 = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVarBf22 != toqVar2 || zM1293k2) {
                    if (!c0341n3.qkj8()) {
                        C0343q c0343q7 = c0341n3.f2051l;
                        if (next2 == c0343q7 && c0341n3.f47887hyr.f2068g == null) {
                            int iF7l83 = c0343q7.f7l8() + iM1334g2;
                            c0341n3.wx16(iF7l83, c0341n3.jk() + iF7l83);
                            ld6(i5, c0341n3, interfaceC7855toq);
                        } else {
                            C0343q c0343q8 = c0341n3.f47887hyr;
                            if (next2 == c0343q8 && c0343q7.f2068g == null) {
                                int iF7l84 = iM1334g2 - c0343q8.f7l8();
                                c0341n3.wx16(iF7l84 - c0341n3.jk(), iF7l84);
                                ld6(i5, c0341n3, interfaceC7855toq);
                            } else if (z3 && !c0341n3.mu()) {
                                m1298y(i5, interfaceC7855toq, c0341n3);
                            }
                        }
                    }
                } else if (c0341n3.bf2() == toqVar2 && c0341n3.f47891jk >= 0 && c0341n3.f47901mcp >= 0 && (c0341n3.a98o() == 8 || (c0341n3.f47881fu4 == 0 && c0341n3.wvg() == 0.0f))) {
                    if (!c0341n3.mu() && !c0341n3.vq() && z3 && !c0341n3.mu()) {
                        m1297s(i5, c0341n, interfaceC7855toq, c0341n3);
                    }
                }
            }
        }
        C0343q c0343qKi3 = c0341n.ki(C0343q.toq.BASELINE);
        if (c0343qKi3.m1338n() != null && c0343qKi3.kja0()) {
            int iM1334g3 = c0343qKi3.m1334g();
            for (C0343q c0343q9 : c0343qKi3.m1338n()) {
                C0341n c0341n4 = c0343q9.f2071q;
                int i6 = i2 + 1;
                boolean zM1293k3 = m1293k(i6, c0341n4);
                if (c0341n4.qkj8() && zM1293k3) {
                    C0339g.mi1u(i6, c0341n4, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
                }
                if (c0341n4.bf2() != C0341n.toq.MATCH_CONSTRAINT || zM1293k3) {
                    if (!c0341n4.qkj8() && c0343q9 == c0341n4.f2045f) {
                        c0341n4.vep5(c0343q9.f7l8() + iM1334g3);
                        ld6(i6, c0341n4, interfaceC7855toq);
                    }
                }
            }
        }
        c0341n.zsr0();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1294n(androidx.constraintlayout.core.widgets.C0339g r20, androidx.constraintlayout.core.C0296n r21, int r22, int r23, androidx.constraintlayout.core.widgets.zy r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0337y.m1294n(androidx.constraintlayout.core.widgets.g, androidx.constraintlayout.core.n, int, int, androidx.constraintlayout.core.widgets.zy, boolean, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: p */
    public static void m1295p(C0339g c0339g, toq.InterfaceC7855toq interfaceC7855toq) {
        C0341n.toq toqVarGvn7 = c0339g.gvn7();
        C0341n.toq toqVarBf2 = c0339g.bf2();
        f2020n = 0;
        f2018g = 0;
        c0339g.etdu();
        ArrayList<C0341n> arrayListBih = c0339g.bih();
        int size = arrayListBih.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListBih.get(i2).etdu();
        }
        boolean zXblq = c0339g.xblq();
        if (toqVarGvn7 == C0341n.toq.FIXED) {
            c0339g.jbh(0, c0339g.m1313a());
        } else {
            c0339g.yl(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0341n c0341n = arrayListBih.get(i3);
            if (c0341n instanceof C0345y) {
                C0345y c0345y = (C0345y) c0341n;
                if (c0345y.ec() == 1) {
                    if (c0345y.o5() != -1) {
                        c0345y.el(c0345y.o5());
                    } else if (c0345y.rp() != -1 && c0339g.fnq8()) {
                        c0345y.el(c0339g.m1313a() - c0345y.rp());
                    } else if (c0339g.fnq8()) {
                        c0345y.el((int) ((c0345y.l05() * c0339g.m1313a()) + 0.5f));
                    }
                    z2 = true;
                }
            } else if ((c0341n instanceof C0340k) && ((C0340k) c0341n).cyoe() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C0341n c0341n2 = arrayListBih.get(i4);
                if (c0341n2 instanceof C0345y) {
                    C0345y c0345y2 = (C0345y) c0341n2;
                    if (c0345y2.ec() == 1) {
                        toq(0, c0345y2, interfaceC7855toq, zXblq);
                    }
                }
            }
        }
        toq(0, c0339g, interfaceC7855toq, zXblq);
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                C0341n c0341n3 = arrayListBih.get(i5);
                if (c0341n3 instanceof C0340k) {
                    C0340k c0340k = (C0340k) c0341n3;
                    if (c0340k.cyoe() == 0) {
                        m1296q(0, c0340k, interfaceC7855toq, 0, zXblq);
                    }
                }
            }
        }
        if (toqVarBf2 == C0341n.toq.FIXED) {
            c0339g.wx16(0, c0339g.jk());
        } else {
            c0339g.uc(0);
        }
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            C0341n c0341n4 = arrayListBih.get(i6);
            if (c0341n4 instanceof C0345y) {
                C0345y c0345y3 = (C0345y) c0341n4;
                if (c0345y3.ec() == 0) {
                    if (c0345y3.o5() != -1) {
                        c0345y3.el(c0345y3.o5());
                    } else if (c0345y3.rp() != -1 && c0339g.qo()) {
                        c0345y3.el(c0339g.jk() - c0345y3.rp());
                    } else if (c0339g.qo()) {
                        c0345y3.el((int) ((c0345y3.l05() * c0339g.jk()) + 0.5f));
                    }
                    z5 = true;
                }
            } else if ((c0341n4 instanceof C0340k) && ((C0340k) c0341n4).cyoe() == 1) {
                z6 = true;
            }
        }
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                C0341n c0341n5 = arrayListBih.get(i7);
                if (c0341n5 instanceof C0345y) {
                    C0345y c0345y4 = (C0345y) c0341n5;
                    if (c0345y4.ec() == 0) {
                        ld6(1, c0345y4, interfaceC7855toq);
                    }
                }
            }
        }
        ld6(0, c0339g, interfaceC7855toq);
        if (z6) {
            for (int i8 = 0; i8 < size; i8++) {
                C0341n c0341n6 = arrayListBih.get(i8);
                if (c0341n6 instanceof C0340k) {
                    C0340k c0340k2 = (C0340k) c0341n6;
                    if (c0340k2.cyoe() == 1) {
                        m1296q(0, c0340k2, interfaceC7855toq, 1, zXblq);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            C0341n c0341n7 = arrayListBih.get(i9);
            if (c0341n7.qkj8() && m1293k(0, c0341n7)) {
                C0339g.mi1u(0, c0341n7, interfaceC7855toq, f47729zy, toq.C0335k.f47721ld6);
                if (!(c0341n7 instanceof C0345y)) {
                    toq(0, c0341n7, interfaceC7855toq, zXblq);
                    ld6(0, c0341n7, interfaceC7855toq);
                } else if (((C0345y) c0341n7).ec() == 0) {
                    ld6(0, c0341n7, interfaceC7855toq);
                } else {
                    toq(0, c0341n7, interfaceC7855toq, zXblq);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m1296q(int i2, C0340k c0340k, toq.InterfaceC7855toq interfaceC7855toq, int i3, boolean z2) {
        if (c0340k.ec()) {
            if (i3 == 0) {
                toq(i2 + 1, c0340k, interfaceC7855toq, z2);
            } else {
                ld6(i2 + 1, c0340k, interfaceC7855toq);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m1297s(int i2, C0341n c0341n, toq.InterfaceC7855toq interfaceC7855toq, C0341n c0341n2) {
        float fYz = c0341n2.yz();
        int iM1334g = c0341n2.f2051l.f2068g.m1334g() + c0341n2.f2051l.f7l8();
        int iM1334g2 = c0341n2.f47887hyr.f2068g.m1334g() - c0341n2.f47887hyr.f7l8();
        if (iM1334g2 >= iM1334g) {
            int iJk = c0341n2.jk();
            if (c0341n2.a98o() != 8) {
                int i3 = c0341n2.f47881fu4;
                if (i3 == 2) {
                    iJk = (int) (fYz * 0.5f * (c0341n instanceof C0339g ? c0341n.jk() : c0341n.m1318f().jk()));
                } else if (i3 == 0) {
                    iJk = iM1334g2 - iM1334g;
                }
                iJk = Math.max(c0341n2.f47901mcp, iJk);
                int i4 = c0341n2.f47891jk;
                if (i4 > 0) {
                    iJk = Math.min(i4, iJk);
                }
            }
            int i5 = iM1334g + ((int) ((fYz * ((iM1334g2 - iM1334g) - iJk)) + 0.5f));
            c0341n2.wx16(i5, iJk + i5);
            ld6(i2 + 1, c0341n2, interfaceC7855toq);
        }
    }

    private static void toq(int i2, C0341n c0341n, toq.InterfaceC7855toq interfaceC7855toq, boolean z2) {
        C0343q c0343q;
        C0343q c0343q2;
        C0343q c0343q3;
        C0343q c0343q4;
        if (c0341n.xwq3()) {
            return;
        }
        boolean z3 = true;
        f2020n++;
        if (!(c0341n instanceof C0339g) && c0341n.qkj8()) {
            int i3 = i2 + 1;
            if (m1293k(i3, c0341n)) {
                C0339g.mi1u(i3, c0341n, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
            }
        }
        C0343q c0343qKi = c0341n.ki(C0343q.toq.LEFT);
        C0343q c0343qKi2 = c0341n.ki(C0343q.toq.RIGHT);
        int iM1334g = c0343qKi.m1334g();
        int iM1334g2 = c0343qKi2.m1334g();
        if (c0343qKi.m1338n() != null && c0343qKi.kja0()) {
            Iterator<C0343q> it = c0343qKi.m1338n().iterator();
            while (it.hasNext()) {
                C0343q next = it.next();
                C0341n c0341n2 = next.f2071q;
                int i4 = i2 + 1;
                boolean zM1293k = m1293k(i4, c0341n2);
                if (c0341n2.qkj8() && zM1293k) {
                    C0339g.mi1u(i4, c0341n2, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
                }
                boolean z5 = ((next == c0341n2.f47905ncyb && (c0343q4 = c0341n2.f47903n5r1.f2068g) != null && c0343q4.kja0()) || (next == c0341n2.f47903n5r1 && (c0343q3 = c0341n2.f47905ncyb.f2068g) != null && c0343q3.kja0())) ? z3 : false;
                C0341n.toq toqVarGvn7 = c0341n2.gvn7();
                C0341n.toq toqVar = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVarGvn7 != toqVar || zM1293k) {
                    if (!c0341n2.qkj8()) {
                        C0343q c0343q5 = c0341n2.f47905ncyb;
                        if (next == c0343q5 && c0341n2.f47903n5r1.f2068g == null) {
                            int iF7l8 = c0343q5.f7l8() + iM1334g;
                            c0341n2.jbh(iF7l8, c0341n2.m1313a() + iF7l8);
                            toq(i4, c0341n2, interfaceC7855toq, z2);
                        } else {
                            C0343q c0343q6 = c0341n2.f47903n5r1;
                            if (next == c0343q6 && c0343q5.f2068g == null) {
                                int iF7l82 = iM1334g - c0343q6.f7l8();
                                c0341n2.jbh(iF7l82 - c0341n2.m1313a(), iF7l82);
                                toq(i4, c0341n2, interfaceC7855toq, z2);
                            } else if (z5 && !c0341n2.ikck()) {
                                m1292g(i4, interfaceC7855toq, c0341n2, z2);
                            }
                        }
                    }
                } else if (c0341n2.gvn7() == toqVar && c0341n2.f47925wvg >= 0 && c0341n2.f47909o1t >= 0 && ((c0341n2.a98o() == 8 || (c0341n2.f47906ni7 == 0 && c0341n2.wvg() == 0.0f)) && !c0341n2.ikck() && !c0341n2.vq() && z5 && !c0341n2.ikck())) {
                    f7l8(i4, c0341n, interfaceC7855toq, c0341n2, z2);
                }
                z3 = true;
            }
        }
        if (c0341n instanceof C0345y) {
            return;
        }
        if (c0343qKi2.m1338n() != null && c0343qKi2.kja0()) {
            Iterator<C0343q> it2 = c0343qKi2.m1338n().iterator();
            while (it2.hasNext()) {
                C0343q next2 = it2.next();
                C0341n c0341n3 = next2.f2071q;
                int i5 = i2 + 1;
                boolean zM1293k2 = m1293k(i5, c0341n3);
                if (c0341n3.qkj8() && zM1293k2) {
                    C0339g.mi1u(i5, c0341n3, interfaceC7855toq, new toq.C0335k(), toq.C0335k.f47721ld6);
                }
                boolean z6 = (next2 == c0341n3.f47905ncyb && (c0343q2 = c0341n3.f47903n5r1.f2068g) != null && c0343q2.kja0()) || (next2 == c0341n3.f47903n5r1 && (c0343q = c0341n3.f47905ncyb.f2068g) != null && c0343q.kja0());
                C0341n.toq toqVarGvn72 = c0341n3.gvn7();
                C0341n.toq toqVar2 = C0341n.toq.MATCH_CONSTRAINT;
                if (toqVarGvn72 != toqVar2 || zM1293k2) {
                    if (!c0341n3.qkj8()) {
                        C0343q c0343q7 = c0341n3.f47905ncyb;
                        if (next2 == c0343q7 && c0341n3.f47903n5r1.f2068g == null) {
                            int iF7l83 = c0343q7.f7l8() + iM1334g2;
                            c0341n3.jbh(iF7l83, c0341n3.m1313a() + iF7l83);
                            toq(i5, c0341n3, interfaceC7855toq, z2);
                        } else {
                            C0343q c0343q8 = c0341n3.f47903n5r1;
                            if (next2 == c0343q8 && c0343q7.f2068g == null) {
                                int iF7l84 = iM1334g2 - c0343q8.f7l8();
                                c0341n3.jbh(iF7l84 - c0341n3.m1313a(), iF7l84);
                                toq(i5, c0341n3, interfaceC7855toq, z2);
                            } else if (z6 && !c0341n3.ikck()) {
                                m1292g(i5, interfaceC7855toq, c0341n3, z2);
                            }
                        }
                    }
                } else if (c0341n3.gvn7() == toqVar2 && c0341n3.f47925wvg >= 0 && c0341n3.f47909o1t >= 0 && (c0341n3.a98o() == 8 || (c0341n3.f47906ni7 == 0 && c0341n3.wvg() == 0.0f))) {
                    if (!c0341n3.ikck() && !c0341n3.vq() && z6 && !c0341n3.ikck()) {
                        f7l8(i5, c0341n, interfaceC7855toq, c0341n3, z2);
                    }
                }
            }
        }
        c0341n.gbni();
    }

    /* JADX INFO: renamed from: y */
    private static void m1298y(int i2, toq.InterfaceC7855toq interfaceC7855toq, C0341n c0341n) {
        float fYz = c0341n.yz();
        int iM1334g = c0341n.f2051l.f2068g.m1334g();
        int iM1334g2 = c0341n.f47887hyr.f2068g.m1334g();
        int iF7l8 = c0341n.f2051l.f7l8() + iM1334g;
        int iF7l82 = iM1334g2 - c0341n.f47887hyr.f7l8();
        if (iM1334g == iM1334g2) {
            fYz = 0.5f;
        } else {
            iM1334g = iF7l8;
            iM1334g2 = iF7l82;
        }
        int iJk = c0341n.jk();
        int i3 = (iM1334g2 - iM1334g) - iJk;
        if (iM1334g > iM1334g2) {
            i3 = (iM1334g - iM1334g2) - iJk;
        }
        int i4 = (int) (i3 > 0 ? (fYz * i3) + 0.5f : fYz * i3);
        int i5 = iM1334g + i4;
        int i6 = i5 + iJk;
        if (iM1334g > iM1334g2) {
            i5 = iM1334g - i4;
            i6 = i5 - iJk;
        }
        c0341n.wx16(i5, i6);
        ld6(i2 + 1, c0341n, interfaceC7855toq);
    }

    public static String zy(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append("+-(" + i2 + ") ");
        return sb.toString();
    }
}

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.core.widgets.C0345y;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.s */
/* JADX INFO: compiled from: Grouping.java */
/* JADX INFO: loaded from: classes.dex */
public class C0334s {

    /* JADX INFO: renamed from: k */
    private static final boolean f2002k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f47716toq = false;

    /* JADX INFO: renamed from: k */
    public static kja0 m1286k(C0341n c0341n, int i2, ArrayList<kja0> arrayList, kja0 kja0Var) {
        int iBih;
        int i3 = i2 == 0 ? c0341n.f47915r8s8 : c0341n.f47900m4;
        if (i3 != -1 && (kja0Var == null || i3 != kja0Var.f47702toq)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                kja0 kja0Var2 = arrayList.get(i4);
                if (kja0Var2.m1266g() == i3) {
                    if (kja0Var != null) {
                        kja0Var.qrj(i2, kja0Var2);
                        arrayList.remove(kja0Var);
                    }
                    kja0Var = kja0Var2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return kja0Var;
        }
        if (kja0Var == null) {
            if ((c0341n instanceof C0342p) && (iBih = ((C0342p) c0341n).bih(i2)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    kja0 kja0Var3 = arrayList.get(i5);
                    if (kja0Var3.m1266g() == iBih) {
                        kja0Var = kja0Var3;
                        break;
                    }
                    i5++;
                }
            }
            if (kja0Var == null) {
                kja0Var = new kja0(i2);
            }
            arrayList.add(kja0Var);
        }
        if (kja0Var.m1268k(c0341n)) {
            if (c0341n instanceof C0345y) {
                C0345y c0345y = (C0345y) c0341n;
                c0345y.bih().m1340q(c0345y.ec() == 0 ? 1 : 0, arrayList, kja0Var);
            }
            if (i2 == 0) {
                c0341n.f47915r8s8 = kja0Var.m1266g();
                c0341n.f47905ncyb.m1340q(i2, arrayList, kja0Var);
                c0341n.f47903n5r1.m1340q(i2, arrayList, kja0Var);
            } else {
                c0341n.f47900m4 = kja0Var.m1266g();
                c0341n.f2051l.m1340q(i2, arrayList, kja0Var);
                c0341n.f2045f.m1340q(i2, arrayList, kja0Var);
                c0341n.f47887hyr.m1340q(i2, arrayList, kja0Var);
            }
            c0341n.f47920uv6.m1340q(i2, arrayList, kja0Var);
        }
        return kja0Var;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1287q(C0341n.toq toqVar, C0341n.toq toqVar2, C0341n.toq toqVar3, C0341n.toq toqVar4) {
        C0341n.toq toqVar5;
        C0341n.toq toqVar6;
        C0341n.toq toqVar7 = C0341n.toq.FIXED;
        return (toqVar3 == toqVar7 || toqVar3 == (toqVar6 = C0341n.toq.WRAP_CONTENT) || (toqVar3 == C0341n.toq.MATCH_PARENT && toqVar != toqVar6)) || (toqVar4 == toqVar7 || toqVar4 == (toqVar5 = C0341n.toq.WRAP_CONTENT) || (toqVar4 == C0341n.toq.MATCH_PARENT && toqVar2 != toqVar5));
    }

    private static kja0 toq(ArrayList<kja0> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            kja0 kja0Var = arrayList.get(i3);
            if (i2 == kja0Var.f47702toq) {
                return kja0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zy(androidx.constraintlayout.core.widgets.C0339g r16, androidx.constraintlayout.core.widgets.analyzer.toq.InterfaceC7855toq r17) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0334s.zy(androidx.constraintlayout.core.widgets.g, androidx.constraintlayout.core.widgets.analyzer.toq$toq):boolean");
    }
}

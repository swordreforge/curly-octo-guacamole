package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.gvn7;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64720f7l8 = 47;

    /* JADX INFO: renamed from: g */
    private static final int f20460g = 49;

    /* JADX INFO: renamed from: k */
    private static final String f20461k = "CeaUtil";

    /* JADX INFO: renamed from: n */
    private static final int f20462n = 181;

    /* JADX INFO: renamed from: q */
    private static final int f20463q = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f64721toq = 1195456820;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64722zy = 3;

    private zy() {
    }

    /* JADX INFO: renamed from: k */
    public static void m12058k(long j2, gvn7 gvn7Var, InterfaceC3401t[] interfaceC3401tArr) {
        while (true) {
            if (gvn7Var.m13594k() <= 1) {
                return;
            }
            int iZy = zy(gvn7Var);
            int iZy2 = zy(gvn7Var);
            int iM13596n = gvn7Var.m13596n() + iZy2;
            if (iZy2 == -1 || iZy2 > gvn7Var.m13594k()) {
                com.google.android.exoplayer2.util.ni7.qrj(f20461k, "Skipping remainder of malformed SEI NAL unit.");
                iM13596n = gvn7Var.m13591g();
            } else if (iZy == 4 && iZy2 >= 8) {
                int iJp0y = gvn7Var.jp0y();
                int iLvui = gvn7Var.lvui();
                int iKja0 = iLvui == 49 ? gvn7Var.kja0() : 0;
                int iJp0y2 = gvn7Var.jp0y();
                if (iLvui == 47) {
                    gvn7Var.hyr(1);
                }
                boolean z2 = iJp0y == f20462n && (iLvui == 49 || iLvui == 47) && iJp0y2 == 3;
                if (iLvui == 49) {
                    z2 &= iKja0 == 1195456820;
                }
                if (z2) {
                    toq(j2, gvn7Var, interfaceC3401tArr);
                }
            }
            gvn7Var.n5r1(iM13596n);
        }
    }

    public static void toq(long j2, gvn7 gvn7Var, InterfaceC3401t[] interfaceC3401tArr) {
        int iJp0y = gvn7Var.jp0y();
        if ((iJp0y & 64) != 0) {
            gvn7Var.hyr(1);
            int i2 = (iJp0y & 31) * 3;
            int iM13596n = gvn7Var.m13596n();
            for (InterfaceC3401t interfaceC3401t : interfaceC3401tArr) {
                gvn7Var.n5r1(iM13596n);
                interfaceC3401t.zy(gvn7Var, i2);
                if (j2 != C3548p.f65257toq) {
                    interfaceC3401t.mo11930n(j2, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zy(gvn7 gvn7Var) {
        int i2 = 0;
        while (gvn7Var.m13594k() != 0) {
            int iJp0y = gvn7Var.jp0y();
            i2 += iJp0y;
            if (iJp0y != 255) {
                return i2;
            }
        }
        return -1;
    }
}

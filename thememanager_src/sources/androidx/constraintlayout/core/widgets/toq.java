package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0296n;
import java.util.ArrayList;

/* JADX INFO: compiled from: Chain.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final boolean f2078k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f47958toq = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[PHI: r8 r16
      0x0044: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[PHI: r8 r16
      0x0046: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r38v0, types: [androidx.constraintlayout.core.n] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.constraintlayout.core.s] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.n] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m1349k(androidx.constraintlayout.core.widgets.C0339g r37, androidx.constraintlayout.core.C0296n r38, int r39, int r40, androidx.constraintlayout.core.widgets.zy r41) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.toq.m1349k(androidx.constraintlayout.core.widgets.g, androidx.constraintlayout.core.n, int, int, androidx.constraintlayout.core.widgets.zy):void");
    }

    public static void toq(C0339g c0339g, C0296n c0296n, ArrayList<C0341n> arrayList, int i2) {
        zy[] zyVarArr;
        int i3;
        int i4;
        if (i2 == 0) {
            i4 = c0339g.f47809vy;
            zyVarArr = c0339g.f47791gcp;
            i3 = 0;
        } else {
            int i5 = c0339g.f47782a5id;
            zyVarArr = c0339g.f47796lw;
            i3 = 2;
            i4 = i5;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            zy zyVar = zyVarArr[i6];
            zyVar.m1351k();
            if (arrayList == null || arrayList.contains(zyVar.f2083k)) {
                m1349k(c0339g, c0296n, i2, i3, zyVar);
            }
        }
    }
}

package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: compiled from: SidePropagation.java */
/* JADX INFO: loaded from: classes.dex */
public class jp0y extends AbstractC1249u {

    /* JADX INFO: renamed from: q */
    private float f6682q = 3.0f;

    /* JADX INFO: renamed from: n */
    private int f6681n = 80;

    /* JADX INFO: renamed from: s */
    private int m5362s(ViewGroup viewGroup) {
        int i2 = this.f6681n;
        return (i2 == 3 || i2 == 5 || i2 == 8388611 || i2 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m5363y(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f6681n
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L19
            int r7 = androidx.core.view.C0683f.m3159e(r7)
            if (r7 != r4) goto L12
            goto L13
        L12:
            r4 = r3
        L13:
            if (r4 == 0) goto L17
        L15:
            r0 = r1
            goto L29
        L17:
            r0 = r2
            goto L29
        L19:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L29
            int r7 = androidx.core.view.C0683f.m3159e(r7)
            if (r7 != r4) goto L25
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L15
            goto L17
        L29:
            if (r0 == r2) goto L51
            if (r0 == r1) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.jp0y.m5363y(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    public void ld6(int i2) {
        this.f6681n = i2;
    }

    /* JADX INFO: renamed from: p */
    public void m5364p(float f2) {
        if (f2 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f6682q = f2;
    }

    @Override // androidx.transition.AbstractC1244r
    public long zy(ViewGroup viewGroup, oc ocVar, C1225l c1225l, C1225l c1225l2) {
        int i2;
        int iCenterX;
        int iCenterY;
        C1225l c1225l3 = c1225l;
        if (c1225l3 == null && c1225l2 == null) {
            return 0L;
        }
        Rect rectM5413r = ocVar.m5413r();
        if (c1225l2 == null || m5432n(c1225l3) == 0) {
            i2 = -1;
        } else {
            c1225l3 = c1225l2;
            i2 = 1;
        }
        int iM5431g = m5431g(c1225l3);
        int iF7l8 = f7l8(c1225l3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (rectM5413r != null) {
            iCenterX = rectM5413r.centerX();
            iCenterY = rectM5413r.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fM5363y = m5363y(viewGroup, iM5431g, iF7l8, iCenterX, iCenterY, iRound, iRound2, width, height) / m5362s(viewGroup);
        long jLvui = ocVar.lvui();
        if (jLvui < 0) {
            jLvui = 300;
        }
        return Math.round(((jLvui * ((long) i2)) / this.f6682q) * fM5363y);
    }
}

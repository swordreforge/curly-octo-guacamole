package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: compiled from: CircularPropagation.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends AbstractC1249u {

    /* JADX INFO: renamed from: q */
    private float f6800q = 3.0f;

    /* JADX INFO: renamed from: y */
    private static float m5437y(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        return (float) Math.sqrt((f6 * f6) + (f7 * f7));
    }

    /* JADX INFO: renamed from: s */
    public void m5438s(float f2) {
        if (f2 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f6800q = f2;
    }

    @Override // androidx.transition.AbstractC1244r
    public long zy(ViewGroup viewGroup, oc ocVar, C1225l c1225l, C1225l c1225l2) {
        int i2;
        int iRound;
        int iCenterX;
        if (c1225l == null && c1225l2 == null) {
            return 0L;
        }
        if (c1225l2 == null || m5432n(c1225l) == 0) {
            i2 = -1;
        } else {
            c1225l = c1225l2;
            i2 = 1;
        }
        int iM5431g = m5431g(c1225l);
        int iF7l8 = f7l8(c1225l);
        Rect rectM5413r = ocVar.m5413r();
        if (rectM5413r != null) {
            iCenterX = rectM5413r.centerX();
            iRound = rectM5413r.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fM5437y = m5437y(iM5431g, iF7l8, iCenterX, iRound) / m5437y(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jLvui = ocVar.lvui();
        if (jLvui < 0) {
            jLvui = 300;
        }
        return Math.round(((jLvui * ((long) i2)) / this.f6800q) * fM5437y);
    }
}

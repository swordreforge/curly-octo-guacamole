package androidx.transition;

import android.view.View;

/* JADX INFO: renamed from: androidx.transition.u */
/* JADX INFO: compiled from: VisibilityPropagation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1249u extends AbstractC1244r {

    /* JADX INFO: renamed from: k */
    private static final String f6795k = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f53538toq = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String[] f53539zy = {f6795k, f53538toq};

    /* JADX INFO: renamed from: q */
    private static int m5430q(C1225l c1225l, int i2) {
        int[] iArr;
        if (c1225l == null || (iArr = (int[]) c1225l.f6686k.get(f53538toq)) == null) {
            return -1;
        }
        return iArr[i2];
    }

    public int f7l8(C1225l c1225l) {
        return m5430q(c1225l, 1);
    }

    /* JADX INFO: renamed from: g */
    public int m5431g(C1225l c1225l) {
        return m5430q(c1225l, 0);
    }

    @Override // androidx.transition.AbstractC1244r
    /* JADX INFO: renamed from: k */
    public void mo5418k(C1225l c1225l) {
        View view = c1225l.f53502toq;
        Integer numValueOf = (Integer) c1225l.f6686k.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        c1225l.f6686k.put(f6795k, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        c1225l.f6686k.put(f53538toq, iArr);
    }

    /* JADX INFO: renamed from: n */
    public int m5432n(C1225l c1225l) {
        Integer num;
        if (c1225l == null || (num = (Integer) c1225l.f6686k.get(f6795k)) == null) {
            return 8;
        }
        return num.intValue();
    }

    @Override // androidx.transition.AbstractC1244r
    public String[] toq() {
        return f53539zy;
    }
}

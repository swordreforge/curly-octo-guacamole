package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0368g;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0395k;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q */
/* JADX INFO: compiled from: ViewSpline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0352q extends androidx.constraintlayout.core.motion.utils.kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f48012f7l8 = "ViewSpline";

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$f7l8 */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class f7l8 extends AbstractC0352q {

        /* JADX INFO: renamed from: y */
        boolean f2179y = false;

        f7l8() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m1030k(t2));
                return;
            }
            if (this.f2179y) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f2179y = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m1030k(t2)));
                } catch (IllegalAccessException e2) {
                    Log.e(AbstractC0352q.f48012f7l8, "unable to setProgress", e2);
                } catch (InvocationTargetException e3) {
                    Log.e(AbstractC0352q.f48012f7l8, "unable to setProgress", e3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$g */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class g extends AbstractC0352q {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setPivotY(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$k */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class k extends AbstractC0352q {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setAlpha(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$kja0 */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class kja0 extends AbstractC0352q {
        kja0() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setTranslationZ(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$ld6 */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class ld6 extends AbstractC0352q {
        ld6() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setScaleX(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$n */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class n extends AbstractC0352q {
        n() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setPivotX(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$n7h */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class n7h extends AbstractC0352q {
        n7h() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setTranslationY(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$p */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class p extends AbstractC0352q {
        p() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setRotationY(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$q */
    /* JADX INFO: compiled from: ViewSpline.java */
    public static class q extends AbstractC0352q {
        public void n7h(View view, float t2, double dx, double dy) {
            view.setRotation(m1030k(t2) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$qrj */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class qrj extends AbstractC0352q {
        qrj() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setTranslationX(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$s */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class s extends AbstractC0352q {
        s() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setRotationX(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$toq */
    /* JADX INFO: compiled from: ViewSpline.java */
    public static class toq extends AbstractC0352q {

        /* JADX INFO: renamed from: p */
        float[] f2180p;

        /* JADX INFO: renamed from: s */
        SparseArray<C0395k> f2181s;

        /* JADX INFO: renamed from: y */
        String f2182y;

        public toq(String attribute, SparseArray<C0395k> attrList) {
            this.f2182y = attribute.split(",")[1];
            this.f2181s = attrList;
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        public void f7l8(int position, float value) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void n7h(int position, C0395k value) {
            this.f2181s.append(position, value);
        }

        @Override // androidx.constraintlayout.core.motion.utils.kja0
        /* JADX INFO: renamed from: p */
        public void mo1031p(int curveType) {
            int size = this.f2181s.size();
            int iM1637h = this.f2181s.valueAt(0).m1637h();
            double[] dArr = new double[size];
            this.f2180p = new float[iM1637h];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM1637h);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f2181s.keyAt(i2);
                C0395k c0395kValueAt = this.f2181s.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                c0395kValueAt.x2(this.f2180p);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f2180p.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.f1615k = androidx.constraintlayout.core.motion.utils.toq.m1067k(curveType, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            this.f1615k.mo1017n(t2, this.f2180p);
            C0350k.toq(this.f2181s.valueAt(0), view, this.f2180p);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$x2 */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class x2 extends AbstractC0352q {
        x2() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setScaleY(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$y */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class y extends AbstractC0352q {
        y() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setRotation(m1030k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.q$zy */
    /* JADX INFO: compiled from: ViewSpline.java */
    static class zy extends AbstractC0352q {
        zy() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0352q
        public void qrj(View view, float t2) {
            view.setElevation(m1030k(t2));
        }
    }

    public static AbstractC0352q ld6(String str, SparseArray<C0395k> attrList) {
        return new toq(str, attrList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AbstractC0352q x2(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b2 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b2 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b2 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b2 = 7;
                }
                break;
            case -797520672:
                if (str.equals(AbstractC0368g.f2234i)) {
                    b2 = 8;
                }
                break;
            case -760884510:
                if (str.equals(AbstractC0368g.f48080x2)) {
                    b2 = 9;
                }
                break;
            case -760884509:
                if (str.equals(AbstractC0368g.f48077qrj)) {
                    b2 = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
        }
        switch (b2) {
        }
        return new k();
    }

    public abstract void qrj(View view, float t2);
}

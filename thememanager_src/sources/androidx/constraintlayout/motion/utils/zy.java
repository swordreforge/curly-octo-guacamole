package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.AbstractC0287y;
import androidx.constraintlayout.motion.widget.AbstractC0368g;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0395k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy extends AbstractC0287y {

    /* JADX INFO: renamed from: s */
    private static final String f2184s = "ViewOscillator";

    /* JADX INFO: compiled from: ViewOscillator.java */
    static class f7l8 extends zy {
        f7l8() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setRotationX(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$g */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C0353g extends zy {
        C0353g() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setRotation(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$k */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C0354k extends zy {
        C0354k() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setAlpha(m1074k(t2));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    static class ld6 extends zy {
        ld6() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setTranslationX(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$n */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C0355n extends zy {

        /* JADX INFO: renamed from: p */
        boolean f2185p = false;

        C0355n() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m1074k(t2));
                return;
            }
            if (this.f2185p) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f2185p = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m1074k(t2)));
                } catch (IllegalAccessException e2) {
                    Log.e(zy.f2184s, "unable to setProgress", e2);
                } catch (InvocationTargetException e3) {
                    Log.e(zy.f2184s, "unable to setProgress", e3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$p */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C0356p extends zy {
        C0356p() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setScaleY(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$q */
    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class C0357q extends zy {
        public void n7h(View view, float t2, double dx, double dy) {
            view.setRotation(m1074k(t2) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    static class qrj extends zy {
        qrj() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setTranslationZ(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$s */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C0358s extends zy {
        C0358s() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setScaleX(m1074k(t2));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    static class toq extends zy {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        protected C0395k f48015ld6;

        /* JADX INFO: renamed from: p */
        float[] f2186p = new float[1];

        toq() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0287y
        /* JADX INFO: renamed from: n */
        protected void mo1075n(Object custom) {
            this.f48015ld6 = (C0395k) custom;
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            this.f2186p[0] = m1074k(t2);
            C0350k.toq(this.f48015ld6, view, this.f2186p);
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    static class x2 extends zy {
        x2() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setTranslationY(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$y */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C0359y extends zy {
        C0359y() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setRotationY(m1074k(t2));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewOscillator.java */
    static class C7856zy extends zy {
        C7856zy() {
        }

        @Override // androidx.constraintlayout.motion.utils.zy
        public void qrj(View view, float t2) {
            view.setElevation(m1074k(t2));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zy x2(String str) {
        if (str.startsWith("CUSTOM")) {
            return new toq();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b2 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
        }
        switch (b2) {
            case 0:
                return new f7l8();
            case 1:
                return new C0359y();
            case 2:
                return new ld6();
            case 3:
                return new x2();
            case 4:
                return new qrj();
            case 5:
                return new C0355n();
            case 6:
                return new C0358s();
            case 7:
                return new C0356p();
            case 8:
                return new C0354k();
            case 9:
                return new C0353g();
            case 10:
                return new C7856zy();
            case 11:
                return new C0357q();
            case 12:
                return new C0354k();
            case 13:
                return new C0354k();
            default:
                return null;
        }
    }

    public abstract void qrj(View view, float t2);
}

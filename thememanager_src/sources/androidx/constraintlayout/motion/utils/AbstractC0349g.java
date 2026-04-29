package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.AbstractC0277i;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0395k;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g */
/* JADX INFO: compiled from: ViewTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0349g extends AbstractC0277i {

    /* JADX INFO: renamed from: h */
    private static final String f2172h = "ViewTimeCycle";

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$f7l8 */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class f7l8 extends AbstractC0349g {
        f7l8() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setRotationX(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$g */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class g extends AbstractC0349g {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setRotation(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$k */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class k extends AbstractC0349g {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setAlpha(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$ld6 */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class ld6 extends AbstractC0349g {
        ld6() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setTranslationX(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$n */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class n extends AbstractC0349g {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        boolean f48005cdj = false;

        n() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(f7l8(t2, time, view, cache));
            } else {
                if (this.f48005cdj) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f48005cdj = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(f7l8(t2, time, view, cache)));
                    } catch (IllegalAccessException e2) {
                        Log.e(AbstractC0349g.f2172h, "unable to setProgress", e2);
                    } catch (InvocationTargetException e3) {
                        Log.e(AbstractC0349g.f2172h, "unable to setProgress", e3);
                    }
                }
            }
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$p */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class p extends AbstractC0349g {
        p() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setScaleY(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$q */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class q extends AbstractC0349g {
        public boolean ld6(View view, androidx.constraintlayout.core.motion.utils.f7l8 cache, float t2, long time, double dx, double dy) {
            view.setRotation(f7l8(t2, time, view, cache) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
            return this.f1594y;
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$qrj */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class qrj extends AbstractC0349g {
        qrj() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setTranslationZ(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$s */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class s extends AbstractC0349g {
        s() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setScaleX(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$toq */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class toq extends AbstractC0349g {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        String f48006cdj;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        float[] f48007fn3e;

        /* JADX INFO: renamed from: i */
        float[] f2173i;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        SparseArray<C0395k> f48008ki;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        SparseArray<float[]> f48009t8r = new SparseArray<>();

        public toq(String attribute, SparseArray<C0395k> attrList) {
            this.f48006cdj = attribute.split(",")[1];
            this.f48008ki = attrList;
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0277i
        /* JADX INFO: renamed from: g */
        public void mo1009g(int curveType) {
            int size = this.f48008ki.size();
            int iM1637h = this.f48008ki.valueAt(0).m1637h();
            double[] dArr = new double[size];
            int i2 = iM1637h + 2;
            this.f2173i = new float[i2];
            this.f48007fn3e = new float[iM1637h];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f48008ki.keyAt(i3);
                C0395k c0395kValueAt = this.f48008ki.valueAt(i3);
                float[] fArrValueAt = this.f48009t8r.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                c0395kValueAt.x2(this.f2173i);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f2173i.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iM1637h] = fArrValueAt[0];
                dArr3[iM1637h + 1] = fArrValueAt[1];
            }
            this.f1589k = androidx.constraintlayout.core.motion.utils.toq.m1067k(curveType, dArr, dArr2);
        }

        public void ld6(int position, C0395k value, float period, int shape, float offset) {
            this.f48008ki.append(position, value);
            this.f48009t8r.append(position, new float[]{period, offset});
            this.f47280toq = Math.max(this.f47280toq, shape);
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            this.f1589k.mo1017n(t2, this.f2173i);
            float[] fArr = this.f2173i;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = time - this.f1593s;
            if (Float.isNaN(this.f1591p)) {
                float fM987k = cache.m987k(view, this.f48006cdj, 0);
                this.f1591p = fM987k;
                if (Float.isNaN(fM987k)) {
                    this.f1591p = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f1591p) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f1591p = f4;
            this.f1593s = time;
            float fM1010k = m1010k(f4);
            this.f1594y = false;
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.f48007fn3e;
                if (i2 >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f1594y;
                float f5 = this.f2173i[i2];
                this.f1594y = z2 | (((double) f5) != 0.0d);
                fArr2[i2] = (f5 * fM1010k) + f3;
                i2++;
            }
            C0350k.toq(this.f48008ki.valueAt(0), view, this.f48007fn3e);
            if (f2 != 0.0f) {
                this.f1594y = true;
            }
            return this.f1594y;
        }

        @Override // androidx.constraintlayout.core.motion.utils.AbstractC0277i
        public void zy(int position, float value, float period, int shape, float offset) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$x2 */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class x2 extends AbstractC0349g {
        x2() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setTranslationY(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$y */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class y extends AbstractC0349g {
        y() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setRotationY(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.g$zy */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    static class zy extends AbstractC0349g {
        zy() {
        }

        @Override // androidx.constraintlayout.motion.utils.AbstractC0349g
        /* JADX INFO: renamed from: p */
        public boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
            view.setElevation(f7l8(t2, time, view, cache));
            return this.f1594y;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: s */
    public static AbstractC0349g m1376s(String str, long currentTime) {
        AbstractC0349g f7l8Var;
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
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = 8;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b2 = 9;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = 10;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
        }
        switch (b2) {
            case 0:
                f7l8Var = new f7l8();
                break;
            case 1:
                f7l8Var = new y();
                break;
            case 2:
                f7l8Var = new ld6();
                break;
            case 3:
                f7l8Var = new x2();
                break;
            case 4:
                f7l8Var = new qrj();
                break;
            case 5:
                f7l8Var = new n();
                break;
            case 6:
                f7l8Var = new s();
                break;
            case 7:
                f7l8Var = new p();
                break;
            case 8:
                f7l8Var = new g();
                break;
            case 9:
                f7l8Var = new zy();
                break;
            case 10:
                f7l8Var = new q();
                break;
            case 11:
                f7l8Var = new k();
                break;
            default:
                return null;
        }
        f7l8Var.m1012q(currentTime);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: y */
    public static AbstractC0349g m1377y(String str, SparseArray<C0395k> attrList) {
        return new toq(str, attrList);
    }

    public float f7l8(float pos, long time, View view, androidx.constraintlayout.core.motion.utils.f7l8 cache) {
        this.f1589k.mo1017n(pos, this.f47279f7l8);
        float[] fArr = this.f47279f7l8;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f1594y = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f1591p)) {
            float fM987k = cache.m987k(view, this.f1588g, 0);
            this.f1591p = fM987k;
            if (Float.isNaN(fM987k)) {
                this.f1591p = 0.0f;
            }
        }
        float f3 = (float) ((((double) this.f1591p) + (((time - this.f1593s) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f1591p = f3;
        cache.toq(view, this.f1588g, 0, f3);
        this.f1593s = time;
        float f4 = this.f47279f7l8[0];
        float fM1010k = (m1010k(this.f1591p) * f4) + this.f47279f7l8[2];
        this.f1594y = (f4 == 0.0f && f2 == 0.0f) ? false : true;
        return fM1010k;
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo1378p(View view, float t2, long time, androidx.constraintlayout.core.motion.utils.f7l8 cache);
}

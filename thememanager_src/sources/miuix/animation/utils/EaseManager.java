package miuix.animation.utils;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.styles.PropertyStyle;
import zuf.InterpolatorC7811g;
import zuf.InterpolatorC7812h;
import zuf.InterpolatorC7813i;
import zuf.InterpolatorC7815n;
import zuf.InterpolatorC7816p;
import zuf.InterpolatorC7817q;
import zuf.InterpolatorC7819t;
import zuf.InterpolatorC7821z;
import zuf.a9;
import zuf.cdj;
import zuf.fn3e;
import zuf.fu4;
import zuf.jk;
import zuf.ki;
import zuf.ld6;
import zuf.mcp;
import zuf.ni7;
import zuf.o1t;
import zuf.wvg;
import zuf.x2;
import zuf.zurt;

/* JADX INFO: loaded from: classes3.dex */
public class EaseManager {
    public static final long DEFAULT_DURATION = 300;
    static final ConcurrentHashMap<Integer, TimeInterpolator> sInterpolatorCache = new ConcurrentHashMap<>();

    public static class EaseStyle {
        public volatile float[] factors;
        public final double[] parameters;
        public boolean stopAtTarget;
        public final int style;

        public EaseStyle(int i2, float... fArr) {
            double[] dArr = {0.0d, 0.0d};
            this.parameters = dArr;
            this.style = i2;
            this.factors = fArr;
            setParameters(this, dArr);
        }

        private static void setParameters(EaseStyle easeStyle, double[] dArr) {
            PhysicsOperator phyOperator = easeStyle == null ? null : PropertyStyle.getPhyOperator(easeStyle.style);
            if (phyOperator != null) {
                phyOperator.getParameters(easeStyle.factors, dArr);
            } else {
                Arrays.fill(dArr, 0.0d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EaseStyle)) {
                return false;
            }
            EaseStyle easeStyle = (EaseStyle) obj;
            return this.style == easeStyle.style && Arrays.equals(this.factors, easeStyle.factors);
        }

        public int hashCode() {
            return (Objects.hash(Integer.valueOf(this.style)) * 31) + Arrays.hashCode(this.factors);
        }

        public void setFactors(float... fArr) {
            this.factors = fArr;
            setParameters(this, this.parameters);
        }

        public String toString() {
            return "EaseStyle{style=" + this.style + ", factors=" + Arrays.toString(this.factors) + ", parameters = " + Arrays.toString(this.parameters) + '}';
        }
    }

    public interface EaseStyleDef {
        public static final int ACCELERATE = -3;
        public static final int ACCELERATE_DECELERATE = 21;
        public static final int ACCELERATE_INTERPOLATOR = 22;
        public static final int BOUNCE = 23;
        public static final int BOUNCE_EASE_IN = 24;
        public static final int BOUNCE_EASE_INOUT = 26;
        public static final int BOUNCE_EASE_OUT = 25;
        public static final int CUBIC_IN = 5;
        public static final int CUBIC_INOUT = 7;
        public static final int CUBIC_OUT = 6;
        public static final int DECELERATE = 20;
        public static final int DURATION = -1;
        public static final int EXPO_IN = 17;
        public static final int EXPO_INOUT = 19;
        public static final int EXPO_OUT = 18;
        public static final int FRICTION = -4;
        public static final int LINEAR = 1;
        public static final int QUAD_IN = 2;
        public static final int QUAD_INOUT = 4;
        public static final int QUAD_OUT = 3;
        public static final int QUART_IN = 8;
        public static final int QUART_INOUT = 10;
        public static final int QUART_OUT = 9;
        public static final int QUINT_IN = 11;
        public static final int QUINT_INOUT = 13;
        public static final int QUINT_OUT = 12;
        public static final int REBOUND = -6;
        public static final int SIN_IN = 14;
        public static final int SIN_INOUT = 16;
        public static final int SIN_OUT = 15;
        public static final int SPRING = 0;
        public static final int SPRING_PHY = -2;
        public static final int STOP = -5;
    }

    public static class InterpolateEaseStyle extends EaseStyle {
        public long duration;

        public InterpolateEaseStyle(int i2, float... fArr) {
            super(i2, fArr);
            this.duration = 300L;
        }

        public InterpolateEaseStyle setDuration(long j2) {
            this.duration = j2;
            return this;
        }

        @Override // miuix.animation.utils.EaseManager.EaseStyle
        public String toString() {
            return "InterpolateEaseStyle{style=" + this.style + ", duration=" + this.duration + ", factors=" + Arrays.toString(this.factors) + '}';
        }
    }

    public static class SpringInterpolator implements TimeInterpolator {

        /* JADX INFO: renamed from: c */
        private float f38716c;
        private float c2;

        /* JADX INFO: renamed from: k */
        private float f38717k;

        /* JADX INFO: renamed from: r */
        private float f38719r;

        /* JADX INFO: renamed from: w */
        private float f38720w;
        private float damping = 0.95f;
        private float response = 0.6f;
        private float initial = -1.0f;
        private float c1 = -1.0f;

        /* JADX INFO: renamed from: m */
        private float f38718m = 1.0f;
        private long duration = 1000;

        public SpringInterpolator() {
            updateParameters();
        }

        private void updateParameters() {
            double dPow = Math.pow(6.283185307179586d / ((double) this.response), 2.0d);
            float f2 = this.f38718m;
            this.f38717k = (float) (dPow * ((double) f2));
            this.f38716c = (float) (((((double) this.damping) * 12.566370614359172d) * ((double) f2)) / ((double) this.response));
            float fSqrt = (float) Math.sqrt(((f2 * 4.0f) * r0) - (r1 * r1));
            float f3 = this.f38718m;
            float f4 = fSqrt / (f3 * 2.0f);
            this.f38720w = f4;
            float f5 = -((this.f38716c / 2.0f) * f3);
            this.f38719r = f5;
            this.c2 = (0.0f - (f5 * this.initial)) / f4;
        }

        public float getDamping() {
            return this.damping;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = (f2 / 1000.0f) * this.duration;
            return (float) ((Math.pow(2.718281828459045d, this.f38719r * f3) * ((((double) this.c1) * Math.cos(this.f38720w * f3)) + (((double) this.c2) * Math.sin(this.f38720w * f3)))) + 1.0d);
        }

        public float getResponse() {
            return this.response;
        }

        public SpringInterpolator setDamping(float f2) {
            this.damping = f2;
            updateParameters();
            return this;
        }

        public SpringInterpolator setDuration(long j2) {
            this.duration = j2;
            return this;
        }

        public SpringInterpolator setResponse(float f2) {
            this.response = f2;
            updateParameters();
            return this;
        }
    }

    static TimeInterpolator createTimeInterpolator(int i2, float... fArr) {
        switch (i2) {
            case -1:
            case 1:
                return new LinearInterpolator();
            case 0:
                return new SpringInterpolator().setDamping(fArr[0]).setResponse(fArr[1]);
            case 2:
                return new InterpolatorC7813i();
            case 3:
                return new zurt();
            case 4:
                return new fn3e();
            case 5:
                return new InterpolatorC7816p();
            case 6:
                return new x2();
            case 7:
                return new ld6();
            case 8:
                return new ni7();
            case 9:
                return new InterpolatorC7821z();
            case 10:
                return new fu4();
            case 11:
                return new o1t();
            case 12:
                return new InterpolatorC7819t();
            case 13:
                return new wvg();
            case 14:
                return new mcp();
            case 15:
                return new a9();
            case 16:
                return new jk();
            case 17:
                return new InterpolatorC7812h();
            case 18:
                return new ki();
            case 19:
                return new cdj();
            case 20:
                return new DecelerateInterpolator();
            case 21:
                return new AccelerateDecelerateInterpolator();
            case 22:
                return new AccelerateInterpolator();
            case 23:
                return new BounceInterpolator();
            case 24:
                return new InterpolatorC7817q();
            case 25:
                return new InterpolatorC7811g();
            case 26:
                return new InterpolatorC7815n();
            default:
                return null;
        }
    }

    public static TimeInterpolator getInterpolator(int i2, float... fArr) {
        return getInterpolator(getInterpolatorStyle(i2, fArr));
    }

    private static InterpolateEaseStyle getInterpolatorStyle(int i2, float... fArr) {
        return new InterpolateEaseStyle(i2, fArr);
    }

    public static EaseStyle getStyle(int i2, float... fArr) {
        if (i2 < -1) {
            return new EaseStyle(i2, fArr);
        }
        InterpolateEaseStyle interpolatorStyle = getInterpolatorStyle(i2, fArr.length > 1 ? Arrays.copyOfRange(fArr, 1, fArr.length) : new float[0]);
        if (fArr.length > 0) {
            interpolatorStyle.setDuration((int) fArr[0]);
        }
        return interpolatorStyle;
    }

    public static boolean isPhysicsStyle(int i2) {
        return i2 < -1;
    }

    public static TimeInterpolator getInterpolator(InterpolateEaseStyle interpolateEaseStyle) {
        if (interpolateEaseStyle == null) {
            return null;
        }
        ConcurrentHashMap<Integer, TimeInterpolator> concurrentHashMap = sInterpolatorCache;
        TimeInterpolator timeInterpolatorCreateTimeInterpolator = concurrentHashMap.get(Integer.valueOf(interpolateEaseStyle.style));
        if (timeInterpolatorCreateTimeInterpolator == null && (timeInterpolatorCreateTimeInterpolator = createTimeInterpolator(interpolateEaseStyle.style, interpolateEaseStyle.factors)) != null) {
            concurrentHashMap.put(Integer.valueOf(interpolateEaseStyle.style), timeInterpolatorCreateTimeInterpolator);
        }
        return timeInterpolatorCreateTimeInterpolator;
    }
}

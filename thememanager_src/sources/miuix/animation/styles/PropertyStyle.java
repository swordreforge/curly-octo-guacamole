package miuix.animation.styles;

import android.animation.TimeInterpolator;
import android.util.Log;
import miuix.animation.IAnimTarget;
import miuix.animation.internal.AnimData;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.physics.AccelerateOperator;
import miuix.animation.physics.EquilibriumChecker;
import miuix.animation.physics.FrictionOperator;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.physics.SpringOperator;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PropertyStyle {
    private static final long LONGEST_DURATION = 10000;
    static EquilibriumChecker checker;
    static final SpringOperator sSpring = new SpringOperator();
    static final AccelerateOperator sAccelerate = new AccelerateOperator();
    static final FrictionOperator sFriction = new FrictionOperator();
    static final ThreadLocal<EquilibriumChecker> mCheckerLocal = new ThreadLocal<>();

    public static void doAnimationFrame(IAnimTarget iAnimTarget, AnimData animData, long j2, long j3, long j4) {
        long j5 = j2 - animData.startTime;
        if (EaseManager.isPhysicsStyle(animData.ease.style)) {
            updatePhysicsAnim(iAnimTarget, animData, j5, j3, j4);
        } else {
            updateInterpolatorAnim(animData, j5);
        }
    }

    private static void doPhysicsCalculation(AnimData animData, double d2) {
        double d4 = animData.velocity;
        PhysicsOperator phyOperator = getPhyOperator(animData.ease.style);
        if (phyOperator == null || ((phyOperator instanceof SpringOperator) && AnimValueUtils.isInvalid(animData.targetValue))) {
            animData.value = animData.targetValue;
            animData.velocity = 0.0d;
            return;
        }
        double[] dArr = animData.ease.parameters;
        double dUpdateVelocity = phyOperator.updateVelocity(d4, dArr[0], dArr[1], d2, animData.targetValue, animData.value);
        double d5 = animData.value + ((animData.velocity + dUpdateVelocity) * 0.5d * d2);
        animData.value = d5;
        if (Double.isInfinite(d5)) {
            Log.e(CommonUtils.TAG, "doPhysicsCalculation data.value isInfinite! startVelocity " + d4 + " velocity " + dUpdateVelocity + " data.ease.parameters " + animData.ease.parameters + " delta " + d2 + " data.targetValue " + animData.targetValue + " data.velocity " + animData.velocity);
        }
        animData.velocity = dUpdateVelocity;
    }

    public static PhysicsOperator getPhyOperator(int i2) {
        if (i2 == -4) {
            return sFriction;
        }
        if (i2 == -3) {
            return sAccelerate;
        }
        if (i2 != -2) {
            return null;
        }
        return sSpring;
    }

    public static float getVelocityThreshold() {
        EquilibriumChecker equilibriumChecker = checker;
        if (equilibriumChecker != null) {
            return equilibriumChecker.getVelocityThreshold();
        }
        return 0.0f;
    }

    static boolean isAnimRunning(EquilibriumChecker equilibriumChecker, FloatProperty floatProperty, int i2, double d2, double d4, long j2) {
        boolean z2 = !equilibriumChecker.isAtEquilibrium(i2, d2, d4);
        if (!z2 || j2 <= LONGEST_DURATION) {
            return z2;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("animation for " + floatProperty.getName() + " stopped for running time too long, totalTime = " + j2, new Object[0]);
        }
        return false;
    }

    private static boolean isUsingSpringPhy(AnimData animData) {
        return animData.ease.style == -2;
    }

    private static void setFinishValue(AnimData animData) {
        if (isUsingSpringPhy(animData)) {
            animData.value = animData.targetValue;
        }
    }

    private static void updateInterpolatorAnim(AnimData animData, long j2) {
        EaseManager.InterpolateEaseStyle interpolateEaseStyle = (EaseManager.InterpolateEaseStyle) animData.ease;
        TimeInterpolator interpolator = EaseManager.getInterpolator(interpolateEaseStyle);
        long j3 = interpolateEaseStyle.duration;
        if (j2 < j3) {
            double interpolation = interpolator.getInterpolation(j2 / j3);
            animData.progress = interpolation;
            animData.value = interpolation;
        } else {
            animData.setOp((byte) 3);
            animData.progress = 1.0d;
            animData.value = 1.0d;
        }
        if (Double.isInfinite(animData.value)) {
            Log.e(CommonUtils.TAG, "updateInterpolatorAnim data.value isInfinite!  data.ease " + interpolateEaseStyle + " totalTime " + j2 + " interpolator " + interpolator + " data.progress " + animData.progress);
        }
    }

    private static void updatePhysicsAnim(IAnimTarget iAnimTarget, AnimData animData, long j2, long j3, long j4) {
        int iRound = j3 > j4 ? Math.round(j3 / j4) : 1;
        double d2 = j4 / 1000.0d;
        EquilibriumChecker equilibriumChecker = (EquilibriumChecker) CommonUtils.getLocal(mCheckerLocal, EquilibriumChecker.class);
        checker = equilibriumChecker;
        equilibriumChecker.init(iAnimTarget, animData.property, animData.targetValue);
        for (int i2 = 0; i2 < iRound; i2++) {
            doPhysicsCalculation(animData, d2);
            if (!isAnimRunning(checker, animData.property, animData.ease.style, animData.value, animData.velocity, j2)) {
                animData.setOp((byte) 3);
                if (LogUtils.isLogEnabled()) {
                    LogUtils.debug("----- updatePhysicsAnim data.setOp(AnimTask.OP_END)", new Object[0]);
                }
                setFinishValue(animData);
                return;
            }
        }
    }
}

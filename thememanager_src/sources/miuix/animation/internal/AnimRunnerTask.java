package miuix.animation.internal;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.TypeEvaluator;
import java.util.List;
import miuix.animation.ViewTarget;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.PropertyStyle;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
class AnimRunnerTask {
    static final ThreadLocal<AnimData> animDataLocal = new ThreadLocal<>();

    AnimRunnerTask() {
    }

    static void doAnimationFrame(AnimTask animTask, long j2, long j3, boolean z2, boolean z3) {
        UpdateInfo updateInfo;
        int i2;
        int i3;
        boolean z5;
        AnimData animData = (AnimData) CommonUtils.getLocal(animDataLocal, AnimData.class);
        animData.logEnabled = LogUtils.isLogEnabled();
        long averageDelta = AnimRunner.getInst().getAverageDelta();
        for (AnimTask animTaskRemove = animTask; animTaskRemove != null; animTaskRemove = animTaskRemove.remove()) {
            AnimStats animStats = animTaskRemove.animStats;
            animStats.updateCount = 0;
            boolean z6 = !animStats.isStarted();
            List<UpdateInfo> list = animTaskRemove.info.updateList;
            boolean z7 = animTaskRemove.info.target instanceof ViewTarget;
            int i4 = animTaskRemove.startPos;
            int animCount = i4 + animTaskRemove.getAnimCount();
            int i5 = i4;
            while (i5 < animCount) {
                UpdateInfo updateInfo2 = list.get(i5);
                if (updateInfo2 == null) {
                    i2 = animCount;
                    i3 = i5;
                    z5 = z7;
                } else {
                    AnimSpecialConfig specialConfig = animTaskRemove.info.config.getSpecialConfig(updateInfo2.property.getName());
                    animData.from(updateInfo2, animTaskRemove.info.config, specialConfig);
                    if (z6) {
                        updateInfo = updateInfo2;
                        i2 = animCount;
                        i3 = i5;
                        setup(animTaskRemove, animData, animTaskRemove.info, specialConfig, j2, j3);
                    } else {
                        updateInfo = updateInfo2;
                        i2 = animCount;
                        i3 = i5;
                    }
                    if (animData.op == 1) {
                        startAnim(animTaskRemove, animData, animTaskRemove.info, j2, j3);
                    }
                    if (animData.op == 2) {
                        z5 = z7;
                        updateAnimation(animTaskRemove, animData, animTaskRemove.info, j2, j3, averageDelta);
                    } else {
                        z5 = z7;
                    }
                    UpdateInfo updateInfo3 = updateInfo;
                    animData.to(updateInfo3);
                    if (z2 && z3 && !z5 && !AnimValueUtils.isInvalid(animData.value)) {
                        updateInfo3.setTargetValue(animTaskRemove.info.target);
                    }
                }
                i5 = i3 + 1;
                animCount = i2;
                z7 = z5;
            }
        }
    }

    private static double evaluateValue(AnimData animData, float f2) {
        TypeEvaluator evaluator = getEvaluator(animData.property);
        return evaluator instanceof IntEvaluator ? ((IntEvaluator) evaluator).evaluate(f2, Integer.valueOf((int) animData.startValue), Integer.valueOf((int) animData.targetValue)).doubleValue() : ((FloatEvaluator) evaluator).evaluate(f2, (Number) Float.valueOf((float) animData.startValue), (Number) Float.valueOf((float) animData.targetValue)).doubleValue();
    }

    private static void finishProperty(AnimTask animTask, AnimData animData) {
        animData.setOp((byte) 5);
        animTask.animStats.failCount++;
    }

    private static TypeEvaluator getEvaluator(FloatProperty floatProperty) {
        return (floatProperty == ViewPropertyExt.BACKGROUND && (floatProperty instanceof ColorProperty)) ? CommonUtils.sArgbEvaluator : floatProperty instanceof IIntValueProperty ? new IntEvaluator() : new FloatEvaluator();
    }

    private static boolean initAnimation(AnimTask animTask, AnimData animData, long j2, long j3) {
        if (!setValues(animData)) {
            if (animData.logEnabled) {
                LogUtils.logThread(CommonUtils.TAG, "StartTask, set start value failed, break, tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", start value = " + animData.startValue + ", target value = " + animData.targetValue + ", value = " + animData.value);
            }
            finishProperty(animTask, animData);
            return false;
        }
        if (!isValueInvalid(animData)) {
            animData.startTime = j2 - j3;
            animData.frameCount = 0;
            animData.setOp((byte) 2);
            return true;
        }
        if (animData.logEnabled) {
            LogUtils.logThread(CommonUtils.TAG, "StartTask, values invalid, break, tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", startValue = " + animData.startValue + ", targetValue = " + animData.targetValue + ", value = " + animData.value + ", velocity = " + animData.velocity);
        }
        animData.reset();
        animData.value = animData.startValue;
        finishProperty(animTask, animData);
        return false;
    }

    private static boolean isValueInvalid(AnimData animData) {
        return animData.startValue == animData.targetValue && Math.abs(animData.velocity) < 16.66666603088379d;
    }

    private static float regulateProgress(float f2) {
        if (f2 > 1.0f) {
            return 1.0f;
        }
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    private static void setStartData(AnimTask animTask, AnimData animData) {
        animData.progress = 0.0d;
        animData.reset();
        if (animData.logEnabled) {
            LogUtils.debug("+++++ start anim, target = " + animTask.info.target + ", tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", op = " + ((int) animData.op) + ", ease = " + animData.ease + ", delay = " + animData.delay + ", start value = " + animData.startValue + ", target value = " + animData.targetValue + ", value = " + animData.value + ", progress = " + animData.progress + ", velocity = " + animData.velocity, new Object[0]);
        }
    }

    private static boolean setValues(AnimData animData) {
        if (!AnimValueUtils.isInvalid(animData.value)) {
            if (AnimValueUtils.isInvalid(animData.startValue)) {
                animData.startValue = animData.value;
            }
            return true;
        }
        if (AnimValueUtils.isInvalid(animData.startValue)) {
            return false;
        }
        animData.value = animData.startValue;
        return true;
    }

    static void setup(AnimTask animTask, AnimData animData, TransitionInfo transitionInfo, AnimSpecialConfig animSpecialConfig, long j2, long j3) {
        if (AnimValueUtils.isInvalid(animData.startValue)) {
            animData.startValue = AnimValueUtils.getValue(transitionInfo.target, animData.property, animData.startValue);
        }
        long j4 = j2 - j3;
        animData.initTime = j4;
        AnimStats animStats = animTask.animStats;
        animStats.initCount++;
        if (animData.op == 2 && animData.delay <= 0) {
            animData.startTime = j4;
            animData.delay = 0L;
            animStats.startCount--;
            setStartData(animTask, animData);
            return;
        }
        animData.setOp((byte) 1);
        float fromSpeed = AnimConfigUtils.getFromSpeed(transitionInfo.config, animSpecialConfig);
        if (fromSpeed != Float.MAX_VALUE) {
            animData.velocity = fromSpeed;
        }
    }

    static void startAnim(AnimTask animTask, AnimData animData, TransitionInfo transitionInfo, long j2, long j3) {
        if (animData.delay > 0) {
            if (animData.logEnabled) {
                LogUtils.debug("StartTask, tag = " + animTask.info.key + ", property = " + animData.property.getName() + ", delay = " + animData.delay + ", initTime = " + animData.initTime + ", totalT = " + j2, new Object[0]);
            }
            if (j2 < animData.initTime + animData.delay) {
                return;
            }
            double value = AnimValueUtils.getValue(transitionInfo.target, animData.property, Double.MAX_VALUE);
            if (value != Double.MAX_VALUE) {
                animData.startValue = value;
            }
        }
        AnimStats animStats = animTask.animStats;
        animStats.startCount--;
        if (initAnimation(animTask, animData, j2, j3)) {
            setStartData(animTask, animData);
        }
    }

    private static void updateAnimation(AnimTask animTask, AnimData animData, TransitionInfo transitionInfo, long j2, long j3, long j4) {
        animTask.animStats.updateCount++;
        animData.frameCount++;
        FloatProperty floatProperty = animData.property;
        if (floatProperty == ViewPropertyExt.FOREGROUND || floatProperty == ViewPropertyExt.BACKGROUND || (floatProperty instanceof ColorProperty)) {
            double d2 = animData.startValue;
            double d4 = animData.targetValue;
            animData.startValue = 0.0d;
            animData.targetValue = 1.0d;
            animData.value = animData.progress;
            PropertyStyle.doAnimationFrame(transitionInfo.target, animData, j2, j3, j4);
            double dRegulateProgress = regulateProgress((float) animData.value);
            animData.progress = dRegulateProgress;
            animData.startValue = d2;
            animData.targetValue = d4;
            animData.value = ((Integer) CommonUtils.sArgbEvaluator.evaluate((float) dRegulateProgress, Integer.valueOf((int) d2), Integer.valueOf((int) animData.targetValue))).doubleValue();
        } else {
            PropertyStyle.doAnimationFrame(transitionInfo.target, animData, j2, j3, j4);
            if (!EaseManager.isPhysicsStyle(animData.ease.style)) {
                animData.value = evaluateValue(animData, (float) animData.progress);
            }
        }
        if (animData.op == 3) {
            animData.justEnd = true;
            animTask.animStats.endCount++;
        }
        if (animData.logEnabled) {
            LogUtils.debug("----- update anim, target = " + animTask.info.target + ", info.id = " + animTask.info.id + ", tag = " + animTask.info.key + " " + animTask.info.key.hashCode() + ", property = " + animData.property.getName() + ", op = " + ((int) animData.op) + ", justEnd = " + animData.justEnd + ", init time = " + animData.initTime + ", start time = " + animData.startTime + ", start value = " + animData.startValue + ", target value = " + animData.targetValue + ", value = " + animData.value + ", progress = " + animData.progress + ", velocity = " + animData.velocity + ", delta = " + j3, new Object[0]);
        }
    }
}

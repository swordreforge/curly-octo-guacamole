package miuix.animation.internal;

import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.internal.TransitionInfo;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.physics.PhysicsOperator;
import miuix.animation.property.FloatProperty;
import miuix.animation.styles.PropertyStyle;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class PredictTask {
    private static final TransitionInfo.IUpdateInfoCreator sCreator = new TransitionInfo.IUpdateInfoCreator() { // from class: miuix.animation.internal.PredictTask.1
        @Override // miuix.animation.internal.TransitionInfo.IUpdateInfoCreator
        public UpdateInfo getUpdateInfo(FloatProperty floatProperty) {
            return new UpdateInfo(floatProperty);
        }
    };

    public static long predictDuration(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        TransitionInfo transitionInfo = new TransitionInfo(iAnimTarget, animState, animState2, animConfigLink);
        transitionInfo.initUpdateList(sCreator);
        transitionInfo.setupTasks(true);
        long averageDelta = AnimRunner.getInst().getAverageDelta();
        long j2 = averageDelta;
        while (true) {
            Iterator<AnimTask> it = transitionInfo.animTasks.iterator();
            while (it.hasNext()) {
                AnimRunnerTask.doAnimationFrame(it.next(), j2, averageDelta, false, true);
            }
            if (!transitionInfo.getAnimStats().isRunning()) {
                return j2;
            }
            j2 += averageDelta;
        }
    }

    public static double predictNextValue(IAnimTarget iAnimTarget, AnimState animState, FloatProperty floatProperty, AnimConfig animConfig) {
        EaseManager.EaseStyle ease = AnimConfigUtils.getEase(animState.getConfig(), animConfig.getSpecialConfig(floatProperty));
        float value = iAnimTarget.getValue(floatProperty);
        double velocity = iAnimTarget.getVelocity(floatProperty);
        ArrayList<TransitionInfo> arrayList = new ArrayList();
        iAnimTarget.animManager.getTransitionInfos(arrayList);
        UpdateInfo updateInfoFindBy = null;
        for (TransitionInfo transitionInfo : arrayList) {
            if (transitionInfo.containsProperty(floatProperty)) {
                updateInfoFindBy = UpdateInfo.findBy(transitionInfo.updateList, floatProperty);
            }
        }
        if (updateInfoFindBy == null) {
            return Double.MAX_VALUE;
        }
        double averageDelta = AnimRunner.getInst().getAverageDelta() / 1000.0d;
        if (!EaseManager.isPhysicsStyle(ease.style)) {
            EaseManager.InterpolateEaseStyle interpolateEaseStyle = (EaseManager.InterpolateEaseStyle) ease;
            TimeInterpolator interpolator = EaseManager.getInterpolator(interpolateEaseStyle);
            return (System.currentTimeMillis() - updateInfoFindBy.animInfo.startTime) + ((long) averageDelta) < interpolateEaseStyle.duration ? interpolator.getInterpolation(r7 / r1) : updateInfoFindBy.animInfo.targetValue;
        }
        PhysicsOperator phyOperator = PropertyStyle.getPhyOperator(ease.style);
        if (AnimValueUtils.isInvalid(updateInfoFindBy.animInfo.targetValue)) {
            return Double.MAX_VALUE;
        }
        double[] dArr = ease.parameters;
        double d2 = dArr[0];
        double d4 = dArr[1];
        double d5 = value;
        return d5 + ((velocity + phyOperator.updateVelocity(velocity, d2, d4, averageDelta, updateInfoFindBy.animInfo.targetValue, d5)) * 0.5d * averageDelta);
    }

    public static double predictNextVelocity(IAnimTarget iAnimTarget, AnimState animState, FloatProperty floatProperty, AnimConfig animConfig) {
        EaseManager.EaseStyle ease = AnimConfigUtils.getEase(animState.getConfig(), animConfig.getSpecialConfig(floatProperty));
        float value = iAnimTarget.getValue(floatProperty);
        double velocity = iAnimTarget.getVelocity(floatProperty);
        ArrayList<TransitionInfo> arrayList = new ArrayList();
        iAnimTarget.animManager.getTransitionInfos(arrayList);
        UpdateInfo updateInfoFindBy = null;
        for (TransitionInfo transitionInfo : arrayList) {
            if (transitionInfo.containsProperty(floatProperty)) {
                updateInfoFindBy = UpdateInfo.findBy(transitionInfo.updateList, floatProperty);
            }
        }
        if (updateInfoFindBy == null || !EaseManager.isPhysicsStyle(ease.style)) {
            return Double.MAX_VALUE;
        }
        double averageDelta = AnimRunner.getInst().getAverageDelta() / 1000.0d;
        PhysicsOperator phyOperator = PropertyStyle.getPhyOperator(ease.style);
        if (AnimValueUtils.isInvalid(updateInfoFindBy.animInfo.targetValue)) {
            return Double.MAX_VALUE;
        }
        double[] dArr = ease.parameters;
        return phyOperator.updateVelocity(velocity, dArr[0], dArr[1], averageDelta, updateInfoFindBy.animInfo.targetValue, value);
    }
}

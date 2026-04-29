package miuix.animation;

import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public interface IStateStyle extends IStateContainer {
    IStateStyle add(String str, float f2);

    IStateStyle add(String str, float f2, long j2);

    IStateStyle add(String str, int i2);

    IStateStyle add(String str, int i2, long j2);

    IStateStyle add(FloatProperty floatProperty, float f2);

    IStateStyle add(FloatProperty floatProperty, float f2, long j2);

    IStateStyle add(FloatProperty floatProperty, int i2);

    IStateStyle add(FloatProperty floatProperty, int i2, long j2);

    IStateStyle addInitProperty(String str, float f2);

    IStateStyle addInitProperty(String str, int i2);

    IStateStyle addInitProperty(FloatProperty floatProperty, float f2);

    IStateStyle addInitProperty(FloatProperty floatProperty, int i2);

    IStateStyle addListener(TransitionListener transitionListener);

    IStateStyle autoSetTo(Object... objArr);

    IStateStyle fromTo(Object obj, Object obj2, AnimConfig... animConfigArr);

    AnimState getCurrentState();

    float getPredictFriction(FloatProperty floatProperty, float f2);

    float getPredictValue(FloatProperty floatProperty, float... fArr);

    long predictDuration(Object... objArr);

    IStateStyle removeListener(TransitionListener transitionListener);

    IStateStyle set(Object obj);

    IStateStyle setConfig(AnimConfig animConfig, FloatProperty... floatPropertyArr);

    IStateStyle setEase(int i2, float... fArr);

    IStateStyle setEase(FloatProperty floatProperty, int i2, float... fArr);

    IStateStyle setEase(EaseManager.EaseStyle easeStyle, FloatProperty... floatPropertyArr);

    IStateStyle setFlags(long j2);

    IStateStyle setTo(Object obj);

    IStateStyle setTo(Object obj, AnimConfig... animConfigArr);

    IStateStyle setTo(Object... objArr);

    IStateStyle setTransitionFlags(long j2, FloatProperty... floatPropertyArr);

    IStateStyle setup(Object obj);

    IStateStyle then(Object obj, AnimConfig... animConfigArr);

    IStateStyle then(Object... objArr);

    IStateStyle to(Object obj, AnimConfig... animConfigArr);

    IStateStyle to(Object... objArr);

    IStateStyle to(AnimConfig... animConfigArr);
}

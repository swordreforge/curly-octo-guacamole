package miuix.animation.controller;

import java.lang.reflect.Array;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.IStateStyle;
import miuix.animation.ValueTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.internal.AnimRunner;
import miuix.animation.internal.PredictTask;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeState implements IFolmeStateStyle {
    IAnimTarget mTarget;
    StateManager mStateMgr = new StateManager();
    AnimConfigLink mConfigLink = new AnimConfigLink();
    private boolean mEnableAnim = true;

    FolmeState(IAnimTarget iAnimTarget) {
        this.mTarget = iAnimTarget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fromTo(Object obj, Object obj2, AnimConfigLink animConfigLink) {
        if (this.mEnableAnim) {
            this.mStateMgr.setup(obj2);
            if (obj != null) {
                setTo(obj);
            }
            AnimState state = getState(obj2);
            this.mStateMgr.addTempConfig(state, animConfigLink);
            AnimRunner.getInst().run(this.mTarget, getState(obj), getState(obj2), animConfigLink);
            this.mStateMgr.clearTempState(state);
            animConfigLink.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnimConfigLink getConfigLink() {
        return this.mConfigLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(Object obj, AnimConfigLink animConfigLink) {
        if (this.mTarget == null) {
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Float)) {
            setTo(obj, animConfigLink);
            return;
        }
        AnimState state = getState(obj);
        IAnimTarget target = getTarget();
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("FolmeState.setTo, state = " + state, new Object[0]);
        }
        target.animManager.setTo(state, animConfigLink);
        this.mStateMgr.clearTempState(state);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(FloatProperty floatProperty, int i2, long j2) {
        this.mStateMgr.add(floatProperty, i2, j2);
        return this;
    }

    @Override // miuix.animation.IStateContainer
    @Deprecated
    public void addConfig(Object obj, AnimConfig... animConfigArr) {
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle addInitProperty(FloatProperty floatProperty, int i2) {
        this.mStateMgr.addInitProperty(floatProperty, i2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle addListener(TransitionListener transitionListener) {
        this.mStateMgr.addListener(transitionListener);
        return this;
    }

    @Override // miuix.animation.controller.IFolmeStateStyle
    public void addState(AnimState animState) {
        this.mStateMgr.addState(animState);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle autoSetTo(Object... objArr) {
        return this;
    }

    @Override // miuix.animation.ICancelableStyle
    public void cancel() {
        AnimRunner.getInst().cancel(this.mTarget, (FloatProperty[]) null);
    }

    @Override // miuix.animation.IStateContainer
    public void clean() {
        cancel();
    }

    @Override // miuix.animation.IStateContainer
    public void enableDefaultAnim(boolean z2) {
        this.mEnableAnim = z2;
    }

    @Override // miuix.animation.ICancelableStyle
    public void end(Object... objArr) {
        if (objArr.length > 0) {
            if (objArr[0] instanceof FloatProperty) {
                FloatProperty[] floatPropertyArr = new FloatProperty[objArr.length];
                System.arraycopy(objArr, 0, floatPropertyArr, 0, objArr.length);
                AnimRunner.getInst().end(this.mTarget, floatPropertyArr);
            } else {
                String[] strArr = new String[objArr.length];
                System.arraycopy(objArr, 0, strArr, 0, objArr.length);
                AnimRunner.getInst().end(this.mTarget, strArr);
            }
        }
    }

    @Override // miuix.animation.IStateStyle
    public AnimState getCurrentState() {
        return this.mStateMgr.getCurrentState();
    }

    @Override // miuix.animation.IStateStyle
    public float getPredictFriction(FloatProperty floatProperty, float f2) {
        float velocity = (float) this.mTarget.getVelocity(floatProperty);
        if (velocity == 0.0f) {
            return -1.0f;
        }
        return Folme.getPredictFriction(this.mTarget.getValue(floatProperty), f2, velocity, Math.signum(velocity) * ((float) Folme.getTarget(this.mTarget).getThresholdVelocity(floatProperty)));
    }

    @Override // miuix.animation.IStateStyle
    public float getPredictValue(FloatProperty floatProperty, float... fArr) {
        float velocity = (float) this.mTarget.getVelocity(floatProperty);
        float value = this.mTarget.getValue(floatProperty);
        float thresholdVelocity = (float) Folme.getTarget(this.mTarget).getThresholdVelocity(floatProperty);
        if (velocity != 0.0f) {
            thresholdVelocity = Math.abs(thresholdVelocity) * Math.signum(velocity);
        }
        return value + ((fArr == null || fArr.length == 0) ? Folme.getPredictDistance(velocity, thresholdVelocity) : Folme.getPredictDistanceWithFriction(velocity, fArr[0], thresholdVelocity));
    }

    @Override // miuix.animation.controller.IFolmeStateStyle
    public AnimState getState(Object obj) {
        return this.mStateMgr.getState(obj);
    }

    @Override // miuix.animation.controller.IFolmeStateStyle
    public IAnimTarget getTarget() {
        return this.mTarget;
    }

    @Override // miuix.animation.IStateStyle
    public long predictDuration(Object... objArr) {
        IAnimTarget target = getTarget();
        AnimConfigLink configLink = getConfigLink();
        AnimState toState = this.mStateMgr.getToState(target, configLink, objArr);
        long jPredictDuration = PredictTask.predictDuration(target, null, toState, configLink);
        this.mStateMgr.clearTempState(toState);
        configLink.clear();
        return jPredictDuration;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle removeListener(TransitionListener transitionListener) {
        this.mStateMgr.removeListener(transitionListener);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle set(Object obj) {
        this.mStateMgr.setup(obj);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    @Deprecated
    public IStateStyle setConfig(AnimConfig animConfig, FloatProperty... floatPropertyArr) {
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setEase(EaseManager.EaseStyle easeStyle, FloatProperty... floatPropertyArr) {
        this.mStateMgr.setEase(easeStyle, floatPropertyArr);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setFlags(long j2) {
        IAnimTarget iAnimTarget = this.mTarget;
        if (iAnimTarget == null) {
            return this;
        }
        iAnimTarget.setFlags(j2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setTransitionFlags(long j2, FloatProperty... floatPropertyArr) {
        StateManager stateManager = this.mStateMgr;
        stateManager.setTransitionFlags(stateManager.getCurrentState(), j2, floatPropertyArr);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setup(Object obj) {
        this.mStateMgr.setup(obj);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle then(Object obj, AnimConfig... animConfigArr) {
        this.mStateMgr.setStateFlags(obj, 1L);
        return to(obj, animConfigArr);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle to(AnimConfig... animConfigArr) {
        return to(getCurrentState(), animConfigArr);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(String str, int i2, long j2) {
        this.mStateMgr.add(str, i2, j2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle addInitProperty(FloatProperty floatProperty, float f2) {
        this.mStateMgr.addInitProperty(floatProperty, f2);
        return this;
    }

    @Override // miuix.animation.ICancelableStyle
    public void cancel(FloatProperty... floatPropertyArr) {
        AnimRunner.getInst().cancel(this.mTarget, floatPropertyArr);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setEase(int i2, float... fArr) {
        this.mStateMgr.setEase(i2, fArr);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle to(Object obj, AnimConfig... animConfigArr) {
        if ((obj instanceof AnimState) || this.mStateMgr.hasState(obj)) {
            return fromTo((Object) null, getState(obj), animConfigArr);
        }
        if (!obj.getClass().isArray()) {
            return to(obj, animConfigArr);
        }
        int length = Array.getLength(obj);
        Object[] objArr = new Object[animConfigArr.length + length];
        System.arraycopy(obj, 0, objArr, 0, length);
        System.arraycopy(animConfigArr, 0, objArr, length, animConfigArr.length);
        return to(objArr);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(FloatProperty floatProperty, int i2) {
        this.mStateMgr.add(floatProperty, i2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle addInitProperty(String str, int i2) {
        this.mStateMgr.addInitProperty(str, i2);
        return this;
    }

    @Override // miuix.animation.ICancelableStyle
    public void cancel(String... strArr) {
        if (strArr.length == 0 || !(this.mTarget instanceof ValueTarget)) {
            return;
        }
        AnimRunner.getInst().cancel(this.mTarget, strArr);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setEase(FloatProperty floatProperty, int i2, float... fArr) {
        this.mStateMgr.setEase(floatProperty, i2, fArr);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle then(final Object... objArr) {
        this.mTarget.post(new Runnable() { // from class: miuix.animation.controller.FolmeState.4
            @Override // java.lang.Runnable
            public void run() {
                AnimConfig animConfig = new AnimConfig();
                AnimState state = FolmeState.this.getState(objArr);
                state.flags = 1L;
                FolmeState.this.to(state, animConfig);
            }
        });
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(FloatProperty floatProperty, float f2) {
        this.mStateMgr.add(floatProperty, f2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle addInitProperty(String str, float f2) {
        this.mStateMgr.addInitProperty(str, f2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(FloatProperty floatProperty, float f2, long j2) {
        this.mStateMgr.add(floatProperty, f2, j2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(String str, int i2) {
        this.mStateMgr.add(str, i2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(String str, float f2) {
        this.mStateMgr.add(str, f2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle add(String str, float f2, long j2) {
        this.mStateMgr.add(str, f2, j2);
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle fromTo(final Object obj, final Object obj2, final AnimConfig... animConfigArr) {
        IAnimTarget iAnimTarget = this.mTarget;
        if (iAnimTarget == null) {
            return this;
        }
        iAnimTarget.post(new Runnable() { // from class: miuix.animation.controller.FolmeState.2
            @Override // java.lang.Runnable
            public void run() {
                AnimConfigLink configLink = FolmeState.this.getConfigLink();
                for (AnimConfig animConfig : animConfigArr) {
                    configLink.add(animConfig, new boolean[0]);
                }
                FolmeState.this.fromTo(obj, obj2, configLink);
            }
        });
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setTo(Object obj) {
        return setTo(obj, new AnimConfig[0]);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setTo(final Object obj, final AnimConfig... animConfigArr) {
        IAnimTarget iAnimTarget = this.mTarget;
        if (iAnimTarget == null) {
            return this;
        }
        iAnimTarget.post(new Runnable() { // from class: miuix.animation.controller.FolmeState.1
            @Override // java.lang.Runnable
            public void run() {
                FolmeState.this.setTo(obj, AnimConfigLink.linkConfig(animConfigArr));
            }
        });
        return this;
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle to(Object... objArr) {
        return fromTo((Object) null, this.mStateMgr.getToState(getTarget(), getConfigLink(), objArr), new AnimConfig[0]);
    }

    @Override // miuix.animation.IStateStyle
    public IStateStyle setTo(final Object... objArr) {
        IAnimTarget iAnimTarget = this.mTarget;
        if (iAnimTarget == null) {
            return this;
        }
        iAnimTarget.post(new Runnable() { // from class: miuix.animation.controller.FolmeState.3
            @Override // java.lang.Runnable
            public void run() {
                AnimConfigLink configLink = FolmeState.this.getConfigLink();
                FolmeState folmeState = FolmeState.this;
                FolmeState.this.setTo(folmeState.mStateMgr.getSetToState(folmeState.getTarget(), configLink, objArr), configLink);
            }
        });
        return this;
    }
}

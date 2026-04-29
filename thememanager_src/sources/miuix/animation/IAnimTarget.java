package miuix.animation;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.internal.AnimManager;
import miuix.animation.internal.NotifyManager;
import miuix.animation.internal.TargetHandler;
import miuix.animation.internal.TargetVelocityTracker;
import miuix.animation.listener.ListenerNotifier;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ValueProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.PropertyStyle;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IAnimTarget<T> {
    public static final long FLAT_ONESHOT = 1;
    static final AtomicInteger sTargetIds = new AtomicInteger(Integer.MAX_VALUE);
    public final AnimManager animManager;
    public final TargetHandler handler = new TargetHandler(this);
    public final int id;
    float mDefaultMinVisible;
    long mFlags;
    long mFlagsSetTime;
    Map<Object, Float> mMinVisibleChanges;
    boolean mShouldCheckValue;
    final TargetVelocityTracker mTracker;
    NotifyManager notifyManager;

    public IAnimTarget() {
        AnimManager animManager = new AnimManager();
        this.animManager = animManager;
        this.notifyManager = new NotifyManager(this);
        this.mDefaultMinVisible = Float.MAX_VALUE;
        this.mMinVisibleChanges = new ConcurrentHashMap();
        this.mShouldCheckValue = true;
        this.id = sTargetIds.decrementAndGet();
        this.mTracker = new TargetVelocityTracker();
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("IAnimTarget create ! ", new Object[0]);
        }
        animManager.setTarget(this);
        setMinVisibleChange(0.1f, ViewProperty.ROTATION, ViewProperty.ROTATION_X, ViewProperty.ROTATION_Y);
        setMinVisibleChange(0.00390625f, ViewProperty.ALPHA, ViewProperty.AUTO_ALPHA, ViewPropertyExt.FOREGROUND, ViewPropertyExt.BACKGROUND);
        setMinVisibleChange(0.002f, ViewProperty.SCALE_X, ViewProperty.SCALE_Y);
    }

    public boolean allowAnimRun() {
        return true;
    }

    public abstract void clean();

    public void enableCheckValue(boolean z2) {
        this.mShouldCheckValue = z2;
    }

    public void executeOnInitialized(Runnable runnable) {
        post(runnable);
    }

    protected void finalize() throws Throwable {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("IAnimTarget was destroyed ！", new Object[0]);
        }
        super.finalize();
    }

    public float getDefaultMinVisible() {
        return 1.0f;
    }

    public int getId() {
        return this.id;
    }

    public int getIntValue(IIntValueProperty iIntValueProperty) {
        T targetObject = getTargetObject();
        if (targetObject != null) {
            return iIntValueProperty.getIntValue(targetObject);
        }
        return Integer.MAX_VALUE;
    }

    public void getLocationOnScreen(int[] iArr) {
        iArr[1] = 0;
        iArr[0] = 0;
    }

    public float getMinVisibleChange(Object obj) {
        Float f2 = this.mMinVisibleChanges.get(obj);
        if (f2 != null) {
            return f2.floatValue();
        }
        float f3 = this.mDefaultMinVisible;
        return f3 != Float.MAX_VALUE ? f3 : getDefaultMinVisible();
    }

    public ListenerNotifier getNotifier() {
        return this.notifyManager.getNotifier();
    }

    public abstract T getTargetObject();

    public double getThresholdVelocity(FloatProperty floatProperty) {
        return PropertyStyle.getVelocityThreshold();
    }

    public float getValue(FloatProperty floatProperty) {
        T targetObject = getTargetObject();
        if (targetObject != null) {
            return floatProperty.getValue(targetObject);
        }
        return Float.MAX_VALUE;
    }

    public double getVelocity(FloatProperty floatProperty) {
        return this.animManager.getVelocity(floatProperty);
    }

    public boolean hasFlags(long j2) {
        return CommonUtils.hasFlags(this.mFlags, j2);
    }

    public boolean isAnimRunning(FloatProperty... floatPropertyArr) {
        return this.animManager.isAnimRunning(floatPropertyArr);
    }

    public boolean isValid() {
        return true;
    }

    public boolean isValidFlag() {
        return SystemClock.elapsedRealtime() - this.mFlagsSetTime > 3;
    }

    public void onFrameEnd(boolean z2) {
    }

    public void post(Runnable runnable) {
        if (this.handler.threadId == Thread.currentThread().getId()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }

    public IAnimTarget setDefaultMinVisibleChange(float f2) {
        this.mDefaultMinVisible = f2;
        return this;
    }

    public void setFlags(long j2) {
        this.mFlags = j2;
        this.mFlagsSetTime = SystemClock.elapsedRealtime();
    }

    public void setIntValue(IIntValueProperty iIntValueProperty, int i2) {
        T targetObject = getTargetObject();
        if (targetObject == null || Math.abs(i2) == Integer.MAX_VALUE) {
            return;
        }
        iIntValueProperty.setIntValue(targetObject, i2);
    }

    public IAnimTarget setMinVisibleChange(float f2, FloatProperty... floatPropertyArr) {
        for (FloatProperty floatProperty : floatPropertyArr) {
            this.mMinVisibleChanges.put(floatProperty, Float.valueOf(f2));
        }
        return this;
    }

    public void setToNotify(AnimState animState, AnimConfigLink animConfigLink) {
        this.notifyManager.setToNotify(animState, animConfigLink);
    }

    public void setValue(FloatProperty floatProperty, float f2) {
        T targetObject = getTargetObject();
        if (targetObject == null || Math.abs(f2) == Float.MAX_VALUE || Float.isNaN(f2) || Float.isInfinite(f2)) {
            return;
        }
        floatProperty.setValue(targetObject, f2);
    }

    public void setVelocity(FloatProperty floatProperty, double d2) {
        if (d2 != 3.4028234663852886E38d) {
            this.animManager.setVelocity(floatProperty, (float) d2);
        }
    }

    public boolean shouldCheckValue() {
        return this.mShouldCheckValue;
    }

    public boolean shouldUseIntValue(FloatProperty floatProperty) {
        return floatProperty instanceof IIntValueProperty;
    }

    public String toString() {
        return "IAnimTarget{" + getTargetObject() + "}";
    }

    public void trackVelocity(FloatProperty floatProperty, double d2) {
        this.mTracker.trackVelocity(this, floatProperty, d2);
    }

    public IAnimTarget setMinVisibleChange(Object obj, float f2) {
        this.mMinVisibleChanges.put(obj, Float.valueOf(f2));
        return this;
    }

    public IAnimTarget setMinVisibleChange(float f2, String... strArr) {
        for (String str : strArr) {
            setMinVisibleChange(new ValueProperty(str), f2);
        }
        return this;
    }
}

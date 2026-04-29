package miuix.animation.physics;

import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import miuix.animation.physics.AnimationHandler;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.FloatValueHolder;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.00390625f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    private static final float THRESHOLD_MULTIPLIER = 0.75f;
    private static final float UNSET = Float.MAX_VALUE;
    private final ArrayList<OnAnimationEndListener> mEndListeners;
    private long mLastFrameTime;
    float mMaxValue;
    float mMinValue;
    private float mMinVisibleChange;
    final FloatProperty mProperty;
    boolean mRunning;
    private long mStartDelay;
    boolean mStartValueIsSet;
    final Object mTarget;
    private final ArrayList<OnAnimationUpdateListener> mUpdateListeners;
    float mValue;
    float mVelocity;

    static class MassState {
        float mValue;
        float mVelocity;

        MassState() {
        }
    }

    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3);
    }

    DynamicAnimation(final FloatValueHolder floatValueHolder) {
        this.mVelocity = 0.0f;
        this.mValue = Float.MAX_VALUE;
        this.mStartValueIsSet = false;
        this.mRunning = false;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -Float.MAX_VALUE;
        this.mLastFrameTime = 0L;
        this.mStartDelay = 0L;
        this.mEndListeners = new ArrayList<>();
        this.mUpdateListeners = new ArrayList<>();
        this.mTarget = null;
        this.mProperty = new FloatProperty("FloatValueHolder") { // from class: miuix.animation.physics.DynamicAnimation.1
            @Override // miuix.animation.property.FloatProperty
            public float getValue(Object obj) {
                return floatValueHolder.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(Object obj, float f2) {
                floatValueHolder.setValue(f2);
            }
        };
        this.mMinVisibleChange = 1.0f;
    }

    private void endAnimationInternal(boolean z2) {
        this.mRunning = false;
        AnimationHandler.getInstance().removeCallback(this);
        this.mLastFrameTime = 0L;
        this.mStartValueIsSet = false;
        for (int i2 = 0; i2 < this.mEndListeners.size(); i2++) {
            if (this.mEndListeners.get(i2) != null) {
                this.mEndListeners.get(i2).onAnimationEnd(this, z2, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mEndListeners);
    }

    private float getPropertyValue() {
        return this.mProperty.getValue(this.mTarget);
    }

    private static <T> void removeEntry(ArrayList<T> arrayList, T t2) {
        int iIndexOf = arrayList.indexOf(t2);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private static <T> void removeNullEntries(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void startAnimationInternal() {
        if (this.mRunning) {
            return;
        }
        this.mRunning = true;
        if (!this.mStartValueIsSet) {
            this.mValue = getPropertyValue();
        }
        float f2 = this.mValue;
        if (f2 > this.mMaxValue || f2 < this.mMinValue) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        AnimationHandler.getInstance().addAnimationFrameCallback(this, this.mStartDelay);
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        if (!this.mEndListeners.contains(onAnimationEndListener)) {
            this.mEndListeners.add(onAnimationEndListener);
        }
        return this;
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (isRunning()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe miuix.animation.");
        }
        if (!this.mUpdateListeners.contains(onAnimationUpdateListener)) {
            this.mUpdateListeners.add(onAnimationUpdateListener);
        }
        return this;
    }

    public void cancel() {
        if (!getAnimationHandler().isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.mRunning) {
            endAnimationInternal(true);
        }
    }

    @Override // miuix.animation.physics.AnimationHandler.AnimationFrameCallback
    public boolean doAnimationFrame(long j2) {
        long j3 = this.mLastFrameTime;
        if (j3 == 0) {
            this.mLastFrameTime = j2;
            setPropertyValue(this.mValue);
            return false;
        }
        this.mLastFrameTime = j2;
        boolean zUpdateValueAndVelocity = updateValueAndVelocity(j2 - j3);
        float fMin = Math.min(this.mValue, this.mMaxValue);
        this.mValue = fMin;
        float fMax = Math.max(fMin, this.mMinValue);
        this.mValue = fMax;
        setPropertyValue(fMax);
        if (zUpdateValueAndVelocity) {
            endAnimationInternal(false);
        }
        return zUpdateValueAndVelocity;
    }

    abstract float getAcceleration(float f2, float f3);

    public AnimationHandler getAnimationHandler() {
        return AnimationHandler.getInstance();
    }

    public float getMinimumVisibleChange() {
        return this.mMinVisibleChange;
    }

    float getValueThreshold() {
        return this.mMinVisibleChange * 0.75f;
    }

    abstract boolean isAtEquilibrium(float f2, float f3);

    public boolean isRunning() {
        return this.mRunning;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        removeEntry(this.mEndListeners, onAnimationEndListener);
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        removeEntry(this.mUpdateListeners, onAnimationUpdateListener);
    }

    public T setMaxValue(float f2) {
        this.mMaxValue = f2;
        return this;
    }

    public T setMinValue(float f2) {
        this.mMinValue = f2;
        return this;
    }

    public T setMinimumVisibleChange(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.mMinVisibleChange = f2;
        setValueThreshold(f2 * 0.75f);
        return this;
    }

    void setPropertyValue(float f2) {
        this.mProperty.setValue(this.mTarget, f2);
        for (int i2 = 0; i2 < this.mUpdateListeners.size(); i2++) {
            if (this.mUpdateListeners.get(i2) != null) {
                this.mUpdateListeners.get(i2).onAnimationUpdate(this, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mUpdateListeners);
    }

    public void setStartDelay(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        this.mStartDelay = j2;
    }

    public T setStartValue(float f2) {
        this.mValue = f2;
        this.mStartValueIsSet = true;
        return this;
    }

    public T setStartVelocity(float f2) {
        this.mVelocity = f2;
        return this;
    }

    abstract void setValueThreshold(float f2);

    public void start() {
        if (!getAnimationHandler().isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.mRunning) {
            return;
        }
        startAnimationInternal();
    }

    abstract boolean updateValueAndVelocity(long j2);

    <K> DynamicAnimation(K k2, FloatProperty<K> floatProperty) {
        this.mVelocity = 0.0f;
        this.mValue = Float.MAX_VALUE;
        this.mStartValueIsSet = false;
        this.mRunning = false;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -Float.MAX_VALUE;
        this.mLastFrameTime = 0L;
        this.mStartDelay = 0L;
        this.mEndListeners = new ArrayList<>();
        this.mUpdateListeners = new ArrayList<>();
        this.mTarget = k2;
        this.mProperty = floatProperty;
        if (floatProperty != ViewProperty.ROTATION && floatProperty != ViewProperty.ROTATION_X && floatProperty != ViewProperty.ROTATION_Y) {
            if (floatProperty == ViewProperty.ALPHA) {
                this.mMinVisibleChange = 0.00390625f;
                return;
            } else if (floatProperty != ViewProperty.SCALE_X && floatProperty != ViewProperty.SCALE_Y) {
                this.mMinVisibleChange = 1.0f;
                return;
            } else {
                this.mMinVisibleChange = 0.002f;
                return;
            }
        }
        this.mMinVisibleChange = 0.1f;
    }
}

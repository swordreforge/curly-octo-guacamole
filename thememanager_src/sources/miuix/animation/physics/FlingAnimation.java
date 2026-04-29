package miuix.animation.physics;

import miuix.animation.physics.DynamicAnimation;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.FloatValueHolder;

/* JADX INFO: loaded from: classes3.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce;

    private static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction;
        private final DynamicAnimation.MassState mMassState;
        private float mVelocityThreshold;

        private DragForce() {
            this.mFriction = DEFAULT_FRICTION;
            this.mMassState = new DynamicAnimation.MassState();
        }

        @Override // miuix.animation.physics.Force
        public float getAcceleration(float f2, float f3) {
            return f3 * this.mFriction;
        }

        float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        @Override // miuix.animation.physics.Force
        public boolean isAtEquilibrium(float f2, float f3) {
            return Math.abs(f3) < this.mVelocityThreshold;
        }

        void setFrictionScalar(float f2) {
            this.mFriction = f2 * DEFAULT_FRICTION;
        }

        void setValueThreshold(float f2) {
            this.mVelocityThreshold = f2 * VELOCITY_THRESHOLD_MULTIPLIER;
        }

        DynamicAnimation.MassState updateValueAndVelocity(float f2, float f3, long j2) {
            float f4 = j2;
            this.mMassState.mVelocity = (float) (((double) f3) * Math.exp((f4 / 1000.0f) * this.mFriction));
            DynamicAnimation.MassState massState = this.mMassState;
            float f5 = this.mFriction;
            massState.mValue = (float) (((double) (f2 - (f3 / f5))) + (((double) (f3 / f5)) * Math.exp((f5 * f4) / 1000.0f)));
            DynamicAnimation.MassState massState2 = this.mMassState;
            if (isAtEquilibrium(massState2.mValue, massState2.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    @Override // miuix.animation.physics.DynamicAnimation
    float getAcceleration(float f2, float f3) {
        return this.mFlingForce.getAcceleration(f2, f3);
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // miuix.animation.physics.DynamicAnimation
    boolean isAtEquilibrium(float f2, float f3) {
        return f2 >= this.mMaxValue || f2 <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f2, f3);
    }

    public FlingAnimation setFriction(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.mFlingForce.setFrictionScalar(f2);
        return this;
    }

    @Override // miuix.animation.physics.DynamicAnimation
    void setValueThreshold(float f2) {
        this.mFlingForce.setValueThreshold(f2);
    }

    @Override // miuix.animation.physics.DynamicAnimation
    boolean updateValueAndVelocity(long j2) {
        DynamicAnimation.MassState massStateUpdateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j2);
        float f2 = massStateUpdateValueAndVelocity.mValue;
        this.mValue = f2;
        float f3 = massStateUpdateValueAndVelocity.mVelocity;
        this.mVelocity = f3;
        float f4 = this.mMinValue;
        if (f2 < f4) {
            this.mValue = f4;
            return true;
        }
        float f5 = this.mMaxValue;
        if (f2 <= f5) {
            return isAtEquilibrium(f2, f3);
        }
        this.mValue = f5;
        return true;
    }

    @Override // miuix.animation.physics.DynamicAnimation
    public FlingAnimation setMaxValue(float f2) {
        super.setMaxValue(f2);
        return this;
    }

    @Override // miuix.animation.physics.DynamicAnimation
    public FlingAnimation setMinValue(float f2) {
        super.setMinValue(f2);
        return this;
    }

    @Override // miuix.animation.physics.DynamicAnimation
    public FlingAnimation setStartVelocity(float f2) {
        super.setStartVelocity(f2);
        return this;
    }

    public <K> FlingAnimation(K k2, FloatProperty<K> floatProperty) {
        super(k2, floatProperty);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }
}

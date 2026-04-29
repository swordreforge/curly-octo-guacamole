package miuix.animation.physics;

import miuix.animation.physics.DynamicAnimation;

/* JADX INFO: loaded from: classes3.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the miuix.animation starts");
        }
        double d2 = this.mDampingRatio;
        if (d2 > 1.0d) {
            double d4 = this.mNaturalFreq;
            this.mGammaPlus = ((-d2) * d4) + (d4 * Math.sqrt((d2 * d2) - 1.0d));
            double d5 = this.mDampingRatio;
            double d6 = this.mNaturalFreq;
            this.mGammaMinus = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
        } else if (d2 >= 0.0d && d2 < 1.0d) {
            this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d2 * d2));
        }
        this.mInitialized = true;
    }

    @Override // miuix.animation.physics.Force
    public float getAcceleration(float f2, float f3) {
        float finalPosition = f2 - getFinalPosition();
        double d2 = this.mNaturalFreq;
        return (float) (((-(d2 * d2)) * ((double) finalPosition)) - (((d2 * 2.0d) * this.mDampingRatio) * ((double) f3)));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d2 = this.mNaturalFreq;
        return (float) (d2 * d2);
    }

    @Override // miuix.animation.physics.Force
    public boolean isAtEquilibrium(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.mVelocityThreshold && ((double) Math.abs(f2 - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f2;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f2) {
        this.mFinalPosition = f2;
        return this;
    }

    public SpringForce setStiffness(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f2);
        this.mInitialized = false;
        return this;
    }

    void setValueThreshold(double d2) {
        double dAbs = Math.abs(d2);
        this.mValueThreshold = dAbs;
        this.mVelocityThreshold = dAbs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    DynamicAnimation.MassState updateValues(double d2, double d4, long j2) {
        double dCos;
        double dPow;
        init();
        double d5 = j2 / 1000.0d;
        double d6 = d2 - this.mFinalPosition;
        double d7 = this.mDampingRatio;
        if (d7 > 1.0d) {
            double d8 = this.mGammaMinus;
            double d9 = this.mGammaPlus;
            double d10 = d6 - (((d8 * d6) - d4) / (d8 - d9));
            double d11 = ((d6 * d8) - d4) / (d8 - d9);
            dPow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.mGammaPlus * d5) * d11);
            double d12 = this.mGammaMinus;
            double dPow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.mGammaPlus;
            dCos = dPow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.mNaturalFreq;
            double d15 = d4 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            dPow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double dPow3 = d16 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d5);
            double d17 = this.mNaturalFreq;
            dCos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (dPow3 * (-d17));
        } else {
            double d18 = 1.0d / this.mDampedFreq;
            double d19 = this.mNaturalFreq;
            double d20 = d18 * ((d7 * d19 * d6) + d4);
            double dPow4 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.mDampedFreq * d5) * d6) + (Math.sin(this.mDampedFreq * d5) * d20));
            double d21 = this.mNaturalFreq;
            double d22 = this.mDampingRatio;
            double d23 = (-d21) * dPow4 * d22;
            double dPow5 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d24 = this.mDampedFreq;
            double dSin = (-d24) * d6 * Math.sin(d24 * d5);
            double d25 = this.mDampedFreq;
            dCos = d23 + (dPow5 * (dSin + (d20 * d25 * Math.cos(d25 * d5))));
            dPow = dPow4;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (dPow + this.mFinalPosition);
        massState.mVelocity = (float) dCos;
        return massState;
    }

    public SpringForce(float f2) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f2;
    }
}

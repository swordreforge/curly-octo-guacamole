package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.toq;

/* JADX INFO: compiled from: SpringAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class f7l8 extends toq<f7l8> {

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final float f51033oc = Float.MAX_VALUE;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f51034d3;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f51035gvn7;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private C0802y f51036jp0y;

    public f7l8(C0792n c0792n) {
        super(c0792n);
        this.f51036jp0y = null;
        this.f51035gvn7 = Float.MAX_VALUE;
        this.f51034d3 = false;
    }

    /* JADX INFO: renamed from: t */
    private void m3799t() {
        C0802y c0802y = this.f51036jp0y;
        if (c0802y == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double qVar = c0802y.toq();
        if (qVar > this.f51061f7l8) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (qVar < this.f4416y) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // androidx.dynamicanimation.animation.toq
    void fn3e(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.toq
    boolean fu4(long j2) {
        if (this.f51034d3) {
            float f2 = this.f51035gvn7;
            if (f2 != Float.MAX_VALUE) {
                this.f51036jp0y.m3851g(f2);
                this.f51035gvn7 = Float.MAX_VALUE;
            }
            this.f51063toq = this.f51036jp0y.toq();
            this.f4411k = 0.0f;
            this.f51034d3 = false;
            return true;
        }
        if (this.f51035gvn7 != Float.MAX_VALUE) {
            this.f51036jp0y.toq();
            long j3 = j2 / 2;
            toq.C0795h c0795hM3854s = this.f51036jp0y.m3854s(this.f51063toq, this.f4411k, j3);
            this.f51036jp0y.m3851g(this.f51035gvn7);
            this.f51035gvn7 = Float.MAX_VALUE;
            toq.C0795h c0795hM3854s2 = this.f51036jp0y.m3854s(c0795hM3854s.f4417k, c0795hM3854s.f51068toq, j3);
            this.f51063toq = c0795hM3854s2.f4417k;
            this.f4411k = c0795hM3854s2.f51068toq;
        } else {
            toq.C0795h c0795hM3854s3 = this.f51036jp0y.m3854s(this.f51063toq, this.f4411k, j2);
            this.f51063toq = c0795hM3854s3.f4417k;
            this.f4411k = c0795hM3854s3.f51068toq;
        }
        float fMax = Math.max(this.f51063toq, this.f4416y);
        this.f51063toq = fMax;
        float fMin = Math.min(fMax, this.f51061f7l8);
        this.f51063toq = fMin;
        if (!mo3801s(fMin, this.f4411k)) {
            return false;
        }
        this.f51063toq = this.f51036jp0y.toq();
        this.f4411k = 0.0f;
        return true;
    }

    public void jk() {
        if (!o1t()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4410g) {
            this.f51034d3 = true;
        }
    }

    public f7l8 mcp(C0802y c0802y) {
        this.f51036jp0y = c0802y;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: n */
    float mo3800n(float f2, float f3) {
        return this.f51036jp0y.getAcceleration(f2, f3);
    }

    public boolean o1t() {
        return this.f51036jp0y.f51078toq > 0.0d;
    }

    @Override // androidx.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: s */
    boolean mo3801s(float f2, float f3) {
        return this.f51036jp0y.isAtEquilibrium(f2, f3);
    }

    public C0802y wvg() {
        return this.f51036jp0y;
    }

    /* JADX INFO: renamed from: z */
    public void m3802z(float f2) {
        if (m3818p()) {
            this.f51035gvn7 = f2;
            return;
        }
        if (this.f51036jp0y == null) {
            this.f51036jp0y = new C0802y(f2);
        }
        this.f51036jp0y.m3851g(f2);
        zurt();
    }

    @Override // androidx.dynamicanimation.animation.toq
    public void zurt() {
        m3799t();
        this.f51036jp0y.m3855y(m3819y());
        super.zurt();
    }

    public <K> f7l8(K k2, AbstractC0793q<K> abstractC0793q) {
        super(k2, abstractC0793q);
        this.f51036jp0y = null;
        this.f51035gvn7 = Float.MAX_VALUE;
        this.f51034d3 = false;
    }

    public <K> f7l8(K k2, AbstractC0793q<K> abstractC0793q, float f2) {
        super(k2, abstractC0793q);
        this.f51036jp0y = null;
        this.f51035gvn7 = Float.MAX_VALUE;
        this.f51034d3 = false;
        this.f51036jp0y = new C0802y(f2);
    }
}

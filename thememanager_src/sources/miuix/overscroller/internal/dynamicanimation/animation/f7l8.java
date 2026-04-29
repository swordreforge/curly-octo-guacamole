package miuix.overscroller.internal.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import miuix.overscroller.internal.dynamicanimation.animation.toq;

/* JADX INFO: compiled from: SpringAnimation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f7l8 extends toq<f7l8> {

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final float f87882eqxt = Float.MAX_VALUE;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private float f87883d3;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private C7226y f87884gvn7;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private boolean f87885oc;

    public f7l8(C7216n c7216n) {
        super(c7216n);
        this.f87884gvn7 = null;
        this.f87883d3 = Float.MAX_VALUE;
        this.f87885oc = false;
    }

    private void mcp() {
        C7226y c7226y = this.f87884gvn7;
        if (c7226y == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double qVar = c7226y.toq();
        if (qVar > this.f87910f7l8) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (qVar < this.f40743y) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public void a9() {
        if (!wvg()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f40737g) {
            this.f87885oc = true;
        }
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    void fn3e(float f2) {
    }

    public f7l8 jk(C7226y c7226y) {
        this.f87884gvn7 = c7226y;
        return this;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: n */
    float mo26182n(float f2, float f3) {
        return this.f87884gvn7.getAcceleration(f2, f3);
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    public void ni7(boolean z2) {
        mcp();
        this.f87884gvn7.m26238s(m26202y());
        super.ni7(z2);
    }

    public void o1t(float f2) {
        if (m26201p()) {
            this.f87883d3 = f2;
            return;
        }
        if (this.f87884gvn7 == null) {
            this.f87884gvn7 = new C7226y(f2);
        }
        this.f87884gvn7.m26234g(f2);
        zurt();
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: s */
    boolean mo26183s(float f2, float f3) {
        return this.f87884gvn7.isAtEquilibrium(f2, f3);
    }

    /* JADX INFO: renamed from: t */
    public C7226y m26184t() {
        return this.f87884gvn7;
    }

    public boolean wvg() {
        return this.f87884gvn7.f87930toq > 0.0d;
    }

    @Override // miuix.overscroller.internal.dynamicanimation.animation.toq
    /* JADX INFO: renamed from: z */
    boolean mo26185z(long j2) {
        if (this.f87885oc) {
            float f2 = this.f87883d3;
            if (f2 != Float.MAX_VALUE) {
                this.f87884gvn7.m26234g(f2);
                this.f87883d3 = Float.MAX_VALUE;
            }
            this.f87913toq = this.f87884gvn7.toq();
            this.f40738k = 0.0f;
            this.f87885oc = false;
            return true;
        }
        if (this.f87883d3 != Float.MAX_VALUE) {
            this.f87884gvn7.toq();
            long j3 = j2 / 2;
            toq.C7219h c7219hM26237p = this.f87884gvn7.m26237p(this.f87913toq, this.f40738k, j3);
            this.f87884gvn7.m26234g(this.f87883d3);
            this.f87883d3 = Float.MAX_VALUE;
            toq.C7219h c7219hM26237p2 = this.f87884gvn7.m26237p(c7219hM26237p.f40744k, c7219hM26237p.f87918toq, j3);
            this.f87913toq = c7219hM26237p2.f40744k;
            this.f40738k = c7219hM26237p2.f87918toq;
        } else {
            toq.C7219h c7219hM26237p3 = this.f87884gvn7.m26237p(this.f87913toq, this.f40738k, j2);
            this.f87913toq = c7219hM26237p3.f40744k;
            this.f40738k = c7219hM26237p3.f87918toq;
        }
        float fMax = Math.max(this.f87913toq, this.f40743y);
        this.f87913toq = fMax;
        float fMin = Math.min(fMax, this.f87910f7l8);
        this.f87913toq = fMin;
        if (!mo26183s(fMin, this.f40738k)) {
            return false;
        }
        this.f87913toq = this.f87884gvn7.toq();
        this.f40738k = 0.0f;
        return true;
    }

    public <K> f7l8(K k2, AbstractC7217q<K> abstractC7217q) {
        super(k2, abstractC7217q);
        this.f87884gvn7 = null;
        this.f87883d3 = Float.MAX_VALUE;
        this.f87885oc = false;
    }

    public <K> f7l8(K k2, AbstractC7217q<K> abstractC7217q, float f2) {
        super(k2, abstractC7217q);
        this.f87884gvn7 = null;
        this.f87883d3 = Float.MAX_VALUE;
        this.f87885oc = false;
        this.f87884gvn7 = new C7226y(f2);
    }
}

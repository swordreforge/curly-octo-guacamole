package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: compiled from: ScrollerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ki {

    /* JADX INFO: renamed from: k */
    OverScroller f4284k;

    ki(Context context, Interpolator interpolator) {
        this.f4284k = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static ki m3648q(Context context, Interpolator interpolator) {
        return new ki(context, interpolator);
    }

    @Deprecated
    public static ki zy(Context context) {
        return m3648q(context, null);
    }

    @Deprecated
    public void cdj(int i2, int i3, int i4, int i5) {
        this.f4284k.startScroll(i2, i3, i4, i5);
    }

    @Deprecated
    public float f7l8() {
        return this.f4284k.getCurrVelocity();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void m3649g(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f4284k.fling(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public boolean m3650h(int i2, int i3, int i4, int i5, int i6, int i7) {
        return this.f4284k.springBack(i2, i3, i4, i5, i6, i7);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m3651k() {
        this.f4284k.abortAnimation();
    }

    @Deprecated
    public void ki(int i2, int i3, int i4, int i5, int i6) {
        this.f4284k.startScroll(i2, i3, i4, i5, i6);
    }

    @Deprecated
    public void kja0(int i2, int i3, int i4) {
        this.f4284k.notifyVerticalEdgeReached(i2, i3, i4);
    }

    @Deprecated
    public int ld6() {
        return this.f4284k.getFinalY();
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public void m3652n(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f4284k.fling(i2, i3, i4, i5, i6, i7, i8, i9);
    }

    @Deprecated
    public void n7h(int i2, int i3, int i4) {
        this.f4284k.notifyHorizontalEdgeReached(i2, i3, i4);
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public int m3653p() {
        return this.f4284k.getFinalX();
    }

    @Deprecated
    public boolean qrj() {
        return this.f4284k.isOverScrolled();
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public int m3654s() {
        return this.f4284k.getCurrY();
    }

    @Deprecated
    public boolean toq() {
        return this.f4284k.computeScrollOffset();
    }

    @Deprecated
    public boolean x2() {
        return this.f4284k.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public int m3655y() {
        return this.f4284k.getCurrX();
    }
}

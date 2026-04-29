package miuix.springback.view;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* JADX INFO: renamed from: miuix.springback.view.k */
/* JADX INFO: compiled from: SpringBackLayoutHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7359k {

    /* JADX INFO: renamed from: y */
    private static final int f41884y = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ViewGroup f90395f7l8;

    /* JADX INFO: renamed from: g */
    int f41885g;

    /* JADX INFO: renamed from: k */
    private int f41886k;

    /* JADX INFO: renamed from: n */
    int f41887n;

    /* JADX INFO: renamed from: q */
    int f41888q = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    float f90396toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    float f90397zy;

    public C7359k(ViewGroup viewGroup, int i2) {
        this.f90395f7l8 = viewGroup;
        this.f41885g = i2;
        this.f41886k = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: k */
    void m26732k(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int pointerId = motionEvent.getPointerId(0);
            this.f41888q = pointerId;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return;
            }
            this.f90396toq = motionEvent.getY(iFindPointerIndex2);
            this.f90397zy = motionEvent.getX(iFindPointerIndex2);
            this.f41887n = 0;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i2 = this.f41888q;
                if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float f2 = y3 - this.f90396toq;
                    float f3 = x3 - this.f90397zy;
                    if (Math.abs(f3) > this.f41886k || Math.abs(f2) > this.f41886k) {
                        this.f41887n = Math.abs(f3) <= Math.abs(f2) ? 2 : 1;
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        this.f41887n = 0;
        this.f90395f7l8.requestDisallowInterceptTouchEvent(false);
    }

    public boolean toq(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        if (iFindPointerIndex < 0) {
            return false;
        }
        float y3 = motionEvent.getY(iFindPointerIndex);
        float x3 = motionEvent.getX(iFindPointerIndex);
        int[] iArr = {0, 0};
        this.f90395f7l8.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new Rect(i2, i3, this.f90395f7l8.getWidth() + i2, this.f90395f7l8.getHeight() + i3).contains((int) x3, (int) y3);
    }

    public boolean zy(MotionEvent motionEvent) {
        m26732k(motionEvent);
        int i2 = this.f41887n;
        if (i2 == 0 || i2 == this.f41885g) {
            this.f90395f7l8.requestDisallowInterceptTouchEvent(false);
            return true;
        }
        this.f90395f7l8.requestDisallowInterceptTouchEvent(true);
        return false;
    }
}

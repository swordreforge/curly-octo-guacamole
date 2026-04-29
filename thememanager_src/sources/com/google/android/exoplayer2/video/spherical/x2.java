package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.C3888q;

/* JADX INFO: compiled from: TouchTracker.java */
/* JADX INFO: loaded from: classes2.dex */
final class x2 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C3888q.k {

    /* JADX INFO: renamed from: p */
    static final float f23553p = 45.0f;

    /* JADX INFO: renamed from: g */
    private final float f23554g;

    /* JADX INFO: renamed from: n */
    private final InterfaceC3890k f23556n;

    /* JADX INFO: renamed from: y */
    private final GestureDetector f23559y;

    /* JADX INFO: renamed from: k */
    private final PointF f23555k = new PointF();

    /* JADX INFO: renamed from: q */
    private final PointF f23557q = new PointF();

    /* JADX INFO: renamed from: s */
    private volatile float f23558s = 3.1415927f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.x2$k */
    /* JADX INFO: compiled from: TouchTracker.java */
    public interface InterfaceC3890k {
        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        void toq(PointF pointF);
    }

    public x2(Context context, InterfaceC3890k interfaceC3890k, float f2) {
        this.f23556n = interfaceC3890k;
        this.f23554g = f2;
        this.f23559y = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.C3888q.k
    @zy.f7l8
    /* JADX INFO: renamed from: k */
    public void mo13838k(float[] fArr, float f2) {
        this.f23558s = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f23555k.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x3 = (motionEvent2.getX() - this.f23555k.x) / this.f23554g;
        float y3 = motionEvent2.getY();
        PointF pointF = this.f23555k;
        float f4 = (y3 - pointF.y) / this.f23554g;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.f23558s;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        PointF pointF2 = this.f23557q;
        pointF2.x -= (fCos * x3) - (fSin * f4);
        float f5 = pointF2.y + (fSin * x3) + (fCos * f4);
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(f23553p, f5));
        this.f23556n.toq(this.f23557q);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f23556n.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f23559y.onTouchEvent(motionEvent);
    }
}

package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import zy.uv6;

/* JADX INFO: compiled from: ForwardingListener.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class dd implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    final View f995g;

    /* JADX INFO: renamed from: h */
    private int f996h;

    /* JADX INFO: renamed from: i */
    private final int[] f997i = new int[2];

    /* JADX INFO: renamed from: k */
    private final float f998k;

    /* JADX INFO: renamed from: n */
    private final int f999n;

    /* JADX INFO: renamed from: p */
    private boolean f1000p;

    /* JADX INFO: renamed from: q */
    private final int f1001q;

    /* JADX INFO: renamed from: s */
    private Runnable f1002s;

    /* JADX INFO: renamed from: y */
    private Runnable f1003y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.dd$k */
    /* JADX INFO: compiled from: ForwardingListener.java */
    private class RunnableC0187k implements Runnable {
        RunnableC0187k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = dd.this.f995g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: ForwardingListener.java */
    private class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dd.this.m581n();
        }
    }

    public dd(View view) {
        this.f995g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f998k = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1001q = tapTimeout;
        this.f999n = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f7l8(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f995g
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f996h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f998k
            boolean r6 = m580y(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m577k()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m577k()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f996h = r6
            java.lang.Runnable r6 = r5.f1003y
            if (r6 != 0) goto L52
            androidx.appcompat.widget.dd$k r6 = new androidx.appcompat.widget.dd$k
            r6.<init>()
            r5.f1003y = r6
        L52:
            java.lang.Runnable r6 = r5.f1003y
            int r1 = r5.f1001q
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1002s
            if (r6 != 0) goto L65
            androidx.appcompat.widget.dd$toq r6 = new androidx.appcompat.widget.dd$toq
            r6.<init>()
            r5.f1002s = r6
        L65:
            java.lang.Runnable r6 = r5.f1002s
            int r1 = r5.f999n
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.dd.f7l8(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: g */
    private boolean m576g(MotionEvent motionEvent) {
        d2ok d2okVar;
        View view = this.f995g;
        androidx.appcompat.view.menu.cdj qVar = toq();
        if (qVar == null || !qVar.isShowing() || (d2okVar = (d2ok) qVar.n7h()) == null || !d2okVar.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m579s(view, motionEventObtainNoHistory);
        m578p(d2okVar, motionEventObtainNoHistory);
        boolean zMo472g = d2okVar.mo472g(motionEventObtainNoHistory, this.f996h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zMo472g && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX INFO: renamed from: k */
    private void m577k() {
        Runnable runnable = this.f1002s;
        if (runnable != null) {
            this.f995g.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1003y;
        if (runnable2 != null) {
            this.f995g.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m578p(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f997i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: s */
    private boolean m579s(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f997i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m580y(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    /* JADX INFO: renamed from: n */
    void m581n() {
        m577k();
        View view = this.f995g;
        if (view.isEnabled() && !view.isLongClickable() && zy()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1000p = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = this.f1000p;
        if (z3) {
            z2 = m576g(motionEvent) || !mo432q();
        } else {
            z2 = f7l8(motionEvent) && zy();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f995g.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1000p = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1000p = false;
        this.f996h = -1;
        Runnable runnable = this.f1003y;
        if (runnable != null) {
            this.f995g.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: q */
    protected boolean mo432q() {
        androidx.appcompat.view.menu.cdj qVar = toq();
        if (qVar == null || !qVar.isShowing()) {
            return true;
        }
        qVar.dismiss();
        return true;
    }

    public abstract androidx.appcompat.view.menu.cdj toq();

    protected boolean zy() {
        androidx.appcompat.view.menu.cdj qVar = toq();
        if (qVar == null || qVar.isShowing()) {
            return true;
        }
        qVar.mo318g();
        return true;
    }
}

package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: GestureDetectorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: k */
    private final InterfaceC0739k f4185k;

    /* JADX INFO: renamed from: androidx.core.view.x2$k */
    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    interface InterfaceC0739k {
        boolean ld6();

        /* JADX INFO: renamed from: p */
        void mo3555p(boolean z2);

        /* JADX INFO: renamed from: s */
        void mo3556s(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* JADX INFO: renamed from: y */
        boolean mo3557y(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    static class toq implements InterfaceC0739k {

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final int f50949fu4 = 1;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final int f50951o1t = 3;

        /* JADX INFO: renamed from: z */
        private static final int f4186z = 2;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private float f50953cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f50954f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private VelocityTracker f50955fn3e;

        /* JADX INFO: renamed from: g */
        final GestureDetector.OnGestureListener f4187g;

        /* JADX INFO: renamed from: h */
        private float f4188h;

        /* JADX INFO: renamed from: i */
        private boolean f4189i;

        /* JADX INFO: renamed from: k */
        private int f4190k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private float f50956ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f50957kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f50958ld6;

        /* JADX INFO: renamed from: n */
        private final Handler f4191n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private MotionEvent f50959n7h;

        /* JADX INFO: renamed from: p */
        private boolean f4192p;

        /* JADX INFO: renamed from: q */
        private int f4193q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        MotionEvent f50960qrj;

        /* JADX INFO: renamed from: s */
        boolean f4194s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private float f50961t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50962toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f50963x2;

        /* JADX INFO: renamed from: y */
        boolean f4195y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f50964zy;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static final int f50952zurt = ViewConfiguration.getTapTimeout();

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private static final int f50950ni7 = ViewConfiguration.getDoubleTapTimeout();

        toq(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f4191n = new HandlerC0740k(handler);
            } else {
                this.f4191n = new HandlerC0740k();
            }
            this.f4187g = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo3556s((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m3560q(context);
        }

        /* JADX INFO: renamed from: k */
        private void m3558k() {
            this.f4191n.removeMessages(1);
            this.f4191n.removeMessages(2);
            this.f4191n.removeMessages(3);
            this.f50955fn3e.recycle();
            this.f50955fn3e = null;
            this.f50957kja0 = false;
            this.f4195y = false;
            this.f50958ld6 = false;
            this.f50963x2 = false;
            this.f4194s = false;
            if (this.f4192p) {
                this.f4192p = false;
            }
        }

        /* JADX INFO: renamed from: n */
        private boolean m3559n(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f50963x2 || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f50950ni7) {
                return false;
            }
            int x3 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y3 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x3 * x3) + (y3 * y3) < this.f50962toq;
        }

        /* JADX INFO: renamed from: q */
        private void m3560q(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f4187g == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f4189i = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f50964zy = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4193q = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4190k = scaledTouchSlop * scaledTouchSlop;
            this.f50962toq = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        private void toq() {
            this.f4191n.removeMessages(1);
            this.f4191n.removeMessages(2);
            this.f4191n.removeMessages(3);
            this.f50957kja0 = false;
            this.f50958ld6 = false;
            this.f50963x2 = false;
            this.f4194s = false;
            if (this.f4192p) {
                this.f4192p = false;
            }
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        public boolean ld6() {
            return this.f4189i;
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        /* JADX INFO: renamed from: p */
        public void mo3555p(boolean z2) {
            this.f4189i = z2;
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        /* JADX INFO: renamed from: s */
        public void mo3556s(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f50954f7l8 = onDoubleTapListener;
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        /* JADX INFO: renamed from: y */
        public boolean mo3557y(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.f50955fn3e == null) {
                this.f50955fn3e = VelocityTracker.obtain();
            }
            this.f50955fn3e.addMovement(motionEvent);
            int i2 = action & 255;
            boolean z2 = i2 == 6;
            int actionIndex = z2 ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float x3 = 0.0f;
            float y3 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x3 += motionEvent.getX(i3);
                    y3 += motionEvent.getY(i3);
                }
            }
            float f2 = z2 ? pointerCount - 1 : pointerCount;
            float f3 = x3 / f2;
            float f4 = y3 / f2;
            if (i2 == 0) {
                if (this.f50954f7l8 == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f4191n.hasMessages(3);
                    if (zHasMessages) {
                        this.f4191n.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f50960qrj;
                    if (motionEvent3 == null || (motionEvent2 = this.f50959n7h) == null || !zHasMessages || !m3559n(motionEvent3, motionEvent2, motionEvent)) {
                        this.f4191n.sendEmptyMessageDelayed(3, f50950ni7);
                        zOnDoubleTap = false;
                    } else {
                        this.f50957kja0 = true;
                        zOnDoubleTap = this.f50954f7l8.onDoubleTap(this.f50960qrj) | false | this.f50954f7l8.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f4188h = f3;
                this.f50956ki = f3;
                this.f50953cdj = f4;
                this.f50961t8r = f4;
                MotionEvent motionEvent4 = this.f50960qrj;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f50960qrj = MotionEvent.obtain(motionEvent);
                this.f50958ld6 = true;
                this.f50963x2 = true;
                this.f4195y = true;
                this.f4192p = false;
                this.f4194s = false;
                if (this.f4189i) {
                    this.f4191n.removeMessages(2);
                    this.f4191n.sendEmptyMessageAtTime(2, this.f50960qrj.getDownTime() + ((long) f50952zurt) + ((long) ViewConfiguration.getLongPressTimeout()));
                }
                this.f4191n.sendEmptyMessageAtTime(1, this.f50960qrj.getDownTime() + ((long) f50952zurt));
                return zOnDoubleTap | this.f4187g.onDown(motionEvent);
            }
            if (i2 == 1) {
                this.f4195y = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f50957kja0) {
                    zOnFling = this.f50954f7l8.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.f4192p) {
                        this.f4191n.removeMessages(3);
                        this.f4192p = false;
                    } else if (this.f50958ld6) {
                        boolean zOnSingleTapUp = this.f4187g.onSingleTapUp(motionEvent);
                        if (this.f4194s && (onDoubleTapListener = this.f50954f7l8) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f50955fn3e;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f4193q);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f50964zy || Math.abs(xVelocity) > this.f50964zy) {
                            zOnFling = this.f4187g.onFling(this.f50960qrj, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f50959n7h;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f50959n7h = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f50955fn3e;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f50955fn3e = null;
                }
                this.f50957kja0 = false;
                this.f4194s = false;
                this.f4191n.removeMessages(1);
                this.f4191n.removeMessages(2);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        m3558k();
                        return false;
                    }
                    if (i2 == 5) {
                        this.f4188h = f3;
                        this.f50956ki = f3;
                        this.f50953cdj = f4;
                        this.f50961t8r = f4;
                        toq();
                        return false;
                    }
                    if (i2 != 6) {
                        return false;
                    }
                    this.f4188h = f3;
                    this.f50956ki = f3;
                    this.f50953cdj = f4;
                    this.f50961t8r = f4;
                    this.f50955fn3e.computeCurrentVelocity(1000, this.f4193q);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f50955fn3e.getXVelocity(pointerId2);
                    float yVelocity2 = this.f50955fn3e.getYVelocity(pointerId2);
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        if (i4 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i4);
                            if ((this.f50955fn3e.getXVelocity(pointerId3) * xVelocity2) + (this.f50955fn3e.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f50955fn3e.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.f4192p) {
                    return false;
                }
                float f5 = this.f4188h - f3;
                float f6 = this.f50953cdj - f4;
                if (this.f50957kja0) {
                    return false | this.f50954f7l8.onDoubleTapEvent(motionEvent);
                }
                if (!this.f50958ld6) {
                    if (Math.abs(f5) < 1.0f && Math.abs(f6) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.f4187g.onScroll(this.f50960qrj, motionEvent, f5, f6);
                    this.f4188h = f3;
                    this.f50953cdj = f4;
                    return zOnScroll;
                }
                int i5 = (int) (f3 - this.f50956ki);
                int i6 = (int) (f4 - this.f50961t8r);
                int i7 = (i5 * i5) + (i6 * i6);
                if (i7 > this.f4190k) {
                    zOnFling = this.f4187g.onScroll(this.f50960qrj, motionEvent, f5, f6);
                    this.f4188h = f3;
                    this.f50953cdj = f4;
                    this.f50958ld6 = false;
                    this.f4191n.removeMessages(3);
                    this.f4191n.removeMessages(1);
                    this.f4191n.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (i7 > this.f4190k) {
                    this.f50963x2 = false;
                }
            }
            return zOnFling;
        }

        void zy() {
            this.f4191n.removeMessages(3);
            this.f4194s = false;
            this.f4192p = true;
            this.f4187g.onLongPress(this.f50960qrj);
        }

        /* JADX INFO: renamed from: androidx.core.view.x2$toq$k */
        /* JADX INFO: compiled from: GestureDetectorCompat.java */
        private class HandlerC0740k extends Handler {
            HandlerC0740k() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    toq toqVar = toq.this;
                    toqVar.f4187g.onShowPress(toqVar.f50960qrj);
                    return;
                }
                if (i2 == 2) {
                    toq.this.zy();
                    return;
                }
                if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                toq toqVar2 = toq.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = toqVar2.f50954f7l8;
                if (onDoubleTapListener != null) {
                    if (toqVar2.f4195y) {
                        toqVar2.f4194s = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(toqVar2.f50960qrj);
                    }
                }
            }

            HandlerC0740k(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    static class zy implements InterfaceC0739k {

        /* JADX INFO: renamed from: k */
        private final GestureDetector f4197k;

        zy(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f4197k = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        public boolean ld6() {
            return this.f4197k.isLongpressEnabled();
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        /* JADX INFO: renamed from: p */
        public void mo3555p(boolean z2) {
            this.f4197k.setIsLongpressEnabled(z2);
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        /* JADX INFO: renamed from: s */
        public void mo3556s(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f4197k.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.view.x2.InterfaceC0739k
        /* JADX INFO: renamed from: y */
        public boolean mo3557y(MotionEvent motionEvent) {
            return this.f4197k.onTouchEvent(motionEvent);
        }
    }

    public x2(@zy.lvui Context context, @zy.lvui GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: k */
    public boolean m3553k() {
        return this.f4185k.ld6();
    }

    /* JADX INFO: renamed from: q */
    public void m3554q(@zy.dd GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f4185k.mo3556s(onDoubleTapListener);
    }

    public boolean toq(@zy.lvui MotionEvent motionEvent) {
        return this.f4185k.mo3557y(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void zy(boolean z2) {
        this.f4185k.mo3555p(z2);
    }

    public x2(@zy.lvui Context context, @zy.lvui GestureDetector.OnGestureListener onGestureListener, @zy.dd Handler handler) {
        this.f4185k = new zy(context, onGestureListener, handler);
    }
}

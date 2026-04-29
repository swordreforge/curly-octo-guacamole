package com.android.thememanager.lockscreen.lock.wallpaper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.OverScroller;
import androidx.core.graphics.drawable.C0524q;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: GestureManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nGestureManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureManager.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/GestureManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public class qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @InterfaceC7396q
    private final GestureDetector f60396cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private OverScroller f60397f7l8;

    /* JADX INFO: renamed from: g */
    private int f12517g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final ScaleGestureDetector f12518h;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final View f12519k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f60398ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final ValueAnimator f60399kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    private final Matrix f60400ld6;

    /* JADX INFO: renamed from: n */
    private int f12520n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    private final AnimatorListenerAdapter f60401n7h;

    /* JADX INFO: renamed from: p */
    private float f12521p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final WallpaperPositionInfo f12522q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f60402qrj;

    /* JADX INFO: renamed from: s */
    private float f12523s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @InterfaceC7396q
    private final Matrix f60403t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final InterfaceC2129p f60404toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7395n
    private ValueAnimator f60405x2;

    /* JADX INFO: renamed from: y */
    private boolean f12524y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final Drawable f60406zy;

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.qrj$k */
    /* JADX INFO: compiled from: GestureManager.kt */
    public static final class C2131k extends AnimatorListenerAdapter {
        C2131k() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animation, boolean z2) {
            d2ok.m23075h(animation, "animation");
            super.onAnimationEnd(animation, z2);
            qrj.this.m8152t();
            qrj.this.gvn7(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC7396q Animator animation, boolean z2) {
            d2ok.m23075h(animation, "animation");
            super.onAnimationStart(animation, z2);
            qrj.this.gvn7(true);
        }
    }

    /* JADX INFO: compiled from: GestureManager.kt */
    public static final class toq extends GestureDetector.SimpleOnGestureListener {
        toq() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@InterfaceC7396q MotionEvent e1, @InterfaceC7396q MotionEvent e2, float f2, float f3) {
            d2ok.m23075h(e1, "e1");
            d2ok.m23075h(e2, "e2");
            if (!qrj.this.ni7()) {
                return false;
            }
            qrj.this.f12520n = (int) e2.getX();
            qrj.this.f12517g = (int) e2.getY();
            RectF rectFM8150i = qrj.this.m8150i();
            int i2 = qrj.this.f12520n;
            int i3 = qrj.this.f12517g;
            int i4 = (int) f2;
            int i5 = (int) f3;
            int iWidth = (int) rectFM8150i.width();
            int iHeight = (int) rectFM8150i.height();
            if (i2 != iWidth || i3 != iHeight) {
                qrj.this.f60397f7l8.fling(i2, i3, i4, i5, 0, iWidth, 0, iHeight, iWidth, iHeight);
            }
            if (qrj.this.f60399kja0.isStarted()) {
                qrj.this.f60399kja0.end();
            }
            qrj.this.f60399kja0.start();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@InterfaceC7396q MotionEvent e1, @InterfaceC7396q MotionEvent e2, float f2, float f3) {
            d2ok.m23075h(e1, "e1");
            d2ok.m23075h(e2, "e2");
            if (!qrj.this.ni7()) {
                return false;
            }
            qrj.this.mcp(-f2, -f3);
            return true;
        }
    }

    /* JADX INFO: compiled from: GestureManager.kt */
    public static final class zy extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        zy() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@InterfaceC7396q ScaleGestureDetector detector) {
            d2ok.m23075h(detector, "detector");
            if (!qrj.this.ni7()) {
                return false;
            }
            float scaleFactor = detector.getScaleFactor();
            qrj.this.ki().postScale(scaleFactor, scaleFactor, detector.getFocusX(), detector.getFocusY());
            qrj.this.jk();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(@InterfaceC7396q ScaleGestureDetector detector) {
            d2ok.m23075h(detector, "detector");
            qrj.this.jp0y(detector);
        }
    }

    public qrj(@InterfaceC7396q Context context, @InterfaceC7396q View targetView, @InterfaceC7396q InterfaceC2129p gestureListener, @InterfaceC7396q Drawable srcDrawAble, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(targetView, "targetView");
        d2ok.m23075h(gestureListener, "gestureListener");
        d2ok.m23075h(srcDrawAble, "srcDrawAble");
        this.f12519k = targetView;
        this.f60404toq = gestureListener;
        this.f60406zy = srcDrawAble;
        this.f12522q = wallpaperPositionInfo;
        this.f60397f7l8 = new OverScroller(context);
        this.f12524y = true;
        this.f60400ld6 = new Matrix();
        C2131k c2131k = new C2131k();
        this.f60401n7h = c2131k;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.x2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                qrj.m8147r(this.f12532k, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(c2131k);
        this.f60399kja0 = valueAnimatorOfFloat;
        this.f12518h = new ScaleGestureDetector(context, new zy());
        this.f60396cdj = new GestureDetector(context, new toq());
        this.f60398ki = true;
        this.f60403t8r = new Matrix();
    }

    private final void a9(float f2, final float f3, final float f4) {
        ValueAnimator valueAnimator = this.f60405x2;
        if (valueAnimator != null) {
            d2ok.qrj(valueAnimator);
            if (valueAnimator.isRunning()) {
                return;
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(zurt(), f2);
        this.f60405x2 = valueAnimatorOfFloat;
        d2ok.qrj(valueAnimatorOfFloat);
        valueAnimatorOfFloat.setDuration(300L);
        ValueAnimator valueAnimator2 = this.f60405x2;
        d2ok.qrj(valueAnimator2);
        valueAnimator2.setInterpolator(new AccelerateInterpolator());
        ValueAnimator valueAnimator3 = this.f60405x2;
        d2ok.qrj(valueAnimator3);
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.ld6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                qrj.fti(this.f12509k, f3, f4, valueAnimator4);
            }
        });
        ValueAnimator valueAnimator4 = this.f60405x2;
        d2ok.qrj(valueAnimator4);
        valueAnimator4.addListener(this.f60401n7h);
        ValueAnimator valueAnimator5 = this.f60405x2;
        d2ok.qrj(valueAnimator5);
        valueAnimator5.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fti(qrj this$0, float f2, float f3, ValueAnimator animation) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        d2ok.n7h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue() / this$0.zurt();
        this$0.f60400ld6.postScale(fFloatValue, fFloatValue, f2, f3);
        this$0.jk();
    }

    /* JADX INFO: renamed from: p */
    private final float m8145p(int i2, int i3) {
        int width = this.f12519k.getWidth();
        int height = this.f12519k.getHeight();
        return (i2 >= width || i3 >= height) ? (i2 >= width || i3 < height) ? (i2 < width || i3 >= height) ? Math.max((width * 1.0f) / i2, (height * 1.0f) / i3) : (height * 1.0f) / i3 : (width * 1.0f) / i2 : Math.max((width * 1.0f) / i2, (height * 1.0f) / i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m8147r(qrj this$0, ValueAnimator it) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(it, "it");
        if (this$0.f60397f7l8.computeScrollOffset()) {
            int currX = this$0.f60397f7l8.getCurrX();
            int i2 = currX - this$0.f12520n;
            this$0.f12520n = currX;
            int currY = this$0.f60397f7l8.getCurrY();
            int i3 = currY - this$0.f12517g;
            this$0.f12517g = currY;
            if (i2 == 0 || i3 == 0) {
                return;
            }
            this$0.mcp(i2, i3);
        }
    }

    @InterfaceC7396q
    public final ScaleGestureDetector cdj() {
        return this.f12518h;
    }

    public final void d2ok(boolean z2) {
        this.f60398ki = z2;
    }

    protected final void d3(float f2) {
        this.f12523s = f2;
    }

    protected final void eqxt(float f2) {
        this.f12521p = f2;
    }

    @InterfaceC7395n
    public final WallpaperPositionInfo fn3e(@InterfaceC7395n Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.set(this.f60400ld6);
        matrix.mapRect(rectF);
        float fZurt = zurt();
        float f2 = (-rectF.left) / fZurt;
        float f3 = (-rectF.top) / fZurt;
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (f2 < 0.0f || f3 < 0.0f) {
            return null;
        }
        return new WallpaperPositionInfo(f2, f3, (this.f12519k.getWidth() / fZurt) + f2, (this.f12519k.getHeight() / fZurt) + f3, fArr);
    }

    @InterfaceC7396q
    protected final Drawable fu4() {
        return this.f60406zy;
    }

    public final void gvn7(boolean z2) {
        this.f60402qrj = z2;
    }

    /* JADX INFO: renamed from: h */
    protected final float m8149h() {
        return this.f12521p;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public final RectF m8150i() {
        Drawable drawable = this.f60406zy;
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f60400ld6.mapRect(rectF);
        return rectF;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[PHI: r1
      0x0030: PHI (r1v5 float) = (r1v2 float), (r1v11 float) binds: [B:11:0x003d, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jk() {
        /*
            r12 = this;
            android.graphics.RectF r0 = r12.m8150i()
            android.view.View r1 = r12.f12519k
            int r1 = r1.getWidth()
            android.view.View r2 = r12.f12519k
            int r2 = r2.getHeight()
            float r3 = r0.width()
            float r4 = r0.height()
            float r5 = r0.left
            float r6 = r0.right
            float r7 = r0.top
            float r0 = r0.bottom
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r9 <= 0) goto L36
            float r1 = (float) r1
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L30
            float r1 = -r5
            goto L42
        L30:
            float r1 = r1 * r10
            float r1 = r1 / r11
            float r3 = r3 / r11
            float r3 = r3 + r5
            float r1 = r1 - r3
            goto L42
        L36:
            float r1 = (float) r1
            int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r9 >= 0) goto L41
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 <= 0) goto L30
            float r1 = r1 - r6
            goto L42
        L41:
            r1 = r8
        L42:
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L54
            float r0 = (float) r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L4d
            float r0 = -r7
            goto L52
        L4d:
            float r0 = r0 * r10
            float r0 = r0 / r11
            float r4 = r4 / r11
            float r7 = r7 + r4
            float r0 = r0 - r7
        L52:
            r8 = r0
            goto L65
        L54:
            float r2 = (float) r2
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L65
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 <= 0) goto L5f
            float r2 = r2 - r0
            goto L64
        L5f:
            float r2 = r2 * r10
            float r2 = r2 / r11
            float r4 = r4 / r11
            float r7 = r7 + r4
            float r2 = r2 - r7
        L64:
            r8 = r2
        L65:
            android.graphics.Matrix r0 = r12.f60400ld6
            r0.postTranslate(r1, r8)
            com.android.thememanager.lockscreen.lock.wallpaper.p r0 = r12.f60404toq
            android.graphics.Matrix r1 = r12.f60400ld6
            r2 = 2
            r3 = 0
            com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2129p.k.m8141k(r0, r1, r3, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.lockscreen.lock.wallpaper.qrj.jk():void");
    }

    public void jp0y(@InterfaceC7396q ScaleGestureDetector detector) {
        d2ok.m23075h(detector, "detector");
        float fZurt = zurt() * detector.getScaleFactor();
        float f2 = this.f12523s;
        if (fZurt < f2) {
            a9(f2, this.f12519k.getWidth() / 2.0f, this.f12519k.getHeight() / 2.0f);
            return;
        }
        float f3 = this.f12521p;
        if (fZurt > f3) {
            a9(f3, this.f12519k.getWidth() / 2.0f, this.f12519k.getHeight() / 2.0f);
        }
    }

    @InterfaceC7396q
    protected final Matrix ki() {
        return this.f60400ld6;
    }

    protected final boolean kja0() {
        return this.f12524y;
    }

    @InterfaceC7396q
    public GestureDetector ld6() {
        return this.f60396cdj;
    }

    public void lvui() {
        if (this.f12524y) {
            int width = this.f12519k.getWidth();
            int height = this.f12519k.getHeight();
            int intrinsicWidth = this.f60406zy.getIntrinsicWidth();
            int intrinsicHeight = this.f60406zy.getIntrinsicHeight();
            float fM8145p = m8145p(intrinsicWidth, intrinsicHeight);
            this.f12523s = fM8145p;
            this.f12521p = fM8145p * 8;
            WallpaperPositionInfo wallpaperPositionInfo = this.f12522q;
            float[] matrixArr = wallpaperPositionInfo != null ? wallpaperPositionInfo.getMatrixArr() : null;
            if (matrixArr != null) {
                Matrix matrix = new Matrix();
                matrix.setValues(matrixArr);
                WallpaperPositionInfo wallpaperPositionInfo2 = this.f12522q;
                d2ok.qrj(wallpaperPositionInfo2);
                int right = (int) ((wallpaperPositionInfo2.getRight() - this.f12522q.getLeft()) * matrixArr[0]);
                int bottom = (int) ((this.f12522q.getBottom() - this.f12522q.getTop()) * matrixArr[0]);
                float fM8145p2 = m8145p(right, bottom);
                float f2 = 2;
                float f3 = (width * 1.0f) / f2;
                float f4 = (height * 1.0f) / f2;
                matrix.postTranslate(f3 - (right / 2.0f), f4 - (bottom / 2.0f));
                matrix.postScale(fM8145p2, fM8145p2, f3, f4);
                this.f60400ld6.set(matrix);
            } else {
                float f5 = 2;
                float f6 = (width * 1.0f) / f5;
                float f7 = (height * 1.0f) / f5;
                this.f60400ld6.postTranslate(f6 - (intrinsicWidth / 2.0f), f7 - (intrinsicHeight / 2.0f));
                Matrix matrix2 = this.f60400ld6;
                float f8 = this.f12523s;
                matrix2.postScale(f8, f8, f6, f7);
            }
            this.f60403t8r.set(this.f60400ld6);
            this.f60404toq.mo8119y(this.f60400ld6, Boolean.TRUE);
            this.f12524y = false;
        }
    }

    public void mcp(float f2, float f3) {
        RectF rectFM8150i = m8150i();
        if (rectFM8150i.width() <= this.f12519k.getWidth()) {
            f2 = 0.0f;
        }
        if (rectFM8150i.height() <= this.f12519k.getHeight()) {
            f3 = 0.0f;
        }
        if (f2 == 0.0f) {
            if (f3 == 0.0f) {
                return;
            }
        }
        this.f60400ld6.postTranslate(f2, f3);
        jk();
    }

    protected final float n7h() {
        return this.f12523s;
    }

    public final boolean ni7() {
        return this.f60398ki;
    }

    public final boolean o1t() {
        return this.f60402qrj;
    }

    protected final void oc(boolean z2) {
        this.f12524y = z2;
    }

    @InterfaceC7396q
    protected final Matrix qrj() {
        return this.f60403t8r;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    protected final AnimatorListenerAdapter m8151s() {
        return this.f60401n7h;
    }

    /* JADX INFO: renamed from: t */
    public final void m8152t() {
        Bitmap qVar;
        Bitmap qVar2 = C0524q.toq(this.f60406zy, 0, 0, null, 7, null);
        WallpaperPositionInfo wallpaperPositionInfoFn3e = fn3e(qVar2);
        if (wallpaperPositionInfoFn3e == null) {
            return;
        }
        try {
            qVar = com.android.thememanager.lockscreen.lock.wallpaper.toq.f12529k.toq(qVar2, (int) wallpaperPositionInfoFn3e.getLeft(), (int) wallpaperPositionInfoFn3e.getRight(), (int) wallpaperPositionInfoFn3e.getTop(), (int) wallpaperPositionInfoFn3e.getBottom());
        } catch (Exception unused) {
            qVar = null;
        }
        d2ok.n7h(qVar, "null cannot be cast to non-null type android.graphics.Bitmap");
        KeyEvent.Callback callback = this.f12519k;
        d2ok.n7h(callback, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.IWallpaperLayer");
        InterfaceC2132s gestureEndCallback = ((n7h) callback).getGestureEndCallback();
        if (gestureEndCallback != null) {
            gestureEndCallback.mo8044k(qVar);
        }
    }

    @InterfaceC7396q
    public final Matrix t8r() {
        Matrix matrix = new Matrix();
        matrix.set(this.f60400ld6);
        return matrix;
    }

    public final boolean wvg() {
        return !d2ok.f7l8(this.f60403t8r, this.f60400ld6);
    }

    @InterfaceC7396q
    public final InterfaceC2129p x2() {
        return this.f60404toq;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    protected final View m8153z() {
        return this.f12519k;
    }

    protected final float zurt() {
        float[] fArr = new float[9];
        this.f60400ld6.getValues(fArr);
        return fArr[0];
    }
}

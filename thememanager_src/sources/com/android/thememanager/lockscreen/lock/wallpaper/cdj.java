package com.android.thememanager.lockscreen.lock.wallpaper;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2129p;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MagicWallpaperGestureManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj extends qrj {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @InterfaceC7396q
    private final RectF f60378fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @InterfaceC7395n
    private PropertyValuesHolder f60379fu4;

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    private final RectF f12485i;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @InterfaceC7396q
    private final Matrix f60380ni7;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private ValueAnimator f12486z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @InterfaceC7396q
    private final GestureDetector f60381zurt;

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.cdj$k */
    /* JADX INFO: compiled from: MagicWallpaperGestureManager.kt */
    public static final class C2122k extends GestureDetector.SimpleOnGestureListener {
        C2122k() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@InterfaceC7396q MotionEvent e1, @InterfaceC7396q MotionEvent e2, float f2, float f3) {
            d2ok.m23075h(e1, "e1");
            d2ok.m23075h(e2, "e2");
            if (!cdj.this.ni7()) {
                return false;
            }
            cdj.this.mcp(-f2, -f3);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdj(@InterfaceC7396q Context context, @InterfaceC7396q View targetView, @InterfaceC7396q InterfaceC2129p gestureListener, @InterfaceC7396q Drawable srcDrawAble, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        super(context, targetView, gestureListener, srcDrawAble, wallpaperPositionInfo);
        d2ok.m23075h(context, "context");
        d2ok.m23075h(targetView, "targetView");
        d2ok.m23075h(gestureListener, "gestureListener");
        d2ok.m23075h(srcDrawAble, "srcDrawAble");
        this.f12485i = new RectF();
        this.f60378fn3e = new RectF();
        this.f60381zurt = new GestureDetector(context, new C2122k());
        this.f60380ni7 = new Matrix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ncyb(cdj this$0, ValueAnimator it) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(it, "it");
        ValueAnimator valueAnimator = this$0.f12486z;
        d2ok.qrj(valueAnimator);
        Object animatedValue = valueAnimator.getAnimatedValue();
        d2ok.n7h(animatedValue, "null cannot be cast to non-null type android.graphics.Matrix");
        this$0.ki().set((Matrix) animatedValue);
        this$0.jk();
        InterfaceC2129p.k.m8141k(this$0.x2(), this$0.ki(), null, 2, null);
    }

    private final ValueAnimator x9kr(Matrix matrix, Matrix matrix2) {
        if (this.f12486z == null) {
            this.f60379fu4 = PropertyValuesHolder.ofObject("matrix", new ki(), matrix, matrix2);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setObjectValues(this.f60379fu4);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    cdj.ncyb(this.f12496k, valueAnimator2);
                }
            });
            valueAnimator.addListener(m8151s());
            valueAnimator.setDuration(300L);
            valueAnimator.setValues(this.f60379fu4);
            this.f12486z = valueAnimator;
        }
        PropertyValuesHolder propertyValuesHolder = this.f60379fu4;
        d2ok.qrj(propertyValuesHolder);
        propertyValuesHolder.setObjectValues(matrix, matrix2);
        ValueAnimator valueAnimator2 = this.f12486z;
        d2ok.qrj(valueAnimator2);
        return valueAnimator2;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.qrj
    public void jk() {
        ki().getValues(new float[9]);
        if (m8153z() instanceof WallpaperSurfaceView) {
            Matrix matrixKi = ki();
            View viewM8153z = m8153z();
            d2ok.n7h(viewM8153z, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.WallpaperSurfaceView");
            com.miui.miwallpaper.zy.f7l8(matrixKi, (WallpaperSurfaceView) viewM8153z, ((WallpaperSurfaceView) m8153z()).getGlassRender());
        } else if (m8153z() instanceof WallpaperTextureView) {
            Matrix matrixKi2 = ki();
            View viewM8153z2 = m8153z();
            d2ok.n7h(viewM8153z2, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.wallpaper.WallpaperTextureView");
            com.miui.miwallpaper.zy.m18082y(matrixKi2, (WallpaperTextureView) viewM8153z2, ((WallpaperTextureView) m8153z()).getGlassRender());
            ((WallpaperTextureView) m8153z()).jk();
        }
        ki().mapRect(this.f60378fn3e, this.f12485i);
        InterfaceC2129p.k.m8141k(x2(), ki(), null, 2, null);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.qrj
    public void jp0y(@InterfaceC7396q ScaleGestureDetector detector) {
        d2ok.m23075h(detector, "detector");
        float fZurt = zurt() * detector.getScaleFactor();
        if (fZurt < n7h()) {
            x9kr(ki(), qrj()).start();
        } else if (fZurt > m8149h()) {
            float fM8149h = m8149h() / fZurt;
            this.f60380ni7.set(ki());
            this.f60380ni7.postScale(fM8149h, fM8149h, detector.getFocusX(), detector.getFocusY());
            x9kr(ki(), this.f60380ni7).start();
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.qrj
    @InterfaceC7396q
    public GestureDetector ld6() {
        return this.f60381zurt;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.qrj
    public void lvui() {
        if (kja0()) {
            this.f12485i.set(0.0f, 0.0f, fu4().getIntrinsicWidth(), fu4().getIntrinsicHeight());
        }
        super.lvui();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.qrj
    public void mcp(float f2, float f3) {
        ki().mapRect(this.f60378fn3e, this.f12485i);
        if ((this.f60378fn3e.right + f2 <= m8153z().getWidth() && f2 < 0.0f) || (this.f60378fn3e.left + f2 > 0.0f && f2 > 0.0f)) {
            f2 = 0.0f;
        }
        RectF rectF = this.f60378fn3e;
        if ((rectF.top + f3 > 0.0f && f3 > 0.0f) || (rectF.bottom + f3 <= m8153z().getBottom() && f3 < 0.0f)) {
            f3 = 0.0f;
        }
        ki().postTranslate(f2, f3);
        jk();
    }
}

package com.android.thememanager.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperView extends ScalableImageView {
    private static final int xqx = 0;
    private static final float zr5t = 0.1f;
    private final Rect cw14;
    private final C2909k d1cy;
    private final int dy;
    private final Rect hp;
    private final toq k6e;
    private final Rect mjvl;
    private final Paint ndjo;
    private zy q7k9;
    private final toq s8y;
    private final int sk1t;
    private int th6;
    private final int vb6;
    private final toq xk5;
    private int xy8;

    /* JADX INFO: renamed from: com.android.thememanager.view.WallpaperView$k */
    private class C2909k extends ValueAnimator {

        /* JADX INFO: renamed from: k */
        private float f17492k;

        /* JADX INFO: renamed from: n */
        private int f17493n;

        /* JADX INFO: renamed from: q */
        private float f17494q;

        /* JADX INFO: renamed from: com.android.thememanager.view.WallpaperView$k$k */
        class k implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ WallpaperView f17495k;

            k(final WallpaperView val$this$0) {
                this.f17495k = val$this$0;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animation) {
                float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
                C2909k c2909k = C2909k.this;
                WallpaperView.this.a9(c2909k.f17492k * (fFloatValue - C2909k.this.f17494q), 0.0f);
                C2909k.this.f17494q = fFloatValue;
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.view.WallpaperView$k$toq */
        class toq extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ WallpaperView f17497k;

            toq(final WallpaperView val$this$0) {
                this.f17497k = val$this$0;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (C2909k.this.f17493n > 0) {
                    WallpaperView.this.q7k9.zy();
                } else {
                    WallpaperView.this.q7k9.toq();
                }
                WallpaperView.this.m10317l();
                WallpaperView.this.invalidate();
            }
        }

        public C2909k() {
            setFloatValues(0.0f, 1.0f);
            setDuration(250L);
            setInterpolator(new DecelerateInterpolator());
            addUpdateListener(new k(WallpaperView.this));
            addListener(new toq(WallpaperView.this));
        }

        /* JADX INFO: renamed from: y */
        public void m10323y(float distanceOffset, int indexOffset) {
            this.f17492k = distanceOffset;
            this.f17493n = indexOffset;
            this.f17494q = 0.0f;
        }
    }

    class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f61502f7l8;

        /* JADX INFO: renamed from: g */
        private int f17499g;

        /* JADX INFO: renamed from: q */
        private HandlerC2910k f17502q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Bitmap f61503toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private RunnableC2920k f61504zy;

        /* JADX INFO: renamed from: n */
        private Rect f17501n = new Rect();

        /* JADX INFO: renamed from: k */
        public int f17500k = 0;

        /* JADX INFO: renamed from: com.android.thememanager.view.WallpaperView$toq$k */
        class HandlerC2910k extends Handler implements Drawable.Callback {
            public HandlerC2910k() {
                if (getLooper() != Looper.getMainLooper()) {
                    throw new RuntimeException("You must create WallpaperHander in main thread.");
                }
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable who) {
                if (toq.this.f17501n.isEmpty()) {
                    return;
                }
                Rect bounds = who.getBounds();
                int iWidth = toq.this.f17501n.left + ((toq.this.f17501n.width() - bounds.width()) / 2);
                int iHeight = toq.this.f17501n.top + ((toq.this.f17501n.height() - bounds.height()) / 2);
                WallpaperView.this.invalidate(iWidth, iHeight, bounds.width() + iWidth, bounds.height() + iHeight);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable who, Runnable what, long when) {
                if (who == null || what == null) {
                    return;
                }
                postAtTime(what, who, when);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable who, Runnable what) {
                if (who == null || what == null) {
                    return;
                }
                removeCallbacks(what, who);
            }
        }

        public toq() {
            RunnableC2920k runnableC2920k = new RunnableC2920k(WallpaperView.this.getContext().getResources(), R.drawable.miuix_appcompat_progressbar_indeterminate_dark);
            this.f61504zy = runnableC2920k;
            runnableC2920k.setBounds(0, 0, WallpaperView.this.getResources().getDimensionPixelSize(R.dimen.miuix_appcompat_progressbar_size), WallpaperView.this.getResources().getDimensionPixelSize(R.dimen.miuix_appcompat_progressbar_size));
            HandlerC2910k handlerC2910k = new HandlerC2910k();
            this.f17502q = handlerC2910k;
            this.f61504zy.setCallback(handlerC2910k);
        }

        private Rect f7l8() {
            float fMin = Math.min((this.f61503toq.getWidth() * 1.0f) / WallpaperView.this.xy8, (this.f61503toq.getHeight() * 1.0f) / WallpaperView.this.th6);
            float width = (this.f61503toq.getWidth() - (WallpaperView.this.xy8 * fMin)) / 2.0f;
            float height = (this.f61503toq.getHeight() - (WallpaperView.this.th6 * fMin)) / 2.0f;
            float f2 = this.f61502f7l8 * fMin;
            Rect rect = new Rect();
            rect.left = (int) (width + f2 + 0.5f);
            rect.right = (int) ((this.f61503toq.getWidth() - width) + f2 + 0.5f);
            rect.top = (int) (height + 0.5f);
            rect.bottom = (int) ((this.f61503toq.getHeight() - height) + 0.5f);
            return rect;
        }

        private void ld6() {
            this.f61504zy.stop();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m10325n() {
            this.f17502q.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: renamed from: p */
        private void m10326p(Canvas canvas) {
            canvas.save();
            Rect rect = this.f17501n;
            int iWidth = rect.left + ((rect.width() - this.f61504zy.getIntrinsicWidth()) / 2);
            Rect rect2 = this.f17501n;
            canvas.translate(iWidth, rect2.top + ((rect2.height() - this.f61504zy.getIntrinsicHeight()) / 2));
            this.f61504zy.draw(canvas);
            this.f61504zy.start();
            canvas.restore();
        }

        /* JADX INFO: renamed from: g */
        public void m10328g(Canvas canvas, Rect drawableArea, boolean isCurrentWallpaper) {
            this.f17501n.set(drawableArea);
            if (!isCurrentWallpaper) {
                Rect rect = this.f17501n;
                if (rect.right <= 0 || rect.left >= WallpaperView.this.xy8) {
                    return;
                }
                Rect rect2 = this.f17501n;
                if (rect2.bottom <= 0 || rect2.top >= WallpaperView.this.th6) {
                    return;
                }
            }
            if (this.f61503toq != null) {
                if (!isCurrentWallpaper) {
                    Rect rectF7l8 = f7l8();
                    synchronized (this.f61503toq) {
                        canvas.drawBitmap(this.f61503toq, rectF7l8, this.f17501n, WallpaperView.this.ndjo);
                    }
                }
                if (this.f17500k == 1) {
                    m10326p(canvas);
                }
            } else if (this.f17500k == 0) {
                m10326p(canvas);
            }
            if (this.f17500k == 2 && this.f61504zy.isRunning()) {
                ld6();
            }
        }

        /* JADX INFO: renamed from: s */
        public void m10329s(Bitmap b2) {
            if (this.f61503toq == b2) {
                return;
            }
            this.f61503toq = b2;
            m10330y();
        }

        /* JADX INFO: renamed from: y */
        public void m10330y() {
            this.f61502f7l8 = 0;
            ld6();
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        boolean mo6449k(int offset);

        void toq();

        void zy();
    }

    public WallpaperView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.sk1t = 0;
        this.dy = 1;
        this.vb6 = 2;
        this.k6e = new toq();
        this.xk5 = new toq();
        this.s8y = new toq();
        this.mjvl = new Rect();
        this.hp = new Rect();
        this.cw14 = new Rect();
        Paint paint = new Paint();
        this.ndjo = paint;
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.d1cy = new C2909k();
    }

    private toq dd(int pos) {
        return pos < 0 ? this.k6e : pos > 0 ? this.s8y : this.xk5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m10317l() {
        this.k6e.m10330y();
        this.xk5.m10330y();
        this.s8y.m10330y();
        n5r1();
    }

    private void lvui() {
        this.k6e.m10325n();
        this.xk5.m10325n();
        this.s8y.m10325n();
    }

    public void d2ok() {
        setBitmapInfo(0, null, Integer.MIN_VALUE, false, false);
        setBitmapInfo(1, null, Integer.MIN_VALUE, false, false);
        setBitmapInfo(-1, null, Integer.MIN_VALUE, false, false);
    }

    public Rect getCurrentContainer() {
        return this.mjvl;
    }

    @Override // com.android.thememanager.view.ScalableImageView
    protected boolean kja0() {
        return !(this.k6e.f61503toq == null && this.s8y.f61503toq == null) && super.kja0();
    }

    public void n5r1() {
        if (getImageBitmap() != null) {
            RectF matrixRectF = getMatrixRectF();
            Rect rect = this.mjvl;
            int i2 = (int) matrixRectF.left;
            rect.left = i2;
            rect.top = (int) matrixRectF.top;
            rect.right = i2 + ((int) matrixRectF.width());
            Rect rect2 = this.mjvl;
            rect2.bottom = rect2.top + ((int) matrixRectF.height());
            invalidate();
        }
    }

    public void ncyb(zy l2) {
        this.q7k9 = l2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lvui();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (kja0()) {
            int i2 = this.mjvl.left;
            if (i2 + 0 > 0) {
                Rect rect = this.hp;
                int i3 = i2 - 0;
                rect.right = i3;
                rect.left = i3 - this.xy8;
                rect.top = 0;
                rect.bottom = this.th6 + 0;
                this.k6e.m10328g(canvas, rect, false);
            }
        }
        this.xk5.m10328g(canvas, this.mjvl, true);
        if (kja0()) {
            int i4 = this.mjvl.right;
            int i5 = i4 + 0;
            int i6 = this.xy8;
            if (i5 <= i6) {
                Rect rect2 = this.cw14;
                int i7 = i4 + 0;
                rect2.left = i7;
                rect2.right = i7 + i6;
                rect2.top = 0;
                rect2.bottom = this.th6 + 0;
                this.s8y.m10328g(canvas, rect2, false);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        wvg(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: renamed from: r */
    public int m10318r(int pos) {
        return dd(pos).f17499g;
    }

    public void setBitmapInfo(int pos, Bitmap b2, int userGivenId, boolean isDecodingBitmap, boolean isDecodingLargerBitmap) {
        toq toqVarDd = dd(pos);
        toqVarDd.m10329s(b2);
        if (isDecodingBitmap) {
            toqVarDd.f17500k = 0;
        } else if (isDecodingLargerBitmap) {
            toqVarDd.f17500k = 1;
        } else {
            toqVarDd.f17500k = 2;
        }
        toqVarDd.f17499g = userGivenId;
    }

    @Override // com.android.thememanager.view.ScalableImageView
    protected void wvg(int x3, int y3) {
        super.wvg(x3, y3);
        this.xy8 = x3;
        this.th6 = y3;
        if (this.mjvl == null) {
            return;
        }
        if (getImageBitmap() == null) {
            Rect rect = this.mjvl;
            rect.left = 0;
            rect.top = 0;
            rect.right = this.xy8;
            rect.bottom = this.th6;
            return;
        }
        RectF matrixRectF = getMatrixRectF();
        Rect rect2 = this.mjvl;
        int i2 = (int) matrixRectF.left;
        rect2.left = i2;
        rect2.top = (int) matrixRectF.top;
        rect2.right = i2 + ((int) matrixRectF.width());
        Rect rect3 = this.mjvl;
        rect3.bottom = rect3.top + ((int) matrixRectF.height());
    }

    public boolean x9kr(int pos) {
        toq toqVarDd = dd(pos);
        return toqVarDd.f61503toq != null && toqVarDd.f17500k == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r2.f17500k != 0) goto L30;
     */
    @Override // com.android.thememanager.view.ScalableImageView
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo10306y() {
        /*
            r9 = this;
            com.android.thememanager.view.WallpaperView$zy r0 = r9.q7k9
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.graphics.Rect r0 = r9.mjvl
            int r2 = r0.left
            if (r2 <= 0) goto Ld
            goto L17
        Ld:
            int r0 = r0.right
            int r2 = r9.xy8
            if (r0 >= r2) goto L16
            int r2 = r0 - r2
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r0 = java.lang.Math.abs(r2)
            int r3 = r2 / r0
            int r4 = -r3
            com.android.thememanager.view.WallpaperView$zy r5 = r9.q7k9
            boolean r5 = r5.mo6449k(r4)
            if (r5 == 0) goto L5c
            float r5 = (float) r0
            int r6 = r9.xy8
            float r7 = (float) r6
            r8 = 1036831949(0x3dcccccd, float:0.1)
            float r7 = r7 * r8
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L5c
            if (r2 <= 0) goto L41
            com.android.thememanager.view.WallpaperView$toq r5 = r9.k6e
            android.graphics.Bitmap r7 = r5.f61503toq
            if (r7 != 0) goto L4d
            int r5 = r5.f17500k
            if (r5 == 0) goto L4d
        L41:
            if (r2 >= 0) goto L5c
            com.android.thememanager.view.WallpaperView$toq r2 = r9.s8y
            android.graphics.Bitmap r5 = r2.f61503toq
            if (r5 != 0) goto L4d
            int r2 = r2.f17500k
            if (r2 != 0) goto L5c
        L4d:
            int r6 = r6 - r0
            com.android.thememanager.view.WallpaperView$k r0 = r9.d1cy
            int r3 = r3 * r6
            float r1 = (float) r3
            r0.m10323y(r1, r4)
            com.android.thememanager.view.WallpaperView$k r0 = r9.d1cy
            r0.start()
            r0 = 1
            return r0
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.view.WallpaperView.mo10306y():boolean");
    }
}

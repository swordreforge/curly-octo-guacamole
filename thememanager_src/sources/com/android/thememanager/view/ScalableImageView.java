package com.android.thememanager.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class ScalableImageView extends ImageView {
    private static final int ac = 500;
    private static final int ad = 200;
    private static final int aj = 2;
    private static final int am = 800;
    private static final int ar = 1;
    private static final int ay = 50;
    private static final int bc = 2;
    private static final int bd = 0;
    private static final int be = 10;
    private static final int bq = 300;
    protected static final float bs = 10.0f;
    protected static final Matrix bu = new Matrix();
    private static final int k0 = 0;
    private static final int tgs = 3;
    private static final int tlhn = 1;
    private static final int w97r = 2;
    private static final int yl25 = 4;
    private static final int zmmu = 5;

    /* JADX INFO: renamed from: a */
    private boolean f17416a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private AnimatorListenerAdapter f61500ab;
    private ValueAnimator an;
    private VelocityTracker as;
    protected Matrix ax;
    private int az;

    /* JADX INFO: renamed from: b */
    protected boolean f17417b;
    private Matrix ba;
    private ValueAnimator bb;
    private int bg;
    private DecelerateInterpolator bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f61501bo;
    private C2905y bp;
    private AnimatorListenerAdapter bv;

    /* JADX INFO: renamed from: c */
    private float[] f17418c;

    /* JADX INFO: renamed from: d */
    private ValueAnimator f17419d;

    /* JADX INFO: renamed from: e */
    protected int f17420e;

    /* JADX INFO: renamed from: f */
    protected float f17421f;

    /* JADX INFO: renamed from: g */
    private final float f17422g;

    /* JADX INFO: renamed from: h */
    private final Matrix f17423h;

    /* JADX INFO: renamed from: i */
    private final Matrix f17424i;
    private f7l8 id;
    private AnimatorListenerAdapter in;

    /* JADX INFO: renamed from: j */
    protected int f17425j;

    /* JADX INFO: renamed from: k */
    private int f17426k;

    /* JADX INFO: renamed from: l */
    private float f17427l;

    /* JADX INFO: renamed from: m */
    private InterfaceC2903q f17428m;

    /* JADX INFO: renamed from: n */
    private int f17429n;

    /* JADX INFO: renamed from: o */
    private InterfaceC2904s f17430o;

    /* JADX INFO: renamed from: p */
    private Bitmap f17431p;

    /* JADX INFO: renamed from: q */
    private int f17432q;

    /* JADX INFO: renamed from: r */
    private SparseArray<Float> f17433r;

    /* JADX INFO: renamed from: s */
    private int f17434s;

    /* JADX INFO: renamed from: t */
    private SparseArray<Float> f17435t;

    /* JADX INFO: renamed from: u */
    private boolean f17436u;

    /* JADX INFO: renamed from: v */
    private boolean f17437v;

    /* JADX INFO: renamed from: w */
    private C2902n f17438w;

    /* JADX INFO: renamed from: x */
    private boolean f17439x;

    /* JADX INFO: renamed from: y */
    private int f17440y;

    /* JADX INFO: renamed from: z */
    private PointF f17441z;

    private class f7l8 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        private float f17442g;

        /* JADX INFO: renamed from: h */
        private float f17443h;

        /* JADX INFO: renamed from: i */
        private float f17444i;

        /* JADX INFO: renamed from: k */
        private float f17445k;

        /* JADX INFO: renamed from: n */
        private float f17446n;

        /* JADX INFO: renamed from: p */
        private float f17447p;

        /* JADX INFO: renamed from: q */
        private float f17448q;

        /* JADX INFO: renamed from: s */
        private float f17450s;

        /* JADX INFO: renamed from: t */
        private int f17451t;

        /* JADX INFO: renamed from: y */
        private float f17452y;

        /* JADX INFO: renamed from: z */
        private float f17453z;

        private f7l8() {
        }

        private boolean toq(float postX, float postY) {
            float f2 = this.f17446n;
            if ((f2 <= 0.0f || postX <= this.f17447p) && (f2 >= 0.0f || postX + this.f17452y >= this.f17443h)) {
                float f3 = this.f17442g;
                if ((f3 <= 0.0f || postY <= this.f17444i) && (f3 >= 0.0f || postY + this.f17450s >= this.f17453z)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zy(float fromX, float fromY, float xVelocity, float yVelocity) {
            this.f17445k = fromX;
            this.f17448q = fromY;
            this.f17446n = xVelocity;
            this.f17442g = yVelocity;
            RectF matrixRectF = ScalableImageView.this.getMatrixRectF();
            this.f17452y = matrixRectF.width();
            this.f17450s = matrixRectF.height();
            ScalableImageView scalableImageView = ScalableImageView.this;
            this.f17447p = -scalableImageView.f17420e;
            int i2 = scalableImageView.f17432q;
            ScalableImageView scalableImageView2 = ScalableImageView.this;
            this.f17443h = i2 + scalableImageView2.f17425j;
            this.f17444i = 0.0f;
            this.f17453z = scalableImageView2.getHeight();
            this.f17451t = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onAnimationUpdate(android.animation.ValueAnimator r11) {
            /*
                Method dump skipped, instruction units count: 581
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.view.ScalableImageView.f7l8.onAnimationUpdate(android.animation.ValueAnimator):void");
        }

        /* synthetic */ f7l8(ScalableImageView scalableImageView, C2901k c2901k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ScalableImageView$g */
    @Retention(RetentionPolicy.SOURCE)
    @interface InterfaceC2900g {
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ScalableImageView$k */
    class C2901k extends AnimatorListenerAdapter {
        C2901k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ScalableImageView.this.fti(true, true);
            ScalableImageView.this.ld6();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ScalableImageView$n */
    private class C2902n implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        private float f17455k;

        /* JADX INFO: renamed from: q */
        private float f17457q;

        private C2902n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toq(float from, float to) {
            this.f17455k = from;
            this.f17457q = to;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            float f2 = this.f17455k;
            float f3 = f2 + ((this.f17457q - f2) * fFloatValue);
            ScalableImageView.this.f17423h.getValues(ScalableImageView.this.f17418c);
            float f4 = f3 / ScalableImageView.this.f17418c[0];
            ScalableImageView.this.f17423h.postScale(f4, f4, ScalableImageView.this.f17440y / 2, ScalableImageView.this.f17434s / 2);
            ScalableImageView scalableImageView = ScalableImageView.this;
            scalableImageView.setImageMatrix(scalableImageView.f17423h);
        }

        /* synthetic */ C2902n(ScalableImageView scalableImageView, C2901k c2901k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ScalableImageView$q */
    public interface InterfaceC2903q {
        /* JADX INFO: renamed from: k */
        void mo6448k();
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ScalableImageView$s */
    public interface InterfaceC2904s {
        /* JADX INFO: renamed from: k */
        void mo6450k();

        /* JADX INFO: renamed from: n */
        void mo6451n();

        /* JADX INFO: renamed from: q */
        void mo6452q();

        default void toq() {
        }

        default void zy() {
        }
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ScalableImageView.this.ld6();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ScalableImageView$y */
    private class C2905y implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        private float f17459g;

        /* JADX INFO: renamed from: k */
        private float f17460k;

        /* JADX INFO: renamed from: n */
        private float f17461n;

        /* JADX INFO: renamed from: q */
        private float f17462q;

        private C2905y() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toq(float fromX, float toX, float fromY, float toY) {
            this.f17460k = fromX;
            this.f17462q = toX;
            this.f17461n = fromY;
            this.f17459g = toY;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            float f2 = this.f17460k;
            float f3 = f2 + ((this.f17462q - f2) * fFloatValue);
            float f4 = this.f17461n;
            float f5 = f4 + ((this.f17459g - f4) * fFloatValue);
            ScalableImageView.this.f17423h.getValues(ScalableImageView.this.f17418c);
            ScalableImageView.this.f17423h.postTranslate(f3 - ScalableImageView.this.f17418c[2], f5 - ScalableImageView.this.f17418c[5]);
            ScalableImageView scalableImageView = ScalableImageView.this;
            scalableImageView.setImageMatrix(scalableImageView.f17423h);
        }

        /* synthetic */ C2905y(ScalableImageView scalableImageView, C2901k c2901k) {
            this();
        }
    }

    class zy extends AnimatorListenerAdapter {
        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            ScalableImageView.this.ld6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScalableImageView(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.f17426k = r4
            r0 = 0
            r2.f17431p = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f17423h = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f17424i = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.f17441z = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f17435t = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.f17433r = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.f17418c = r0
            r2.f17417b = r4
            r2.f17416a = r4
            r0 = 1
            r2.f17439x = r0
            r2.f17436u = r0
            r2.f17437v = r4
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r2.bl = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2.ba = r4
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto L74
            r4 = r3
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r1 = com.android.thememanager.util.gc3c.ki(r4)
            if (r1 == 0) goto L74
            android.graphics.Point r4 = com.android.thememanager.util.gc3c.kja0(r4)
            int r1 = r4.x
            int r4 = r4.y
            r2.wvg(r1, r4)
            android.graphics.Point r4 = com.android.thememanager.basemodule.utils.y9n.zurt()
            int r4 = r4.x
            r2.f17440y = r4
            android.graphics.Point r4 = com.android.thememanager.basemodule.utils.y9n.zurt()
            int r4 = r4.y
            r2.f17434s = r4
            goto L83
        L74:
            android.graphics.Point r4 = com.android.thememanager.basemodule.utils.y9n.fn3e()
            int r4 = r4.x
            android.graphics.Point r1 = com.android.thememanager.basemodule.utils.y9n.fn3e()
            int r1 = r1.y
            r2.wvg(r4, r1)
        L83:
            android.util.DisplayMetrics r3 = com.android.thememanager.util.gc3c.m9784y(r3)
            float r3 = r3.density
            r2.f17422g = r3
            r2.f17416a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.view.ScalableImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void jk(float deltaX, float deltaY) {
        this.f17423h.getValues(this.f17418c);
        float[] fArr = this.f17418c;
        float f2 = fArr[2];
        float f3 = fArr[5];
        this.bb.setDuration(Math.max(Math.min(500, Math.max((int) Math.abs(((r6 - f2) * 300.0f) / this.f17440y), (int) Math.abs(((r7 - f3) * 300.0f) / this.f17440y))), 200));
        this.bp.toq(f2, deltaX + f2, f3, deltaY + f3);
        this.bb.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6() {
        if (this.f17430o == null || m10303i()) {
            return;
        }
        this.f17430o.toq();
    }

    private void mcp(float xVelocity, float yVelocity) {
        if (this.f17431p == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f17419d;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.bb;
            if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && getAnimation() == null && this.f17426k == 1) {
                if (Math.abs(xVelocity) >= this.bg || Math.abs(yVelocity) >= this.bg) {
                    RectF matrixRectF = getMatrixRectF();
                    if (matrixRectF.left >= 0.0f || matrixRectF.right <= this.f17432q) {
                        return;
                    }
                    this.an.cancel();
                    this.f17423h.getValues(this.f17418c);
                    float[] fArr = this.f17418c;
                    this.id.zy(fArr[2], fArr[5], xVelocity, yVelocity);
                    this.an.start();
                }
            }
        }
    }

    private float n7h(PointF p1, PointF p2) {
        float f2 = p1.x - p2.x;
        float f3 = p1.y - p2.y;
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }

    private void o1t(float scale) {
        this.f17423h.getValues(this.f17418c);
        if (this.f17418c[0] * scale < this.f17427l) {
            return;
        }
        this.f17423h.postScale(scale, scale, this.f17440y / 2, this.f17434s / 2);
        setImageMatrix(this.f17423h);
    }

    private void qrj() {
        this.f17423h.getValues(this.f17418c);
        float f2 = this.f17418c[0];
        float f3 = this.f17421f;
        if (f2 >= f3) {
            if (f2 <= bs) {
                fti(true, true);
                return;
            }
            f3 = 10.0f;
        }
        this.f17419d.setDuration(Math.max(Math.min(500, (int) Math.abs((f3 - f2) * 300.0f)), 200));
        this.f17438w.toq(f2, f3);
        this.f17419d.start();
    }

    /* JADX INFO: renamed from: s */
    private void m10300s(int width, int height, boolean withAnim, boolean refresh) {
        Matrix matrix = this.f17423h;
        float f2 = this.f17421f;
        matrix.setScale(f2, f2);
        RectF matrixRectF = getMatrixRectF();
        this.f17423h.postTranslate((((width - (getImageWidth() * this.f17421f)) / 2.0f) - this.f17420e) - matrixRectF.left, ((height - (getImageHeight() * this.f17421f)) / 2.0f) - matrixRectF.top);
        if (refresh) {
            setImageMatrix(this.f17423h);
        }
    }

    private void t8r() {
        setScaleType(ImageView.ScaleType.MATRIX);
        setImageMatrix(this.f17423h);
        this.f17427l = Math.min(Math.min(this.f17440y / getImageWidth(), this.f17434s / getImageHeight()), 0.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f17419d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.bl);
        C2901k c2901k = null;
        C2902n c2902n = new C2902n(this, c2901k);
        this.f17438w = c2902n;
        this.f17419d.addUpdateListener(c2902n);
        C2901k c2901k2 = new C2901k();
        this.f61500ab = c2901k2;
        this.f17419d.addListener(c2901k2);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.bb = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(this.bl);
        C2905y c2905y = new C2905y(this, c2901k);
        this.bp = c2905y;
        this.bb.addUpdateListener(c2905y);
        toq toqVar = new toq();
        this.bv = toqVar;
        this.bb.addListener(toqVar);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.an = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(800L);
        this.an.setInterpolator(this.bl);
        f7l8 f7l8Var = new f7l8(this, c2901k);
        this.id = f7l8Var;
        this.an.addUpdateListener(f7l8Var);
        zy zyVar = new zy();
        this.in = zyVar;
        this.an.addListener(zyVar);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.bg = viewConfiguration.getScaledMinimumFlingVelocity();
        this.az = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void x2(MotionEvent event) {
        if (event.getPointerCount() == 1 || this.f17435t.size() <= 1 || this.f17433r.size() <= 1) {
            this.f17426k = 1;
            return;
        }
        float fFloatValue = this.f17435t.get(0).floatValue() - event.getX(0);
        float fFloatValue2 = this.f17433r.get(0).floatValue() - event.getY(0);
        float fFloatValue3 = this.f17435t.get(1).floatValue() - event.getX(1);
        float fFloatValue4 = this.f17433r.get(1).floatValue() - event.getY(1);
        if (fFloatValue * fFloatValue3 < 0.0f || fFloatValue2 * fFloatValue4 < 0.0f || Math.abs(fFloatValue - fFloatValue3) >= Math.round(this.f17422g * 4.0f) || Math.abs(fFloatValue2 - fFloatValue4) >= Math.round(this.f17422g * 4.0f)) {
            this.f17426k = 2;
        } else {
            this.f17426k = 1;
        }
    }

    /* JADX INFO: renamed from: z */
    private void m10301z(MotionEvent event) {
        x2(event);
        this.f17435t.clear();
        this.f17433r.clear();
        int iMin = Math.min(2, event.getPointerCount());
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f17435t.put(i2, Float.valueOf(event.getX(i2)));
            this.f17433r.put(i2, Float.valueOf(event.getY(i2)));
        }
    }

    public void a9(float transX, float transY) {
        RectF matrixRectF = getMatrixRectF();
        boolean zKja0 = kja0();
        if ((!zKja0 || matrixRectF.left + transX <= 0.0f) && matrixRectF.right + transX >= this.f17432q) {
            this.f17416a = false;
        } else {
            this.f17416a = true;
        }
        if (zKja0 && (matrixRectF.top + transY > 0.0f || matrixRectF.bottom + transY < this.f17429n)) {
            transY = 0.0f;
        }
        this.f17423h.postTranslate((int) transX, transY);
        setImageMatrix(this.f17423h);
    }

    public boolean cdj() {
        RectF matrixRectF = getMatrixRectF();
        return Math.abs(matrixRectF.left) < 0.5f && Math.abs(matrixRectF.top) < 0.5f && Math.abs(matrixRectF.right - ((float) this.f17440y)) < 0.5f && Math.abs(matrixRectF.bottom - ((float) this.f17434s)) < 0.5f;
    }

    public boolean fn3e() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f17419d;
        return (valueAnimator3 != null && (valueAnimator3.isStarted() || this.f17419d.isRunning())) || ((valueAnimator = this.bb) != null && (valueAnimator.isStarted() || this.bb.isRunning())) || ((valueAnimator2 = this.an) != null && (valueAnimator2.isStarted() || this.an.isRunning()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void fti(boolean r6, boolean r7) {
        /*
            r5 = this;
            android.graphics.Bitmap r0 = r5.f17431p
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.RectF r0 = r5.getMatrixRectF()
            float r1 = r0.height()
            r2 = 0
            if (r7 == 0) goto L3a
            int r7 = r5.f17429n
            float r7 = (float) r7
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 >= 0) goto L1f
            float r7 = r7 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r1
            float r1 = r0.top
        L1d:
            float r7 = r7 - r1
            goto L3b
        L1f:
            float r7 = r0.top
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L27
            float r7 = -r7
            goto L3b
        L27:
            float r7 = r0.bottom
            int r1 = r5.getHeight()
            float r1 = (float) r1
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L3a
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float r1 = r0.bottom
            goto L1d
        L3a:
            r7 = r2
        L3b:
            if (r6 == 0) goto L5c
            int r6 = r5.f17432q
            float r1 = r0.left
            int r3 = r5.f17420e
            int r4 = -r3
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4d
            int r6 = -r3
            float r6 = (float) r6
            float r6 = r6 - r1
            goto L5d
        L4d:
            float r0 = r0.right
            int r1 = r5.f17425j
            int r3 = r6 + r1
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5c
            int r6 = r6 + r1
            float r6 = (float) r6
            float r6 = r6 - r0
            goto L5d
        L5c:
            r6 = r2
        L5d:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L65
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L68
        L65:
            r5.jk(r6, r7)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.view.ScalableImageView.fti(boolean, boolean):void");
    }

    public void fu4() {
        setImageBitmap(null);
        Bitmap bitmap = this.f17431p;
        if (bitmap != null) {
            bitmap.recycle();
            this.f17431p = null;
        }
    }

    public Bitmap getImageBitmap() {
        return this.f17431p;
    }

    public int getImageHeight() {
        return this.f17431p.getHeight();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f17423h;
    }

    public int getImageWidth() {
        return this.f17431p.getWidth();
    }

    public RectF getMatrixRectF() {
        Matrix matrix = new Matrix();
        matrix.set(this.f17423h);
        RectF rectF = new RectF(0.0f, 0.0f, this.f17431p.getWidth(), this.f17431p.getHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: h */
    public void m10302h(float enlarge, Point point) {
        this.f17423h.postScale(enlarge, enlarge, point.x, point.y);
        setImageMatrix(this.f17423h);
        qrj();
    }

    /* JADX INFO: renamed from: i */
    public boolean m10303i() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f17419d;
        return (valueAnimator3 != null && valueAnimator3.isRunning()) || ((valueAnimator = this.bb) != null && valueAnimator.isRunning()) || ((valueAnimator2 = this.an) != null && valueAnimator2.isRunning());
    }

    public boolean ki(Bitmap b2, Matrix matrix) {
        setImageBitmap(b2);
        this.f17431p = b2;
        Matrix matrix2 = this.f17423h;
        if (matrix == null) {
            matrix = bu;
        }
        matrix2.set(matrix);
        t8r();
        return this.f17431p != null;
    }

    protected boolean kja0() {
        return !this.f17417b && this.f17436u;
    }

    public boolean ni7() {
        return !getImageMatrix().equals(this.ba);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.as == null) {
            this.as = VelocityTracker.obtain();
        }
        this.as.addMovement(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f17437v = false;
                if (this.f17430o == null || n7h(this.f17441z, new PointF(event.getX(0), event.getY(0))) >= bs) {
                    if (this.f17431p != null && (!kja0() || !mo10306y())) {
                        qrj();
                    }
                    this.as.computeCurrentVelocity(1000, this.az);
                    float xVelocity = this.as.getXVelocity();
                    float yVelocity = this.as.getYVelocity();
                    this.as.clear();
                    mcp(xVelocity / 2.0f, yVelocity / 2.0f);
                    InterfaceC2904s interfaceC2904s = this.f17430o;
                    if (interfaceC2904s != null) {
                        interfaceC2904s.mo6450k();
                    }
                } else {
                    this.f17430o.mo6452q();
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f17437v = false;
                } else if (actionMasked != 5) {
                    if (actionMasked == 6 && (event.getActionIndex() == 0 || event.getActionIndex() == 1)) {
                        this.f61501bo = true;
                    }
                }
            } else if (this.f17431p != null) {
                if (this.f61501bo) {
                    m10301z(event);
                    this.f61501bo = false;
                } else {
                    this.f17424i.set(this.f17423h);
                    if (this.f17426k == 1 && this.f17436u && n7h(this.f17441z, new PointF(event.getX(0), event.getY(0))) > 50.0f) {
                        InterfaceC2904s interfaceC2904s2 = this.f17430o;
                        if (interfaceC2904s2 != null) {
                            interfaceC2904s2.mo6451n();
                        }
                        a9(event.getX(0) - this.f17435t.get(0).floatValue(), event.getY(0) - this.f17433r.get(0).floatValue());
                        this.f17439x = !this.f17416a;
                    } else if (this.f17426k == 2 && this.f17439x && event.getPointerCount() >= 2) {
                        InterfaceC2904s interfaceC2904s3 = this.f17430o;
                        if (interfaceC2904s3 != null) {
                            interfaceC2904s3.mo6451n();
                        }
                        this.f17436u = false;
                        float fFloatValue = this.f17435t.get(0).floatValue() - this.f17435t.get(1).floatValue();
                        float fFloatValue2 = this.f17433r.get(0).floatValue() - this.f17433r.get(1).floatValue();
                        float fSqrt = (float) Math.sqrt((fFloatValue * fFloatValue) + (fFloatValue2 * fFloatValue2));
                        float x3 = event.getX(0) - event.getX(1);
                        float y3 = event.getY(0) - event.getY(1);
                        o1t(((float) Math.sqrt((x3 * x3) + (y3 * y3))) / fSqrt);
                    }
                    m10301z(event);
                }
            }
            return true;
        }
        this.f17416a = false;
        this.f17439x = true;
        this.f17436u = true;
        this.f61501bo = false;
        InterfaceC2904s interfaceC2904s4 = this.f17430o;
        if (interfaceC2904s4 != null) {
            interfaceC2904s4.zy();
        }
        this.f17437v = true;
        this.f17424i.set(this.f17423h);
        m10301z(event);
        if (event.getPointerCount() == 1) {
            this.f17441z.x = event.getX(0);
            this.f17441z.y = event.getY(0);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m10304p(boolean enable) {
        this.f17417b = enable;
        if (enable) {
            this.ax = new Matrix(getImageMatrix());
        }
    }

    public void setGestureListener(InterfaceC2904s l2) {
        this.f17430o = l2;
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        InterfaceC2903q interfaceC2903q = this.f17428m;
        if (interfaceC2903q != null) {
            interfaceC2903q.mo6448k();
        }
    }

    public void setMatrixChangeListener(InterfaceC2903q l2) {
        this.f17428m = l2;
    }

    public void setOffsets(int leftOffset, int rightOffset) {
        this.f17420e = leftOffset;
        this.f17425j = rightOffset;
    }

    public void setTouching(boolean touching) {
        this.f17437v = touching;
    }

    /* JADX INFO: renamed from: t */
    public boolean m10305t(int width, int height, final boolean reset, boolean firstShow, boolean refresh) {
        Matrix matrix;
        if (this.f17431p == null) {
            return false;
        }
        float fMax = Math.max(width / getImageWidth(), height / getImageHeight());
        this.f17421f = fMax;
        if (fMax > bs) {
            return false;
        }
        if (reset) {
            ValueAnimator valueAnimator = this.f17419d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.bb;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (firstShow || (matrix = this.ax) == null) {
                m10300s(width, height, false, refresh);
                this.ba.set(getImageMatrix());
            } else if (!this.f17423h.equals(matrix)) {
                this.f17423h.set(this.ax);
                setImageMatrix(this.ax);
                fti(true, true);
            }
            this.ax = null;
        } else {
            qrj();
        }
        return true;
    }

    protected void wvg(int x3, int y3) {
        this.f17440y = x3;
        this.f17434s = y3;
        this.f17432q = x3;
        this.f17429n = y3;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo10306y() {
        return false;
    }

    public boolean zurt() {
        return this.f17437v;
    }
}

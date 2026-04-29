package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0394g;
import p023g.C6045k;
import zy.hyr;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    LayerDrawable f2513c;

    /* JADX INFO: renamed from: e */
    float f2514e;

    /* JADX INFO: renamed from: f */
    Drawable[] f2515f;

    /* JADX INFO: renamed from: g */
    private zy f2516g;

    /* JADX INFO: renamed from: h */
    private float f2517h;

    /* JADX INFO: renamed from: i */
    private float f2518i;

    /* JADX INFO: renamed from: j */
    float f2519j;

    /* JADX INFO: renamed from: l */
    RectF f2520l;

    /* JADX INFO: renamed from: m */
    float f2521m;

    /* JADX INFO: renamed from: o */
    float f2522o;

    /* JADX INFO: renamed from: p */
    private Drawable f2523p;

    /* JADX INFO: renamed from: r */
    ViewOutlineProvider f2524r;

    /* JADX INFO: renamed from: s */
    private Drawable f2525s;

    /* JADX INFO: renamed from: t */
    private Path f2526t;

    /* JADX INFO: renamed from: y */
    private boolean f2527y;

    /* JADX INFO: renamed from: z */
    private float f2528z;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$k */
    class C0387k extends ViewOutlineProvider {
        C0387k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f2518i) / 2.0f);
        }
    }

    class toq extends ViewOutlineProvider {
        toq() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2528z);
        }
    }

    static class zy {

        /* JADX INFO: renamed from: k */
        float[] f2532k = new float[20];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ColorMatrix f48444toq = new ColorMatrix();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        ColorMatrix f48445zy = new ColorMatrix();

        /* JADX INFO: renamed from: q */
        float f2534q = 1.0f;

        /* JADX INFO: renamed from: n */
        float f2533n = 1.0f;

        /* JADX INFO: renamed from: g */
        float f2531g = 1.0f;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        float f48443f7l8 = 1.0f;

        zy() {
        }

        /* JADX INFO: renamed from: k */
        private void m1607k(float brightness) {
            float[] fArr = this.f2532k;
            fArr[0] = brightness;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = brightness;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = brightness;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* JADX INFO: renamed from: q */
        private void m1608q(float warmth) {
            float fLog;
            float fPow;
            if (warmth <= 0.0f) {
                warmth = 0.01f;
            }
            float f2 = (5000.0f / warmth) / 100.0f;
            if (f2 > 66.0f) {
                double d2 = f2 - 60.0f;
                fPow = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d2, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f2)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f2 < 66.0f ? f2 > 19.0f ? (((float) Math.log(f2 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f2532k;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void toq(float saturationStrength) {
            float f2 = 1.0f - saturationStrength;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f2532k;
            fArr[0] = f3 + saturationStrength;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + saturationStrength;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + saturationStrength;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void zy(ImageView view) {
            boolean z2;
            this.f48444toq.reset();
            float f2 = this.f2533n;
            boolean z3 = true;
            if (f2 != 1.0f) {
                toq(f2);
                this.f48444toq.set(this.f2532k);
                z2 = true;
            } else {
                z2 = false;
            }
            float f3 = this.f2531g;
            if (f3 != 1.0f) {
                this.f48445zy.setScale(f3, f3, f3, 1.0f);
                this.f48444toq.postConcat(this.f48445zy);
                z2 = true;
            }
            float f4 = this.f48443f7l8;
            if (f4 != 1.0f) {
                m1608q(f4);
                this.f48445zy.set(this.f2532k);
                this.f48444toq.postConcat(this.f48445zy);
                z2 = true;
            }
            float f5 = this.f2534q;
            if (f5 != 1.0f) {
                m1607k(f5);
                this.f48445zy.set(this.f2532k);
                this.f48444toq.postConcat(this.f48445zy);
            } else {
                z3 = z2;
            }
            if (z3) {
                view.setColorFilter(new ColorMatrixColorFilter(this.f48444toq));
            } else {
                view.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f2516g = new zy();
        this.f2527y = true;
        this.f2525s = null;
        this.f2523p = null;
        this.f2517h = 0.0f;
        this.f2518i = 0.0f;
        this.f2528z = Float.NaN;
        this.f2515f = new Drawable[2];
        this.f2514e = Float.NaN;
        this.f2519j = Float.NaN;
        this.f2522o = Float.NaN;
        this.f2521m = Float.NaN;
        t8r(context, null);
    }

    private void fn3e() {
        if (Float.isNaN(this.f2514e) && Float.isNaN(this.f2519j) && Float.isNaN(this.f2522o) && Float.isNaN(this.f2521m)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m1606i();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m1606i() {
        if (Float.isNaN(this.f2514e) && Float.isNaN(this.f2519j) && Float.isNaN(this.f2522o) && Float.isNaN(this.f2521m)) {
            return;
        }
        float f2 = Float.isNaN(this.f2514e) ? 0.0f : this.f2514e;
        float f3 = Float.isNaN(this.f2519j) ? 0.0f : this.f2519j;
        float f4 = Float.isNaN(this.f2522o) ? 1.0f : this.f2522o;
        float f5 = Float.isNaN(this.f2521m) ? 0.0f : this.f2521m;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f6 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f6, f6);
        float f7 = intrinsicWidth * f6;
        float f8 = f6 * intrinsicHeight;
        matrix.postTranslate((((f2 * (width - f7)) + width) - f7) * 0.5f, (((f3 * (height - f8)) + height) - f8) * 0.5f);
        matrix.postRotate(f5, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void setOverlay(boolean overlay) {
        this.f2527y = overlay;
    }

    private void t8r(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.pku);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f2525s = typedArrayObtainStyledAttributes.getDrawable(C0394g.qrj.u5);
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.gd) {
                    this.f2517h = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0394g.qrj.ztlo) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.fz5f) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.sr6) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.btl) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.ewa) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0394g.qrj.gxqa) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.xtsf) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f2527y));
                } else if (index == C0394g.qrj.li) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f2514e));
                } else if (index == C0394g.qrj.hm78) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f2519j));
                } else if (index == C0394g.qrj.vv3) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f2521m));
                } else if (index == C0394g.qrj.rc) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f2522o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2523p = drawable;
            if (this.f2525s == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2523p = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2515f;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f2523p = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2515f;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f2523p = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f2515f[1] = this.f2525s.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2515f);
            this.f2513c = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2517h * 255.0f));
            if (!this.f2527y) {
                this.f2513c.getDrawable(0).setAlpha((int) ((1.0f - this.f2517h) * 255.0f));
            }
            super.setImageDrawable(this.f2513c);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f2516g.f2534q;
    }

    public float getContrast() {
        return this.f2516g.f2531g;
    }

    public float getCrossfade() {
        return this.f2517h;
    }

    public float getImagePanX() {
        return this.f2514e;
    }

    public float getImagePanY() {
        return this.f2519j;
    }

    public float getImageRotate() {
        return this.f2521m;
    }

    public float getImageZoom() {
        return this.f2522o;
    }

    public float getRound() {
        return this.f2528z;
    }

    public float getRoundPercent() {
        return this.f2518i;
    }

    public float getSaturation() {
        return this.f2516g.f2533n;
    }

    public float getWarmth() {
        return this.f2516g.f48443f7l8;
    }

    @Override // android.view.View
    public void layout(int l2, int t2, int r2, int b2) {
        super.layout(l2, t2, r2, b2);
        m1606i();
    }

    public void setAltImageResource(int resId) {
        Drawable drawableMutate = C6045k.toq(getContext(), resId).mutate();
        this.f2525s = drawableMutate;
        Drawable[] drawableArr = this.f2515f;
        drawableArr[0] = this.f2523p;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2515f);
        this.f2513c = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2517h);
    }

    public void setBrightness(float brightness) {
        zy zyVar = this.f2516g;
        zyVar.f2534q = brightness;
        zyVar.zy(this);
    }

    public void setContrast(float contrast) {
        zy zyVar = this.f2516g;
        zyVar.f2531g = contrast;
        zyVar.zy(this);
    }

    public void setCrossfade(float crossfade) {
        this.f2517h = crossfade;
        if (this.f2515f != null) {
            if (!this.f2527y) {
                this.f2513c.getDrawable(0).setAlpha((int) ((1.0f - this.f2517h) * 255.0f));
            }
            this.f2513c.getDrawable(1).setAlpha((int) (this.f2517h * 255.0f));
            super.setImageDrawable(this.f2513c);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2525s == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f2523p = drawableMutate;
        Drawable[] drawableArr = this.f2515f;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2525s;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2515f);
        this.f2513c = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2517h);
    }

    public void setImagePanX(float pan) {
        this.f2514e = pan;
        fn3e();
    }

    public void setImagePanY(float pan) {
        this.f2519j = pan;
        fn3e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f2525s == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable drawableMutate = C6045k.toq(getContext(), resId).mutate();
        this.f2523p = drawableMutate;
        Drawable[] drawableArr = this.f2515f;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2525s;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2515f);
        this.f2513c = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2517h);
    }

    public void setImageRotate(float rotation) {
        this.f2521m = rotation;
        fn3e();
    }

    public void setImageZoom(float zoom) {
        this.f2522o = zoom;
        fn3e();
    }

    @hyr(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f2528z = round;
            float f2 = this.f2518i;
            this.f2518i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f2528z != round;
        this.f2528z = round;
        if (round != 0.0f) {
            if (this.f2526t == null) {
                this.f2526t = new Path();
            }
            if (this.f2520l == null) {
                this.f2520l = new RectF();
            }
            if (this.f2524r == null) {
                toq toqVar = new toq();
                this.f2524r = toqVar;
                setOutlineProvider(toqVar);
            }
            setClipToOutline(true);
            this.f2520l.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2526t.reset();
            Path path = this.f2526t;
            RectF rectF = this.f2520l;
            float f3 = this.f2528z;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    @hyr(21)
    public void setRoundPercent(float round) {
        boolean z2 = this.f2518i != round;
        this.f2518i = round;
        if (round != 0.0f) {
            if (this.f2526t == null) {
                this.f2526t = new Path();
            }
            if (this.f2520l == null) {
                this.f2520l = new RectF();
            }
            if (this.f2524r == null) {
                C0387k c0387k = new C0387k();
                this.f2524r = c0387k;
                setOutlineProvider(c0387k);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2518i) / 2.0f;
            this.f2520l.set(0.0f, 0.0f, width, height);
            this.f2526t.reset();
            this.f2526t.addRoundRect(this.f2520l, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        zy zyVar = this.f2516g;
        zyVar.f2533n = saturation;
        zyVar.zy(this);
    }

    public void setWarmth(float warmth) {
        zy zyVar = this.f2516g;
        zyVar.f48443f7l8 = warmth;
        zyVar.zy(this);
    }

    public ImageFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2516g = new zy();
        this.f2527y = true;
        this.f2525s = null;
        this.f2523p = null;
        this.f2517h = 0.0f;
        this.f2518i = 0.0f;
        this.f2528z = Float.NaN;
        this.f2515f = new Drawable[2];
        this.f2514e = Float.NaN;
        this.f2519j = Float.NaN;
        this.f2522o = Float.NaN;
        this.f2521m = Float.NaN;
        t8r(context, attrs);
    }

    public ImageFilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2516g = new zy();
        this.f2527y = true;
        this.f2525s = null;
        this.f2523p = null;
        this.f2517h = 0.0f;
        this.f2518i = 0.0f;
        this.f2528z = Float.NaN;
        this.f2515f = new Drawable[2];
        this.f2514e = Float.NaN;
        this.f2519j = Float.NaN;
        this.f2522o = Float.NaN;
        this.f2521m = Float.NaN;
        t8r(context, attrs);
    }
}

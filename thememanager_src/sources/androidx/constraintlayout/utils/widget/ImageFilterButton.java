package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C0394g;
import p023g.C6045k;
import zy.hyr;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: c */
    private Drawable f2495c;

    /* JADX INFO: renamed from: e */
    private float f2496e;

    /* JADX INFO: renamed from: f */
    private Drawable f2497f;

    /* JADX INFO: renamed from: g */
    private ImageFilterView.zy f2498g;

    /* JADX INFO: renamed from: h */
    private Path f2499h;

    /* JADX INFO: renamed from: i */
    ViewOutlineProvider f2500i;

    /* JADX INFO: renamed from: j */
    private float f2501j;

    /* JADX INFO: renamed from: l */
    private boolean f2502l;

    /* JADX INFO: renamed from: m */
    private float f2503m;

    /* JADX INFO: renamed from: o */
    private float f2504o;

    /* JADX INFO: renamed from: p */
    private float f2505p;

    /* JADX INFO: renamed from: r */
    LayerDrawable f2506r;

    /* JADX INFO: renamed from: s */
    private float f2507s;

    /* JADX INFO: renamed from: t */
    Drawable[] f2508t;

    /* JADX INFO: renamed from: y */
    private float f2509y;

    /* JADX INFO: renamed from: z */
    RectF f2510z;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$k */
    class C0386k extends ViewOutlineProvider {
        C0386k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f2507s) / 2.0f);
        }
    }

    class toq extends ViewOutlineProvider {
        toq() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2505p);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f2498g = new ImageFilterView.zy();
        this.f2509y = 0.0f;
        this.f2507s = 0.0f;
        this.f2505p = Float.NaN;
        this.f2508t = new Drawable[2];
        this.f2502l = true;
        this.f2497f = null;
        this.f2495c = null;
        this.f2496e = Float.NaN;
        this.f2501j = Float.NaN;
        this.f2504o = Float.NaN;
        this.f2503m = Float.NaN;
        zy(context, null);
    }

    /* JADX INFO: renamed from: n */
    private void m1604n() {
        if (Float.isNaN(this.f2496e) && Float.isNaN(this.f2501j) && Float.isNaN(this.f2504o) && Float.isNaN(this.f2503m)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m1605q();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1605q() {
        if (Float.isNaN(this.f2496e) && Float.isNaN(this.f2501j) && Float.isNaN(this.f2504o) && Float.isNaN(this.f2503m)) {
            return;
        }
        float f2 = Float.isNaN(this.f2496e) ? 0.0f : this.f2496e;
        float f3 = Float.isNaN(this.f2501j) ? 0.0f : this.f2501j;
        float f4 = Float.isNaN(this.f2504o) ? 1.0f : this.f2504o;
        float f5 = Float.isNaN(this.f2503m) ? 0.0f : this.f2503m;
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
        this.f2502l = overlay;
    }

    private void zy(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.pku);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f2497f = typedArrayObtainStyledAttributes.getDrawable(C0394g.qrj.u5);
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.gd) {
                    this.f2509y = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0394g.qrj.ztlo) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.fz5f) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.sr6) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.ewa) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0394g.qrj.gxqa) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0394g.qrj.xtsf) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f2502l));
                } else if (index == C0394g.qrj.li) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f2496e));
                } else if (index == C0394g.qrj.hm78) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f2501j));
                } else if (index == C0394g.qrj.vv3) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f2503m));
                } else if (index == C0394g.qrj.rc) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f2504o));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2495c = drawable;
            if (this.f2497f == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2495c = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2508t;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f2495c = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2508t;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f2495c = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f2508t[1] = this.f2497f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2508t);
            this.f2506r = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2509y * 255.0f));
            if (!this.f2502l) {
                this.f2506r.getDrawable(0).setAlpha((int) ((1.0f - this.f2509y) * 255.0f));
            }
            super.setImageDrawable(this.f2506r);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f2498g.f2531g;
    }

    public float getCrossfade() {
        return this.f2509y;
    }

    public float getImagePanX() {
        return this.f2496e;
    }

    public float getImagePanY() {
        return this.f2501j;
    }

    public float getImageRotate() {
        return this.f2503m;
    }

    public float getImageZoom() {
        return this.f2504o;
    }

    public float getRound() {
        return this.f2505p;
    }

    public float getRoundPercent() {
        return this.f2507s;
    }

    public float getSaturation() {
        return this.f2498g.f2533n;
    }

    public float getWarmth() {
        return this.f2498g.f48443f7l8;
    }

    @Override // android.view.View
    public void layout(int l2, int t2, int r2, int b2) {
        super.layout(l2, t2, r2, b2);
        m1605q();
    }

    public void setAltImageResource(int resId) {
        Drawable drawableMutate = C6045k.toq(getContext(), resId).mutate();
        this.f2497f = drawableMutate;
        Drawable[] drawableArr = this.f2508t;
        drawableArr[0] = this.f2495c;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2508t);
        this.f2506r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2509y);
    }

    public void setBrightness(float brightness) {
        ImageFilterView.zy zyVar = this.f2498g;
        zyVar.f2534q = brightness;
        zyVar.zy(this);
    }

    public void setContrast(float contrast) {
        ImageFilterView.zy zyVar = this.f2498g;
        zyVar.f2531g = contrast;
        zyVar.zy(this);
    }

    public void setCrossfade(float crossfade) {
        this.f2509y = crossfade;
        if (this.f2508t != null) {
            if (!this.f2502l) {
                this.f2506r.getDrawable(0).setAlpha((int) ((1.0f - this.f2509y) * 255.0f));
            }
            this.f2506r.getDrawable(1).setAlpha((int) (this.f2509y * 255.0f));
            super.setImageDrawable(this.f2506r);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2497f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f2495c = drawableMutate;
        Drawable[] drawableArr = this.f2508t;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2497f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2508t);
        this.f2506r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2509y);
    }

    public void setImagePanX(float pan) {
        this.f2496e = pan;
        m1604n();
    }

    public void setImagePanY(float pan) {
        this.f2501j = pan;
        m1604n();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f2497f == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable drawableMutate = C6045k.toq(getContext(), resId).mutate();
        this.f2495c = drawableMutate;
        Drawable[] drawableArr = this.f2508t;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f2497f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2508t);
        this.f2506r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2509y);
    }

    public void setImageRotate(float rotation) {
        this.f2503m = rotation;
        m1604n();
    }

    public void setImageZoom(float zoom) {
        this.f2504o = zoom;
        m1604n();
    }

    @hyr(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f2505p = round;
            float f2 = this.f2507s;
            this.f2507s = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f2505p != round;
        this.f2505p = round;
        if (round != 0.0f) {
            if (this.f2499h == null) {
                this.f2499h = new Path();
            }
            if (this.f2510z == null) {
                this.f2510z = new RectF();
            }
            if (this.f2500i == null) {
                toq toqVar = new toq();
                this.f2500i = toqVar;
                setOutlineProvider(toqVar);
            }
            setClipToOutline(true);
            this.f2510z.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2499h.reset();
            Path path = this.f2499h;
            RectF rectF = this.f2510z;
            float f3 = this.f2505p;
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
        boolean z2 = this.f2507s != round;
        this.f2507s = round;
        if (round != 0.0f) {
            if (this.f2499h == null) {
                this.f2499h = new Path();
            }
            if (this.f2510z == null) {
                this.f2510z = new RectF();
            }
            if (this.f2500i == null) {
                C0386k c0386k = new C0386k();
                this.f2500i = c0386k;
                setOutlineProvider(c0386k);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2507s) / 2.0f;
            this.f2510z.set(0.0f, 0.0f, width, height);
            this.f2499h.reset();
            this.f2499h.addRoundRect(this.f2510z, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        ImageFilterView.zy zyVar = this.f2498g;
        zyVar.f2533n = saturation;
        zyVar.zy(this);
    }

    public void setWarmth(float warmth) {
        ImageFilterView.zy zyVar = this.f2498g;
        zyVar.f48443f7l8 = warmth;
        zyVar.zy(this);
    }

    public ImageFilterButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2498g = new ImageFilterView.zy();
        this.f2509y = 0.0f;
        this.f2507s = 0.0f;
        this.f2505p = Float.NaN;
        this.f2508t = new Drawable[2];
        this.f2502l = true;
        this.f2497f = null;
        this.f2495c = null;
        this.f2496e = Float.NaN;
        this.f2501j = Float.NaN;
        this.f2504o = Float.NaN;
        this.f2503m = Float.NaN;
        zy(context, attrs);
    }

    public ImageFilterButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2498g = new ImageFilterView.zy();
        this.f2509y = 0.0f;
        this.f2507s = 0.0f;
        this.f2505p = Float.NaN;
        this.f2508t = new Drawable[2];
        this.f2502l = true;
        this.f2497f = null;
        this.f2495c = null;
        this.f2496e = Float.NaN;
        this.f2501j = Float.NaN;
        this.f2504o = Float.NaN;
        this.f2503m = Float.NaN;
        zy(context, attrs);
    }
}

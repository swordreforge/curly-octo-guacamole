package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.resources.zy;
import com.google.android.material.shape.C4103h;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.t8r;
import h4b.C6070k;
import ij.C6095k;
import p023g.C6045k;
import zy.InterfaceC7829h;
import zy.cdj;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.n7h;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements t8r {

    /* JADX INFO: renamed from: u */
    private static final int f24502u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    private static final int f24503x = C6095k.n7h.fiyg;

    /* JADX INFO: renamed from: a */
    private boolean f24504a;

    /* JADX INFO: renamed from: b */
    @cdj
    private int f24505b;

    /* JADX INFO: renamed from: c */
    @cdj
    private int f24506c;

    /* JADX INFO: renamed from: e */
    @cdj
    private int f24507e;

    /* JADX INFO: renamed from: f */
    private Path f24508f;

    /* JADX INFO: renamed from: g */
    private final C4103h f24509g;

    /* JADX INFO: renamed from: h */
    private final Paint f24510h;

    /* JADX INFO: renamed from: i */
    private final Path f24511i;

    /* JADX INFO: renamed from: j */
    @cdj
    private int f24512j;

    /* JADX INFO: renamed from: l */
    @cdj
    private float f24513l;

    /* JADX INFO: renamed from: m */
    @cdj
    private int f24514m;

    /* JADX INFO: renamed from: o */
    @cdj
    private int f24515o;

    /* JADX INFO: renamed from: p */
    private final Paint f24516p;

    /* JADX INFO: renamed from: r */
    private kja0 f24517r;

    /* JADX INFO: renamed from: s */
    private final RectF f24518s;

    /* JADX INFO: renamed from: t */
    @dd
    private C4108p f24519t;

    /* JADX INFO: renamed from: y */
    private final RectF f24520y;

    /* JADX INFO: renamed from: z */
    @dd
    private ColorStateList f24521z;

    /* JADX INFO: renamed from: com.google.android.material.imageview.ShapeableImageView$k */
    @TargetApi(21)
    class C4035k extends ViewOutlineProvider {

        /* JADX INFO: renamed from: k */
        private final Rect f24522k = new Rect();

        C4035k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f24517r == null) {
                return;
            }
            if (ShapeableImageView.this.f24519t == null) {
                ShapeableImageView.this.f24519t = new C4108p(ShapeableImageView.this.f24517r);
            }
            ShapeableImageView.this.f24520y.round(this.f24522k);
            ShapeableImageView.this.f24519t.setBounds(this.f24522k);
            ShapeableImageView.this.f24519t.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void fn3e(Canvas canvas) {
        if (this.f24521z == null) {
            return;
        }
        this.f24516p.setStrokeWidth(this.f24513l);
        int colorForState = this.f24521z.getColorForState(getDrawableState(), this.f24521z.getDefaultColor());
        if (this.f24513l <= 0.0f || colorForState == 0) {
            return;
        }
        this.f24516p.setColor(colorForState);
        canvas.drawPath(this.f24511i, this.f24516p);
    }

    private void fu4(int i2, int i3) {
        this.f24520y.set(getPaddingLeft(), getPaddingTop(), i2 - getPaddingRight(), i3 - getPaddingBottom());
        this.f24509g.m14814q(this.f24517r, 1.0f, this.f24520y, this.f24511i);
        this.f24508f.rewind();
        this.f24508f.addPath(this.f24511i);
        this.f24518s.set(0.0f, 0.0f, i2, i3);
        this.f24508f.addRect(this.f24518s, Path.Direction.CCW);
    }

    private boolean ni7() {
        return getLayoutDirection() == 1;
    }

    private boolean zurt() {
        return (this.f24514m == Integer.MIN_VALUE && this.f24505b == Integer.MIN_VALUE) ? false : true;
    }

    @cdj
    public int getContentPaddingBottom() {
        return this.f24515o;
    }

    @cdj
    public final int getContentPaddingEnd() {
        int i2 = this.f24505b;
        return i2 != Integer.MIN_VALUE ? i2 : ni7() ? this.f24506c : this.f24512j;
    }

    @cdj
    public int getContentPaddingLeft() {
        int i2;
        int i3;
        if (zurt()) {
            if (ni7() && (i3 = this.f24505b) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!ni7() && (i2 = this.f24514m) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f24506c;
    }

    @cdj
    public int getContentPaddingRight() {
        int i2;
        int i3;
        if (zurt()) {
            if (ni7() && (i3 = this.f24514m) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!ni7() && (i2 = this.f24505b) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f24512j;
    }

    @cdj
    public final int getContentPaddingStart() {
        int i2 = this.f24514m;
        return i2 != Integer.MIN_VALUE ? i2 : ni7() ? this.f24512j : this.f24506c;
    }

    @cdj
    public int getContentPaddingTop() {
        return this.f24507e;
    }

    @Override // android.view.View
    @cdj
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @cdj
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @cdj
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @cdj
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @cdj
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @cdj
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.t8r
    @lvui
    public kja0 getShapeAppearanceModel() {
        return this.f24517r;
    }

    @dd
    public ColorStateList getStrokeColor() {
        return this.f24521z;
    }

    @cdj
    public float getStrokeWidth() {
        return this.f24513l;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f24508f, this.f24510h);
        fn3e(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f24504a && isLayoutDirectionResolved()) {
            this.f24504a = true;
            if (isPaddingRelative() || zurt()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        fu4(i2, i3);
    }

    public void setContentPadding(@cdj int i2, @cdj int i3, @cdj int i4, @cdj int i5) {
        this.f24514m = Integer.MIN_VALUE;
        this.f24505b = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f24506c) + i2, (super.getPaddingTop() - this.f24507e) + i3, (super.getPaddingRight() - this.f24512j) + i4, (super.getPaddingBottom() - this.f24515o) + i5);
        this.f24506c = i2;
        this.f24507e = i3;
        this.f24512j = i4;
        this.f24515o = i5;
    }

    @hyr(17)
    public void setContentPaddingRelative(@cdj int i2, @cdj int i3, @cdj int i4, @cdj int i5) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i2, (super.getPaddingTop() - this.f24507e) + i3, (super.getPaddingEnd() - getContentPaddingEnd()) + i4, (super.getPaddingBottom() - this.f24515o) + i5);
        this.f24506c = ni7() ? i4 : i2;
        this.f24507e = i3;
        if (!ni7()) {
            i2 = i4;
        }
        this.f24512j = i2;
        this.f24515o = i5;
    }

    @Override // android.view.View
    public void setPadding(@cdj int i2, @cdj int i3, @cdj int i4, @cdj int i5) {
        super.setPadding(i2 + getContentPaddingLeft(), i3 + getContentPaddingTop(), i4 + getContentPaddingRight(), i5 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@cdj int i2, @cdj int i3, @cdj int i4, @cdj int i5) {
        super.setPaddingRelative(i2 + getContentPaddingStart(), i3 + getContentPaddingTop(), i4 + getContentPaddingEnd(), i5 + getContentPaddingBottom());
    }

    @Override // com.google.android.material.shape.t8r
    public void setShapeAppearanceModel(@lvui kja0 kja0Var) {
        this.f24517r = kja0Var;
        C4108p c4108p = this.f24519t;
        if (c4108p != null) {
            c4108p.setShapeAppearanceModel(kja0Var);
        }
        fu4(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@dd ColorStateList colorStateList) {
        this.f24521z = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@n7h int i2) {
        setStrokeColor(C6045k.m22274k(getContext(), i2));
    }

    public void setStrokeWidth(@cdj float f2) {
        if (this.f24513l != f2) {
            this.f24513l = f2;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@InterfaceC7829h int i2) {
        setStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public ShapeableImageView(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24503x;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24509g = C4103h.ld6();
        this.f24511i = new Path();
        this.f24504a = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f24510h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f24520y = new RectF();
        this.f24518s = new RectF();
        this.f24508f = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6095k.kja0.huhj, i2, i3);
        this.f24521z = zy.m14753k(context2, typedArrayObtainStyledAttributes, C6095k.kja0.gwe);
        this.f24513l = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.asr, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.u9o, 0);
        this.f24506c = dimensionPixelSize;
        this.f24507e = dimensionPixelSize;
        this.f24512j = dimensionPixelSize;
        this.f24515o = dimensionPixelSize;
        this.f24506c = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.y84p, dimensionPixelSize);
        this.f24507e = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.u7mb, dimensionPixelSize);
        this.f24512j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.ou1, dimensionPixelSize);
        this.f24515o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.zhll, dimensionPixelSize);
        this.f24514m = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.wgc, Integer.MIN_VALUE);
        this.f24505b = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.xky, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f24516p = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f24517r = kja0.m14820n(context2, attributeSet, i2, i3).qrj();
        setOutlineProvider(new C4035k());
    }
}

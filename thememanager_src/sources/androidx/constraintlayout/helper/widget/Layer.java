package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f48001ab = "Layer";

    /* JADX INFO: renamed from: a */
    protected float f2139a;

    /* JADX INFO: renamed from: b */
    protected float f2140b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f48002bo;

    /* JADX INFO: renamed from: c */
    private float f2141c;

    /* JADX INFO: renamed from: d */
    private boolean f2142d;

    /* JADX INFO: renamed from: e */
    protected float f2143e;

    /* JADX INFO: renamed from: f */
    private float f2144f;

    /* JADX INFO: renamed from: j */
    protected float f2145j;

    /* JADX INFO: renamed from: l */
    ConstraintLayout f2146l;

    /* JADX INFO: renamed from: m */
    protected float f2147m;

    /* JADX INFO: renamed from: o */
    protected float f2148o;

    /* JADX INFO: renamed from: r */
    private float f2149r;

    /* JADX INFO: renamed from: t */
    private float f2150t;

    /* JADX INFO: renamed from: u */
    View[] f2151u;

    /* JADX INFO: renamed from: v */
    private float f2152v;

    /* JADX INFO: renamed from: w */
    private boolean f2153w;

    /* JADX INFO: renamed from: x */
    boolean f2154x;

    /* JADX INFO: renamed from: z */
    private float f2155z;

    public Layer(Context context) {
        super(context);
        this.f2155z = Float.NaN;
        this.f2150t = Float.NaN;
        this.f2149r = Float.NaN;
        this.f2144f = 1.0f;
        this.f2141c = 1.0f;
        this.f2143e = Float.NaN;
        this.f2145j = Float.NaN;
        this.f2148o = Float.NaN;
        this.f2147m = Float.NaN;
        this.f2140b = Float.NaN;
        this.f2139a = Float.NaN;
        this.f2154x = true;
        this.f2151u = null;
        this.f48002bo = 0.0f;
        this.f2152v = 0.0f;
    }

    private void d2ok() {
        if (this.f2146l == null) {
            return;
        }
        if (this.f2151u == null) {
            eqxt();
        }
        oc();
        double radians = Float.isNaN(this.f2149r) ? 0.0d : Math.toRadians(this.f2149r);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f2 = this.f2144f;
        float f3 = f2 * fCos;
        float f4 = this.f2141c;
        float f5 = (-f4) * fSin;
        float f6 = f2 * fSin;
        float f7 = f4 * fCos;
        for (int i2 = 0; i2 < this.f2604q; i2++) {
            View view = this.f2151u[i2];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f8 = left - this.f2143e;
            float f9 = top - this.f2145j;
            float f10 = (((f3 * f8) + (f5 * f9)) - f8) + this.f48002bo;
            float f11 = (((f8 * f6) + (f7 * f9)) - f9) + this.f2152v;
            view.setTranslationX(f10);
            view.setTranslationY(f11);
            view.setScaleY(this.f2141c);
            view.setScaleX(this.f2144f);
            if (!Float.isNaN(this.f2149r)) {
                view.setRotation(this.f2149r);
            }
        }
    }

    private void eqxt() {
        int i2;
        if (this.f2146l == null || (i2 = this.f2604q) == 0) {
            return;
        }
        View[] viewArr = this.f2151u;
        if (viewArr == null || viewArr.length != i2) {
            this.f2151u = new View[i2];
        }
        for (int i3 = 0; i3 < this.f2604q; i3++) {
            this.f2151u[i3] = this.f2146l.dd(this.f2601k[i3]);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void fti(ConstraintLayout container) {
        this.f2146l = container;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f2149r = rotation;
        } else {
            if (Float.isNaN(this.f2149r)) {
                return;
            }
            this.f2149r = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void jk(ConstraintLayout container) {
        eqxt();
        this.f2143e = Float.NaN;
        this.f2145j = Float.NaN;
        C0341n qVar = ((ConstraintLayout.toq) getLayoutParams()).toq();
        qVar.m2t(0);
        qVar.pc(0);
        oc();
        layout(((int) this.f2140b) - getPaddingLeft(), ((int) this.f2139a) - getPaddingTop(), ((int) this.f2148o) + getPaddingRight(), ((int) this.f2147m) + getPaddingBottom());
        d2ok();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void ki(ConstraintLayout container) {
        cdj(container);
    }

    protected void oc() {
        if (this.f2146l == null) {
            return;
        }
        if (this.f2154x || Float.isNaN(this.f2143e) || Float.isNaN(this.f2145j)) {
            if (!Float.isNaN(this.f2155z) && !Float.isNaN(this.f2150t)) {
                this.f2145j = this.f2150t;
                this.f2143e = this.f2155z;
                return;
            }
            View[] viewArrNi7 = ni7(this.f2146l);
            int left = viewArrNi7[0].getLeft();
            int top = viewArrNi7[0].getTop();
            int right = viewArrNi7[0].getRight();
            int bottom = viewArrNi7[0].getBottom();
            for (int i2 = 0; i2 < this.f2604q; i2++) {
                View view = viewArrNi7[i2];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f2148o = right;
            this.f2147m = bottom;
            this.f2140b = left;
            this.f2139a = top;
            if (Float.isNaN(this.f2155z)) {
                this.f2143e = (left + right) / 2;
            } else {
                this.f2143e = this.f2155z;
            }
            if (Float.isNaN(this.f2150t)) {
                this.f2145j = (top + bottom) / 2;
            } else {
                this.f2145j = this.f2150t;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2146l = (ConstraintLayout) getParent();
        if (this.f2142d || this.f2153w) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f2604q; i2++) {
                View viewDd = this.f2146l.dd(this.f2601k[i2]);
                if (viewDd != null) {
                    if (this.f2142d) {
                        viewDd.setVisibility(visibility);
                    }
                    if (this.f2153w && elevation > 0.0f) {
                        viewDd.setTranslationZ(viewDd.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        m1619h();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.f2155z = pivotX;
        d2ok();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.f2150t = pivotY;
        d2ok();
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.f2149r = angle;
        d2ok();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.f2144f = scaleX;
        d2ok();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.f2141c = scaleY;
        d2ok();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.f48002bo = dx;
        d2ok();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.f2152v = dy;
        d2ok();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        m1619h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        super.mo1374z(attrs);
        this.f2606y = false;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.bbg) {
                    this.f2142d = true;
                } else if (index == C0394g.qrj.ngvg) {
                    this.f2153w = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public Layer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2155z = Float.NaN;
        this.f2150t = Float.NaN;
        this.f2149r = Float.NaN;
        this.f2144f = 1.0f;
        this.f2141c = 1.0f;
        this.f2143e = Float.NaN;
        this.f2145j = Float.NaN;
        this.f2148o = Float.NaN;
        this.f2147m = Float.NaN;
        this.f2140b = Float.NaN;
        this.f2139a = Float.NaN;
        this.f2154x = true;
        this.f2151u = null;
        this.f48002bo = 0.0f;
        this.f2152v = 0.0f;
    }

    public Layer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2155z = Float.NaN;
        this.f2150t = Float.NaN;
        this.f2149r = Float.NaN;
        this.f2144f = 1.0f;
        this.f2141c = 1.0f;
        this.f2143e = Float.NaN;
        this.f2145j = Float.NaN;
        this.f2148o = Float.NaN;
        this.f2147m = Float.NaN;
        this.f2140b = Float.NaN;
        this.f2139a = Float.NaN;
        this.f2154x = true;
        this.f2151u = null;
        this.f48002bo = 0.0f;
        this.f2152v = 0.0f;
    }
}

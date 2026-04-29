package com.android.thememanager.activity;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.properties.C6326k;
import kotlin.properties.InterfaceC6325g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ShadowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public class ShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private static final int f8819a = 2;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final float f57274ab = 0.0f;

    /* JADX INFO: renamed from: b */
    private static final int f8820b = 1;
    public static final int bb = 0;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f57275bo = 15;
    public static final int bp = 15;

    /* JADX INFO: renamed from: d */
    public static final int f8821d = 0;

    /* JADX INFO: renamed from: m */
    public static final boolean f8823m = false;

    /* JADX INFO: renamed from: u */
    private static final int f8825u = 8;

    /* JADX INFO: renamed from: v */
    public static final int f8826v = 0;

    /* JADX INFO: renamed from: w */
    public static final float f8827w = 0.0f;

    /* JADX INFO: renamed from: x */
    private static final int f8828x = 4;

    /* JADX INFO: renamed from: c */
    @InterfaceC7396q
    private final InterfaceC6325g f8829c;

    /* JADX INFO: renamed from: e */
    @InterfaceC7395n
    private RectF f8830e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7396q
    private final InterfaceC6325g f8831f;

    /* JADX INFO: renamed from: g */
    private float f8832g;

    /* JADX INFO: renamed from: h */
    private float f8833h;

    /* JADX INFO: renamed from: i */
    private int f8834i;

    /* JADX INFO: renamed from: k */
    @zy.x2
    private int f8835k;

    /* JADX INFO: renamed from: l */
    @InterfaceC7396q
    private Path f8836l;

    /* JADX INFO: renamed from: n */
    private float f8837n;

    /* JADX INFO: renamed from: p */
    @zy.x2
    private int f8838p;

    /* JADX INFO: renamed from: q */
    private float f8839q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7396q
    private Paint f8840r;

    /* JADX INFO: renamed from: s */
    @zy.x2
    private int f8841s;

    /* JADX INFO: renamed from: t */
    private boolean f8842t;

    /* JADX INFO: renamed from: y */
    private float f8843y;

    /* JADX INFO: renamed from: z */
    private boolean f8844z;

    /* JADX INFO: renamed from: o */
    static final /* synthetic */ kotlin.reflect.kja0<Object>[] f8824o = {kotlin.jvm.internal.a98o.ld6(new kotlin.jvm.internal.uv6(ShadowLayout.class, "mXfermode", "getMXfermode()Landroid/graphics/PorterDuffXfermode;", 0)), kotlin.jvm.internal.a98o.ld6(new kotlin.jvm.internal.uv6(ShadowLayout.class, "mContentRF", "getMContentRF()Landroid/graphics/RectF;", 0))};

    /* JADX INFO: renamed from: j */
    @InterfaceC7396q
    public static final C1548k f8822j = new C1548k(null);

    /* JADX INFO: renamed from: com.android.thememanager.activity.ShadowLayout$k */
    /* JADX INFO: compiled from: ShadowLayout.kt */
    public static final class C1548k {
        private C1548k() {
        }

        public /* synthetic */ C1548k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: ShadowLayout.kt */
    static final class toq extends AbstractC6308r implements cyoe.x2<Canvas, kotlin.was> {
        toq() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ kotlin.was invoke(Canvas canvas) {
            invoke2(canvas);
            return kotlin.was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Canvas it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            ShadowLayout.super.dispatchDraw(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        this.f8834i = 15;
        this.f8844z = true;
        this.f8842t = true;
        this.f8840r = pjz9.m6470n(null, -1, 1, null);
        this.f8836l = new Path();
        C6326k c6326k = C6326k.f36482k;
        this.f8831f = c6326k.m23238k();
        this.f8829c = c6326k.m23238k();
        m6355g(context, attributeSet, i2);
        f7l8();
        m6357p();
        setLayerType(1, null);
    }

    private final void f7l8() {
        setMXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: renamed from: g */
    private final void m6355g(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.C2036i.rnfm, i2, 0);
        kotlin.jvm.internal.d2ok.kja0(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f8835k = typedArrayObtainStyledAttributes.getColor(6, 0);
            this.f8839q = typedArrayObtainStyledAttributes.getDimension(8, context.getResources().getDimension(R.dimen.nav_view_bottom_padding));
            this.f8837n = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
            this.f8832g = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
            this.f8843y = typedArrayObtainStyledAttributes.getDimension(3, context.getResources().getDimension(R.dimen.nav_view_bottom_padding));
            this.f8841s = typedArrayObtainStyledAttributes.getColor(1, 0);
            this.f8838p = typedArrayObtainStyledAttributes.getColor(0, 0);
            this.f8833h = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
            this.f8834i = typedArrayObtainStyledAttributes.getInt(7, 15);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final RectF getMContentRF() {
        return (RectF) this.f8829c.mo23237k(this, f8824o[1]);
    }

    private final PorterDuffXfermode getMXfermode() {
        return (PorterDuffXfermode) this.f8831f.mo23237k(this, f8824o[0]);
    }

    /* JADX INFO: renamed from: p */
    private final void m6357p() {
        int iAbs = (int) (this.f8839q + Math.abs(this.f8837n));
        int iAbs2 = (int) (this.f8839q + Math.abs(this.f8832g));
        int i2 = pjz9.m6469k(this.f8834i, 8) ? iAbs : 0;
        int i3 = pjz9.m6469k(this.f8834i, 1) ? iAbs2 : 0;
        if (!pjz9.m6469k(this.f8834i, 2)) {
            iAbs = 0;
        }
        if (!pjz9.m6469k(this.f8834i, 4)) {
            iAbs2 = 0;
        }
        setPadding(i2, i3, iAbs, iAbs2);
    }

    /* JADX INFO: renamed from: q */
    private final void m6358q(Canvas canvas) {
        canvas.save();
        if (m6360s()) {
            this.f8840r.setShadowLayer(this.f8839q, this.f8837n, this.f8832g, this.f8835k);
        }
        this.f8840r.setColor(this.f8838p);
        RectF mContentRF = getMContentRF();
        float f2 = this.f8843y;
        canvas.drawRoundRect(mContentRF, f2, f2, this.f8840r);
        pjz9.m6471p(this.f8840r, null, null, 3, null);
        canvas.restore();
    }

    private final void setMContentRF(RectF rectF) {
        this.f8829c.toq(this, f8824o[1], rectF);
    }

    private final void setMXfermode(PorterDuffXfermode porterDuffXfermode) {
        this.f8831f.toq(this, f8824o[0], porterDuffXfermode);
    }

    private final void toq(Canvas canvas) {
        RectF rectF;
        if (this.f8833h > 0.0f && (rectF = this.f8830e) != null) {
            canvas.save();
            this.f8840r.setStrokeWidth(this.f8833h);
            this.f8840r.setStyle(Paint.Style.STROKE);
            this.f8840r.setColor(this.f8841s);
            float f2 = this.f8843y;
            canvas.drawRoundRect(rectF, f2, f2, this.f8840r);
            pjz9.m6471p(this.f8840r, null, null, 3, null);
            canvas.restore();
        }
    }

    private final void zy(Canvas canvas, cyoe.x2<? super Canvas, kotlin.was> x2Var) {
        canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f8840r, 31);
        x2Var.invoke(canvas);
        if (m6361y()) {
            Path path = this.f8836l;
            path.addRect(getMContentRF(), Path.Direction.CW);
            RectF mContentRF = getMContentRF();
            float f2 = this.f8843y;
            path.addRoundRect(mContentRF, f2, f2, Path.Direction.CW);
            path.setFillType(Path.FillType.EVEN_ODD);
            this.f8836l = path;
            this.f8840r.setXfermode(getMXfermode());
            canvas.drawPath(this.f8836l, this.f8840r);
        }
        pjz9.m6471p(this.f8840r, null, null, 3, null);
        this.f8836l.reset();
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@InterfaceC7395n Canvas canvas) {
        if (canvas == null) {
            return;
        }
        pjz9.m6468g(canvas, false);
        m6358q(canvas);
        zy(canvas, new toq());
        toq(canvas);
    }

    protected final int getHorizontalSkew() {
        int i2 = pjz9.m6469k(this.f8834i, 8) ? (int) (0 + this.f8839q) : 0;
        if (pjz9.m6469k(this.f8834i, 2)) {
            i2 = (int) (i2 + this.f8839q);
        }
        return (int) (i2 + Math.abs(this.f8837n));
    }

    protected final int getMBackgroundColor() {
        return this.f8838p;
    }

    protected final int getVerticalSkew() {
        int i2 = pjz9.m6469k(this.f8834i, 1) ? (int) (0 + this.f8839q) : 0;
        if (pjz9.m6469k(this.f8834i, 4)) {
            i2 = (int) (i2 + this.f8839q);
        }
        return (int) (i2 + Math.abs(this.f8832g));
    }

    public final void ld6() {
        this.f8844z = true;
        this.f8842t = true;
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final void m6359n() {
        this.f8844z = false;
        this.f8842t = false;
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size + getHorizontalSkew(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2 + getVerticalSkew(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        setMContentRF(new RectF(getPaddingLeft(), getPaddingTop(), i2 - getPaddingRight(), i3 - getPaddingBottom()));
        float f2 = this.f8833h;
        if (f2 > 0.0f) {
            this.f8830e = new RectF(getMContentRF().left + f2, getMContentRF().top + f2, getMContentRF().right - f2, getMContentRF().bottom - f2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6360s() {
        return this.f8844z;
    }

    protected final void setMBackgroundColor(int i2) {
        this.f8838p = i2;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6361y() {
        return this.f8842t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@InterfaceC7396q Context context) {
        this(context, null);
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        this(context, attributeSet, R.attr.shadowLayout, 0);
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
    }
}

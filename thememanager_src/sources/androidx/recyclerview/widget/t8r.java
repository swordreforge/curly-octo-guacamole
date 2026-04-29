package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: LinearSmoothScroller.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r extends RecyclerView.AbstractC1058t {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final boolean f52303cdj = false;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f52304fn3e = 1;

    /* JADX INFO: renamed from: i */
    public static final int f6102i = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f52305ki = 25.0f;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final float f52306ni7 = 1.2f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f52307t8r = 10000;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f52308zurt = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected PointF f52310ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f52311n7h;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final DisplayMetrics f52313x2;

    /* JADX INFO: renamed from: s */
    protected final LinearInterpolator f6105s = new LinearInterpolator();

    /* JADX INFO: renamed from: p */
    protected final DecelerateInterpolator f6104p = new DecelerateInterpolator();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f52312qrj = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected int f52309kja0 = 0;

    /* JADX INFO: renamed from: h */
    protected int f6103h = 0;

    public t8r(Context context) {
        this.f52313x2 = context.getResources().getDisplayMetrics();
    }

    private int o1t(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* JADX INFO: renamed from: t */
    private float m5120t() {
        if (!this.f52312qrj) {
            this.f52311n7h = ni7(this.f52313x2);
            this.f52312qrj = true;
        }
        return this.f52311n7h;
    }

    public int fn3e(View view, int i2) {
        RecyclerView.AbstractC1048h abstractC1048hM4864n = m4864n();
        if (abstractC1048hM4864n == null || !abstractC1048hM4864n.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
        return mo5121i(abstractC1048hM4864n.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin, abstractC1048hM4864n.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin, abstractC1048hM4864n.getPaddingLeft(), abstractC1048hM4864n.getWidth() - abstractC1048hM4864n.getPaddingRight(), i2);
    }

    protected int fu4(int i2) {
        return (int) Math.ceil(((double) mo5122z(i2)) / 0.3356d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t
    /* JADX INFO: renamed from: h */
    protected void mo4862h(View view, RecyclerView.mcp mcpVar, RecyclerView.AbstractC1058t.k kVar) {
        int iFn3e = fn3e(view, wvg());
        int iZurt = zurt(view, mcp());
        int iFu4 = fu4((int) Math.sqrt((iFn3e * iFn3e) + (iZurt * iZurt)));
        if (iFu4 > 0) {
            kVar.x2(-iFn3e, -iZurt, iFu4, this.f6104p);
        }
    }

    /* JADX INFO: renamed from: i */
    public int mo5121i(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    protected void jk(RecyclerView.AbstractC1058t.k kVar) {
        PointF pointFMo4863k = mo4863k(m4861g());
        if (pointFMo4863k == null || (pointFMo4863k.x == 0.0f && pointFMo4863k.y == 0.0f)) {
            kVar.m4869g(m4861g());
            t8r();
            return;
        }
        m4865p(pointFMo4863k);
        this.f52310ld6 = pointFMo4863k;
        this.f52309kja0 = (int) (pointFMo4863k.x * 10000.0f);
        this.f6103h = (int) (pointFMo4863k.y * 10000.0f);
        kVar.x2((int) (this.f52309kja0 * f52306ni7), (int) (this.f6103h * f52306ni7), (int) (mo5122z(10000) * f52306ni7), this.f6105s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t
    protected void kja0() {
        this.f6103h = 0;
        this.f52309kja0 = 0;
        this.f52310ld6 = null;
    }

    protected int mcp() {
        PointF pointF = this.f52310ld6;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t
    protected void n7h() {
    }

    protected float ni7(DisplayMetrics displayMetrics) {
        return f52305ki / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t
    protected void qrj(int i2, int i3, RecyclerView.mcp mcpVar, RecyclerView.AbstractC1058t.k kVar) {
        if (zy() == 0) {
            t8r();
            return;
        }
        this.f52309kja0 = o1t(this.f52309kja0, i2);
        int iO1t = o1t(this.f6103h, i3);
        this.f6103h = iO1t;
        if (this.f52309kja0 == 0 && iO1t == 0) {
            jk(kVar);
        }
    }

    protected int wvg() {
        PointF pointF = this.f52310ld6;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    protected int mo5122z(int i2) {
        return (int) Math.ceil(Math.abs(i2) * m5120t());
    }

    public int zurt(View view, int i2) {
        RecyclerView.AbstractC1048h abstractC1048hM4864n = m4864n();
        if (abstractC1048hM4864n == null || !abstractC1048hM4864n.canScrollVertically()) {
            return 0;
        }
        RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
        return mo5121i(abstractC1048hM4864n.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) cdjVar).topMargin, abstractC1048hM4864n.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin, abstractC1048hM4864n.getPaddingTop(), abstractC1048hM4864n.getHeight() - abstractC1048hM4864n.getPaddingBottom(), i2);
    }
}

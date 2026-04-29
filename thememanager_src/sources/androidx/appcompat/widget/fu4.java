package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.C0683f;
import p030n.C7397k;

/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
class fu4 extends fn3e {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private PorterDuff.Mode f46862f7l8;

    /* JADX INFO: renamed from: g */
    private ColorStateList f1015g;

    /* JADX INFO: renamed from: n */
    private Drawable f1016n;

    /* JADX INFO: renamed from: q */
    private final SeekBar f1017q;

    /* JADX INFO: renamed from: s */
    private boolean f1018s;

    /* JADX INFO: renamed from: y */
    private boolean f1019y;

    fu4(SeekBar seekBar) {
        super(seekBar);
        this.f1015g = null;
        this.f46862f7l8 = null;
        this.f1019y = false;
        this.f1018s = false;
        this.f1017q = seekBar;
    }

    /* JADX INFO: renamed from: g */
    private void m592g() {
        Drawable drawable = this.f1016n;
        if (drawable != null) {
            if (this.f1019y || this.f1018s) {
                Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(drawable.mutate());
                this.f1016n = drawableKi;
                if (this.f1019y) {
                    androidx.core.graphics.drawable.zy.kja0(drawableKi, this.f1015g);
                }
                if (this.f1018s) {
                    androidx.core.graphics.drawable.zy.m2442h(this.f1016n, this.f46862f7l8);
                }
                if (this.f1016n.isStateful()) {
                    this.f1016n.setState(this.f1017q.getDrawableState());
                }
            }
        }
    }

    void f7l8(Canvas canvas) {
        if (this.f1016n != null) {
            int max = this.f1017q.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1016n.getIntrinsicWidth();
                int intrinsicHeight = this.f1016n.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1016n.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1017q.getWidth() - this.f1017q.getPaddingLeft()) - this.f1017q.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1017q.getPaddingLeft(), this.f1017q.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1016n.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void kja0(@zy.dd PorterDuff.Mode mode) {
        this.f46862f7l8 = mode;
        this.f1018s = true;
        m592g();
    }

    @zy.dd
    PorterDuff.Mode ld6() {
        return this.f46862f7l8;
    }

    void n7h(@zy.dd ColorStateList colorStateList) {
        this.f1015g = colorStateList;
        this.f1019y = true;
        m592g();
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    ColorStateList m593p() {
        return this.f1015g;
    }

    void qrj(@zy.dd Drawable drawable) {
        Drawable drawable2 = this.f1016n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1016n = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1017q);
            androidx.core.graphics.drawable.zy.qrj(drawable, C0683f.m3159e(this.f1017q));
            if (drawable.isStateful()) {
                drawable.setState(this.f1017q.getDrawableState());
            }
            m592g();
        }
        this.f1017q.invalidate();
    }

    @zy.dd
    /* JADX INFO: renamed from: s */
    Drawable m594s() {
        return this.f1016n;
    }

    void x2() {
        Drawable drawable = this.f1016n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: y */
    void m595y() {
        Drawable drawable = this.f1016n;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1017q.getDrawableState())) {
            this.f1017q.invalidateDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.fn3e
    void zy(AttributeSet attributeSet, int i2) {
        super.zy(attributeSet, i2);
        Context context = this.f1017q.getContext();
        int[] iArr = C7397k.qrj.f92793yqrt;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1017q;
        C0683f.ij(seekBar, seekBar.getContext(), iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        Drawable drawableM551s = c0184bJp0y.m551s(C7397k.qrj.f92684kcsr);
        if (drawableM551s != null) {
            this.f1017q.setThumb(drawableM551s);
        }
        qrj(c0184bJp0y.m553y(C7397k.qrj.f92620bwp));
        int i3 = C7397k.qrj.f92661gc3c;
        if (c0184bJp0y.mcp(i3)) {
            this.f46862f7l8 = oc.m697n(c0184bJp0y.kja0(i3, -1), this.f46862f7l8);
            this.f1018s = true;
        }
        int i4 = C7397k.qrj.f92749se;
        if (c0184bJp0y.mcp(i4)) {
            this.f1015g = c0184bJp0y.m550q(i4);
            this.f1019y = true;
        }
        c0184bJp0y.d3();
        m592g();
    }
}

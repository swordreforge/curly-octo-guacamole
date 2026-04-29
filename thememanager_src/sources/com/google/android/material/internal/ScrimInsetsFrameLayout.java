package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C0683f;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import ij.C6095k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private boolean f24535g;

    /* JADX INFO: renamed from: k */
    @dd
    Drawable f24536k;

    /* JADX INFO: renamed from: n */
    private Rect f24537n;

    /* JADX INFO: renamed from: q */
    Rect f24538q;

    /* JADX INFO: renamed from: y */
    private boolean f24539y;

    /* JADX INFO: renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$k */
    class C4042k implements eqxt {
        C4042k() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, @lvui tfm tfmVar) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f24538q == null) {
                scrimInsetsFrameLayout.f24538q = new Rect();
            }
            ScrimInsetsFrameLayout.this.f24538q.set(tfmVar.m3467h(), tfmVar.ki(), tfmVar.cdj(), tfmVar.kja0());
            ScrimInsetsFrameLayout.this.mo14530k(tfmVar);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!tfmVar.ni7() || ScrimInsetsFrameLayout.this.f24536k == null);
            C0683f.h7am(ScrimInsetsFrameLayout.this);
            return tfmVar.zy();
        }
    }

    public ScrimInsetsFrameLayout(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@lvui Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f24538q == null || this.f24536k == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f24535g) {
            this.f24537n.set(0, 0, width, this.f24538q.top);
            this.f24536k.setBounds(this.f24537n);
            this.f24536k.draw(canvas);
        }
        if (this.f24539y) {
            this.f24537n.set(0, height - this.f24538q.bottom, width, height);
            this.f24536k.setBounds(this.f24537n);
            this.f24536k.draw(canvas);
        }
        Rect rect = this.f24537n;
        Rect rect2 = this.f24538q;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f24536k.setBounds(this.f24537n);
        this.f24536k.draw(canvas);
        Rect rect3 = this.f24537n;
        Rect rect4 = this.f24538q;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f24536k.setBounds(this.f24537n);
        this.f24536k.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: k */
    protected void mo14530k(tfm tfmVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24536k;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f24536k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z2) {
        this.f24539y = z2;
    }

    public void setDrawTopInsetForeground(boolean z2) {
        this.f24535g = z2;
    }

    public void setScrimInsetForeground(@dd Drawable drawable) {
        this.f24536k = drawable;
    }

    public ScrimInsetsFrameLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24537n = new Rect();
        this.f24535g = true;
        this.f24539y = true;
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.n9v, i2, C6095k.n7h.xu7, new int[0]);
        this.f24536k = typedArrayM14534p.getDrawable(C6095k.kja0.q7yl);
        typedArrayM14534p.recycle();
        setWillNotDraw(true);
        C0683f.kx3(this, new C4042k());
    }
}

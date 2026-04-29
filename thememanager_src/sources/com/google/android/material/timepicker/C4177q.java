package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0683f;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.qrj;
import ij.C6095k;
import zy.cdj;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: renamed from: com.google.android.material.timepicker.q */
/* JADX INFO: compiled from: RadialViewGroup.java */
/* JADX INFO: loaded from: classes2.dex */
class C4177q extends ConstraintLayout {
    private static final String az = "skip";
    private int as;
    private C4108p bg;
    private final Runnable bl;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.q$k */
    /* JADX INFO: compiled from: RadialViewGroup.java */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4177q.this.ek5k();
        }
    }

    public C4177q(@lvui Context context) {
        this(context, null);
    }

    private Drawable hb() {
        C4108p c4108p = new C4108p();
        this.bg = c4108p;
        c4108p.a98o(new qrj(0.5f));
        this.bg.m14867x(ColorStateList.valueOf(-1));
        return this.bg;
    }

    /* JADX INFO: renamed from: m */
    private static boolean m15137m(View view) {
        return az.equals(view.getTag());
    }

    private void yz() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.bl);
            handler.post(this.bl);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(C0683f.jk());
        }
        yz();
    }

    protected void ek5k() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (m15137m(getChildAt(i3))) {
                i2++;
            }
        }
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            int i5 = C6095k.y.f80126zsr0;
            if (id != i5 && !m15137m(childAt)) {
                c0397q.lvui(childAt.getId(), i5, this.as, f2);
                f2 += 360.0f / (childCount - i2);
            }
        }
        c0397q.ki(this);
    }

    @cdj
    /* JADX INFO: renamed from: j */
    public int m15138j() {
        return this.as;
    }

    /* JADX INFO: renamed from: o */
    public void mo15106o(@cdj int i2) {
        this.as = i2;
        ek5k();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ek5k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        yz();
    }

    @Override // android.view.View
    public void setBackgroundColor(@x2 int i2) {
        this.bg.m14867x(ColorStateList.valueOf(i2));
    }

    public C4177q(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4177q(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(C6095k.ld6.f35609o, this);
        C0683f.wlev(this, hb());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.tm71, i2, 0);
        this.as = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.tgj1, 0);
        this.bl = new k();
        typedArrayObtainStyledAttributes.recycle();
    }
}

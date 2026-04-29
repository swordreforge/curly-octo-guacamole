package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0683f;
import com.google.android.material.internal.cdj;
import com.google.android.material.internal.ki;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.ld6;
import h4b.C6070k;
import ij.C6095k;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int ar = C6095k.n7h.y9o6;
    private static final ImageView.ScaleType[] bc = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private boolean aj;

    @dd
    private Integer ay;
    private boolean be;

    @dd
    private ImageView.ScaleType bs;

    @dd
    private Boolean k0;

    public MaterialToolbar(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m14045e() {
        ImageView imageViewM14555q = ki.m14555q(this);
        if (imageViewM14555q != null) {
            Boolean bool = this.k0;
            if (bool != null) {
                imageViewM14555q.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.bs;
            if (scaleType != null) {
                imageViewM14555q.setScaleType(scaleType);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private Pair<Integer, Integer> m14046l(@dd TextView textView, @dd TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i2 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i2 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i2 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void lrht(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i2, view.getTop(), i3, view.getBottom());
    }

    private void n5r1(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C4108p c4108p = new C4108p();
            c4108p.m14867x(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c4108p.m14856e(context);
            c4108p.zp(C0683f.m3166l(this));
            C0683f.wlev(this, c4108p);
        }
    }

    private void uv6() {
        if (this.be || this.aj) {
            TextView textViewM14556s = ki.m14556s(this);
            TextView textViewF7l8 = ki.f7l8(this);
            if (textViewM14556s == null && textViewF7l8 == null) {
                return;
            }
            Pair<Integer, Integer> pairM14046l = m14046l(textViewM14556s, textViewF7l8);
            if (this.be && textViewM14556s != null) {
                lrht(textViewM14556s, pairM14046l);
            }
            if (!this.aj || textViewF7l8 == null) {
                return;
            }
            lrht(textViewF7l8, pairM14046l);
        }
    }

    @dd
    private Drawable vyq(@dd Drawable drawable) {
        if (drawable == null || this.ay == null) {
            return drawable;
        }
        Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(drawable.mutate());
        androidx.core.graphics.drawable.zy.n7h(drawableKi, this.ay.intValue());
        return drawableKi;
    }

    /* JADX INFO: renamed from: c */
    public boolean m14047c() {
        return this.be;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14048f() {
        return this.aj;
    }

    @dd
    public ImageView.ScaleType getLogoScaleType() {
        return this.bs;
    }

    @x2
    @dd
    public Integer getNavigationIconTint() {
        return this.ay;
    }

    public boolean hyr() {
        Boolean bool = this.k0;
        return bool != null && bool.booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld6.m14843n(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        uv6();
        m14045e();
    }

    @Override // android.view.View
    @hyr(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        ld6.m14844q(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.k0;
        if (bool == null || bool.booleanValue() != z2) {
            this.k0 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(@lvui ImageView.ScaleType scaleType) {
        if (this.bs != scaleType) {
            this.bs = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@dd Drawable drawable) {
        super.setNavigationIcon(vyq(drawable));
    }

    public void setNavigationIconTint(@x2 int i2) {
        this.ay = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.aj != z2) {
            this.aj = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.be != z2) {
            this.be = z2;
            requestLayout();
        }
    }

    public MaterialToolbar(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.rv);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = ar;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.dbvq, i2, i3, new int[0]);
        int i4 = C6095k.kja0.ef;
        if (typedArrayM14534p.hasValue(i4)) {
            setNavigationIconTint(typedArrayM14534p.getColor(i4, -1));
        }
        this.be = typedArrayM14534p.getBoolean(C6095k.kja0.uey, false);
        this.aj = typedArrayM14534p.getBoolean(C6095k.kja0.p1, false);
        int i5 = typedArrayM14534p.getInt(C6095k.kja0.ogyu, -1);
        if (i5 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = bc;
            if (i5 < scaleTypeArr.length) {
                this.bs = scaleTypeArr[i5];
            }
        }
        int i6 = C6095k.kja0.mam;
        if (typedArrayM14534p.hasValue(i6)) {
            this.k0 = Boolean.valueOf(typedArrayM14534p.getBoolean(i6, false));
        }
        typedArrayM14534p.recycle();
        n5r1(context2);
    }
}

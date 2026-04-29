package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.zy;
import androidx.core.widget.C0760q;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import h4b.C6070k;
import ij.C6095k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: h */
    private static final int f24113h = C6095k.n7h.f5k;

    /* JADX INFO: renamed from: i */
    private static final int[][] f24114i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: p */
    private boolean f24115p;

    /* JADX INFO: renamed from: s */
    private boolean f24116s;

    /* JADX INFO: renamed from: y */
    @dd
    private ColorStateList f24117y;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24117y == null) {
            int[][] iArr = f24114i;
            int[] iArr2 = new int[iArr.length];
            int iM14285q = kja0.m14285q(this, C6095k.zy.f80172exv8);
            int iM14285q2 = kja0.m14285q(this, C6095k.zy.f80274sc);
            int iM14285q3 = kja0.m14285q(this, C6095k.zy.f80280tjz5);
            iArr2[0] = kja0.qrj(iM14285q2, iM14285q, 1.0f);
            iArr2[1] = kja0.qrj(iM14285q2, iM14285q3, 0.54f);
            iArr2[2] = kja0.qrj(iM14285q2, iM14285q3, 0.38f);
            iArr2[3] = kja0.qrj(iM14285q2, iM14285q3, 0.38f);
            this.f24117y = new ColorStateList(iArr, iArr2);
        }
        return this.f24117y;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24116s && C0760q.toq(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableM3663k;
        if (!this.f24115p || !TextUtils.isEmpty(getText()) || (drawableM3663k = C0760q.m3663k(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM3663k.getIntrinsicWidth()) / 2) * (C4058z.ld6(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM3663k.getBounds();
            zy.x2(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f24115p = z2;
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f24116s = z2;
        if (z2) {
            C0760q.m3665q(this, getMaterialThemeColorsTintList());
        } else {
            C0760q.m3665q(this, null);
        }
    }

    public boolean toq() {
        return this.f24115p;
    }

    public boolean zy() {
        return this.f24116s;
    }

    public MaterialCheckBox(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80332zwy);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24113h;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.uz6, i2, i3, new int[0]);
        int i4 = C6095k.kja0.s08;
        if (typedArrayM14534p.hasValue(i4)) {
            C0760q.m3665q(this, com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, i4));
        }
        this.f24116s = typedArrayM14534p.getBoolean(C6095k.kja0.nv, false);
        this.f24115p = typedArrayM14534p.getBoolean(C6095k.kja0.o3u0, true);
        typedArrayM14534p.recycle();
    }
}

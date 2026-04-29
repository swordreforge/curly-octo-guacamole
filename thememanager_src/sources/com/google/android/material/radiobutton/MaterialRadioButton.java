package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0760q;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.cdj;
import com.google.android.material.resources.zy;
import h4b.C6070k;
import ij.C6095k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: s */
    private boolean f24863s;

    /* JADX INFO: renamed from: y */
    @dd
    private ColorStateList f24864y;

    /* JADX INFO: renamed from: p */
    private static final int f24862p = C6095k.n7h.mxfl;

    /* JADX INFO: renamed from: h */
    private static final int[][] f24861h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public MaterialRadioButton(@lvui Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24864y == null) {
            int iM14285q = kja0.m14285q(this, C6095k.zy.f80172exv8);
            int iM14285q2 = kja0.m14285q(this, C6095k.zy.f80280tjz5);
            int iM14285q3 = kja0.m14285q(this, C6095k.zy.f80274sc);
            int[][] iArr = f24861h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = kja0.qrj(iM14285q3, iM14285q, 1.0f);
            iArr2[1] = kja0.qrj(iM14285q3, iM14285q2, 0.54f);
            iArr2[2] = kja0.qrj(iM14285q3, iM14285q2, 0.38f);
            iArr2[3] = kja0.qrj(iM14285q3, iM14285q2, 0.38f);
            this.f24864y = new ColorStateList(iArr, iArr2);
        }
        return this.f24864y;
    }

    /* JADX INFO: renamed from: k */
    public boolean m14734k() {
        return this.f24863s;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24863s && C0760q.toq(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f24863s = z2;
        if (z2) {
            C0760q.m3665q(this, getMaterialThemeColorsTintList());
        } else {
            C0760q.m3665q(this, null);
        }
    }

    public MaterialRadioButton(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.o2sn);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24862p;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.jz7r, i2, i3, new int[0]);
        int i4 = C6095k.kja0.pp;
        if (typedArrayM14534p.hasValue(i4)) {
            C0760q.m3665q(this, zy.m14753k(context2, typedArrayM14534p, i4));
        }
        this.f24863s = typedArrayM14534p.getBoolean(C6095k.kja0.xb, false);
        typedArrayM14534p.recycle();
    }
}

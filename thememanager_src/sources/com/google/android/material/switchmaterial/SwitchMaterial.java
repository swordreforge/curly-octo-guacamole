package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import h4b.C6070k;
import ij.C6095k;
import pjz9.C7607k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    @dd
    private ColorStateList tgs;

    @lvui
    private final C7607k tlhn;

    @dd
    private ColorStateList w97r;
    private boolean yl25;
    private static final int zmmu = C6095k.n7h.oz47;
    private static final int[][] sk1t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public SwitchMaterial(@lvui Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.w97r == null) {
            int iM14285q = kja0.m14285q(this, C6095k.zy.f80274sc);
            int iM14285q2 = kja0.m14285q(this, C6095k.zy.f80172exv8);
            float dimension = getResources().getDimension(C6095k.g.fv);
            if (this.tlhn.x2()) {
                dimension += C4058z.m14625p(this);
            }
            int iM27909n = this.tlhn.m27909n(iM14285q, dimension);
            int[][] iArr = sk1t;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = kja0.qrj(iM14285q, iM14285q2, 1.0f);
            iArr2[1] = iM27909n;
            iArr2[2] = kja0.qrj(iM14285q, iM14285q2, 0.38f);
            iArr2[3] = iM27909n;
            this.w97r = new ColorStateList(iArr, iArr2);
        }
        return this.w97r;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.tgs == null) {
            int[][] iArr = sk1t;
            int[] iArr2 = new int[iArr.length];
            int iM14285q = kja0.m14285q(this, C6095k.zy.f80274sc);
            int iM14285q2 = kja0.m14285q(this, C6095k.zy.f80172exv8);
            int iM14285q3 = kja0.m14285q(this, C6095k.zy.f80280tjz5);
            iArr2[0] = kja0.qrj(iM14285q, iM14285q2, 0.54f);
            iArr2[1] = kja0.qrj(iM14285q, iM14285q3, 0.32f);
            iArr2[2] = kja0.qrj(iM14285q, iM14285q2, 0.12f);
            iArr2[3] = kja0.qrj(iM14285q, iM14285q3, 0.12f);
            this.tgs = new ColorStateList(iArr, iArr2);
        }
        return this.tgs;
    }

    public boolean cdj() {
        return this.yl25;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.yl25 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.yl25 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.yl25 = z2;
        if (z2) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.tkle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = zmmu;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        this.tlhn = new C7607k(context2);
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.xavr, i2, i3, new int[0]);
        this.yl25 = typedArrayM14534p.getBoolean(C6095k.kja0.ypv, false);
        typedArrayM14534p.recycle();
    }
}

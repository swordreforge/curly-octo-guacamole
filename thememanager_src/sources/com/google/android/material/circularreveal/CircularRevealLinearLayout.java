package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.circularreveal.zy;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class CircularRevealLinearLayout extends LinearLayout implements zy {

    /* JADX INFO: renamed from: k */
    @lvui
    private final toq f24157k;

    public CircularRevealLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.zy
    public void draw(@lvui Canvas canvas) {
        toq toqVar = this.f24157k;
        if (toqVar != null) {
            toqVar.zy(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.zy
    @dd
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f24157k.f7l8();
    }

    @Override // com.google.android.material.circularreveal.zy
    public int getCircularRevealScrimColor() {
        return this.f24157k.m14252y();
    }

    @Override // com.google.android.material.circularreveal.zy
    @dd
    public zy.C3979n getRevealInfo() {
        return this.f24157k.m14251p();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.zy
    public boolean isOpaque() {
        toq toqVar = this.f24157k;
        return toqVar != null ? toqVar.x2() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.zy
    /* JADX INFO: renamed from: k */
    public void mo14242k() {
        this.f24157k.m14250k();
    }

    @Override // com.google.android.material.circularreveal.toq.InterfaceC3977k
    /* JADX INFO: renamed from: q */
    public boolean mo14243q() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setCircularRevealOverlayDrawable(@dd Drawable drawable) {
        this.f24157k.qrj(drawable);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setCircularRevealScrimColor(@x2 int i2) {
        this.f24157k.n7h(i2);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setRevealInfo(@dd zy.C3979n c3979n) {
        this.f24157k.kja0(c3979n);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void toq() {
        this.f24157k.toq();
    }

    @Override // com.google.android.material.circularreveal.toq.InterfaceC3977k
    public void zy(Canvas canvas) {
        super.draw(canvas);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24157k = new toq(this);
    }
}

package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.toq;
import com.google.android.material.circularreveal.zy;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements zy {

    @lvui
    private final toq an;

    public CircularRevealCoordinatorLayout(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.zy
    public void draw(Canvas canvas) {
        toq toqVar = this.an;
        if (toqVar != null) {
            toqVar.zy(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.zy
    @dd
    public Drawable getCircularRevealOverlayDrawable() {
        return this.an.f7l8();
    }

    @Override // com.google.android.material.circularreveal.zy
    public int getCircularRevealScrimColor() {
        return this.an.m14252y();
    }

    @Override // com.google.android.material.circularreveal.zy
    @dd
    public zy.C3979n getRevealInfo() {
        return this.an.m14251p();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.zy
    public boolean isOpaque() {
        toq toqVar = this.an;
        return toqVar != null ? toqVar.x2() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.zy
    /* JADX INFO: renamed from: k */
    public void mo14242k() {
        this.an.m14250k();
    }

    @Override // com.google.android.material.circularreveal.toq.InterfaceC3977k
    /* JADX INFO: renamed from: q */
    public boolean mo14243q() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setCircularRevealOverlayDrawable(@dd Drawable drawable) {
        this.an.qrj(drawable);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setCircularRevealScrimColor(@x2 int i2) {
        this.an.n7h(i2);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setRevealInfo(@dd zy.C3979n c3979n) {
        this.an.kja0(c3979n);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void toq() {
        this.an.toq();
    }

    @Override // com.google.android.material.circularreveal.toq.InterfaceC3977k
    public void zy(Canvas canvas) {
        super.draw(canvas);
    }

    public CircularRevealCoordinatorLayout(@lvui Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.an = new toq(this);
    }
}

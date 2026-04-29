package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.toq;
import com.google.android.material.circularreveal.zy;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class CircularRevealCardView extends MaterialCardView implements zy {

    /* JADX INFO: renamed from: v */
    @lvui
    private final toq f24159v;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.zy
    public void draw(Canvas canvas) {
        toq toqVar = this.f24159v;
        if (toqVar != null) {
            toqVar.zy(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.zy
    @dd
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f24159v.f7l8();
    }

    @Override // com.google.android.material.circularreveal.zy
    public int getCircularRevealScrimColor() {
        return this.f24159v.m14252y();
    }

    @Override // com.google.android.material.circularreveal.zy
    @dd
    public zy.C3979n getRevealInfo() {
        return this.f24159v.m14251p();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.zy
    public boolean isOpaque() {
        toq toqVar = this.f24159v;
        return toqVar != null ? toqVar.x2() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.zy
    /* JADX INFO: renamed from: k */
    public void mo14242k() {
        this.f24159v.m14250k();
    }

    @Override // com.google.android.material.circularreveal.toq.InterfaceC3977k
    /* JADX INFO: renamed from: q */
    public boolean mo14243q() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setCircularRevealOverlayDrawable(@dd Drawable drawable) {
        this.f24159v.qrj(drawable);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setCircularRevealScrimColor(@x2 int i2) {
        this.f24159v.n7h(i2);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void setRevealInfo(@dd zy.C3979n c3979n) {
        this.f24159v.kja0(c3979n);
    }

    @Override // com.google.android.material.circularreveal.zy
    public void toq() {
        this.f24159v.toq();
    }

    @Override // com.google.android.material.circularreveal.toq.InterfaceC3977k
    public void zy(Canvas canvas) {
        super.draw(canvas);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24159v = new toq(this);
    }
}

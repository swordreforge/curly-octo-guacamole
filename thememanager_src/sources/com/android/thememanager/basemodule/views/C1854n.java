package com.android.thememanager.basemodule.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.views.n */
/* JADX INFO: compiled from: CenterSpaceImageSpan.java */
/* JADX INFO: loaded from: classes.dex */
public class C1854n extends ImageSpan {

    /* JADX INFO: renamed from: k */
    private final int f10598k;

    /* JADX INFO: renamed from: q */
    private final int f10599q;

    public C1854n(Drawable drawable) {
        this(drawable, 0, 0);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@lvui Canvas canvas, CharSequence text, int start, int end, float x3, int top, int y3, int bottom, @lvui Paint paint) {
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = this.f10598k + x3;
        int i2 = ((((fontMetricsInt.descent + y3) + y3) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f2, i2);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(@lvui Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        return this.f10598k + super.getSize(paint, text, start, end, fm) + this.f10599q;
    }

    public C1854n(Drawable drawable, int marginLeft, int marginRight) {
        super(drawable);
        this.f10598k = marginLeft;
        this.f10599q = marginRight;
    }
}

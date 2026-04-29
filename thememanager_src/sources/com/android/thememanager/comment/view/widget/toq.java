package com.android.thememanager.comment.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: compiled from: VerticalImageSpan.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends ImageSpan {
    public toq(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x3, int top, int y3, int bottom, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        int i2 = paint.getFontMetricsInt().descent;
        canvas.translate(x3, ((y3 + i2) - ((i2 - r3.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i2 = fontMetricsInt2.descent;
            int i3 = fontMetricsInt2.ascent;
            int i4 = i3 + ((i2 - i3) / 2);
            int i5 = (bounds.bottom - bounds.top) / 2;
            int i6 = i4 - i5;
            fontMetricsInt.ascent = i6;
            fontMetricsInt.top = i6;
            int i7 = i4 + i5;
            fontMetricsInt.bottom = i7;
            fontMetricsInt.descent = i7;
        }
        return bounds.right;
    }

    public toq(Context context, int resourceId) {
        super(context, resourceId);
    }
}

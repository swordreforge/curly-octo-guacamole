package com.miui.clock.classic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.miui.clock.C5049g;
import gcp.C6062n;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class PlaceHolderTextView extends TextView {

    /* JADX INFO: renamed from: g */
    private int f28875g;

    /* JADX INFO: renamed from: k */
    private boolean f28876k;

    /* JADX INFO: renamed from: n */
    private int f28877n;

    /* JADX INFO: renamed from: q */
    private Paint f28878q;

    /* JADX INFO: renamed from: s */
    private int f28879s;

    /* JADX INFO: renamed from: y */
    private int f28880y;

    public PlaceHolderTextView(Context context) {
        super(context);
        toq();
    }

    /* JADX INFO: renamed from: k */
    private int m17633k(int i2) {
        return (int) (getResources().getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    private void toq() {
        Paint paint = new Paint();
        this.f28878q = paint;
        paint.setColor(getPaint().getColor());
        this.f28878q.setStyle(Paint.Style.FILL);
        this.f28876k = TextUtils.isEmpty(getText());
        this.f28877n = m17633k(C5049g.q.ek);
        this.f28875g = m17633k(C5049g.q.zc);
        this.f28880y = m17633k(C5049g.q.h4g);
        this.f28879s = m17633k(C5049g.q.ngvg);
        setPadding(this.f28876k ? this.f28877n : 0, 0, 0, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f28876k) {
            float height = ((getHeight() - this.f28875g) + (this.f28880y * 2)) / 2.0f;
            Log.e("zggg", "paddingStart = " + getPaddingStart());
            int i2 = this.f28880y;
            float f2 = (float) i2;
            float f3 = (float) (this.f28877n - i2);
            float f4 = (this.f28875g + height) - (i2 * 2);
            int i3 = this.f28879s;
            canvas.drawRoundRect(f2, height, f3, f4, i3, i3, this.f28878q);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        this.f28876k = zIsEmpty;
        setPadding(zIsEmpty ? this.f28877n : 0, 0, 0, 0);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        this.f28878q.setColor(i2);
    }

    public PlaceHolderTextView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        toq();
    }

    public PlaceHolderTextView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        toq();
    }
}

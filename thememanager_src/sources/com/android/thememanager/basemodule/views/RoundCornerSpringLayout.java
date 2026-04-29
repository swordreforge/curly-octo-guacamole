package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import miuix.springback.view.SpringBackLayout;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class RoundCornerSpringLayout extends SpringBackLayout {
    private Path ar;
    private RectF bc;
    private int bd;
    private float[] bs;
    private int bu;
    private final Paint k0;

    public RoundCornerSpringLayout(@lvui Context context) {
        super(context);
        this.bs = new float[8];
        this.k0 = new Paint(1);
        this.ar = new Path();
        this.bc = new RectF();
        m7322c();
    }

    /* JADX INFO: renamed from: c */
    private void m7322c() {
        this.k0.setAntiAlias(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.ar.reset();
        this.ar.addRoundRect(this.bc, this.bs, Path.Direction.CW);
        canvas.clipPath(this.ar);
        super.dispatchDraw(canvas);
    }

    public void lrht(int topSize, int bottomSize) {
        int i2;
        if (Math.abs(topSize - this.bu) > 5 || Math.abs(bottomSize - this.bd) > 5) {
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                this.bs[i3] = topSize;
                i3++;
            }
            for (i2 = 4; i2 < 8; i2++) {
                this.bs[i2] = bottomSize;
            }
            invalidate();
            this.bu = topSize;
            this.bd = bottomSize;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        RectF rectF = this.bc;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = w2;
        rectF.bottom = h2;
    }

    public RoundCornerSpringLayout(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.bs = new float[8];
        this.k0 = new Paint(1);
        this.ar = new Path();
        this.bc = new RectF();
        m7322c();
    }
}

package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: CutoutDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
class zy extends C4108p {

    @lvui
    private final RectF an;

    @lvui
    private final Paint bv;

    zy() {
        this(null);
    }

    private void m4() {
        this.bv.setStyle(Paint.Style.FILL_AND_STROKE);
        this.bv.setColor(-1);
        this.bv.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    void i9jn() {
        ltg8(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void ltg8(float f2, float f3, float f4, float f5) {
        RectF rectF = this.an;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    boolean py() {
        return !this.an.isEmpty();
    }

    void r8s8(@lvui RectF rectF) {
        ltg8(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.C4108p
    protected void t8r(@lvui Canvas canvas) {
        if (this.an.isEmpty()) {
            super.t8r(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.an);
        super.t8r(canvas);
        canvas.restore();
    }

    zy(@dd kja0 kja0Var) {
        super(kja0Var == null ? new kja0() : kja0Var);
        this.bv = new Paint(1);
        m4();
        this.an = new RectF();
    }
}

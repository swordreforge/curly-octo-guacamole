package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.color.kja0;
import zy.lvui;
import zy.zurt;

/* JADX INFO: compiled from: CircularDrawingDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy extends AbstractC4088y<C4082n> {

    /* JADX INFO: renamed from: g */
    private float f24858g;

    /* JADX INFO: renamed from: n */
    private float f24859n;

    /* JADX INFO: renamed from: q */
    private float f24860q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67772zy;

    public zy(@lvui C4082n c4082n) {
        super(c4082n);
        this.f67772zy = 1;
    }

    /* JADX INFO: renamed from: s */
    private int m14732s() {
        S s2 = this.f24857k;
        return ((C4082n) s2).f67743f7l8 + (((C4082n) s2).f24821y * 2);
    }

    /* JADX INFO: renamed from: y */
    private void m14733y(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        canvas.save();
        canvas.rotate(f4);
        float f5 = this.f24858g;
        float f6 = f2 / 2.0f;
        canvas.drawRoundRect(new RectF(f5 - f6, f3, f5 + f6, -f3), f3, f3, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    /* JADX INFO: renamed from: k */
    public void mo14704k(@lvui Canvas canvas, @zurt(from = 0.0d, to = 1.0d) float f2) {
        S s2 = this.f24857k;
        float f3 = (((C4082n) s2).f67743f7l8 / 2.0f) + ((C4082n) s2).f24821y;
        canvas.translate(f3, f3);
        canvas.rotate(-90.0f);
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        this.f67772zy = ((C4082n) this.f24857k).f24820s == 0 ? 1 : -1;
        this.f24860q = ((C4082n) r5).f24847k * f2;
        this.f24859n = ((C4082n) r5).f67766toq * f2;
        this.f24858g = (((C4082n) r5).f67743f7l8 - ((C4082n) r5).f24847k) / 2.0f;
        if ((this.f67771toq.qrj() && ((C4082n) this.f24857k).f24848n == 2) || (this.f67771toq.x2() && ((C4082n) this.f24857k).f24846g == 1)) {
            this.f24858g += ((1.0f - f2) * ((C4082n) this.f24857k).f24847k) / 2.0f;
        } else if ((this.f67771toq.qrj() && ((C4082n) this.f24857k).f24848n == 1) || (this.f67771toq.x2() && ((C4082n) this.f24857k).f24846g == 2)) {
            this.f24858g -= ((1.0f - f2) * ((C4082n) this.f24857k).f24847k) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    /* JADX INFO: renamed from: n */
    public int mo14705n() {
        return m14732s();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    /* JADX INFO: renamed from: q */
    public int mo14706q() {
        return m14732s();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    void toq(@lvui Canvas canvas, @lvui Paint paint, @zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3, @zy.x2 int i2) {
        if (f2 == f3) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i2);
        paint.setStrokeWidth(this.f24860q);
        int i3 = this.f67772zy;
        float f4 = f2 * 360.0f * i3;
        float f5 = (f3 >= f2 ? f3 - f2 : (1.0f + f3) - f2) * 360.0f * i3;
        float f6 = this.f24858g;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.f24859n <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m14733y(canvas, paint, this.f24860q, this.f24859n, f4);
        m14733y(canvas, paint, this.f24860q, this.f24859n, f4 + f5);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    void zy(@lvui Canvas canvas, @lvui Paint paint) {
        int iM14282k = kja0.m14282k(((C4082n) this.f24857k).f24849q, this.f67771toq.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iM14282k);
        paint.setStrokeWidth(this.f24860q);
        float f2 = this.f24858g;
        canvas.drawArc(new RectF(-f2, -f2, f2, f2), 0.0f, 360.0f, false, paint);
    }
}

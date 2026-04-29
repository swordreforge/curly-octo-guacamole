package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.kja0;
import zy.lvui;
import zy.zurt;

/* JADX INFO: compiled from: LinearDrawingDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6 extends AbstractC4088y<n7h> {

    /* JADX INFO: renamed from: n */
    private float f24818n;

    /* JADX INFO: renamed from: q */
    private float f24819q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f67742zy;

    public ld6(@lvui n7h n7hVar) {
        super(n7hVar);
        this.f67742zy = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    /* JADX INFO: renamed from: k */
    public void mo14704k(@lvui Canvas canvas, @zurt(from = 0.0d, to = 1.0d) float f2) {
        Rect clipBounds = canvas.getClipBounds();
        this.f67742zy = clipBounds.width();
        float f3 = ((n7h) this.f24857k).f24847k;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((n7h) this.f24857k).f24847k) / 2.0f));
        if (((n7h) this.f24857k).f24822s) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f67771toq.qrj() && ((n7h) this.f24857k).f24848n == 1) || (this.f67771toq.x2() && ((n7h) this.f24857k).f24846g == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f67771toq.qrj() || this.f67771toq.x2()) {
            canvas.translate(0.0f, (((n7h) this.f24857k).f24847k * (f2 - 1.0f)) / 2.0f);
        }
        float f4 = this.f67742zy;
        canvas.clipRect((-f4) / 2.0f, (-f3) / 2.0f, f4 / 2.0f, f3 / 2.0f);
        S s2 = this.f24857k;
        this.f24819q = ((n7h) s2).f24847k * f2;
        this.f24818n = ((n7h) s2).f67766toq * f2;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    /* JADX INFO: renamed from: n */
    public int mo14705n() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    /* JADX INFO: renamed from: q */
    public int mo14706q() {
        return ((n7h) this.f24857k).f24847k;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    public void toq(@lvui Canvas canvas, @lvui Paint paint, @zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3, @zy.x2 int i2) {
        if (f2 == f3) {
            return;
        }
        float f4 = this.f67742zy;
        float f5 = this.f24818n;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i2);
        float f6 = this.f24819q;
        RectF rectF = new RectF(((-f4) / 2.0f) + (f2 * (f4 - (f5 * 2.0f))), (-f6) / 2.0f, ((-f4) / 2.0f) + (f3 * (f4 - (f5 * 2.0f))) + (f5 * 2.0f), f6 / 2.0f);
        float f7 = this.f24818n;
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4088y
    void zy(@lvui Canvas canvas, @lvui Paint paint) {
        int iM14282k = kja0.m14282k(((n7h) this.f24857k).f24849q, this.f67771toq.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iM14282k);
        float f2 = this.f67742zy;
        float f3 = this.f24819q;
        RectF rectF = new RectF((-f2) / 2.0f, (-f3) / 2.0f, f2 / 2.0f, f3 / 2.0f);
        float f4 = this.f24818n;
        canvas.drawRoundRect(rectF, f4, f4, paint);
    }
}

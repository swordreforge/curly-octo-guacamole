package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.cdj;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.model.layer.y */
/* JADX INFO: compiled from: SolidLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1469y extends toq {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private final C1464n f56090d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private final Paint f56091d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private final Path f56092eqxt;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private final RectF f56093gvn7;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    @dd
    private AbstractC1421k<ColorFilter, ColorFilter> f56094lvui;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private final float[] f56095oc;

    C1469y(C1504r c1504r, C1464n c1464n) {
        super(c1504r, c1464n);
        this.f56093gvn7 = new RectF();
        C1418k c1418k = new C1418k();
        this.f56091d3 = c1418k;
        this.f56095oc = new float[8];
        this.f56092eqxt = new Path();
        this.f56090d2ok = c1464n;
        c1418k.setAlpha(0);
        c1418k.setStyle(Paint.Style.FILL);
        c1418k.setColor(c1464n.kja0());
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        super.mo5886g(rectF, matrix, z2);
        this.f56093gvn7.set(0.0f, 0.0f, this.f56090d2ok.cdj(), this.f56090d2ok.m6066h());
        this.f56076kja0.mapRect(this.f56093gvn7);
        rectF.set(this.f56093gvn7);
    }

    @Override // com.airbnb.lottie.model.layer.toq
    /* JADX INFO: renamed from: i */
    public void mo6064i(Canvas canvas, Matrix matrix, int i2) {
        int iAlpha = Color.alpha(this.f56090d2ok.kja0());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i2 / 255.0f) * (((iAlpha / 255.0f) * (this.f56074fu4.m5920y() == null ? 100 : this.f56074fu4.m5920y().mo5912y().intValue())) / 100.0f) * 255.0f);
        this.f56091d3.setAlpha(iIntValue);
        AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f56094lvui;
        if (abstractC1421k != null) {
            this.f56091d3.setColorFilter(abstractC1421k.mo5912y());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f56095oc;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f56090d2ok.cdj();
            float[] fArr2 = this.f56095oc;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f56090d2ok.cdj();
            this.f56095oc[5] = this.f56090d2ok.m6066h();
            float[] fArr3 = this.f56095oc;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f56090d2ok.m6066h();
            matrix.mapPoints(this.f56095oc);
            this.f56092eqxt.reset();
            Path path = this.f56092eqxt;
            float[] fArr4 = this.f56095oc;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f56092eqxt;
            float[] fArr5 = this.f56095oc;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f56092eqxt;
            float[] fArr6 = this.f56095oc;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f56092eqxt;
            float[] fArr7 = this.f56095oc;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f56092eqxt;
            float[] fArr8 = this.f56095oc;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f56092eqxt.close();
            canvas.drawPath(this.f56092eqxt, this.f56091d3);
        }
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        super.mo5889q(t2, c1517p);
        if (t2 == n5r1.f56126eqxt) {
            if (c1517p == null) {
                this.f56094lvui = null;
            } else {
                this.f56094lvui = new cdj(c1517p);
            }
        }
    }
}

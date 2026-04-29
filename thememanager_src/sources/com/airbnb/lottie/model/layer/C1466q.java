package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.cdj;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1517p;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.airbnb.lottie.model.layer.q */
/* JADX INFO: compiled from: ImageLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class C1466q extends toq {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    @dd
    private AbstractC1421k<ColorFilter, ColorFilter> f56046d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private final Rect f56047d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    @dd
    private final com.airbnb.lottie.dd f56048eqxt;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private final Paint f56049gvn7;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    @dd
    private AbstractC1421k<Bitmap, Bitmap> f56050lvui;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private final Rect f56051oc;

    C1466q(C1504r c1504r, C1464n c1464n) {
        super(c1504r, c1464n);
        this.f56049gvn7 = new C1418k(3);
        this.f56047d3 = new Rect();
        this.f56051oc = new Rect();
        this.f56048eqxt = c1504r.lrht(c1464n.qrj());
    }

    @dd
    private Bitmap dd() {
        Bitmap bitmapMo5912y;
        AbstractC1421k<Bitmap, Bitmap> abstractC1421k = this.f56050lvui;
        if (abstractC1421k != null && (bitmapMo5912y = abstractC1421k.mo5912y()) != null) {
            return bitmapMo5912y;
        }
        Bitmap bitmapM6233r = this.f8073h.m6233r(this.f56071cdj.qrj());
        if (bitmapM6233r != null) {
            return bitmapM6233r;
        }
        com.airbnb.lottie.dd ddVar = this.f56048eqxt;
        if (ddVar != null) {
            return ddVar.m5955k();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        super.mo5886g(rectF, matrix, z2);
        if (this.f56048eqxt != null) {
            float fM6260n = C1512y.m6260n();
            rectF.set(0.0f, 0.0f, this.f56048eqxt.m5954g() * fM6260n, this.f56048eqxt.m5957q() * fM6260n);
            this.f56076kja0.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.toq
    /* JADX INFO: renamed from: i */
    public void mo6064i(@lvui Canvas canvas, Matrix matrix, int i2) {
        Bitmap bitmapDd = dd();
        if (bitmapDd == null || bitmapDd.isRecycled() || this.f56048eqxt == null) {
            return;
        }
        float fM6260n = C1512y.m6260n();
        this.f56049gvn7.setAlpha(i2);
        AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f56046d2ok;
        if (abstractC1421k != null) {
            this.f56049gvn7.setColorFilter(abstractC1421k.mo5912y());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f56047d3.set(0, 0, bitmapDd.getWidth(), bitmapDd.getHeight());
        if (this.f8073h.uv6()) {
            this.f56051oc.set(0, 0, (int) (this.f56048eqxt.m5954g() * fM6260n), (int) (this.f56048eqxt.m5957q() * fM6260n));
        } else {
            this.f56051oc.set(0, 0, (int) (bitmapDd.getWidth() * fM6260n), (int) (bitmapDd.getHeight() * fM6260n));
        }
        canvas.drawBitmap(bitmapDd, this.f56047d3, this.f56051oc, this.f56049gvn7);
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.toq, com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        super.mo5889q(t2, c1517p);
        if (t2 == n5r1.f56126eqxt) {
            if (c1517p == null) {
                this.f56046d2ok = null;
                return;
            } else {
                this.f56046d2ok = new cdj(c1517p);
                return;
            }
        }
        if (t2 == n5r1.f8120r) {
            if (c1517p == null) {
                this.f56050lvui = null;
            } else {
                this.f56050lvui = new cdj(c1517p);
            }
        }
    }
}

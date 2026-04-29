package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import zy.dd;

/* JADX INFO: compiled from: StrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class fn3e extends AbstractC1410k {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final AbstractC1421k<Integer, Integer> f55847fn3e;

    /* JADX INFO: renamed from: i */
    private final boolean f7814i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.toq f55848ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final String f55849t8r;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @dd
    private AbstractC1421k<ColorFilter, ColorFilter> f55850zurt;

    public fn3e(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.ki kiVar) {
        super(c1504r, toqVar, kiVar.toq().toPaintCap(), kiVar.m6017n().toPaintJoin(), kiVar.f7l8(), kiVar.m6020s(), kiVar.m6018p(), kiVar.m6016g(), kiVar.m6019q());
        this.f55848ki = toqVar;
        this.f55849t8r = kiVar.m6021y();
        this.f7814i = kiVar.ld6();
        AbstractC1421k<Integer, Integer> abstractC1421kMo5997k = kiVar.zy().mo5997k();
        this.f55847fn3e = abstractC1421kMo5997k;
        abstractC1421kMo5997k.m5922k(this);
        toqVar.m6084s(abstractC1421kMo5997k);
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55849t8r;
    }

    @Override // com.airbnb.lottie.animation.content.AbstractC1410k, com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        super.mo5889q(t2, c1517p);
        if (t2 == n5r1.f56145toq) {
            this.f55847fn3e.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56126eqxt) {
            AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f55850zurt;
            if (abstractC1421k != null) {
                this.f55848ki.jp0y(abstractC1421k);
            }
            if (c1517p == null) {
                this.f55850zurt = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.cdj cdjVar = new com.airbnb.lottie.animation.keyframe.cdj(c1517p);
            this.f55850zurt = cdjVar;
            cdjVar.m5922k(this);
            this.f55848ki.m6084s(this.f55847fn3e);
        }
    }

    @Override // com.airbnb.lottie.animation.content.AbstractC1410k, com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        if (this.f7814i) {
            return;
        }
        this.f7834s.setColor(((com.airbnb.lottie.animation.keyframe.toq) this.f55847fn3e).m5940h());
        AbstractC1421k<ColorFilter, ColorFilter> abstractC1421k = this.f55850zurt;
        if (abstractC1421k != null) {
            this.f7834s.setColorFilter(abstractC1421k.mo5912y());
        }
        super.mo5890y(canvas, matrix, i2);
    }
}

package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.C1425q;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.content.h */
/* JADX INFO: compiled from: RectangleContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C1408h implements AbstractC1421k.toq, ld6, n7h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final AbstractC1421k<?, PointF> f55854f7l8;

    /* JADX INFO: renamed from: g */
    private final AbstractC1421k<?, PointF> f7821g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f55855ld6;

    /* JADX INFO: renamed from: n */
    private final C1504r f7823n;

    /* JADX INFO: renamed from: q */
    private final boolean f7825q;

    /* JADX INFO: renamed from: y */
    private final AbstractC1421k<?, Float> f7827y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f55857zy;

    /* JADX INFO: renamed from: k */
    private final Path f7822k = new Path();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final RectF f55856toq = new RectF();

    /* JADX INFO: renamed from: s */
    private final toq f7826s = new toq();

    /* JADX INFO: renamed from: p */
    @dd
    private AbstractC1421k<Float, Float> f7824p = null;

    public C1408h(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.ld6 ld6Var) {
        this.f55857zy = ld6Var.zy();
        this.f7825q = ld6Var.m6025g();
        this.f7823n = c1504r;
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k = ld6Var.m6027q().mo5997k();
        this.f7821g = abstractC1421kMo5997k;
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k2 = ld6Var.m6026n().mo5997k();
        this.f55854f7l8 = abstractC1421kMo5997k2;
        AbstractC1421k<Float, Float> abstractC1421kMo5997k3 = ld6Var.toq().mo5997k();
        this.f7827y = abstractC1421kMo5997k3;
        toqVar.m6084s(abstractC1421kMo5997k);
        toqVar.m6084s(abstractC1421kMo5997k2);
        toqVar.m6084s(abstractC1421kMo5997k3);
        abstractC1421kMo5997k.m5922k(this);
        abstractC1421kMo5997k2.m5922k(this);
        abstractC1421kMo5997k3.m5922k(this);
    }

    private void f7l8() {
        this.f55855ld6 = false;
        this.f7823n.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55857zy;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        AbstractC1421k<Float, Float> abstractC1421k;
        if (this.f55855ld6) {
            return this.f7822k;
        }
        this.f7822k.reset();
        if (this.f7825q) {
            this.f55855ld6 = true;
            return this.f7822k;
        }
        PointF pointFMo5912y = this.f55854f7l8.mo5912y();
        float f2 = pointFMo5912y.x / 2.0f;
        float f3 = pointFMo5912y.y / 2.0f;
        AbstractC1421k<?, Float> abstractC1421k2 = this.f7827y;
        float fM5936h = abstractC1421k2 == null ? 0.0f : ((C1425q) abstractC1421k2).m5936h();
        if (fM5936h == 0.0f && (abstractC1421k = this.f7824p) != null) {
            fM5936h = Math.min(abstractC1421k.mo5912y().floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fM5936h > fMin) {
            fM5936h = fMin;
        }
        PointF pointFMo5912y2 = this.f7821g.mo5912y();
        this.f7822k.moveTo(pointFMo5912y2.x + f2, (pointFMo5912y2.y - f3) + fM5936h);
        this.f7822k.lineTo(pointFMo5912y2.x + f2, (pointFMo5912y2.y + f3) - fM5936h);
        if (fM5936h > 0.0f) {
            RectF rectF = this.f55856toq;
            float f4 = pointFMo5912y2.x;
            float f5 = fM5936h * 2.0f;
            float f6 = pointFMo5912y2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f7822k.arcTo(this.f55856toq, 0.0f, 90.0f, false);
        }
        this.f7822k.lineTo((pointFMo5912y2.x - f2) + fM5936h, pointFMo5912y2.y + f3);
        if (fM5936h > 0.0f) {
            RectF rectF2 = this.f55856toq;
            float f7 = pointFMo5912y2.x;
            float f8 = pointFMo5912y2.y;
            float f9 = fM5936h * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f7822k.arcTo(this.f55856toq, 90.0f, 90.0f, false);
        }
        this.f7822k.lineTo(pointFMo5912y2.x - f2, (pointFMo5912y2.y - f3) + fM5936h);
        if (fM5936h > 0.0f) {
            RectF rectF3 = this.f55856toq;
            float f10 = pointFMo5912y2.x;
            float f11 = pointFMo5912y2.y;
            float f12 = fM5936h * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f7822k.arcTo(this.f55856toq, 180.0f, 90.0f, false);
        }
        this.f7822k.lineTo((pointFMo5912y2.x + f2) - fM5936h, pointFMo5912y2.y - f3);
        if (fM5936h > 0.0f) {
            RectF rectF4 = this.f55856toq;
            float f13 = pointFMo5912y2.x;
            float f14 = fM5936h * 2.0f;
            float f15 = pointFMo5912y2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f7822k.arcTo(this.f55856toq, 270.0f, 90.0f, false);
        }
        this.f7822k.close();
        this.f7826s.toq(this.f7822k);
        this.f55855ld6 = true;
        return this.f7822k;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        f7l8();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        com.airbnb.lottie.utils.f7l8.qrj(c1471n, i2, list, c1471n2, this);
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        if (t2 == n5r1.f56147x2) {
            this.f55854f7l8.n7h(c1517p);
        } else if (t2 == n5r1.f56139n7h) {
            this.f7821g.n7h(c1517p);
        } else if (t2 == n5r1.f56143qrj) {
            this.f7827y.n7h(c1517p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.airbnb.lottie.animation.content.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void toq(java.util.List<com.airbnb.lottie.animation.content.zy> r5, java.util.List<com.airbnb.lottie.animation.content.zy> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.airbnb.lottie.animation.content.zy r0 = (com.airbnb.lottie.animation.content.zy) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.zurt
            if (r1 == 0) goto L25
            r1 = r0
            com.airbnb.lottie.animation.content.zurt r1 = (com.airbnb.lottie.animation.content.zurt) r1
            com.airbnb.lottie.model.content.t8r$k r2 = r1.m5908p()
            com.airbnb.lottie.model.content.t8r$k r3 = com.airbnb.lottie.model.content.t8r.EnumC1458k.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.airbnb.lottie.animation.content.toq r0 = r4.f7826s
            r0.m5902k(r1)
            r1.m5909q(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.ki
            if (r1 == 0) goto L31
            com.airbnb.lottie.animation.content.ki r0 = (com.airbnb.lottie.animation.content.ki) r0
            com.airbnb.lottie.animation.keyframe.k r0 = r0.f7l8()
            r4.f7824p = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C1408h.toq(java.util.List, java.util.List):void");
    }
}

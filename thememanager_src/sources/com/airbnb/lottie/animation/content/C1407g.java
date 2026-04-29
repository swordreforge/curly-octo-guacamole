package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.content.t8r;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.content.g */
/* JADX INFO: compiled from: EllipseContent.java */
/* JADX INFO: loaded from: classes.dex */
public class C1407g implements n7h, AbstractC1421k.toq, ld6 {

    /* JADX INFO: renamed from: s */
    private static final float f7815s = 0.55228f;

    /* JADX INFO: renamed from: g */
    private final com.airbnb.lottie.model.content.toq f7816g;

    /* JADX INFO: renamed from: n */
    private final AbstractC1421k<?, PointF> f7818n;

    /* JADX INFO: renamed from: q */
    private final AbstractC1421k<?, PointF> f7819q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f55852toq;

    /* JADX INFO: renamed from: y */
    private boolean f7820y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C1504r f55853zy;

    /* JADX INFO: renamed from: k */
    private final Path f7817k = new Path();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final toq f55851f7l8 = new toq();

    public C1407g(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.toq toqVar2) {
        this.f55852toq = toqVar2.toq();
        this.f55853zy = c1504r;
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k = toqVar2.m6051q().mo5997k();
        this.f7819q = abstractC1421kMo5997k;
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k2 = toqVar2.zy().mo5997k();
        this.f7818n = abstractC1421kMo5997k2;
        this.f7816g = toqVar2;
        toqVar.m6084s(abstractC1421kMo5997k);
        toqVar.m6084s(abstractC1421kMo5997k2);
        abstractC1421kMo5997k.m5922k(this);
        abstractC1421kMo5997k2.m5922k(this);
    }

    private void f7l8() {
        this.f7820y = false;
        this.f55853zy.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55852toq;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        if (this.f7820y) {
            return this.f7817k;
        }
        this.f7817k.reset();
        if (this.f7816g.m6050n()) {
            this.f7820y = true;
            return this.f7817k;
        }
        PointF pointFMo5912y = this.f7819q.mo5912y();
        float f2 = pointFMo5912y.x / 2.0f;
        float f3 = pointFMo5912y.y / 2.0f;
        float f4 = f2 * f7815s;
        float f5 = f7815s * f3;
        this.f7817k.reset();
        if (this.f7816g.m6049g()) {
            float f6 = -f3;
            this.f7817k.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f7817k.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.f7817k.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.f7817k.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.f7817k.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.f7817k.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.f7817k.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.f7817k.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.f7817k.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.f7817k.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF pointFMo5912y2 = this.f7818n.mo5912y();
        this.f7817k.offset(pointFMo5912y2.x, pointFMo5912y2.y);
        this.f7817k.close();
        this.f55851f7l8.toq(this.f7817k);
        this.f7820y = true;
        return this.f7817k;
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
        if (t2 == n5r1.f56136ld6) {
            this.f7819q.n7h(c1517p);
        } else if (t2 == n5r1.f56139n7h) {
            this.f7818n.n7h(c1517p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zy zyVar = list.get(i2);
            if (zyVar instanceof zurt) {
                zurt zurtVar = (zurt) zyVar;
                if (zurtVar.m5908p() == t8r.EnumC1458k.SIMULTANEOUSLY) {
                    this.f55851f7l8.m5902k(zurtVar);
                    zurtVar.m5909q(this);
                }
            }
        }
    }
}

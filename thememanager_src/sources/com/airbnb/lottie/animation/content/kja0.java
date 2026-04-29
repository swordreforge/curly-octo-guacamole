package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.content.C1455p;
import com.airbnb.lottie.model.content.t8r;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: PolystarContent.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 implements n7h, AbstractC1421k.toq, ld6 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f55870cdj = 0.25f;

    /* JADX INFO: renamed from: h */
    private static final float f7840h = 0.47829f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final AbstractC1421k<?, Float> f55871f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f7841g;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f55872kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final AbstractC1421k<?, Float> f55873ld6;

    /* JADX INFO: renamed from: n */
    private final boolean f7843n;

    /* JADX INFO: renamed from: p */
    @dd
    private final AbstractC1421k<?, Float> f7844p;

    /* JADX INFO: renamed from: q */
    private final C1455p.k f7845q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final AbstractC1421k<?, Float> f55875qrj;

    /* JADX INFO: renamed from: s */
    private final AbstractC1421k<?, Float> f7846s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f55876toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private final AbstractC1421k<?, Float> f55877x2;

    /* JADX INFO: renamed from: y */
    private final AbstractC1421k<?, PointF> f7847y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C1504r f55878zy;

    /* JADX INFO: renamed from: k */
    private final Path f7842k = new Path();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final toq f55874n7h = new toq();

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.kja0$k */
    /* JADX INFO: compiled from: PolystarContent.java */
    static /* synthetic */ class C1411k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f7848k;

        static {
            int[] iArr = new int[C1455p.k.values().length];
            f7848k = iArr;
            try {
                iArr[C1455p.k.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7848k[C1455p.k.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public kja0(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, C1455p c1455p) {
        this.f55878zy = c1504r;
        this.f55876toq = c1455p.m6040q();
        C1455p.k kVarM6039p = c1455p.m6039p();
        this.f7845q = kVarM6039p;
        this.f7843n = c1455p.ld6();
        this.f7841g = c1455p.x2();
        AbstractC1421k<Float, Float> abstractC1421kMo5997k = c1455p.f7l8().mo5997k();
        this.f55871f7l8 = abstractC1421kMo5997k;
        AbstractC1421k<PointF, PointF> abstractC1421kMo5997k2 = c1455p.m6042y().mo5997k();
        this.f7847y = abstractC1421kMo5997k2;
        AbstractC1421k<Float, Float> abstractC1421kMo5997k3 = c1455p.m6041s().mo5997k();
        this.f7846s = abstractC1421kMo5997k3;
        AbstractC1421k<Float, Float> abstractC1421kMo5997k4 = c1455p.m6038n().mo5997k();
        this.f55873ld6 = abstractC1421kMo5997k4;
        AbstractC1421k<Float, Float> abstractC1421kMo5997k5 = c1455p.m6037g().mo5997k();
        this.f55875qrj = abstractC1421kMo5997k5;
        C1455p.k kVar = C1455p.k.STAR;
        if (kVarM6039p == kVar) {
            this.f7844p = c1455p.toq().mo5997k();
            this.f55877x2 = c1455p.zy().mo5997k();
        } else {
            this.f7844p = null;
            this.f55877x2 = null;
        }
        toqVar.m6084s(abstractC1421kMo5997k);
        toqVar.m6084s(abstractC1421kMo5997k2);
        toqVar.m6084s(abstractC1421kMo5997k3);
        toqVar.m6084s(abstractC1421kMo5997k4);
        toqVar.m6084s(abstractC1421kMo5997k5);
        if (kVarM6039p == kVar) {
            toqVar.m6084s(this.f7844p);
            toqVar.m6084s(this.f55877x2);
        }
        abstractC1421kMo5997k.m5922k(this);
        abstractC1421kMo5997k2.m5922k(this);
        abstractC1421kMo5997k3.m5922k(this);
        abstractC1421kMo5997k4.m5922k(this);
        abstractC1421kMo5997k5.m5922k(this);
        if (kVarM6039p == kVar) {
            this.f7844p.m5922k(this);
            this.f55877x2.m5922k(this);
        }
    }

    private void f7l8() {
        double d2;
        double d4;
        double d5;
        int i2;
        int iFloor = (int) Math.floor(this.f55871f7l8.mo5912y().floatValue());
        double radians = Math.toRadians((this.f7846s == null ? 0.0d : r2.mo5912y().floatValue()) - 90.0d);
        double d6 = iFloor;
        float fFloatValue = this.f55875qrj.mo5912y().floatValue() / 100.0f;
        float fFloatValue2 = this.f55873ld6.mo5912y().floatValue();
        double d7 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d7);
        float fSin = (float) (Math.sin(radians) * d7);
        this.f7842k.moveTo(fCos, fSin);
        double d8 = (float) (6.283185307179586d / d6);
        double d9 = radians + d8;
        double dCeil = Math.ceil(d6);
        int i3 = 0;
        while (i3 < dCeil) {
            float fCos2 = (float) (Math.cos(d9) * d7);
            double d10 = dCeil;
            float fSin2 = (float) (d7 * Math.sin(d9));
            if (fFloatValue != 0.0f) {
                d4 = d7;
                i2 = i3;
                d2 = d9;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d5 = d8;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f2 = fFloatValue2 * fFloatValue * f55870cdj;
                this.f7842k.cubicTo(fCos - (fCos3 * f2), fSin - (fSin3 * f2), fCos2 + (fCos4 * f2), fSin2 + (f2 * fSin4), fCos2, fSin2);
            } else {
                d2 = d9;
                d4 = d7;
                d5 = d8;
                i2 = i3;
                this.f7842k.lineTo(fCos2, fSin2);
            }
            d9 = d2 + d5;
            i3 = i2 + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d10;
            d7 = d4;
            d8 = d5;
        }
        PointF pointFMo5912y = this.f7847y.mo5912y();
        this.f7842k.offset(pointFMo5912y.x, pointFMo5912y.y);
        this.f7842k.close();
    }

    /* JADX INFO: renamed from: p */
    private void m5896p() {
        this.f55872kja0 = false;
        this.f55878zy.invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    private void m5897s() {
        double d2;
        int i2;
        double d4;
        float fCos;
        float fSin;
        float f2;
        float f3;
        float f4;
        float f5;
        double d5;
        float f6;
        float f7;
        float f8;
        float fFloatValue = this.f55871f7l8.mo5912y().floatValue();
        double radians = Math.toRadians((this.f7846s == null ? 0.0d : r2.mo5912y().floatValue()) - 90.0d);
        double d6 = fFloatValue;
        float f9 = (float) (6.283185307179586d / d6);
        if (this.f7841g) {
            f9 *= -1.0f;
        }
        float f10 = f9 / 2.0f;
        float f11 = fFloatValue - ((int) fFloatValue);
        int i3 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i3 != 0) {
            radians += (double) ((1.0f - f11) * f10);
        }
        float fFloatValue2 = this.f55873ld6.mo5912y().floatValue();
        float fFloatValue3 = this.f7844p.mo5912y().floatValue();
        AbstractC1421k<?, Float> abstractC1421k = this.f55877x2;
        float fFloatValue4 = abstractC1421k != null ? abstractC1421k.mo5912y().floatValue() / 100.0f : 0.0f;
        AbstractC1421k<?, Float> abstractC1421k2 = this.f55875qrj;
        float fFloatValue5 = abstractC1421k2 != null ? abstractC1421k2.mo5912y().floatValue() / 100.0f : 0.0f;
        if (i3 != 0) {
            f2 = ((fFloatValue2 - fFloatValue3) * f11) + fFloatValue3;
            i2 = i3;
            double d7 = f2;
            d2 = d6;
            fCos = (float) (d7 * Math.cos(radians));
            fSin = (float) (d7 * Math.sin(radians));
            this.f7842k.moveTo(fCos, fSin);
            d4 = radians + ((double) ((f9 * f11) / 2.0f));
        } else {
            d2 = d6;
            i2 = i3;
            double d8 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d8);
            float fSin2 = (float) (d8 * Math.sin(radians));
            this.f7842k.moveTo(fCos2, fSin2);
            d4 = radians + ((double) f10);
            fCos = fCos2;
            fSin = fSin2;
            f2 = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            double d9 = i4;
            if (d9 >= dCeil) {
                PointF pointFMo5912y = this.f7847y.mo5912y();
                this.f7842k.offset(pointFMo5912y.x, pointFMo5912y.y);
                this.f7842k.close();
                return;
            }
            float f12 = z2 ? fFloatValue2 : fFloatValue3;
            if (f2 == 0.0f || d9 != dCeil - 2.0d) {
                f3 = f9;
                f4 = f10;
            } else {
                f3 = f9;
                f4 = (f9 * f11) / 2.0f;
            }
            if (f2 == 0.0f || d9 != dCeil - 1.0d) {
                f5 = f10;
                d5 = d9;
                f6 = f12;
            } else {
                f5 = f10;
                d5 = d9;
                f6 = f2;
            }
            double d10 = f6;
            double d11 = dCeil;
            float fCos3 = (float) (d10 * Math.cos(d4));
            float fSin3 = (float) (d10 * Math.sin(d4));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f7842k.lineTo(fCos3, fSin3);
                f7 = fFloatValue4;
                f8 = f2;
            } else {
                f7 = fFloatValue4;
                f8 = f2;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin5 = (float) Math.sin(dAtan22);
                float f13 = z2 ? f7 : fFloatValue5;
                float f14 = z2 ? fFloatValue5 : f7;
                float f15 = z2 ? fFloatValue3 : fFloatValue2;
                float f16 = z2 ? fFloatValue2 : fFloatValue3;
                float f17 = f15 * f13 * f7840h;
                float f18 = fCos4 * f17;
                float f19 = f17 * fSin4;
                float f20 = f16 * f14 * f7840h;
                float f21 = fCos5 * f20;
                float f22 = f20 * fSin5;
                if (i2 != 0) {
                    if (i4 == 0) {
                        f18 *= f11;
                        f19 *= f11;
                    } else if (d5 == d11 - 1.0d) {
                        f21 *= f11;
                        f22 *= f11;
                    }
                }
                this.f7842k.cubicTo(fCos - f18, fSin - f19, fCos3 + f21, fSin3 + f22, fCos3, fSin3);
            }
            d4 += (double) f4;
            z2 = !z2;
            i4++;
            fCos = fCos3;
            fSin = fSin3;
            fFloatValue4 = f7;
            f2 = f8;
            f10 = f5;
            f9 = f3;
            dCeil = d11;
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55876toq;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        if (this.f55872kja0) {
            return this.f7842k;
        }
        this.f7842k.reset();
        if (this.f7843n) {
            this.f55872kja0 = true;
            return this.f7842k;
        }
        int i2 = C1411k.f7848k[this.f7845q.ordinal()];
        if (i2 == 1) {
            m5897s();
        } else if (i2 == 2) {
            f7l8();
        }
        this.f7842k.close();
        this.f55874n7h.toq(this.f7842k);
        this.f55872kja0 = true;
        return this.f7842k;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        m5896p();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        com.airbnb.lottie.utils.f7l8.qrj(c1471n, i2, list, c1471n2, this);
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        AbstractC1421k<?, Float> abstractC1421k;
        AbstractC1421k<?, Float> abstractC1421k2;
        if (t2 == n5r1.f56140ni7) {
            this.f55871f7l8.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56130fu4) {
            this.f7846s.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56139n7h) {
            this.f7847y.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f8124z && (abstractC1421k2 = this.f7844p) != null) {
            abstractC1421k2.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56141o1t) {
            this.f55873ld6.n7h(c1517p);
            return;
        }
        if (t2 == n5r1.f56146wvg && (abstractC1421k = this.f55877x2) != null) {
            abstractC1421k.n7h(c1517p);
        } else if (t2 == n5r1.f8122t) {
            this.f55875qrj.n7h(c1517p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zy zyVar = list.get(i2);
            if (zyVar instanceof zurt) {
                zurt zurtVar = (zurt) zyVar;
                if (zurtVar.m5908p() == t8r.EnumC1458k.SIMULTANEOUSLY) {
                    this.f55874n7h.m5902k(zurtVar);
                    zurtVar.m5909q(this);
                }
            }
        }
    }
}

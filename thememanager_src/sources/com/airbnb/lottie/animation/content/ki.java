package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.model.C1461k;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: RoundedCornersContent.java */
/* JADX INFO: loaded from: classes.dex */
public class ki implements InterfaceC1409i, AbstractC1421k.toq {

    /* JADX INFO: renamed from: n */
    private static final float f7837n = 0.5519f;

    /* JADX INFO: renamed from: k */
    private final C1504r f7838k;

    /* JADX INFO: renamed from: q */
    @dd
    private com.airbnb.lottie.model.content.n7h f7839q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f55868toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final AbstractC1421k<Float, Float> f55869zy;

    public ki(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.qrj qrjVar) {
        this.f7838k = c1504r;
        this.f55868toq = qrjVar.zy();
        AbstractC1421k<Float, Float> abstractC1421kMo5997k = qrjVar.toq().mo5997k();
        this.f55869zy = abstractC1421kMo5997k;
        toqVar.m6084s(abstractC1421kMo5997k);
        abstractC1421kMo5997k.m5922k(this);
    }

    /* JADX INFO: renamed from: n */
    private static int m5893n(int i2, int i3) {
        return i2 - (m5894q(i2, i3) * i3);
    }

    /* JADX INFO: renamed from: q */
    private static int m5894q(int i2, int i3) {
        int i4 = i2 / i3;
        return ((i2 ^ i3) >= 0 || i3 * i4 == i2) ? i4 : i4 - 1;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    private com.airbnb.lottie.model.content.n7h m5895s(com.airbnb.lottie.model.content.n7h n7hVar) {
        List<C1461k> listM6034k = n7hVar.m6034k();
        boolean zM6036q = n7hVar.m6036q();
        int size = listM6034k.size() - 1;
        int i2 = 0;
        while (size >= 0) {
            C1461k c1461k = listM6034k.get(size);
            C1461k c1461k2 = listM6034k.get(m5893n(size - 1, listM6034k.size()));
            PointF pointFZy = (size != 0 || zM6036q) ? c1461k2.zy() : n7hVar.toq();
            i2 = (((size != 0 || zM6036q) ? c1461k2.toq() : pointFZy).equals(pointFZy) && c1461k.m6061k().equals(pointFZy) && !(!n7hVar.m6036q() && size == 0 && size == listM6034k.size() - 1)) ? i2 + 2 : i2 + 1;
            size--;
        }
        com.airbnb.lottie.model.content.n7h n7hVar2 = this.f7839q;
        if (n7hVar2 == null || n7hVar2.m6034k().size() != i2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new C1461k());
            }
            this.f7839q = new com.airbnb.lottie.model.content.n7h(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f7839q.m6035n(zM6036q);
        return this.f7839q;
    }

    public AbstractC1421k<Float, Float> f7l8() {
        return this.f55869zy;
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f55868toq;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f7838k.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1409i
    public com.airbnb.lottie.model.content.n7h zy(com.airbnb.lottie.model.content.n7h n7hVar) {
        List<C1461k> list;
        List<C1461k> listM6034k = n7hVar.m6034k();
        if (listM6034k.size() <= 2) {
            return n7hVar;
        }
        float fFloatValue = this.f55869zy.mo5912y().floatValue();
        if (fFloatValue == 0.0f) {
            return n7hVar;
        }
        com.airbnb.lottie.model.content.n7h n7hVarM5895s = m5895s(n7hVar);
        n7hVarM5895s.m6033g(n7hVar.toq().x, n7hVar.toq().y);
        List<C1461k> listM6034k2 = n7hVarM5895s.m6034k();
        boolean zM6036q = n7hVar.m6036q();
        int i2 = 0;
        int i3 = 0;
        while (i2 < listM6034k.size()) {
            C1461k c1461k = listM6034k.get(i2);
            C1461k c1461k2 = listM6034k.get(m5893n(i2 - 1, listM6034k.size()));
            C1461k c1461k3 = listM6034k.get(m5893n(i2 - 2, listM6034k.size()));
            PointF pointFZy = (i2 != 0 || zM6036q) ? c1461k2.zy() : n7hVar.toq();
            PointF qVar = (i2 != 0 || zM6036q) ? c1461k2.toq() : pointFZy;
            PointF pointFM6061k = c1461k.m6061k();
            PointF pointFZy2 = c1461k3.zy();
            PointF pointFZy3 = c1461k.zy();
            boolean z2 = !n7hVar.m6036q() && i2 == 0 && i2 == listM6034k.size() + (-1);
            if (qVar.equals(pointFZy) && pointFM6061k.equals(pointFZy) && !z2) {
                float f2 = pointFZy.x;
                float f3 = f2 - pointFZy2.x;
                float f4 = pointFZy.y;
                float f5 = f4 - pointFZy2.y;
                float f6 = pointFZy3.x - f2;
                float f7 = pointFZy3.y - f4;
                list = listM6034k;
                float fHypot = (float) Math.hypot(f3, f5);
                float fHypot2 = (float) Math.hypot(f6, f7);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f8 = pointFZy.x;
                float f9 = ((pointFZy2.x - f8) * fMin) + f8;
                float f10 = pointFZy.y;
                float f11 = ((pointFZy2.y - f10) * fMin) + f10;
                float f12 = ((pointFZy3.x - f8) * fMin2) + f8;
                float f13 = ((pointFZy3.y - f10) * fMin2) + f10;
                float f14 = f9 - ((f9 - f8) * f7837n);
                float f15 = f11 - ((f11 - f10) * f7837n);
                float f16 = f12 - ((f12 - f8) * f7837n);
                float f17 = f13 - ((f13 - f10) * f7837n);
                C1461k c1461k4 = listM6034k2.get(m5893n(i3 - 1, listM6034k2.size()));
                C1461k c1461k5 = listM6034k2.get(i3);
                c1461k4.m6062n(f9, f11);
                c1461k4.f7l8(f9, f11);
                if (i2 == 0) {
                    n7hVarM5895s.m6033g(f9, f11);
                }
                c1461k5.m6063q(f14, f15);
                i3++;
                C1461k c1461k6 = listM6034k2.get(i3);
                c1461k5.m6062n(f16, f17);
                c1461k5.f7l8(f12, f13);
                c1461k6.m6063q(f12, f13);
            } else {
                list = listM6034k;
                C1461k c1461k7 = listM6034k2.get(m5893n(i3 - 1, listM6034k2.size()));
                C1461k c1461k8 = listM6034k2.get(i3);
                c1461k7.m6062n(c1461k2.zy().x, c1461k2.zy().y);
                c1461k7.f7l8(c1461k2.zy().x, c1461k2.zy().y);
                c1461k8.m6063q(c1461k.zy().x, c1461k.zy().y);
            }
            i3++;
            i2++;
            listM6034k = list;
        }
        return n7hVarM5895s;
    }
}

package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.C1420h;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.n5r1;
import com.airbnb.lottie.value.C1517p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import zy.dd;

/* JADX INFO: compiled from: RepeaterContent.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj implements InterfaceC1412n, n7h, InterfaceC1413p, AbstractC1421k.toq, ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final AbstractC1421k<Float, Float> f55838f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f7800g;

    /* JADX INFO: renamed from: n */
    private final String f7802n;

    /* JADX INFO: renamed from: p */
    private C1414q f7803p;

    /* JADX INFO: renamed from: q */
    private final com.airbnb.lottie.model.layer.toq f7804q;

    /* JADX INFO: renamed from: s */
    private final C1420h f7805s;

    /* JADX INFO: renamed from: y */
    private final AbstractC1421k<Float, Float> f7806y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C1504r f55840zy;

    /* JADX INFO: renamed from: k */
    private final Matrix f7801k = new Matrix();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path f55839toq = new Path();

    public cdj(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar, com.airbnb.lottie.model.content.x2 x2Var) {
        this.f55840zy = c1504r;
        this.f7804q = toqVar;
        this.f7802n = x2Var.zy();
        this.f7800g = x2Var.m6052g();
        AbstractC1421k<Float, Float> abstractC1421kMo5997k = x2Var.toq().mo5997k();
        this.f55838f7l8 = abstractC1421kMo5997k;
        toqVar.m6084s(abstractC1421kMo5997k);
        abstractC1421kMo5997k.m5922k(this);
        AbstractC1421k<Float, Float> abstractC1421kMo5997k2 = x2Var.m6054q().mo5997k();
        this.f7806y = abstractC1421kMo5997k2;
        toqVar.m6084s(abstractC1421kMo5997k2);
        abstractC1421kMo5997k2.m5922k(this);
        C1420h qVar = x2Var.m6053n().toq();
        this.f7805s = qVar;
        qVar.m5916k(toqVar);
        qVar.toq(this);
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1413p
    public void f7l8(ListIterator<zy> listIterator) {
        if (this.f7803p != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f7803p = new C1414q(this.f55840zy, this.f7804q, "Repeater", this.f7800g, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: g */
    public void mo5886g(RectF rectF, Matrix matrix, boolean z2) {
        this.f7803p.mo5886g(rectF, matrix, z2);
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public String getName() {
        return this.f7802n;
    }

    @Override // com.airbnb.lottie.animation.content.n7h
    public Path getPath() {
        Path path = this.f7803p.getPath();
        this.f55839toq.reset();
        float fFloatValue = this.f55838f7l8.mo5912y().floatValue();
        float fFloatValue2 = this.f7806y.mo5912y().floatValue();
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f7801k.set(this.f7805s.f7l8(i2 + fFloatValue2));
            this.f55839toq.addPath(path, this.f7801k);
        }
        return this.f55839toq;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k.toq
    /* JADX INFO: renamed from: k */
    public void mo5887k() {
        this.f55840zy.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: n */
    public void mo5888n(C1471n c1471n, int i2, List<C1471n> list, C1471n c1471n2) {
        com.airbnb.lottie.utils.f7l8.qrj(c1471n, i2, list, c1471n2, this);
    }

    @Override // com.airbnb.lottie.model.InterfaceC1460g
    /* JADX INFO: renamed from: q */
    public <T> void mo5889q(T t2, @dd C1517p<T> c1517p) {
        if (this.f7805s.zy(t2, c1517p)) {
            return;
        }
        if (t2 == n5r1.f56128fn3e) {
            this.f55838f7l8.n7h(c1517p);
        } else if (t2 == n5r1.f56148zurt) {
            this.f7806y.n7h(c1517p);
        }
    }

    @Override // com.airbnb.lottie.animation.content.zy
    public void toq(List<zy> list, List<zy> list2) {
        this.f7803p.toq(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.InterfaceC1412n
    /* JADX INFO: renamed from: y */
    public void mo5890y(Canvas canvas, Matrix matrix, int i2) {
        float fFloatValue = this.f55838f7l8.mo5912y().floatValue();
        float fFloatValue2 = this.f7806y.mo5912y().floatValue();
        float fFloatValue3 = this.f7805s.m5919s().mo5912y().floatValue() / 100.0f;
        float fFloatValue4 = this.f7805s.m5917n().mo5912y().floatValue() / 100.0f;
        for (int i3 = ((int) fFloatValue) - 1; i3 >= 0; i3--) {
            this.f7801k.set(matrix);
            float f2 = i3;
            this.f7801k.preConcat(this.f7805s.f7l8(f2 + fFloatValue2));
            this.f7803p.mo5890y(canvas, this.f7801k, (int) (i2 * com.airbnb.lottie.utils.f7l8.ld6(fFloatValue3, fFloatValue4, f2 / fFloatValue)));
        }
    }
}

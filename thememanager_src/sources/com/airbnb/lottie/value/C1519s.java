package com.airbnb.lottie.value;

import android.graphics.PointF;
import zy.lvui;

/* JADX INFO: renamed from: com.airbnb.lottie.value.s */
/* JADX INFO: compiled from: LottieRelativePointValueCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class C1519s extends C1517p<PointF> {

    /* JADX INFO: renamed from: q */
    private final PointF f8309q;

    public C1519s() {
        this.f8309q = new PointF();
    }

    @Override // com.airbnb.lottie.value.C1517p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final PointF mo5884k(toq<PointF> toqVar) {
        this.f8309q.set(com.airbnb.lottie.utils.f7l8.ld6(toqVar.f7l8().x, toqVar.toq().x, toqVar.zy()), com.airbnb.lottie.utils.f7l8.ld6(toqVar.f7l8().y, toqVar.toq().y, toqVar.zy()));
        PointF pointFM6289n = m6289n(toqVar);
        this.f8309q.offset(pointFM6289n.x, pointFM6289n.y);
        return this.f8309q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public PointF m6289n(toq<PointF> toqVar) {
        T t2 = this.f56204zy;
        if (t2 != 0) {
            return (PointF) t2;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    public C1519s(@lvui PointF pointF) {
        super(pointF);
        this.f8309q = new PointF();
    }
}

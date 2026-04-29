package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1515k;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.s */
/* JADX INFO: compiled from: PathKeyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class C1426s extends C1515k<PointF> {

    /* JADX INFO: renamed from: i */
    private final C1515k<PointF> f7910i;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @dd
    private Path f55934t8r;

    public C1426s(com.airbnb.lottie.ld6 ld6Var, C1515k<PointF> c1515k) {
        super(ld6Var, c1515k.f56198toq, c1515k.f56200zy, c1515k.f8304q, c1515k.f8302n, c1515k.f8299g, c1515k.f56193f7l8, c1515k.f8306y);
        this.f7910i = c1515k;
        m5939s();
    }

    @dd
    /* JADX INFO: renamed from: p */
    Path m5938p() {
        return this.f55934t8r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m5939s() {
        T t2;
        T t3;
        T t4 = this.f56200zy;
        boolean z2 = (t4 == 0 || (t3 = this.f56198toq) == 0 || !((PointF) t3).equals(((PointF) t4).x, ((PointF) t4).y)) ? false : true;
        T t5 = this.f56198toq;
        if (t5 == 0 || (t2 = this.f56200zy) == 0 || z2) {
            return;
        }
        C1515k<PointF> c1515k = this.f7910i;
        this.f55934t8r = C1512y.m6262q((PointF) t5, (PointF) t2, c1515k.f56194kja0, c1515k.f8300h);
    }
}

package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.animation.keyframe.C1424p;
import com.airbnb.lottie.value.C1515k;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.model.animatable.n */
/* JADX INFO: compiled from: AnimatablePathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class C1444n implements qrj<PointF, PointF> {

    /* JADX INFO: renamed from: k */
    private final List<C1515k<PointF>> f7978k;

    public C1444n(List<C1515k<PointF>> list) {
        this.f7978k = list;
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    /* JADX INFO: renamed from: k */
    public AbstractC1421k<PointF, PointF> mo5997k() {
        return this.f7978k.get(0).m6282y() ? new com.airbnb.lottie.animation.keyframe.ld6(this.f7978k) : new C1424p(this.f7978k);
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    public List<C1515k<PointF>> toq() {
        return this.f7978k;
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    public boolean zy() {
        return this.f7978k.size() == 1 && this.f7978k.get(0).m6282y();
    }
}

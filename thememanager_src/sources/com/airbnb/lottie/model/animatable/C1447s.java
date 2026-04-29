package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.AbstractC1421k;
import com.airbnb.lottie.value.C1515k;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.model.animatable.s */
/* JADX INFO: compiled from: AnimatableSplitDimensionPathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class C1447s implements qrj<PointF, PointF> {

    /* JADX INFO: renamed from: k */
    private final toq f7980k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final toq f55983toq;

    public C1447s(toq toqVar, toq toqVar2) {
        this.f7980k = toqVar;
        this.f55983toq = toqVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    /* JADX INFO: renamed from: k */
    public AbstractC1421k<PointF, PointF> mo5997k() {
        return new com.airbnb.lottie.animation.keyframe.n7h(this.f7980k.mo5997k(), this.f55983toq.mo5997k());
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    public List<C1515k<PointF>> toq() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    public boolean zy() {
        return this.f7980k.zy() && this.f55983toq.zy();
    }
}

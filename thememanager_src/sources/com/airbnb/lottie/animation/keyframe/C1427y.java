package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C1459y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.y */
/* JADX INFO: compiled from: MaskKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C1427y {

    /* JADX INFO: renamed from: k */
    private final List<AbstractC1421k<com.airbnb.lottie.model.content.n7h, Path>> f7912k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<AbstractC1421k<Integer, Integer>> f55935toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<C1459y> f55936zy;

    public C1427y(List<C1459y> list) {
        this.f55936zy = list;
        this.f7912k = new ArrayList(list.size());
        this.f55935toq = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7912k.add(list.get(i2).toq().mo5997k());
            this.f55935toq.add(list.get(i2).zy().mo5997k());
        }
    }

    /* JADX INFO: renamed from: k */
    public List<AbstractC1421k<com.airbnb.lottie.model.content.n7h, Path>> m5942k() {
        return this.f7912k;
    }

    public List<C1459y> toq() {
        return this.f55936zy;
    }

    public List<AbstractC1421k<Integer, Integer>> zy() {
        return this.f55935toq;
    }
}

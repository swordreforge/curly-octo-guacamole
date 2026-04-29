package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.C1456q;
import com.airbnb.lottie.value.C1515k;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.n */
/* JADX INFO: compiled from: GradientColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class C1423n extends f7l8<C1456q> {

    /* JADX INFO: renamed from: s */
    private final C1456q f7903s;

    public C1423n(List<C1515k<C1456q>> list) {
        super(list);
        C1456q c1456q = list.get(0).f56198toq;
        int iZy = c1456q != null ? c1456q.zy() : 0;
        this.f7903s = new C1456q(new float[iZy], new int[iZy]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1456q mo5911s(C1515k<C1456q> c1515k, float f2) {
        this.f7903s.m6044q(c1515k.f56198toq, c1515k.f56200zy, f2);
        return this.f7903s;
    }
}

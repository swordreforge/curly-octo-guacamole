package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.InterfaceC1409i;
import com.airbnb.lottie.value.C1515k;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: ShapeKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj extends AbstractC1421k<com.airbnb.lottie.model.content.n7h, Path> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private List<InterfaceC1409i> f55933ld6;

    /* JADX INFO: renamed from: p */
    private final Path f7908p;

    /* JADX INFO: renamed from: s */
    private final com.airbnb.lottie.model.content.n7h f7909s;

    public qrj(List<C1515k<com.airbnb.lottie.model.content.n7h>> list) {
        super(list);
        this.f7909s = new com.airbnb.lottie.model.content.n7h();
        this.f7908p = new Path();
    }

    public void cdj(@dd List<InterfaceC1409i> list) {
        this.f55933ld6 = list;
    }

    @Override // com.airbnb.lottie.animation.keyframe.AbstractC1421k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Path mo5911s(C1515k<com.airbnb.lottie.model.content.n7h> c1515k, float f2) {
        this.f7909s.zy(c1515k.f56198toq, c1515k.f56200zy, f2);
        com.airbnb.lottie.model.content.n7h n7hVarZy = this.f7909s;
        List<InterfaceC1409i> list = this.f55933ld6;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                n7hVarZy = this.f55933ld6.get(size).zy(n7hVarZy);
            }
        }
        com.airbnb.lottie.utils.f7l8.m6241s(n7hVarZy, this.f7908p);
        return this.f7908p;
    }
}

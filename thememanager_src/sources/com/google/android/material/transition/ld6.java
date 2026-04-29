package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.o1t;
import zy.lvui;

/* JADX INFO: compiled from: MaterialArcMotion.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 extends o1t {
    private static PointF toq(float f2, float f3, float f4, float f5) {
        return f3 > f5 ? new PointF(f4, f3) : new PointF(f2, f5);
    }

    @Override // androidx.transition.o1t
    @lvui
    /* JADX INFO: renamed from: k */
    public Path mo5403k(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        PointF qVar = toq(f2, f3, f4, f5);
        path.quadTo(qVar.x, qVar.y, f4, f5);
        return path;
    }
}

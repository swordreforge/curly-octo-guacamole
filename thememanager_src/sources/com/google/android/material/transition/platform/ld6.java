package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: MaterialArcMotion.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class ld6 extends PathMotion {
    /* JADX INFO: renamed from: k */
    private static PointF m15205k(float f2, float f3, float f4, float f5) {
        return f3 > f5 ? new PointF(f4, f3) : new PointF(f2, f5);
    }

    @Override // android.transition.PathMotion
    @lvui
    public Path getPath(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        PointF pointFM15205k = m15205k(f2, f3, f4, f5);
        path.quadTo(pointFM15205k.x, pointFM15205k.y, f4, f5);
        return path;
    }
}

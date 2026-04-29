package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.C4103h;
import com.google.android.material.transition.platform.x2;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.material.transition.platform.p */
/* JADX INFO: compiled from: MaskEvaluator.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
class C4206p {

    /* JADX INFO: renamed from: n */
    private com.google.android.material.shape.kja0 f25496n;

    /* JADX INFO: renamed from: k */
    private final Path f25495k = new Path();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path f67993toq = new Path();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Path f67994zy = new Path();

    /* JADX INFO: renamed from: q */
    private final C4103h f25497q = C4103h.ld6();

    C4206p() {
    }

    /* JADX INFO: renamed from: k */
    void m15209k(Canvas canvas) {
        canvas.clipPath(this.f25495k);
    }

    /* JADX INFO: renamed from: q */
    Path m15210q() {
        return this.f25495k;
    }

    void toq(float f2, com.google.android.material.shape.kja0 kja0Var, com.google.android.material.shape.kja0 kja0Var2, RectF rectF, RectF rectF2, RectF rectF3, x2.C4217n c4217n) {
        com.google.android.material.shape.kja0 kja0VarKja0 = zurt.kja0(kja0Var, kja0Var2, rectF, rectF3, c4217n.m15251q(), c4217n.zy(), f2);
        this.f25496n = kja0VarKja0;
        this.f25497q.m14814q(kja0VarKja0, 1.0f, rectF2, this.f67993toq);
        this.f25497q.m14814q(this.f25496n, 1.0f, rectF3, this.f67994zy);
        this.f25495k.op(this.f67993toq, this.f67994zy, Path.Op.UNION);
    }

    com.google.android.material.shape.kja0 zy() {
        return this.f25496n;
    }
}

package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.C4103h;
import com.google.android.material.transition.x2;

/* JADX INFO: renamed from: com.google.android.material.transition.p */
/* JADX INFO: compiled from: MaskEvaluator.java */
/* JADX INFO: loaded from: classes2.dex */
class C4198p {

    /* JADX INFO: renamed from: n */
    private com.google.android.material.shape.kja0 f25459n;

    /* JADX INFO: renamed from: k */
    private final Path f25458k = new Path();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path f67987toq = new Path();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Path f67988zy = new Path();

    /* JADX INFO: renamed from: q */
    private final C4103h f25460q = C4103h.ld6();

    C4198p() {
    }

    /* JADX INFO: renamed from: k */
    void m15184k(Canvas canvas) {
        canvas.clipPath(this.f25458k);
    }

    /* JADX INFO: renamed from: q */
    Path m15185q() {
        return this.f25458k;
    }

    void toq(float f2, com.google.android.material.shape.kja0 kja0Var, com.google.android.material.shape.kja0 kja0Var2, RectF rectF, RectF rectF2, RectF rectF3, x2.C4230n c4230n) {
        com.google.android.material.shape.kja0 kja0VarKja0 = fn3e.kja0(kja0Var, kja0Var2, rectF, rectF3, c4230n.m15284q(), c4230n.zy(), f2);
        this.f25459n = kja0VarKja0;
        this.f25460q.m14814q(kja0VarKja0, 1.0f, rectF2, this.f67987toq);
        this.f25460q.m14814q(this.f25459n, 1.0f, rectF3, this.f67988zy);
        this.f25458k.op(this.f67987toq, this.f67988zy, Path.Op.UNION);
    }

    com.google.android.material.shape.kja0 zy() {
        return this.f25459n;
    }
}

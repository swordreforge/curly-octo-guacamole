package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: RectEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
class a9 implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: k */
    private Rect f6370k;

    a9() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i2 = rect.left + ((int) ((rect2.left - r0) * f2));
        int i3 = rect.top + ((int) ((rect2.top - r1) * f2));
        int i4 = rect.right + ((int) ((rect2.right - r2) * f2));
        int i5 = rect.bottom + ((int) ((rect2.bottom - r6) * f2));
        Rect rect3 = this.f6370k;
        if (rect3 == null) {
            return new Rect(i2, i3, i4, i5);
        }
        rect3.set(i2, i3, i4, i5);
        return this.f6370k;
    }

    a9(Rect rect) {
        this.f6370k = rect;
    }
}

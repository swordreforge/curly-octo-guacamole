package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: compiled from: KeyPositionBase.java */
/* JADX INFO: loaded from: classes.dex */
abstract class ld6 extends AbstractC0368g {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    protected static final float f48166a9 = 20.0f;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    int f48167jk = AbstractC0368g.f2232g;

    ld6() {
    }

    abstract float cdj();

    /* JADX INFO: renamed from: h */
    abstract float mo1481h();

    public abstract boolean ki(int layoutWidth, int layoutHeight, RectF start, RectF end, float x3, float y3);

    abstract void kja0(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y);

    @Override // androidx.constraintlayout.motion.widget.AbstractC0368g
    /* JADX INFO: renamed from: q */
    void mo1434q(HashSet<String> attributes) {
    }

    abstract void t8r(View view, RectF start, RectF end, float x3, float y3, String[] attribute, float[] value);
}

package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.C0683f;
import ncyb.C7401k;

/* JADX INFO: compiled from: ItemTouchUIUtilImpl.java */
/* JADX INFO: loaded from: classes.dex */
class cdj implements InterfaceC1082h {

    /* JADX INFO: renamed from: k */
    static final InterfaceC1082h f5824k = new cdj();

    cdj() {
    }

    /* JADX INFO: renamed from: n */
    private static float m4936n(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != view) {
                float fM3166l = C0683f.m3166l(childAt);
                if (fM3166l > f2) {
                    f2 = fM3166l;
                }
            }
        }
        return f2;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1082h
    /* JADX INFO: renamed from: k */
    public void mo4937k(View view) {
        int i2 = C7401k.n.f42621c;
        Object tag = view.getTag(i2);
        if (tag instanceof Float) {
            C0683f.a5id(view, ((Float) tag).floatValue());
        }
        view.setTag(i2, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1082h
    /* JADX INFO: renamed from: q */
    public void mo4938q(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1082h
    public void toq(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1082h
    public void zy(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z2) {
        if (z2) {
            int i3 = C7401k.n.f42621c;
            if (view.getTag(i3) == null) {
                Float fValueOf = Float.valueOf(C0683f.m3166l(view));
                C0683f.a5id(view, m4936n(recyclerView, view) + 1.0f);
                view.setTag(i3, fValueOf);
            }
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}

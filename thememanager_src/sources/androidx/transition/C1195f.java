package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.f */
/* JADX INFO: compiled from: ViewGroupOverlayApi14.java */
/* JADX INFO: loaded from: classes.dex */
class C1195f extends hb implements lrht {
    C1195f(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static C1195f f7l8(ViewGroup viewGroup) {
        return (C1195f) hb.m5350n(viewGroup);
    }

    @Override // androidx.transition.lrht
    /* JADX INFO: renamed from: q */
    public void mo5306q(@zy.lvui View view) {
        this.f6446k.m5355y(view);
    }

    @Override // androidx.transition.lrht
    public void zy(@zy.lvui View view) {
        this.f6446k.toq(view);
    }
}

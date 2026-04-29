package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: renamed from: androidx.transition.c */
/* JADX INFO: compiled from: ViewGroupOverlayApi18.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(18)
class C1185c implements lrht {

    /* JADX INFO: renamed from: k */
    private final ViewGroupOverlay f6374k;

    C1185c(@zy.lvui ViewGroup viewGroup) {
        this.f6374k = viewGroup.getOverlay();
    }

    @Override // androidx.transition.InterfaceC1236o
    /* JADX INFO: renamed from: k */
    public void mo5305k(@zy.lvui Drawable drawable) {
        this.f6374k.add(drawable);
    }

    @Override // androidx.transition.lrht
    /* JADX INFO: renamed from: q */
    public void mo5306q(@zy.lvui View view) {
        this.f6374k.remove(view);
    }

    @Override // androidx.transition.InterfaceC1236o
    public void toq(@zy.lvui Drawable drawable) {
        this.f6374k.remove(drawable);
    }

    @Override // androidx.transition.lrht
    public void zy(@zy.lvui View view) {
        this.f6374k.add(view);
    }
}

package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: renamed from: androidx.transition.j */
/* JADX INFO: compiled from: ViewOverlayApi18.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(18)
class C1216j implements InterfaceC1236o {

    /* JADX INFO: renamed from: k */
    private final ViewOverlay f6469k;

    C1216j(@zy.lvui View view) {
        this.f6469k = view.getOverlay();
    }

    @Override // androidx.transition.InterfaceC1236o
    /* JADX INFO: renamed from: k */
    public void mo5305k(@zy.lvui Drawable drawable) {
        this.f6469k.add(drawable);
    }

    @Override // androidx.transition.InterfaceC1236o
    public void toq(@zy.lvui Drawable drawable) {
        this.f6469k.remove(drawable);
    }
}

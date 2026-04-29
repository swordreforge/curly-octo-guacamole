package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.InterfaceC3185g;

/* JADX INFO: renamed from: com.bumptech.glide.request.transition.q */
/* JADX INFO: compiled from: DrawableCrossFadeTransition.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3190q implements InterfaceC3185g<Drawable> {

    /* JADX INFO: renamed from: k */
    private final int f19054k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f63055toq;

    public C3190q(int i2, boolean z2) {
        this.f19054k = i2;
        this.f63055toq = z2;
    }

    @Override // com.bumptech.glide.request.transition.InterfaceC3185g
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public boolean mo11211k(Drawable drawable, InterfaceC3185g.k kVar) {
        Drawable drawableMo11203n = kVar.mo11203n();
        if (drawableMo11203n == null) {
            drawableMo11203n = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableMo11203n, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f63055toq);
        transitionDrawable.startTransition(this.f19054k);
        kVar.mo11204q(transitionDrawable);
        return true;
    }
}

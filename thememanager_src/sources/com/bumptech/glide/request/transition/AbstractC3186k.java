package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.request.transition.InterfaceC3185g;

/* JADX INFO: renamed from: com.bumptech.glide.request.transition.k */
/* JADX INFO: compiled from: BitmapContainerTransitionFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3186k<R> implements f7l8<R> {

    /* JADX INFO: renamed from: k */
    private final f7l8<Drawable> f19049k;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.k$k */
    /* JADX INFO: compiled from: BitmapContainerTransitionFactory.java */
    private final class k implements InterfaceC3185g<R> {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3185g<Drawable> f19050k;

        k(InterfaceC3185g<Drawable> interfaceC3185g) {
            this.f19050k = interfaceC3185g;
        }

        @Override // com.bumptech.glide.request.transition.InterfaceC3185g
        /* JADX INFO: renamed from: k */
        public boolean mo11211k(R r2, InterfaceC3185g.k kVar) {
            return this.f19050k.mo11211k(new BitmapDrawable(kVar.zy().getResources(), AbstractC3186k.this.toq(r2)), kVar);
        }
    }

    public AbstractC3186k(f7l8<Drawable> f7l8Var) {
        this.f19049k = f7l8Var;
    }

    @Override // com.bumptech.glide.request.transition.f7l8
    /* JADX INFO: renamed from: k */
    public InterfaceC3185g<R> mo11210k(EnumC3050k enumC3050k, boolean z2) {
        return new k(this.f19049k.mo11210k(enumC3050k, z2));
    }

    protected abstract Bitmap toq(R r2);
}

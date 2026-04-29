package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.request.transition.C3189p;

/* JADX INFO: renamed from: com.bumptech.glide.request.transition.s */
/* JADX INFO: compiled from: ViewPropertyAnimationFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3191s<R> implements f7l8<R> {

    /* JADX INFO: renamed from: k */
    private final C3189p.k f19055k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C3189p<R> f63056toq;

    public C3191s(C3189p.k kVar) {
        this.f19055k = kVar;
    }

    @Override // com.bumptech.glide.request.transition.f7l8
    /* JADX INFO: renamed from: k */
    public InterfaceC3185g<R> mo11210k(EnumC3050k enumC3050k, boolean z2) {
        if (enumC3050k == EnumC3050k.MEMORY_CACHE || !z2) {
            return C3188n.toq();
        }
        if (this.f63056toq == null) {
            this.f63056toq = new C3189p<>(this.f19055k);
        }
        return this.f63056toq;
    }
}

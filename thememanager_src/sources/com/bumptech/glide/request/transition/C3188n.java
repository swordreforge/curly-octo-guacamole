package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.request.transition.InterfaceC3185g;

/* JADX INFO: renamed from: com.bumptech.glide.request.transition.n */
/* JADX INFO: compiled from: NoTransition.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3188n<R> implements InterfaceC3185g<R> {

    /* JADX INFO: renamed from: k */
    static final C3188n<?> f19052k = new C3188n<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final f7l8<?> f63054toq = new k();

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.n$k */
    /* JADX INFO: compiled from: NoTransition.java */
    public static class k<R> implements f7l8<R> {
        @Override // com.bumptech.glide.request.transition.f7l8
        /* JADX INFO: renamed from: k */
        public InterfaceC3185g<R> mo11210k(EnumC3050k enumC3050k, boolean z2) {
            return C3188n.f19052k;
        }
    }

    public static <R> InterfaceC3185g<R> toq() {
        return f19052k;
    }

    public static <R> f7l8<R> zy() {
        return (f7l8<R>) f63054toq;
    }

    @Override // com.bumptech.glide.request.transition.InterfaceC3185g
    /* JADX INFO: renamed from: k */
    public boolean mo11211k(Object obj, InterfaceC3185g.k kVar) {
        return false;
    }
}

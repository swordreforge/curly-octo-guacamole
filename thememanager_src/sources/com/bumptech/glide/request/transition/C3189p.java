package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.InterfaceC3185g;

/* JADX INFO: renamed from: com.bumptech.glide.request.transition.p */
/* JADX INFO: compiled from: ViewPropertyTransition.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3189p<R> implements InterfaceC3185g<R> {

    /* JADX INFO: renamed from: k */
    private final k f19053k;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.p$k */
    /* JADX INFO: compiled from: ViewPropertyTransition.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void m11213k(View view);
    }

    public C3189p(k kVar) {
        this.f19053k = kVar;
    }

    @Override // com.bumptech.glide.request.transition.InterfaceC3185g
    /* JADX INFO: renamed from: k */
    public boolean mo11211k(R r2, InterfaceC3185g.k kVar) {
        if (kVar.zy() == null) {
            return false;
        }
        this.f19053k.m11213k(kVar.zy());
        return false;
    }
}

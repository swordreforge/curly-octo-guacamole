package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.InterfaceC3185g;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6<R> implements InterfaceC3185g<R> {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3187k f19051k;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.ld6$k */
    /* JADX INFO: compiled from: ViewTransition.java */
    interface InterfaceC3187k {
        /* JADX INFO: renamed from: k */
        Animation mo11212k(Context context);
    }

    ld6(InterfaceC3187k interfaceC3187k) {
        this.f19051k = interfaceC3187k;
    }

    @Override // com.bumptech.glide.request.transition.InterfaceC3185g
    /* JADX INFO: renamed from: k */
    public boolean mo11211k(R r2, InterfaceC3185g.k kVar) {
        View viewZy = kVar.zy();
        if (viewZy == null) {
            return false;
        }
        viewZy.clearAnimation();
        viewZy.startAnimation(this.f19051k.mo11212k(viewZy.getContext()));
        return false;
    }
}

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.request.transition.ld6;

/* JADX INFO: renamed from: com.bumptech.glide.request.transition.y */
/* JADX INFO: compiled from: ViewAnimationFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3192y<R> implements f7l8<R> {

    /* JADX INFO: renamed from: k */
    private final ld6.InterfaceC3187k f19056k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC3185g<R> f63057toq;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.y$k */
    /* JADX INFO: compiled from: ViewAnimationFactory.java */
    private static class k implements ld6.InterfaceC3187k {

        /* JADX INFO: renamed from: k */
        private final Animation f19057k;

        k(Animation animation) {
            this.f19057k = animation;
        }

        @Override // com.bumptech.glide.request.transition.ld6.InterfaceC3187k
        /* JADX INFO: renamed from: k */
        public Animation mo11212k(Context context) {
            return this.f19057k;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.y$toq */
    /* JADX INFO: compiled from: ViewAnimationFactory.java */
    private static class toq implements ld6.InterfaceC3187k {

        /* JADX INFO: renamed from: k */
        private final int f19058k;

        toq(int i2) {
            this.f19058k = i2;
        }

        @Override // com.bumptech.glide.request.transition.ld6.InterfaceC3187k
        /* JADX INFO: renamed from: k */
        public Animation mo11212k(Context context) {
            return AnimationUtils.loadAnimation(context, this.f19058k);
        }
    }

    public C3192y(Animation animation) {
        this(new k(animation));
    }

    @Override // com.bumptech.glide.request.transition.f7l8
    /* JADX INFO: renamed from: k */
    public InterfaceC3185g<R> mo11210k(EnumC3050k enumC3050k, boolean z2) {
        if (enumC3050k == EnumC3050k.MEMORY_CACHE || !z2) {
            return C3188n.toq();
        }
        if (this.f63057toq == null) {
            this.f63057toq = new ld6(this.f19056k);
        }
        return this.f63057toq;
    }

    public C3192y(int i2) {
        this(new toq(i2));
    }

    C3192y(ld6.InterfaceC3187k interfaceC3187k) {
        this.f19056k = interfaceC3187k;
    }
}

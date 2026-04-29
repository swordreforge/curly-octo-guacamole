package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC3050k;

/* JADX INFO: compiled from: DrawableCrossFadeFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements f7l8<Drawable> {

    /* JADX INFO: renamed from: k */
    private final int f19059k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f63058toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C3190q f63059zy;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.zy$k */
    /* JADX INFO: compiled from: DrawableCrossFadeFactory.java */
    public static class C3193k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f63060zy = 300;

        /* JADX INFO: renamed from: k */
        private final int f19060k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f63061toq;

        public C3193k() {
            this(300);
        }

        /* JADX INFO: renamed from: k */
        public zy m11214k() {
            return new zy(this.f19060k, this.f63061toq);
        }

        public C3193k toq(boolean z2) {
            this.f63061toq = z2;
            return this;
        }

        public C3193k(int i2) {
            this.f19060k = i2;
        }
    }

    protected zy(int i2, boolean z2) {
        this.f19059k = i2;
        this.f63058toq = z2;
    }

    private InterfaceC3185g<Drawable> toq() {
        if (this.f63059zy == null) {
            this.f63059zy = new C3190q(this.f19059k, this.f63058toq);
        }
        return this.f63059zy;
    }

    @Override // com.bumptech.glide.request.transition.f7l8
    /* JADX INFO: renamed from: k */
    public InterfaceC3185g<Drawable> mo11210k(EnumC3050k enumC3050k, boolean z2) {
        return enumC3050k == EnumC3050k.MEMORY_CACHE ? C3188n.toq() : toq();
    }
}

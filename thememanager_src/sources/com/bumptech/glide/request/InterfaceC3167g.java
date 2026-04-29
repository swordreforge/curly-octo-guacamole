package com.bumptech.glide.request;

/* JADX INFO: renamed from: com.bumptech.glide.request.g */
/* JADX INFO: compiled from: RequestCoordinator.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3167g {

    /* JADX INFO: renamed from: com.bumptech.glide.request.g$k */
    /* JADX INFO: compiled from: RequestCoordinator.java */
    public enum k {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        k(boolean z2) {
            this.isComplete = z2;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    /* JADX INFO: renamed from: g */
    void mo11150g(InterfaceC3170n interfaceC3170n);

    InterfaceC3167g getRoot();

    /* JADX INFO: renamed from: k */
    boolean mo11151k();

    /* JADX INFO: renamed from: p */
    boolean mo11152p(InterfaceC3170n interfaceC3170n);

    /* JADX INFO: renamed from: q */
    void mo11153q(InterfaceC3170n interfaceC3170n);

    boolean toq(InterfaceC3170n interfaceC3170n);

    boolean zy(InterfaceC3170n interfaceC3170n);
}

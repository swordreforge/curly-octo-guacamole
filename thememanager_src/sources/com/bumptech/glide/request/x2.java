package com.bumptech.glide.request;

import com.bumptech.glide.request.InterfaceC3167g;
import zy.dd;
import zy.o1t;

/* JADX INFO: compiled from: ThumbnailRequestCoordinator.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 implements InterfaceC3167g, InterfaceC3170n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @o1t("requestLock")
    private boolean f63062f7l8;

    /* JADX INFO: renamed from: g */
    @o1t("requestLock")
    private InterfaceC3167g.k f19061g;

    /* JADX INFO: renamed from: k */
    @dd
    private final InterfaceC3167g f19062k;

    /* JADX INFO: renamed from: n */
    @o1t("requestLock")
    private InterfaceC3167g.k f19063n;

    /* JADX INFO: renamed from: q */
    private volatile InterfaceC3170n f19064q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f63063toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile InterfaceC3170n f63064zy;

    public x2(Object obj, @dd InterfaceC3167g interfaceC3167g) {
        InterfaceC3167g.k kVar = InterfaceC3167g.k.CLEARED;
        this.f19063n = kVar;
        this.f19061g = kVar;
        this.f63063toq = obj;
        this.f19062k = interfaceC3167g;
    }

    @o1t("requestLock")
    private boolean ld6() {
        InterfaceC3167g interfaceC3167g = this.f19062k;
        return interfaceC3167g == null || interfaceC3167g.mo11152p(this);
    }

    @o1t("requestLock")
    private boolean qrj() {
        InterfaceC3167g interfaceC3167g = this.f19062k;
        return interfaceC3167g == null || interfaceC3167g.zy(this);
    }

    @o1t("requestLock")
    private boolean x2() {
        InterfaceC3167g interfaceC3167g = this.f19062k;
        return interfaceC3167g == null || interfaceC3167g.toq(this);
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public void clear() {
        synchronized (this.f63063toq) {
            this.f63062f7l8 = false;
            InterfaceC3167g.k kVar = InterfaceC3167g.k.CLEARED;
            this.f19063n = kVar;
            this.f19061g = kVar;
            this.f19064q.clear();
            this.f63064zy.clear();
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public boolean f7l8() {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = this.f19063n == InterfaceC3167g.k.SUCCESS;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    /* JADX INFO: renamed from: g */
    public void mo11150g(InterfaceC3170n interfaceC3170n) {
        synchronized (this.f63063toq) {
            if (interfaceC3170n.equals(this.f19064q)) {
                this.f19061g = InterfaceC3167g.k.SUCCESS;
                return;
            }
            this.f19063n = InterfaceC3167g.k.SUCCESS;
            InterfaceC3167g interfaceC3167g = this.f19062k;
            if (interfaceC3167g != null) {
                interfaceC3167g.mo11150g(this);
            }
            if (!this.f19061g.isComplete()) {
                this.f19064q.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    public InterfaceC3167g getRoot() {
        InterfaceC3167g root;
        synchronized (this.f63063toq) {
            InterfaceC3167g interfaceC3167g = this.f19062k;
            root = interfaceC3167g != null ? interfaceC3167g.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public boolean isRunning() {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = this.f19063n == InterfaceC3167g.k.RUNNING;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g, com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: k */
    public boolean mo11151k() {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = this.f19064q.mo11151k() || this.f63064zy.mo11151k();
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: n */
    public boolean mo11171n() {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = this.f19063n == InterfaceC3167g.k.CLEARED;
        }
        return z2;
    }

    public void n7h(InterfaceC3170n interfaceC3170n, InterfaceC3170n interfaceC3170n2) {
        this.f63064zy = interfaceC3170n;
        this.f19064q = interfaceC3170n2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    /* JADX INFO: renamed from: p */
    public boolean mo11152p(InterfaceC3170n interfaceC3170n) {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = ld6() && interfaceC3170n.equals(this.f63064zy) && this.f19063n != InterfaceC3167g.k.PAUSED;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public void pause() {
        synchronized (this.f63063toq) {
            if (!this.f19061g.isComplete()) {
                this.f19061g = InterfaceC3167g.k.PAUSED;
                this.f19064q.pause();
            }
            if (!this.f19063n.isComplete()) {
                this.f19063n = InterfaceC3167g.k.PAUSED;
                this.f63064zy.pause();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    /* JADX INFO: renamed from: q */
    public void mo11153q(InterfaceC3170n interfaceC3170n) {
        synchronized (this.f63063toq) {
            if (!interfaceC3170n.equals(this.f63064zy)) {
                this.f19061g = InterfaceC3167g.k.FAILED;
                return;
            }
            this.f19063n = InterfaceC3167g.k.FAILED;
            InterfaceC3167g interfaceC3167g = this.f19062k;
            if (interfaceC3167g != null) {
                interfaceC3167g.mo11153q(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: s */
    public void mo11173s() {
        synchronized (this.f63063toq) {
            this.f63062f7l8 = true;
            try {
                if (this.f19063n != InterfaceC3167g.k.SUCCESS) {
                    InterfaceC3167g.k kVar = this.f19061g;
                    InterfaceC3167g.k kVar2 = InterfaceC3167g.k.RUNNING;
                    if (kVar != kVar2) {
                        this.f19061g = kVar2;
                        this.f19064q.mo11173s();
                    }
                }
                if (this.f63062f7l8) {
                    InterfaceC3167g.k kVar3 = this.f19063n;
                    InterfaceC3167g.k kVar4 = InterfaceC3167g.k.RUNNING;
                    if (kVar3 != kVar4) {
                        this.f19063n = kVar4;
                        this.f63064zy.mo11173s();
                    }
                }
            } finally {
                this.f63062f7l8 = false;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    public boolean toq(InterfaceC3170n interfaceC3170n) {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = x2() && interfaceC3170n.equals(this.f63064zy) && !mo11151k();
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: y */
    public boolean mo11174y(InterfaceC3170n interfaceC3170n) {
        if (!(interfaceC3170n instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) interfaceC3170n;
        if (this.f63064zy == null) {
            if (x2Var.f63064zy != null) {
                return false;
            }
        } else if (!this.f63064zy.mo11174y(x2Var.f63064zy)) {
            return false;
        }
        if (this.f19064q == null) {
            if (x2Var.f19064q != null) {
                return false;
            }
        } else if (!this.f19064q.mo11174y(x2Var.f19064q)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    public boolean zy(InterfaceC3170n interfaceC3170n) {
        boolean z2;
        synchronized (this.f63063toq) {
            z2 = qrj() && (interfaceC3170n.equals(this.f63064zy) || this.f19063n != InterfaceC3167g.k.SUCCESS);
        }
        return z2;
    }
}

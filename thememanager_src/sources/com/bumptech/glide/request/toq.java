package com.bumptech.glide.request;

import com.bumptech.glide.request.InterfaceC3167g;
import zy.dd;
import zy.o1t;

/* JADX INFO: compiled from: ErrorRequestCoordinator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements InterfaceC3167g, InterfaceC3170n {

    /* JADX INFO: renamed from: g */
    @o1t("requestLock")
    private InterfaceC3167g.k f19045g;

    /* JADX INFO: renamed from: k */
    private final Object f19046k;

    /* JADX INFO: renamed from: n */
    @o1t("requestLock")
    private InterfaceC3167g.k f19047n;

    /* JADX INFO: renamed from: q */
    private volatile InterfaceC3170n f19048q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final InterfaceC3167g f63051toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile InterfaceC3170n f63052zy;

    public toq(Object obj, @dd InterfaceC3167g interfaceC3167g) {
        InterfaceC3167g.k kVar = InterfaceC3167g.k.CLEARED;
        this.f19047n = kVar;
        this.f19045g = kVar;
        this.f19046k = obj;
        this.f63051toq = interfaceC3167g;
    }

    @o1t("requestLock")
    private boolean ld6(InterfaceC3170n interfaceC3170n) {
        InterfaceC3167g.k kVar;
        InterfaceC3167g.k kVar2 = this.f19047n;
        InterfaceC3167g.k kVar3 = InterfaceC3167g.k.FAILED;
        return kVar2 != kVar3 ? interfaceC3170n.equals(this.f63052zy) : interfaceC3170n.equals(this.f19048q) && ((kVar = this.f19045g) == InterfaceC3167g.k.SUCCESS || kVar == kVar3);
    }

    @o1t("requestLock")
    private boolean n7h() {
        InterfaceC3167g interfaceC3167g = this.f63051toq;
        return interfaceC3167g == null || interfaceC3167g.zy(this);
    }

    @o1t("requestLock")
    private boolean qrj() {
        InterfaceC3167g interfaceC3167g = this.f63051toq;
        return interfaceC3167g == null || interfaceC3167g.toq(this);
    }

    @o1t("requestLock")
    private boolean x2() {
        InterfaceC3167g interfaceC3167g = this.f63051toq;
        return interfaceC3167g == null || interfaceC3167g.mo11152p(this);
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public void clear() {
        synchronized (this.f19046k) {
            InterfaceC3167g.k kVar = InterfaceC3167g.k.CLEARED;
            this.f19047n = kVar;
            this.f63052zy.clear();
            if (this.f19045g != kVar) {
                this.f19045g = kVar;
                this.f19048q.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public boolean f7l8() {
        boolean z2;
        synchronized (this.f19046k) {
            InterfaceC3167g.k kVar = this.f19047n;
            InterfaceC3167g.k kVar2 = InterfaceC3167g.k.SUCCESS;
            z2 = kVar == kVar2 || this.f19045g == kVar2;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    /* JADX INFO: renamed from: g */
    public void mo11150g(InterfaceC3170n interfaceC3170n) {
        synchronized (this.f19046k) {
            if (interfaceC3170n.equals(this.f63052zy)) {
                this.f19047n = InterfaceC3167g.k.SUCCESS;
            } else if (interfaceC3170n.equals(this.f19048q)) {
                this.f19045g = InterfaceC3167g.k.SUCCESS;
            }
            InterfaceC3167g interfaceC3167g = this.f63051toq;
            if (interfaceC3167g != null) {
                interfaceC3167g.mo11150g(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    public InterfaceC3167g getRoot() {
        InterfaceC3167g root;
        synchronized (this.f19046k) {
            InterfaceC3167g interfaceC3167g = this.f63051toq;
            root = interfaceC3167g != null ? interfaceC3167g.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public boolean isRunning() {
        boolean z2;
        synchronized (this.f19046k) {
            InterfaceC3167g.k kVar = this.f19047n;
            InterfaceC3167g.k kVar2 = InterfaceC3167g.k.RUNNING;
            z2 = kVar == kVar2 || this.f19045g == kVar2;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g, com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: k */
    public boolean mo11151k() {
        boolean z2;
        synchronized (this.f19046k) {
            z2 = this.f63052zy.mo11151k() || this.f19048q.mo11151k();
        }
        return z2;
    }

    public void kja0(InterfaceC3170n interfaceC3170n, InterfaceC3170n interfaceC3170n2) {
        this.f63052zy = interfaceC3170n;
        this.f19048q = interfaceC3170n2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: n */
    public boolean mo11171n() {
        boolean z2;
        synchronized (this.f19046k) {
            InterfaceC3167g.k kVar = this.f19047n;
            InterfaceC3167g.k kVar2 = InterfaceC3167g.k.CLEARED;
            z2 = kVar == kVar2 && this.f19045g == kVar2;
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    /* JADX INFO: renamed from: p */
    public boolean mo11152p(InterfaceC3170n interfaceC3170n) {
        boolean z2;
        synchronized (this.f19046k) {
            z2 = x2() && interfaceC3170n.equals(this.f63052zy);
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    public void pause() {
        synchronized (this.f19046k) {
            InterfaceC3167g.k kVar = this.f19047n;
            InterfaceC3167g.k kVar2 = InterfaceC3167g.k.RUNNING;
            if (kVar == kVar2) {
                this.f19047n = InterfaceC3167g.k.PAUSED;
                this.f63052zy.pause();
            }
            if (this.f19045g == kVar2) {
                this.f19045g = InterfaceC3167g.k.PAUSED;
                this.f19048q.pause();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    /* JADX INFO: renamed from: q */
    public void mo11153q(InterfaceC3170n interfaceC3170n) {
        synchronized (this.f19046k) {
            if (interfaceC3170n.equals(this.f19048q)) {
                this.f19045g = InterfaceC3167g.k.FAILED;
                InterfaceC3167g interfaceC3167g = this.f63051toq;
                if (interfaceC3167g != null) {
                    interfaceC3167g.mo11153q(this);
                }
                return;
            }
            this.f19047n = InterfaceC3167g.k.FAILED;
            InterfaceC3167g.k kVar = this.f19045g;
            InterfaceC3167g.k kVar2 = InterfaceC3167g.k.RUNNING;
            if (kVar != kVar2) {
                this.f19045g = kVar2;
                this.f19048q.mo11173s();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: s */
    public void mo11173s() {
        synchronized (this.f19046k) {
            InterfaceC3167g.k kVar = this.f19047n;
            InterfaceC3167g.k kVar2 = InterfaceC3167g.k.RUNNING;
            if (kVar != kVar2) {
                this.f19047n = kVar2;
                this.f63052zy.mo11173s();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    public boolean toq(InterfaceC3170n interfaceC3170n) {
        boolean z2;
        synchronized (this.f19046k) {
            z2 = qrj() && ld6(interfaceC3170n);
        }
        return z2;
    }

    @Override // com.bumptech.glide.request.InterfaceC3170n
    /* JADX INFO: renamed from: y */
    public boolean mo11174y(InterfaceC3170n interfaceC3170n) {
        if (!(interfaceC3170n instanceof toq)) {
            return false;
        }
        toq toqVar = (toq) interfaceC3170n;
        return this.f63052zy.mo11174y(toqVar.f63052zy) && this.f19048q.mo11174y(toqVar.f19048q);
    }

    @Override // com.bumptech.glide.request.InterfaceC3167g
    public boolean zy(InterfaceC3170n interfaceC3170n) {
        boolean zN7h;
        synchronized (this.f19046k) {
            zN7h = n7h();
        }
        return zN7h;
    }
}

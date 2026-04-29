package com.bumptech.glide.load.engine;

import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.h */
/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes2.dex */
class C3031h<Z> implements zurt<Z> {

    /* JADX INFO: renamed from: g */
    private final k f18376g;

    /* JADX INFO: renamed from: k */
    private final boolean f18377k;

    /* JADX INFO: renamed from: n */
    private final zurt<Z> f18378n;

    /* JADX INFO: renamed from: p */
    private boolean f18379p;

    /* JADX INFO: renamed from: q */
    private final boolean f18380q;

    /* JADX INFO: renamed from: s */
    private int f18381s;

    /* JADX INFO: renamed from: y */
    private final com.bumptech.glide.load.f7l8 f18382y;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$k */
    /* JADX INFO: compiled from: EngineResource.java */
    interface k {
        /* JADX INFO: renamed from: q */
        void mo10772q(com.bumptech.glide.load.f7l8 f7l8Var, C3031h<?> c3031h);
    }

    C3031h(zurt<Z> zurtVar, boolean z2, boolean z3, com.bumptech.glide.load.f7l8 f7l8Var, k kVar) {
        this.f18378n = (zurt) com.bumptech.glide.util.qrj.m11262q(zurtVar);
        this.f18377k = z2;
        this.f18380q = z3;
        this.f18382y = f7l8Var;
        this.f18376g = (k) com.bumptech.glide.util.qrj.m11262q(kVar);
    }

    void f7l8() {
        boolean z2;
        synchronized (this) {
            int i2 = this.f18381s;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z2 = true;
            int i3 = i2 - 1;
            this.f18381s = i3;
            if (i3 != 0) {
                z2 = false;
            }
        }
        if (z2) {
            this.f18376g.mo10772q(this.f18382y, this);
        }
    }

    /* JADX INFO: renamed from: g */
    boolean m10769g() {
        return this.f18377k;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    public Z get() {
        return this.f18378n.get();
    }

    /* JADX INFO: renamed from: k */
    synchronized void m10770k() {
        if (this.f18379p) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f18381s++;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<Z> mo10765n() {
        return this.f18378n.mo10765n();
    }

    /* JADX INFO: renamed from: q */
    zurt<Z> m10771q() {
        return this.f18378n;
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f18377k + ", listener=" + this.f18376g + ", key=" + this.f18382y + ", acquired=" + this.f18381s + ", isRecycled=" + this.f18379p + ", resource=" + this.f18378n + '}';
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public synchronized void toq() {
        if (this.f18381s > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f18379p) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f18379p = true;
        if (this.f18380q) {
            this.f18378n.toq();
        }
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return this.f18378n.zy();
    }
}

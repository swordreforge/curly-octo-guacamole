package com.bumptech.glide.load.engine;

import androidx.core.util.qrj;
import com.bumptech.glide.util.pool.C3205k;
import zy.lvui;

/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes2.dex */
final class fn3e<Z> implements zurt<Z>, C3205k.g {

    /* JADX INFO: renamed from: y */
    private static final qrj.InterfaceC0641k<fn3e<?>> f18365y = C3205k.m11247n(20, new C3029k());

    /* JADX INFO: renamed from: g */
    private boolean f18366g;

    /* JADX INFO: renamed from: k */
    private final com.bumptech.glide.util.pool.zy f18367k = com.bumptech.glide.util.pool.zy.m11255k();

    /* JADX INFO: renamed from: n */
    private boolean f18368n;

    /* JADX INFO: renamed from: q */
    private zurt<Z> f18369q;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.fn3e$k */
    /* JADX INFO: compiled from: LockedResource.java */
    class C3029k implements C3205k.q<fn3e<?>> {
        C3029k() {
        }

        @Override // com.bumptech.glide.util.pool.C3205k.q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public fn3e<?> mo10723k() {
            return new fn3e<>();
        }
    }

    fn3e() {
    }

    private void f7l8() {
        this.f18369q = null;
        f18365y.toq(this);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    static <Z> fn3e<Z> m10763g(zurt<Z> zurtVar) {
        fn3e<Z> fn3eVar = (fn3e) com.bumptech.glide.util.qrj.m11262q(f18365y.mo2983k());
        fn3eVar.m10764k(zurtVar);
        return fn3eVar;
    }

    /* JADX INFO: renamed from: k */
    private void m10764k(zurt<Z> zurtVar) {
        this.f18366g = false;
        this.f18368n = true;
        this.f18369q = zurtVar;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    public Z get() {
        return this.f18369q.get();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<Z> mo10765n() {
        return this.f18369q.mo10765n();
    }

    @Override // com.bumptech.glide.util.pool.C3205k.g
    @lvui
    /* JADX INFO: renamed from: q */
    public com.bumptech.glide.util.pool.zy mo10724q() {
        return this.f18367k;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public synchronized void toq() {
        this.f18367k.zy();
        this.f18366g = true;
        if (!this.f18368n) {
            this.f18369q.toq();
            f7l8();
        }
    }

    /* JADX INFO: renamed from: y */
    synchronized void m10766y() {
        this.f18367k.zy();
        if (!this.f18368n) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f18368n = false;
        if (this.f18366g) {
            toq();
        }
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public int zy() {
        return this.f18369q.zy();
    }
}

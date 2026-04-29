package com.bumptech.glide.util.pool;

import zy.lvui;

/* JADX INFO: compiled from: StateVerifier.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zy {

    /* JADX INFO: renamed from: k */
    private static final boolean f19093k = false;

    /* JADX INFO: compiled from: StateVerifier.java */
    private static class toq extends zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private volatile RuntimeException f63086toq;

        toq() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.zy
        void toq(boolean z2) {
            if (z2) {
                this.f63086toq = new RuntimeException("Released");
            } else {
                this.f63086toq = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.zy
        public void zy() {
            if (this.f63086toq != null) {
                throw new IllegalStateException("Already released", this.f63086toq);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StateVerifier.java */
    private static class C7950zy extends zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private volatile boolean f63087toq;

        C7950zy() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.zy
        public void toq(boolean z2) {
            this.f63087toq = z2;
        }

        @Override // com.bumptech.glide.util.pool.zy
        public void zy() {
            if (this.f63087toq) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static zy m11255k() {
        return new C7950zy();
    }

    abstract void toq(boolean z2);

    public abstract void zy();

    private zy() {
    }
}

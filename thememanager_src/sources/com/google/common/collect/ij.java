package com.google.common.collect;

import com.google.common.collect.dxef;
import com.google.common.collect.e5;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Interners.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class ij {

    /* JADX INFO: renamed from: com.google.common.collect.ij$q */
    /* JADX INFO: compiled from: Interners.java */
    @InterfaceC7732q
    static final class C4415q<E> implements pc<E> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7732q
        final dxef<E, e5.EnumC4353k, ?, ?> f26219k;

        @Override // com.google.common.collect.pc
        /* JADX INFO: renamed from: k */
        public E mo15758k(E e2) {
            E e3;
            do {
                dxef.InterfaceC4344p entry = this.f26219k.getEntry(e2);
                if (entry != null && (e3 = (E) entry.getKey()) != null) {
                    return e3;
                }
            } while (this.f26219k.putIfAbsent(e2, e5.EnumC4353k.VALUE) != null);
            return e2;
        }

        private C4415q(e5 e5Var) {
            this.f26219k = dxef.createWithDummyValues(e5Var.m15643y(com.google.common.base.x2.equals()));
        }
    }

    /* JADX INFO: compiled from: Interners.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        private final e5 f26220k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f68215toq;

        /* JADX INFO: renamed from: k */
        public <E> pc<E> m15759k() {
            if (!this.f68215toq) {
                this.f26220k.x2();
            }
            return new C4415q(this.f26220k);
        }

        @wlev.zy("java.lang.ref.WeakReference")
        /* JADX INFO: renamed from: q */
        public toq m15760q() {
            this.f68215toq = false;
            return this;
        }

        public toq toq(int i2) {
            this.f26220k.m15638k(i2);
            return this;
        }

        public toq zy() {
            this.f68215toq = true;
            return this;
        }

        private toq() {
            this.f26220k = new e5();
            this.f68215toq = true;
        }
    }

    /* JADX INFO: compiled from: Interners.java */
    private static class zy<E> implements com.google.common.base.t8r<E, E> {

        /* JADX INFO: renamed from: k */
        private final pc<E> f26221k;

        public zy(pc<E> pcVar) {
            this.f26221k = pcVar;
        }

        @Override // com.google.common.base.t8r
        public E apply(E e2) {
            return this.f26221k.mo15758k(e2);
        }

        @Override // com.google.common.base.t8r
        public boolean equals(Object obj) {
            if (obj instanceof zy) {
                return this.f26221k.equals(((zy) obj).f26221k);
            }
            return false;
        }

        public int hashCode() {
            return this.f26221k.hashCode();
        }
    }

    private ij() {
    }

    /* JADX INFO: renamed from: k */
    public static <E> com.google.common.base.t8r<E, E> m15756k(pc<E> pcVar) {
        return new zy((pc) com.google.common.base.jk.a9(pcVar));
    }

    @wlev.zy("java.lang.ref.WeakReference")
    /* JADX INFO: renamed from: q */
    public static <E> pc<E> m15757q() {
        return toq().m15760q().m15759k();
    }

    public static toq toq() {
        return new toq();
    }

    public static <E> pc<E> zy() {
        return toq().zy().m15759k();
    }
}

package com.bumptech.glide.load.model;

import com.bumptech.glide.util.C3204p;
import java.util.Queue;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h<A, B> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f62846toq = 250;

    /* JADX INFO: renamed from: k */
    private final C3204p<toq<A>, B> f18607k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.n7h$k */
    /* JADX INFO: compiled from: ModelCache.java */
    class C3066k extends C3204p<toq<A>, B> {
        C3066k(long j2) {
            super(j2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.util.C3204p
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public void n7h(@lvui toq<A> toqVar, @dd B b2) {
            toqVar.zy();
        }
    }

    /* JADX INFO: compiled from: ModelCache.java */
    @yz
    static final class toq<A> {

        /* JADX INFO: renamed from: q */
        private static final Queue<toq<?>> f18609q = com.bumptech.glide.util.kja0.m11225g(0);

        /* JADX INFO: renamed from: k */
        private int f18610k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f62847toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private A f62848zy;

        private toq() {
        }

        /* JADX INFO: renamed from: k */
        static <A> toq<A> m10887k(A a2, int i2, int i3) {
            toq<A> toqVar;
            Queue<toq<?>> queue = f18609q;
            synchronized (queue) {
                toqVar = (toq) queue.poll();
            }
            if (toqVar == null) {
                toqVar = new toq<>();
            }
            toqVar.toq(a2, i2, i3);
            return toqVar;
        }

        private void toq(A a2, int i2, int i3) {
            this.f62848zy = a2;
            this.f62847toq = i2;
            this.f18610k = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            return this.f62847toq == toqVar.f62847toq && this.f18610k == toqVar.f18610k && this.f62848zy.equals(toqVar.f62848zy);
        }

        public int hashCode() {
            return (((this.f18610k * 31) + this.f62847toq) * 31) + this.f62848zy.hashCode();
        }

        public void zy() {
            Queue<toq<?>> queue = f18609q;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    public n7h() {
        this(250L);
    }

    /* JADX INFO: renamed from: k */
    public void m10886k() {
        this.f18607k.toq();
    }

    @dd
    public B toq(A a2, int i2, int i3) {
        toq<A> toqVarM10887k = toq.m10887k(a2, i2, i3);
        B bLd6 = this.f18607k.ld6(toqVarM10887k);
        toqVarM10887k.zy();
        return bLd6;
    }

    public void zy(A a2, int i2, int i3, B b2) {
        this.f18607k.kja0(toq.m10887k(a2, i2, i3), b2);
    }

    public n7h(long j2) {
        this.f18607k = new C3066k(j2);
    }
}

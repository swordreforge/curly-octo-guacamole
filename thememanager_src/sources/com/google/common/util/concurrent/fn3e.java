package com.google.common.util.concurrent;

import com.google.common.collect.se;
import com.google.common.collect.wlev;
import com.google.common.collect.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: CollectionFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
abstract class fn3e<V, C> extends ld6<V, C> {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.fn3e$k */
    /* JADX INFO: compiled from: CollectionFuture.java */
    abstract class AbstractC4805k extends ld6<V, C>.AbstractRunnableC4818k {

        /* JADX INFO: renamed from: i */
        private List<com.google.common.base.o1t<V>> f27427i;

        AbstractC4805k(z4<? extends InterfaceFutureC4792c<? extends V>> z4Var, boolean z2) {
            super(z4Var, z2, true);
            this.f27427i = z4Var.isEmpty() ? se.of() : wlev.fn3e(z4Var.size());
            for (int i2 = 0; i2 < z4Var.size(); i2++) {
                this.f27427i.add(null);
            }
        }

        abstract C fn3e(List<com.google.common.base.o1t<V>> list);

        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        /* JADX INFO: renamed from: i */
        void mo16933i() {
            super.mo16933i();
            this.f27427i = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        final void n7h() {
            List<com.google.common.base.o1t<V>> list = this.f27427i;
            if (list != null) {
                fn3e.this.mcp(fn3e(list));
            } else {
                com.google.common.base.jk.yz(fn3e.this.isDone());
            }
        }

        @Override // com.google.common.util.concurrent.ld6.AbstractRunnableC4818k
        final void x2(boolean z2, int i2, @NullableDecl V v2) {
            List<com.google.common.base.o1t<V>> list = this.f27427i;
            if (list != null) {
                list.set(i2, com.google.common.base.o1t.fromNullable(v2));
            } else {
                com.google.common.base.jk.y9n(z2 || fn3e.this.isCancelled(), "Future was done before all dependencies completed");
            }
        }
    }

    /* JADX INFO: compiled from: CollectionFuture.java */
    static final class toq<V> extends fn3e<V, List<V>> {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.fn3e$toq$k */
        /* JADX INFO: compiled from: CollectionFuture.java */
        private final class C4806k extends fn3e<V, List<V>>.AbstractC4805k {
            C4806k(z4<? extends InterfaceFutureC4792c<? extends V>> z4Var, boolean z2) {
                super(z4Var, z2);
            }

            @Override // com.google.common.util.concurrent.fn3e.AbstractC4805k
            /* JADX INFO: renamed from: zurt, reason: merged with bridge method [inline-methods] */
            public List<V> fn3e(List<com.google.common.base.o1t<V>> list) {
                ArrayList arrayListFn3e = wlev.fn3e(list.size());
                Iterator<com.google.common.base.o1t<V>> it = list.iterator();
                while (it.hasNext()) {
                    com.google.common.base.o1t<V> next = it.next();
                    arrayListFn3e.add(next != null ? next.orNull() : null);
                }
                return Collections.unmodifiableList(arrayListFn3e);
            }
        }

        toq(z4<? extends InterfaceFutureC4792c<? extends V>> z4Var, boolean z2) {
            d2ok(new C4806k(z4Var, z2));
        }
    }

    fn3e() {
    }
}

package com.google.common.cache;

import com.google.common.base.jk;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: RemovalListeners.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class ki {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: com.google.common.cache.ki$k */
    /* JADX INFO: compiled from: RemovalListeners.java */
    static class C4286k<K, V> implements cdj<K, V> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Executor f25787k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cdj f25788q;

        /* JADX INFO: renamed from: com.google.common.cache.ki$k$k */
        /* JADX INFO: compiled from: RemovalListeners.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ t8r f25789k;

            k(t8r t8rVar) {
                this.f25789k = t8rVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4286k.this.f25788q.onRemoval(this.f25789k);
            }
        }

        C4286k(Executor executor, cdj cdjVar) {
            this.f25787k = executor;
            this.f25788q = cdjVar;
        }

        @Override // com.google.common.cache.cdj
        public void onRemoval(t8r<K, V> t8rVar) {
            this.f25787k.execute(new k(t8rVar));
        }
    }

    private ki() {
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> cdj<K, V> m15477k(cdj<K, V> cdjVar, Executor executor) {
        jk.a9(cdjVar);
        jk.a9(executor);
        return new C4286k(executor, cdjVar);
    }
}

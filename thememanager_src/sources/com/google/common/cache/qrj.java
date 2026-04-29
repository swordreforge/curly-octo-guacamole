package com.google.common.cache;

import com.google.common.base.lvui;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LongAddables.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class qrj {

    /* JADX INFO: renamed from: k */
    private static final lvui<x2> f25921k;

    /* JADX INFO: renamed from: com.google.common.cache.qrj$k */
    /* JADX INFO: compiled from: LongAddables.java */
    static class C4305k implements lvui<x2> {
        C4305k() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public x2 get() {
            return new n7h();
        }
    }

    /* JADX INFO: compiled from: LongAddables.java */
    static class toq implements lvui<x2> {
        toq() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public x2 get() {
            return new zy(null);
        }
    }

    /* JADX INFO: compiled from: LongAddables.java */
    private static final class zy extends AtomicLong implements x2 {
        private zy() {
        }

        @Override // com.google.common.cache.x2
        public void add(long j2) {
            getAndAdd(j2);
        }

        @Override // com.google.common.cache.x2
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.x2
        public long sum() {
            return get();
        }

        /* synthetic */ zy(C4305k c4305k) {
            this();
        }
    }

    static {
        lvui<x2> toqVar;
        try {
            new n7h();
            toqVar = new C4305k();
        } catch (Throwable unused) {
            toqVar = new toq();
        }
        f25921k = toqVar;
    }

    qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static x2 m15524k() {
        return f25921k.get();
    }
}

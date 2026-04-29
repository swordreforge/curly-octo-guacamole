package com.google.common.hash;

import com.google.common.base.lvui;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LongAddables.java */
/* JADX INFO: loaded from: classes2.dex */
final class ni7 {

    /* JADX INFO: renamed from: k */
    private static final lvui<zurt> f27019k;

    /* JADX INFO: renamed from: com.google.common.hash.ni7$k */
    /* JADX INFO: compiled from: LongAddables.java */
    static class C4669k implements lvui<zurt> {
        C4669k() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public zurt get() {
            return new fu4();
        }
    }

    /* JADX INFO: compiled from: LongAddables.java */
    static class toq implements lvui<zurt> {
        toq() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public zurt get() {
            return new zy(null);
        }
    }

    /* JADX INFO: compiled from: LongAddables.java */
    private static final class zy extends AtomicLong implements zurt {
        private zy() {
        }

        @Override // com.google.common.hash.zurt
        public void add(long j2) {
            getAndAdd(j2);
        }

        @Override // com.google.common.hash.zurt
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.zurt
        public long sum() {
            return get();
        }

        /* synthetic */ zy(C4669k c4669k) {
            this();
        }
    }

    static {
        lvui<zurt> toqVar;
        try {
            new fu4();
            toqVar = new C4669k();
        } catch (Throwable unused) {
            toqVar = new toq();
        }
        f27019k = toqVar;
    }

    ni7() {
    }

    /* JADX INFO: renamed from: k */
    public static zurt m16357k() {
        return f27019k.get();
    }
}

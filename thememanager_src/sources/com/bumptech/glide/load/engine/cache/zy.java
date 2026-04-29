package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy {

    /* JADX INFO: renamed from: k */
    private final Map<String, C3025k> f18323k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final toq f62749toq = new toq();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.zy$k */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    private static class C3025k {

        /* JADX INFO: renamed from: k */
        final Lock f18324k = new ReentrantLock();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f62750toq;

        C3025k() {
        }
    }

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    private static class toq {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f62751toq = 10;

        /* JADX INFO: renamed from: k */
        private final Queue<C3025k> f18325k = new ArrayDeque();

        toq() {
        }

        /* JADX INFO: renamed from: k */
        C3025k m10736k() {
            C3025k c3025kPoll;
            synchronized (this.f18325k) {
                c3025kPoll = this.f18325k.poll();
            }
            return c3025kPoll == null ? new C3025k() : c3025kPoll;
        }

        void toq(C3025k c3025k) {
            synchronized (this.f18325k) {
                if (this.f18325k.size() < 10) {
                    this.f18325k.offer(c3025k);
                }
            }
        }
    }

    zy() {
    }

    /* JADX INFO: renamed from: k */
    void m10735k(String str) {
        C3025k c3025kM10736k;
        synchronized (this) {
            c3025kM10736k = this.f18323k.get(str);
            if (c3025kM10736k == null) {
                c3025kM10736k = this.f62749toq.m10736k();
                this.f18323k.put(str, c3025kM10736k);
            }
            c3025kM10736k.f62750toq++;
        }
        c3025kM10736k.f18324k.lock();
    }

    void toq(String str) {
        C3025k c3025k;
        synchronized (this) {
            c3025k = (C3025k) com.bumptech.glide.util.qrj.m11262q(this.f18323k.get(str));
            int i2 = c3025k.f62750toq;
            if (i2 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c3025k.f62750toq);
            }
            int i3 = i2 - 1;
            c3025k.f62750toq = i3;
            if (i3 == 0) {
                C3025k c3025kRemove = this.f18323k.remove(str);
                if (!c3025kRemove.equals(c3025k)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c3025k + ", but actually removed: " + c3025kRemove + ", safeKey: " + str);
                }
                this.f62749toq.toq(c3025kRemove);
            }
        }
        c3025k.f18324k.unlock();
    }
}

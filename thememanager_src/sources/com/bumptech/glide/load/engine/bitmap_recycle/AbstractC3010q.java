package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.qrj;
import java.util.Queue;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.q */
/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3010q<T extends qrj> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f62723toq = 20;

    /* JADX INFO: renamed from: k */
    private final Queue<T> f18283k = com.bumptech.glide.util.kja0.m11225g(20);

    AbstractC3010q() {
    }

    /* JADX INFO: renamed from: k */
    abstract T mo10676k();

    T toq() {
        T tPoll = this.f18283k.poll();
        return tPoll == null ? (T) mo10676k() : tPoll;
    }

    public void zy(T t2) {
        if (this.f18283k.size() < 20) {
            this.f18283k.offer(t2);
        }
    }
}

package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: ForwardingLock.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class lvui implements Lock {
    lvui() {
    }

    /* JADX INFO: renamed from: k */
    abstract Lock mo16977k();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        mo16977k().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
        mo16977k().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return mo16977k().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return mo16977k().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        mo16977k().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo16977k().tryLock(j2, timeUnit);
    }
}

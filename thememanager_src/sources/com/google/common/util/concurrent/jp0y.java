package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: ForwardingCondition.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class jp0y implements Condition {
    jp0y() {
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        mo16966k().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j2) throws InterruptedException {
        return mo16966k().awaitNanos(j2);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        mo16966k().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return mo16966k().awaitUntil(date);
    }

    /* JADX INFO: renamed from: k */
    abstract Condition mo16966k();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        mo16966k().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        mo16966k().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo16966k().await(j2, timeUnit);
    }
}

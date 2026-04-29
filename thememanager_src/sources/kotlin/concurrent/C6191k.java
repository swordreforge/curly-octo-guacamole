package kotlin.concurrent;

import cyoe.InterfaceC5981k;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;

/* JADX INFO: renamed from: kotlin.concurrent.k */
/* JADX INFO: compiled from: Locks.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
@InterfaceC6769y(name = "LocksKt")
public final class C6191k {
    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final <T> T m22723k(ReentrantReadWriteLock reentrantReadWriteLock, InterfaceC5981k<? extends T> action) {
        d2ok.m23075h(reentrantReadWriteLock, "<this>");
        d2ok.m23075h(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return action.invoke();
        } finally {
            d3.m23090q(1);
            lock.unlock();
            d3.zy(1);
        }
    }

    @InterfaceC6234g
    private static final <T> T toq(Lock lock, InterfaceC5981k<? extends T> action) {
        d2ok.m23075h(lock, "<this>");
        d2ok.m23075h(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            d3.m23090q(1);
            lock.unlock();
            d3.zy(1);
        }
    }

    @InterfaceC6234g
    private static final <T> T zy(ReentrantReadWriteLock reentrantReadWriteLock, InterfaceC5981k<? extends T> action) {
        d2ok.m23075h(reentrantReadWriteLock, "<this>");
        d2ok.m23075h(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            d3.m23090q(1);
            while (i2 < readHoldCount) {
                lock.lock();
                i2++;
            }
            writeLock.unlock();
            d3.zy(1);
        }
    }
}

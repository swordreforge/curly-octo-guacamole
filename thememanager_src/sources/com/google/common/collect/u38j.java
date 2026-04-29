package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Queues.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class u38j {
    private u38j() {
    }

    public static <E extends Comparable> PriorityQueue<E> cdj(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<>(mcp.toq(iterable));
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        nsb.m15905k(priorityQueue, iterable);
        return priorityQueue;
    }

    @wlev.zy
    public static <E> ConcurrentLinkedQueue<E> f7l8(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<>(mcp.toq(iterable));
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        nsb.m15905k(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static <E> ConcurrentLinkedQueue<E> m15987g() {
        return new ConcurrentLinkedQueue<>();
    }

    /* JADX INFO: renamed from: h */
    public static <E extends Comparable> PriorityQueue<E> m15988h() {
        return new PriorityQueue<>();
    }

    /* JADX INFO: renamed from: i */
    public static <E> Queue<E> m15989i(Queue<E> queue) {
        return exv8.m15668i(queue, null);
    }

    @InterfaceC7731k
    @wlev.zy
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public static <E> int m15990k(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i2, long j2, TimeUnit timeUnit) throws InterruptedException {
        com.google.common.base.jk.a9(collection);
        long jNanoTime = System.nanoTime() + timeUnit.toNanos(j2);
        int iDrainTo = 0;
        while (iDrainTo < i2) {
            iDrainTo += blockingQueue.drainTo(collection, i2 - iDrainTo);
            if (iDrainTo < i2) {
                E ePoll = blockingQueue.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (ePoll == null) {
                    break;
                }
                collection.add(ePoll);
                iDrainTo++;
            }
        }
        return iDrainTo;
    }

    @wlev.zy
    public static <E> SynchronousQueue<E> ki() {
        return new SynchronousQueue<>();
    }

    @wlev.zy
    public static <E extends Comparable> PriorityBlockingQueue<E> kja0(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<>(mcp.toq(iterable));
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        nsb.m15905k(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    @wlev.zy
    public static <E> LinkedBlockingQueue<E> ld6() {
        return new LinkedBlockingQueue<>();
    }

    /* JADX INFO: renamed from: n */
    public static <E> ArrayDeque<E> m15991n(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<>(mcp.toq(iterable));
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        nsb.m15905k(arrayDeque, iterable);
        return arrayDeque;
    }

    @wlev.zy
    public static <E extends Comparable> PriorityBlockingQueue<E> n7h() {
        return new PriorityBlockingQueue<>();
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static <E> LinkedBlockingDeque<E> m15992p(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque<>(mcp.toq(iterable));
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        nsb.m15905k(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    /* JADX INFO: renamed from: q */
    public static <E> ArrayDeque<E> m15993q() {
        return new ArrayDeque<>();
    }

    @wlev.zy
    public static <E> LinkedBlockingQueue<E> qrj(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<>(mcp.toq(iterable));
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        nsb.m15905k(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    @wlev.zy
    /* JADX INFO: renamed from: s */
    public static <E> LinkedBlockingDeque<E> m15994s(int i2) {
        return new LinkedBlockingDeque<>(i2);
    }

    public static <E> Deque<E> t8r(Deque<E> deque) {
        return exv8.m15673s(deque, null);
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    @wlev.zy
    public static <E> int toq(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i2, long j2, TimeUnit timeUnit) {
        E ePoll;
        com.google.common.base.jk.a9(collection);
        long jNanoTime = System.nanoTime() + timeUnit.toNanos(j2);
        int iDrainTo = 0;
        boolean z2 = false;
        while (iDrainTo < i2) {
            try {
                iDrainTo += blockingQueue.drainTo(collection, i2 - iDrainTo);
                if (iDrainTo < i2) {
                    while (true) {
                        try {
                            ePoll = blockingQueue.poll(jNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z2 = true;
                        }
                    }
                    if (ePoll == null) {
                        break;
                    }
                    collection.add(ePoll);
                    iDrainTo++;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return iDrainTo;
    }

    @wlev.zy
    public static <E> LinkedBlockingQueue<E> x2(int i2) {
        return new LinkedBlockingQueue<>(i2);
    }

    @wlev.zy
    /* JADX INFO: renamed from: y */
    public static <E> LinkedBlockingDeque<E> m15995y() {
        return new LinkedBlockingDeque<>();
    }

    @wlev.zy
    public static <E> ArrayBlockingQueue<E> zy(int i2) {
        return new ArrayBlockingQueue<>(i2);
    }
}

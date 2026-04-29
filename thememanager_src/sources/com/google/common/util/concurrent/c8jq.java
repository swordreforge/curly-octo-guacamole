package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: Uninterruptibles.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
public final class c8jq {
    private c8jq() {
    }

    @wlev.zy
    public static void f7l8(Thread thread, long j2, TimeUnit timeUnit) {
        com.google.common.base.jk.a9(thread);
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: g */
    public static void m16891g(Thread thread) {
        boolean z2 = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: k */
    public static void m16892k(CountDownLatch countDownLatch) {
        boolean z2 = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    @wlev.zy
    public static boolean ld6(Semaphore semaphore, int i2, long j2, TimeUnit timeUnit) {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return semaphore.tryAcquire(i2, nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @CanIgnoreReturnValue
    @wlev.zy
    /* JADX INFO: renamed from: n */
    public static <V> V m16893n(Future<V> future, long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return future.get(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public static <E> E m16894p(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z2 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    public static <V> V m16895q(Future<V> future) throws ExecutionException {
        V v2;
        boolean z2 = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    @wlev.zy
    /* JADX INFO: renamed from: s */
    public static void m16896s(long j2, TimeUnit timeUnit) {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @CanIgnoreReturnValue
    @wlev.zy
    public static boolean toq(CountDownLatch countDownLatch, long j2, TimeUnit timeUnit) {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @wlev.zy
    public static boolean x2(Semaphore semaphore, long j2, TimeUnit timeUnit) {
        return ld6(semaphore, 1, j2, timeUnit);
    }

    @wlev.zy
    /* JADX INFO: renamed from: y */
    public static <E> void m16897y(BlockingQueue<E> blockingQueue, E e2) {
        boolean z2 = false;
        while (true) {
            try {
                blockingQueue.put(e2);
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    @wlev.zy
    public static boolean zy(Condition condition, long j2, TimeUnit timeUnit) {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return condition.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: ThreadFactoryBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@wlev.zy
public final class ch {

    /* JADX INFO: renamed from: k */
    private String f27391k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Boolean f68624toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Integer f68625zy = null;

    /* JADX INFO: renamed from: q */
    private Thread.UncaughtExceptionHandler f27393q = null;

    /* JADX INFO: renamed from: n */
    private ThreadFactory f27392n = null;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ch$k */
    /* JADX INFO: compiled from: ThreadFactoryBuilder.java */
    static class ThreadFactoryC4794k implements ThreadFactory {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Thread.UncaughtExceptionHandler f27394g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ThreadFactory f27395k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Integer f27396n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Boolean f27397q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68626toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ AtomicLong f68627zy;

        ThreadFactoryC4794k(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f27395k = threadFactory;
            this.f68626toq = str;
            this.f68627zy = atomicLong;
            this.f27397q = bool;
            this.f27396n = num;
            this.f27394g = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f27395k.newThread(runnable);
            String str = this.f68626toq;
            if (str != null) {
                threadNewThread.setName(ch.m16901q(str, Long.valueOf(this.f68627zy.getAndIncrement())));
            }
            Boolean bool = this.f27397q;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f27396n;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27394g;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m16901q(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    private static ThreadFactory zy(ch chVar) {
        String str = chVar.f27391k;
        Boolean bool = chVar.f68624toq;
        Integer num = chVar.f68625zy;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = chVar.f27393q;
        ThreadFactory threadFactoryDefaultThreadFactory = chVar.f27392n;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new ThreadFactoryC4794k(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public ch f7l8(int i2) {
        com.google.common.base.jk.qrj(i2 >= 1, "Thread priority (%s) must be >= %s", i2, 1);
        com.google.common.base.jk.qrj(i2 <= 10, "Thread priority (%s) must be <= %s", i2, 10);
        this.f68625zy = Integer.valueOf(i2);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ch m16902g(String str) {
        m16901q(str, 0);
        this.f27391k = str;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ch m16903n(boolean z2) {
        this.f68624toq = Boolean.valueOf(z2);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public ch m16904s(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f27393q = (Thread.UncaughtExceptionHandler) com.google.common.base.jk.a9(uncaughtExceptionHandler);
        return this;
    }

    @CheckReturnValue
    public ThreadFactory toq() {
        return zy(this);
    }

    /* JADX INFO: renamed from: y */
    public ch m16905y(ThreadFactory threadFactory) {
        this.f27392n = (ThreadFactory) com.google.common.base.jk.a9(threadFactory);
        return this;
    }
}

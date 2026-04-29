package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.util.concurrent.u */
/* JADX INFO: compiled from: UncaughtExceptionHandlers.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public final class C4844u {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.u$k */
    /* JADX INFO: compiled from: UncaughtExceptionHandlers.java */
    @InterfaceC7732q
    static final class k implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final Logger f68669toq = Logger.getLogger(k.class.getName());

        /* JADX INFO: renamed from: k */
        private final Runtime f27549k;

        k(Runtime runtime) {
            this.f27549k = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                f68669toq.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    private C4844u() {
    }

    /* JADX INFO: renamed from: k */
    public static Thread.UncaughtExceptionHandler m17018k() {
        return new k(Runtime.getRuntime());
    }
}

package com.android.thememanager.datacenter;

import com.android.thememanager.datacenter.C1968k;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import p037u.InterfaceC7678k;

/* JADX INFO: compiled from: AsyncOperationExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements Runnable {

    /* JADX INFO: renamed from: p */
    private InterfaceC7678k f11159p;

    /* JADX INFO: renamed from: n */
    private long f11158n = 0;

    /* JADX INFO: renamed from: g */
    private long f11156g = 0;

    /* JADX INFO: renamed from: y */
    private int f11162y = 0;

    /* JADX INFO: renamed from: s */
    private boolean f11161s = false;

    /* JADX INFO: renamed from: k */
    private BlockingQueue<C1968k> f11157k = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: q */
    private ExecutorService f11160q = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: com.android.thememanager.datacenter.toq$k */
    /* JADX INFO: compiled from: AsyncOperationExecutor.java */
    static /* synthetic */ class C1971k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f11163k;

        static {
            int[] iArr = new int[C1968k.k.values().length];
            f11163k = iArr;
            try {
                iArr[C1968k.k.Insert.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11163k[C1968k.k.DeleteList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11163k[C1968k.k.Query.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public toq(InterfaceC7678k listener) {
        this.f11159p = listener;
    }

    /* JADX INFO: renamed from: k */
    public void m7726k(C1968k operation) {
        synchronized (this) {
            int i2 = this.f11162y + 1;
            this.f11162y = i2;
            operation.m7721s(i2);
            this.f11157k.add(operation);
            this.f11158n++;
            if (!this.f11161s) {
                this.f11161s = true;
                this.f11160q.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            C1968k c1968kPoll = this.f11157k.poll();
            if (c1968kPoll == null) {
                synchronized (this) {
                    if (this.f11157k.poll() == null) {
                        this.f11161s = false;
                        return;
                    }
                }
            } else {
                int i2 = C1971k.f11163k[c1968kPoll.m7718n().ordinal()];
                if (i2 == 1) {
                    c1968kPoll.m7722y(Long.valueOf(c1968kPoll.m7717k().toq(c1968kPoll.toq())));
                } else if (i2 == 2) {
                    c1968kPoll.m7722y(Integer.valueOf(c1968kPoll.m7717k().zy((Collection) c1968kPoll.toq())));
                } else if (i2 == 3) {
                    c1968kPoll.m7722y(c1968kPoll.m7717k().mo28029k(((Long) c1968kPoll.toq()).longValue()));
                }
                this.f11156g++;
                this.f11159p.mo7736k(c1968kPoll);
            }
        }
    }

    public synchronized boolean toq() {
        return this.f11156g == this.f11158n;
    }
}

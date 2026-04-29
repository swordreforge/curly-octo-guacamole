package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.engine.cdj;
import com.bumptech.glide.request.target.InterfaceC3175h;
import com.bumptech.glide.request.transition.InterfaceC3185g;
import com.bumptech.glide.util.kja0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zy.dd;
import zy.lvui;
import zy.o1t;
import zy.yz;

/* JADX INFO: compiled from: RequestFutureTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8<R> implements InterfaceFutureC3172q<R>, InterfaceC3194y<R> {

    /* JADX INFO: renamed from: t */
    private static final C3166k f18942t = new C3166k();

    /* JADX INFO: renamed from: g */
    private final C3166k f18943g;

    /* JADX INFO: renamed from: h */
    @o1t("this")
    private boolean f18944h;

    /* JADX INFO: renamed from: i */
    @o1t("this")
    private boolean f18945i;

    /* JADX INFO: renamed from: k */
    private final int f18946k;

    /* JADX INFO: renamed from: n */
    private final boolean f18947n;

    /* JADX INFO: renamed from: p */
    @o1t("this")
    private boolean f18948p;

    /* JADX INFO: renamed from: q */
    private final int f18949q;

    /* JADX INFO: renamed from: s */
    @o1t("this")
    @dd
    private InterfaceC3170n f18950s;

    /* JADX INFO: renamed from: y */
    @o1t("this")
    @dd
    private R f18951y;

    /* JADX INFO: renamed from: z */
    @o1t("this")
    @dd
    private cdj f18952z;

    /* JADX INFO: renamed from: com.bumptech.glide.request.f7l8$k */
    /* JADX INFO: compiled from: RequestFutureTarget.java */
    @yz
    static class C3166k {
        C3166k() {
        }

        /* JADX INFO: renamed from: k */
        void m11149k(Object obj) {
            obj.notifyAll();
        }

        void toq(Object obj, long j2) throws InterruptedException {
            obj.wait(j2);
        }
    }

    public f7l8(int i2, int i3) {
        this(i2, i3, true, f18942t);
    }

    /* JADX INFO: renamed from: g */
    private synchronized R m11148g(Long l2) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f18947n && !isDone()) {
            kja0.m11228k();
        }
        if (this.f18948p) {
            throw new CancellationException();
        }
        if (this.f18945i) {
            throw new ExecutionException(this.f18952z);
        }
        if (this.f18944h) {
            return this.f18951y;
        }
        if (l2 == null) {
            this.f18943g.toq(this, 0L);
        } else if (l2.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l2.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                this.f18943g.toq(this, jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f18945i) {
            throw new ExecutionException(this.f18952z);
        }
        if (this.f18948p) {
            throw new CancellationException();
        }
        if (!this.f18944h) {
            throw new TimeoutException();
        }
        return this.f18951y;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f18948p = true;
            this.f18943g.m11149k(this);
            InterfaceC3170n interfaceC3170n = null;
            if (z2) {
                InterfaceC3170n interfaceC3170n2 = this.f18950s;
                this.f18950s = null;
                interfaceC3170n = interfaceC3170n2;
            }
            if (interfaceC3170n != null) {
                interfaceC3170n.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return m11148g(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: h */
    public synchronized void mo6802h(@dd Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f18948p;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f18948p     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.f18944h     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.f18945i     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.f7l8.isDone():boolean");
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public synchronized void kja0(@dd InterfaceC3170n interfaceC3170n) {
        this.f18950s = interfaceC3170n;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    @dd
    public synchronized InterfaceC3170n ld6() {
        return this.f18950s;
    }

    @Override // com.bumptech.glide.request.InterfaceC3194y
    /* JADX INFO: renamed from: n */
    public synchronized boolean mo6804n(R r2, Object obj, InterfaceC3175h<R> interfaceC3175h, EnumC3050k enumC3050k, boolean z2) {
        this.f18944h = true;
        this.f18951y = r2;
        this.f18943g.m11149k(this);
        return false;
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: p */
    public void mo6797p(@dd Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.InterfaceC3194y
    /* JADX INFO: renamed from: q */
    public synchronized boolean mo6805q(@dd cdj cdjVar, Object obj, InterfaceC3175h<R> interfaceC3175h, boolean z2) {
        this.f18945i = true;
        this.f18952z = cdjVar;
        this.f18943g.m11149k(this);
        return false;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public synchronized void qrj(@lvui R r2, @dd InterfaceC3185g<? super R> interfaceC3185g) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void t8r(@lvui com.bumptech.glide.request.target.kja0 kja0Var) {
        kja0Var.mo11172q(this.f18946k, this.f18949q);
    }

    public String toString() {
        InterfaceC3170n interfaceC3170n;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            interfaceC3170n = null;
            if (this.f18948p) {
                str = "CANCELLED";
            } else if (this.f18945i) {
                str = "FAILURE";
            } else if (this.f18944h) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                interfaceC3170n = this.f18950s;
            }
        }
        if (interfaceC3170n == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + interfaceC3170n + "]]";
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void toq(@lvui com.bumptech.glide.request.target.kja0 kja0Var) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void x2(@dd Drawable drawable) {
    }

    f7l8(int i2, int i3, boolean z2, C3166k c3166k) {
        this.f18946k = i2;
        this.f18949q = i3;
        this.f18947n = z2;
        this.f18943g = c3166k;
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, @lvui TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m11148g(Long.valueOf(timeUnit.toMillis(j2)));
    }
}

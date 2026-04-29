package okhttp3.internal.connection;

import b7.C1359g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7514k;
import okhttp3.gvn7;
import okhttp3.internal.concurrent.AbstractC7444k;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.connection.C7450n;
import okhttp3.internal.platform.C7498p;
import okhttp3.ld6;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class f7l8 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C7447k f43060g = new C7447k(null);

    /* JADX INFO: renamed from: k */
    private final int f43061k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final ConcurrentLinkedQueue<C7448g> f43062n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final toq f43063q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f93866toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final okhttp3.internal.concurrent.zy f93867zy;

    /* JADX INFO: renamed from: okhttp3.internal.connection.f7l8$k */
    /* JADX INFO: compiled from: RealConnectionPool.kt */
    public static final class C7447k {
        private C7447k() {
        }

        public /* synthetic */ C7447k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final f7l8 m27014k(@InterfaceC7396q ld6 connectionPool) {
            d2ok.m23075h(connectionPool, "connectionPool");
            return connectionPool.zy();
        }
    }

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    public static final class toq extends AbstractC7444k {
        toq(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            return f7l8.this.toq(System.nanoTime());
        }
    }

    public f7l8(@InterfaceC7396q C7445q taskRunner, int i2, long j2, @InterfaceC7396q TimeUnit timeUnit) {
        d2ok.m23075h(taskRunner, "taskRunner");
        d2ok.m23075h(timeUnit, "timeUnit");
        this.f43061k = i2;
        this.f93866toq = timeUnit.toNanos(j2);
        this.f93867zy = taskRunner.m26989p();
        this.f43063q = new toq(C1359g.f7244s + " ConnectionPool");
        this.f43062n = new ConcurrentLinkedQueue<>();
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j2).toString());
    }

    private final int f7l8(C7448g c7448g, long j2) {
        if (C1359g.f7245y && !Thread.holdsLock(c7448g)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c7448g);
        }
        List<Reference<C7450n>> listT8r = c7448g.t8r();
        int i2 = 0;
        while (i2 < listT8r.size()) {
            Reference<C7450n> reference = listT8r.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                d2ok.n7h(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                C7498p.f43366k.f7l8().kja0("A connection to " + c7448g.toq().m26913q().ni7() + " was leaked. Did you forget to close a response body?", ((C7450n.toq) reference).m27041k());
                listT8r.remove(i2);
                c7448g.gvn7(true);
                if (listT8r.isEmpty()) {
                    c7448g.jp0y(j2 - this.f93866toq);
                    return 0;
                }
            }
        }
        return listT8r.size();
    }

    /* JADX INFO: renamed from: g */
    public final int m27009g() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<C7448g> concurrentLinkedQueue = this.f43062n;
        int i2 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (C7448g it : concurrentLinkedQueue) {
                d2ok.kja0(it, "it");
                synchronized (it) {
                    zIsEmpty = it.t8r().isEmpty();
                }
                if (zIsEmpty && (i2 = i2 + 1) < 0) {
                    kotlin.collections.ni7.m22563c();
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m27010k(@InterfaceC7396q C7514k address, @InterfaceC7396q C7450n call, @InterfaceC7395n List<gvn7> list, boolean z2) {
        d2ok.m23075h(address, "address");
        d2ok.m23075h(call, "call");
        for (C7448g connection : this.f43062n) {
            d2ok.kja0(connection, "connection");
            synchronized (connection) {
                if (z2) {
                    if (connection.wvg()) {
                    }
                    was wasVar = was.f36763k;
                }
                if (connection.m27025z(address, list)) {
                    call.m27033n(connection);
                    return true;
                }
                was wasVar2 = was.f36763k;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m27011n() {
        Socket socketMo27022q;
        Iterator<C7448g> it = this.f43062n.iterator();
        d2ok.kja0(it, "connections.iterator()");
        while (it.hasNext()) {
            C7448g connection = it.next();
            d2ok.kja0(connection, "connection");
            synchronized (connection) {
                if (connection.t8r().isEmpty()) {
                    it.remove();
                    connection.gvn7(true);
                    socketMo27022q = connection.mo27022q();
                } else {
                    socketMo27022q = null;
                }
            }
            if (socketMo27022q != null) {
                C1359g.cdj(socketMo27022q);
            }
        }
        if (this.f43062n.isEmpty()) {
            this.f93867zy.m27003k();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m27012q() {
        return this.f43062n.size();
    }

    public final long toq(long j2) {
        int i2 = 0;
        long j3 = Long.MIN_VALUE;
        C7448g c7448g = null;
        int i3 = 0;
        for (C7448g connection : this.f43062n) {
            d2ok.kja0(connection, "connection");
            synchronized (connection) {
                if (f7l8(connection, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long jFn3e = j2 - connection.fn3e();
                    if (jFn3e > j3) {
                        c7448g = connection;
                        j3 = jFn3e;
                    }
                    was wasVar = was.f36763k;
                }
            }
        }
        long j4 = this.f93866toq;
        if (j3 < j4 && i2 <= this.f43061k) {
            if (i2 > 0) {
                return j4 - j3;
            }
            if (i3 > 0) {
                return j4;
            }
            return -1L;
        }
        d2ok.qrj(c7448g);
        synchronized (c7448g) {
            if (!c7448g.t8r().isEmpty()) {
                return 0L;
            }
            if (c7448g.fn3e() + j3 != j2) {
                return 0L;
            }
            c7448g.gvn7(true);
            this.f43062n.remove(c7448g);
            C1359g.cdj(c7448g.mo27022q());
            if (this.f43062n.isEmpty()) {
                this.f93867zy.m27003k();
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m27013y(@InterfaceC7396q C7448g connection) {
        d2ok.m23075h(connection, "connection");
        if (!C1359g.f7245y || Thread.holdsLock(connection)) {
            this.f43062n.add(connection);
            okhttp3.internal.concurrent.zy.m26999h(this.f93867zy, this.f43063q, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final boolean zy(@InterfaceC7396q C7448g connection) {
        d2ok.m23075h(connection, "connection");
        if (C1359g.f7245y && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.zurt() && this.f43061k != 0) {
            okhttp3.internal.concurrent.zy.m26999h(this.f93867zy, this.f43063q, 0L, 2, null);
            return false;
        }
        connection.gvn7(true);
        this.f43062n.remove(connection);
        if (!this.f43062n.isEmpty()) {
            return true;
        }
        this.f93867zy.m27003k();
        return true;
    }
}

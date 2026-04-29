package okhttp3.internal.concurrent;

import b7.C1359g;
import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.collections.a9;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class zy {

    /* JADX INFO: renamed from: g */
    private boolean f43053g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final C7445q f43054k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final List<AbstractC7444k> f43055n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private AbstractC7444k f43056q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final String f93864toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f93865zy;

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.zy$k */
    /* JADX INFO: compiled from: TaskQueue.kt */
    private static final class C7446k extends AbstractC7444k {

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final CountDownLatch f43057n;

        public C7446k() {
            super(C1359g.f7244s + " awaitIdle", false);
            this.f43057n = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            this.f43057n.countDown();
            return -1L;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final CountDownLatch m27008s() {
            return this.f43057n;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
    public static final class toq extends AbstractC7444k {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC5981k<was> f43058n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(String str, boolean z2, InterfaceC5981k<was> interfaceC5981k) {
            super(str, z2);
            this.f43058n = interfaceC5981k;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            this.f43058n.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @lv5({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
    public static final class C8122zy extends AbstractC7444k {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC5981k<Long> f43059n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8122zy(String str, InterfaceC5981k<Long> interfaceC5981k) {
            super(str, false, 2, null);
            this.f43059n = interfaceC5981k;
        }

        @Override // okhttp3.internal.concurrent.AbstractC7444k
        /* JADX INFO: renamed from: g */
        public long mo26947g() {
            return this.f43059n.invoke().longValue();
        }
    }

    public zy(@InterfaceC7396q C7445q taskRunner, @InterfaceC7396q String name) {
        d2ok.m23075h(taskRunner, "taskRunner");
        d2ok.m23075h(name, "name");
        this.f43054k = taskRunner;
        this.f93864toq = name;
        this.f43055n = new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m26999h(zy zyVar, AbstractC7444k abstractC7444k, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        zyVar.n7h(abstractC7444k, j2);
    }

    public static /* synthetic */ void kja0(zy zyVar, String name, long j2, InterfaceC5981k block, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        d2ok.m23075h(name, "name");
        d2ok.m23075h(block, "block");
        zyVar.n7h(new C8122zy(name, block), j2);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m27000q(zy zyVar, String name, long j2, boolean z2, InterfaceC5981k block, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        d2ok.m23075h(name, "name");
        d2ok.m23075h(block, "block");
        zyVar.n7h(new toq(name, z2, block), j2);
    }

    public final boolean cdj(@InterfaceC7396q AbstractC7444k task, long j2, boolean z2) {
        String str;
        d2ok.m23075h(task, "task");
        task.m26982n(this);
        long jMo26993q = this.f43054k.m26991y().mo26993q();
        long j3 = jMo26993q + j2;
        int iIndexOf = this.f43055n.indexOf(task);
        if (iIndexOf != -1) {
            if (task.zy() <= j3) {
                if (C7445q.f43046y.m26994k().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.toq.zy(task, this, "already scheduled");
                }
                return false;
            }
            this.f43055n.remove(iIndexOf);
        }
        task.f7l8(j3);
        if (C7445q.f43046y.m26994k().isLoggable(Level.FINE)) {
            if (z2) {
                str = "run again after " + okhttp3.internal.concurrent.toq.toq(j3 - jMo26993q);
            } else {
                str = "scheduled after " + okhttp3.internal.concurrent.toq.toq(j3 - jMo26993q);
            }
            okhttp3.internal.concurrent.toq.zy(task, this, str);
        }
        Iterator<AbstractC7444k> it = this.f43055n.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().zy() - jMo26993q > j2) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f43055n.size();
        }
        this.f43055n.add(size, task);
        return size == 0;
    }

    @InterfaceC7396q
    public final List<AbstractC7444k> f7l8() {
        return this.f43055n;
    }

    public final void fn3e() {
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f43054k) {
            this.f93865zy = true;
            if (toq()) {
                this.f43054k.m26990s(this);
            }
            was wasVar = was.f36763k;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27001g() {
        return this.f43053g;
    }

    /* JADX INFO: renamed from: i */
    public final void m27002i(boolean z2) {
        this.f93865zy = z2;
    }

    /* JADX INFO: renamed from: k */
    public final void m27003k() {
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f43054k) {
            if (toq()) {
                this.f43054k.m26990s(this);
            }
            was wasVar = was.f36763k;
        }
    }

    public final void ki(@InterfaceC7395n AbstractC7444k abstractC7444k) {
        this.f43056q = abstractC7444k;
    }

    @InterfaceC7396q
    public final C7445q ld6() {
        return this.f43054k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final AbstractC7444k m27004n() {
        return this.f43056q;
    }

    public final void n7h(@InterfaceC7396q AbstractC7444k task, long j2) {
        d2ok.m23075h(task, "task");
        synchronized (this.f43054k) {
            if (!this.f93865zy) {
                if (cdj(task, j2, false)) {
                    this.f43054k.m26990s(this);
                }
                was wasVar = was.f36763k;
            } else if (task.m26981k()) {
                if (C7445q.f43046y.m26994k().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.toq.zy(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C7445q.f43046y.m26994k().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.toq.zy(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m27005p() {
        return this.f93865zy;
    }

    public final void qrj(@InterfaceC7396q String name, long j2, @InterfaceC7396q InterfaceC5981k<Long> block) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(block, "block");
        n7h(new C8122zy(name, block), j2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final List<AbstractC7444k> m27006s() {
        List<AbstractC7444k> listWr;
        synchronized (this.f43054k) {
            listWr = a9.wr(this.f43055n);
        }
        return listWr;
    }

    public final void t8r(boolean z2) {
        this.f43053g = z2;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f93864toq;
    }

    public final boolean toq() {
        AbstractC7444k abstractC7444k = this.f43056q;
        if (abstractC7444k != null) {
            d2ok.qrj(abstractC7444k);
            if (abstractC7444k.m26981k()) {
                this.f43053g = true;
            }
        }
        boolean z2 = false;
        for (int size = this.f43055n.size() - 1; -1 < size; size--) {
            if (this.f43055n.get(size).m26981k()) {
                AbstractC7444k abstractC7444k2 = this.f43055n.get(size);
                if (C7445q.f43046y.m26994k().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.toq.zy(abstractC7444k2, this, "canceled");
                }
                this.f43055n.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    @InterfaceC7396q
    public final CountDownLatch x2() {
        synchronized (this.f43054k) {
            if (this.f43056q == null && this.f43055n.isEmpty()) {
                return new CountDownLatch(0);
            }
            AbstractC7444k abstractC7444k = this.f43056q;
            if (abstractC7444k instanceof C7446k) {
                return ((C7446k) abstractC7444k).m27008s();
            }
            for (AbstractC7444k abstractC7444k2 : this.f43055n) {
                if (abstractC7444k2 instanceof C7446k) {
                    return ((C7446k) abstractC7444k2).m27008s();
                }
            }
            C7446k c7446k = new C7446k();
            if (cdj(c7446k, 0L, false)) {
                this.f43054k.m26990s(this);
            }
            return c7446k.m27008s();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final String m27007y() {
        return this.f93864toq;
    }

    public final void zy(@InterfaceC7396q String name, long j2, boolean z2, @InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(block, "block");
        n7h(new toq(name, z2, block), j2);
    }
}

package okhttp3;

import b7.C1359g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.connection.C7450n;

/* JADX INFO: renamed from: okhttp3.h */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class C7436h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final ArrayDeque<C7450n> f93832f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final ArrayDeque<C7450n.k> f42958g;

    /* JADX INFO: renamed from: k */
    private int f42959k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final ArrayDeque<C7450n.k> f42960n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private ExecutorService f42961q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f93833toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private Runnable f93834zy;

    public C7436h() {
        this.f42959k = 64;
        this.f93833toq = 5;
        this.f42960n = new ArrayDeque<>();
        this.f42958g = new ArrayDeque<>();
        this.f93832f7l8 = new ArrayDeque<>();
    }

    private final <T> void f7l8(Deque<T> deque, T t2) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t2)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f93834zy;
            was wasVar = was.f36763k;
        }
        if (qrj() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: g */
    private final C7450n.k m26914g(String str) {
        for (C7450n.k kVar : this.f42958g) {
            if (d2ok.f7l8(kVar.m27040q(), str)) {
                return kVar;
            }
        }
        for (C7450n.k kVar2 : this.f42960n) {
            if (d2ok.f7l8(kVar2.m27040q(), str)) {
                return kVar2;
            }
        }
        return null;
    }

    private final boolean qrj() {
        int i2;
        boolean z2;
        if (C1359g.f7245y && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C7450n.k> it = this.f42960n.iterator();
            d2ok.kja0(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                C7450n.k asyncCall = it.next();
                if (this.f42958g.size() >= this.f42959k) {
                    break;
                }
                if (asyncCall.zy().get() < this.f93833toq) {
                    it.remove();
                    asyncCall.zy().incrementAndGet();
                    d2ok.kja0(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f42958g.add(asyncCall);
                }
            }
            z2 = cdj() > 0;
            was wasVar = was.f36763k;
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((C7450n.k) arrayList.get(i2)).m27038k(m26918n());
        }
        return z2;
    }

    public final synchronized int cdj() {
        return this.f42958g.size() + this.f93832f7l8.size();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public final synchronized List<InterfaceC7519n> m26915h() {
        List<InterfaceC7519n> listUnmodifiableList;
        ArrayDeque<C7450n> arrayDeque = this.f93832f7l8;
        ArrayDeque<C7450n.k> arrayDeque2 = this.f42958g;
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7450n.k) it.next()).toq());
        }
        listUnmodifiableList = Collections.unmodifiableList(kotlin.collections.a9.l7o(arrayDeque, arrayList));
        d2ok.kja0(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: i */
    public final void m26916i(int i2) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i2).toString());
        }
        synchronized (this) {
            this.f93833toq = i2;
            was wasVar = was.f36763k;
        }
        qrj();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "executorService", imports = {}))
    @InterfaceC6769y(name = "-deprecated_executorService")
    /* JADX INFO: renamed from: k */
    public final ExecutorService m26917k() {
        return m26918n();
    }

    public final synchronized void ki(@InterfaceC7395n Runnable runnable) {
        this.f93834zy = runnable;
    }

    public final synchronized int kja0() {
        return this.f42960n.size();
    }

    public final synchronized int ld6() {
        return this.f42959k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "executorService")
    /* JADX INFO: renamed from: n */
    public final synchronized ExecutorService m26918n() {
        ExecutorService executorService;
        if (this.f42961q == null) {
            this.f42961q = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C1359g.vyq(C1359g.f7244s + " Dispatcher", false));
        }
        executorService = this.f42961q;
        d2ok.qrj(executorService);
        return executorService;
    }

    @InterfaceC7396q
    public final synchronized List<InterfaceC7519n> n7h() {
        List<InterfaceC7519n> listUnmodifiableList;
        ArrayDeque<C7450n.k> arrayDeque = this.f42960n;
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7450n.k) it.next()).toq());
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        d2ok.kja0(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public final synchronized Runnable m26919p() {
        return this.f93834zy;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m26920q(@InterfaceC7396q C7450n call) {
        d2ok.m23075h(call, "call");
        this.f93832f7l8.add(call);
    }

    /* JADX INFO: renamed from: s */
    public final void m26921s(@InterfaceC7396q C7450n call) {
        d2ok.m23075h(call, "call");
        f7l8(this.f93832f7l8, call);
    }

    public final void t8r(int i2) {
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i2).toString());
        }
        synchronized (this) {
            this.f42959k = i2;
            was wasVar = was.f36763k;
        }
        qrj();
    }

    public final synchronized void toq() {
        Iterator<C7450n.k> it = this.f42960n.iterator();
        while (it.hasNext()) {
            it.next().toq().cancel();
        }
        Iterator<C7450n.k> it2 = this.f42958g.iterator();
        while (it2.hasNext()) {
            it2.next().toq().cancel();
        }
        Iterator<C7450n> it3 = this.f93832f7l8.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final synchronized int x2() {
        return this.f93833toq;
    }

    /* JADX INFO: renamed from: y */
    public final void m26922y(@InterfaceC7396q C7450n.k call) {
        d2ok.m23075h(call, "call");
        call.zy().decrementAndGet();
        f7l8(this.f42958g, call);
    }

    public final void zy(@InterfaceC7396q C7450n.k call) {
        C7450n.k kVarM26914g;
        d2ok.m23075h(call, "call");
        synchronized (this) {
            this.f42960n.add(call);
            if (!call.toq().fn3e() && (kVarM26914g = m26914g(call.m27040q())) != null) {
                call.m27037g(kVarM26914g);
            }
            was wasVar = was.f36763k;
        }
        qrj();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7436h(@InterfaceC7396q ExecutorService executorService) {
        this();
        d2ok.m23075h(executorService, "executorService");
        this.f42961q = executorService;
    }
}

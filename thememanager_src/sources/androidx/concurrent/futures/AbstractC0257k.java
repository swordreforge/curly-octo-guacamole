package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC4792c;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.concurrent.futures.k */
/* JADX INFO: compiled from: AbstractResolvableFuture.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC0257k<V> implements InterfaceFutureC4792c<V> {

    /* JADX INFO: renamed from: h */
    private static final Object f1389h;

    /* JADX INFO: renamed from: p */
    static final toq f1390p;

    /* JADX INFO: renamed from: s */
    private static final long f1391s = 1000;

    /* JADX INFO: renamed from: k */
    @dd
    volatile Object f1393k;

    /* JADX INFO: renamed from: n */
    @dd
    volatile s f1394n;

    /* JADX INFO: renamed from: q */
    @dd
    volatile n f1395q;

    /* JADX INFO: renamed from: g */
    static final boolean f1388g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: y */
    private static final Logger f1392y = Logger.getLogger(AbstractC0257k.class.getName());

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$f7l8 */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class f7l8<V> implements Runnable {

        /* JADX INFO: renamed from: k */
        final AbstractC0257k<V> f1396k;

        /* JADX INFO: renamed from: q */
        final InterfaceFutureC4792c<? extends V> f1397q;

        f7l8(AbstractC0257k<V> abstractC0257k, InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
            this.f1396k = abstractC0257k;
            this.f1397q = interfaceFutureC4792c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1396k.f1393k != this) {
                return;
            }
            if (AbstractC0257k.f1390p.toq(this.f1396k, this, AbstractC0257k.ld6(this.f1397q))) {
                AbstractC0257k.m899y(this.f1396k);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$g */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class g extends toq {

        /* JADX INFO: renamed from: k */
        final AtomicReferenceFieldUpdater<s, Thread> f1398k;

        /* JADX INFO: renamed from: n */
        final AtomicReferenceFieldUpdater<AbstractC0257k, Object> f1399n;

        /* JADX INFO: renamed from: q */
        final AtomicReferenceFieldUpdater<AbstractC0257k, n> f1400q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<s, s> f47040toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractC0257k, s> f47041zy;

        g(AtomicReferenceFieldUpdater<s, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<s, s> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0257k, s> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0257k, n> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0257k, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1398k = atomicReferenceFieldUpdater;
            this.f47040toq = atomicReferenceFieldUpdater2;
            this.f47041zy = atomicReferenceFieldUpdater3;
            this.f1400q = atomicReferenceFieldUpdater4;
            this.f1399n = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        /* JADX INFO: renamed from: k */
        boolean mo902k(AbstractC0257k<?> abstractC0257k, n nVar, n nVar2) {
            return androidx.concurrent.futures.toq.m906k(this.f1400q, abstractC0257k, nVar, nVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        /* JADX INFO: renamed from: n */
        void mo903n(s sVar, Thread thread) {
            this.f1398k.lazySet(sVar, thread);
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        /* JADX INFO: renamed from: q */
        void mo904q(s sVar, s sVar2) {
            this.f47040toq.lazySet(sVar, sVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        boolean toq(AbstractC0257k<?> abstractC0257k, Object obj, Object obj2) {
            return androidx.concurrent.futures.toq.m906k(this.f1399n, abstractC0257k, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        boolean zy(AbstractC0257k<?> abstractC0257k, s sVar, s sVar2) {
            return androidx.concurrent.futures.toq.m906k(this.f47041zy, abstractC0257k, sVar, sVar2);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$n */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class n {

        /* JADX INFO: renamed from: q */
        static final n f1401q = new n(null, null);

        /* JADX INFO: renamed from: k */
        final Runnable f1402k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Executor f47042toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        n f47043zy;

        n(Runnable runnable, Executor executor) {
            this.f1402k = runnable;
            this.f47042toq = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$q */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final q f47044toq = new q(new k("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: k */
        final Throwable f1403k;

        /* JADX INFO: renamed from: androidx.concurrent.futures.k$q$k */
        /* JADX INFO: compiled from: AbstractResolvableFuture.java */
        static class k extends Throwable {
            k(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        q(Throwable th) {
            this.f1403k = (Throwable) AbstractC0257k.m895n(th);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$s */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class s {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final s f47045zy = new s(false);

        /* JADX INFO: renamed from: k */
        @dd
        volatile Thread f1404k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        volatile s f47046toq;

        s(boolean z2) {
        }

        /* JADX INFO: renamed from: k */
        void m905k(s sVar) {
            AbstractC0257k.f1390p.mo904q(this, sVar);
        }

        void toq() {
            Thread thread = this.f1404k;
            if (thread != null) {
                this.f1404k = null;
                LockSupport.unpark(thread);
            }
        }

        s() {
            AbstractC0257k.f1390p.mo903n(this, Thread.currentThread());
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$toq */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static abstract class toq {
        private toq() {
        }

        /* JADX INFO: renamed from: k */
        abstract boolean mo902k(AbstractC0257k<?> abstractC0257k, n nVar, n nVar2);

        /* JADX INFO: renamed from: n */
        abstract void mo903n(s sVar, Thread thread);

        /* JADX INFO: renamed from: q */
        abstract void mo904q(s sVar, s sVar2);

        abstract boolean toq(AbstractC0257k<?> abstractC0257k, Object obj, Object obj2);

        abstract boolean zy(AbstractC0257k<?> abstractC0257k, s sVar, s sVar2);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$y */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class y extends toq {
        y() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        /* JADX INFO: renamed from: k */
        boolean mo902k(AbstractC0257k<?> abstractC0257k, n nVar, n nVar2) {
            synchronized (abstractC0257k) {
                if (abstractC0257k.f1395q != nVar) {
                    return false;
                }
                abstractC0257k.f1395q = nVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        /* JADX INFO: renamed from: n */
        void mo903n(s sVar, Thread thread) {
            sVar.f1404k = thread;
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        /* JADX INFO: renamed from: q */
        void mo904q(s sVar, s sVar2) {
            sVar.f47046toq = sVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        boolean toq(AbstractC0257k<?> abstractC0257k, Object obj, Object obj2) {
            synchronized (abstractC0257k) {
                if (abstractC0257k.f1393k != obj) {
                    return false;
                }
                abstractC0257k.f1393k = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0257k.toq
        boolean zy(AbstractC0257k<?> abstractC0257k, s sVar, s sVar2) {
            synchronized (abstractC0257k) {
                if (abstractC0257k.f1394n != sVar) {
                    return false;
                }
                abstractC0257k.f1394n = sVar2;
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.k$zy */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    private static final class zy {

        /* JADX INFO: renamed from: q */
        static final zy f1405q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final zy f47047zy;

        /* JADX INFO: renamed from: k */
        final boolean f1406k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        final Throwable f47048toq;

        static {
            if (AbstractC0257k.f1388g) {
                f1405q = null;
                f47047zy = null;
            } else {
                f1405q = new zy(false, null);
                f47047zy = new zy(true, null);
            }
        }

        zy(boolean z2, @dd Throwable th) {
            this.f1406k = z2;
            this.f47048toq = th;
        }
    }

    static {
        toq yVar;
        try {
            yVar = new g(AtomicReferenceFieldUpdater.newUpdater(s.class, Thread.class, "k"), AtomicReferenceFieldUpdater.newUpdater(s.class, s.class, "toq"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0257k.class, s.class, "n"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0257k.class, n.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0257k.class, Object.class, "k"));
            th = null;
        } catch (Throwable th) {
            th = th;
            yVar = new y();
        }
        f1390p = yVar;
        if (th != null) {
            f1392y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1389h = new Object();
    }

    protected AbstractC0257k() {
    }

    private void cdj() {
        s sVar;
        do {
            sVar = this.f1394n;
        } while (!f1390p.zy(this, sVar, s.f47045zy));
        while (sVar != null) {
            sVar.toq();
            sVar = sVar.f47046toq;
        }
    }

    /* JADX INFO: renamed from: g */
    private n m893g(n nVar) {
        n nVar2;
        do {
            nVar2 = this.f1395q;
        } while (!f1390p.mo902k(this, nVar2, n.f1401q));
        n nVar3 = nVar;
        n nVar4 = nVar2;
        while (nVar4 != null) {
            n nVar5 = nVar4.f47043zy;
            nVar4.f47043zy = nVar3;
            nVar3 = nVar4;
            nVar4 = nVar5;
        }
        return nVar3;
    }

    /* JADX INFO: renamed from: k */
    private void m894k(StringBuilder sb) {
        try {
            Object objX2 = x2(this);
            sb.append("SUCCESS, result=[");
            sb.append(zurt(objX2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private void ki(s sVar) {
        sVar.f1404k = null;
        while (true) {
            s sVar2 = this.f1394n;
            if (sVar2 == s.f47045zy) {
                return;
            }
            s sVar3 = null;
            while (sVar2 != null) {
                s sVar4 = sVar2.f47046toq;
                if (sVar2.f1404k != null) {
                    sVar3 = sVar2;
                } else if (sVar3 != null) {
                    sVar3.f47046toq = sVar4;
                    if (sVar3.f1404k == null) {
                        break;
                    }
                } else if (!f1390p.zy(this, sVar2, sVar4)) {
                    break;
                }
                sVar2 = sVar4;
            }
            return;
        }
    }

    static Object ld6(InterfaceFutureC4792c<?> interfaceFutureC4792c) {
        if (interfaceFutureC4792c instanceof AbstractC0257k) {
            Object obj = ((AbstractC0257k) interfaceFutureC4792c).f1393k;
            if (!(obj instanceof zy)) {
                return obj;
            }
            zy zyVar = (zy) obj;
            return zyVar.f1406k ? zyVar.f47048toq != null ? new zy(false, zyVar.f47048toq) : zy.f1405q : obj;
        }
        boolean zIsCancelled = interfaceFutureC4792c.isCancelled();
        if ((!f1388g) && zIsCancelled) {
            return zy.f1405q;
        }
        try {
            Object objX2 = x2(interfaceFutureC4792c);
            return objX2 == null ? f1389h : objX2;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new zy(false, e2);
            }
            return new q(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC4792c, e2));
        } catch (ExecutionException e3) {
            return new q(e3.getCause());
        } catch (Throwable th) {
            return new q(th);
        }
    }

    @lvui
    /* JADX INFO: renamed from: n */
    static <T> T m895n(@dd T t2) {
        t2.getClass();
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private V m896p(Object obj) throws ExecutionException {
        if (obj instanceof zy) {
            throw m897q("Task was cancelled.", ((zy) obj).f47048toq);
        }
        if (obj instanceof q) {
            throw new ExecutionException(((q) obj).f1403k);
        }
        if (obj == f1389h) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: q */
    private static CancellationException m897q(@dd String str, @dd Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: s */
    private static void m898s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f1392y.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private static <V> V x2(Future<V> future) throws ExecutionException {
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: y */
    static void m899y(AbstractC0257k<?> abstractC0257k) {
        n nVar = null;
        while (true) {
            abstractC0257k.cdj();
            abstractC0257k.toq();
            n nVarM893g = abstractC0257k.m893g(nVar);
            while (nVarM893g != null) {
                nVar = nVarM893g.f47043zy;
                Runnable runnable = nVarM893g.f1402k;
                if (runnable instanceof f7l8) {
                    f7l8 f7l8Var = (f7l8) runnable;
                    abstractC0257k = f7l8Var.f1396k;
                    if (abstractC0257k.f1393k == f7l8Var) {
                        if (f1390p.toq(abstractC0257k, f7l8Var, ld6(f7l8Var.f1397q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m898s(runnable, nVarM893g.f47042toq);
                }
                nVarM893g = nVar;
            }
            return;
        }
    }

    private String zurt(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f1393k;
        if (!(obj == null) && !(obj instanceof f7l8)) {
            return false;
        }
        zy zyVar = f1388g ? new zy(z2, new CancellationException("Future.cancel() was called.")) : z2 ? zy.f47047zy : zy.f1405q;
        AbstractC0257k<V> abstractC0257k = this;
        boolean z3 = false;
        while (true) {
            if (f1390p.toq(abstractC0257k, obj, zyVar)) {
                if (z2) {
                    abstractC0257k.qrj();
                }
                m899y(abstractC0257k);
                if (!(obj instanceof f7l8)) {
                    return true;
                }
                InterfaceFutureC4792c<? extends V> interfaceFutureC4792c = ((f7l8) obj).f1397q;
                if (!(interfaceFutureC4792c instanceof AbstractC0257k)) {
                    interfaceFutureC4792c.cancel(z2);
                    return true;
                }
                abstractC0257k = (AbstractC0257k) interfaceFutureC4792c;
                obj = abstractC0257k.f1393k;
                if (!(obj == null) && !(obj instanceof f7l8)) {
                    return true;
                }
                z3 = true;
            } else {
                obj = abstractC0257k.f1393k;
                if (!(obj instanceof f7l8)) {
                    return z3;
                }
            }
        }
    }

    protected boolean fn3e(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
        q qVar;
        m895n(interfaceFutureC4792c);
        Object obj = this.f1393k;
        if (obj == null) {
            if (interfaceFutureC4792c.isDone()) {
                if (!f1390p.toq(this, null, ld6(interfaceFutureC4792c))) {
                    return false;
                }
                m899y(this);
                return true;
            }
            f7l8 f7l8Var = new f7l8(this, interfaceFutureC4792c);
            if (f1390p.toq(this, null, f7l8Var)) {
                try {
                    interfaceFutureC4792c.n7h(f7l8Var, EnumC0259q.INSTANCE);
                } catch (Throwable th) {
                    try {
                        qVar = new q(th);
                    } catch (Throwable unused) {
                        qVar = q.f47044toq;
                    }
                    f1390p.toq(this, f7l8Var, qVar);
                }
                return true;
            }
            obj = this.f1393k;
        }
        if (obj instanceof zy) {
            interfaceFutureC4792c.cancel(((zy) obj).f1406k);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1393k;
        if ((obj != null) && (!(obj instanceof f7l8))) {
            return m896p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            s sVar = this.f1394n;
            if (sVar != s.f47045zy) {
                s sVar2 = new s();
                do {
                    sVar2.m905k(sVar);
                    if (f1390p.zy(this, sVar, sVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                ki(sVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1393k;
                            if ((obj2 != null) && (!(obj2 instanceof f7l8))) {
                                return m896p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        ki(sVar2);
                    } else {
                        sVar = this.f1394n;
                    }
                } while (sVar != s.f47045zy);
            }
            return m896p(this.f1393k);
        }
        while (nanos > 0) {
            Object obj3 = this.f1393k;
            if ((obj3 != null) && (!(obj3 instanceof f7l8))) {
                return m896p(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dd
    /* JADX INFO: renamed from: h */
    protected String mo900h() {
        Object obj = this.f1393k;
        if (obj instanceof f7l8) {
            return "setFuture=[" + zurt(((f7l8) obj).f1397q) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: i */
    protected boolean mo901i(Throwable th) {
        if (!f1390p.toq(this, null, new q((Throwable) m895n(th)))) {
            return false;
        }
        m899y(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1393k instanceof zy;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f7l8)) & (this.f1393k != null);
    }

    final void kja0(@dd Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(ni7());
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC4792c
    public final void n7h(Runnable runnable, Executor executor) {
        m895n(runnable);
        m895n(executor);
        n nVar = this.f1395q;
        if (nVar != n.f1401q) {
            n nVar2 = new n(runnable, executor);
            do {
                nVar2.f47043zy = nVar;
                if (f1390p.mo902k(this, nVar, nVar2)) {
                    return;
                } else {
                    nVar = this.f1395q;
                }
            } while (nVar != n.f1401q);
        }
        m898s(runnable, executor);
    }

    protected final boolean ni7() {
        Object obj = this.f1393k;
        return (obj instanceof zy) && ((zy) obj).f1406k;
    }

    protected void qrj() {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean t8r(@dd V v2) {
        if (v2 == null) {
            v2 = (V) f1389h;
        }
        if (!f1390p.toq(this, null, v2)) {
            return false;
        }
        m899y(this);
        return true;
    }

    public String toString() {
        String strMo900h;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m894k(sb);
        } else {
            try {
                strMo900h = mo900h();
            } catch (RuntimeException e2) {
                strMo900h = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strMo900h != null && !strMo900h.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo900h);
                sb.append("]");
            } else if (isDone()) {
                m894k(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected void toq() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1393k;
            if ((obj2 != null) & (!(obj2 instanceof f7l8))) {
                return m896p(obj2);
            }
            s sVar = this.f1394n;
            if (sVar != s.f47045zy) {
                s sVar2 = new s();
                do {
                    sVar2.m905k(sVar);
                    if (f1390p.zy(this, sVar, sVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1393k;
                            } else {
                                ki(sVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f7l8))));
                        return m896p(obj);
                    }
                    sVar = this.f1394n;
                } while (sVar != s.f47045zy);
            }
            return m896p(this.f1393k);
        }
        throw new InterruptedException();
    }
}

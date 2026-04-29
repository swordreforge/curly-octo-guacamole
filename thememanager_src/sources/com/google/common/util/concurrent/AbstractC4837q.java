package com.google.common.util.concurrent;

import com.google.common.util.concurrent.internal.AbstractC4814k;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.q */
/* JADX INFO: compiled from: AbstractFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@wlev.toq(emulated = true)
public abstract class AbstractC4837q<V> extends AbstractC4814k implements InterfaceFutureC4792c<V> {

    /* JADX INFO: renamed from: h */
    private static final Object f27504h;

    /* JADX INFO: renamed from: p */
    private static final toq f27505p;

    /* JADX INFO: renamed from: s */
    private static final long f27506s = 1000;

    /* JADX INFO: renamed from: k */
    @NullableDecl
    private volatile Object f27508k;

    /* JADX INFO: renamed from: n */
    @NullableDecl
    private volatile x2 f27509n;

    /* JADX INFO: renamed from: q */
    @NullableDecl
    private volatile n f27510q;

    /* JADX INFO: renamed from: g */
    private static final boolean f27503g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: y */
    private static final Logger f27507y = Logger.getLogger(AbstractC4837q.class.getName());

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$f7l8 */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class f7l8<V> implements Runnable {

        /* JADX INFO: renamed from: k */
        final AbstractC4837q<V> f27511k;

        /* JADX INFO: renamed from: q */
        final InterfaceFutureC4792c<? extends V> f27512q;

        f7l8(AbstractC4837q<V> abstractC4837q, InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
            this.f27511k = abstractC4837q;
            this.f27512q = interfaceFutureC4792c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC4837q) this.f27511k).f27508k != this) {
                return;
            }
            if (AbstractC4837q.f27505p.toq(this.f27511k, this, AbstractC4837q.zurt(this.f27512q))) {
                AbstractC4837q.t8r(this.f27511k);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$g */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class g extends toq {

        /* JADX INFO: renamed from: k */
        final AtomicReferenceFieldUpdater<x2, Thread> f27513k;

        /* JADX INFO: renamed from: n */
        final AtomicReferenceFieldUpdater<AbstractC4837q, Object> f27514n;

        /* JADX INFO: renamed from: q */
        final AtomicReferenceFieldUpdater<AbstractC4837q, n> f27515q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<x2, x2> f68645toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractC4837q, x2> f68646zy;

        g(AtomicReferenceFieldUpdater<x2, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<x2, x2> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC4837q, x2> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC4837q, n> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC4837q, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f27513k = atomicReferenceFieldUpdater;
            this.f68645toq = atomicReferenceFieldUpdater2;
            this.f68646zy = atomicReferenceFieldUpdater3;
            this.f27515q = atomicReferenceFieldUpdater4;
            this.f27514n = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: k */
        boolean mo17003k(AbstractC4837q<?> abstractC4837q, n nVar, n nVar2) {
            return androidx.concurrent.futures.toq.m906k(this.f27515q, abstractC4837q, nVar, nVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: n */
        void mo17004n(x2 x2Var, Thread thread) {
            this.f27513k.lazySet(x2Var, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: q */
        void mo17005q(x2 x2Var, x2 x2Var2) {
            this.f68645toq.lazySet(x2Var, x2Var2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        boolean toq(AbstractC4837q<?> abstractC4837q, Object obj, Object obj2) {
            return androidx.concurrent.futures.toq.m906k(this.f27514n, abstractC4837q, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        boolean zy(AbstractC4837q<?> abstractC4837q, x2 x2Var, x2 x2Var2) {
            return androidx.concurrent.futures.toq.m906k(this.f68646zy, abstractC4837q, x2Var, x2Var2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$ld6 */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class ld6 extends toq {

        /* JADX INFO: renamed from: g */
        static final long f27516g;

        /* JADX INFO: renamed from: k */
        static final Unsafe f27517k;

        /* JADX INFO: renamed from: n */
        static final long f27518n;

        /* JADX INFO: renamed from: q */
        static final long f27519q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final long f68647toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final long f68648zy;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.q$ld6$k */
        /* JADX INFO: compiled from: AbstractFuture.java */
        static class k implements PrivilegedExceptionAction<Unsafe> {
            k() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new k());
            }
            try {
                f68648zy = unsafe.objectFieldOffset(AbstractC4837q.class.getDeclaredField("n"));
                f68647toq = unsafe.objectFieldOffset(AbstractC4837q.class.getDeclaredField("q"));
                f27519q = unsafe.objectFieldOffset(AbstractC4837q.class.getDeclaredField("k"));
                f27518n = unsafe.objectFieldOffset(x2.class.getDeclaredField("k"));
                f27516g = unsafe.objectFieldOffset(x2.class.getDeclaredField("toq"));
                f27517k = unsafe;
            } catch (Exception e3) {
                com.google.common.base.dd.ni7(e3);
                throw new RuntimeException(e3);
            }
        }

        private ld6() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: k */
        boolean mo17003k(AbstractC4837q<?> abstractC4837q, n nVar, n nVar2) {
            return C4822n.m16980k(f27517k, abstractC4837q, f68647toq, nVar, nVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: n */
        void mo17004n(x2 x2Var, Thread thread) {
            f27517k.putObject(x2Var, f27518n, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: q */
        void mo17005q(x2 x2Var, x2 x2Var2) {
            f27517k.putObject(x2Var, f27516g, x2Var2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        boolean toq(AbstractC4837q<?> abstractC4837q, Object obj, Object obj2) {
            return C4822n.m16980k(f27517k, abstractC4837q, f27519q, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        boolean zy(AbstractC4837q<?> abstractC4837q, x2 x2Var, x2 x2Var2) {
            return C4822n.m16980k(f27517k, abstractC4837q, f68648zy, x2Var, x2Var2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$n */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class n {

        /* JADX INFO: renamed from: q */
        static final n f27520q = new n(null, null);

        /* JADX INFO: renamed from: k */
        final Runnable f27521k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Executor f68649toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @NullableDecl
        n f68650zy;

        n(Runnable runnable, Executor executor) {
            this.f27521k = runnable;
            this.f68649toq = executor;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$p */
    /* JADX INFO: compiled from: AbstractFuture.java */
    static abstract class p<V> extends AbstractC4837q<V> implements s<V> {
        p() {
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z2) {
            return super.cancel(z2);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, com.google.common.util.concurrent.InterfaceFutureC4792c
        public final void n7h(Runnable runnable, Executor executor) {
            super.n7h(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j2, timeUnit);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$q */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final q f68651toq = new q(new k("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: k */
        final Throwable f27522k;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.q$q$k */
        /* JADX INFO: compiled from: AbstractFuture.java */
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
            this.f27522k = (Throwable) com.google.common.base.jk.a9(th);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$s */
    /* JADX INFO: compiled from: AbstractFuture.java */
    interface s<V> extends InterfaceFutureC4792c<V> {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$toq */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static abstract class toq {
        private toq() {
        }

        /* JADX INFO: renamed from: k */
        abstract boolean mo17003k(AbstractC4837q<?> abstractC4837q, n nVar, n nVar2);

        /* JADX INFO: renamed from: n */
        abstract void mo17004n(x2 x2Var, Thread thread);

        /* JADX INFO: renamed from: q */
        abstract void mo17005q(x2 x2Var, x2 x2Var2);

        abstract boolean toq(AbstractC4837q<?> abstractC4837q, Object obj, Object obj2);

        abstract boolean zy(AbstractC4837q<?> abstractC4837q, x2 x2Var, x2 x2Var2);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$x2 */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class x2 {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final x2 f68652zy = new x2(false);

        /* JADX INFO: renamed from: k */
        @NullableDecl
        volatile Thread f27523k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @NullableDecl
        volatile x2 f68653toq;

        x2(boolean z2) {
        }

        /* JADX INFO: renamed from: k */
        void m17007k(x2 x2Var) {
            AbstractC4837q.f27505p.mo17005q(this, x2Var);
        }

        void toq() {
            Thread thread = this.f27523k;
            if (thread != null) {
                this.f27523k = null;
                LockSupport.unpark(thread);
            }
        }

        x2() {
            AbstractC4837q.f27505p.mo17004n(this, Thread.currentThread());
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$y */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class y extends toq {
        private y() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: k */
        boolean mo17003k(AbstractC4837q<?> abstractC4837q, n nVar, n nVar2) {
            synchronized (abstractC4837q) {
                if (((AbstractC4837q) abstractC4837q).f27510q != nVar) {
                    return false;
                }
                ((AbstractC4837q) abstractC4837q).f27510q = nVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: n */
        void mo17004n(x2 x2Var, Thread thread) {
            x2Var.f27523k = thread;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        /* JADX INFO: renamed from: q */
        void mo17005q(x2 x2Var, x2 x2Var2) {
            x2Var.f68653toq = x2Var2;
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        boolean toq(AbstractC4837q<?> abstractC4837q, Object obj, Object obj2) {
            synchronized (abstractC4837q) {
                if (((AbstractC4837q) abstractC4837q).f27508k != obj) {
                    return false;
                }
                ((AbstractC4837q) abstractC4837q).f27508k = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC4837q.toq
        boolean zy(AbstractC4837q<?> abstractC4837q, x2 x2Var, x2 x2Var2) {
            synchronized (abstractC4837q) {
                if (((AbstractC4837q) abstractC4837q).f27509n != x2Var) {
                    return false;
                }
                ((AbstractC4837q) abstractC4837q).f27509n = x2Var2;
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.q$zy */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class zy {

        /* JADX INFO: renamed from: q */
        static final zy f27524q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final zy f68654zy;

        /* JADX INFO: renamed from: k */
        final boolean f27525k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @NullableDecl
        final Throwable f68655toq;

        static {
            if (AbstractC4837q.f27503g) {
                f27524q = null;
                f68654zy = null;
            } else {
                f27524q = new zy(false, null);
                f68654zy = new zy(true, null);
            }
        }

        zy(boolean z2, @NullableDecl Throwable th) {
            this.f27525k = z2;
            this.f68655toq = th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.common.util.concurrent.q$k] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    static {
        toq yVar;
        ?? r1 = 0;
        r1 = 0;
        try {
            yVar = new ld6();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                yVar = new g(AtomicReferenceFieldUpdater.newUpdater(x2.class, Thread.class, "k"), AtomicReferenceFieldUpdater.newUpdater(x2.class, x2.class, "toq"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4837q.class, x2.class, "n"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4837q.class, n.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4837q.class, Object.class, "k"));
            } catch (Throwable th2) {
                yVar = new y();
                r1 = th2;
            }
        }
        f27505p = yVar;
        if (r1 != 0) {
            ?? r0 = f27507y;
            Level level = Level.SEVERE;
            r0.log(level, "UnsafeAtomicHelper is broken!", th);
            r0.log(level, "SafeAtomicHelper is broken!", r1);
        }
        f27504h = new Object();
    }

    protected AbstractC4837q() {
    }

    private static CancellationException cdj(@NullableDecl String str, @NullableDecl Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V fn3e(Object obj) throws ExecutionException {
        if (obj instanceof zy) {
            throw cdj("Task was cancelled.", ((zy) obj).f68655toq);
        }
        if (obj instanceof q) {
            throw new ExecutionException(((q) obj).f27522k);
        }
        if (obj == f27504h) {
            return null;
        }
        return obj;
    }

    private String fti(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: i */
    private static void m16995i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f27507y.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    private n ki(n nVar) {
        n nVar2;
        do {
            nVar2 = this.f27510q;
        } while (!f27505p.mo17003k(this, nVar2, n.f27520q));
        n nVar3 = nVar;
        n nVar4 = nVar2;
        while (nVar4 != null) {
            n nVar5 = nVar4.f68650zy;
            nVar4.f68650zy = nVar3;
            nVar3 = nVar4;
            nVar4 = nVar5;
        }
        return nVar3;
    }

    private void kja0(StringBuilder sb) {
        try {
            Object objNi7 = ni7(this);
            sb.append("SUCCESS, result=[");
            sb.append(fti(objNi7));
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

    private static <V> V ni7(Future<V> future) throws ExecutionException {
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

    /* JADX INFO: renamed from: t */
    private void m17000t(x2 x2Var) {
        x2Var.f27523k = null;
        while (true) {
            x2 x2Var2 = this.f27509n;
            if (x2Var2 == x2.f68652zy) {
                return;
            }
            x2 x2Var3 = null;
            while (x2Var2 != null) {
                x2 x2Var4 = x2Var2.f68653toq;
                if (x2Var2.f27523k != null) {
                    x2Var3 = x2Var2;
                } else if (x2Var3 != null) {
                    x2Var3.f68653toq = x2Var4;
                    if (x2Var3.f27523k == null) {
                        break;
                    }
                } else if (!f27505p.zy(this, x2Var2, x2Var4)) {
                    break;
                }
                x2Var2 = x2Var4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void t8r(AbstractC4837q<?> abstractC4837q) {
        n nVar = null;
        while (true) {
            abstractC4837q.wvg();
            abstractC4837q.mo16921h();
            n nVarKi = abstractC4837q.ki(nVar);
            while (nVarKi != null) {
                nVar = nVarKi.f68650zy;
                Runnable runnable = nVarKi.f27521k;
                if (runnable instanceof f7l8) {
                    f7l8 f7l8Var = (f7l8) runnable;
                    abstractC4837q = f7l8Var.f27511k;
                    if (((AbstractC4837q) abstractC4837q).f27508k == f7l8Var) {
                        if (f27505p.toq(abstractC4837q, f7l8Var, zurt(f7l8Var.f27512q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m16995i(runnable, nVarKi.f68649toq);
                }
                nVarKi = nVar;
            }
            return;
        }
    }

    private void wvg() {
        x2 x2Var;
        do {
            x2Var = this.f27509n;
        } while (!f27505p.zy(this, x2Var, x2.f68652zy));
        while (x2Var != null) {
            x2Var.toq();
            x2Var = x2Var.f68653toq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zurt(InterfaceFutureC4792c<?> interfaceFutureC4792c) {
        Throwable thM16951k;
        if (interfaceFutureC4792c instanceof s) {
            Object obj = ((AbstractC4837q) interfaceFutureC4792c).f27508k;
            if (!(obj instanceof zy)) {
                return obj;
            }
            zy zyVar = (zy) obj;
            return zyVar.f27525k ? zyVar.f68655toq != null ? new zy(false, zyVar.f68655toq) : zy.f27524q : obj;
        }
        if ((interfaceFutureC4792c instanceof AbstractC4814k) && (thM16951k = com.google.common.util.concurrent.internal.toq.m16951k((AbstractC4814k) interfaceFutureC4792c)) != null) {
            return new q(thM16951k);
        }
        boolean zIsCancelled = interfaceFutureC4792c.isCancelled();
        if ((!f27503g) && zIsCancelled) {
            return zy.f27524q;
        }
        try {
            Object objNi7 = ni7(interfaceFutureC4792c);
            if (!zIsCancelled) {
                return objNi7 == null ? f27504h : objNi7;
            }
            return new zy(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC4792c));
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new zy(false, e2);
            }
            return new q(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC4792c, e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new q(e3.getCause());
            }
            return new zy(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC4792c, e3));
        } catch (Throwable th) {
            return new q(th);
        }
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    protected boolean a9(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
        q qVar;
        com.google.common.base.jk.a9(interfaceFutureC4792c);
        Object obj = this.f27508k;
        if (obj == null) {
            if (interfaceFutureC4792c.isDone()) {
                if (!f27505p.toq(this, null, zurt(interfaceFutureC4792c))) {
                    return false;
                }
                t8r(this);
                return true;
            }
            f7l8 f7l8Var = new f7l8(this, interfaceFutureC4792c);
            if (f27505p.toq(this, null, f7l8Var)) {
                try {
                    interfaceFutureC4792c.n7h(f7l8Var, fu4.INSTANCE);
                } catch (Throwable th) {
                    try {
                        qVar = new q(th);
                    } catch (Throwable unused) {
                        qVar = q.f68651toq;
                    }
                    f27505p.toq(this, f7l8Var, qVar);
                }
                return true;
            }
            obj = this.f27508k;
        }
        if (obj instanceof zy) {
            interfaceFutureC4792c.cancel(((zy) obj).f27525k);
        }
        return false;
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z2) {
        Object obj = this.f27508k;
        if (!(obj == null) && !(obj instanceof f7l8)) {
            return false;
        }
        zy zyVar = f27503g ? new zy(z2, new CancellationException("Future.cancel() was called.")) : z2 ? zy.f68654zy : zy.f27524q;
        AbstractC4837q<V> abstractC4837q = this;
        boolean z3 = false;
        while (true) {
            if (f27505p.toq(abstractC4837q, obj, zyVar)) {
                if (z2) {
                    abstractC4837q.fu4();
                }
                t8r(abstractC4837q);
                if (!(obj instanceof f7l8)) {
                    return true;
                }
                InterfaceFutureC4792c<? extends V> interfaceFutureC4792c = ((f7l8) obj).f27512q;
                if (!(interfaceFutureC4792c instanceof s)) {
                    interfaceFutureC4792c.cancel(z2);
                    return true;
                }
                abstractC4837q = (AbstractC4837q) interfaceFutureC4792c;
                obj = abstractC4837q.f27508k;
                if (!(obj == null) && !(obj instanceof f7l8)) {
                    return true;
                }
                z3 = true;
            } else {
                obj = abstractC4837q.f27508k;
                if (!(obj instanceof f7l8)) {
                    return z3;
                }
            }
        }
    }

    protected void fu4() {
    }

    @CanIgnoreReturnValue
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f27508k;
        if ((obj != null) && (!(obj instanceof f7l8))) {
            return fn3e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            x2 x2Var = this.f27509n;
            if (x2Var != x2.f68652zy) {
                x2 x2Var2 = new x2();
                do {
                    x2Var2.m17007k(x2Var);
                    if (f27505p.zy(this, x2Var, x2Var2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m17000t(x2Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f27508k;
                            if ((obj2 != null) && (!(obj2 instanceof f7l8))) {
                                return fn3e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m17000t(x2Var2);
                    } else {
                        x2Var = this.f27509n;
                    }
                } while (x2Var != x2.f68652zy);
            }
            return fn3e(this.f27508k);
        }
        while (nanos > 0) {
            Object obj3 = this.f27508k;
            if ((obj3 != null) && (!(obj3 instanceof f7l8))) {
                return fn3e(obj3);
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

    @InterfaceC7731k
    @ForOverride
    /* JADX INFO: renamed from: h */
    protected void mo16921h() {
    }

    public boolean isCancelled() {
        return this.f27508k instanceof zy;
    }

    public boolean isDone() {
        return (!(r0 instanceof f7l8)) & (this.f27508k != null);
    }

    @CanIgnoreReturnValue
    protected boolean jk(Throwable th) {
        if (!f27505p.toq(this, null, new q((Throwable) com.google.common.base.jk.a9(th)))) {
            return false;
        }
        t8r(this);
        return true;
    }

    protected final boolean jp0y() {
        Object obj = this.f27508k;
        return (obj instanceof zy) && ((zy) obj).f27525k;
    }

    @Override // com.google.common.util.concurrent.internal.AbstractC4814k
    @NullableDecl
    /* JADX INFO: renamed from: k */
    protected final Throwable mo16950k() {
        if (!(this instanceof s)) {
            return null;
        }
        Object obj = this.f27508k;
        if (obj instanceof q) {
            return ((q) obj).f27522k;
        }
        return null;
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
    @CanIgnoreReturnValue
    protected boolean mcp(@NullableDecl V v2) {
        if (v2 == null) {
            v2 = (V) f27504h;
        }
        if (!f27505p.toq(this, null, v2)) {
            return false;
        }
        t8r(this);
        return true;
    }

    public void n7h(Runnable runnable, Executor executor) {
        n nVar;
        com.google.common.base.jk.fti(runnable, "Runnable was null.");
        com.google.common.base.jk.fti(executor, "Executor was null.");
        if (!isDone() && (nVar = this.f27510q) != n.f27520q) {
            n nVar2 = new n(runnable, executor);
            do {
                nVar2.f68650zy = nVar;
                if (f27505p.mo17003k(this, nVar, nVar2)) {
                    return;
                } else {
                    nVar = this.f27510q;
                }
            } while (nVar != n.f27520q);
        }
        m16995i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    protected String o1t() {
        Object obj = this.f27508k;
        if (obj instanceof f7l8) {
            return "setFuture=[" + fti(((f7l8) obj).f27512q) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strO1t;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            kja0(sb);
        } else {
            try {
                strO1t = o1t();
            } catch (RuntimeException e2) {
                strO1t = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strO1t != null && !strO1t.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strO1t);
                sb.append("]");
            } else if (isDone()) {
                kja0(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    final void m17002z(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(jp0y());
        }
    }

    @CanIgnoreReturnValue
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f27508k;
            if ((obj2 != null) & (!(obj2 instanceof f7l8))) {
                return fn3e(obj2);
            }
            x2 x2Var = this.f27509n;
            if (x2Var != x2.f68652zy) {
                x2 x2Var2 = new x2();
                do {
                    x2Var2.m17007k(x2Var);
                    if (f27505p.zy(this, x2Var, x2Var2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f27508k;
                            } else {
                                m17000t(x2Var2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f7l8))));
                        return fn3e(obj);
                    }
                    x2Var = this.f27509n;
                } while (x2Var != x2.f68652zy);
            }
            return fn3e(this.f27508k);
        }
        throw new InterruptedException();
    }
}

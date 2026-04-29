package com.bumptech.glide.load.engine;

import androidx.core.util.qrj;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.engine.C3031h;
import com.bumptech.glide.load.engine.RunnableC3047y;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k;
import com.bumptech.glide.request.InterfaceC3171p;
import com.bumptech.glide.util.C3199g;
import com.bumptech.glide.util.pool.C3205k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: EngineJob.java */
/* JADX INFO: loaded from: classes2.dex */
class x2<R> implements RunnableC3047y.toq<R>, C3205k.g {

    /* JADX INFO: renamed from: d */
    private static final zy f18468d = new zy();

    /* JADX INFO: renamed from: a */
    private boolean f18469a;

    /* JADX INFO: renamed from: b */
    cdj f18470b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private volatile boolean f62812bo;

    /* JADX INFO: renamed from: c */
    private boolean f18471c;

    /* JADX INFO: renamed from: e */
    private boolean f18472e;

    /* JADX INFO: renamed from: f */
    private boolean f18473f;

    /* JADX INFO: renamed from: g */
    private final qrj.InterfaceC0641k<x2<?>> f18474g;

    /* JADX INFO: renamed from: h */
    private final ExecutorServiceC3027k f18475h;

    /* JADX INFO: renamed from: i */
    private final ExecutorServiceC3027k f18476i;

    /* JADX INFO: renamed from: j */
    private zurt<?> f18477j;

    /* JADX INFO: renamed from: k */
    final C3045n f18478k;

    /* JADX INFO: renamed from: l */
    private boolean f18479l;

    /* JADX INFO: renamed from: m */
    private boolean f18480m;

    /* JADX INFO: renamed from: n */
    private final C3031h.k f18481n;

    /* JADX INFO: renamed from: o */
    EnumC3050k f18482o;

    /* JADX INFO: renamed from: p */
    private final ExecutorServiceC3027k f18483p;

    /* JADX INFO: renamed from: q */
    private final com.bumptech.glide.util.pool.zy f18484q;

    /* JADX INFO: renamed from: r */
    private com.bumptech.glide.load.f7l8 f18485r;

    /* JADX INFO: renamed from: s */
    private final qrj f18486s;

    /* JADX INFO: renamed from: t */
    private final AtomicInteger f18487t;

    /* JADX INFO: renamed from: u */
    private RunnableC3047y<R> f18488u;

    /* JADX INFO: renamed from: v */
    private boolean f18489v;

    /* JADX INFO: renamed from: x */
    C3031h<?> f18490x;

    /* JADX INFO: renamed from: y */
    private final zy f18491y;

    /* JADX INFO: renamed from: z */
    private final ExecutorServiceC3027k f18492z;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.x2$k */
    /* JADX INFO: compiled from: EngineJob.java */
    private class RunnableC3044k implements Runnable {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3171p f18493k;

        RunnableC3044k(InterfaceC3171p interfaceC3171p) {
            this.f18493k = interfaceC3171p;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f18493k.mo11170g()) {
                synchronized (x2.this) {
                    if (x2.this.f18478k.toq(this.f18493k)) {
                        x2.this.m10815g(this.f18493k);
                    }
                    x2.this.m10820s();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.x2$n */
    /* JADX INFO: compiled from: EngineJob.java */
    static final class C3045n implements Iterable<C3046q> {

        /* JADX INFO: renamed from: k */
        private final List<C3046q> f18495k;

        C3045n() {
            this(new ArrayList(2));
        }

        /* JADX INFO: renamed from: n */
        private static C3046q m10822n(InterfaceC3171p interfaceC3171p) {
            return new C3046q(interfaceC3171p, C3199g.m11219k());
        }

        void clear() {
            this.f18495k.clear();
        }

        /* JADX INFO: renamed from: g */
        void m10823g(InterfaceC3171p interfaceC3171p) {
            this.f18495k.remove(m10822n(interfaceC3171p));
        }

        boolean isEmpty() {
            return this.f18495k.isEmpty();
        }

        @Override // java.lang.Iterable
        @lvui
        public Iterator<C3046q> iterator() {
            return this.f18495k.iterator();
        }

        /* JADX INFO: renamed from: k */
        void m10824k(InterfaceC3171p interfaceC3171p, Executor executor) {
            this.f18495k.add(new C3046q(interfaceC3171p, executor));
        }

        int size() {
            return this.f18495k.size();
        }

        boolean toq(InterfaceC3171p interfaceC3171p) {
            return this.f18495k.contains(m10822n(interfaceC3171p));
        }

        C3045n zy() {
            return new C3045n(new ArrayList(this.f18495k));
        }

        C3045n(List<C3046q> list) {
            this.f18495k = list;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.x2$q */
    /* JADX INFO: compiled from: EngineJob.java */
    static final class C3046q {

        /* JADX INFO: renamed from: k */
        final InterfaceC3171p f18496k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Executor f62813toq;

        C3046q(InterfaceC3171p interfaceC3171p, Executor executor) {
            this.f18496k = interfaceC3171p;
            this.f62813toq = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3046q) {
                return this.f18496k.equals(((C3046q) obj).f18496k);
            }
            return false;
        }

        public int hashCode() {
            return this.f18496k.hashCode();
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    private class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3171p f18497k;

        toq(InterfaceC3171p interfaceC3171p) {
            this.f18497k = interfaceC3171p;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f18497k.mo11170g()) {
                synchronized (x2.this) {
                    if (x2.this.f18478k.toq(this.f18497k)) {
                        x2.this.f18490x.m10770k();
                        x2.this.f7l8(this.f18497k);
                        x2.this.t8r(this.f18497k);
                    }
                    x2.this.m10820s();
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    @yz
    static class zy {
        zy() {
        }

        /* JADX INFO: renamed from: k */
        public <R> C3031h<R> m10825k(zurt<R> zurtVar, boolean z2, com.bumptech.glide.load.f7l8 f7l8Var, C3031h.k kVar) {
            return new C3031h<>(zurtVar, z2, true, f7l8Var, kVar);
        }
    }

    x2(ExecutorServiceC3027k executorServiceC3027k, ExecutorServiceC3027k executorServiceC3027k2, ExecutorServiceC3027k executorServiceC3027k3, ExecutorServiceC3027k executorServiceC3027k4, qrj qrjVar, C3031h.k kVar, qrj.InterfaceC0641k<x2<?>> interfaceC0641k) {
        this(executorServiceC3027k, executorServiceC3027k2, executorServiceC3027k3, executorServiceC3027k4, qrjVar, kVar, interfaceC0641k, f18468d);
    }

    private synchronized void ki() {
        if (this.f18485r == null) {
            throw new IllegalArgumentException();
        }
        this.f18478k.clear();
        this.f18485r = null;
        this.f18490x = null;
        this.f18477j = null;
        this.f18469a = false;
        this.f62812bo = false;
        this.f18480m = false;
        this.f18489v = false;
        this.f18488u.wvg(false);
        this.f18488u = null;
        this.f18470b = null;
        this.f18482o = null;
        this.f18474g.toq(this);
    }

    private boolean n7h() {
        return this.f18469a || this.f18480m || this.f62812bo;
    }

    /* JADX INFO: renamed from: p */
    private ExecutorServiceC3027k m10814p() {
        return this.f18473f ? this.f18476i : this.f18471c ? this.f18492z : this.f18475h;
    }

    boolean cdj() {
        return this.f18472e;
    }

    @zy.o1t("this")
    void f7l8(InterfaceC3171p interfaceC3171p) {
        try {
            interfaceC3171p.toq(this.f18490x, this.f18482o, this.f18489v);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.toq(th);
        }
    }

    @zy.o1t("this")
    /* JADX INFO: renamed from: g */
    void m10815g(InterfaceC3171p interfaceC3171p) {
        try {
            interfaceC3171p.zy(this.f18470b);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.toq(th);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    void m10816h() {
        synchronized (this) {
            this.f18484q.zy();
            if (this.f62812bo) {
                this.f18477j.toq();
                ki();
                return;
            }
            if (this.f18478k.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f18480m) {
                throw new IllegalStateException("Already have resource");
            }
            this.f18490x = this.f18491y.m10825k(this.f18477j, this.f18479l, this.f18485r, this.f18481n);
            this.f18480m = true;
            C3045n c3045nZy = this.f18478k.zy();
            ld6(c3045nZy.size() + 1);
            this.f18486s.toq(this, this.f18485r, this.f18490x);
            for (C3046q c3046q : c3045nZy) {
                c3046q.f62813toq.execute(new toq(c3046q.f18496k));
            }
            m10820s();
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m10817i(RunnableC3047y<R> runnableC3047y) {
        this.f18488u = runnableC3047y;
        (runnableC3047y.gvn7() ? this.f18483p : m10814p()).execute(runnableC3047y);
    }

    /* JADX INFO: renamed from: k */
    synchronized void m10818k(InterfaceC3171p interfaceC3171p, Executor executor) {
        this.f18484q.zy();
        this.f18478k.m10824k(interfaceC3171p, executor);
        boolean z2 = true;
        if (this.f18480m) {
            ld6(1);
            executor.execute(new toq(interfaceC3171p));
        } else if (this.f18469a) {
            ld6(1);
            executor.execute(new RunnableC3044k(interfaceC3171p));
        } else {
            if (this.f62812bo) {
                z2 = false;
            }
            com.bumptech.glide.util.qrj.m11260k(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    void kja0() {
        synchronized (this) {
            this.f18484q.zy();
            if (this.f62812bo) {
                ki();
                return;
            }
            if (this.f18478k.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f18469a) {
                throw new IllegalStateException("Already failed once");
            }
            this.f18469a = true;
            com.bumptech.glide.load.f7l8 f7l8Var = this.f18485r;
            C3045n c3045nZy = this.f18478k.zy();
            ld6(c3045nZy.size() + 1);
            this.f18486s.toq(this, f7l8Var, null);
            for (C3046q c3046q : c3045nZy) {
                c3046q.f62813toq.execute(new RunnableC3044k(c3046q.f18496k));
            }
            m10820s();
        }
    }

    synchronized void ld6(int i2) {
        C3031h<?> c3031h;
        com.bumptech.glide.util.qrj.m11260k(n7h(), "Not yet complete!");
        if (this.f18487t.getAndAdd(i2) == 0 && (c3031h = this.f18490x) != null) {
            c3031h.m10770k();
        }
    }

    @Override // com.bumptech.glide.load.engine.RunnableC3047y.toq
    /* JADX INFO: renamed from: n */
    public void mo10819n(RunnableC3047y<?> runnableC3047y) {
        m10814p().execute(runnableC3047y);
    }

    @Override // com.bumptech.glide.util.pool.C3205k.g
    @lvui
    /* JADX INFO: renamed from: q */
    public com.bumptech.glide.util.pool.zy mo10724q() {
        return this.f18484q;
    }

    synchronized boolean qrj() {
        return this.f62812bo;
    }

    /* JADX INFO: renamed from: s */
    void m10820s() {
        C3031h<?> c3031h;
        synchronized (this) {
            this.f18484q.zy();
            com.bumptech.glide.util.qrj.m11260k(n7h(), "Not yet complete!");
            int iDecrementAndGet = this.f18487t.decrementAndGet();
            com.bumptech.glide.util.qrj.m11260k(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                c3031h = this.f18490x;
                ki();
            } else {
                c3031h = null;
            }
        }
        if (c3031h != null) {
            c3031h.f7l8();
        }
    }

    synchronized void t8r(InterfaceC3171p interfaceC3171p) {
        this.f18484q.zy();
        this.f18478k.m10823g(interfaceC3171p);
        if (this.f18478k.isEmpty()) {
            m10821y();
            if ((this.f18480m || this.f18469a) && this.f18487t.get() == 0) {
                ki();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.RunnableC3047y.toq
    public void toq(zurt<R> zurtVar, EnumC3050k enumC3050k, boolean z2) {
        synchronized (this) {
            this.f18477j = zurtVar;
            this.f18482o = enumC3050k;
            this.f18489v = z2;
        }
        m10816h();
    }

    @yz
    synchronized x2<R> x2(com.bumptech.glide.load.f7l8 f7l8Var, boolean z2, boolean z3, boolean z5, boolean z6) {
        this.f18485r = f7l8Var;
        this.f18479l = z2;
        this.f18473f = z3;
        this.f18471c = z5;
        this.f18472e = z6;
        return this;
    }

    /* JADX INFO: renamed from: y */
    void m10821y() {
        if (n7h()) {
            return;
        }
        this.f62812bo = true;
        this.f18488u.f7l8();
        this.f18486s.zy(this, this.f18485r);
    }

    @Override // com.bumptech.glide.load.engine.RunnableC3047y.toq
    public void zy(cdj cdjVar) {
        synchronized (this) {
            this.f18470b = cdjVar;
        }
        kja0();
    }

    @yz
    x2(ExecutorServiceC3027k executorServiceC3027k, ExecutorServiceC3027k executorServiceC3027k2, ExecutorServiceC3027k executorServiceC3027k3, ExecutorServiceC3027k executorServiceC3027k4, qrj qrjVar, C3031h.k kVar, qrj.InterfaceC0641k<x2<?>> interfaceC0641k, zy zyVar) {
        this.f18478k = new C3045n();
        this.f18484q = com.bumptech.glide.util.pool.zy.m11255k();
        this.f18487t = new AtomicInteger();
        this.f18483p = executorServiceC3027k;
        this.f18475h = executorServiceC3027k2;
        this.f18476i = executorServiceC3027k3;
        this.f18492z = executorServiceC3027k4;
        this.f18486s = qrjVar;
        this.f18481n = kVar;
        this.f18474g = interfaceC0641k;
        this.f18491y = zyVar;
    }
}

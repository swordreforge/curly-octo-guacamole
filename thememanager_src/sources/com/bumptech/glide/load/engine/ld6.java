package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.qrj;
import com.bumptech.glide.C3157n;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.engine.C3031h;
import com.bumptech.glide.load.engine.RunnableC3047y;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.bumptech.glide.load.engine.cache.InterfaceC3018p;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k;
import com.bumptech.glide.request.InterfaceC3171p;
import com.bumptech.glide.util.C3199g;
import com.bumptech.glide.util.C3208s;
import com.bumptech.glide.util.pool.C3205k;
import java.util.Map;
import java.util.concurrent.Executor;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 implements qrj, InterfaceC3018p.k, C3031h.k {

    /* JADX INFO: renamed from: p */
    private static final int f18393p = 150;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final C3034k f62782f7l8;

    /* JADX INFO: renamed from: g */
    private final zy f18395g;

    /* JADX INFO: renamed from: k */
    private final t8r f18396k;

    /* JADX INFO: renamed from: n */
    private final C3048z f18397n;

    /* JADX INFO: renamed from: q */
    private final toq f18398q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f62783toq;

    /* JADX INFO: renamed from: y */
    private final C3033k f18399y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3018p f62784zy;

    /* JADX INFO: renamed from: s */
    private static final String f18394s = "Engine";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final boolean f62781ld6 = Log.isLoggable(f18394s, 2);

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.ld6$k */
    /* JADX INFO: compiled from: Engine.java */
    @yz
    static class C3034k {

        /* JADX INFO: renamed from: k */
        final RunnableC3047y.n f18400k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final qrj.InterfaceC0641k<RunnableC3047y<?>> f62785toq = C3205k.m11247n(150, new k());

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f62786zy;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.ld6$k$k */
        /* JADX INFO: compiled from: Engine.java */
        class k implements C3205k.q<RunnableC3047y<?>> {
            k() {
            }

            @Override // com.bumptech.glide.util.pool.C3205k.q
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public RunnableC3047y<?> mo10723k() {
                C3034k c3034k = C3034k.this;
                return new RunnableC3047y<>(c3034k.f18400k, c3034k.f62785toq);
            }
        }

        C3034k(RunnableC3047y.n nVar) {
            this.f18400k = nVar;
        }

        /* JADX INFO: renamed from: k */
        <R> RunnableC3047y<R> m10788k(C3157n c3157n, Object obj, n7h n7hVar, com.bumptech.glide.load.f7l8 f7l8Var, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC3159p enumC3159p, AbstractC3039p abstractC3039p, Map<Class<?>, com.bumptech.glide.load.n7h<?>> map, boolean z2, boolean z3, boolean z5, C3087p c3087p, RunnableC3047y.toq<R> toqVar) {
            RunnableC3047y runnableC3047y = (RunnableC3047y) com.bumptech.glide.util.qrj.m11262q(this.f62785toq.mo2983k());
            int i4 = this.f62786zy;
            this.f62786zy = i4 + 1;
            return runnableC3047y.cdj(c3157n, obj, n7hVar, f7l8Var, i2, i3, cls, cls2, enumC3159p, abstractC3039p, map, z2, z3, z5, c3087p, toqVar, i4);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.ld6$q */
    /* JADX INFO: compiled from: Engine.java */
    public class C3035q {

        /* JADX INFO: renamed from: k */
        private final x2<?> f18402k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC3171p f62787toq;

        C3035q(InterfaceC3171p interfaceC3171p, x2<?> x2Var) {
            this.f62787toq = interfaceC3171p;
            this.f18402k = x2Var;
        }

        /* JADX INFO: renamed from: k */
        public void m10789k() {
            synchronized (ld6.this) {
                this.f18402k.t8r(this.f62787toq);
            }
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    @yz
    static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final qrj.InterfaceC0641k<x2<?>> f62789f7l8 = C3205k.m11247n(150, new C3036k());

        /* JADX INFO: renamed from: g */
        final C3031h.k f18403g;

        /* JADX INFO: renamed from: k */
        final ExecutorServiceC3027k f18404k;

        /* JADX INFO: renamed from: n */
        final qrj f18405n;

        /* JADX INFO: renamed from: q */
        final ExecutorServiceC3027k f18406q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final ExecutorServiceC3027k f62790toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final ExecutorServiceC3027k f62791zy;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.ld6$toq$k */
        /* JADX INFO: compiled from: Engine.java */
        class C3036k implements C3205k.q<x2<?>> {
            C3036k() {
            }

            @Override // com.bumptech.glide.util.pool.C3205k.q
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public x2<?> mo10723k() {
                toq toqVar = toq.this;
                return new x2<>(toqVar.f18404k, toqVar.f62790toq, toqVar.f62791zy, toqVar.f18406q, toqVar.f18405n, toqVar.f18403g, toqVar.f62789f7l8);
            }
        }

        toq(ExecutorServiceC3027k executorServiceC3027k, ExecutorServiceC3027k executorServiceC3027k2, ExecutorServiceC3027k executorServiceC3027k3, ExecutorServiceC3027k executorServiceC3027k4, qrj qrjVar, C3031h.k kVar) {
            this.f18404k = executorServiceC3027k;
            this.f62790toq = executorServiceC3027k2;
            this.f62791zy = executorServiceC3027k3;
            this.f18406q = executorServiceC3027k4;
            this.f18405n = qrjVar;
            this.f18403g = kVar;
        }

        /* JADX INFO: renamed from: k */
        <R> x2<R> m10790k(com.bumptech.glide.load.f7l8 f7l8Var, boolean z2, boolean z3, boolean z5, boolean z6) {
            return ((x2) com.bumptech.glide.util.qrj.m11262q(this.f62789f7l8.mo2983k())).x2(f7l8Var, z2, z3, z5, z6);
        }

        @yz
        void toq() {
            C3199g.zy(this.f18404k);
            C3199g.zy(this.f62790toq);
            C3199g.zy(this.f62791zy);
            C3199g.zy(this.f18406q);
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    private static class zy implements RunnableC3047y.n {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3016k.k f18408k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private volatile InterfaceC3016k f62792toq;

        zy(InterfaceC3016k.k kVar) {
            this.f18408k = kVar;
        }

        @Override // com.bumptech.glide.load.engine.RunnableC3047y.n
        /* JADX INFO: renamed from: k */
        public InterfaceC3016k mo10791k() {
            if (this.f62792toq == null) {
                synchronized (this) {
                    if (this.f62792toq == null) {
                        this.f62792toq = this.f18408k.build();
                    }
                    if (this.f62792toq == null) {
                        this.f62792toq = new com.bumptech.glide.load.engine.cache.toq();
                    }
                }
            }
            return this.f62792toq;
        }

        @yz
        synchronized void toq() {
            if (this.f62792toq == null) {
                return;
            }
            this.f62792toq.clear();
        }
    }

    public ld6(InterfaceC3018p interfaceC3018p, InterfaceC3016k.k kVar, ExecutorServiceC3027k executorServiceC3027k, ExecutorServiceC3027k executorServiceC3027k2, ExecutorServiceC3027k executorServiceC3027k3, ExecutorServiceC3027k executorServiceC3027k4, boolean z2) {
        this(interfaceC3018p, kVar, executorServiceC3027k, executorServiceC3027k2, executorServiceC3027k3, executorServiceC3027k4, null, null, null, null, null, null, z2);
    }

    /* JADX INFO: renamed from: g */
    private C3031h<?> m10783g(com.bumptech.glide.load.f7l8 f7l8Var) {
        zurt<?> zurtVarF7l8 = this.f62784zy.f7l8(f7l8Var);
        if (zurtVarF7l8 == null) {
            return null;
        }
        return zurtVarF7l8 instanceof C3031h ? (C3031h) zurtVarF7l8 : new C3031h<>(zurtVarF7l8, true, true, f7l8Var, this);
    }

    private static void ld6(String str, long j2, com.bumptech.glide.load.f7l8 f7l8Var) {
        Log.v(f18394s, str + " in " + C3208s.m11263k(j2) + "ms, key: " + f7l8Var);
    }

    private <R> C3035q n7h(C3157n c3157n, Object obj, com.bumptech.glide.load.f7l8 f7l8Var, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC3159p enumC3159p, AbstractC3039p abstractC3039p, Map<Class<?>, com.bumptech.glide.load.n7h<?>> map, boolean z2, boolean z3, C3087p c3087p, boolean z5, boolean z6, boolean z7, boolean z8, InterfaceC3171p interfaceC3171p, Executor executor, n7h n7hVar, long j2) {
        x2<?> x2VarM10811k = this.f18396k.m10811k(n7hVar, z8);
        if (x2VarM10811k != null) {
            x2VarM10811k.m10818k(interfaceC3171p, executor);
            if (f62781ld6) {
                ld6("Added to existing load", j2, n7hVar);
            }
            return new C3035q(interfaceC3171p, x2VarM10811k);
        }
        x2<R> x2VarM10790k = this.f18398q.m10790k(n7hVar, z5, z6, z7, z8);
        RunnableC3047y<R> runnableC3047yM10788k = this.f62782f7l8.m10788k(c3157n, obj, n7hVar, f7l8Var, i2, i3, cls, cls2, enumC3159p, abstractC3039p, map, z2, z3, z8, c3087p, x2VarM10790k);
        this.f18396k.m10813q(n7hVar, x2VarM10790k);
        x2VarM10790k.m10818k(interfaceC3171p, executor);
        x2VarM10790k.m10817i(runnableC3047yM10788k);
        if (f62781ld6) {
            ld6("Started new load", j2, n7hVar);
        }
        return new C3035q(interfaceC3171p, x2VarM10790k);
    }

    @dd
    /* JADX INFO: renamed from: p */
    private C3031h<?> m10784p(n7h n7hVar, boolean z2, long j2) {
        if (!z2) {
            return null;
        }
        C3031h<?> c3031hM10786y = m10786y(n7hVar);
        if (c3031hM10786y != null) {
            if (f62781ld6) {
                ld6("Loaded resource from active resources", j2, n7hVar);
            }
            return c3031hM10786y;
        }
        C3031h<?> c3031hM10785s = m10785s(n7hVar);
        if (c3031hM10785s == null) {
            return null;
        }
        if (f62781ld6) {
            ld6("Loaded resource from cache", j2, n7hVar);
        }
        return c3031hM10785s;
    }

    /* JADX INFO: renamed from: s */
    private C3031h<?> m10785s(com.bumptech.glide.load.f7l8 f7l8Var) {
        C3031h<?> c3031hM10783g = m10783g(f7l8Var);
        if (c3031hM10783g != null) {
            c3031hM10783g.m10770k();
            this.f18399y.m10775k(f7l8Var, c3031hM10783g);
        }
        return c3031hM10783g;
    }

    @dd
    /* JADX INFO: renamed from: y */
    private C3031h<?> m10786y(com.bumptech.glide.load.f7l8 f7l8Var) {
        C3031h<?> c3031hM10776n = this.f18399y.m10776n(f7l8Var);
        if (c3031hM10776n != null) {
            c3031hM10776n.m10770k();
        }
        return c3031hM10776n;
    }

    public <R> C3035q f7l8(C3157n c3157n, Object obj, com.bumptech.glide.load.f7l8 f7l8Var, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC3159p enumC3159p, AbstractC3039p abstractC3039p, Map<Class<?>, com.bumptech.glide.load.n7h<?>> map, boolean z2, boolean z3, C3087p c3087p, boolean z5, boolean z6, boolean z7, boolean z8, InterfaceC3171p interfaceC3171p, Executor executor) {
        long qVar = f62781ld6 ? C3208s.toq() : 0L;
        n7h n7hVarM10782k = this.f62783toq.m10782k(obj, f7l8Var, i2, i3, map, cls, cls2, c3087p);
        synchronized (this) {
            C3031h<?> c3031hM10784p = m10784p(n7hVarM10782k, z5, qVar);
            if (c3031hM10784p == null) {
                return n7h(c3157n, obj, f7l8Var, i2, i3, cls, cls2, enumC3159p, abstractC3039p, map, z2, z3, c3087p, z5, z6, z7, z8, interfaceC3171p, executor, n7hVarM10782k, qVar);
            }
            interfaceC3171p.toq(c3031hM10784p, EnumC3050k.MEMORY_CACHE, false);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3018p.k
    /* JADX INFO: renamed from: k */
    public void mo10721k(@lvui zurt<?> zurtVar) {
        this.f18397n.m10837k(zurtVar, true);
    }

    /* JADX INFO: renamed from: n */
    public void m10787n() {
        this.f18395g.mo10791k().clear();
    }

    @Override // com.bumptech.glide.load.engine.C3031h.k
    /* JADX INFO: renamed from: q */
    public void mo10772q(com.bumptech.glide.load.f7l8 f7l8Var, C3031h<?> c3031h) {
        this.f18399y.m10777q(f7l8Var);
        if (c3031h.m10769g()) {
            this.f62784zy.mo10713g(f7l8Var, c3031h);
        } else {
            this.f18397n.m10837k(c3031h, false);
        }
    }

    @yz
    public void qrj() {
        this.f18398q.toq();
        this.f18395g.toq();
        this.f18399y.m10778y();
    }

    @Override // com.bumptech.glide.load.engine.qrj
    public synchronized void toq(x2<?> x2Var, com.bumptech.glide.load.f7l8 f7l8Var, C3031h<?> c3031h) {
        if (c3031h != null) {
            if (c3031h.m10769g()) {
                this.f18399y.m10775k(f7l8Var, c3031h);
            }
            this.f18396k.m10812n(f7l8Var, x2Var);
        } else {
            this.f18396k.m10812n(f7l8Var, x2Var);
        }
    }

    public void x2(zurt<?> zurtVar) {
        if (!(zurtVar instanceof C3031h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3031h) zurtVar).f7l8();
    }

    @Override // com.bumptech.glide.load.engine.qrj
    public synchronized void zy(x2<?> x2Var, com.bumptech.glide.load.f7l8 f7l8Var) {
        this.f18396k.m10812n(f7l8Var, x2Var);
    }

    @yz
    ld6(InterfaceC3018p interfaceC3018p, InterfaceC3016k.k kVar, ExecutorServiceC3027k executorServiceC3027k, ExecutorServiceC3027k executorServiceC3027k2, ExecutorServiceC3027k executorServiceC3027k3, ExecutorServiceC3027k executorServiceC3027k4, t8r t8rVar, kja0 kja0Var, C3033k c3033k, toq toqVar, C3034k c3034k, C3048z c3048z, boolean z2) {
        this.f62784zy = interfaceC3018p;
        zy zyVar = new zy(kVar);
        this.f18395g = zyVar;
        C3033k c3033k2 = c3033k == null ? new C3033k(z2) : c3033k;
        this.f18399y = c3033k2;
        c3033k2.f7l8(this);
        this.f62783toq = kja0Var == null ? new kja0() : kja0Var;
        this.f18396k = t8rVar == null ? new t8r() : t8rVar;
        this.f18398q = toqVar == null ? new toq(executorServiceC3027k, executorServiceC3027k2, executorServiceC3027k3, executorServiceC3027k4, this, this) : toqVar;
        this.f62782f7l8 = c3034k == null ? new C3034k(zyVar) : c3034k;
        this.f18397n = c3048z == null ? new C3048z() : c3048z;
        interfaceC3018p.mo10717y(this);
    }
}

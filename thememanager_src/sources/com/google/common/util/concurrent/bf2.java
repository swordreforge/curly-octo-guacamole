package com.google.common.util.concurrent;

import com.google.common.collect.ab;
import com.google.common.collect.gcp;
import com.google.common.collect.ktq;
import com.google.common.collect.kx3;
import com.google.common.collect.mbx;
import com.google.common.collect.o05;
import com.google.common.collect.oki;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.wlev;
import com.google.common.collect.wt;
import com.google.common.collect.z4;
import com.google.common.collect.zkd;
import com.google.common.util.concurrent.InterfaceC4785b;
import com.google.common.util.concurrent.hb;
import com.google.common.util.concurrent.vyq;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.xiaomi.onetrack.p009a.C5675a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ServiceManager.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public final class bf2 {

    /* JADX INFO: renamed from: k */
    private final f7l8 f27376k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final se<InterfaceC4785b> f68618toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Logger f68617zy = Logger.getLogger(bf2.class.getName());

    /* JADX INFO: renamed from: q */
    private static final vyq.InterfaceC4845k<AbstractC4791q> f27375q = new C4789k();

    /* JADX INFO: renamed from: n */
    private static final vyq.InterfaceC4845k<AbstractC4791q> f27374n = new toq();

    /* JADX INFO: compiled from: ServiceManager.java */
    private static final class f7l8 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final int f68619f7l8;

        /* JADX INFO: renamed from: g */
        @GuardedBy(C5675a.a.f31582b)
        boolean f27377g;

        /* JADX INFO: renamed from: k */
        final hb f27378k = new hb();

        /* JADX INFO: renamed from: n */
        @GuardedBy(C5675a.a.f31582b)
        boolean f27379n;

        /* JADX INFO: renamed from: p */
        final vyq<AbstractC4791q> f27380p;

        /* JADX INFO: renamed from: q */
        @GuardedBy(C5675a.a.f31582b)
        final Map<InterfaceC4785b, com.google.common.base.eqxt> f27381q;

        /* JADX INFO: renamed from: s */
        final hb.AbstractC4811k f27382s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @GuardedBy(C5675a.a.f31582b)
        final wt<InterfaceC4785b.zy, InterfaceC4785b> f68620toq;

        /* JADX INFO: renamed from: y */
        final hb.AbstractC4811k f27383y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @GuardedBy(C5675a.a.f31582b)
        final o05<InterfaceC4785b.zy> f68621zy;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.bf2$f7l8$k */
        /* JADX INFO: compiled from: ServiceManager.java */
        class C4786k implements com.google.common.base.t8r<Map.Entry<InterfaceC4785b, Long>, Long> {
            C4786k() {
            }

            @Override // com.google.common.base.t8r
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Long apply(Map.Entry<InterfaceC4785b, Long> entry) {
                return entry.getValue();
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.bf2$f7l8$q */
        /* JADX INFO: compiled from: ServiceManager.java */
        final class C4787q extends hb.AbstractC4811k {
            C4787q() {
                super(f7l8.this.f27378k);
            }

            @Override // com.google.common.util.concurrent.hb.AbstractC4811k
            @GuardedBy("ServiceManagerState.this.monitor")
            /* JADX INFO: renamed from: k */
            public boolean mo16888k() {
                return f7l8.this.f68621zy.count(InterfaceC4785b.zy.TERMINATED) + f7l8.this.f68621zy.count(InterfaceC4785b.zy.FAILED) == f7l8.this.f68619f7l8;
            }
        }

        /* JADX INFO: compiled from: ServiceManager.java */
        class toq implements vyq.InterfaceC4845k<AbstractC4791q> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC4785b f27386k;

            toq(InterfaceC4785b interfaceC4785b) {
                this.f27386k = interfaceC4785b;
            }

            public String toString() {
                return "failed({service=" + this.f27386k + "})";
            }

            @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public void mo16889k(AbstractC4791q abstractC4791q) {
                abstractC4791q.m16890k(this.f27386k);
            }
        }

        /* JADX INFO: compiled from: ServiceManager.java */
        final class zy extends hb.AbstractC4811k {
            zy() {
                super(f7l8.this.f27378k);
            }

            @Override // com.google.common.util.concurrent.hb.AbstractC4811k
            @GuardedBy("ServiceManagerState.this.monitor")
            /* JADX INFO: renamed from: k */
            public boolean mo16888k() {
                int iCount = f7l8.this.f68621zy.count(InterfaceC4785b.zy.RUNNING);
                f7l8 f7l8Var = f7l8.this;
                return iCount == f7l8Var.f68619f7l8 || f7l8Var.f68621zy.contains(InterfaceC4785b.zy.STOPPING) || f7l8.this.f68621zy.contains(InterfaceC4785b.zy.TERMINATED) || f7l8.this.f68621zy.contains(InterfaceC4785b.zy.FAILED);
            }
        }

        f7l8(z4<InterfaceC4785b> z4Var) {
            wt<InterfaceC4785b.zy, InterfaceC4785b> wtVarMo15725k = gcp.zy(InterfaceC4785b.zy.class).f7l8().mo15725k();
            this.f68620toq = wtVarMo15725k;
            this.f68621zy = wtVarMo15725k.keys();
            this.f27381q = vy.hb();
            this.f27383y = new zy();
            this.f27382s = new C4787q();
            this.f27380p = new vyq<>();
            this.f68619f7l8 = z4Var.size();
            wtVarMo15725k.putAll(InterfaceC4785b.zy.NEW, z4Var);
        }

        void f7l8() {
            com.google.common.base.jk.y9n(!this.f27378k.m16948t(), "It is incorrect to execute listeners with the monitor held.");
            this.f27380p.zy();
        }

        @GuardedBy(C5675a.a.f31582b)
        /* JADX INFO: renamed from: g */
        void m16880g() {
            o05<InterfaceC4785b.zy> o05Var = this.f68621zy;
            InterfaceC4785b.zy zyVar = InterfaceC4785b.zy.RUNNING;
            if (o05Var.count(zyVar) == this.f68619f7l8) {
                return;
            }
            throw new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + oki.n7h(this.f68620toq, com.google.common.base.fti.cdj(com.google.common.base.fti.qrj(zyVar))));
        }

        /* JADX INFO: renamed from: k */
        void m16881k(AbstractC4791q abstractC4791q, Executor executor) {
            this.f27380p.toq(abstractC4791q, executor);
        }

        void kja0(InterfaceC4785b interfaceC4785b) {
            this.f27378k.f7l8();
            try {
                if (this.f27381q.get(interfaceC4785b) == null) {
                    this.f27381q.put(interfaceC4785b, com.google.common.base.eqxt.zy());
                }
            } finally {
                this.f27378k.jk();
            }
        }

        void ld6() {
            this.f27378k.f7l8();
            try {
                if (!this.f27377g) {
                    this.f27379n = true;
                    return;
                }
                ArrayList arrayListCdj = wlev.cdj();
                ab<InterfaceC4785b> it = x2().values().iterator();
                while (it.hasNext()) {
                    InterfaceC4785b next = it.next();
                    if (next.state() != InterfaceC4785b.zy.NEW) {
                        arrayListCdj.add(next);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayListCdj);
            } finally {
                this.f27378k.jk();
            }
        }

        /* JADX INFO: renamed from: n */
        void m16882n(long j2, TimeUnit timeUnit) throws TimeoutException {
            this.f27378k.f7l8();
            try {
                if (this.f27378k.m16946r(this.f27382s, j2, timeUnit)) {
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + oki.n7h(this.f68620toq, com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(EnumSet.of(InterfaceC4785b.zy.TERMINATED, InterfaceC4785b.zy.FAILED)))));
            } finally {
                this.f27378k.jk();
            }
        }

        void n7h(InterfaceC4785b interfaceC4785b, InterfaceC4785b.zy zyVar, InterfaceC4785b.zy zyVar2) {
            com.google.common.base.jk.a9(interfaceC4785b);
            com.google.common.base.jk.m15383q(zyVar != zyVar2);
            this.f27378k.f7l8();
            try {
                this.f27377g = true;
                if (this.f27379n) {
                    com.google.common.base.jk.ikck(this.f68620toq.remove(zyVar, interfaceC4785b), "Service %s not at the expected location in the state map %s", interfaceC4785b, zyVar);
                    com.google.common.base.jk.ikck(this.f68620toq.put(zyVar2, interfaceC4785b), "Service %s in the state map unexpectedly at %s", interfaceC4785b, zyVar2);
                    com.google.common.base.eqxt eqxtVarZy = this.f27381q.get(interfaceC4785b);
                    if (eqxtVarZy == null) {
                        eqxtVarZy = com.google.common.base.eqxt.zy();
                        this.f27381q.put(interfaceC4785b, eqxtVarZy);
                    }
                    InterfaceC4785b.zy zyVar3 = InterfaceC4785b.zy.RUNNING;
                    if (zyVar2.compareTo(zyVar3) >= 0 && eqxtVarZy.m15332s()) {
                        eqxtVarZy.x2();
                        if (!(interfaceC4785b instanceof C4790n)) {
                            bf2.f68617zy.log(Level.FINE, "Started {0} in {1}.", new Object[]{interfaceC4785b, eqxtVarZy});
                        }
                    }
                    InterfaceC4785b.zy zyVar4 = InterfaceC4785b.zy.FAILED;
                    if (zyVar2 == zyVar4) {
                        m16886y(interfaceC4785b);
                    }
                    if (this.f68621zy.count(zyVar3) == this.f68619f7l8) {
                        m16885s();
                    } else if (this.f68621zy.count(InterfaceC4785b.zy.TERMINATED) + this.f68621zy.count(zyVar4) == this.f68619f7l8) {
                        m16883p();
                    }
                }
            } finally {
                this.f27378k.jk();
                f7l8();
            }
        }

        /* JADX INFO: renamed from: p */
        void m16883p() {
            this.f27380p.m17022q(bf2.f27374n);
        }

        /* JADX INFO: renamed from: q */
        void m16884q() {
            this.f27378k.cdj(this.f27382s);
            this.f27378k.jk();
        }

        zkd<InterfaceC4785b, Long> qrj() {
            this.f27378k.f7l8();
            try {
                ArrayList arrayListFn3e = wlev.fn3e(this.f27381q.size());
                for (Map.Entry<InterfaceC4785b, com.google.common.base.eqxt> entry : this.f27381q.entrySet()) {
                    InterfaceC4785b key = entry.getKey();
                    com.google.common.base.eqxt value = entry.getValue();
                    if (!value.m15332s() && !(key instanceof C4790n)) {
                        arrayListFn3e.add(vy.dd(key, Long.valueOf(value.f7l8(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f27378k.jk();
                Collections.sort(arrayListFn3e, kx3.natural().onResultOf(new C4786k()));
                return zkd.copyOf(arrayListFn3e);
            } catch (Throwable th) {
                this.f27378k.jk();
                throw th;
            }
        }

        /* JADX INFO: renamed from: s */
        void m16885s() {
            this.f27380p.m17022q(bf2.f27375q);
        }

        void toq() {
            this.f27378k.cdj(this.f27383y);
            try {
                m16880g();
            } finally {
                this.f27378k.jk();
            }
        }

        ktq<InterfaceC4785b.zy, InterfaceC4785b> x2() {
            mbx.C4461k c4461kBuilder = mbx.builder();
            this.f27378k.f7l8();
            try {
                for (Map.Entry<InterfaceC4785b.zy, InterfaceC4785b> entry : this.f68620toq.entries()) {
                    if (!(entry.getValue() instanceof C4790n)) {
                        c4461kBuilder.f7l8(entry);
                    }
                }
                this.f27378k.jk();
                return c4461kBuilder.mo15714k();
            } catch (Throwable th) {
                this.f27378k.jk();
                throw th;
            }
        }

        /* JADX INFO: renamed from: y */
        void m16886y(InterfaceC4785b interfaceC4785b) {
            this.f27380p.m17022q(new toq(interfaceC4785b));
        }

        void zy(long j2, TimeUnit timeUnit) throws TimeoutException {
            this.f27378k.f7l8();
            try {
                if (this.f27378k.m16946r(this.f27383y, j2, timeUnit)) {
                    m16880g();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + oki.n7h(this.f68620toq, com.google.common.base.fti.n7h(vep5.of(InterfaceC4785b.zy.NEW, InterfaceC4785b.zy.STARTING))));
            } finally {
                this.f27378k.jk();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.bf2$g */
    /* JADX INFO: compiled from: ServiceManager.java */
    private static final class C4788g extends InterfaceC4785b.toq {

        /* JADX INFO: renamed from: k */
        final InterfaceC4785b f27388k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final WeakReference<f7l8> f68623toq;

        C4788g(InterfaceC4785b interfaceC4785b, WeakReference<f7l8> weakReference) {
            this.f27388k = interfaceC4785b;
            this.f68623toq = weakReference;
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        /* JADX INFO: renamed from: k */
        public void mo16870k(InterfaceC4785b.zy zyVar, Throwable th) {
            f7l8 f7l8Var = this.f68623toq.get();
            if (f7l8Var != null) {
                if (!(this.f27388k instanceof C4790n)) {
                    bf2.f68617zy.log(Level.SEVERE, "Service " + this.f27388k + " has failed in the " + zyVar + " state.", th);
                }
                f7l8Var.n7h(this.f27388k, zyVar, InterfaceC4785b.zy.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        /* JADX INFO: renamed from: n */
        public void mo16871n(InterfaceC4785b.zy zyVar) {
            f7l8 f7l8Var = this.f68623toq.get();
            if (f7l8Var != null) {
                if (!(this.f27388k instanceof C4790n)) {
                    bf2.f68617zy.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f27388k, zyVar});
                }
                f7l8Var.n7h(this.f27388k, zyVar, InterfaceC4785b.zy.TERMINATED);
            }
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        /* JADX INFO: renamed from: q */
        public void mo16872q(InterfaceC4785b.zy zyVar) {
            f7l8 f7l8Var = this.f68623toq.get();
            if (f7l8Var != null) {
                f7l8Var.n7h(this.f27388k, zyVar, InterfaceC4785b.zy.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        public void toq() {
            f7l8 f7l8Var = this.f68623toq.get();
            if (f7l8Var != null) {
                f7l8Var.n7h(this.f27388k, InterfaceC4785b.zy.STARTING, InterfaceC4785b.zy.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.InterfaceC4785b.toq
        public void zy() {
            f7l8 f7l8Var = this.f68623toq.get();
            if (f7l8Var != null) {
                f7l8Var.n7h(this.f27388k, InterfaceC4785b.zy.NEW, InterfaceC4785b.zy.STARTING);
                if (this.f27388k instanceof C4790n) {
                    return;
                }
                bf2.f68617zy.log(Level.FINE, "Starting {0}.", this.f27388k);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.bf2$k */
    /* JADX INFO: compiled from: ServiceManager.java */
    static class C4789k implements vyq.InterfaceC4845k<AbstractC4791q> {
        C4789k() {
        }

        public String toString() {
            return "healthy()";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(AbstractC4791q abstractC4791q) {
            abstractC4791q.toq();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.bf2$n */
    /* JADX INFO: compiled from: ServiceManager.java */
    private static final class C4790n extends AbstractC4839s {
        private C4790n() {
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected void n7h() {
            zurt();
        }

        @Override // com.google.common.util.concurrent.AbstractC4839s
        protected void qrj() {
            fn3e();
        }

        /* synthetic */ C4790n(C4789k c4789k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.bf2$q */
    /* JADX INFO: compiled from: ServiceManager.java */
    @InterfaceC7731k
    public static abstract class AbstractC4791q {
        /* JADX INFO: renamed from: k */
        public void m16890k(InterfaceC4785b interfaceC4785b) {
        }

        public void toq() {
        }

        public void zy() {
        }
    }

    /* JADX INFO: compiled from: ServiceManager.java */
    static class toq implements vyq.InterfaceC4845k<AbstractC4791q> {
        toq() {
        }

        public String toString() {
            return "stopped()";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(AbstractC4791q abstractC4791q) {
            abstractC4791q.zy();
        }
    }

    /* JADX INFO: compiled from: ServiceManager.java */
    private static final class zy extends Throwable {
        private zy() {
        }

        /* synthetic */ zy(C4789k c4789k) {
            this();
        }
    }

    public bf2(Iterable<? extends InterfaceC4785b> iterable) {
        se<InterfaceC4785b> seVarCopyOf = se.copyOf(iterable);
        if (seVarCopyOf.isEmpty()) {
            C4789k c4789k = null;
            f68617zy.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new zy(c4789k));
            seVarCopyOf = se.of(new C4790n(c4789k));
        }
        f7l8 f7l8Var = new f7l8(seVarCopyOf);
        this.f27376k = f7l8Var;
        this.f68618toq = seVarCopyOf;
        WeakReference weakReference = new WeakReference(f7l8Var);
        ab<InterfaceC4785b> it = seVarCopyOf.iterator();
        while (it.hasNext()) {
            InterfaceC4785b next = it.next();
            next.mo16866k(new C4788g(next, weakReference), C4815j.zy());
            com.google.common.base.jk.fn3e(next.state() == InterfaceC4785b.zy.NEW, "Can only manage NEW services, %s", next);
        }
        this.f27376k.ld6();
    }

    public void f7l8(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f27376k.zy(j2, timeUnit);
    }

    /* JADX INFO: renamed from: g */
    public void m16874g() {
        this.f27376k.toq();
    }

    public ktq<InterfaceC4785b.zy, InterfaceC4785b> ld6() {
        return this.f27376k.x2();
    }

    /* JADX INFO: renamed from: n */
    public void m16875n(AbstractC4791q abstractC4791q, Executor executor) {
        this.f27376k.m16881k(abstractC4791q, executor);
    }

    @CanIgnoreReturnValue
    public bf2 n7h() {
        ab<InterfaceC4785b> it = this.f68618toq.iterator();
        while (it.hasNext()) {
            it.next().mo16869y();
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m16876p() {
        ab<InterfaceC4785b> it = this.f68618toq.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m16877q(AbstractC4791q abstractC4791q) {
        this.f27376k.m16881k(abstractC4791q, C4815j.zy());
    }

    public zkd<InterfaceC4785b, Long> qrj() {
        return this.f27376k.qrj();
    }

    /* JADX INFO: renamed from: s */
    public void m16878s(long j2, TimeUnit timeUnit) throws TimeoutException {
        this.f27376k.m16882n(j2, timeUnit);
    }

    public String toString() {
        return com.google.common.base.fu4.toq(bf2.class).m15356g("services", com.google.common.collect.mcp.m15859n(this.f68618toq, com.google.common.base.fti.cdj(com.google.common.base.fti.kja0(C4790n.class)))).toString();
    }

    @CanIgnoreReturnValue
    public bf2 x2() {
        ab<InterfaceC4785b> it = this.f68618toq.iterator();
        while (it.hasNext()) {
            InterfaceC4785b next = it.next();
            InterfaceC4785b.zy zyVarState = next.state();
            com.google.common.base.jk.ikck(zyVarState == InterfaceC4785b.zy.NEW, "Service %s is %s, cannot start it.", next, zyVarState);
        }
        ab<InterfaceC4785b> it2 = this.f68618toq.iterator();
        while (it2.hasNext()) {
            InterfaceC4785b next2 = it2.next();
            try {
                this.f27376k.kja0(next2);
                next2.mo16867n();
            } catch (IllegalStateException e2) {
                f68617zy.log(Level.WARNING, "Unable to start Service " + next2, (Throwable) e2);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m16879y() {
        this.f27376k.m16884q();
    }
}

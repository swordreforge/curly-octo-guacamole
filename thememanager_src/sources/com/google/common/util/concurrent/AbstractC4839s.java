package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterfaceC4785b;
import com.google.common.util.concurrent.hb;
import com.google.common.util.concurrent.vyq;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.xiaomi.onetrack.p009a.C5675a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.s */
/* JADX INFO: compiled from: AbstractService.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public abstract class AbstractC4839s implements InterfaceC4785b {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f68656kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f68657ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f68658n7h;

    /* JADX INFO: renamed from: p */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f27526p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f68659qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f68660x2;

    /* JADX INFO: renamed from: y */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f27528y = new k();

    /* JADX INFO: renamed from: s */
    private static final vyq.InterfaceC4845k<InterfaceC4785b.toq> f27527s = new toq();

    /* JADX INFO: renamed from: k */
    private final hb f27530k = new hb();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final hb.AbstractC4811k f68662toq = new y();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final hb.AbstractC4811k f68663zy = new s();

    /* JADX INFO: renamed from: q */
    private final hb.AbstractC4811k f27532q = new f7l8();

    /* JADX INFO: renamed from: n */
    private final hb.AbstractC4811k f27531n = new p();

    /* JADX INFO: renamed from: g */
    private final vyq<InterfaceC4785b.toq> f27529g = new vyq<>();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile ld6 f68661f7l8 = new ld6(InterfaceC4785b.zy.NEW);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$f7l8 */
    /* JADX INFO: compiled from: AbstractService.java */
    private final class f7l8 extends hb.AbstractC4811k {
        f7l8() {
            super(AbstractC4839s.this.f27530k);
        }

        @Override // com.google.common.util.concurrent.hb.AbstractC4811k
        /* JADX INFO: renamed from: k */
        public boolean mo16888k() {
            return AbstractC4839s.this.state().compareTo(InterfaceC4785b.zy.RUNNING) >= 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$g */
    /* JADX INFO: compiled from: AbstractService.java */
    static /* synthetic */ class g {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f27534k;

        static {
            int[] iArr = new int[InterfaceC4785b.zy.values().length];
            f27534k = iArr;
            try {
                iArr[InterfaceC4785b.zy.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27534k[InterfaceC4785b.zy.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27534k[InterfaceC4785b.zy.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27534k[InterfaceC4785b.zy.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27534k[InterfaceC4785b.zy.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27534k[InterfaceC4785b.zy.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$k */
    /* JADX INFO: compiled from: AbstractService.java */
    static class k implements vyq.InterfaceC4845k<InterfaceC4785b.toq> {
        k() {
        }

        public String toString() {
            return "starting()";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(InterfaceC4785b.toq toqVar) {
            toqVar.zy();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$ld6 */
    /* JADX INFO: compiled from: AbstractService.java */
    private static final class ld6 {

        /* JADX INFO: renamed from: k */
        final InterfaceC4785b.zy f27535k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final boolean f68664toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @NullableDecl
        final Throwable f68665zy;

        ld6(InterfaceC4785b.zy zyVar) {
            this(zyVar, false, null);
        }

        /* JADX INFO: renamed from: k */
        InterfaceC4785b.zy m17013k() {
            return (this.f68664toq && this.f27535k == InterfaceC4785b.zy.STARTING) ? InterfaceC4785b.zy.STOPPING : this.f27535k;
        }

        Throwable toq() {
            InterfaceC4785b.zy zyVar = this.f27535k;
            com.google.common.base.jk.gyi(zyVar == InterfaceC4785b.zy.FAILED, "failureCause() is only valid if the service has failed, service is %s", zyVar);
            return this.f68665zy;
        }

        ld6(InterfaceC4785b.zy zyVar, boolean z2, @NullableDecl Throwable th) {
            com.google.common.base.jk.fn3e(!z2 || zyVar == InterfaceC4785b.zy.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", zyVar);
            com.google.common.base.jk.m15391z(!((zyVar == InterfaceC4785b.zy.FAILED) ^ (th != null)), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", zyVar, th);
            this.f27535k = zyVar;
            this.f68664toq = z2;
            this.f68665zy = th;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$n */
    /* JADX INFO: compiled from: AbstractService.java */
    class n implements vyq.InterfaceC4845k<InterfaceC4785b.toq> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4785b.zy f27536k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Throwable f68666toq;

        n(InterfaceC4785b.zy zyVar, Throwable th) {
            this.f27536k = zyVar;
            this.f68666toq = th;
        }

        public String toString() {
            return "failed({from = " + this.f27536k + ", cause = " + this.f68666toq + "})";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(InterfaceC4785b.toq toqVar) {
            toqVar.mo16870k(this.f27536k, this.f68666toq);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$p */
    /* JADX INFO: compiled from: AbstractService.java */
    private final class p extends hb.AbstractC4811k {
        p() {
            super(AbstractC4839s.this.f27530k);
        }

        @Override // com.google.common.util.concurrent.hb.AbstractC4811k
        /* JADX INFO: renamed from: k */
        public boolean mo16888k() {
            return AbstractC4839s.this.state().isTerminal();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$q */
    /* JADX INFO: compiled from: AbstractService.java */
    static class q implements vyq.InterfaceC4845k<InterfaceC4785b.toq> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4785b.zy f27538k;

        q(InterfaceC4785b.zy zyVar) {
            this.f27538k = zyVar;
        }

        public String toString() {
            return "stopping({from = " + this.f27538k + "})";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(InterfaceC4785b.toq toqVar) {
            toqVar.mo16872q(this.f27538k);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$s */
    /* JADX INFO: compiled from: AbstractService.java */
    private final class s extends hb.AbstractC4811k {
        s() {
            super(AbstractC4839s.this.f27530k);
        }

        @Override // com.google.common.util.concurrent.hb.AbstractC4811k
        /* JADX INFO: renamed from: k */
        public boolean mo16888k() {
            return AbstractC4839s.this.state().compareTo(InterfaceC4785b.zy.RUNNING) <= 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$toq */
    /* JADX INFO: compiled from: AbstractService.java */
    static class toq implements vyq.InterfaceC4845k<InterfaceC4785b.toq> {
        toq() {
        }

        public String toString() {
            return "running()";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(InterfaceC4785b.toq toqVar) {
            toqVar.toq();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$y */
    /* JADX INFO: compiled from: AbstractService.java */
    private final class y extends hb.AbstractC4811k {
        y() {
            super(AbstractC4839s.this.f27530k);
        }

        @Override // com.google.common.util.concurrent.hb.AbstractC4811k
        /* JADX INFO: renamed from: k */
        public boolean mo16888k() {
            return AbstractC4839s.this.state() == InterfaceC4785b.zy.NEW;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.s$zy */
    /* JADX INFO: compiled from: AbstractService.java */
    static class zy implements vyq.InterfaceC4845k<InterfaceC4785b.toq> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4785b.zy f27541k;

        zy(InterfaceC4785b.zy zyVar) {
            this.f27541k = zyVar;
        }

        public String toString() {
            return "terminated({from = " + this.f27541k + "})";
        }

        @Override // com.google.common.util.concurrent.vyq.InterfaceC4845k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo16889k(InterfaceC4785b.toq toqVar) {
            toqVar.mo16871n(this.f27541k);
        }
    }

    static {
        InterfaceC4785b.zy zyVar = InterfaceC4785b.zy.STARTING;
        f27526p = ni7(zyVar);
        InterfaceC4785b.zy zyVar2 = InterfaceC4785b.zy.RUNNING;
        f68657ld6 = ni7(zyVar2);
        f68660x2 = fu4(InterfaceC4785b.zy.NEW);
        f68659qrj = fu4(zyVar);
        f68658n7h = fu4(zyVar2);
        f68656kja0 = fu4(InterfaceC4785b.zy.STOPPING);
    }

    protected AbstractC4839s() {
    }

    private void cdj() {
        this.f27529g.m17022q(f27528y);
    }

    private static vyq.InterfaceC4845k<InterfaceC4785b.toq> fu4(InterfaceC4785b.zy zyVar) {
        return new zy(zyVar);
    }

    /* JADX INFO: renamed from: h */
    private void m17009h() {
        this.f27529g.m17022q(f27527s);
    }

    private void ki(InterfaceC4785b.zy zyVar) {
        if (zyVar == InterfaceC4785b.zy.STARTING) {
            this.f27529g.m17022q(f27526p);
        } else {
            if (zyVar != InterfaceC4785b.zy.RUNNING) {
                throw new AssertionError();
            }
            this.f27529g.m17022q(f68657ld6);
        }
    }

    private void kja0(InterfaceC4785b.zy zyVar, Throwable th) {
        this.f27529g.m17022q(new n(zyVar, th));
    }

    private void ld6() {
        if (this.f27530k.m16948t()) {
            return;
        }
        this.f27529g.zy();
    }

    private static vyq.InterfaceC4845k<InterfaceC4785b.toq> ni7(InterfaceC4785b.zy zyVar) {
        return new q(zyVar);
    }

    @GuardedBy(C5675a.a.f31582b)
    /* JADX INFO: renamed from: p */
    private void m17010p(InterfaceC4785b.zy zyVar) {
        InterfaceC4785b.zy zyVarState = state();
        if (zyVarState != zyVar) {
            if (zyVarState == InterfaceC4785b.zy.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + zyVar + ", but the service has FAILED", f7l8());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + zyVar + ", but was " + zyVarState);
        }
    }

    private void t8r(InterfaceC4785b.zy zyVar) {
        switch (g.f27534k[zyVar.ordinal()]) {
            case 1:
                this.f27529g.m17022q(f68660x2);
                return;
            case 2:
                this.f27529g.m17022q(f68659qrj);
                return;
            case 3:
                this.f27529g.m17022q(f68658n7h);
                return;
            case 4:
                this.f27529g.m17022q(f68656kja0);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final Throwable f7l8() {
        return this.f68661f7l8.toq();
    }

    protected final void fn3e() {
        this.f27530k.f7l8();
        try {
            if (this.f68661f7l8.f27535k == InterfaceC4785b.zy.STARTING) {
                if (this.f68661f7l8.f68664toq) {
                    this.f68661f7l8 = new ld6(InterfaceC4785b.zy.STOPPING);
                    n7h();
                } else {
                    this.f68661f7l8 = new ld6(InterfaceC4785b.zy.RUNNING);
                    m17009h();
                }
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.f68661f7l8.f27535k);
            m17012i(illegalStateException);
            throw illegalStateException;
        } finally {
            this.f27530k.jk();
            ld6();
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: g */
    public final void mo16865g() {
        this.f27530k.cdj(this.f27532q);
        try {
            m17010p(InterfaceC4785b.zy.RUNNING);
        } finally {
            this.f27530k.jk();
        }
    }

    /* JADX INFO: renamed from: i */
    protected final void m17012i(Throwable th) {
        com.google.common.base.jk.a9(th);
        this.f27530k.f7l8();
        try {
            InterfaceC4785b.zy zyVarState = state();
            int i2 = g.f27534k[zyVarState.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    this.f68661f7l8 = new ld6(InterfaceC4785b.zy.FAILED, false, th);
                    kja0(zyVarState, th);
                } else if (i2 != 5) {
                }
                return;
            }
            throw new IllegalStateException("Failed while in state:" + zyVarState, th);
        } finally {
            this.f27530k.jk();
            ld6();
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final boolean isRunning() {
        return state() == InterfaceC4785b.zy.RUNNING;
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: k */
    public final void mo16866k(InterfaceC4785b.toq toqVar, Executor executor) {
        this.f27529g.toq(toqVar, executor);
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public final InterfaceC4785b mo16867n() {
        if (this.f27530k.m16947s(this.f68662toq)) {
            try {
                this.f68661f7l8 = new ld6(InterfaceC4785b.zy.STARTING);
                cdj();
                qrj();
            } finally {
                try {
                } finally {
                }
            }
            return this;
        }
        throw new IllegalStateException("Service " + this + " has already been started");
    }

    @ForOverride
    protected abstract void n7h();

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    /* JADX INFO: renamed from: q */
    public final void mo16868q() {
        this.f27530k.cdj(this.f27531n);
        try {
            m17010p(InterfaceC4785b.zy.TERMINATED);
        } finally {
            this.f27530k.jk();
        }
    }

    @ForOverride
    protected abstract void qrj();

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final InterfaceC4785b.zy state() {
        return this.f68661f7l8.m17013k();
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void toq(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.f27530k.ki(this.f27532q, j2, timeUnit)) {
            try {
                m17010p(InterfaceC4785b.zy.RUNNING);
            } finally {
                this.f27530k.jk();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
        }
    }

    @ForOverride
    protected void x2() {
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    public final InterfaceC4785b mo16869y() {
        if (this.f27530k.m16947s(this.f68663zy)) {
            try {
                InterfaceC4785b.zy zyVarState = state();
                switch (g.f27534k[zyVarState.ordinal()]) {
                    case 1:
                        this.f68661f7l8 = new ld6(InterfaceC4785b.zy.TERMINATED);
                        t8r(InterfaceC4785b.zy.NEW);
                        break;
                    case 2:
                        InterfaceC4785b.zy zyVar = InterfaceC4785b.zy.STARTING;
                        this.f68661f7l8 = new ld6(zyVar, true, null);
                        ki(zyVar);
                        x2();
                        break;
                    case 3:
                        this.f68661f7l8 = new ld6(InterfaceC4785b.zy.STOPPING);
                        ki(InterfaceC4785b.zy.RUNNING);
                        n7h();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new AssertionError("isStoppable is incorrectly implemented, saw: " + zyVarState);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return this;
    }

    protected final void zurt() {
        this.f27530k.f7l8();
        try {
            InterfaceC4785b.zy zyVarState = state();
            switch (g.f27534k[zyVarState.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + zyVarState);
                case 2:
                case 3:
                case 4:
                    this.f68661f7l8 = new ld6(InterfaceC4785b.zy.TERMINATED);
                    t8r(zyVarState);
                    break;
            }
        } finally {
            this.f27530k.jk();
            ld6();
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceC4785b
    public final void zy(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.f27530k.ki(this.f27531n, j2, timeUnit)) {
            try {
                m17010p(InterfaceC4785b.zy.TERMINATED);
            } finally {
                this.f27530k.jk();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
        }
    }
}

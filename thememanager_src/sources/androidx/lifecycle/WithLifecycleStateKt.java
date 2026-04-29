package androidx.lifecycle;

import androidx.lifecycle.kja0;
import cyoe.InterfaceC5981k;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: WithLifecycleState.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a-\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a5\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a-\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a5\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0007\u001aC\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Landroidx/lifecycle/kja0;", "Landroidx/lifecycle/kja0$zy;", "state", "Lkotlin/Function0;", "block", "n7h", "(Landroidx/lifecycle/kja0;Landroidx/lifecycle/kja0$zy;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "toq", "(Landroidx/lifecycle/kja0;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "p", C7704k.y.toq.f95579toq, "Landroidx/lifecycle/z;", "kja0", "(Landroidx/lifecycle/z;Landroidx/lifecycle/kja0$zy;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "zy", "(Landroidx/lifecycle/z;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "ld6", "f7l8", "ki", "", "dispatchNeeded", "Lkotlinx/coroutines/dd;", "lifecycleDispatcher", "k", "(Landroidx/lifecycle/kja0;Landroidx/lifecycle/kja0$zy;ZLkotlinx/coroutines/dd;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, m22787k = 2, mv = {1, 6, 0})
public final class WithLifecycleStateKt {

    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$k */
    /* JADX INFO: compiled from: WithLifecycleState.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class RunnableC0919k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kja0 f5040k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C0920xfdb59cc4 f5041q;

        RunnableC0919k(kja0 kja0Var, C0920xfdb59cc4 c0920xfdb59cc4) {
            this.f5040k = kja0Var;
            this.f5041q = c0920xfdb59cc4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5040k.mo4451k(this.f5041q);
        }
    }

    /* JADX INFO: compiled from: WithLifecycleState.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ kotlinx.coroutines.dd $lifecycleDispatcher;
        final /* synthetic */ C0920xfdb59cc4 $observer;
        final /* synthetic */ kja0 $this_suspendWithStateAtLeastUnchecked;

        /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$toq$k */
        /* JADX INFO: compiled from: WithLifecycleState.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class RunnableC0921k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ kja0 f5046k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ C0920xfdb59cc4 f5047q;

            RunnableC0921k(kja0 kja0Var, C0920xfdb59cc4 c0920xfdb59cc4) {
                this.f5046k = kja0Var;
                this.f5047q = c0920xfdb59cc4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5046k.zy(this.f5047q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(kotlinx.coroutines.dd ddVar, kja0 kja0Var, C0920xfdb59cc4 c0920xfdb59cc4) {
            super(1);
            this.$lifecycleDispatcher = ddVar;
            this.$this_suspendWithStateAtLeastUnchecked = kja0Var;
            this.$observer = c0920xfdb59cc4;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            kotlinx.coroutines.dd ddVar = this.$lifecycleDispatcher;
            C6217s c6217s = C6217s.INSTANCE;
            if (ddVar.wlev(c6217s)) {
                this.$lifecycleDispatcher.bap7(c6217s, new RunnableC0921k(this.$this_suspendWithStateAtLeastUnchecked, this.$observer));
            } else {
                this.$this_suspendWithStateAtLeastUnchecked.zy(this.$observer);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: WithLifecycleState.kt */
    @kotlin.d3(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class zy<R> extends AbstractC6308r implements InterfaceC5981k<R> {
        final /* synthetic */ InterfaceC5981k<R> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public zy(InterfaceC5981k<? extends R> interfaceC5981k) {
            super(0);
            this.$block = interfaceC5981k;
        }

        @Override // cyoe.InterfaceC5981k
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    private static final <R> Object cdj(InterfaceC0954z interfaceC0954z, kja0.zy zyVar, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        if (zyVar.compareTo(kja0.zy.CREATED) >= 0) {
            C6481a.m23813n().dxef();
            kotlin.jvm.internal.d3.m23089n(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + zyVar).toString());
    }

    @InterfaceC7395n
    public static final <R> Object f7l8(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        kja0.zy zyVar = kja0.zy.RESUMED;
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (lifecycle.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (lifecycle.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(lifecycle, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final <R> Object m4398g(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0.zy zyVar = kja0.zy.RESUMED;
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (kja0Var.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (kja0Var.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(kja0Var, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    /* JADX INFO: renamed from: h */
    private static final <R> Object m4399h(kja0 kja0Var, kja0.zy zyVar, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        if (zyVar.compareTo(kja0.zy.CREATED) >= 0) {
            C6481a.m23813n().dxef();
            kotlin.jvm.internal.d3.m23089n(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + zyVar).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.fu4] */
    @kotlin.nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <R> Object m4400k(@InterfaceC7396q final kja0 kja0Var, @InterfaceC7396q final kja0.zy zyVar, boolean z2, @InterfaceC7396q kotlinx.coroutines.dd ddVar, @InterfaceC7396q final InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        final kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        ?? r1 = new fn3e() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@InterfaceC7396q InterfaceC0954z source, @InterfaceC7396q kja0.toq event) {
                Object objM28280constructorimpl;
                kotlin.jvm.internal.d2ok.m23075h(source, "source");
                kotlin.jvm.internal.d2ok.m23075h(event, "event");
                if (event != kja0.toq.upTo(zyVar)) {
                    if (event == kja0.toq.ON_DESTROY) {
                        kja0Var.zy(this);
                        InterfaceC6216q interfaceC6216q2 = kiVar;
                        C6323o.k kVar = C6323o.Companion;
                        interfaceC6216q2.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(new t8r())));
                        return;
                    }
                    return;
                }
                kja0Var.zy(this);
                InterfaceC6216q interfaceC6216q3 = kiVar;
                InterfaceC5981k<R> interfaceC5981k2 = interfaceC5981k;
                try {
                    C6323o.k kVar2 = C6323o.Companion;
                    objM28280constructorimpl = C6323o.m28280constructorimpl(interfaceC5981k2.invoke());
                } catch (Throwable th) {
                    C6323o.k kVar3 = C6323o.Companion;
                    objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
                }
                interfaceC6216q3.resumeWith(objM28280constructorimpl);
            }
        };
        if (z2) {
            ddVar.bap7(C6217s.INSTANCE, new RunnableC0919k(kja0Var, r1));
        } else {
            kja0Var.mo4451k(r1);
        }
        kiVar.ni7(new toq(ddVar, kja0Var, r1));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }

    @kotlin.nn86
    @InterfaceC7395n
    public static final <R> Object ki(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0.zy zyVar, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (kja0Var.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (kja0Var.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(kja0Var, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    @InterfaceC7395n
    public static final <R> Object kja0(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q kja0.zy zyVar, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        if (!(zyVar.compareTo(kja0.zy.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + zyVar).toString());
        }
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (lifecycle.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (lifecycle.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(lifecycle, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    @InterfaceC7395n
    public static final <R> Object ld6(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        kja0.zy zyVar = kja0.zy.STARTED;
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (lifecycle.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (lifecycle.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(lifecycle, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    /* JADX INFO: renamed from: n */
    private static final <R> Object m4401n(InterfaceC0954z interfaceC0954z, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        kja0.zy zyVar = kja0.zy.CREATED;
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    @InterfaceC7395n
    public static final <R> Object n7h(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0.zy zyVar, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        if (!(zyVar.compareTo(kja0.zy.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + zyVar).toString());
        }
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (kja0Var.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (kja0Var.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(kja0Var, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public static final <R> Object m4402p(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0.zy zyVar = kja0.zy.STARTED;
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (kja0Var.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (kja0Var.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(kja0Var, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    /* JADX INFO: renamed from: q */
    private static final <R> Object m4403q(kja0 kja0Var, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0.zy zyVar = kja0.zy.CREATED;
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    private static final <R> Object qrj(InterfaceC0954z interfaceC0954z, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        kja0.zy zyVar = kja0.zy.STARTED;
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    /* JADX INFO: renamed from: s */
    private static final <R> Object m4404s(InterfaceC0954z interfaceC0954z, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        kja0.zy zyVar = kja0.zy.RESUMED;
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    @kotlin.nn86
    private static final <R> Object t8r(kja0 kja0Var, kja0.zy zyVar, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    @InterfaceC7395n
    public static final <R> Object toq(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0.zy zyVar = kja0.zy.CREATED;
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (kja0Var.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (kja0Var.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(kja0Var, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }

    private static final <R> Object x2(kja0 kja0Var, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0.zy zyVar = kja0.zy.STARTED;
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    /* JADX INFO: renamed from: y */
    private static final <R> Object m4405y(kja0 kja0Var, InterfaceC5981k<? extends R> interfaceC5981k, InterfaceC6216q<? super R> interfaceC6216q) {
        kja0.zy zyVar = kja0.zy.RESUMED;
        C6481a.m23813n().dxef();
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    @InterfaceC7395n
    public static final <R> Object zy(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q InterfaceC5981k<? extends R> interfaceC5981k, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        kja0.zy zyVar = kja0.zy.CREATED;
        z4 z4VarDxef = C6481a.m23813n().dxef();
        boolean zWlev = z4VarDxef.wlev(interfaceC6216q.getContext());
        if (!zWlev) {
            if (lifecycle.toq() == kja0.zy.DESTROYED) {
                throw new t8r();
            }
            if (lifecycle.toq().compareTo(zyVar) >= 0) {
                return interfaceC5981k.invoke();
            }
        }
        return m4400k(lifecycle, zyVar, zWlev, z4VarDxef, new zy(interfaceC5981k), interfaceC6216q);
    }
}

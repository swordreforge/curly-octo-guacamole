package androidx.core.transition;

import android.transition.Transition;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.transition.k */
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001a2\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001a2\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001a2\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001a2\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001aÆ\u0001\u0010\u0012\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¨\u0006\u0013"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/c;", "name", "transition", "Lkotlin/was;", "action", "Landroid/transition/Transition$TransitionListener;", "q", "f7l8", "zy", C7704k.y.toq.f95579toq, "n", "onEnd", "onStart", "onCancel", "onResume", "onPause", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0630k {

    /* JADX INFO: renamed from: androidx.core.transition.k$f7l8 */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/k$g", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/was;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class f7l8 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f3859k;

        public f7l8(x2 x2Var) {
            this.f3859k = x2Var;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3859k.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$g */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"androidx/core/transition/k$g", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/was;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class g implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f3860k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ x2 f3861n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ x2 f3862q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ x2 f50626toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ x2 f50627zy;

        public g(x2 x2Var, x2 x2Var2, x2 x2Var3, x2 x2Var4, x2 x2Var5) {
            this.f3860k = x2Var;
            this.f50626toq = x2Var2;
            this.f50627zy = x2Var3;
            this.f3862q = x2Var4;
            this.f3861n = x2Var5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3862q.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3860k.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f50627zy.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f50626toq.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3861n.invoke(transition);
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$k */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/was;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class k extends AbstractC6308r implements x2<Transition, was> {
        public static final k INSTANCE = new k();

        public k() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Transition transition) {
            invoke2(transition);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Transition it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$ld6 */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/k$g", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/was;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class ld6 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f3863k;

        public ld6(x2 x2Var) {
            this.f3863k = x2Var;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3863k.invoke(transition);
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$n */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/was;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class n extends AbstractC6308r implements x2<Transition, was> {
        public static final n INSTANCE = new n();

        public n() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Transition transition) {
            invoke2(transition);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Transition it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$p */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/k$g", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/was;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class p implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f3864k;

        public p(x2 x2Var) {
            this.f3864k = x2Var;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3864k.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$q */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/was;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class q extends AbstractC6308r implements x2<Transition, was> {
        public static final q INSTANCE = new q();

        public q() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Transition transition) {
            invoke2(transition);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Transition it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$s */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/k$g", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/was;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class s implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f3865k;

        public s(x2 x2Var) {
            this.f3865k = x2Var;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3865k.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$toq */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/was;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class toq extends AbstractC6308r implements x2<Transition, was> {
        public static final toq INSTANCE = new toq();

        public toq() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Transition transition) {
            invoke2(transition);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Transition it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$y */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/k$g", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/was;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class y implements Transition.TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2 f3866k;

        public y(x2 x2Var) {
            this.f3866k = x2Var;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
            this.f3866k.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC7396q Transition transition) {
            d2ok.cdj(transition, "transition");
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.k$zy */
    /* JADX INFO: compiled from: Transition.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/was;", "invoke", "(Landroid/transition/Transition;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class zy extends AbstractC6308r implements x2<Transition, was> {
        public static final zy INSTANCE = new zy();

        public zy() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Transition transition) {
            invoke2(transition);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Transition it) {
            d2ok.cdj(it, "it");
        }
    }

    @InterfaceC7396q
    @hyr(19)
    public static final Transition.TransitionListener f7l8(@InterfaceC7396q Transition doOnStart, @InterfaceC7396q x2<? super Transition, was> action) {
        d2ok.cdj(doOnStart, "$this$doOnStart");
        d2ok.cdj(action, "action");
        ld6 ld6Var = new ld6(action);
        doOnStart.addListener(ld6Var);
        return ld6Var;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: g */
    public static final Transition.TransitionListener m2917g(@InterfaceC7396q Transition doOnResume, @InterfaceC7396q x2<? super Transition, was> action) {
        d2ok.cdj(doOnResume, "$this$doOnResume");
        d2ok.cdj(action, "action");
        p pVar = new p(action);
        doOnResume.addListener(pVar);
        return pVar;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: k */
    public static final Transition.TransitionListener m2918k(@InterfaceC7396q Transition addListener, @InterfaceC7396q x2<? super Transition, was> onEnd, @InterfaceC7396q x2<? super Transition, was> onStart, @InterfaceC7396q x2<? super Transition, was> onCancel, @InterfaceC7396q x2<? super Transition, was> onResume, @InterfaceC7396q x2<? super Transition, was> onPause) {
        d2ok.cdj(addListener, "$this$addListener");
        d2ok.cdj(onEnd, "onEnd");
        d2ok.cdj(onStart, "onStart");
        d2ok.cdj(onCancel, "onCancel");
        d2ok.cdj(onResume, "onResume");
        d2ok.cdj(onPause, "onPause");
        g gVar = new g(onEnd, onResume, onPause, onCancel, onStart);
        addListener.addListener(gVar);
        return gVar;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: n */
    public static final Transition.TransitionListener m2919n(@InterfaceC7396q Transition doOnPause, @InterfaceC7396q x2<? super Transition, was> action) {
        d2ok.cdj(doOnPause, "$this$doOnPause");
        d2ok.cdj(action, "action");
        s sVar = new s(action);
        doOnPause.addListener(sVar);
        return sVar;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: q */
    public static final Transition.TransitionListener m2920q(@InterfaceC7396q Transition doOnEnd, @InterfaceC7396q x2<? super Transition, was> action) {
        d2ok.cdj(doOnEnd, "$this$doOnEnd");
        d2ok.cdj(action, "action");
        y yVar = new y(action);
        doOnEnd.addListener(yVar);
        return yVar;
    }

    public static /* synthetic */ Transition.TransitionListener toq(Transition addListener, x2 onEnd, x2 x2Var, x2 x2Var2, x2 onResume, x2 onPause, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            onEnd = k.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            x2Var = toq.INSTANCE;
        }
        x2 onStart = x2Var;
        if ((i2 & 4) != 0) {
            x2Var2 = zy.INSTANCE;
        }
        x2 onCancel = x2Var2;
        if ((i2 & 8) != 0) {
            onResume = q.INSTANCE;
        }
        if ((i2 & 16) != 0) {
            onPause = n.INSTANCE;
        }
        d2ok.cdj(addListener, "$this$addListener");
        d2ok.cdj(onEnd, "onEnd");
        d2ok.cdj(onStart, "onStart");
        d2ok.cdj(onCancel, "onCancel");
        d2ok.cdj(onResume, "onResume");
        d2ok.cdj(onPause, "onPause");
        g gVar = new g(onEnd, onResume, onPause, onCancel, onStart);
        addListener.addListener(gVar);
        return gVar;
    }

    @InterfaceC7396q
    @hyr(19)
    public static final Transition.TransitionListener zy(@InterfaceC7396q Transition doOnCancel, @InterfaceC7396q x2<? super Transition, was> action) {
        d2ok.cdj(doOnCancel, "$this$doOnCancel");
        d2ok.cdj(action, "action");
        f7l8 f7l8Var = new f7l8(action);
        doOnCancel.addListener(f7l8Var);
        return f7l8Var;
    }
}

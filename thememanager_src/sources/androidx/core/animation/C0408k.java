package androidx.core.animation;

import android.animation.Animator;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.animation.k */
/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\r\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001a2\u0010\u000e\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u001a¡\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001aW\u0010\u0016\u001a\u00020\f*\u00020\u00002#\b\u0006\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b¨\u0006\u0017"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/c;", "name", "animator", "Lkotlin/was;", "action", "Landroid/animation/Animator$AnimatorListener;", C7704k.y.toq.f95579toq, "p", "n", AnimatedProperty.PROPERTY_NAME_Y, "Landroid/animation/Animator$AnimatorPauseListener;", C7704k.y.toq.f44691k, "f7l8", "onEnd", "onStart", "onCancel", "onRepeat", "k", "onResume", "onPause", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0408k {

    /* JADX INFO: renamed from: androidx.core.animation.k$f7l8 */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/was;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class f7l8 extends AbstractC6308r implements cyoe.x2<Animator, was> {
        public static final f7l8 INSTANCE = new f7l8();

        public f7l8() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Animator animator) {
            invoke2(animator);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Animator it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$g */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/was;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class g extends AbstractC6308r implements cyoe.x2<Animator, was> {
        public static final g INSTANCE = new g();

        public g() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Animator animator) {
            invoke2(animator);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Animator it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$k */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/was;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class k extends AbstractC6308r implements cyoe.x2<Animator, was> {
        public static final k INSTANCE = new k();

        public k() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Animator animator) {
            invoke2(animator);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Animator it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$ld6 */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/animation/k$y", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class ld6 implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3096k;

        public ld6(cyoe.x2 x2Var) {
            this.f3096k = x2Var;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3096k.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$n */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/k$n", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class n implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ cyoe.x2 f3097g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3098k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.x2 f3099n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2 f3100q;

        public n(cyoe.x2 x2Var, cyoe.x2 x2Var2, cyoe.x2 x2Var3, cyoe.x2 x2Var4) {
            this.f3098k = x2Var;
            this.f3100q = x2Var2;
            this.f3099n = x2Var3;
            this.f3097g = x2Var4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3099n.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3100q.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3098k.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3097g.invoke(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$n7h */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/k$n", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class n7h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3101k;

        public n7h(cyoe.x2 x2Var) {
            this.f3101k = x2Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3101k.invoke(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$p */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/k$n", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class p implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3102k;

        public p(cyoe.x2 x2Var) {
            this.f3102k = x2Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3102k.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$q */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/was;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class q extends AbstractC6308r implements cyoe.x2<Animator, was> {
        public static final q INSTANCE = new q();

        public q() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Animator animator) {
            invoke2(animator);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Animator it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$qrj */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/animation/k$y", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class qrj implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3103k;

        public qrj(cyoe.x2 x2Var) {
            this.f3103k = x2Var;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3103k.invoke(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$s */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/k$n", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class s implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3104k;

        public s(cyoe.x2 x2Var) {
            this.f3104k = x2Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3104k.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$toq */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/was;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class toq extends AbstractC6308r implements cyoe.x2<Animator, was> {
        public static final toq INSTANCE = new toq();

        public toq() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Animator animator) {
            invoke2(animator);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Animator it) {
            d2ok.cdj(it, "it");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$x2 */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/k$n", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class x2 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3105k;

        public x2(cyoe.x2 x2Var) {
            this.f3105k = x2Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3105k.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$y */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/animation/k$y", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/was;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class y implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f3106k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2 f3107q;

        public y(cyoe.x2 x2Var, cyoe.x2 x2Var2) {
            this.f3106k = x2Var;
            this.f3107q = x2Var2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3106k.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@InterfaceC7396q Animator animator) {
            d2ok.cdj(animator, "animator");
            this.f3107q.invoke(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.k$zy */
    /* JADX INFO: compiled from: Animator.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/was;", "invoke", "(Landroid/animation/Animator;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class zy extends AbstractC6308r implements cyoe.x2<Animator, was> {
        public static final zy INSTANCE = new zy();

        public zy() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Animator animator) {
            invoke2(animator);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Animator it) {
            d2ok.cdj(it, "it");
        }
    }

    @InterfaceC7396q
    @hyr(19)
    public static final Animator.AnimatorPauseListener f7l8(@InterfaceC7396q Animator doOnPause, @InterfaceC7396q cyoe.x2<? super Animator, was> action) {
        d2ok.cdj(doOnPause, "$this$doOnPause");
        d2ok.cdj(action, "action");
        ld6 ld6Var = new ld6(action);
        doOnPause.addPauseListener(ld6Var);
        return ld6Var;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Animator.AnimatorListener m1769g(@InterfaceC7396q Animator doOnEnd, @InterfaceC7396q cyoe.x2<? super Animator, was> action) {
        d2ok.cdj(doOnEnd, "$this$doOnEnd");
        d2ok.cdj(action, "action");
        p pVar = new p(action);
        doOnEnd.addListener(pVar);
        return pVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Animator.AnimatorListener m1770k(@InterfaceC7396q Animator addListener, @InterfaceC7396q cyoe.x2<? super Animator, was> onEnd, @InterfaceC7396q cyoe.x2<? super Animator, was> onStart, @InterfaceC7396q cyoe.x2<? super Animator, was> onCancel, @InterfaceC7396q cyoe.x2<? super Animator, was> onRepeat) {
        d2ok.cdj(addListener, "$this$addListener");
        d2ok.cdj(onEnd, "onEnd");
        d2ok.cdj(onStart, "onStart");
        d2ok.cdj(onCancel, "onCancel");
        d2ok.cdj(onRepeat, "onRepeat");
        n nVar = new n(onRepeat, onEnd, onCancel, onStart);
        addListener.addListener(nVar);
        return nVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final Animator.AnimatorListener m1771n(@InterfaceC7396q Animator doOnCancel, @InterfaceC7396q cyoe.x2<? super Animator, was> action) {
        d2ok.cdj(doOnCancel, "$this$doOnCancel");
        d2ok.cdj(action, "action");
        s sVar = new s(action);
        doOnCancel.addListener(sVar);
        return sVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final Animator.AnimatorListener m1772p(@InterfaceC7396q Animator doOnStart, @InterfaceC7396q cyoe.x2<? super Animator, was> action) {
        d2ok.cdj(doOnStart, "$this$doOnStart");
        d2ok.cdj(action, "action");
        n7h n7hVar = new n7h(action);
        doOnStart.addListener(n7hVar);
        return n7hVar;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Animator.AnimatorPauseListener m1773q(Animator addPauseListener, cyoe.x2 onResume, cyoe.x2 onPause, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            onResume = g.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            onPause = f7l8.INSTANCE;
        }
        d2ok.cdj(addPauseListener, "$this$addPauseListener");
        d2ok.cdj(onResume, "onResume");
        d2ok.cdj(onPause, "onPause");
        y yVar = new y(onPause, onResume);
        addPauseListener.addPauseListener(yVar);
        return yVar;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: s */
    public static final Animator.AnimatorPauseListener m1774s(@InterfaceC7396q Animator doOnResume, @InterfaceC7396q cyoe.x2<? super Animator, was> action) {
        d2ok.cdj(doOnResume, "$this$doOnResume");
        d2ok.cdj(action, "action");
        qrj qrjVar = new qrj(action);
        doOnResume.addPauseListener(qrjVar);
        return qrjVar;
    }

    public static /* synthetic */ Animator.AnimatorListener toq(Animator addListener, cyoe.x2 onEnd, cyoe.x2 onStart, cyoe.x2 onCancel, cyoe.x2 onRepeat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            onEnd = k.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            onStart = toq.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            onCancel = zy.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            onRepeat = q.INSTANCE;
        }
        d2ok.cdj(addListener, "$this$addListener");
        d2ok.cdj(onEnd, "onEnd");
        d2ok.cdj(onStart, "onStart");
        d2ok.cdj(onCancel, "onCancel");
        d2ok.cdj(onRepeat, "onRepeat");
        n nVar = new n(onRepeat, onEnd, onCancel, onStart);
        addListener.addListener(nVar);
        return nVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final Animator.AnimatorListener m1775y(@InterfaceC7396q Animator doOnRepeat, @InterfaceC7396q cyoe.x2<? super Animator, was> action) {
        d2ok.cdj(doOnRepeat, "$this$doOnRepeat");
        d2ok.cdj(action, "action");
        x2 x2Var = new x2(action);
        doOnRepeat.addListener(x2Var);
        return x2Var;
    }

    @InterfaceC7396q
    @hyr(19)
    public static final Animator.AnimatorPauseListener zy(@InterfaceC7396q Animator addPauseListener, @InterfaceC7396q cyoe.x2<? super Animator, was> onResume, @InterfaceC7396q cyoe.x2<? super Animator, was> onPause) {
        d2ok.cdj(addPauseListener, "$this$addPauseListener");
        d2ok.cdj(onResume, "onResume");
        d2ok.cdj(onPause, "onPause");
        y yVar = new y(onPause, onResume);
        addPauseListener.addPauseListener(yVar);
        return yVar;
    }
}

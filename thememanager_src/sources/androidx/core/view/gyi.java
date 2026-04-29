package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class gyi {

    /* JADX INFO: renamed from: n */
    static final int f4026n = 2113929216;

    /* JADX INFO: renamed from: k */
    private final WeakReference<View> f4027k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    Runnable f50816toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    Runnable f50817zy = null;

    /* JADX INFO: renamed from: q */
    int f4028q = -1;

    /* JADX INFO: renamed from: androidx.core.view.gyi$g */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    static class C0686g implements dr {

        /* JADX INFO: renamed from: k */
        gyi f4029k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f50818toq;

        C0686g(gyi gyiVar) {
            this.f4029k = gyiVar;
        }

        @Override // androidx.core.view.dr
        /* JADX INFO: renamed from: k */
        public void mo543k(@zy.lvui View view) {
            Object tag = view.getTag(gyi.f4026n);
            dr drVar = tag instanceof dr ? (dr) tag : null;
            if (drVar != null) {
                drVar.mo543k(view);
            }
        }

        @Override // androidx.core.view.dr
        @SuppressLint({"WrongConstant"})
        public void toq(@zy.lvui View view) {
            int i2 = this.f4029k.f4028q;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.f4029k.f4028q = -1;
            }
            gyi gyiVar = this.f4029k;
            Runnable runnable = gyiVar.f50817zy;
            if (runnable != null) {
                gyiVar.f50817zy = null;
                runnable.run();
            }
            Object tag = view.getTag(gyi.f4026n);
            dr drVar = tag instanceof dr ? (dr) tag : null;
            if (drVar != null) {
                drVar.toq(view);
            }
            this.f50818toq = true;
        }

        @Override // androidx.core.view.dr
        public void zy(@zy.lvui View view) {
            this.f50818toq = false;
            if (this.f4029k.f4028q > -1) {
                view.setLayerType(2, null);
            }
            gyi gyiVar = this.f4029k;
            Runnable runnable = gyiVar.f50816toq;
            if (runnable != null) {
                gyiVar.f50816toq = null;
                runnable.run();
            }
            Object tag = view.getTag(gyi.f4026n);
            dr drVar = tag instanceof dr ? (dr) tag : null;
            if (drVar != null) {
                drVar.zy(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.gyi$k */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    class C0687k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ dr f4030k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f4032q;

        C0687k(dr drVar, View view) {
            this.f4030k = drVar;
            this.f4032q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4030k.mo543k(this.f4032q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4030k.toq(this.f4032q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4030k.zy(this.f4032q);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.gyi$n */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @zy.hyr(21)
    static class C0688n {
        private C0688n() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ViewPropertyAnimator m3303k(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.translationZ(f2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static ViewPropertyAnimator m3304q(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.zBy(f2);
        }

        @InterfaceC7830i
        static ViewPropertyAnimator toq(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.translationZBy(f2);
        }

        @InterfaceC7830i
        static ViewPropertyAnimator zy(ViewPropertyAnimator viewPropertyAnimator, float f2) {
            return viewPropertyAnimator.z(f2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.gyi$q */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @zy.hyr(19)
    static class C0689q {
        private C0689q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ViewPropertyAnimator m3305k(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @zy.hyr(16)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ViewPropertyAnimator m3306k(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @InterfaceC7830i
        static ViewPropertyAnimator toq(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @InterfaceC7830i
        static ViewPropertyAnimator zy(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    @zy.hyr(18)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Interpolator m3307k(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    gyi(View view) {
        this.f4027k = new WeakReference<>(view);
    }

    private void zurt(View view, dr drVar) {
        if (drVar != null) {
            view.animate().setListener(new C0687k(drVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @zy.lvui
    public gyi a9(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            C0688n.toq(view.animate(), f2);
        }
        return this;
    }

    @zy.lvui
    public gyi cdj(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().scaleY(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi d2ok(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().yBy(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi d3(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().x(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi eqxt(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().y(f2);
        }
        return this;
    }

    public long f7l8() {
        View view = this.f4027k.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @zy.lvui
    public gyi fn3e(@zy.dd dr drVar) {
        View view = this.f4027k.get();
        if (view != null) {
            zurt(view, drVar);
        }
        return this;
    }

    @zy.lvui
    public gyi fti(@zy.lvui Runnable runnable) {
        View view = this.f4027k.get();
        if (view != null) {
            toq.m3306k(view.animate(), runnable);
        }
        return this;
    }

    @zy.lvui
    public gyi fu4(@zy.dd final InterfaceC0732v interfaceC0732v) {
        final View view = this.f4027k.get();
        if (view != null) {
            C0689q.m3305k(view.animate(), interfaceC0732v != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.c8jq
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC0732v.mo191k(view);
                }
            } : null);
        }
        return this;
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public Interpolator m3293g() {
        View view = this.f4027k.get();
        if (view != null) {
            return zy.m3307k(view.animate());
        }
        return null;
    }

    @zy.lvui
    public gyi gvn7(@zy.lvui Runnable runnable) {
        View view = this.f4027k.get();
        if (view != null) {
            toq.zy(view.animate(), runnable);
        }
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: h */
    public gyi m3294h(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().scaleXBy(f2);
        }
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: i */
    public gyi m3295i(@zy.dd Interpolator interpolator) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @zy.lvui
    public gyi jk(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            C0688n.m3303k(view.animate(), f2);
        }
        return this;
    }

    @zy.lvui
    @SuppressLint({"WrongConstant"})
    public gyi jp0y() {
        View view = this.f4027k.get();
        if (view != null) {
            toq.toq(view.animate());
        }
        return this;
    }

    @zy.lvui
    public gyi ki(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().scaleYBy(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi kja0(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().scaleX(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi ld6(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().rotationX(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi lvui(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            C0688n.zy(view.animate(), f2);
        }
        return this;
    }

    @zy.lvui
    public gyi mcp(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().translationYBy(f2);
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public long m3296n() {
        View view = this.f4027k.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @zy.lvui
    public gyi n7h(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().rotationYBy(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi ni7(long j2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    @zy.lvui
    public gyi o1t(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().translationX(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi oc(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().xBy(f2);
        }
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: p */
    public gyi m3297p(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().rotationBy(f2);
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public void m3298q() {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @zy.lvui
    public gyi qrj(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().rotationY(f2);
        }
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: r */
    public gyi m3299r(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            C0688n.m3304q(view.animate(), f2);
        }
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: s */
    public gyi m3300s(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().rotation(f2);
        }
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: t */
    public gyi m3301t(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi t8r(long j2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    @zy.lvui
    public gyi toq(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi wvg(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().translationXBy(f2);
        }
        return this;
    }

    @zy.lvui
    public gyi x2(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().rotationXBy(f2);
        }
        return this;
    }

    /* JADX INFO: renamed from: z */
    public void m3302z() {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @zy.lvui
    public gyi zy(float f2) {
        View view = this.f4027k.get();
        if (view != null) {
            view.animate().alphaBy(f2);
        }
        return this;
    }
}

package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.zy;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0714r;
import androidx.fragment.app.C0894t;
import o1t.C7422k;
import zy.InterfaceC7832k;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
class C0888n {

    /* JADX INFO: renamed from: androidx.fragment.app.n$k */
    /* JADX INFO: compiled from: FragmentAnim.java */
    class k implements zy.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Fragment f4829k;

        k(Fragment fragment) {
            this.f4829k = fragment;
        }

        @Override // androidx.core.os.zy.toq
        public void onCancel() {
            if (this.f4829k.getAnimatingAway() != null) {
                View animatingAway = this.f4829k.getAnimatingAway();
                this.f4829k.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f4829k.setAnimator(null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$toq */
    /* JADX INFO: compiled from: FragmentAnim.java */
    class toq implements Animation.AnimationListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f4836k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ androidx.core.os.zy f4837q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Fragment f51500toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ C0894t.f7l8 f51501zy;

        /* JADX INFO: renamed from: androidx.fragment.app.n$toq$k */
        /* JADX INFO: compiled from: FragmentAnim.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (toq.this.f51500toq.getAnimatingAway() != null) {
                    toq.this.f51500toq.setAnimatingAway(null);
                    toq toqVar = toq.this;
                    toqVar.f51501zy.mo4215k(toqVar.f51500toq, toqVar.f4837q);
                }
            }
        }

        toq(ViewGroup viewGroup, Fragment fragment, C0894t.f7l8 f7l8Var, androidx.core.os.zy zyVar) {
            this.f4836k = viewGroup;
            this.f51500toq = fragment;
            this.f51501zy = f7l8Var;
            this.f4837q = zyVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4836k.post(new k());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$zy */
    /* JADX INFO: compiled from: FragmentAnim.java */
    class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C0894t.f7l8 f4839g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f4840k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Fragment f4841n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f4842q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ androidx.core.os.zy f4843y;

        zy(ViewGroup viewGroup, View view, Fragment fragment, C0894t.f7l8 f7l8Var, androidx.core.os.zy zyVar) {
            this.f4840k = viewGroup;
            this.f4842q = view;
            this.f4841n = fragment;
            this.f4839g = f7l8Var;
            this.f4843y = zyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4840k.endViewTransition(this.f4842q);
            Animator animator2 = this.f4841n.getAnimator();
            this.f4841n.setAnimator(null);
            if (animator2 == null || this.f4840k.indexOfChild(this.f4842q) >= 0) {
                return;
            }
            this.f4839g.mo4215k(this.f4841n, this.f4843y);
        }
    }

    private C0888n() {
    }

    /* JADX INFO: renamed from: k */
    static void m4307k(@lvui Fragment fragment, @lvui q qVar, @lvui C0894t.f7l8 f7l8Var) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        androidx.core.os.zy zyVar = new androidx.core.os.zy();
        zyVar.m2782q(new k(fragment));
        f7l8Var.toq(fragment, zyVar);
        if (qVar.f4835k != null) {
            n nVar = new n(qVar.f4835k, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            nVar.setAnimationListener(new toq(viewGroup, fragment, f7l8Var, zyVar));
            fragment.mView.startAnimation(nVar);
            return;
        }
        Animator animator = qVar.f51499toq;
        fragment.setAnimator(animator);
        animator.addListener(new zy(viewGroup, view, fragment, f7l8Var, zyVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    @InterfaceC7832k
    /* JADX INFO: renamed from: q */
    private static int m4308q(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? C7422k.toq.f42891n : C7422k.toq.f42889g;
        }
        if (i2 == 4099) {
            return z2 ? C7422k.toq.f93771zy : C7422k.toq.f42892q;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? C7422k.toq.f42890k : C7422k.toq.f93770toq;
    }

    private static int toq(Fragment fragment, boolean z2, boolean z3) {
        return z3 ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    static q zy(@lvui Context context, @lvui Fragment fragment, boolean z2, boolean z3) {
        int nextTransition = fragment.getNextTransition();
        int qVar = toq(fragment, z2, z3);
        boolean z5 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i2 = C7422k.f7l8.f93697bo;
            if (viewGroup.getTag(i2) != null) {
                fragment.mContainer.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, qVar);
        if (animationOnCreateAnimation != null) {
            return new q(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, qVar);
        if (animatorOnCreateAnimator != null) {
            return new q(animatorOnCreateAnimator);
        }
        if (qVar == 0 && nextTransition != 0) {
            qVar = m4308q(nextTransition, z2);
        }
        if (qVar != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(qVar));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, qVar);
                    if (animationLoadAnimation != null) {
                        return new q(animationLoadAnimation);
                    }
                    z5 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z5) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, qVar);
                    if (animatorLoadAnimator != null) {
                        return new q(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, qVar);
                    if (animationLoadAnimation2 != null) {
                        return new q(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$q */
    /* JADX INFO: compiled from: FragmentAnim.java */
    static class q {

        /* JADX INFO: renamed from: k */
        public final Animation f4835k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final Animator f51499toq;

        q(Animation animation) {
            this.f4835k = animation;
            this.f51499toq = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        q(Animator animator) {
            this.f4835k = null;
            this.f51499toq = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$n */
    /* JADX INFO: compiled from: FragmentAnim.java */
    static class n extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: g */
        private boolean f4830g;

        /* JADX INFO: renamed from: k */
        private final ViewGroup f4831k;

        /* JADX INFO: renamed from: n */
        private boolean f4832n;

        /* JADX INFO: renamed from: q */
        private final View f4833q;

        /* JADX INFO: renamed from: y */
        private boolean f4834y;

        n(@lvui Animation animation, @lvui ViewGroup viewGroup, @lvui View view) {
            super(false);
            this.f4834y = true;
            this.f4831k = viewGroup;
            this.f4833q = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, @lvui Transformation transformation) {
            this.f4834y = true;
            if (this.f4832n) {
                return !this.f4830g;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f4832n = true;
                ViewTreeObserverOnPreDrawListenerC0714r.m3434k(this.f4831k, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4832n || !this.f4834y) {
                this.f4831k.endViewTransition(this.f4833q);
                this.f4830g = true;
            } else {
                this.f4834y = false;
                this.f4831k.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, @lvui Transformation transformation, float f2) {
            this.f4834y = true;
            if (this.f4832n) {
                return !this.f4830g;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f4832n = true;
                ViewTreeObserverOnPreDrawListenerC0714r.m3434k(this.f4831k, this);
            }
            return true;
        }
    }
}

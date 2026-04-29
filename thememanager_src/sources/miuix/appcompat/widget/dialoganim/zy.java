package miuix.appcompat.widget.dialoganim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.ki;
import miuix.appcompat.widget.toq;
import miuix.internal.util.C7169q;

/* JADX INFO: compiled from: PadDialogAnim.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy implements miuix.appcompat.widget.dialoganim.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final float f87156f7l8 = 30.0f;

    /* JADX INFO: renamed from: g */
    private static final int f39715g = 200;

    /* JADX INFO: renamed from: k */
    private static final String f39716k = "PhoneDialogAnim";

    /* JADX INFO: renamed from: n */
    private static final float f39717n = 0.3f;

    /* JADX INFO: renamed from: q */
    private static final float f39718q = 0.8f;

    /* JADX INFO: renamed from: s */
    private static final float f39719s = 1.0f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87157toq = "hide";

    /* JADX INFO: renamed from: y */
    private static final float f39720y = 0.8f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87158zy = "show";

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.zy$k */
    /* JADX INFO: compiled from: PadDialogAnim.java */
    class C7060k implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        WeakReference<toq.InterfaceC7064k> f39721k;

        /* JADX INFO: renamed from: q */
        WeakReference<View> f39723q;

        C7060k(toq.InterfaceC7064k interfaceC7064k, View view) {
            this.f39721k = new WeakReference<>(interfaceC7064k);
            this.f39723q = new WeakReference<>(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f39723q.get();
            if (view != null) {
                view.setTag(null);
            }
            toq.InterfaceC7064k interfaceC7064k = this.f39721k.get();
            if (interfaceC7064k != null) {
                interfaceC7064k.end();
            } else {
                Log.d(zy.f39716k, "weak dismiss onCancel mOnDismiss get null");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f39723q.get();
            if (view != null) {
                view.setTag(null);
            }
            toq.InterfaceC7064k interfaceC7064k = this.f39721k.get();
            if (interfaceC7064k != null) {
                interfaceC7064k.end();
            } else {
                Log.d(zy.f39716k, "weak dismiss onComplete mOnDismiss get null");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f39723q.get();
            if (view != null) {
                view.setTag("hide");
            }
        }
    }

    /* JADX INFO: compiled from: PadDialogAnim.java */
    class toq extends TransitionListener {

        /* JADX INFO: renamed from: k */
        WeakReference<ki.InterfaceC6949q> f39724k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        WeakReference<View> f87159toq;

        toq(ki.InterfaceC6949q interfaceC6949q, View view) {
            this.f39724k = new WeakReference<>(interfaceC6949q);
            this.f87159toq = new WeakReference<>(view);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
            View view = this.f87159toq.get();
            if (view != null) {
                view.setTag(zy.f87158zy);
            }
            ki.InterfaceC6949q interfaceC6949q = this.f39724k.get();
            if (interfaceC6949q != null) {
                interfaceC6949q.onShowAnimStart();
            } else {
                Log.d(zy.f39716k, "weak show onCancel mOnDismiss get null");
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            ki.InterfaceC6949q interfaceC6949q = this.f39724k.get();
            if (interfaceC6949q != null) {
                interfaceC6949q.onShowAnimComplete();
            } else {
                Log.d(zy.f39716k, "weak show onComplete mOnDismiss get null");
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PadDialogAnim.java */
    private class C8101zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        WeakReference<ki.InterfaceC6949q> f39725k;

        /* JADX INFO: renamed from: q */
        WeakReference<View> f39727q;

        C8101zy(ki.InterfaceC6949q interfaceC6949q, View view) {
            this.f39725k = new WeakReference<>(interfaceC6949q);
            this.f39727q = new WeakReference<>(view);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f39727q.get();
            if (view != null) {
                view.setTag(null);
            }
            ki.InterfaceC6949q interfaceC6949q = this.f39725k.get();
            if (interfaceC6949q != null) {
                interfaceC6949q.onShowAnimComplete();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            View view = this.f39727q.get();
            if (view != null) {
                view.setTag(zy.f87158zy);
            }
            ki.InterfaceC6949q interfaceC6949q = this.f39725k.get();
            if (interfaceC6949q != null) {
                interfaceC6949q.onShowAnimStart();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    private AnimState f7l8(boolean z2, boolean z3, View view) {
        AnimState animState = new AnimState();
        float fM25478g = 1.0f;
        if (z2) {
            if (z3 != 0) {
                fM25478g = m25478g(view);
            }
        } else if (z3 == 0) {
            fM25478g = m25478g(view);
        }
        if (z2) {
            z3 = !z3;
        }
        double d2 = fM25478g;
        animState.add(ViewProperty.SCALE_X, d2);
        animState.add(ViewProperty.SCALE_Y, d2);
        animState.add(ViewProperty.ALPHA, z3);
        return animState;
    }

    /* JADX INFO: renamed from: g */
    private float m25478g(View view) {
        return Math.max(0.8f, 1.0f - (60.0f / Math.max(view.getWidth(), view.getHeight())));
    }

    /* JADX INFO: renamed from: n */
    private void m25479n(View view, ki.InterfaceC6949q interfaceC6949q) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ViewProperty.ALPHA, 0.0f, 1.0f);
        float fM25478g = m25478g(view);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat(ViewProperty.SCALE_X, fM25478g, 1.0f), PropertyValuesHolder.ofFloat(ViewProperty.SCALE_Y, fM25478g, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(new C8101zy(interfaceC6949q, view));
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    /* JADX INFO: renamed from: q */
    private void m25480q(View view, C7060k c7060k) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ViewProperty.ALPHA, 1.0f, 0.0f);
        float fM25478g = m25478g(view);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat(ViewProperty.SCALE_X, 1.0f, fM25478g), PropertyValuesHolder.ofFloat(ViewProperty.SCALE_Y, 1.0f, fM25478g));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(c7060k);
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    @Override // miuix.appcompat.widget.dialoganim.toq
    /* JADX INFO: renamed from: k */
    public void mo25475k(View view, View view2, toq.InterfaceC7064k interfaceC7064k) {
        if ("hide".equals(view.getTag())) {
            return;
        }
        m25480q(view, new C7060k(interfaceC7064k, view));
        C7058k.m25468k(view2);
    }

    @Override // miuix.appcompat.widget.dialoganim.toq
    public void toq() {
    }

    @Override // miuix.appcompat.widget.dialoganim.toq
    public void zy(View view, View view2, boolean z2, ki.InterfaceC6949q interfaceC6949q) {
        if (f87158zy.equals(view.getTag())) {
            return;
        }
        if (view.getScaleX() != 1.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (C7169q.m25965g()) {
            m25479n(view, interfaceC6949q);
        } else {
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase(EaseManager.getStyle(-2, 0.8f, f39717n));
            animConfig.addListeners(new toq(interfaceC6949q, view));
            Folme.useAt(view).state().setFlags(1L).fromTo(f7l8(true, true, view), f7l8(true, false, view), animConfig);
        }
        C7058k.toq(view2);
    }
}

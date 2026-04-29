package miuix.appcompat.widget.dialoganim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.app.ki;
import miuix.appcompat.widget.toq;
import miuix.core.util.C7080i;
import miuix.core.util.ld6;

/* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q */
/* JADX INFO: compiled from: PhoneDialogAnim.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7059q implements miuix.appcompat.widget.dialoganim.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f87153f7l8 = 200;

    /* JADX INFO: renamed from: g */
    private static final float f39681g = 0.7f;

    /* JADX INFO: renamed from: n */
    private static final float f39682n = 0.88f;

    /* JADX INFO: renamed from: p */
    private static WeakReference<ValueAnimator> f39683p = null;

    /* JADX INFO: renamed from: q */
    private static final String f39684q = "hide";

    /* JADX INFO: renamed from: s */
    private static final int f39685s = 15;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87154toq = "PhoneDialogAnim";

    /* JADX INFO: renamed from: y */
    private static final int f39686y = 350;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87155zy = "show";

    /* JADX INFO: renamed from: k */
    private int f39687k = 0;

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$f7l8 */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class f7l8 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        WeakReference<View> f39688k;

        /* JADX INFO: renamed from: q */
        boolean f39690q;

        f7l8(View view, boolean z2) {
            this.f39688k = new WeakReference<>(view);
            this.f39690q = z2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            WindowInsets rootWindowInsets;
            View view = this.f39688k.get();
            if (view == null) {
                return;
            }
            if ("hide".equals(view.getTag())) {
                valueAnimator.cancel();
                return;
            }
            if (Build.VERSION.SDK_INT >= 30 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                boolean zIsVisible = rootWindowInsets.isVisible(WindowInsets$Type.ime());
                Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                Insets insets2 = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                if (zIsVisible) {
                    C7059q.this.f39687k = insets.bottom - insets2.bottom;
                } else {
                    C7059q.this.f39687k = 0;
                }
            }
            C7059q.x2(view, ((Integer) valueAnimator.getAnimatedValue()).intValue() - C7059q.this.f39687k, false);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$g */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        int f39691g;

        /* JADX INFO: renamed from: k */
        WeakReference<ki.InterfaceC6949q> f39692k;

        /* JADX INFO: renamed from: n */
        WeakReference<View> f39693n;

        /* JADX INFO: renamed from: q */
        View.OnLayoutChangeListener f39694q;

        g(ki.InterfaceC6949q interfaceC6949q, View.OnLayoutChangeListener onLayoutChangeListener, View view, int i2) {
            this.f39692k = new WeakReference<>(interfaceC6949q);
            this.f39694q = onLayoutChangeListener;
            this.f39693n = new WeakReference<>(view);
            this.f39691g = i2;
        }

        /* JADX INFO: renamed from: k */
        private void m25476k() {
            View view = this.f39693n.get();
            if (view != null) {
                view.setTag(null);
                View.OnLayoutChangeListener onLayoutChangeListener = this.f39694q;
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    this.f39694q = null;
                }
            }
            ki.InterfaceC6949q interfaceC6949q = this.f39692k.get();
            if (interfaceC6949q != null) {
                interfaceC6949q.onShowAnimComplete();
            }
            if (C7059q.f39683p != null) {
                C7059q.f39683p.clear();
                WeakReference unused = C7059q.f39683p = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            m25476k();
            View view = this.f39693n.get();
            if (view != null) {
                C7059q.x2(view, this.f39691g, true);
            }
            this.f39692k.clear();
            this.f39693n.clear();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            WindowInsets rootWindowInsets;
            super.onAnimationEnd(animator);
            m25476k();
            View view = this.f39693n.get();
            if (view != null && Build.VERSION.SDK_INT >= 30 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                boolean zIsVisible = rootWindowInsets.isVisible(WindowInsets$Type.ime());
                Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                Insets insets2 = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                if (zIsVisible) {
                    C7059q.this.f39687k = insets.bottom - insets2.bottom;
                } else {
                    C7059q.this.f39687k = 0;
                }
                C7059q.x2(view, this.f39691g - C7059q.this.f39687k, true);
            }
            this.f39692k.clear();
            this.f39693n.clear();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            View view = this.f39693n.get();
            if (view != null) {
                view.setTag(C7059q.f87155zy);
                View.OnLayoutChangeListener onLayoutChangeListener = this.f39694q;
                if (onLayoutChangeListener != null) {
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
            }
            ki.InterfaceC6949q interfaceC6949q = this.f39692k.get();
            if (interfaceC6949q != null) {
                interfaceC6949q.onShowAnimStart();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$k */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class k extends q {

        /* JADX INFO: renamed from: s */
        final /* synthetic */ int f39697s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(View view, View view2, int i2) {
            super(view, view2);
            this.f39697s = i2;
        }

        @Override // miuix.appcompat.widget.dialoganim.C7059q.q, android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            Insets insets;
            super.onLayoutChange(view, i2, i3, i4, i5, i6, i7, i8, i9);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                boolean zIsVisible = rootWindowInsets.isVisible(WindowInsets$Type.ime());
                insets = rootWindowInsets.getInsets(WindowInsets$Type.ime());
                Insets insets2 = rootWindowInsets.getInsets(WindowInsets$Type.navigationBars());
                if (zIsVisible) {
                    C7059q.this.f39687k = insets.bottom - insets2.bottom;
                }
            } else {
                insets = null;
            }
            Context context = view.getContext();
            if (toq(context) && m25477k(context)) {
                zy(this.f39697s + (insets != null ? insets.bottom : 0));
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$n */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class n implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        WeakReference<toq.InterfaceC7064k> f39698k;

        /* JADX INFO: renamed from: q */
        WeakReference<View> f39700q;

        n(View view, toq.InterfaceC7064k interfaceC7064k) {
            this.f39698k = new WeakReference<>(interfaceC7064k);
            this.f39700q = new WeakReference<>(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f39700q.get();
            if (view != null) {
                view.setTag(null);
            }
            toq.InterfaceC7064k interfaceC7064k = this.f39698k.get();
            if (interfaceC7064k != null) {
                interfaceC7064k.end();
            } else {
                Log.d(C7059q.f87154toq, "onCancel mOnDismiss get null");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f39700q.get();
            if (view != null) {
                view.setTag(null);
            }
            toq.InterfaceC7064k interfaceC7064k = this.f39698k.get();
            if (interfaceC7064k != null) {
                interfaceC7064k.end();
            } else {
                Log.d(C7059q.f87154toq, "onComplete mOnDismiss get null");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f39700q.get();
            if (view != null) {
                view.setTag("hide");
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$q */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class q implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        final WeakReference<View> f39702k;

        /* JADX INFO: renamed from: q */
        final WeakReference<View> f39704q;

        /* JADX INFO: renamed from: n */
        final Rect f39703n = new Rect();

        /* JADX INFO: renamed from: g */
        final Point f39701g = new Point();

        public q(View view, View view2) {
            this.f39702k = new WeakReference<>(view.getRootView());
            this.f39704q = new WeakReference<>(view2);
        }

        /* JADX INFO: renamed from: k */
        public boolean m25477k(Context context) {
            C7080i.toq(context).getRealSize(this.f39701g);
            Rect rect = this.f39703n;
            if (rect.left != 0) {
                return false;
            }
            int i2 = rect.right;
            Point point = this.f39701g;
            if (i2 == point.x) {
                return rect.top >= ((int) (((float) point.y) * 0.2f));
            }
            return false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            View view2 = this.f39702k.get();
            if (view2 != null) {
                view2.getWindowVisibleDisplayFrame(this.f39703n);
            }
        }

        public boolean toq(Context context) {
            return ld6.kja0(context) && !ld6.qrj(context);
        }

        public void zy(int i2) {
            View view = this.f39704q.get();
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$toq */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class toq implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ View.OnLayoutChangeListener f39706g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f39707k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ki.InterfaceC6949q f39708n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f39709q;

        toq(View view, boolean z2, ki.InterfaceC6949q interfaceC6949q, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f39707k = view;
            this.f39709q = z2;
            this.f39708n = interfaceC6949q;
            this.f39706g = onLayoutChangeListener;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            view.removeOnLayoutChangeListener(this);
            int height = this.f39707k.getHeight();
            C7059q.x2(view, height, false);
            C7059q.ld6(view, height, 0, this.f39709q, C7059q.this.new g(this.f39708n, this.f39706g, view, 0), C7059q.this.new f7l8(view, this.f39709q));
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.dialoganim.q$zy */
    /* JADX INFO: compiled from: PhoneDialogAnim.java */
    class zy implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f39712k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View.OnLayoutChangeListener f39713n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ki.InterfaceC6949q f39714q;

        zy(boolean z2, ki.InterfaceC6949q interfaceC6949q, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f39712k = z2;
            this.f39714q = interfaceC6949q;
            this.f39713n = onLayoutChangeListener;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            view.removeOnLayoutChangeListener(this);
            int i10 = i5 - i3;
            C7059q.x2(view, i10, false);
            C7059q.ld6(view, i10, 0, this.f39712k, C7059q.this.new g(this.f39714q, this.f39713n, view, 0), C7059q.this.new f7l8(view, this.f39712k));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ld6(View view, int i2, int i3, boolean z2, g gVar, f7l8 f7l8Var) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(350L);
        valueAnimatorOfInt.setInterpolator(EaseManager.getInterpolator(0, f39682n, 0.7f));
        valueAnimatorOfInt.addUpdateListener(f7l8Var);
        valueAnimatorOfInt.addListener(gVar);
        valueAnimatorOfInt.start();
        f39683p = new WeakReference<>(valueAnimatorOfInt);
    }

    /* JADX INFO: renamed from: p */
    private void m25471p(View view, n nVar) {
        if (view == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(ViewProperty.TRANSLATION_Y, view.getTranslationY(), view.getHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfPropertyValuesHolder.addListener(nVar);
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x2(View view, int i2, boolean z2) {
        if (z2) {
            view.animate().cancel();
            view.animate().setDuration(100L).translationY(i2).start();
        } else {
            view.animate().cancel();
            view.setTranslationY(i2);
        }
    }

    @Override // miuix.appcompat.widget.dialoganim.toq
    /* JADX INFO: renamed from: k */
    public void mo25475k(View view, View view2, toq.InterfaceC7064k interfaceC7064k) {
        if ("hide".equals(view.getTag())) {
            return;
        }
        m25471p(view, new n(view, interfaceC7064k));
        C7058k.m25468k(view2);
    }

    @Override // miuix.appcompat.widget.dialoganim.toq
    public void toq() {
        ValueAnimator valueAnimator;
        WeakReference<ValueAnimator> weakReference = f39683p;
        if (weakReference == null || (valueAnimator = weakReference.get()) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // miuix.appcompat.widget.dialoganim.toq
    public void zy(View view, View view2, boolean z2, ki.InterfaceC6949q interfaceC6949q) {
        if (f87155zy.equals(view.getTag())) {
            return;
        }
        this.f39687k = 0;
        int i2 = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
        if (view.getScaleX() != 1.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        k kVar = Build.VERSION.SDK_INT >= 30 ? new k(view, view2, i2) : null;
        if (view.getHeight() > 0) {
            view.addOnLayoutChangeListener(new toq(view, z2, interfaceC6949q, kVar));
            view.setVisibility(4);
            view.setAlpha(1.0f);
        } else {
            view.addOnLayoutChangeListener(new zy(z2, interfaceC6949q, kVar));
        }
        C7058k.toq(view2);
    }
}

package miuix.appcompat.app.floatingactivity;

import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: compiled from: FloatingSwitcherAnimHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final int f38928k = 200;

    /* JADX INFO: renamed from: q */
    public static final int f38929q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f86882toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f86883zy = 1;

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.zy$k */
    /* JADX INFO: compiled from: FloatingSwitcherAnimHelper.java */
    class C6940k extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Runnable f38930k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ AnimConfig f86884toq;

        C6940k(Runnable runnable, AnimConfig animConfig) {
            this.f38930k = runnable;
            this.f86884toq = animConfig;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            Runnable runnable = this.f38930k;
            if (runnable != null) {
                runnable.run();
            }
            this.f86884toq.removeListeners(this);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            Runnable runnable = this.f38930k;
            if (runnable != null) {
                runnable.run();
            }
            this.f86884toq.removeListeners(this);
        }
    }

    /* JADX INFO: compiled from: FloatingSwitcherAnimHelper.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f38931k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AnimConfig f38932q;

        toq(View view, AnimConfig animConfig) {
            this.f38931k = view;
            this.f38932q = animConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            zy.m24997p(this.f38931k, this.f38932q);
        }
    }

    public static void f7l8(View view, AnimConfig animConfig) {
        if (view.isAttachedToWindow()) {
            m24997p(view, animConfig);
        } else {
            view.post(new toq(view, animConfig));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m24994g(View view) {
        f7l8(view, null);
    }

    public static AnimConfig ld6() {
        return qrj(0, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m24996n(View view, AnimConfig animConfig) {
        int width = view.getWidth();
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, width);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, 0);
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = ld6();
        }
        animConfigArr[0] = animConfig;
        to.to(animStateAdd, animConfigArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static void m24997p(View view, AnimConfig animConfig) {
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, 0.0d);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, Integer.valueOf(view.getWidth()));
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = ld6();
        }
        animConfigArr[0] = animConfig;
        to.to(animStateAdd, animConfigArr);
    }

    /* JADX INFO: renamed from: q */
    public static void m24998q(View view) {
        m24996n(view, null);
    }

    public static AnimConfig qrj(int i2, Runnable runnable) {
        AnimConfig animConfigX2 = x2(i2);
        if (runnable != null) {
            animConfigX2.addListeners(new C6940k(runnable, animConfigX2));
        }
        return animConfigX2;
    }

    /* JADX INFO: renamed from: s */
    public static void m24999s(View view, AnimConfig animConfig) {
        AnimState animStateAdd = new AnimState().add(ViewProperty.TRANSLATION_X, -200.0d);
        IStateStyle iStateStyleState = Folme.useAt(view).state();
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = qrj(0, null);
        }
        animConfigArr[0] = animConfig;
        iStateStyleState.to(animStateAdd, animConfigArr);
    }

    public static void toq(View view) {
        zy(view, null);
    }

    private static AnimConfig x2(int i2) {
        AnimConfig animConfig = new AnimConfig();
        if (i2 == 1) {
            animConfig.setEase(EaseManager.getStyle(-2, 0.85f, 0.3f));
        } else if (i2 != 2) {
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.46f));
        } else {
            animConfig.setEase(EaseManager.getStyle(-2, 0.95f, 0.3f));
        }
        return animConfig;
    }

    /* JADX INFO: renamed from: y */
    public static void m25000y(View view) {
        m24999s(view, null);
    }

    public static void zy(View view, AnimConfig animConfig) {
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, 0);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, -200);
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = qrj(0, null);
        }
        animConfigArr[0] = animConfig;
        to.to(animStateAdd, animConfigArr);
    }
}

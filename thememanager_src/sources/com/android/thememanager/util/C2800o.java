package com.android.thememanager.util;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import miuix.animation.Folme;
import miuix.animation.IFolme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: renamed from: com.android.thememanager.util.o */
/* JADX INFO: compiled from: MiuiFolme.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2800o {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Object f61382f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static Object f16675g = null;

    /* JADX INFO: renamed from: k */
    private static final String f16676k = "DC:MiuiFolme";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Object f61383ld6 = null;

    /* JADX INFO: renamed from: n */
    private static Object f16677n = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static f7l8 f61384n7h = null;

    /* JADX INFO: renamed from: p */
    private static Object f16678p = null;

    /* JADX INFO: renamed from: q */
    private static Object f16679q = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static Object f61385qrj = null;

    /* JADX INFO: renamed from: s */
    private static Object f16680s = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61386toq = "miui folme anim error: ";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static Object f61387x2;

    /* JADX INFO: renamed from: y */
    private static Object f16681y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Object f61388zy;

    /* JADX INFO: renamed from: com.android.thememanager.util.o$f7l8 */
    /* JADX INFO: compiled from: MiuiFolme.java */
    public static class f7l8 extends EaseManager.SpringInterpolator {
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$g */
    /* JADX INFO: compiled from: MiuiFolme.java */
    class g extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16682k;

        g(final View val$view) {
            this.f16682k = val$view;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            C2800o.m9929p(this.f16682k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$k */
    /* JADX INFO: compiled from: MiuiFolme.java */
    class k extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16683k;

        k(final View val$rulerView) {
            this.f16683k = val$rulerView;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            this.f16683k.setVisibility(0);
            this.f16683k.setTranslationY(0.0f);
            this.f16683k.setAlpha(1.0f);
            C2800o.m9929p(this.f16683k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$n */
    /* JADX INFO: compiled from: MiuiFolme.java */
    class n extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16684k;

        n(final View val$view) {
            this.f16684k = val$view;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            C2800o.m9929p(this.f16684k);
            C2800o.ni7(this.f16684k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$q */
    /* JADX INFO: compiled from: MiuiFolme.java */
    class q extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16685k;

        q(final View val$view) {
            this.f16685k = val$view;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            C2800o.m9929p(this.f16685k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$toq */
    /* JADX INFO: compiled from: MiuiFolme.java */
    class toq extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16686k;

        toq(final View val$rulerView) {
            this.f16686k = val$rulerView;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            this.f16686k.setTranslationY(0.0f);
            this.f16686k.setAlpha(1.0f);
            this.f16686k.setVisibility(8);
            C2800o.m9929p(this.f16686k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$y */
    /* JADX INFO: compiled from: MiuiFolme.java */
    public static class y extends TransitionListener {
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.o$zy */
    /* JADX INFO: compiled from: MiuiFolme.java */
    class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16687k;

        zy(final View val$view) {
            this.f16687k = val$view;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            C2800o.m9929p(this.f16687k);
        }
    }

    static {
        try {
            f61388zy = EaseManager.getStyle(0, 450.0f, 0.8f, 0.67f);
            f16679q = EaseManager.getStyle(0, 550.0f, 0.7f, 0.63f);
            f16677n = EaseManager.getStyle(0, 300.0f, 0.99f, 0.67f);
            f16675g = EaseManager.getStyle(0, 450.0f, 0.8f, 0.67f);
            f61382f7l8 = EaseManager.getStyle(0, 150.0f, 0.95f, 0.67f);
            f16681y = EaseManager.getStyle(0, 450.0f, 0.7f, 0.67f);
            f16680s = EaseManager.getStyle(-2, 0.9f, 0.3f);
            f16678p = EaseManager.getStyle(0, 150.0f, 0.95f, 0.67f);
            f61383ld6 = EaseManager.getStyle(0, 300.0f, 0.99f, 0.2f);
            f61387x2 = EaseManager.getStyle(16, 300.0f);
            f61385qrj = EaseManager.getStyle(0, 350.0f, 0.9f, 0.85714287f);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void a9(View view, y l2) {
        try {
            AnimState animState = new AnimState("alphaStart");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 0.0d);
            AnimState animStateAdd2 = new AnimState("alphaEnd").add(viewProperty, 1.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            animConfig.setEase((EaseManager.EaseStyle) f16675g);
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void cdj(View view, boolean darkMode) {
        float f2 = darkMode ? 1.0f : 0.0f;
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            iFolmeUseAt.touch().setScale(1.0f, ITouchStyle.TouchType.DOWN);
            iFolmeUseAt.touch().setScale(1.0f, ITouchStyle.TouchType.UP);
            iFolmeUseAt.touch().setTint(0.08f, f2, f2, f2);
            iFolmeUseAt.touch().handleTouchOf(view, new AnimConfig[0]);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void f7l8(View... views) {
        try {
            for (View view : views) {
                if (view != null) {
                    Folme.useAt(view).touch().cancel();
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
            }
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void fn3e(View view, y l2) {
        try {
            AnimState animState = new AnimState("timerCircleStart");
            ViewProperty viewProperty = ViewProperty.SCALE_X;
            AnimState animStateAdd = animState.add(viewProperty, 0.800000011920929d);
            ViewProperty viewProperty2 = ViewProperty.SCALE_Y;
            AnimState animStateAdd2 = animStateAdd.add(viewProperty2, 0.800000011920929d);
            ViewProperty viewProperty3 = ViewProperty.ALPHA;
            AnimState animStateAdd3 = animStateAdd2.add(viewProperty3, 0.0d);
            AnimState animStateAdd4 = new AnimState("timerCircleEnd").add(viewProperty, 1.0d).add(viewProperty2, 1.0d).add(viewProperty3, 1.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase((EaseManager.EaseStyle) f16681y);
            animConfig.addListeners(l2);
            iFolmeUseAt.state().fromTo(animStateAdd3, animStateAdd4, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void fti(View view) {
        Log.i("miui_anim", "-------------------> start visible show");
        try {
            view.setAlpha(0.0f);
            Folme.useAt(view).visible().show(new AnimConfig[0]);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void fu4(View view, MotionEvent event) {
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            iFolmeUseAt.touch().setTint(0.0f, 0.0f, 0.0f, 0.0f);
            iFolmeUseAt.touch().onMotionEvent(event);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9924g(View view) {
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            iFolmeUseAt.touch().setScale(1.0f, ITouchStyle.TouchType.DOWN);
            iFolmeUseAt.touch().handleTouchOf(view, new AnimConfig[0]);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m9925h(final View view, TransitionListener l2) {
        if (view == null) {
            return;
        }
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.addListeners(new g(view));
            animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.15f));
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            iFolmeUseAt.visible().setShow().hide(animConfig);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m9926i(View view, y l2) {
        try {
            view.setAlpha(0.0f);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase((EaseManager.EaseStyle) f61387x2);
            animConfig.setDelay(60L);
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            iFolmeUseAt.visible().show(animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void jk(View view, y l2) {
        try {
            view.clearAnimation();
            AnimState animState = new AnimState("alphaStart");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 0.0d);
            AnimState animStateAdd2 = new AnimState("alphaEnd").add(viewProperty, 1.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m9927k(final View rulerView, int offsetY) {
        if (rulerView == null) {
            return;
        }
        int i2 = -offsetY;
        try {
            rulerView.setTranslationY(i2);
            AnimState animState = new AnimState("rulerInStart");
            ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
            AnimState animStateAdd = animState.add(viewProperty, i2);
            AnimState animStateAdd2 = new AnimState("rulerInEnd").add(viewProperty, 0.0d);
            IFolme iFolmeUseAt = Folme.useAt(rulerView);
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, new AnimConfig[0]);
            iFolmeUseAt.visible().setHide().show(new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.15f)).addListeners(new k(rulerView)));
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void ki(View view) {
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            iFolmeUseAt.touch().setTint(0.0f, 0.0f, 0.0f, 0.0f);
            iFolmeUseAt.touch().handleTouchOf(view, new AnimConfig[0]);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void kja0(View view, y l2) {
        try {
            AnimState animState = new AnimState("timerPickerHideStart");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 1.0d);
            AnimState animStateAdd2 = new AnimState("timerPickerHideEnd").add(viewProperty, 0.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase((EaseManager.EaseStyle) f61382f7l8);
            animConfig.addListeners(l2);
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void ld6(View... views) {
        try {
            for (View view : views) {
                if (view != null) {
                    IFolme iFolmeUseAt = Folme.useAt(view);
                    iFolmeUseAt.touch().cancel();
                    iFolmeUseAt.state().cancel();
                }
            }
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void mcp(View view) {
        jk(view, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m9928n(TransitionListener listener, View... mWhiteNoiseViews) {
        if (mWhiteNoiseViews == null) {
            return;
        }
        for (int i2 = 0; i2 < mWhiteNoiseViews.length; i2++) {
            try {
                View view = mWhiteNoiseViews[i2];
                if (view != null) {
                    AnimState animState = new AnimState("WhiteNoiseOutStart");
                    ViewProperty viewProperty = ViewProperty.SCALE_X;
                    AnimState animStateAdd = animState.add(viewProperty, 1.0d);
                    ViewProperty viewProperty2 = ViewProperty.SCALE_Y;
                    AnimState animStateAdd2 = animStateAdd.add(viewProperty2, 1.0d);
                    ViewProperty viewProperty3 = ViewProperty.ALPHA;
                    AnimState animStateAdd3 = animStateAdd2.add(viewProperty3, 1.0d);
                    AnimState animStateAdd4 = new AnimState("WhiteNoiseOutEnd").add(viewProperty, 0.8999999761581421d).add(viewProperty2, 0.8999999761581421d).add(viewProperty3, 0.0d);
                    IFolme iFolmeUseAt = Folme.useAt(view);
                    AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
                    if (i2 == mWhiteNoiseViews.length - 1 && listener != null) {
                        ease.addListeners(listener);
                    }
                    ease.addListeners(new q(view));
                    iFolmeUseAt.state().fromTo(animStateAdd3, animStateAdd4, ease);
                }
            } catch (Exception e2) {
                Log.e(f16676k, f61386toq + e2.getMessage());
                return;
            }
        }
    }

    public static void n7h(View view, y l2) {
        try {
            AnimState animState = new AnimState("timerCircleHideStart");
            ViewProperty viewProperty = ViewProperty.SCALE_X;
            AnimState animStateAdd = animState.add(viewProperty, 1.0d);
            ViewProperty viewProperty2 = ViewProperty.SCALE_Y;
            AnimState animStateAdd2 = animStateAdd.add(viewProperty2, 1.0d);
            ViewProperty viewProperty3 = ViewProperty.ALPHA;
            AnimState animStateAdd3 = animStateAdd2.add(viewProperty3, 1.0d);
            AnimState animStateAdd4 = new AnimState("timerCircleHideEnd").add(viewProperty, 0.800000011920929d).add(viewProperty2, 0.800000011920929d).add(viewProperty3, 0.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase((EaseManager.EaseStyle) f16678p);
            animConfig.addListeners(l2);
            iFolmeUseAt.state().fromTo(animStateAdd3, animStateAdd4, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void ni7(View view) {
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            iFolmeUseAt.touch().setTint(0.0f, 0.0f, 0.0f, 0.0f);
            iFolmeUseAt.touch().handleTouchOf(view, new AnimConfig[0]);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void o1t(View view, y l2) {
        try {
            view.clearAnimation();
            AnimState animState = new AnimState("alphaStart");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 1.0d);
            AnimState animStateAdd2 = new AnimState("alphaEnd").add(viewProperty, 0.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m9929p(View... views) {
        try {
            Folme.clean(views);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m9930q(View[] mWhiteNoiseViews) {
        if (mWhiteNoiseViews == null) {
            return;
        }
        for (int i2 = 0; i2 < mWhiteNoiseViews.length; i2++) {
            try {
                View view = mWhiteNoiseViews[i2];
                if (view != null) {
                    AnimState animState = new AnimState("WhiteNoiseInStart");
                    ViewProperty viewProperty = ViewProperty.SCALE_X;
                    AnimState animStateAdd = animState.add(viewProperty, 0.800000011920929d);
                    ViewProperty viewProperty2 = ViewProperty.SCALE_Y;
                    AnimState animStateAdd2 = animStateAdd.add(viewProperty2, 0.800000011920929d);
                    ViewProperty viewProperty3 = ViewProperty.ALPHA;
                    Folme.useAt(view).state().fromTo(animStateAdd2.add(viewProperty3, 0.0d), new AnimState("WhiteNoiseInEnd").add(viewProperty, 1.0d).add(viewProperty2, 1.0d).add(viewProperty3, 1.0d), new AnimConfig().addListeners(new zy(view)).setDelay(i2 * 50).setEase(EaseManager.getStyle(-2, 0.9f, 0.3f)));
                }
            } catch (Exception e2) {
                Log.e(f16676k, f61386toq + e2.getMessage());
                return;
            }
        }
    }

    public static void qrj(final View view, y l2) {
        try {
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase((EaseManager.EaseStyle) f61383ld6);
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            iFolmeUseAt.visible().hide(animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m9931s(View view) {
        try {
            Folme.useAt(view).state().clean();
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m9932t(View view) {
        Log.i("miui_anim", "-------------------> start visible hide");
        try {
            Folme.useAt(view).visible().hide(new AnimConfig[0]);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void t8r(View... views) {
        for (View view : views) {
            if (view != null) {
                ni7(view);
            }
        }
    }

    public static void toq(final View rulerView, int offsetY, TransitionListener l2) {
        if (rulerView == null) {
            return;
        }
        try {
            AnimState animState = new AnimState("rulerInStart");
            ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
            AnimState animStateAdd = animState.add(viewProperty, 0.0d);
            AnimState animStateAdd2 = new AnimState("rulerInEnd").add(viewProperty, -offsetY);
            IFolme iFolmeUseAt = Folme.useAt(rulerView);
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, new AnimConfig[0]);
            AnimConfig animConfigAddListeners = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.15f)).addListeners(new toq(rulerView));
            if (l2 != null) {
                animConfigAddListeners.addListeners(l2);
            }
            iFolmeUseAt.visible().setShow().hide(animConfigAddListeners);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void wvg(View view, y l2) {
        try {
            AnimState animState = new AnimState("alphaStart");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 1.0d);
            AnimState animStateAdd2 = new AnimState("alphaEnd").add(viewProperty, 0.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            if (l2 != null) {
                animConfig.addListeners(l2);
            }
            animConfig.setEase((EaseManager.EaseStyle) f61382f7l8);
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static f7l8 x2() {
        if (f61384n7h == null) {
            f7l8 f7l8Var = new f7l8();
            f61384n7h = f7l8Var;
            f7l8Var.setResponse(0.85714287f);
            f61384n7h.setDamping(0.9f);
        }
        return f61384n7h;
    }

    /* JADX INFO: renamed from: y */
    public static void m9933y(View view) {
        try {
            Folme.useAt(view).visible().cancel();
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m9934z(View view) {
        o1t(view, null);
    }

    public static void zurt(View view, y l2) {
        try {
            AnimState animState = new AnimState("timerPickerShowStart");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 0.0d);
            AnimState animStateAdd2 = new AnimState("timerPickerShowEnd").add(viewProperty, 1.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setDelay(250L);
            animConfig.setEase((EaseManager.EaseStyle) f16680s);
            animConfig.addListeners(l2);
            iFolmeUseAt.state().fromTo(animStateAdd, animStateAdd2, animConfig);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }

    public static void zy(TransitionListener listener, final View view) {
        if (view == null) {
            return;
        }
        try {
            AnimState animState = new AnimState("TimerItemOutStart");
            ViewProperty viewProperty = ViewProperty.SCALE_X;
            AnimState animStateAdd = animState.add(viewProperty, 1.0d);
            ViewProperty viewProperty2 = ViewProperty.SCALE_Y;
            AnimState animStateAdd2 = animStateAdd.add(viewProperty2, 1.0d);
            ViewProperty viewProperty3 = ViewProperty.ALPHA;
            AnimState animStateAdd3 = animStateAdd2.add(viewProperty3, 1.0d);
            AnimState animStateAdd4 = new AnimState("TimerItemOutEnd").add(viewProperty, 0.8999999761581421d).add(viewProperty2, 0.8999999761581421d).add(viewProperty3, 0.0d);
            IFolme iFolmeUseAt = Folme.useAt(view);
            AnimConfig ease = new AnimConfig().addListeners(new n(view)).setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
            if (listener != null) {
                ease.addListeners(listener);
            }
            iFolmeUseAt.state().fromTo(animStateAdd3, animStateAdd4, ease);
        } catch (Exception e2) {
            Log.e(f16676k, f61386toq + e2.getMessage());
        }
    }
}

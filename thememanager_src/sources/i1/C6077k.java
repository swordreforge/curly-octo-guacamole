package i1;

import android.view.View;
import com.android.thememanager.basemodule.analysis.toq;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: renamed from: i1.k */
/* JADX INFO: compiled from: FolmeUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C6077k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static volatile boolean f77186f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static final String f35175g = "end";

    /* JADX INFO: renamed from: k */
    private static final float f35176k = 0.6f;

    /* JADX INFO: renamed from: n */
    private static final String f35177n = "start";

    /* JADX INFO: renamed from: q */
    private static final int f35178q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final float f77187toq = 0.08f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f77188zy = 0;

    public static void a9(View view) {
        m22375t(view, view, 1, false);
    }

    public static void cdj(View view) {
        if (f77186f7l8) {
            return;
        }
        Folme.useAt(view).touch().setTint(0.0f, 0.0f, 0.0f, 0.0f).handleTouchOf(view, new AnimConfig[0]);
    }

    public static void d3(View view) {
        if (C1807g.m7081r()) {
            return;
        }
        if (view.getTag() == null || !view.getTag().equals(toq.u2a8)) {
            view.setTag(toq.u2a8);
            AnimConfig animConfig = new AnimConfig();
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.5f));
            m22371n(view, 0.0f, 1.0f, animConfig);
        }
    }

    public static void eqxt(View view) {
        Folme.useAt(view).visible().show(new AnimConfig[0]);
    }

    public static void f7l8(View view) {
        m22372p(view, view);
    }

    public static void fn3e(View animView, View touchView) {
        zurt(animView, touchView, 0, false);
    }

    public static void fti(View view, float translateStartX, float translateEndX, float translateStartY, float translateEndY, float scaleStartX, float scaleEndX, float scaleStartY, float scaleEndY, TransitionListener listener) {
        AnimConfig animConfig = new AnimConfig();
        if (listener != null) {
            animConfig.addListeners(listener);
        }
        AnimState animState = new AnimState("start");
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, translateStartX);
        ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
        AnimState animStateAdd2 = animStateAdd.add(viewProperty2, translateStartY);
        ViewProperty viewProperty3 = ViewProperty.SCALE_X;
        AnimState animStateAdd3 = animStateAdd2.add(viewProperty3, scaleStartX);
        ViewProperty viewProperty4 = ViewProperty.SCALE_Y;
        Folme.useAt(view).state().fromTo(animStateAdd3.add(viewProperty4, scaleStartY), new AnimState("end").add(viewProperty, translateEndX).add(viewProperty2, translateEndY).add(viewProperty3, scaleEndX).add(viewProperty4, scaleEndY), animConfig);
    }

    public static void fu4(View view) {
        zurt(view, view, 1, false);
    }

    /* JADX INFO: renamed from: g */
    public static void m22367g(View... view) {
        if (f77186f7l8) {
            return;
        }
        Folme.clean(view);
    }

    public static void gvn7(View view) {
        Folme.useAt(view).visible().hide(new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: h */
    public static void m22368h(View view, int startHeight, int endHeight) {
        IStateStyle iStateStyle = Folme.useAt(view).state().set("start");
        ViewProperty viewProperty = ViewProperty.HEIGHT;
        iStateStyle.add((FloatProperty) viewProperty, startHeight).set("end").add((FloatProperty) viewProperty, endHeight).setTo("start").to("end", new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: i */
    public static void m22369i(View view) {
        fn3e(view, view);
    }

    public static void jk(View... views) {
        for (View view : views) {
            o1t(view);
        }
    }

    public static void jp0y(View view, float translateStartX, float translateEndX, float translateStartY, float translateEndY, TransitionListener listener) {
        AnimConfig animConfig = new AnimConfig();
        if (listener != null) {
            animConfig.addListeners(listener);
        }
        animConfig.setEase(EaseManager.getStyle(-2, 0.9f, 0.25f));
        AnimState animState = new AnimState("start");
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, translateStartX);
        ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
        Folme.useAt(view).state().fromTo(animStateAdd.add(viewProperty2, translateStartY), new AnimState("end").add(viewProperty, translateEndX).add(viewProperty2, translateEndY), animConfig);
    }

    /* JADX INFO: renamed from: k */
    public static void m22370k(View view) {
        toq(view, null);
    }

    public static void ki(View view, TransitionListener listener) {
        AnimConfig animConfig = new AnimConfig();
        if (listener != null) {
            animConfig.addListeners(listener);
        }
        Folme.clean(view);
        Folme.useAt(view).visible().hide(animConfig);
    }

    public static void kja0(View... views) {
        for (View view : views) {
            ld6(view);
        }
    }

    public static void ld6(View view) {
        x2(view, view);
    }

    public static void mcp(View view) {
        m22375t(view, view, 0, true);
    }

    /* JADX INFO: renamed from: n */
    private static void m22371n(View view, float startValue, float endValue, AnimConfig config) {
        if (view == null) {
            return;
        }
        if (config == null) {
            config = new AnimConfig();
        }
        AnimState animState = new AnimState("start");
        ViewProperty viewProperty = ViewProperty.ALPHA;
        Folme.useAt(view).state().fromTo(animState.add(viewProperty, startValue), new AnimState("end").add(viewProperty, endValue), config);
    }

    public static void n7h(View view) {
        qrj(view, view, true);
    }

    public static void ni7(View view) {
        zurt(view, view, 0, true);
    }

    public static void o1t(View view) {
        wvg(view, view);
    }

    public static void oc(boolean isDisable) {
        f77186f7l8 = isDisable;
    }

    /* JADX INFO: renamed from: p */
    public static void m22372p(View touchView, View... animViews) {
        for (View view : animViews) {
            m22376y(view, touchView);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m22373q(View view, AnimConfig config) {
        m22371n(view, 0.0f, 1.0f, config);
    }

    private static void qrj(View view, View view2, boolean z2) {
        if (f77186f7l8) {
            return;
        }
        boolean zD2ok = C1819o.d2ok(bf2.toq.toq());
        ITouchStyle tint = Folme.useAt(view).touch().setTint(0.0f, 0.0f, 0.0f, 0.0f);
        float f2 = zD2ok ? 1.0f : 0.0f;
        tint.setBackgroundColor(0.08f, f2, f2, f2).setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(view2, z2, new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: s */
    public static void m22374s(View... views) {
        for (View view : views) {
            f7l8(view);
        }
    }

    /* JADX INFO: renamed from: t */
    private static void m22375t(View animView, View touchView, int tintMode, boolean hasListViewItemClickListener) {
        if (f77186f7l8) {
            return;
        }
        Folme.useAt(animView).touch().setTintMode(tintMode).handleTouchOf(touchView, hasListViewItemClickListener, new AnimConfig[0]);
    }

    public static void t8r(View view, TransitionListener listener) {
        AnimConfig animConfig = new AnimConfig();
        if (listener != null) {
            animConfig.addListeners(listener);
        }
        Folme.clean(view);
        Folme.useAt(view).visible().show(animConfig);
    }

    public static void toq(View view, AnimConfig config) {
        m22371n(view, 1.0f, 0.0f, config);
    }

    public static void wvg(View animView, View touchView) {
        if (o1t.m7169g(bf2.toq.toq())) {
            return;
        }
        m22375t(animView, touchView, 0, false);
    }

    public static void x2(View animView, View touchView) {
        qrj(animView, touchView, false);
    }

    /* JADX INFO: renamed from: y */
    public static void m22376y(View animView, View touchView) {
        Folme.useAt(animView).touch().setTint(0.0f, 0.0f, 0.0f, 0.0f).setAlpha(f35176k, new ITouchStyle.TouchType[0]).setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(touchView, new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: z */
    public static void m22377z(View... views) {
        for (View view : views) {
            m22369i(view);
        }
    }

    private static void zurt(View animView, View touchView, int tintMode, boolean hasListViewItemClickListener) {
        Folme.useAt(animView).touch().setTintMode(tintMode).setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(touchView, hasListViewItemClickListener, new AnimConfig[0]);
    }

    public static void zy(View view) {
        m22371n(view, 0.0f, 1.0f, null);
    }
}

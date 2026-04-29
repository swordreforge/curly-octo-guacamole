package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.C0538n;
import androidx.core.graphics.EnumC0532g;
import ij.C6095k;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public class qrj extends SharedElementCallback {

    /* JADX INFO: renamed from: g */
    @dd
    private static WeakReference<View> f25506g;

    /* JADX INFO: renamed from: q */
    @dd
    private Rect f25509q;

    /* JADX INFO: renamed from: k */
    private boolean f25507k = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f67995toq = true;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f67996zy = false;

    /* JADX INFO: renamed from: n */
    @dd
    private InterfaceC4210q f25508n = new C4209n();

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.qrj$k */
    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    class C4208k extends fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Window f25510k;

        C4208k(Window window) {
            this.f25510k = window;
        }

        @Override // com.google.android.material.transition.platform.fn3e, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            qrj.m15216p(this.f25510k);
        }

        @Override // com.google.android.material.transition.platform.fn3e, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            qrj.m15218s(this.f25510k);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.qrj$n */
    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public static class C4209n implements InterfaceC4210q {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.qrj.InterfaceC4210q
        @dd
        /* JADX INFO: renamed from: k */
        public com.google.android.material.shape.kja0 mo15221k(@lvui View view) {
            if (view instanceof com.google.android.material.shape.t8r) {
                return ((com.google.android.material.shape.t8r) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.qrj$q */
    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public interface InterfaceC4210q {
        @dd
        /* JADX INFO: renamed from: k */
        com.google.android.material.shape.kja0 mo15221k(@lvui View view);
    }

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    class toq extends fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f25511k;

        toq(Activity activity) {
            this.f25511k = activity;
        }

        @Override // com.google.android.material.transition.platform.fn3e, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (qrj.f25506g != null && (view = (View) qrj.f25506g.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = qrj.f25506g = null;
            }
            this.f25511k.finish();
            this.f25511k.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    class zy extends fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Window f25512k;

        zy(Window window) {
            this.f25512k = window;
        }

        @Override // com.google.android.material.transition.platform.fn3e, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            qrj.m15218s(this.f25512k);
        }
    }

    @dd
    /* JADX INFO: renamed from: g */
    private static Drawable m15213g(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: renamed from: h */
    private static void m15214h(Window window, x2 x2Var) {
        if (x2Var.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(x2Var.getDuration());
        }
    }

    private void kja0(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof x2) {
            x2 x2Var = (x2) sharedElementReturnTransition;
            x2Var.m15240j(true);
            x2Var.addListener(new toq(activity));
            if (this.f67995toq) {
                m15214h(window, x2Var);
                x2Var.addListener(new zy(window));
            }
        }
    }

    private void n7h(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof x2) {
            x2 x2Var = (x2) sharedElementEnterTransition;
            if (!this.f67996zy) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f67995toq) {
                m15214h(window, x2Var);
                x2Var.addListener(new C4208k(window));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static void m15216p(Window window) {
        Drawable drawableM15213g = m15213g(window);
        if (drawableM15213g == null) {
            return;
        }
        drawableM15213g.mutate().clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static void m15218s(Window window) {
        Drawable drawableM15213g = m15213g(window);
        if (drawableM15213g == null) {
            return;
        }
        drawableM15213g.mutate().setColorFilter(C0538n.m2510k(0, EnumC0532g.CLEAR));
    }

    public boolean f7l8() {
        return this.f67996zy;
    }

    public void ld6(@dd InterfaceC4210q interfaceC4210q) {
        this.f25508n = interfaceC4210q;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public InterfaceC4210q m15219n() {
        return this.f25508n;
    }

    @Override // android.app.SharedElementCallback
    @dd
    public Parcelable onCaptureSharedElementSnapshot(@lvui View view, @lvui Matrix matrix, @lvui RectF rectF) {
        f25506g = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @dd
    public View onCreateSnapshotView(@lvui Context context, @dd Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        com.google.android.material.shape.kja0 kja0VarMo15221k;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f25506g) != null && this.f25508n != null && (view = weakReference.get()) != null && (kja0VarMo15221k = this.f25508n.mo15221k(view)) != null) {
            viewOnCreateSnapshotView.setTag(C6095k.y.f80055oph, kja0VarMo15221k);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@lvui List<String> list, @lvui Map<String, View> map) {
        View view;
        Activity activityM14636k;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activityM14636k = com.google.android.material.internal.zy.m14636k(view.getContext())) == null) {
            return;
        }
        Window window = activityM14636k.getWindow();
        if (this.f25507k) {
            n7h(window);
        } else {
            kja0(activityM14636k, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@lvui List<String> list, @lvui List<View> list2, @lvui List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i2 = C6095k.y.f80055oph;
            if (view.getTag(i2) instanceof View) {
                list2.get(0).setTag(i2, null);
            }
        }
        if (!this.f25507k && !list2.isEmpty()) {
            this.f25509q = zurt.m15268s(list2.get(0));
        }
        this.f25507k = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@lvui List<String> list, @lvui List<View> list2, @lvui List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(C6095k.y.f80055oph, list3.get(0));
        }
        if (this.f25507k || list2.isEmpty() || this.f25509q == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f25509q.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25509q.height(), 1073741824));
        Rect rect = this.f25509q;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void qrj(boolean z2) {
        this.f67995toq = z2;
    }

    public void x2(boolean z2) {
        this.f67996zy = z2;
    }

    /* JADX INFO: renamed from: y */
    public boolean m15220y() {
        return this.f67995toq;
    }
}

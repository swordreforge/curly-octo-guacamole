package miuix.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.view.WindowCallbackC0137s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0954z;
import gb.toq;
import java.util.List;
import kt06.C6753n;
import kz28.InterfaceC6758k;
import miuix.appcompat.app.floatingactivity.FloatingActivitySwitcher;
import miuix.appcompat.app.floatingactivity.InterfaceC6938s;
import miuix.appcompat.app.floatingactivity.InterfaceC6939y;
import miuix.appcompat.app.floatingactivity.helper.AbstractC6920k;
import miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingActivitySwitcher;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.appcompat.internal.app.widget.C6998s;
import miuix.appcompat.internal.util.C7006q;
import miuix.core.util.C7085q;
import miuix.internal.util.C7164n;
import miuix.responsive.page.manager.BaseResponseStateManager;
import miuix.view.n7h;
import zy.yz;

/* JADX INFO: compiled from: AppDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
class fn3e extends AbstractC6955q implements InterfaceC6758k<Activity> {
    private static final String be = "miuix:ActionBar";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private LayoutInflater f86885ab;
    private CharSequence ac;
    Window ad;
    private C6942q am;
    private boolean an;
    private AbstractC6920k as;
    private boolean ax;
    private final Runnable ay;
    private final String az;
    private boolean ba;
    private InterfaceC6943g bb;
    private ViewGroup bg;
    private int bl;
    private InterfaceC6938s bp;

    @zy.dd
    private BaseResponseStateManager bq;
    private boolean bv;

    /* JADX INFO: renamed from: d */
    private ActionBarContainer f38933d;
    private boolean id;
    private Boolean in;

    /* JADX INFO: renamed from: v */
    private ActionBarOverlayLayout f38934v;

    /* JADX INFO: renamed from: w */
    private ViewGroup f38935w;

    /* JADX INFO: renamed from: miuix.appcompat.app.fn3e$k */
    /* JADX INFO: compiled from: AppDelegate.java */
    class C6941k extends BaseResponseStateManager {
        C6941k(InterfaceC6758k interfaceC6758k) {
            super(interfaceC6758k);
        }

        @Override // miuix.responsive.page.manager.AbstractC7322k
        protected Context f7l8() {
            return fn3e.this.f38989k;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.fn3e$q */
    /* JADX INFO: compiled from: AppDelegate.java */
    class C6942q extends WindowCallbackC0137s {
        public C6942q(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            if (ncyb.m25063z(fn3e.this.f38989k.getSupportFragmentManager(), motionEvent)) {
                return true;
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (ncyb.bo(fn3e.this.f38989k.getSupportFragmentManager(), keyEvent)) {
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (ncyb.h7am(fn3e.this.f38989k.getSupportFragmentManager(), keyEvent)) {
                return true;
            }
            return super.dispatchKeyShortcutEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (ncyb.bek6(fn3e.this.f38989k.getSupportFragmentManager(), motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            if (ncyb.tfm(fn3e.this.f38989k.getSupportFragmentManager(), motionEvent)) {
                return true;
            }
            return super.dispatchTrackballEvent(motionEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // androidx.appcompat.view.WindowCallbackC0137s, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            ncyb.lh(fn3e.this.f38989k.getSupportFragmentManager(), list, menu, i2);
            super.onProvideKeyboardShortcuts(list, menu, i2);
        }
    }

    /* JADX INFO: compiled from: AppDelegate.java */
    class toq extends androidx.activity.zy {
        toq(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.zy
        /* JADX INFO: renamed from: n */
        public void mo21n() {
            fn3e.this.as.mo24917p();
        }
    }

    /* JADX INFO: compiled from: AppDelegate.java */
    class zy implements Runnable {
        zy() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Menu, miuix.appcompat.internal.view.menu.f7l8] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            ?? Zy = fn3e.this.zy();
            if ((fn3e.this.ki() || fn3e.this.ax) && fn3e.this.bb.onCreatePanelMenu(0, Zy) && fn3e.this.bb.onPreparePanel(0, null, Zy)) {
                fn3e.this.mcp(Zy);
            } else {
                fn3e.this.mcp(null);
            }
        }
    }

    fn3e(t8r t8rVar, InterfaceC6943g interfaceC6943g, InterfaceC6938s interfaceC6938s) {
        super(t8rVar);
        this.bv = false;
        this.an = false;
        this.id = false;
        this.in = null;
        this.bg = null;
        this.ba = false;
        this.ay = new zy();
        this.az = String.valueOf(SystemClock.elapsedRealtimeNanos());
        this.bb = interfaceC6943g;
        this.bp = interfaceC6938s;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a98o(Window window) {
        this.as = this.an ? miuix.appcompat.app.floatingactivity.helper.toq.m24920k(this.f38989k) : null;
        this.bg = null;
        View viewInflate = View.inflate(this.f38989k, nn86(window), null);
        View view = viewInflate;
        if (this.as != null) {
            boolean zGbni = gbni();
            this.id = zGbni;
            this.as.n7h(zGbni);
            ViewGroup viewGroupLd6 = this.as.ld6(viewInflate, this.id);
            this.bg = viewGroupLd6;
            r8s8(this.id);
            view = viewGroupLd6;
            if (this.as.cdj()) {
                this.f38989k.getOnBackPressedDispatcher().toq(this.f38989k, new toq(true));
                view = viewGroupLd6;
            }
        }
        View viewFindViewById = view.findViewById(toq.C6054p.f34891e);
        if (viewFindViewById instanceof ActionBarOverlayLayout) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewFindViewById;
            this.f38934v = actionBarOverlayLayout;
            actionBarOverlayLayout.setLifecycleOwner(ld6());
            ViewGroup viewGroup = (ViewGroup) this.f38934v.findViewById(R.id.content);
            ViewGroup viewGroup2 = (ViewGroup) window.findViewById(R.id.content);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    viewGroup.addView(childAt);
                }
                viewGroup2.setId(-1);
                viewGroup.setId(R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
        }
        window.setContentView(view);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38934v;
        if (actionBarOverlayLayout2 != null) {
            this.f38935w = (ViewGroup) actionBarOverlayLayout2.findViewById(R.id.content);
        }
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.f7l8(this.bg, gbni());
        }
    }

    private void fnq8(boolean z2, int i2, boolean z3, boolean z5) {
        if (this.an) {
            if (z5 || miuix.os.toq.f87880toq) {
                if (this.id == z2 || !this.bp.mo24986k(z2)) {
                    if (i2 != this.bl) {
                        this.bl = i2;
                        this.as.n7h(z2);
                        return;
                    }
                    return;
                }
                this.id = z2;
                this.as.n7h(z2);
                r8s8(this.id);
                ViewGroup.LayoutParams layoutParamsMo24918q = this.as.mo24918q();
                if (layoutParamsMo24918q != null) {
                    if (z2) {
                        layoutParamsMo24918q.height = -2;
                        layoutParamsMo24918q.width = -2;
                    } else {
                        layoutParamsMo24918q.height = -1;
                        layoutParamsMo24918q.width = -1;
                    }
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.requestLayout();
                    this.f38934v.m25148l(z2);
                }
                if (z3) {
                    m25002u(z2);
                }
            }
        }
    }

    private boolean gbni() {
        AbstractC6920k abstractC6920k = this.as;
        return abstractC6920k != null && abstractC6920k.mo24919y();
    }

    private void i1() {
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (this.f38999y) {
            return;
        }
        m25001l();
        this.f38999y = true;
        Window window = this.f38989k.getWindow();
        this.f86885ab = window.getLayoutInflater();
        TypedArray typedArrayObtainStyledAttributes = this.f38989k.obtainStyledAttributes(toq.ki.h9w7);
        if (typedArrayObtainStyledAttributes.getBoolean(toq.ki.jvci, this.bv)) {
            this.bq = new C6941k(this);
        }
        if (typedArrayObtainStyledAttributes.getInt(toq.ki.c59w, 0) == 1) {
            this.f38989k.getWindow().setGravity(80);
        }
        int i2 = toq.ki.mkxg;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a miui theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            requestWindowFeature(8);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(toq.ki.k2gn, false)) {
            requestWindowFeature(9);
        }
        this.an = typedArrayObtainStyledAttributes.getBoolean(toq.ki.i2en, false);
        this.id = typedArrayObtainStyledAttributes.getBoolean(toq.ki.woar, false);
        setTranslucentStatus(typedArrayObtainStyledAttributes.getInt(toq.ki.on, 0));
        this.bl = this.f38989k.getResources().getConfiguration().uiMode;
        a98o(window);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38934v;
        if (actionBarOverlayLayout2 != null) {
            actionBarOverlayLayout2.setCallback(this.f38989k);
            this.f38934v.setContentInsetStateCallback(this.f38989k);
            this.f38934v.setExtraPaddingObserver(this.f38989k);
            this.f38934v.setTranslucentStatus(getTranslucentStatus());
        }
        if (this.f38986h && (actionBarOverlayLayout = this.f38934v) != null) {
            this.f38933d = (ActionBarContainer) actionBarOverlayLayout.findViewById(toq.C6054p.f76334hyr);
            this.f38934v.setOverlayMode(this.f38987i);
            ActionBarView actionBarView = (ActionBarView) this.f38934v.findViewById(toq.C6054p.f76448x9kr);
            this.f38995q = actionBarView;
            actionBarView.setLifecycleOwner(ld6());
            this.f38995q.setWindowCallback(this.f38989k);
            if (this.f38994p) {
                this.f38995q.bek6();
            }
            if (ki()) {
                this.f38995q.setEndActionMenuEnable(true);
            }
            if (this.f38995q.getCustomNavigationView() != null) {
                ActionBarView actionBarView2 = this.f38995q;
                actionBarView2.setDisplayOptions(actionBarView2.getDisplayOptions() | 16);
            }
            boolean zEquals = "splitActionBarWhenNarrow".equals(qrj());
            if (zEquals) {
                this.ax = this.f38989k.getResources().getBoolean(toq.C6053n.f34874n);
            } else {
                this.ax = typedArrayObtainStyledAttributes.getBoolean(toq.ki.b2bv, false);
            }
            if (this.ax) {
                toq(true, zEquals, this.f38934v);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(toq.ki.ttpr, false)) {
                wvg(true, false);
            } else {
                this.f38989k.getWindow().getDecorView().post(this.ay);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: l */
    private void m25001l() {
        t8r t8rVar;
        Window window = this.ad;
        if (window != null) {
            return;
        }
        if (window == null && (t8rVar = this.f38989k) != null) {
            x9kr(t8rVar.getWindow());
        }
        if (this.ad == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static boolean lv5(Context context) {
        return C7164n.m25951q(context, toq.C6055q.e1, true);
    }

    private boolean nmn5() {
        return "android".equals(m25073p().getApplicationContext().getApplicationInfo().packageName);
    }

    private int nn86(Window window) {
        Context context = window.getContext();
        int i2 = C7164n.m25951q(context, toq.C6055q.e1, false) ? C7164n.m25951q(context, toq.C6055q.olea, false) ? toq.qrj.f76743py : toq.qrj.f76703g1 : toq.qrj.f76758v0af;
        int iZy = C7164n.zy(context, toq.C6055q.gpgg);
        if (iZy > 0 && nmn5() && lv5(context)) {
            i2 = iZy;
        }
        if (!window.isFloating() && (window.getCallback() instanceof Dialog)) {
            miuix.core.util.variable.toq.m25676k(window, C7164n.ld6(context, toq.C6055q.leq, 0));
        }
        return i2;
    }

    private void r8s8(boolean z2) {
        Window window = this.f38989k.getWindow();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z3 = ((systemUiVisibility & 1024) != 0) || (getTranslucentStatus() != 0);
        if (z2) {
            window.addFlags(201326592);
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
            }
        } else {
            systemUiVisibility = z3 ? systemUiVisibility | 1024 : systemUiVisibility & (-1025);
            if (Build.VERSION.SDK_INT >= 30) {
                if (z3) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    window.setDecorFitsSystemWindows(true);
                }
            }
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t8iq(Configuration configuration) {
        t8r t8rVar = this.f38989k;
        C7085q.m25608t(t8rVar, t8rVar.getWindowInfo(), null, true);
        fnq8(isInFloatingWindowMode(), configuration.uiMode, true, miuix.os.toq.f87881zy);
    }

    /* JADX INFO: renamed from: u */
    private void m25002u(boolean z2) {
        this.bp.toq(z2);
    }

    private void x9kr(@zy.lvui Window window) {
        if (this.ad != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C6942q) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C6942q c6942q = new C6942q(callback);
        this.am = c6942q;
        window.setCallback(c6942q);
        this.ad = window;
    }

    /* JADX INFO: renamed from: a */
    public boolean m25003a() {
        return this.ba;
    }

    /* JADX INFO: renamed from: b */
    public void m25004b() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.mo24913g();
        }
    }

    public void bf2(boolean z2, Bundle bundle) {
        if (z2) {
            Intent intent = this.f38989k.getIntent();
            if (intent == null || !MultiAppFloatingActivitySwitcher.m24961f(intent)) {
                FloatingActivitySwitcher.o1t(this.f38989k, bundle);
            } else {
                MultiAppFloatingActivitySwitcher.dd(this.f38989k, intent, bundle);
            }
        }
    }

    public void bo(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray;
        this.bb.toq(bundle);
        if (this.f38933d == null || (sparseParcelableArray = bundle.getSparseParcelableArray(be)) == null) {
            return;
        }
        this.f38933d.restoreHierarchyState(sparseParcelableArray);
    }

    /* JADX INFO: renamed from: c */
    public void m25005c() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.executeOpenExitAnimation();
        }
    }

    public void c8jq() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.m25146f();
        }
    }

    public boolean ch() {
        return this.an;
    }

    /* JADX INFO: renamed from: d */
    public void m25006d(boolean z2) {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.x2(z2);
        }
    }

    public void d8wk(boolean z2) {
        this.bv = z2;
    }

    public void dd(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.bq;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.mo26544k(configuration);
        }
    }

    @Override // kz28.InterfaceC6758k
    public void dispatchResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        onResponsiveLayout(configuration, c6753n, z2);
    }

    public void dr(int i2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuCustomViewTranslationYWithPx(i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m25007e() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.getBottomMenuCustomViewTranslationY();
        }
        return 0;
    }

    public void ek5k(boolean z2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.m25150t(z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m25008f() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.executeOpenEnterAnimation();
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public void fn3e(Bundle bundle) {
        this.f38989k.checkThemeLegality();
        if (!C7006q.f39346k) {
            C7006q.f39346k = true;
            C7006q.toq(getThemedContext().getApplicationContext());
        }
        this.bb.mo25015k(bundle);
        i1();
        bf2(this.an, bundle);
        boolean zM25951q = C7164n.m25951q(this.f38989k, toq.C6055q.nfw3, C7164n.ld6(this.f38989k, toq.C6055q.lb, 0) != 0);
        boolean zM25951q2 = C7164n.m25951q(this.f38989k, toq.C6055q.pwca, zM25951q);
        mu(zM25951q);
        qkj8(zM25951q2);
    }

    void g1(CharSequence charSequence) {
        this.ac = charSequence;
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView != null) {
            actionBarView.setWindowTitle(charSequence);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public int getBottomMenuMode() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        return actionBarOverlayLayout != null ? actionBarOverlayLayout.getBottomMenuMode() : super.getBottomMenuMode();
    }

    @Override // miuix.appcompat.app.jp0y
    public Rect getContentInset() {
        return this.f38993o;
    }

    @Override // kz28.InterfaceC6758k
    public kt06.toq getResponsiveState() {
        BaseResponseStateManager baseResponseStateManager = this.bq;
        if (baseResponseStateManager != null) {
            return baseResponseStateManager.m26542h();
        }
        return null;
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public Context getThemedContext() {
        return this.f38989k;
    }

    public void gyi(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuCustomView(view);
        }
    }

    public int hb() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.getExtraHorizontalPadding();
        }
        return 0;
    }

    public void hyr() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.executeCloseExitAnimation();
        }
    }

    public void i9jn() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.ki();
        }
    }

    public void ikck(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f38999y) {
            i1();
        }
        ViewGroup viewGroup = this.f38935w;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f38935w.addView(view, layoutParams);
        }
        this.am.m399k().onContentChanged();
    }

    @Override // miuix.appcompat.app.toq
    public void invalidateOptionsMenu() {
        if (this.f38989k.isFinishing()) {
            return;
        }
        this.ay.run();
    }

    public boolean isInFloatingWindowMode() {
        Boolean bool = this.in;
        return bool == null ? gbni() : bool.booleanValue();
    }

    public boolean isRegisterResponsive() {
        return this.bq != null;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public int m25009j() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.getExtraHorizontalPaddingLevel();
        }
        return 0;
    }

    @Override // miuix.appcompat.app.toq
    public AbstractC6946k jk() {
        if (!this.f38999y) {
            i1();
        }
        if (this.f38934v == null) {
            return null;
        }
        return new C6998s(this.f38989k, this.f38934v);
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public InterfaceC0954z ld6() {
        return this.f38989k;
    }

    public void lrht() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.toq();
        }
    }

    @yz
    public void ltg8(int i2) {
        BaseResponseStateManager baseResponseStateManager = this.bq;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.ni7(i2);
        }
    }

    @Override // kz28.InterfaceC6758k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Activity getResponsiveSubject() {
        return this.f38989k;
    }

    public void mu(boolean z2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraHorizontalPaddingEnable(z2);
        }
    }

    public void n5r1() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.executeCloseEnterAnimation();
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public View n7h() {
        return this.f38934v;
    }

    public void ncyb(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.bq;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.toq(configuration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6955q
    protected boolean ni7(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        return this.f38989k.onPrepareOptionsMenu(f7l8Var);
    }

    /* JADX INFO: renamed from: o */
    public View m25011o() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            return abstractC6920k.zy();
        }
        return null;
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public void onConfigurationChanged(final Configuration configuration) {
        t8r t8rVar = this.f38989k;
        C7085q.m25608t(t8rVar, t8rVar.getWindowInfo(), configuration, false);
        this.f38989k.getWindow().getDecorView().post(new Runnable() { // from class: miuix.appcompat.app.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f38941k.t8iq(configuration);
            }
        });
        super.onConfigurationChanged(configuration);
        this.bb.onConfigurationChanged(configuration);
        if (m25070i()) {
            fti();
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.jp0y
    public void onContentInsetChanged(Rect rect) {
        super.onContentInsetChanged(rect);
        List<Fragment> listFnq8 = this.f38989k.getSupportFragmentManager().fnq8();
        int size = listFnq8.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.lifecycle.n7h n7hVar = (Fragment) listFnq8.get(i2);
            if (n7hVar instanceof gvn7) {
                gvn7 gvn7Var = (gvn7) n7hVar;
                if (!gvn7Var.hasActionBar()) {
                    gvn7Var.onContentInsetChanged(rect);
                }
            }
        }
    }

    @Override // miuix.appcompat.app.toq
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 != 0 && this.bb.onCreatePanelMenu(i2, menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [miuix.appcompat.app.g] */
    /* JADX WARN: Type inference failed for: r1v2, types: [miuix.appcompat.app.g] */
    /* JADX WARN: Type inference failed for: r4v0, types: [miuix.appcompat.app.fn3e, miuix.appcompat.app.q] */
    /* JADX WARN: Type inference failed for: r5v2, types: [miuix.appcompat.internal.view.menu.f7l8] */
    /* JADX WARN: Type inference failed for: r5v3, types: [miuix.appcompat.internal.view.menu.f7l8] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.Menu, miuix.appcompat.internal.view.menu.f7l8] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.Menu, miuix.appcompat.internal.view.menu.f7l8] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // miuix.appcompat.app.toq
    public View onCreatePanelView(int i2) {
        if (i2 != 0) {
            return this.bb.onCreatePanelView(i2);
        }
        if (ki() || this.ax) {
            ?? r5 = this.f38992n;
            boolean zOnPreparePanel = true;
            r5 = r5;
            if (this.f38985g == null) {
                if (r5 == 0) {
                    ?? Zy = zy();
                    mcp(Zy);
                    Zy.m25335a();
                    zOnPreparePanel = this.bb.onCreatePanelMenu(0, Zy);
                    r5 = Zy;
                }
                if (zOnPreparePanel) {
                    r5.m25335a();
                    zOnPreparePanel = this.bb.onPreparePanel(0, null, r5);
                }
            } else if (r5 == 0) {
                zOnPreparePanel = false;
            }
            if (zOnPreparePanel) {
                r5.a98o();
            } else {
                mcp(null);
            }
        }
        return null;
    }

    @Override // miuix.appcompat.app.mcp
    public void onExtraPaddingChanged(int i2) {
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public boolean onMenuItemSelected(int i2, @zy.lvui MenuItem menuItem) {
        if (this.bb.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0 && menuItem.getItemId() == 16908332 && getActionBar() != null && (getActionBar().mo159h() & 4) != 0) {
            if (!(this.f38989k.getParent() == null ? this.f38989k.onNavigateUp() : this.f38989k.getParent().onNavigateUpFromChild(this.f38989k))) {
                this.f38989k.finish();
            }
        }
        return false;
    }

    @Override // miuix.appcompat.app.toq
    public void onPanelClosed(int i2, Menu menu) {
        this.bb.onPanelClosed(i2, menu);
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public void onPostResume() {
        this.bb.onPostResume();
        C6998s c6998s = (C6998s) getActionBar();
        if (c6998s != null) {
            c6998s.bo(true);
        }
    }

    @Override // miuix.appcompat.app.toq
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 != 0 && this.bb.onPreparePanel(i2, view, menu);
    }

    @Override // kz28.InterfaceC6758k
    public void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        t8r t8rVar = this.f38989k;
        if (t8rVar instanceof InterfaceC6758k) {
            t8rVar.onResponsiveLayout(configuration, c6753n, z2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public void onStop() {
        this.bb.onStop();
        m25074q(false);
        C6998s c6998s = (C6998s) getActionBar();
        if (c6998s != null) {
            c6998s.bo(false);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return getActionBar() != null ? ((C6998s) getActionBar()).ge(callback) : super.onWindowStartingActionMode(callback);
    }

    public void py() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.uv6();
        }
    }

    public void qkj8(boolean z2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraPaddingApplyToContentEnable(z2);
        }
    }

    public void qo(InterfaceC6939y interfaceC6939y) {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.kja0(interfaceC6939y);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m25012r(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f38999y) {
            i1();
        }
        ViewGroup viewGroup = this.f38935w;
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        this.am.m399k().onContentChanged();
    }

    @Override // miuix.appcompat.app.jp0y
    public boolean requestDispatchContentInset() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout == null) {
            return false;
        }
        actionBarOverlayLayout.m25144c();
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.toq
    /* JADX INFO: renamed from: s */
    public boolean mo24868s(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, MenuItem menuItem) {
        return this.f38989k.onMenuItemSelected(0, menuItem);
    }

    @Override // miuix.appcompat.app.toq
    public void setBottomExtraInset(int i2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomExtraInset(i2);
        }
    }

    @Override // miuix.appcompat.app.toq
    public void setBottomMenuMode(int i2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setBottomMenuMode(i2);
        }
    }

    @Override // miuix.appcompat.app.toq, miuix.appcompat.app.jp0y
    public void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setCorrectNestedScrollMotionEventEnabled(z2);
        }
    }

    public void setFloatingWindowBorderEnable(boolean z2) {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.qrj(z2);
        }
    }

    public void setFloatingWindowMode(boolean z2) {
        this.in = Boolean.valueOf(z2);
        fnq8(z2, this.bl, true, true);
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (callback instanceof n7h.toq) {
            m25071k(this.f38934v);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.startActionMode(callback);
        }
        return null;
    }

    public void tfm(miuix.appcompat.app.floatingactivity.f7l8 f7l8Var) {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.mo24914h(f7l8Var);
        }
    }

    View uv6() {
        return this.f38934v;
    }

    /* JADX INFO: renamed from: v */
    public void m25013v(View view) {
        ikck(view, new ViewGroup.LayoutParams(-1, -1));
    }

    @Deprecated
    public void vq(int i2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setExtraHorizontalPaddingLevel(i2);
        }
    }

    public String vyq() {
        return this.az;
    }

    public boolean was() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k == null) {
            return false;
        }
        boolean zMo24915k = abstractC6920k.mo24915k();
        if (zMo24915k) {
            this.ba = true;
        }
        return zMo24915k;
    }

    public void wo(lvui lvuiVar) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setOnStatusBarChangeListener(lvuiVar);
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m25014x() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.eqxt();
        }
        return false;
    }

    public void xwq3(int i2) {
        if (!this.f38999y) {
            i1();
        }
        ViewGroup viewGroup = this.f38935w;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f86885ab.inflate(i2, this.f38935w);
        }
        this.am.m399k().onContentChanged();
    }

    public void y2(Bundle bundle) {
        this.bb.zy(bundle);
        if (bundle != null && this.as != null) {
            FloatingActivitySwitcher.a9(this.f38989k, bundle);
            MultiAppFloatingActivitySwitcher.m24964j(this.f38989k.getTaskId(), this.f38989k.getActivityIdentity(), bundle);
        }
        if (this.f38933d != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f38933d.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(be, sparseArray);
        }
    }

    public void y9n() {
        AbstractC6920k abstractC6920k = this.as;
        if (abstractC6920k != null) {
            abstractC6920k.mo24916n();
        }
    }

    public void yz() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.mcp();
        }
    }

    public boolean zp() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            return actionBarOverlayLayout.oc();
        }
        return false;
    }

    public void zsr0(boolean z2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38934v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.lrht(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6955q
    protected boolean zurt(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        return this.f38989k.onCreateOptionsMenu(f7l8Var);
    }
}

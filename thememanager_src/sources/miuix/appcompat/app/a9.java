package miuix.appcompat.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0954z;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.List;
import kt06.C6753n;
import kz28.InterfaceC6758k;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.appcompat.internal.app.widget.C6998s;
import miuix.internal.util.C7164n;
import miuix.responsive.page.manager.BaseResponseStateManager;
import miuix.view.n7h;

/* JADX INFO: compiled from: FragmentDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class a9 extends AbstractC6955q implements InterfaceC6758k<Fragment> {
    private static final int az = 16;
    public static final int ba = 1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private View f86835ab;
    private byte an;

    @zy.dd
    private BaseResponseStateManager as;
    private int bb;
    private final Window.Callback bg;
    protected boolean bl;
    private Context bp;
    private miuix.appcompat.internal.view.menu.f7l8 bv;

    /* JADX INFO: renamed from: d */
    private Fragment f38777d;
    private Runnable id;
    protected boolean in;

    /* JADX INFO: renamed from: v */
    private boolean f38778v;

    /* JADX INFO: renamed from: w */
    private View f38779w;

    /* JADX INFO: renamed from: miuix.appcompat.app.a9$k */
    /* JADX INFO: compiled from: FragmentDelegate.java */
    class C6913k extends miuix.appcompat.internal.view.f7l8 {
        C6913k() {
        }

        @Override // miuix.appcompat.internal.view.f7l8, android.view.Window.Callback
        public void onActionModeFinished(ActionMode actionMode) {
            ((gvn7) a9.this.f38777d).onActionModeFinished(actionMode);
        }

        @Override // miuix.appcompat.internal.view.f7l8, android.view.Window.Callback
        public void onActionModeStarted(ActionMode actionMode) {
            ((gvn7) a9.this.f38777d).onActionModeStarted(actionMode);
        }

        @Override // miuix.appcompat.internal.view.f7l8, android.view.Window.Callback
        public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
            return a9.this.onMenuItemSelected(i2, menuItem);
        }

        @Override // miuix.appcompat.internal.view.f7l8, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            a9.this.onPanelClosed(i2, menu);
        }

        @Override // miuix.appcompat.internal.view.f7l8, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return a9.this.onWindowStartingActionMode(callback);
        }
    }

    /* JADX INFO: compiled from: FragmentDelegate.java */
    class toq extends BaseResponseStateManager {
        toq(InterfaceC6758k interfaceC6758k) {
            super(interfaceC6758k);
        }

        @Override // miuix.responsive.page.manager.AbstractC7322k
        protected Context f7l8() {
            return a9.this.getThemedContext();
        }
    }

    /* JADX INFO: compiled from: FragmentDelegate.java */
    private static class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<a9> f38782k;

        zy(a9 a9Var) {
            this.f38782k = null;
            this.f38782k = new WeakReference<>(a9Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<a9> weakReference = this.f38782k;
            a9 a9Var = weakReference == null ? null : weakReference.get();
            if (a9Var == null) {
                return;
            }
            boolean zOnPreparePanel = true;
            if ((a9Var.an & 1) == 1) {
                a9Var.bv = null;
            }
            if (a9Var.bv == null) {
                a9Var.bv = a9Var.zy();
                zOnPreparePanel = a9Var.onCreatePanelMenu(0, a9Var.bv);
            }
            if (zOnPreparePanel) {
                zOnPreparePanel = a9Var.onPreparePanel(0, null, a9Var.bv);
            }
            if (zOnPreparePanel) {
                a9Var.mcp(a9Var.bv);
            } else {
                a9Var.mcp(null);
                a9Var.bv = null;
            }
            a9.d2ok(a9Var, -18);
        }
    }

    public a9(Fragment fragment) {
        super((t8r) fragment.getActivity());
        this.f38778v = false;
        this.in = false;
        this.bl = false;
        this.bg = new C6913k();
        this.f38777d = fragment;
    }

    static /* synthetic */ byte d2ok(a9 a9Var, int i2) {
        byte b2 = (byte) (i2 & a9Var.an);
        a9Var.an = b2;
        return b2;
    }

    private Runnable n5r1() {
        if (this.id == null) {
            this.id = new zy(this);
        }
        return this.id;
    }

    /* JADX INFO: renamed from: a */
    public void m24859a(boolean z2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).lrht(z2);
        }
    }

    public void a98o(boolean z2) {
        this.f38778v = z2;
    }

    /* JADX INFO: renamed from: b */
    public void m24860b(boolean z2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setExtraPaddingApplyToContentEnable(z2);
        }
    }

    public void bf2(int i2) {
        this.bb = i2;
    }

    /* JADX INFO: renamed from: c */
    public void m24861c() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).mcp();
        }
    }

    public void checkThemeLegality() {
    }

    public int dd() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            return ((ActionBarOverlayLayout) view).getBottomMenuCustomViewTranslationY();
        }
        return 0;
    }

    @Override // kz28.InterfaceC6758k
    public void dispatchResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        onResponsiveLayout(configuration, c6753n, z2);
    }

    @zy.dd
    /* JADX INFO: renamed from: e */
    public Animator m24862e(int i2, boolean z2, int i3) {
        return miuix.appcompat.internal.util.zy.m25248k(this.f38777d, i3);
    }

    public void ek5k(int i2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setBottomMenuCustomViewTranslationYWithPx(i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m24863f(boolean z2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).m25150t(z2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public int getBottomMenuMode() {
        View view = this.f86835ab;
        return view instanceof ActionBarOverlayLayout ? ((ActionBarOverlayLayout) view).getBottomMenuMode() : super.getBottomMenuMode();
    }

    @Override // miuix.appcompat.app.jp0y
    public Rect getContentInset() {
        boolean z2 = this.f38986h;
        if (!z2 && this.f38993o == null) {
            androidx.lifecycle.n7h parentFragment = this.f38777d.getParentFragment();
            if (parentFragment instanceof gvn7) {
                this.f38993o = ((gvn7) parentFragment).getContentInset();
            } else if (parentFragment == null) {
                this.f38993o = m25073p().getContentInset();
            }
        } else if (z2) {
            View view = this.f86835ab;
            if (view instanceof ActionBarOverlayLayout) {
                this.f38993o = ((ActionBarOverlayLayout) view).getContentInset();
            }
        }
        return this.f38993o;
    }

    @Override // kz28.InterfaceC6758k
    public kt06.toq getResponsiveState() {
        BaseResponseStateManager baseResponseStateManager = this.as;
        if (baseResponseStateManager != null) {
            return baseResponseStateManager.m26542h();
        }
        return null;
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public Context getThemedContext() {
        if (this.bp == null) {
            this.bp = this.f38989k;
            if (this.bb != 0) {
                this.bp = new ContextThemeWrapper(this.bp, this.bb);
            }
        }
        return this.bp;
    }

    public void hb() {
        onDestroy();
        this.f38779w = null;
        this.f86835ab = null;
        this.f38999y = false;
        this.f38988j = false;
        this.f39000z = null;
        this.f38995q = null;
        this.id = null;
    }

    @Override // kz28.InterfaceC6758k
    /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
    public Fragment getResponsiveSubject() {
        return this.f38777d;
    }

    public void i1(lvui lvuiVar) {
        View view = this.f86835ab;
        if (view == null || !(view instanceof ActionBarOverlayLayout)) {
            return;
        }
        ((ActionBarOverlayLayout) view).setOnStatusBarChangeListener(lvuiVar);
    }

    @Override // miuix.appcompat.app.toq
    public void invalidateOptionsMenu() {
        byte b2 = this.an;
        if ((b2 & 16) == 0) {
            this.an = (byte) (b2 | 16);
            n5r1().run();
        }
    }

    public boolean isInEditActionMode() {
        androidx.lifecycle.n7h parentFragment = this.f38777d.getParentFragment();
        return (hasActionBar() || !(parentFragment instanceof gvn7)) ? this.in : ((gvn7) parentFragment).isInEditActionMode();
    }

    public boolean isIsInSearchActionMode() {
        androidx.lifecycle.n7h parentFragment = this.f38777d.getParentFragment();
        return (hasActionBar() || !(parentFragment instanceof gvn7)) ? this.bl : ((gvn7) parentFragment).isIsInSearchActionMode();
    }

    public boolean isRegisterResponsive() {
        return this.as != null;
    }

    /* JADX INFO: renamed from: j */
    public void m24864j(@zy.lvui View view, @zy.dd Bundle bundle) {
        ((gvn7) this.f38777d).onViewInflated(this.f38779w, bundle);
    }

    @Override // miuix.appcompat.app.toq
    public AbstractC6946k jk() {
        if (!this.f38777d.isAdded() || this.f38995q == null) {
            return null;
        }
        return new C6998s(this.f38777d);
    }

    /* JADX INFO: renamed from: l */
    public View m24865l() {
        return this.f38779w;
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public InterfaceC0954z ld6() {
        return this.f38777d;
    }

    final void lrht(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean z2;
        if (this.f38999y) {
            if (this.f86835ab.getParent() == null || !(this.f86835ab.getParent() instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f86835ab.getParent();
            if (viewGroup2.getChildCount() == 0) {
                viewGroup2.endViewTransition(this.f86835ab);
                return;
            }
            return;
        }
        ActivityC0891q activity = this.f38777d.getActivity();
        boolean z3 = activity instanceof t8r;
        if (z3) {
            t8r t8rVar = (t8r) activity;
            y9n(t8rVar.getExtraHorizontalPaddingLevel());
            t8rVar.setExtraHorizontalPaddingEnable(false);
            t8rVar.setExtraPaddingApplyToContentEnable(false);
        }
        this.f38999y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) layoutInflater.inflate(toq.qrj.f76703g1, viewGroup, false);
        actionBarOverlayLayout.setLifecycleOwner(ld6());
        actionBarOverlayLayout.setCallback(this.bg);
        androidx.lifecycle.n7h n7hVar = this.f38777d;
        if (n7hVar instanceof gvn7) {
            actionBarOverlayLayout.setContentInsetStateCallback((jp0y) n7hVar);
            actionBarOverlayLayout.setExtraPaddingObserver((mcp) this.f38777d);
        }
        actionBarOverlayLayout.setRootSubDecor(false);
        actionBarOverlayLayout.setOverlayMode(this.f38987i);
        actionBarOverlayLayout.setTranslucentStatus(getTranslucentStatus());
        if (this.bb != 0) {
            checkThemeLegality();
            ((gvn7) this.f38777d).checkThemeLegality();
            actionBarOverlayLayout.setBackground(C7164n.m25952s(context, R.attr.windowBackground));
        }
        if (z3) {
            actionBarOverlayLayout.m25148l(((t8r) activity).isInFloatingWindowMode());
        }
        ActionBarView actionBarView = (ActionBarView) actionBarOverlayLayout.findViewById(toq.C6054p.f76448x9kr);
        this.f38995q = actionBarView;
        actionBarView.setLifecycleOwner(ld6());
        this.f38995q.setWindowCallback(this.bg);
        if (this.f38994p) {
            this.f38995q.bek6();
        }
        if (ki()) {
            this.f38995q.setEndActionMenuEnable(true);
        }
        boolean zEquals = "splitActionBarWhenNarrow".equals(qrj());
        if (zEquals) {
            z2 = context.getResources().getBoolean(toq.C6053n.f34874n);
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(toq.ki.h9w7);
            boolean z5 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.b2bv, false);
            typedArrayObtainStyledAttributes.recycle();
            z2 = z5;
        }
        if (z2) {
            toq(z2, zEquals, actionBarOverlayLayout);
        }
        m24869x(1);
        this.f86835ab = actionBarOverlayLayout;
    }

    /* JADX INFO: renamed from: m */
    public void m24866m(View view) {
        View view2 = this.f86835ab;
        if (view2 instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view2).setBottomMenuCustomView(view);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q
    public View n7h() {
        return this.f86835ab;
    }

    public int ncyb() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            return ((ActionBarOverlayLayout) view).getExtraHorizontalPaddingLevel();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6955q
    protected boolean ni7(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        this.f38777d.onPrepareOptionsMenu(f7l8Var);
        return true;
    }

    public View nn86(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = getThemedContext().obtainStyledAttributes(toq.ki.h9w7);
        if (typedArrayObtainStyledAttributes.getBoolean(toq.ki.jvci, this.f38778v)) {
            this.as = new toq(this);
        }
        int i2 = toq.ki.mkxg;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a miuix theme (or descendant) with this fragment.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            requestWindowFeature(8);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(toq.ki.k2gn, false)) {
            requestWindowFeature(9);
        }
        setTranslucentStatus(typedArrayObtainStyledAttributes.getInt(toq.ki.on, 0));
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(getThemedContext());
        if (this.f38986h) {
            lrht(getThemedContext(), viewGroup, layoutInflaterCloneInContext);
            ViewGroup viewGroup2 = (ViewGroup) this.f86835ab.findViewById(R.id.content);
            View viewOnInflateView = ((gvn7) this.f38777d).onInflateView(layoutInflaterCloneInContext, viewGroup2, bundle);
            this.f38779w = viewOnInflateView;
            if (viewOnInflateView != null && viewOnInflateView.getParent() != viewGroup2) {
                if (this.f38779w.getParent() != null) {
                    ((ViewGroup) this.f38779w.getParent()).removeView(this.f38779w);
                }
                viewGroup2.removeAllViews();
                viewGroup2.addView(this.f38779w);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(toq.ki.ttpr, false)) {
                wvg(true, false);
            } else {
                ActivityC0891q activity = this.f38777d.getActivity();
                if (activity != null) {
                    byte b2 = this.an;
                    if ((b2 & 16) == 0) {
                        this.an = (byte) (b2 | 16);
                        activity.getWindow().getDecorView().post(n5r1());
                    }
                }
            }
        } else {
            View viewOnInflateView2 = ((gvn7) this.f38777d).onInflateView(layoutInflaterCloneInContext, viewGroup, bundle);
            this.f38779w = viewOnInflateView2;
            this.f86835ab = viewOnInflateView2;
        }
        typedArrayObtainStyledAttributes.recycle();
        return this.f86835ab;
    }

    /* JADX INFO: renamed from: o */
    public void m24867o() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).m25146f();
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public void onConfigurationChanged(Configuration configuration) {
        BaseResponseStateManager baseResponseStateManager = this.as;
        if (baseResponseStateManager != null) {
            baseResponseStateManager.toq(this.f38777d.getResources().getConfiguration());
        }
        super.onConfigurationChanged(configuration);
        View view = this.f86835ab;
        if (view != null && (view instanceof ActionBarOverlayLayout)) {
            ActivityC0891q activity = this.f38777d.getActivity();
            if (activity instanceof t8r) {
                ((ActionBarOverlayLayout) this.f86835ab).m25148l(((t8r) activity).isInFloatingWindowMode());
            }
        }
        BaseResponseStateManager baseResponseStateManager2 = this.as;
        if (baseResponseStateManager2 != null) {
            baseResponseStateManager2.mo26544k(configuration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.jp0y
    public void onContentInsetChanged(Rect rect) {
        super.onContentInsetChanged(rect);
        List<Fragment> listFnq8 = this.f38777d.getChildFragmentManager().fnq8();
        int size = listFnq8.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = listFnq8.get(i2);
            if ((fragment instanceof gvn7) && fragment.isAdded()) {
                gvn7 gvn7Var = (gvn7) fragment;
                if (!gvn7Var.hasActionBar()) {
                    gvn7Var.onContentInsetChanged(rect);
                }
            }
        }
    }

    @Override // miuix.appcompat.app.toq
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            return ((gvn7) this.f38777d).onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    @Override // miuix.appcompat.app.toq
    public View onCreatePanelView(int i2) {
        return null;
    }

    @Override // miuix.appcompat.app.mcp
    public void onExtraPaddingChanged(int i2) {
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (i2 == 0) {
            return this.f38777d.onOptionsItemSelected(menuItem);
        }
        if (i2 == 6) {
            return this.f38777d.onContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // miuix.appcompat.app.toq
    public void onPanelClosed(int i2, Menu menu) {
        ((gvn7) this.f38777d).onPanelClosed(i2, menu);
        if (i2 == 0) {
            this.f38777d.onOptionsMenuClosed(menu);
        }
    }

    @Override // miuix.appcompat.app.toq
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return false;
        }
        ((gvn7) this.f38777d).onPreparePanel(i2, null, menu);
        return true;
    }

    @Override // kz28.InterfaceC6758k
    public void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        androidx.lifecycle.n7h n7hVar = this.f38777d;
        if (n7hVar instanceof InterfaceC6758k) {
            ((InterfaceC6758k) n7hVar).onResponsiveLayout(configuration, c6753n, z2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (getActionBar() != null) {
            return ((C6998s) getActionBar()).ge(callback);
        }
        return null;
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public void registerCoordinateScrollView(View view) {
        super.registerCoordinateScrollView(view);
        if (hasActionBar()) {
            return;
        }
        androidx.lifecycle.n7h parentFragment = this.f38777d.getParentFragment();
        AbstractC6946k actionBar = parentFragment instanceof gvn7 ? ((gvn7) parentFragment).getActionBar() : null;
        if (actionBar != null) {
            actionBar.ktq(view);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public boolean requestDispatchContentInset() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).m25144c();
            return true;
        }
        androidx.lifecycle.n7h parentFragment = this.f38777d.getParentFragment();
        if (parentFragment instanceof gvn7 ? ((gvn7) parentFragment).requestDispatchContentInset() : false) {
            return false;
        }
        return m25073p().requestDispatchContentInset();
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.toq
    /* JADX INFO: renamed from: s */
    public boolean mo24868s(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, MenuItem menuItem) {
        return onMenuItemSelected(0, menuItem);
    }

    @Override // miuix.appcompat.app.toq
    public void setBottomExtraInset(int i2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setBottomExtraInset(i2);
        }
    }

    @Override // miuix.appcompat.app.toq
    public void setBottomMenuMode(int i2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setBottomMenuMode(i2);
        }
    }

    @Override // miuix.appcompat.app.toq, miuix.appcompat.app.jp0y
    public void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setCorrectNestedScrollMotionEventEnabled(z2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (callback instanceof n7h.toq) {
            m25071k((ActionBarOverlayLayout) this.f86835ab);
        }
        return this.f86835ab.startActionMode(callback);
    }

    @Override // miuix.appcompat.app.AbstractC6955q, miuix.appcompat.app.toq
    public void unregisterCoordinateScrollView(View view) {
        super.unregisterCoordinateScrollView(view);
        if (hasActionBar()) {
            return;
        }
        androidx.lifecycle.n7h parentFragment = this.f38777d.getParentFragment();
        AbstractC6946k actionBar = parentFragment instanceof gvn7 ? ((gvn7) parentFragment).getActionBar() : null;
        if (actionBar != null) {
            actionBar.v5yj(view);
        }
    }

    public boolean uv6() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            return ((ActionBarOverlayLayout) view).oc();
        }
        return false;
    }

    public boolean vyq() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            return ((ActionBarOverlayLayout) view).eqxt();
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public void m24869x(int i2) {
        this.an = (byte) ((i2 & 1) | this.an);
    }

    public int x9kr() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            return ((ActionBarOverlayLayout) view).getExtraHorizontalPadding();
        }
        return 0;
    }

    @Deprecated
    public void y9n(int i2) {
    }

    public void yz(boolean z2) {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).setExtraHorizontalPaddingEnable(z2);
        }
    }

    public void zp() {
        View view = this.f86835ab;
        if (view instanceof ActionBarOverlayLayout) {
            ((ActionBarOverlayLayout) view).uv6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.AbstractC6955q
    protected boolean zurt(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        return ((gvn7) this.f38777d).onCreateOptionsMenu(f7l8Var);
    }
}

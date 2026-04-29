package miuix.appcompat.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0903y;
import androidx.fragment.app.Fragment;
import gb.toq;
import kt06.C6753n;
import kz28.InterfaceC6758k;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: ListFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class d2ok extends androidx.fragment.app.jp0y implements gvn7, InterfaceC6758k<Fragment> {

    /* JADX INFO: renamed from: c */
    private a9 f38784c;

    /* JADX INFO: renamed from: e */
    private boolean f38785e = true;

    /* JADX INFO: renamed from: j */
    private boolean f38786j = true;

    public MenuInflater bih() {
        return this.f38784c.x2();
    }

    @Override // miuix.appcompat.app.jp0y
    public void bindViewWithContentInset(View view) {
        this.f38784c.bindViewWithContentInset(view);
    }

    @Override // miuix.appcompat.app.gvn7
    public void checkThemeLegality() {
    }

    @Override // miuix.appcompat.app.d3
    public void dismissImmersionMenu(boolean z2) {
        this.f38784c.m25074q(z2);
    }

    @Override // kz28.InterfaceC6758k
    public void dispatchResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        this.f38784c.dispatchResponsiveLayout(configuration, c6753n, z2);
    }

    @Override // kz28.InterfaceC6758k
    /* JADX INFO: renamed from: ec, reason: merged with bridge method [inline-methods] */
    public Fragment getResponsiveSubject() {
        return this;
    }

    @Override // miuix.appcompat.app.gvn7
    @zy.dd
    public AbstractC6946k getActionBar() {
        return this.f38784c.getActionBar();
    }

    @Override // miuix.appcompat.app.jp0y
    public Rect getContentInset() {
        return this.f38784c.getContentInset();
    }

    @Override // kz28.InterfaceC6758k
    public kt06.toq getResponsiveState() {
        return this.f38784c.getResponsiveState();
    }

    @Override // miuix.appcompat.app.gvn7
    public Context getThemedContext() {
        return this.f38784c.getThemedContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        a9 a9Var = this.f38784c;
        if (a9Var == null) {
            return null;
        }
        return a9Var.n7h();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean hasActionBar() {
        a9 a9Var = this.f38784c;
        if (a9Var == null) {
            return false;
        }
        return a9Var.hasActionBar();
    }

    @Override // miuix.appcompat.app.d3
    public void hideEndOverflowMenu() {
        this.f38784c.kja0();
    }

    @Override // miuix.appcompat.app.d3
    public void hideOverflowMenu() {
        this.f38784c.cdj();
    }

    public void invalidateOptionsMenu() {
        a9 a9Var = this.f38784c;
        if (a9Var != null) {
            a9Var.m24869x(1);
            if (!isHidden() && this.f38785e && this.f38786j && isAdded()) {
                this.f38784c.invalidateOptionsMenu();
            }
        }
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isInEditActionMode() {
        return this.f38784c.isInEditActionMode();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isIsInSearchActionMode() {
        return this.f38784c.isIsInSearchActionMode();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isRegisterResponsive() {
        return this.f38784c.isRegisterResponsive();
    }

    protected boolean o5() {
        return false;
    }

    @Override // miuix.appcompat.app.gvn7
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f38784c.onActionModeFinished(actionMode);
    }

    @Override // miuix.appcompat.app.gvn7
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f38784c.onActionModeStarted(actionMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@zy.lvui Context context) {
        super.onAttach(context);
        C0903y c0903yVq = getParentFragmentManager().vq();
        if (c0903yVq instanceof C6958t) {
            this.f38784c = ((C6958t) c0903yVq).m25080n(this);
        } else {
            this.f38784c = new a9(this);
        }
        this.f38784c.a98o(o5());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f38784c.onConfigurationChanged(configuration);
    }

    @Override // miuix.appcompat.app.jp0y
    public void onContentInsetChanged(Rect rect) {
        this.f38784c.onContentInsetChanged(rect);
        onProcessBindViewWithContentInset(rect);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38784c.fn3e(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return this.f38784c.m24862e(i2, z2, i3);
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0 && this.f38785e && this.f38786j && !isHidden() && isAdded()) {
            return onCreateOptionsMenu(menu);
        }
        return false;
    }

    @Override // androidx.fragment.app.jp0y, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z2;
        View viewNn86 = this.f38784c.nn86(layoutInflater, viewGroup, bundle);
        if (viewNn86 instanceof ActionBarOverlayLayout) {
            boolean zEquals = "splitActionBarWhenNarrow".equals(this.f38784c.qrj());
            if (zEquals) {
                z2 = getActivity().getResources().getBoolean(toq.C6053n.f34874n);
            } else {
                TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(toq.ki.h9w7);
                boolean z3 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.b2bv, false);
                typedArrayObtainStyledAttributes.recycle();
                z2 = z3;
            }
            this.f38784c.toq(z2, zEquals, (ActionBarOverlayLayout) viewNn86);
        }
        return viewNn86;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f38784c.m25074q(false);
    }

    @Override // miuix.appcompat.app.jp0y
    public void onDispatchNestedScrollOffset(int[] iArr) {
        this.f38784c.onDispatchNestedScrollOffset(iArr);
    }

    @Override // miuix.appcompat.app.mcp
    public void onExtraPaddingChanged(int i2) {
        this.f38784c.onExtraPaddingChanged(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z2) {
        a9 a9Var;
        super.onHiddenChanged(z2);
        if (!z2 && (a9Var = this.f38784c) != null) {
            a9Var.invalidateOptionsMenu();
        }
        yw(!z2);
    }

    @Override // miuix.appcompat.app.gvn7
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // miuix.appcompat.app.gvn7
    public void onPanelClosed(int i2, Menu menu) {
    }

    @Override // miuix.appcompat.app.gvn7
    public void onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0 && this.f38785e && this.f38786j && !isHidden() && isAdded()) {
            onPrepareOptionsMenu(menu);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void onProcessBindViewWithContentInset(Rect rect) {
        this.f38784c.onProcessBindViewWithContentInset(rect);
    }

    @Override // kz28.InterfaceC6758k
    public void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f38784c.onPostResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f38784c.onStop();
    }

    @Override // androidx.fragment.app.jp0y, androidx.fragment.app.Fragment
    @Deprecated
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle bundle) {
        this.f38784c.m24864j(view, bundle);
    }

    @Override // miuix.appcompat.app.gvn7
    public void onViewInflated(View view, Bundle bundle) {
    }

    @Override // miuix.appcompat.app.jp0y
    public boolean requestDispatchContentInset() {
        return this.f38784c.requestDispatchContentInset();
    }

    public boolean requestWindowFeature(int i2) {
        return this.f38784c.requestWindowFeature(i2);
    }

    public void rp() {
        if (this.f38784c != null && !isHidden() && this.f38785e && this.f38786j && isAdded()) {
            this.f38784c.invalidateOptionsMenu();
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
        this.f38784c.setCorrectNestedScrollMotionEventEnabled(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void setHasOptionsMenu(boolean z2) {
        a9 a9Var;
        super.setHasOptionsMenu(z2);
        if (this.f38785e != z2) {
            this.f38785e = z2;
            if (isHidden() || !isAdded() || (a9Var = this.f38784c) == null) {
                return;
            }
            a9Var.invalidateOptionsMenu();
        }
    }

    @Override // miuix.appcompat.app.d3
    public void setImmersionMenuEnabled(boolean z2) {
        this.f38784c.m25075t(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z2) {
        a9 a9Var;
        super.setMenuVisibility(z2);
        if (this.f38786j != z2) {
            this.f38786j = z2;
            if (isHidden() || !isAdded() || (a9Var = this.f38784c) == null) {
                return;
            }
            a9Var.invalidateOptionsMenu();
        }
    }

    @Override // miuix.appcompat.app.gvn7
    public void setThemeRes(int i2) {
        this.f38784c.bf2(i2);
    }

    @Override // miuix.appcompat.app.d3
    public void showEndOverflowMenu() {
        this.f38784c.a9();
    }

    @Override // miuix.appcompat.app.d3
    public void showImmersionMenu() {
        this.f38784c.fti();
    }

    @Override // miuix.appcompat.app.d3
    public void showOverflowMenu() {
        this.f38784c.gvn7();
    }

    @Override // miuix.appcompat.app.gvn7
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.f38784c.startActionMode(callback);
    }

    public void yw(boolean z2) {
    }

    @zy.dd
    public View z4t() {
        a9 a9Var = this.f38784c;
        if (a9Var == null) {
            return null;
        }
        return a9Var.m24865l();
    }

    @Override // miuix.appcompat.app.d3
    public void showImmersionMenu(View view, ViewGroup viewGroup) {
        this.f38784c.jp0y(view, viewGroup);
    }
}

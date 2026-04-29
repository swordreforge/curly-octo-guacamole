package miuix.appcompat.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.C0903y;
import androidx.fragment.app.Fragment;
import java.util.List;
import kt06.C6753n;
import kz28.InterfaceC6758k;
import miuix.autodensity.AutoDensityConfig;
import miuix.core.util.C7085q;
import zy.InterfaceC7842s;
import zy.uv6;

/* JADX INFO: compiled from: Fragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class jk extends Fragment implements gvn7, jp0y, InterfaceC6758k<jk>, ncyb {

    /* JADX INFO: renamed from: k */
    protected a9 f38943k;

    /* JADX INFO: renamed from: q */
    private boolean f38945q = true;

    /* JADX INFO: renamed from: n */
    private boolean f38944n = true;

    public void bih(Bundle bundle) {
        if (isStateSaved()) {
            return;
        }
        setArguments(bundle);
    }

    @Override // miuix.appcompat.app.jp0y
    public void bindViewWithContentInset(View view) {
        this.f38943k.bindViewWithContentInset(view);
    }

    @Override // miuix.appcompat.app.gvn7
    public void checkThemeLegality() {
    }

    public void cyoe(int i2) {
        this.f38943k.y9n(i2);
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void dismissImmersionMenu(boolean z2) {
        this.f38943k.m25074q(z2);
    }

    @Override // kz28.InterfaceC6758k
    public void dispatchResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        this.f38943k.dispatchResponsiveLayout(configuration, c6753n, z2);
    }

    public void ec(boolean z2) {
    }

    public void el(boolean z2) {
        this.f38943k.m24859a(z2);
    }

    public int ew() {
        return this.f38943k.dd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean fn3e(MotionEvent motionEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).fn3e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public void g0ad() {
        if (this.f38943k != null && !isHidden() && this.f38945q && this.f38944n && isAdded()) {
            this.f38943k.invalidateOptionsMenu();
        }
    }

    @Override // miuix.appcompat.app.gvn7
    @zy.dd
    public AbstractC6946k getActionBar() {
        return this.f38943k.getActionBar();
    }

    public int getBottomMenuMode() {
        return this.f38943k.getBottomMenuMode();
    }

    @Override // miuix.appcompat.app.jp0y
    public Rect getContentInset() {
        return this.f38943k.getContentInset();
    }

    public int getExtraHorizontalPadding() {
        return this.f38943k.x9kr();
    }

    @Override // kz28.InterfaceC6758k
    public kt06.toq getResponsiveState() {
        return this.f38943k.getResponsiveState();
    }

    @Override // miuix.appcompat.app.gvn7
    public Context getThemedContext() {
        return this.f38943k.getThemedContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        a9 a9Var = this.f38943k;
        if (a9Var == null) {
            return null;
        }
        return a9Var.n7h();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean hasActionBar() {
        a9 a9Var = this.f38943k;
        if (a9Var == null) {
            return false;
        }
        return a9Var.hasActionBar();
    }

    @Override // miuix.appcompat.app.d3
    public void hideEndOverflowMenu() {
        this.f38943k.kja0();
    }

    @Override // miuix.appcompat.app.d3
    public void hideOverflowMenu() {
        this.f38943k.cdj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean i9jn(KeyEvent keyEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).i9jn(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public void invalidateOptionsMenu() {
        a9 a9Var = this.f38943k;
        if (a9Var != null) {
            a9Var.m24869x(1);
            if (!isHidden() && this.f38945q && this.f38944n && isAdded()) {
                this.f38943k.invalidateOptionsMenu();
            }
        }
    }

    public boolean isExtraHorizontalPaddingEnable() {
        return this.f38943k.uv6();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isInEditActionMode() {
        return this.f38943k.isInEditActionMode();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isIsInSearchActionMode() {
        return this.f38943k.isIsInSearchActionMode();
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean isRegisterResponsive() {
        return this.f38943k.isRegisterResponsive();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public a9 ix() {
        return this.f38943k;
    }

    public boolean kiv() {
        return this.f38943k.vyq();
    }

    @Deprecated
    public int kx3() {
        return this.f38943k.ncyb();
    }

    public void l05(boolean z2) {
        this.f38943k.o1t(z2);
    }

    public MenuInflater m2t() {
        return this.f38943k.x2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean ni7(KeyEvent keyEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).ni7(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public void nnh(boolean z2) {
        this.f38943k.m24863f(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean o1t(MotionEvent motionEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).o1t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public void o5() {
        this.f38943k.m24867o();
    }

    @Override // miuix.appcompat.app.gvn7
    @InterfaceC7842s
    public void onActionModeFinished(ActionMode actionMode) {
        this.f38943k.onActionModeFinished(actionMode);
    }

    @Override // miuix.appcompat.app.gvn7
    @InterfaceC7842s
    public void onActionModeStarted(ActionMode actionMode) {
        this.f38943k.onActionModeStarted(actionMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@zy.lvui Context context) {
        super.onAttach(context);
        AutoDensityConfig.updateDensity(context);
        C0903y c0903yVq = getParentFragmentManager().vq();
        if (c0903yVq instanceof C6958t) {
            this.f38943k = ((C6958t) c0903yVq).m25080n(this);
        } else {
            this.f38943k = new a9(this);
        }
        this.f38943k.a98o(z4t());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AutoDensityConfig.updateDensityByConfig(getContext(), configuration);
        this.f38943k.onConfigurationChanged(configuration);
    }

    @Override // miuix.appcompat.app.jp0y
    @InterfaceC7842s
    public void onContentInsetChanged(Rect rect) {
        this.f38943k.onContentInsetChanged(rect);
        onProcessBindViewWithContentInset(rect);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38943k.fn3e(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return this.f38943k.m24862e(i2, z2, i3);
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // miuix.appcompat.app.gvn7
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0 && this.f38945q && this.f38944n && !isHidden() && isAdded()) {
            return onCreateOptionsMenu(menu);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f38943k.nn86(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f38943k.m25074q(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f38943k.hb();
    }

    @Override // miuix.appcompat.app.jp0y
    public void onDispatchNestedScrollOffset(int[] iArr) {
        this.f38943k.onDispatchNestedScrollOffset(iArr);
    }

    @Override // miuix.appcompat.app.mcp
    public void onExtraPaddingChanged(int i2) {
        this.f38943k.onExtraPaddingChanged(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z2) {
        a9 a9Var;
        super.onHiddenChanged(z2);
        if (!z2 && (a9Var = this.f38943k) != null) {
            a9Var.invalidateOptionsMenu();
        }
        ec(!z2);
    }

    @Override // miuix.appcompat.app.gvn7
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyLongPress(i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyMultiple(i2, i3, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyUp(i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@zy.lvui MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || getActionBar() == null || (getActionBar().mo159h() & 4) == 0) {
            return false;
        }
        ActivityC0891q activity = getActivity();
        if (activity.getParent() == null ? activity.onNavigateUp() : activity.getParent().onNavigateUpFromChild(activity)) {
            return true;
        }
        getActivity().getOnBackPressedDispatcher().m13n();
        return true;
    }

    @Override // miuix.appcompat.app.gvn7
    public void onPanelClosed(int i2, Menu menu) {
    }

    @Override // miuix.appcompat.app.gvn7
    public void onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0 && this.f38945q && this.f38944n && !isHidden() && isAdded()) {
            onPrepareOptionsMenu(menu);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void onProcessBindViewWithContentInset(Rect rect) {
        this.f38943k.onProcessBindViewWithContentInset(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb)) {
                ((ncyb) fragment).onProvideKeyboardShortcuts(list, menu, i2);
            }
        }
    }

    @Override // kz28.InterfaceC6758k
    public void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f38943k.onPostResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f38943k.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle bundle) {
        this.f38943k.m24864j(view, bundle);
        Rect contentInset = this.f38943k.getContentInset();
        if (contentInset != null) {
            if (contentInset.top == 0 && contentInset.bottom == 0 && contentInset.left == 0 && contentInset.right == 0) {
                return;
            }
            onContentInsetChanged(contentInset);
        }
    }

    @Override // miuix.appcompat.app.gvn7
    public void onViewInflated(@zy.lvui View view, @zy.dd Bundle bundle) {
    }

    @zy.dd
    public miuix.core.util.t8r ps() {
        ActivityC0891q activity = getActivity();
        if (activity != null) {
            return C7085q.m25607s(activity);
        }
        return null;
    }

    public t8r r25n() {
        a9 a9Var = this.f38943k;
        if (a9Var == null) {
            return null;
        }
        return a9Var.m25073p();
    }

    public void r6ty(boolean z2) {
        this.f38943k.m24860b(z2);
    }

    public void ra() {
        nnh(true);
    }

    public void registerCoordinateScrollView(View view) {
        this.f38943k.registerCoordinateScrollView(view);
    }

    @Override // miuix.appcompat.app.jp0y
    public boolean requestDispatchContentInset() {
        return this.f38943k.requestDispatchContentInset();
    }

    public boolean requestWindowFeature(int i2) {
        return this.f38943k.requestWindowFeature(i2);
    }

    public void rp(int i2) {
        this.f38943k.ek5k(i2);
    }

    public void setBottomExtraInset(int i2) {
        this.f38943k.setBottomExtraInset(i2);
        int size = getChildFragmentManager().fnq8().size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = getChildFragmentManager().fnq8().get(i3);
            if ((fragment instanceof jk) && fragment.isAdded()) {
                ((jk) fragment).setBottomExtraInset(i2);
            }
        }
    }

    public void setBottomMenuMode(int i2) {
        this.f38943k.setBottomMenuMode(i2);
    }

    @Override // miuix.appcompat.app.jp0y
    public final void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
        this.f38943k.setCorrectNestedScrollMotionEventEnabled(z2);
    }

    public void setExtraHorizontalPaddingEnable(boolean z2) {
        this.f38943k.yz(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void setHasOptionsMenu(boolean z2) {
        super.setHasOptionsMenu(z2);
        if (this.f38945q != z2) {
            this.f38945q = z2;
            if (!z2 || this.f38943k == null || isHidden() || !isAdded()) {
                return;
            }
            this.f38943k.invalidateOptionsMenu();
        }
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void setImmersionMenuEnabled(boolean z2) {
        this.f38943k.m25075t(z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z2) {
        a9 a9Var;
        super.setMenuVisibility(z2);
        if (this.f38944n != z2) {
            this.f38944n = z2;
            if (isHidden() || !isAdded() || (a9Var = this.f38943k) == null) {
                return;
            }
            a9Var.invalidateOptionsMenu();
        }
    }

    @Override // miuix.appcompat.app.gvn7
    public void setThemeRes(int i2) {
        this.f38943k.bf2(i2);
    }

    @Override // miuix.appcompat.app.d3
    public void showEndOverflowMenu() {
        this.f38943k.a9();
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void showImmersionMenu() {
        this.f38943k.fti();
    }

    @Override // miuix.appcompat.app.d3
    public void showOverflowMenu() {
        this.f38943k.gvn7();
    }

    @Override // miuix.appcompat.app.gvn7
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.f38943k.startActionMode(callback);
    }

    @Override // kz28.InterfaceC6758k
    /* JADX INFO: renamed from: u38j, reason: merged with bridge method [inline-methods] */
    public jk getResponsiveSubject() {
        return this;
    }

    public void uf() {
        this.f38943k.m24861c();
    }

    public void unregisterCoordinateScrollView(View view) {
        this.f38943k.unregisterCoordinateScrollView(view);
    }

    public int v5yj() {
        miuix.core.util.t8r t8rVarPs = ps();
        if (t8rVarPs != null) {
            return t8rVarPs.f39903g;
        }
        return 1;
    }

    @zy.dd
    /* JADX INFO: renamed from: w */
    public View m25016w() {
        a9 a9Var = this.f38943k;
        if (a9Var == null) {
            return null;
        }
        return a9Var.m24865l();
    }

    public void wt() {
        this.f38943k.zp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.ncyb
    /* JADX INFO: renamed from: y */
    public boolean mo25017y(MotionEvent motionEvent) {
        for (Fragment fragment : getChildFragmentManager().fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).mo25017y(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public void yp31(lvui lvuiVar) {
        this.f38943k.i1(lvuiVar);
    }

    public void yw(View view) {
        this.f38943k.m24866m(view);
    }

    protected boolean z4t() {
        return false;
    }

    public void zff0() {
        el(true);
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void showImmersionMenu(View view, ViewGroup viewGroup) {
        this.f38943k.jp0y(view, viewGroup);
    }
}

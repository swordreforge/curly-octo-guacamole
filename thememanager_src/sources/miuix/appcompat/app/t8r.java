package miuix.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0891q;
import kt06.C6753n;
import kz28.InterfaceC6758k;
import miuix.appcompat.app.floatingactivity.InterfaceC6935n;
import miuix.appcompat.app.floatingactivity.InterfaceC6937q;
import miuix.appcompat.app.floatingactivity.InterfaceC6938s;
import miuix.appcompat.app.floatingactivity.InterfaceC6939y;
import miuix.core.util.C7085q;
import zy.yz;

/* JADX INFO: compiled from: AppCompatActivity.java */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingSuperCall"})
public class t8r extends ActivityC0891q implements fti, InterfaceC6935n, InterfaceC6937q, InterfaceC6758k<Activity> {
    private fn3e mAppDelegate;
    private miuix.core.util.t8r mWindowInfo;

    /* JADX INFO: compiled from: AppCompatActivity.java */
    private class toq implements InterfaceC6943g {
        private toq() {
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        /* JADX INFO: renamed from: k */
        public void mo25015k(@zy.dd Bundle bundle) {
            t8r.super.onCreate(bundle);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public void onConfigurationChanged(Configuration configuration) {
            t8r.super.onConfigurationChanged(configuration);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            return t8r.super.onCreatePanelMenu(i2, menu);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public View onCreatePanelView(int i2) {
            return t8r.super.onCreatePanelView(i2);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public boolean onMenuItemSelected(int i2, @zy.lvui MenuItem menuItem) {
            return t8r.super.onMenuItemSelected(i2, menuItem);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public void onPanelClosed(int i2, Menu menu) {
            t8r.super.onPanelClosed(i2, menu);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public void onPostResume() {
            t8r.super.onPostResume();
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            return t8r.super.onPreparePanel(i2, view, menu);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public void onStop() {
            t8r.super.onStop();
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public void toq(Bundle bundle) {
            t8r.super.onRestoreInstanceState(bundle);
        }

        @Override // miuix.appcompat.app.InterfaceC6943g
        public void zy(Bundle bundle) {
            t8r.super.onSaveInstanceState(bundle);
        }
    }

    /* JADX INFO: compiled from: AppCompatActivity.java */
    private class zy implements InterfaceC6938s {
        private zy() {
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6938s
        /* JADX INFO: renamed from: k */
        public boolean mo24986k(boolean z2) {
            return t8r.this.onFloatingWindowModeChanging(z2);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6938s
        public void toq(boolean z2) {
            t8r.this.onFloatingWindowModeChanged(z2);
        }
    }

    public t8r() {
        this.mAppDelegate = new fn3e(this, new toq(), new zy());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mAppDelegate.m25012r(view, layoutParams);
    }

    protected void afterConfigurationChanged(Configuration configuration) {
        this.mAppDelegate.dd(configuration);
    }

    protected void beforeConfigurationChanged(Configuration configuration) {
        this.mAppDelegate.ncyb(configuration);
    }

    @Override // miuix.appcompat.app.jp0y
    public void bindViewWithContentInset(View view) {
        this.mAppDelegate.bindViewWithContentInset(view);
    }

    @Override // miuix.appcompat.app.fti
    public void checkThemeLegality() {
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void dismissImmersionMenu(boolean z2) {
        this.mAppDelegate.m25074q(z2);
    }

    @Override // kz28.InterfaceC6758k
    public void dispatchResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        this.mAppDelegate.dispatchResponsiveLayout(configuration, c6753n, z2);
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeCloseEnterAnimation() {
        this.mAppDelegate.n5r1();
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeCloseExitAnimation() {
        this.mAppDelegate.hyr();
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeOpenEnterAnimation() {
        this.mAppDelegate.m25008f();
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeOpenExitAnimation() {
        this.mAppDelegate.m25005c();
    }

    public void exitFloatingActivityAll() {
        this.mAppDelegate.lrht();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.mAppDelegate.was()) {
            return;
        }
        realFinish();
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6937q
    public String getActivityIdentity() {
        return this.mAppDelegate.vyq();
    }

    @zy.dd
    public AbstractC6946k getAppCompatActionBar() {
        return this.mAppDelegate.getActionBar();
    }

    public int getBottomMenuCustomViewTranslationY() {
        return this.mAppDelegate.m25007e();
    }

    public int getBottomMenuMode() {
        return this.mAppDelegate.getBottomMenuMode();
    }

    @Override // miuix.appcompat.app.jp0y
    public Rect getContentInset() {
        return this.mAppDelegate.getContentInset();
    }

    public int getExtraHorizontalPadding() {
        return this.mAppDelegate.hb();
    }

    @Deprecated
    public int getExtraHorizontalPaddingLevel() {
        return this.mAppDelegate.m25009j();
    }

    public View getFloatingBrightPanel() {
        return this.mAppDelegate.m25011o();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return this.mAppDelegate.x2();
    }

    @Override // kz28.InterfaceC6758k
    public kt06.toq getResponsiveState() {
        return this.mAppDelegate.getResponsiveState();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kz28.InterfaceC6758k
    public Activity getResponsiveSubject() {
        return this;
    }

    @Override // miuix.appcompat.app.fti
    public int getTranslucentStatus() {
        return this.mAppDelegate.getTranslucentStatus();
    }

    public miuix.core.util.t8r getWindowInfo() {
        return this.mWindowInfo;
    }

    public int getWindowType() {
        miuix.core.util.t8r t8rVar = this.mWindowInfo;
        if (t8rVar != null) {
            return t8rVar.f39903g;
        }
        return 1;
    }

    public void hideBottomMenu() {
        hideBottomMenu(true);
    }

    public void hideBottomMenuCustomView() {
        this.mAppDelegate.yz();
    }

    @Override // miuix.appcompat.app.d3
    public void hideEndOverflowMenu() {
        this.mAppDelegate.kja0();
    }

    public void hideFloatingBrightPanel() {
        this.mAppDelegate.y9n();
    }

    public void hideFloatingDimBackground() {
        this.mAppDelegate.m25004b();
    }

    @Override // miuix.appcompat.app.d3
    public void hideOverflowMenu() {
        this.mAppDelegate.cdj();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        this.mAppDelegate.invalidateOptionsMenu();
    }

    public boolean isExtraHorizontalPaddingEnable() {
        return this.mAppDelegate.zp();
    }

    public boolean isExtraPaddingApplyToContentEnable() {
        return this.mAppDelegate.m25014x();
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return this.mAppDelegate.m25003a() || super.isFinishing();
    }

    @Override // miuix.appcompat.app.fti
    public boolean isFloatingWindowTheme() {
        return this.mAppDelegate.ch();
    }

    @Override // miuix.appcompat.app.fti
    public boolean isInFloatingWindowMode() {
        return this.mAppDelegate.isInFloatingWindowMode();
    }

    protected boolean isRegisterResponsive() {
        return this.mAppDelegate.isRegisterResponsive();
    }

    protected boolean isResponsiveEnabled() {
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.mAppDelegate.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.mAppDelegate.onActionModeStarted(actionMode);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        beforeConfigurationChanged(getResources().getConfiguration());
        if (!this.mWindowInfo.m25626k()) {
            C7085q.ni7(this.mWindowInfo);
        }
        this.mAppDelegate.onConfigurationChanged(configuration);
        afterConfigurationChanged(configuration);
    }

    @Override // miuix.appcompat.app.jp0y
    public void onContentInsetChanged(Rect rect) {
        this.mAppDelegate.onContentInsetChanged(rect);
        onProcessBindViewWithContentInset(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@zy.dd Bundle bundle) {
        C7085q.zurt(this);
        this.mAppDelegate.d8wk(isResponsiveEnabled());
        this.mAppDelegate.fn3e(bundle);
        this.mWindowInfo = C7085q.ld6(this, null, true);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.mAppDelegate.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    @zy.dd
    public View onCreatePanelView(int i2) {
        return this.mAppDelegate.onCreatePanelView(i2);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        this.mAppDelegate.onDestroy();
        C7085q.fu4(this);
        this.mWindowInfo = null;
        super.onDestroy();
    }

    @Override // miuix.appcompat.app.jp0y
    public void onDispatchNestedScrollOffset(int[] iArr) {
    }

    @Override // miuix.appcompat.app.mcp
    public void onExtraPaddingChanged(int i2) {
        this.mAppDelegate.onExtraPaddingChanged(i2);
    }

    public void onFloatingWindowModeChanged(boolean z2) {
    }

    public boolean onFloatingWindowModeChanging(boolean z2) {
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (ncyb.wo(getSupportFragmentManager(), i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        if (ncyb.wvg(getSupportFragmentManager(), i2, keyEvent)) {
            return true;
        }
        return super.onKeyLongPress(i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        if (ncyb.sok(getSupportFragmentManager(), i2, i3, keyEvent)) {
            return true;
        }
        return super.onKeyMultiple(i2, i3, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (ncyb.nsb(getSupportFragmentManager(), i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, @zy.lvui MenuItem menuItem) {
        return this.mAppDelegate.onMenuItemSelected(i2, menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, @zy.lvui Menu menu) {
        this.mAppDelegate.onPanelClosed(i2, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onPostResume() {
        this.mAppDelegate.onPostResume();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.mAppDelegate.onPreparePanel(i2, view, menu);
    }

    @Override // miuix.appcompat.app.jp0y
    public void onProcessBindViewWithContentInset(Rect rect) {
        this.mAppDelegate.onProcessBindViewWithContentInset(rect);
    }

    @Override // kz28.InterfaceC6758k
    public void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        this.mAppDelegate.bo(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mAppDelegate.y2(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onStop() {
        this.mAppDelegate.onStop();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        this.mAppDelegate.g1(charSequence);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.mAppDelegate.fu4(callback, i2);
    }

    public void realFinish() {
        super.finish();
    }

    public void registerCoordinateScrollView(View view) {
        this.mAppDelegate.registerCoordinateScrollView(view);
    }

    public void removeBottomMenuCustomView() {
        this.mAppDelegate.c8jq();
    }

    @Override // miuix.appcompat.app.jp0y
    public boolean requestDispatchContentInset() {
        return this.mAppDelegate.requestDispatchContentInset();
    }

    public boolean requestExtraWindowFeature(int i2) {
        return this.mAppDelegate.requestWindowFeature(i2);
    }

    public void setBottomExtraInset(int i2) {
        this.mAppDelegate.setBottomExtraInset(i2);
    }

    public void setBottomMenuCustomView(View view) {
        this.mAppDelegate.gyi(view);
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i2) {
        this.mAppDelegate.dr(i2);
    }

    public void setBottomMenuMode(int i2) {
        this.mAppDelegate.setBottomMenuMode(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        this.mAppDelegate.xwq3(i2);
    }

    @Override // miuix.appcompat.app.jp0y
    public final void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
        this.mAppDelegate.setCorrectNestedScrollMotionEventEnabled(z2);
    }

    public void setEnableSwipToDismiss(boolean z2) {
        this.mAppDelegate.m25006d(z2);
    }

    public void setEndActionMenuEnabled(boolean z2) {
        this.mAppDelegate.o1t(z2);
    }

    public void setExtraHorizontalPaddingEnable(boolean z2) {
        this.mAppDelegate.mu(z2);
    }

    @Deprecated
    public void setExtraHorizontalPaddingLevel(int i2) {
        this.mAppDelegate.vq(i2);
    }

    public void setExtraPaddingApplyToContentEnable(boolean z2) {
        this.mAppDelegate.qkj8(z2);
    }

    @Override // miuix.appcompat.app.fti
    public void setFloatingWindowBorderEnable(boolean z2) {
        this.mAppDelegate.setFloatingWindowBorderEnable(z2);
    }

    @Override // miuix.appcompat.app.fti
    public void setFloatingWindowMode(boolean z2) {
        this.mAppDelegate.setFloatingWindowMode(z2);
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void setImmersionMenuEnabled(boolean z2) {
        this.mAppDelegate.m25075t(z2);
    }

    public void setOnFloatingCallback(InterfaceC6939y interfaceC6939y) {
        this.mAppDelegate.qo(interfaceC6939y);
    }

    public void setOnFloatingWindowCallback(miuix.appcompat.app.floatingactivity.f7l8 f7l8Var) {
        this.mAppDelegate.tfm(f7l8Var);
    }

    public void setOnStatusBarChangeListener(lvui lvuiVar) {
        this.mAppDelegate.wo(lvuiVar);
    }

    @Override // miuix.appcompat.app.fti
    public void setTranslucentStatus(int i2) {
        this.mAppDelegate.setTranslucentStatus(i2);
    }

    public void showBottomMenu() {
        showBottomMenu(true);
    }

    public void showBottomMenuCustomView() {
        this.mAppDelegate.py();
    }

    @Override // miuix.appcompat.app.d3
    public void showEndOverflowMenu() {
        this.mAppDelegate.a9();
    }

    public void showFloatingBrightPanel() {
        this.mAppDelegate.i9jn();
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void showImmersionMenu() {
        this.mAppDelegate.fti();
    }

    @Override // miuix.appcompat.app.d3
    public void showOverflowMenu() {
        this.mAppDelegate.gvn7();
    }

    @Override // android.app.Activity
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.mAppDelegate.startActionMode(callback);
    }

    @yz
    public void testNotifyResponseChange(int i2) {
        this.mAppDelegate.ltg8(i2);
    }

    public void unregisterCoordinateScrollView(View view) {
        this.mAppDelegate.unregisterCoordinateScrollView(view);
    }

    public void hideBottomMenu(boolean z2) {
        this.mAppDelegate.ek5k(z2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.mAppDelegate.onWindowStartingActionMode(callback);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.mAppDelegate.m25013v(view);
    }

    public void showBottomMenu(boolean z2) {
        this.mAppDelegate.zsr0(z2);
    }

    @Override // miuix.appcompat.app.d3
    @Deprecated
    public void showImmersionMenu(View view, ViewGroup viewGroup) {
        this.mAppDelegate.jp0y(view, viewGroup);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.mAppDelegate.ikck(view, layoutParams);
    }
}

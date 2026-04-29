package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.contextaware.InterfaceC0047q;
import androidx.appcompat.app.toq;
import androidx.appcompat.view.toq;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ch;
import androidx.core.app.c8jq;
import androidx.core.app.ni7;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.C0942o;
import androidx.lifecycle.ek5k;
import androidx.savedstate.zy;
import zy.InterfaceC7842s;
import zy.InterfaceC7843t;
import zy.dd;
import zy.gvn7;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: androidx.appcompat.app.n */
/* JADX INFO: compiled from: AppCompatActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0097n extends ActivityC0891q implements InterfaceC0094g, c8jq.toq, toq.zy {

    /* JADX INFO: renamed from: n */
    private static final String f290n = "androidx:appcompat";

    /* JADX INFO: renamed from: k */
    private f7l8 f291k;

    /* JADX INFO: renamed from: q */
    private Resources f292q;

    /* JADX INFO: renamed from: androidx.appcompat.app.n$k */
    /* JADX INFO: compiled from: AppCompatActivity.java */
    class k implements zy.InterfaceC7893zy {
        k() {
        }

        @Override // androidx.savedstate.zy.InterfaceC7893zy
        @lvui
        /* JADX INFO: renamed from: k */
        public Bundle mo10k() {
            Bundle bundle = new Bundle();
            ActivityC0097n.this.m209e().jk(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.n$toq */
    /* JADX INFO: compiled from: AppCompatActivity.java */
    class toq implements InterfaceC0047q {
        toq() {
        }

        @Override // androidx.activity.contextaware.InterfaceC0047q
        /* JADX INFO: renamed from: k */
        public void mo8k(@lvui Context context) {
            f7l8 f7l8VarM209e = ActivityC0097n.this.m209e();
            f7l8VarM209e.fn3e();
            f7l8VarM209e.o1t(ActivityC0097n.this.getSavedStateRegistry().toq(ActivityC0097n.f290n));
        }
    }

    public ActivityC0097n() {
        m206j();
    }

    private boolean i1(KeyEvent keyEvent) {
        return false;
    }

    private void initViewTreeOwners() {
        C0942o.toq(getWindow().getDecorView(), this);
        ek5k.toq(getWindow().getDecorView(), this);
        androidx.savedstate.f7l8.toq(getWindow().getDecorView(), this);
    }

    /* JADX INFO: renamed from: j */
    private void m206j() {
        getSavedStateRegistry().m5240p(f290n, new k());
        addOnContextAvailableListener(new toq());
    }

    /* JADX INFO: renamed from: a */
    public void m207a(@dd Toolbar toolbar) {
        m209e().ncyb(toolbar);
    }

    @Override // androidx.appcompat.app.toq.zy
    @dd
    public toq.InterfaceC7850toq a9() {
        return m209e().mo114h();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        m209e().mo120q(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m209e().mo123y(context));
    }

    /* JADX INFO: renamed from: b */
    public boolean m208b() {
        Intent intentX2 = x2();
        if (intentX2 == null) {
            return false;
        }
        if (!y2(intentX2)) {
            m212u(intentX2);
            return true;
        }
        c8jq c8jqVarF7l8 = c8jq.f7l8(this);
        m211o(c8jqVarF7l8);
        ek5k(c8jqVarF7l8);
        c8jqVarF7l8.kja0();
        try {
            androidx.core.app.toq.ni7(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public boolean bo(int i2) {
        return m209e().d3(i2);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0096k abstractC0096kNn86 = nn86();
        if (getWindow().hasFeature(0)) {
            if (abstractC0096kNn86 == null || !abstractC0096kNn86.x2()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.cdj, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0096k abstractC0096kNn86 = nn86();
        if (keyCode == 82 && abstractC0096kNn86 != null && abstractC0096kNn86.d2ok(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @lvui
    /* JADX INFO: renamed from: e */
    public f7l8 m209e() {
        if (this.f291k == null) {
            this.f291k = f7l8.m195s(this, this);
        }
        return this.f291k;
    }

    public void ek5k(@lvui c8jq c8jqVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@InterfaceC7843t int i2) {
        return (T) m209e().n7h(i2);
    }

    @Override // android.app.Activity
    @lvui
    public MenuInflater getMenuInflater() {
        return m209e().ki();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f292q == null && ch.m570q()) {
            this.f292q = new ch(this, super.getResources());
        }
        Resources resources = this.f292q;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m209e().zurt();
    }

    @Override // androidx.appcompat.app.InterfaceC0094g
    @InterfaceC7842s
    public void jp0y(@lvui androidx.appcompat.view.toq toqVar) {
    }

    @Deprecated
    public void lv5(boolean z2) {
    }

    @Override // androidx.appcompat.app.InterfaceC0094g
    @dd
    public androidx.appcompat.view.toq lvui(@lvui toq.InterfaceC0138k interfaceC0138k) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    protected void m210m(int i2) {
    }

    @Deprecated
    public void nmn5(boolean z2) {
    }

    @dd
    public AbstractC0096k nn86() {
        return m209e().t8r();
    }

    /* JADX INFO: renamed from: o */
    public void m211o(@lvui c8jq c8jqVar) {
        c8jqVar.zy(this);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@lvui Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f292q != null) {
            this.f292q.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m209e().mo124z(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        yz();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m209e().wvg();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, @lvui MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        AbstractC0096k abstractC0096kNn86 = nn86();
        if (menuItem.getItemId() != 16908332 || abstractC0096kNn86 == null || (abstractC0096kNn86.mo159h() & 4) == 0) {
            return false;
        }
        return m208b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, @lvui Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@dd Bundle bundle) {
        super.onPostCreate(bundle);
        m209e().mo121t(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m209e().mcp();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStart() {
        super.onStart();
        m209e().a9();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onStop() {
        super.onStop();
        m209e().fti();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m209e().n5r1(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0096k abstractC0096kNn86 = nn86();
        if (getWindow().hasFeature(0)) {
            if (abstractC0096kNn86 == null || !abstractC0096kNn86.lvui()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@gvn7 int i2) {
        initViewTreeOwners();
        m209e().eqxt(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@hb int i2) {
        super.setTheme(i2);
        m209e().mo118l(i2);
    }

    @Override // androidx.fragment.app.ActivityC0891q
    public void supportInvalidateOptionsMenu() {
        m209e().zurt();
    }

    @Override // androidx.appcompat.app.InterfaceC0094g
    @InterfaceC7842s
    /* JADX INFO: renamed from: t */
    public void mo196t(@lvui androidx.appcompat.view.toq toqVar) {
    }

    @dd
    public androidx.appcompat.view.toq t8iq(@lvui toq.InterfaceC0138k interfaceC0138k) {
        return m209e().hyr(interfaceC0138k);
    }

    /* JADX INFO: renamed from: u */
    public void m212u(@lvui Intent intent) {
        ni7.f7l8(this, intent);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public void m213x(boolean z2) {
    }

    @Override // androidx.core.app.c8jq.toq
    @dd
    public Intent x2() {
        return ni7.m1951k(this);
    }

    public boolean y2(@lvui Intent intent) {
        return ni7.m1954y(this, intent);
    }

    @Deprecated
    public void yz() {
    }

    @Deprecated
    public void zp(int i2) {
    }

    @zy.kja0
    public ActivityC0097n(@gvn7 int i2) {
        super(i2);
        m206j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        m209e().d2ok(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        m209e().lvui(view, layoutParams);
    }
}

package miuix.appcompat.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.view.C0683f;
import androidx.lifecycle.InterfaceC0954z;
import gb.toq;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarContextView;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.ActionBarView;
import miuix.appcompat.internal.app.widget.C6998s;
import miuix.appcompat.internal.view.menu.C7033n;
import miuix.appcompat.internal.view.menu.InterfaceC7035q;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.internal.util.n7h;
import zy.uv6;

/* JADX INFO: renamed from: miuix.appcompat.app.q */
/* JADX INFO: compiled from: ActionBarDelegateImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6955q implements toq, mcp, ld6.InterfaceC7032k, f7l8.toq {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f86897bo = "ActionBarDelegate";

    /* JADX INFO: renamed from: u */
    static final String f38978u = "splitActionBarWhenNarrow";

    /* JADX INFO: renamed from: x */
    static final String f38979x = "android.support.UI_OPTIONS";

    /* JADX INFO: renamed from: a */
    private androidx.activity.zy f38980a;

    /* JADX INFO: renamed from: b */
    @zy.dd
    protected n7h.C7166n f38981b;

    /* JADX INFO: renamed from: c */
    private boolean f38982c;

    /* JADX INFO: renamed from: e */
    private miuix.appcompat.internal.view.menu.f7l8 f38983e;

    /* JADX INFO: renamed from: f */
    private boolean f38984f;

    /* JADX INFO: renamed from: g */
    protected ActionMode f38985g;

    /* JADX INFO: renamed from: h */
    protected boolean f38986h;

    /* JADX INFO: renamed from: i */
    protected boolean f38987i;

    /* JADX INFO: renamed from: k */
    final t8r f38989k;

    /* JADX INFO: renamed from: l */
    private InterfaceC7035q f38990l;

    /* JADX INFO: renamed from: m */
    @zy.dd
    protected View f38991m;

    /* JADX INFO: renamed from: n */
    protected miuix.appcompat.internal.view.menu.f7l8 f38992n;

    /* JADX INFO: renamed from: o */
    @zy.dd
    protected Rect f38993o;

    /* JADX INFO: renamed from: p */
    protected boolean f38994p;

    /* JADX INFO: renamed from: q */
    protected ActionBarView f38995q;

    /* JADX INFO: renamed from: s */
    protected boolean f38997s;

    /* JADX INFO: renamed from: t */
    private MenuInflater f38998t;

    /* JADX INFO: renamed from: y */
    protected boolean f38999y;

    /* JADX INFO: renamed from: z */
    protected AbstractC6946k f39000z;

    /* JADX INFO: renamed from: r */
    private int f38996r = 0;

    /* JADX INFO: renamed from: j */
    protected boolean f38988j = false;

    /* JADX INFO: renamed from: miuix.appcompat.app.q$k */
    /* JADX INFO: compiled from: ActionBarDelegateImpl.java */
    class k extends androidx.activity.zy {
        k(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.zy
        /* JADX INFO: renamed from: n */
        public void mo21n() {
            ActionMode actionMode = AbstractC6955q.this.f38985g;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    AbstractC6955q(t8r t8rVar) {
        this.f38989k = t8rVar;
    }

    private void d3(boolean z2) {
        androidx.activity.zy zyVar = this.f38980a;
        if (zyVar != null) {
            zyVar.m89s(z2);
        } else {
            this.f38980a = new k(z2);
            this.f38989k.getOnBackPressedDispatcher().toq(ld6(), this.f38980a);
        }
    }

    public void a9() {
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView != null) {
            actionBarView.u38j();
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void bindViewWithContentInset(View view) {
        this.f38991m = view;
        n7h.C7166n c7166n = new n7h.C7166n(C0683f.i1(view), this.f38991m.getPaddingTop(), C0683f.bf2(this.f38991m), this.f38991m.getPaddingBottom());
        this.f38981b = c7166n;
        if (view instanceof ViewGroup) {
            c7166n.f40381k = ((ViewGroup) view).getClipToPadding();
        }
    }

    public void cdj() {
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView != null) {
            actionBarView.ki();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
    public void f7l8(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, boolean z2) {
        this.f38989k.closeOptionsMenu();
    }

    public void fn3e(Bundle bundle) {
    }

    @Deprecated
    public void fti() {
        View viewFindViewById;
        InterfaceC7035q interfaceC7035q = this.f38990l;
        if (interfaceC7035q instanceof C7033n) {
            View viewBo = ((C7033n) interfaceC7035q).bo();
            ViewGroup viewGroupY2 = ((C7033n) this.f38990l).y2();
            if (viewBo != null) {
                jp0y(viewBo, viewGroupY2);
                return;
            }
        }
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView == null || (viewFindViewById = actionBarView.findViewById(toq.C6054p.iz)) == null) {
            throw new IllegalStateException("Can't find anchor view in actionbar or any other anchor view used before. Do you use default actionbar and immersion menu is enabled?");
        }
        jp0y(viewFindViewById, this.f38995q);
    }

    public ActionMode fu4(ActionMode.Callback callback, int i2) {
        if (i2 == 0) {
            return onWindowStartingActionMode(callback);
        }
        return null;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public ActionMode m25068g() {
        return this.f38985g;
    }

    public AbstractC6946k getActionBar() {
        if (!hasActionBar()) {
            this.f39000z = null;
        } else if (this.f39000z == null) {
            this.f39000z = jk();
        }
        return this.f39000z;
    }

    @Override // miuix.appcompat.app.toq
    public int getBottomMenuMode() {
        return 2;
    }

    public abstract Context getThemedContext();

    public int getTranslucentStatus() {
        return this.f38996r;
    }

    public void gvn7() {
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView != null) {
            actionBarView.eqxt();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.toq
    /* JADX INFO: renamed from: h */
    public void mo25069h(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        m25077z(f7l8Var, true);
    }

    public boolean hasActionBar() {
        return this.f38986h || this.f38987i;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public boolean m25070i() {
        InterfaceC7035q interfaceC7035q = this.f38990l;
        if (interfaceC7035q instanceof C7033n) {
            return interfaceC7035q.isShowing();
        }
        return false;
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
    @Deprecated
    public void jp0y(View view, ViewGroup viewGroup) {
        if (!this.f38984f) {
            Log.w(f86897bo, "Try to show immersion menu when immersion menu disabled");
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("You must specify a valid anchor view");
        }
        if (this.f38983e == null) {
            miuix.appcompat.internal.view.menu.f7l8 f7l8VarZy = zy();
            this.f38983e = f7l8VarZy;
            zurt(f7l8VarZy);
        }
        if (ni7(this.f38983e) && this.f38983e.hasVisibleItems()) {
            InterfaceC7035q interfaceC7035q = this.f38990l;
            if (interfaceC7035q == null) {
                C7033n c7033n = new C7033n(this, this.f38983e, n7h());
                c7033n.m26039m(49);
                c7033n.toq(0);
                c7033n.m26040n(0);
                this.f38990l = c7033n;
            } else {
                interfaceC7035q.f7l8(this.f38983e);
            }
            if (this.f38990l.isShowing()) {
                return;
            }
            this.f38990l.kja0(view, viewGroup);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25071k(ActionBarOverlayLayout actionBarOverlayLayout) {
        if (actionBarOverlayLayout != null) {
            ViewStub viewStub = (ViewStub) actionBarOverlayLayout.findViewById(toq.C6054p.f76379n2t);
            actionBarOverlayLayout.setContentMask(viewStub != null ? viewStub.inflate() : actionBarOverlayLayout.findViewById(toq.C6054p.f76389nsb));
        }
    }

    public boolean ki() {
        return this.f38982c;
    }

    public void kja0() {
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView != null) {
            actionBarView.uj2j();
        }
    }

    public abstract InterfaceC0954z ld6();

    /* JADX WARN: Multi-variable type inference failed */
    protected void mcp(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        if (f7l8Var == this.f38992n) {
            return;
        }
        this.f38992n = f7l8Var;
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView != null) {
            actionBarView.setMenu(f7l8Var, this);
        }
    }

    /* JADX INFO: renamed from: n */
    protected final Context m25072n() {
        t8r t8rVar = this.f38989k;
        AbstractC6946k actionBar = getActionBar();
        return actionBar != null ? actionBar.wvg() : t8rVar;
    }

    public abstract View n7h();

    protected abstract boolean ni7(miuix.appcompat.internal.view.menu.f7l8 f7l8Var);

    public void o1t(boolean z2) {
        wvg(z2, true);
    }

    @Override // miuix.appcompat.app.toq
    public void onActionModeFinished(ActionMode actionMode) {
        this.f38985g = null;
        d3(false);
    }

    @Override // miuix.appcompat.app.toq
    public void onActionModeStarted(ActionMode actionMode) {
        this.f38985g = actionMode;
        d3(true);
    }

    @Override // miuix.appcompat.app.toq
    public void onConfigurationChanged(Configuration configuration) {
        C6998s c6998s;
        if (this.f38986h && this.f38999y && (c6998s = (C6998s) getActionBar()) != null) {
            c6998s.d3(configuration);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void onContentInsetChanged(Rect rect) {
        this.f38993o = rect;
    }

    @Override // miuix.appcompat.app.toq
    public void onDestroy() {
        C6998s c6998s;
        ActionMode actionMode = this.f38985g;
        if (actionMode != null) {
            actionMode.finish();
        }
        if (this.f38986h && this.f38999y && (c6998s = (C6998s) getActionBar()) != null) {
            c6998s.oc();
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void onDispatchNestedScrollOffset(int[] iArr) {
    }

    @Override // miuix.appcompat.app.toq
    public abstract /* synthetic */ boolean onMenuItemSelected(int i2, MenuItem menuItem);

    @Override // miuix.appcompat.app.toq
    public void onPostResume() {
        C6998s c6998s;
        if (this.f38986h && this.f38999y && (c6998s = (C6998s) getActionBar()) != null) {
            c6998s.bo(true);
        }
    }

    @Override // miuix.appcompat.app.jp0y
    public void onProcessBindViewWithContentInset(Rect rect) {
        if (this.f38991m == null) {
            return;
        }
        n7h.C7166n c7166n = new n7h.C7166n(this.f38981b);
        boolean zX2 = miuix.internal.util.n7h.x2(this.f38991m);
        c7166n.f87769toq += zX2 ? rect.right : rect.left;
        c7166n.f87770zy += rect.top;
        c7166n.f40383q += zX2 ? rect.left : rect.right;
        View view = this.f38991m;
        if ((view instanceof ViewGroup) && (view instanceof androidx.core.view.ncyb)) {
            c7166n.m25963k((ViewGroup) view);
        } else {
            c7166n.toq(view);
        }
    }

    @Override // miuix.appcompat.app.toq
    public void onStop() {
        C6998s c6998s;
        m25074q(false);
        if (this.f38986h && this.f38999y && (c6998s = (C6998s) getActionBar()) != null) {
            c6998s.bo(false);
        }
    }

    @Override // miuix.appcompat.app.toq
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public t8r m25073p() {
        return this.f38989k;
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public void m25074q(boolean z2) {
        InterfaceC7035q interfaceC7035q = this.f38990l;
        if (interfaceC7035q != null) {
            interfaceC7035q.mo25361g(z2);
        }
    }

    protected final String qrj() {
        try {
            Bundle bundle = this.f38989k.getPackageManager().getActivityInfo(this.f38989k.getComponentName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString(f38979x);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f86897bo, "getUiOptionsFromMetadata: Activity '" + this.f38989k.getClass().getSimpleName() + "' not in manifest");
            return null;
        }
    }

    @Override // miuix.appcompat.app.toq
    public void registerCoordinateScrollView(View view) {
        AbstractC6946k actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.ktq(view);
        }
    }

    @Override // miuix.appcompat.app.toq
    public boolean requestWindowFeature(int i2) {
        if (i2 == 2) {
            this.f38997s = true;
            return true;
        }
        if (i2 == 5) {
            this.f38994p = true;
            return true;
        }
        if (i2 == 8) {
            this.f38986h = true;
            return true;
        }
        if (i2 != 9) {
            return this.f38989k.requestWindowFeature(i2);
        }
        this.f38987i = true;
        return true;
    }

    public void setTranslucentStatus(int i2) {
        int integer = this.f38989k.getResources().getInteger(toq.ld6.f34869t);
        if (integer >= 0 && integer <= 2) {
            i2 = integer;
        }
        if (this.f38996r == i2 || !miuix.core.util.variable.toq.m25676k(this.f38989k.getWindow(), i2)) {
            return;
        }
        this.f38996r = i2;
    }

    @Override // miuix.appcompat.app.toq
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public void m25075t(boolean z2) {
        this.f38984f = z2;
    }

    @Deprecated
    public boolean t8r() {
        return this.f38984f;
    }

    public void toq(boolean z2, boolean z3, ActionBarOverlayLayout actionBarOverlayLayout) {
        if (this.f38988j) {
            return;
        }
        this.f38988j = true;
        ViewStub viewStub = (ViewStub) actionBarOverlayLayout.findViewById(toq.C6054p.fupf);
        ActionBarContainer actionBarContainer = viewStub != null ? (ActionBarContainer) viewStub.inflate() : (ActionBarContainer) actionBarOverlayLayout.findViewById(toq.C6054p.cyg);
        if (actionBarContainer != null) {
            this.f38995q.setSplitView(actionBarContainer);
            this.f38995q.setSplitActionBar(z2);
            this.f38995q.setSplitWhenNarrow(z3);
            actionBarOverlayLayout.setSplitActionBarView(actionBarContainer);
            m25071k(actionBarOverlayLayout);
        }
        ActionBarContainer actionBarContainer2 = (ActionBarContainer) actionBarOverlayLayout.findViewById(toq.C6054p.f76334hyr);
        ViewStub viewStub2 = (ViewStub) actionBarOverlayLayout.findViewById(toq.C6054p.f34888b);
        ActionBarContextView actionBarContextView = viewStub2 != null ? (ActionBarContextView) viewStub2.inflate() : (ActionBarContextView) actionBarOverlayLayout.findViewById(toq.C6054p.f76455y9n);
        if (actionBarContextView != null) {
            actionBarContainer2.setActionBarContextView(actionBarContextView);
            actionBarOverlayLayout.setActionBarContextView(actionBarContextView);
            if (actionBarContainer != null) {
                actionBarContextView.setSplitView(actionBarContainer);
                actionBarContextView.setSplitActionBar(z2);
                actionBarContextView.setSplitWhenNarrow(z3);
            }
        }
    }

    @Override // miuix.appcompat.app.toq
    public void unregisterCoordinateScrollView(View view) {
        AbstractC6946k actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.v5yj(view);
        }
    }

    public void wvg(boolean z2, boolean z3) {
        this.f38982c = z2;
        if (this.f38999y && this.f38986h) {
            this.f38995q.setEndActionMenuEnable(z2);
            if (z3) {
                invalidateOptionsMenu();
            } else {
                this.f38989k.getWindow().getDecorView().post(new Runnable() { // from class: miuix.appcompat.app.zy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39019k.invalidateOptionsMenu();
                    }
                });
            }
        }
    }

    public MenuInflater x2() {
        if (this.f38998t == null) {
            AbstractC6946k actionBar = getActionBar();
            if (actionBar != null) {
                this.f38998t = new MenuInflater(actionBar.wvg());
            } else {
                this.f38998t = new MenuInflater(this.f38989k);
            }
        }
        return this.f38998t;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
    /* JADX INFO: renamed from: y */
    public boolean mo25076y(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    protected void m25077z(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, boolean z2) {
        ActionBarView actionBarView = this.f38995q;
        if (actionBarView == null || !actionBarView.mo25120i()) {
            f7l8Var.close();
            return;
        }
        if (this.f38995q.t8r() && z2) {
            this.f38995q.ki();
        } else if (this.f38995q.getVisibility() == 0) {
            this.f38995q.eqxt();
        }
    }

    protected abstract boolean zurt(miuix.appcompat.internal.view.menu.f7l8 f7l8Var);

    protected miuix.appcompat.internal.view.menu.f7l8 zy() {
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = new miuix.appcompat.internal.view.menu.f7l8(m25072n());
        f7l8Var.lrht(this);
        return f7l8Var;
    }
}

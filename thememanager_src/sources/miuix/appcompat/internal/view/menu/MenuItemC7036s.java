package miuix.appcompat.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.res.C0506s;
import miuix.appcompat.internal.view.menu.x2;
import miuix.appcompat.widget.C7061k;
import zy.uv6;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.s */
/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class MenuItemC7036s implements MenuItem {

    /* JADX INFO: renamed from: c */
    private static String f39562c = null;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f87036dd = 1;

    /* JADX INFO: renamed from: f */
    static final int f39563f = 0;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final int f87037hyr = 32;

    /* JADX INFO: renamed from: l */
    private static final int f39564l = 8;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static String f87038lrht = null;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f87039lvui = "MenuItemImpl";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int f87040n5r1 = 16;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f87041ncyb = 4;

    /* JADX INFO: renamed from: r */
    private static final int f39565r = 3;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static String f87042uv6 = null;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static String f87043vyq = null;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f87044x9kr = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private CharSequence f87046cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f87047d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private ActionProvider f87048d3;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private char f87050fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f87051fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f87052fu4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private View f87053gvn7;

    /* JADX INFO: renamed from: h */
    private CharSequence f39566h;

    /* JADX INFO: renamed from: i */
    private char f39567i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f87054jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private View f87055jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private CharSequence f87056ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f87057kja0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private Runnable f87058mcp;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f87059n7h;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f87062oc;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f87063qrj;

    /* JADX INFO: renamed from: t */
    private qrj f39568t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private Intent f87064t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private f7l8 f87065wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f87066x2;

    /* JADX INFO: renamed from: z */
    private Drawable f39569z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private C7061k f87067zurt;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private boolean f87060ni7 = false;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f87061o1t = 0;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f87045a9 = 16;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f87049eqxt = false;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.s$k */
    /* JADX INFO: compiled from: MenuItemImpl.java */
    class k implements ActionProvider.VisibilityListener {
        k() {
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            MenuItemC7036s.this.f87065wvg.d2ok(MenuItemC7036s.this);
        }
    }

    MenuItemC7036s(f7l8 f7l8Var, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f87065wvg = f7l8Var;
        this.f87066x2 = i3;
        this.f87063qrj = i2;
        this.f87059n7h = i4;
        this.f87057kja0 = i5;
        this.f39566h = charSequence;
        this.f87051fti = i6;
    }

    private C7061k f7l8() {
        if (this.f87067zurt == null) {
            this.f87067zurt = new C7061k(this.f87065wvg.fu4());
        }
        return this.f87067zurt;
    }

    public MenuItem a9(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f87048d3;
        if (actionProvider2 == actionProvider) {
            return this;
        }
        this.f87055jp0y = null;
        if (actionProvider2 != null) {
            actionProvider2.setVisibilityListener(null);
        }
        this.f87048d3 = actionProvider;
        this.f87065wvg.lvui(true);
        if (actionProvider != null) {
            actionProvider.setVisibilityListener(new k());
        }
        return this;
    }

    public boolean cdj() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f87054jk;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        f7l8 f7l8Var = this.f87065wvg;
        if (f7l8Var.mo25350y(f7l8Var.jp0y(), this)) {
            return true;
        }
        Runnable runnable = this.f87058mcp;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f87064t8r != null) {
            try {
                this.f87065wvg.fu4().startActivity(this.f87064t8r);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e(f87039lvui, "Can't find activity to handle intent; ignoring", e2);
            }
        }
        ActionProvider actionProvider = this.f87048d3;
        return actionProvider != null && actionProvider.onPerformDefaultAction();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        return (this.f87051fti & 8) != 0 && (this.f87055jp0y == null || (((onActionExpandListener = this.f87062oc) == null || onActionExpandListener.onMenuItemActionCollapse(this)) && this.f87065wvg.f7l8(this)));
    }

    public void d2ok() {
        View view;
        if (this.f87060ni7 && (view = this.f87053gvn7) != null && view.getVisibility() == 0) {
            f7l8().toq(this.f87053gvn7, this.f87052fu4);
            return;
        }
        C7061k c7061k = this.f87067zurt;
        if (c7061k != null) {
            c7061k.m25484q();
            this.f87067zurt = null;
        }
    }

    public boolean d3() {
        return this.f87065wvg.jk();
    }

    public boolean eqxt() {
        return (this.f87051fti & 4) == 4;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        return ((this.f87051fti & 8) == 0 || this.f87055jp0y == null || ((onActionExpandListener = this.f87062oc) != null && !onActionExpandListener.onMenuItemActionExpand(this)) || !this.f87065wvg.qrj(this)) ? false : true;
    }

    public void fn3e(boolean z2) {
        this.f87049eqxt = z2;
        this.f87065wvg.lvui(false);
    }

    public MenuItem fti(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f87062oc = onActionExpandListener;
        return this;
    }

    public MenuItem fu4(Runnable runnable) {
        this.f87058mcp = runnable;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m25369g() {
        this.f87065wvg.eqxt(this);
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("Implementation should use getSupportActionProvider!");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f87055jp0y;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f87048d3;
        if (actionProvider == null) {
            return null;
        }
        View viewOnCreateActionView = actionProvider.onCreateActionView(this);
        this.f87055jp0y = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f87050fn3e;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f87056ki;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f87063qrj;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f39569z;
        if (drawable != null) {
            return drawable;
        }
        if (this.f87061o1t == 0) {
            return null;
        }
        Drawable drawableF7l8 = C0506s.f7l8(this.f87065wvg.fti(), this.f87061o1t, this.f87065wvg.fu4().getTheme());
        this.f87061o1t = 0;
        this.f39569z = drawableF7l8;
        return drawableF7l8;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f87064t8r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f87066x2;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f87047d2ok;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f39567i;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f87059n7h;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f39568t;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f39566h;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f87046cdj;
        return charSequence != null ? charSequence : this.f39566h;
    }

    boolean gvn7(boolean z2) {
        int i2 = this.f87045a9;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f87045a9 = i3;
        return i2 != i3;
    }

    /* JADX INFO: renamed from: h */
    public boolean m25370h() {
        return ((this.f87051fti & 8) == 0 || this.f87055jp0y == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f39568t != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m25371i() {
        return (this.f87051fti & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f87049eqxt;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f87045a9 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f87045a9 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f87045a9 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.f87048d3;
        return (actionProvider == null || !actionProvider.overridesItemVisibility()) ? (this.f87045a9 & 8) == 0 : (this.f87045a9 & 8) == 0 && this.f87048d3.isVisible();
    }

    protected void jk(qrj qrjVar) {
        this.f39568t = qrjVar;
        qrjVar.setHeaderTitle(getTitle());
    }

    public void jp0y(View view) {
        this.f87053gvn7 = view;
    }

    public boolean ki() {
        return (this.f87045a9 & 32) == 32;
    }

    public View kja0() {
        return this.f87053gvn7;
    }

    String ld6() {
        char cM25372p = m25372p();
        if (cM25372p == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f39562c);
        if (cM25372p == '\b') {
            sb.append(f87042uv6);
        } else if (cM25372p == '\n') {
            sb.append(f87038lrht);
        } else if (cM25372p != ' ') {
            sb.append(cM25372p);
        } else {
            sb.append(f87043vyq);
        }
        return sb.toString();
    }

    void mcp(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f87047d2ok = contextMenuInfo;
    }

    CharSequence n7h(x2.InterfaceC7037k interfaceC7037k) {
        return (interfaceC7037k == null || !interfaceC7037k.mo25269k()) ? getTitle() : getTitleCondensed();
    }

    public void ni7(boolean z2, int i2) {
        this.f87060ni7 = z2;
        this.f87052fu4 = i2;
    }

    public void o1t(boolean z2) {
        this.f87045a9 = (z2 ? 4 : 0) | (this.f87045a9 & (-5));
    }

    boolean oc() {
        return this.f87065wvg.oc() && m25372p() != 0;
    }

    /* JADX INFO: renamed from: p */
    char m25372p() {
        return this.f87050fn3e;
    }

    public ActionProvider qrj() {
        return this.f87048d3;
    }

    /* JADX INFO: renamed from: s */
    public int m25373s() {
        return this.f87057kja0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("Implementation should use setSupportActionProvider!");
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        int i2;
        this.f87055jp0y = view;
        this.f87053gvn7 = view;
        this.f87048d3 = null;
        if (view != null && view.getId() == -1 && (i2 = this.f87066x2) > 0) {
            view.setId(i2);
        }
        this.f87065wvg.eqxt(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f87050fn3e == c2) {
            return this;
        }
        this.f87050fn3e = Character.toLowerCase(c2);
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f87045a9;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f87045a9 = i3;
        if (i2 != i3) {
            this.f87065wvg.lvui(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f87045a9 & 4) != 0) {
            this.f87065wvg.m25338e(this);
        } else {
            m25376z(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f87056ki = charSequence;
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f87045a9 |= 16;
        } else {
            this.f87045a9 &= -17;
        }
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f87061o1t = 0;
        this.f39569z = drawable;
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f87064t8r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f39567i == c2) {
            return this;
        }
        this.f39567i = c2;
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        return fti(onActionExpandListener);
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f87054jk = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f39567i = c2;
        this.f87050fn3e = Character.toLowerCase(c3);
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f87051fti = i2;
        this.f87065wvg.eqxt(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f39566h = charSequence;
        this.f87065wvg.lvui(false);
        qrj qrjVar = this.f39568t;
        if (qrjVar != null) {
            qrjVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f87046cdj = charSequence;
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (gvn7(z2)) {
            this.f87065wvg.d2ok(this);
        }
        return this;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: t */
    public void m25374t(f7l8 f7l8Var) {
        this.f87065wvg = f7l8Var;
    }

    public boolean t8r() {
        return (this.f87045a9 & 4) != 0;
    }

    public String toString() {
        return this.f39566h.toString();
    }

    public boolean toq() {
        return (this.f87051fti & 2) == 2;
    }

    public void wvg(boolean z2) {
        if (z2) {
            this.f87045a9 |= 32;
        } else {
            this.f87045a9 &= -33;
        }
    }

    public int x2() {
        return this.f87051fti;
    }

    /* JADX INFO: renamed from: y */
    Runnable m25375y() {
        return this.f87058mcp;
    }

    /* JADX INFO: renamed from: z */
    void m25376z(boolean z2) {
        int i2 = this.f87045a9;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f87045a9 = i3;
        if (i2 != i3) {
            this.f87065wvg.lvui(false);
        }
    }

    public void zurt(boolean z2) {
        ni7(z2, 2);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f39569z = null;
        this.f87061o1t = i2;
        this.f87065wvg.lvui(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f87065wvg.fu4().getString(i2));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        Context contextFu4 = this.f87065wvg.fu4();
        setActionView(LayoutInflater.from(contextFu4).inflate(i2, (ViewGroup) new LinearLayout(contextFu4), false));
        return this;
    }
}

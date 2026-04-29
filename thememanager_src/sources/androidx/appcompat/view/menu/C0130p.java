package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.kja0;
import androidx.core.view.toq;
import p023g.C6045k;
import p030n.C7397k;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.p */
/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class C0130p implements p024h.toq {

    /* JADX INFO: renamed from: c */
    private static final int f515c = 8;

    /* JADX INFO: renamed from: f */
    private static final int f516f = 4;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final int f46758hyr = 2;

    /* JADX INFO: renamed from: l */
    private static final int f517l = 3;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final int f46759lrht = 16;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int f46760n5r1 = 1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final String f46761ncyb = "MenuItemImpl";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f46762uv6 = 32;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    static final int f46763vyq = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private CharSequence f46765cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private View f46766d2ok;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private int f46769eqxt;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private char f46770fn3e;

    /* JADX INFO: renamed from: h */
    private CharSequence f518h;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private CharSequence f46774jk;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Intent f46776ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f46777kja0;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private androidx.core.view.toq f46778lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private CharSequence f46779mcp;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f46780n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private Drawable f46781ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private t8r f46782o1t;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f46784qrj;

    /* JADX INFO: renamed from: r */
    private MenuItem.OnActionExpandListener f520r;

    /* JADX INFO: renamed from: t */
    private MenuItem.OnMenuItemClickListener f521t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private char f46785t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private Runnable f46786wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f46787x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f46788x9kr;

    /* JADX INFO: renamed from: z */
    f7l8 f522z;

    /* JADX INFO: renamed from: i */
    private int f519i = 4096;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f46789zurt = 4096;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f46772fu4 = 0;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private ColorStateList f46764a9 = null;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private PorterDuff.Mode f46771fti = null;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f46775jp0y = false;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private boolean f46773gvn7 = false;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f46767d3 = false;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private int f46783oc = 16;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private boolean f46768dd = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.p$k */
    /* JADX INFO: compiled from: MenuItemImpl.java */
    class k implements toq.InterfaceC7873toq {
        k() {
        }

        @Override // androidx.core.view.toq.InterfaceC7873toq
        public void onActionProviderVisibilityChanged(boolean z2) {
            C0130p c0130p = C0130p.this;
            c0130p.f522z.lvui(c0130p);
        }
    }

    C0130p(f7l8 f7l8Var, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f522z = f7l8Var;
        this.f46787x2 = i3;
        this.f46784qrj = i2;
        this.f46780n7h = i4;
        this.f46777kja0 = i5;
        this.f518h = charSequence;
        this.f46769eqxt = i6;
    }

    private Drawable f7l8(Drawable drawable) {
        if (drawable != null && this.f46767d3 && (this.f46775jp0y || this.f46773gvn7)) {
            drawable = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
            if (this.f46775jp0y) {
                androidx.core.graphics.drawable.zy.kja0(drawable, this.f46764a9);
            }
            if (this.f46773gvn7) {
                androidx.core.graphics.drawable.zy.m2442h(drawable, this.f46771fti);
            }
            this.f46767d3 = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: g */
    private static void m369g(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public boolean a9() {
        return (this.f46769eqxt & 4) == 4;
    }

    public boolean cdj() {
        return (this.f46769eqxt & 1) == 1;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f46769eqxt & 8) == 0) {
            return false;
        }
        if (this.f46766d2ok == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f520r;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f522z.f7l8(this);
        }
        return false;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean expandActionView() {
        if (!qrj()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f520r;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f522z.n7h(this);
        }
        return false;
    }

    public MenuItem fn3e(Runnable runnable) {
        this.f46786wvg = runnable;
        return this;
    }

    public void fu4(boolean z2) {
        if (z2) {
            this.f46783oc |= 32;
        } else {
            this.f46783oc &= -33;
        }
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p024h.toq, android.view.MenuItem
    public View getActionView() {
        View view = this.f46766d2ok;
        if (view != null) {
            return view;
        }
        androidx.core.view.toq toqVar = this.f46778lvui;
        if (toqVar == null) {
            return null;
        }
        View viewMo361n = toqVar.mo361n(this);
        this.f46766d2ok = viewMo361n;
        return viewMo361n;
    }

    @Override // p024h.toq, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46789zurt;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46770fn3e;
    }

    @Override // p024h.toq, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46779mcp;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46784qrj;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f46781ni7;
        if (drawable != null) {
            return f7l8(drawable);
        }
        if (this.f46772fu4 == 0) {
            return null;
        }
        Drawable qVar = C6045k.toq(this.f522z.fu4(), this.f46772fu4);
        this.f46772fu4 = 0;
        this.f46781ni7 = qVar;
        return f7l8(qVar);
    }

    @Override // p024h.toq, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46764a9;
    }

    @Override // p024h.toq, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46771fti;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46776ki;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f46787x2;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46788x9kr;
    }

    @Override // p024h.toq, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f519i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46785t8r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46780n7h;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f46782o1t;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f518h;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f46765cdj;
        return charSequence != null ? charSequence : this.f518h;
    }

    @Override // p024h.toq, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46774jk;
    }

    /* JADX INFO: renamed from: h */
    public boolean m370h() {
        return (this.f46783oc & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46782o1t != null;
    }

    /* JADX INFO: renamed from: i */
    public void m371i(boolean z2) {
        this.f46768dd = z2;
        this.f522z.mo336r(false);
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46768dd;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f46783oc & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f46783oc & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f46783oc & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.toq toqVar = this.f46778lvui;
        return (toqVar == null || !toqVar.mo363y()) ? (this.f46783oc & 8) == 0 : (this.f46783oc & 8) == 0 && this.f46778lvui.zy();
    }

    boolean jk() {
        return this.f522z.eqxt() && m373p() != 0;
    }

    @Override // p024h.toq
    /* JADX INFO: renamed from: k */
    public androidx.core.view.toq mo345k() {
        return this.f46778lvui;
    }

    @Override // p024h.toq, android.view.MenuItem
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public p024h.toq setActionView(int i2) {
        Context contextFu4 = this.f522z.fu4();
        setActionView(LayoutInflater.from(contextFu4).inflate(i2, (ViewGroup) new LinearLayout(contextFu4), false));
        return this;
    }

    public boolean kja0() {
        return (this.f46783oc & 32) == 32;
    }

    String ld6() {
        char cM373p = m373p();
        if (cM373p == 0) {
            return "";
        }
        Resources resources = this.f522z.fu4().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f522z.fu4()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C7397k.ld6.f92440ki));
        }
        int i2 = this.f522z.oc() ? this.f46789zurt : this.f519i;
        m369g(sb, i2, 65536, resources.getString(C7397k.ld6.f92443n7h));
        m369g(sb, i2, 4096, resources.getString(C7397k.ld6.f42380p));
        m369g(sb, i2, 2, resources.getString(C7397k.ld6.f42382s));
        m369g(sb, i2, 1, resources.getString(C7397k.ld6.f92441kja0));
        m369g(sb, i2, 4, resources.getString(C7397k.ld6.f92436cdj));
        m369g(sb, i2, 8, resources.getString(C7397k.ld6.f92446qrj));
        if (cM373p == '\b') {
            sb.append(resources.getString(C7397k.ld6.f92442ld6));
        } else if (cM373p == '\n') {
            sb.append(resources.getString(C7397k.ld6.f92450x2));
        } else if (cM373p != ' ') {
            sb.append(cM373p);
        } else {
            sb.append(resources.getString(C7397k.ld6.f42376h));
        }
        return sb.toString();
    }

    public boolean mcp() {
        return this.f522z.jk();
    }

    /* JADX INFO: renamed from: n */
    public void m372n() {
        this.f522z.d2ok(this);
    }

    public boolean n7h() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f521t;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        f7l8 f7l8Var = this.f522z;
        if (f7l8Var.mo337s(f7l8Var, this)) {
            return true;
        }
        Runnable runnable = this.f46786wvg;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f46776ki != null) {
            try {
                this.f522z.fu4().startActivity(this.f46776ki);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e(f46761ncyb, "Can't find activity to handle intent; ignoring", e2);
            }
        }
        androidx.core.view.toq toqVar = this.f46778lvui;
        return toqVar != null && toqVar.mo359g();
    }

    public void ni7(boolean z2) {
        this.f46783oc = (z2 ? 4 : 0) | (this.f46783oc & (-5));
    }

    @Override // p024h.toq, android.view.MenuItem
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public p024h.toq setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    /* JADX INFO: renamed from: p */
    char m373p() {
        return this.f522z.oc() ? this.f46770fn3e : this.f46785t8r;
    }

    @Override // p024h.toq
    /* JADX INFO: renamed from: q */
    public boolean mo347q() {
        return (toq() || cdj()) ? false : true;
    }

    public boolean qrj() {
        androidx.core.view.toq toqVar;
        if ((this.f46769eqxt & 8) == 0) {
            return false;
        }
        if (this.f46766d2ok == null && (toqVar = this.f46778lvui) != null) {
            this.f46766d2ok = toqVar.mo361n(this);
        }
        return this.f46766d2ok != null;
    }

    /* JADX INFO: renamed from: s */
    public int m374s() {
        return this.f46777kja0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f46770fn3e == c2) {
            return this;
        }
        this.f46770fn3e = Character.toLowerCase(c2);
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f46783oc;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f46783oc = i3;
        if (i2 != i3) {
            this.f522z.mo336r(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f46783oc & 4) != 0) {
            this.f522z.nn86(this);
        } else {
            zurt(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f46783oc |= 16;
        } else {
            this.f46783oc &= -17;
        }
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46772fu4 = 0;
        this.f46781ni7 = drawable;
        this.f46767d3 = true;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setIconTintList(@dd ColorStateList colorStateList) {
        this.f46764a9 = colorStateList;
        this.f46775jp0y = true;
        this.f46767d3 = true;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46771fti = mode;
        this.f46773gvn7 = true;
        this.f46767d3 = true;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46776ki = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f46785t8r == c2) {
            return this;
        }
        this.f46785t8r = c2;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f520r = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f521t = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f46785t8r = c2;
        this.f46770fn3e = Character.toLowerCase(c3);
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f46769eqxt = i2;
        this.f522z.d2ok(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f518h = charSequence;
        this.f522z.mo336r(false);
        t8r t8rVar = this.f46782o1t;
        if (t8rVar != null) {
            t8rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46765cdj = charSequence;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (m375t(z2)) {
            this.f522z.lvui(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    boolean m375t(boolean z2) {
        int i2 = this.f46783oc;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f46783oc = i3;
        return i2 != i3;
    }

    @Override // p024h.toq, android.view.MenuItem
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public p024h.toq setActionView(View view) {
        int i2;
        this.f46766d2ok = view;
        this.f46778lvui = null;
        if (view != null && view.getId() == -1 && (i2 = this.f46787x2) > 0) {
            view.setId(i2);
        }
        this.f522z.d2ok(this);
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f518h;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p024h.toq
    public boolean toq() {
        return (this.f46769eqxt & 2) == 2;
    }

    public void wvg(t8r t8rVar) {
        this.f46782o1t = t8rVar;
        t8rVar.setHeaderTitle(getTitle());
    }

    CharSequence x2(kja0.InterfaceC0124k interfaceC0124k) {
        return (interfaceC0124k == null || !interfaceC0124k.mo310k()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: renamed from: y */
    Runnable m376y() {
        return this.f46786wvg;
    }

    /* JADX INFO: renamed from: z */
    void m377z(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f46788x9kr = contextMenuInfo;
    }

    void zurt(boolean z2) {
        int i2 = this.f46783oc;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f46783oc = i3;
        if (i2 != i3) {
            this.f522z.mo336r(false);
        }
    }

    @Override // p024h.toq
    public p024h.toq zy(androidx.core.view.toq toqVar) {
        androidx.core.view.toq toqVar2 = this.f46778lvui;
        if (toqVar2 != null) {
            toqVar2.m3511p();
        }
        this.f46766d2ok = null;
        this.f46778lvui = toqVar;
        this.f522z.mo336r(true);
        androidx.core.view.toq toqVar3 = this.f46778lvui;
        if (toqVar3 != null) {
            toqVar3.x2(new k());
        }
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public p024h.toq setContentDescription(CharSequence charSequence) {
        this.f46779mcp = charSequence;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public p024h.toq setTooltipText(CharSequence charSequence) {
        this.f46774jk = charSequence;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f46770fn3e == c2 && this.f46789zurt == i2) {
            return this;
        }
        this.f46770fn3e = Character.toLowerCase(c2);
        this.f46789zurt = KeyEvent.normalizeMetaState(i2);
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f46785t8r == c2 && this.f519i == i2) {
            return this;
        }
        this.f46785t8r = c2;
        this.f519i = KeyEvent.normalizeMetaState(i2);
        this.f522z.mo336r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f46785t8r = c2;
        this.f519i = KeyEvent.normalizeMetaState(i2);
        this.f46770fn3e = Character.toLowerCase(c3);
        this.f46789zurt = KeyEvent.normalizeMetaState(i3);
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f46781ni7 = null;
        this.f46772fu4 = i2;
        this.f46767d3 = true;
        this.f522z.mo336r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f522z.fu4().getString(i2));
    }
}

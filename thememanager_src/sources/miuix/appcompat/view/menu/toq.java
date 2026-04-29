package miuix.appcompat.view.menu;

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
import androidx.core.view.toq;
import miuix.appcompat.view.menu.InterfaceC7047q;
import miuix.appcompat.widget.C7061k;
import p023g.C6045k;
import p030n.C7397k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class toq implements p024h.toq {

    /* JADX INFO: renamed from: c */
    private static final int f39637c = 3;

    /* JADX INFO: renamed from: e */
    private static final int f39638e = 8;

    /* JADX INFO: renamed from: f */
    private static final String f39639f = "MenuItemImpl";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private static final int f87119hb = 32;

    /* JADX INFO: renamed from: j */
    static final int f39640j = 0;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final int f87120lrht = 1;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private static final int f87121nn86 = 16;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f87122uv6 = 2;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final int f87123vyq = 4;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private CharSequence f87125cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private View f87126d2ok;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f87128dd;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private int f87129eqxt;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private char f87130fn3e;

    /* JADX INFO: renamed from: h */
    private CharSequence f39641h;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f87134hyr;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private CharSequence f87135jk;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Intent f87137ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f87138kja0;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private View f87139lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private CharSequence f87140mcp;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int f87141n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f87142n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private C7061k f87143ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private Drawable f87144ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private SubMenuC7046n f87145o1t;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f87147qrj;

    /* JADX INFO: renamed from: r */
    private androidx.core.view.toq f39644r;

    /* JADX INFO: renamed from: t */
    private MenuItem.OnMenuItemClickListener f39645t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private char f87148t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private Runnable f87149wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f87150x2;

    /* JADX INFO: renamed from: z */
    C7045k f39646z;

    /* JADX INFO: renamed from: i */
    private int f39642i = 4096;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f87152zurt = 4096;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f87132fu4 = 0;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private ColorStateList f87124a9 = null;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private PorterDuff.Mode f87131fti = null;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f87136jp0y = false;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private boolean f87133gvn7 = false;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f87127d3 = false;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private int f87146oc = 16;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private boolean f87151x9kr = false;

    /* JADX INFO: renamed from: l */
    private boolean f39643l = false;

    /* JADX INFO: renamed from: miuix.appcompat.view.menu.toq$k */
    /* JADX INFO: compiled from: MenuItemImpl.java */
    class C7048k implements toq.InterfaceC7873toq {
        C7048k() {
        }

        @Override // androidx.core.view.toq.InterfaceC7873toq
        public void onActionProviderVisibilityChanged(boolean z2) {
            toq toqVar = toq.this;
            toqVar.f39646z.lvui(toqVar);
        }
    }

    toq(C7045k c7045k, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f39646z = c7045k;
        this.f87150x2 = i3;
        this.f87147qrj = i2;
        this.f87142n7h = i4;
        this.f87138kja0 = i5;
        this.f39641h = charSequence;
        this.f87129eqxt = i6;
    }

    private Drawable f7l8(Drawable drawable) {
        if (drawable != null && this.f87127d3 && (this.f87136jp0y || this.f87133gvn7)) {
            drawable = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
            if (this.f87136jp0y) {
                androidx.core.graphics.drawable.zy.kja0(drawable, this.f87124a9);
            }
            if (this.f87133gvn7) {
                androidx.core.graphics.drawable.zy.m2442h(drawable, this.f87131fti);
            }
            this.f87127d3 = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: g */
    private static void m25433g(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: y */
    private C7061k m25434y() {
        if (this.f87143ncyb == null) {
            this.f87143ncyb = new C7061k(this.f39646z.fu4());
        }
        return this.f87143ncyb;
    }

    public void a9(View view) {
        this.f87139lvui = view;
    }

    public boolean cdj() {
        return (this.f87146oc & 4) != 0;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f87129eqxt & 8) == 0) {
            return false;
        }
        if (this.f87126d2ok == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f87128dd;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f39646z.f7l8(this);
        }
        return false;
    }

    public boolean d3() {
        return (this.f87129eqxt & 4) == 4;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean expandActionView() {
        if (!n7h()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f87128dd;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f39646z.n7h(this);
        }
        return false;
    }

    public void fn3e(boolean z2) {
        this.f87151x9kr = z2;
        this.f39646z.m25425r(false);
    }

    boolean fti(boolean z2) {
        int i2 = this.f87146oc;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f87146oc = i3;
        return i2 != i3;
    }

    public MenuItem fu4(Runnable runnable) {
        this.f87149wvg = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p024h.toq, android.view.MenuItem
    public View getActionView() {
        View view = this.f87126d2ok;
        if (view != null) {
            return view;
        }
        androidx.core.view.toq toqVar = this.f39644r;
        if (toqVar == null) {
            return null;
        }
        View viewMo361n = toqVar.mo361n(this);
        this.f87126d2ok = viewMo361n;
        return viewMo361n;
    }

    @Override // p024h.toq, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f87152zurt;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f87130fn3e;
    }

    @Override // p024h.toq, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f87140mcp;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f87147qrj;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f87144ni7;
        if (drawable != null) {
            return f7l8(drawable);
        }
        if (this.f87132fu4 == 0) {
            return null;
        }
        Drawable qVar = C6045k.toq(this.f39646z.fu4(), this.f87132fu4);
        this.f87132fu4 = 0;
        this.f87144ni7 = qVar;
        return f7l8(qVar);
    }

    @Override // p024h.toq, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f87124a9;
    }

    @Override // p024h.toq, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f87131fti;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f87137ki;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f87150x2;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f87134hyr;
    }

    @Override // p024h.toq, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f39642i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f87148t8r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f87142n7h;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f87145o1t;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f39641h;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f87125cdj;
        return charSequence != null ? charSequence : this.f39641h;
    }

    @Override // p024h.toq, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f87135jk;
    }

    boolean gvn7() {
        return this.f39646z.eqxt() && ld6() != 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m25435h() {
        return (this.f87146oc & 32) == 32;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f87145o1t != null;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p024h.toq setActionView(View view) {
        int i2;
        this.f87126d2ok = view;
        this.f87139lvui = view;
        this.f39644r = null;
        if (view != null && view.getId() == -1 && (i2 = this.f87150x2) > 0) {
            view.setId(i2);
        }
        this.f39646z.d2ok(this);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f87151x9kr;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f87146oc & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f87146oc & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f87146oc & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.toq toqVar = this.f39644r;
        return (toqVar == null || !toqVar.mo363y()) ? (this.f87146oc & 8) == 0 : (this.f87146oc & 8) == 0 && this.f39644r.zy();
    }

    public void jk(SubMenuC7046n subMenuC7046n) {
        this.f87145o1t = subMenuC7046n;
        subMenuC7046n.setHeaderTitle(getTitle());
    }

    public boolean jp0y() {
        return this.f39646z.jk();
    }

    @Override // p024h.toq
    /* JADX INFO: renamed from: k */
    public androidx.core.view.toq mo345k() {
        return this.f39644r;
    }

    public boolean ki() {
        return (this.f87129eqxt & 1) == 1;
    }

    public boolean kja0() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f39645t;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C7045k c7045k = this.f39646z;
        if (c7045k.mo25426s(c7045k, this)) {
            return true;
        }
        Runnable runnable = this.f87149wvg;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f87137ki != null) {
            try {
                this.f39646z.fu4().startActivity(this.f87137ki);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e(f39639f, "Can't find activity to handle intent; ignoring", e2);
            }
        }
        androidx.core.view.toq toqVar = this.f39644r;
        return toqVar != null && toqVar.mo359g();
    }

    char ld6() {
        return this.f39646z.oc() ? this.f87130fn3e : this.f87148t8r;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    /* JADX INFO: renamed from: mcp, reason: merged with bridge method [inline-methods] */
    public p024h.toq setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m25437n() {
        this.f39646z.d2ok(this);
    }

    public boolean n7h() {
        androidx.core.view.toq toqVar;
        if ((this.f87129eqxt & 8) == 0) {
            return false;
        }
        if (this.f87126d2ok == null && (toqVar = this.f39644r) != null) {
            this.f87126d2ok = toqVar.mo361n(this);
        }
        return this.f87126d2ok != null;
    }

    public void ni7(boolean z2, int i2) {
        this.f39643l = z2;
        this.f87141n5r1 = i2;
    }

    public void o1t(boolean z2) {
        this.f87146oc = (z2 ? 4 : 0) | (this.f87146oc & (-5));
    }

    public void oc() {
        if (this.f39643l && this.f87139lvui.getVisibility() == 0) {
            m25434y().toq(this.f87139lvui, this.f87141n5r1);
            return;
        }
        C7061k c7061k = this.f87143ncyb;
        if (c7061k != null) {
            c7061k.m25484q();
            this.f87143ncyb = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public int m25438p() {
        return this.f87138kja0;
    }

    @Override // p024h.toq
    /* JADX INFO: renamed from: q */
    public boolean mo347q() {
        return (toq() || ki()) ? false : true;
    }

    CharSequence qrj(InterfaceC7047q.k kVar) {
        return (kVar == null || !kVar.m25432k()) ? getTitle() : getTitleCondensed();
    }

    /* JADX INFO: renamed from: s */
    Runnable m25439s() {
        return this.f87149wvg;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f87130fn3e == c2) {
            return this;
        }
        this.f87130fn3e = Character.toLowerCase(c2);
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f87146oc;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f87146oc = i3;
        if (i2 != i3) {
            this.f39646z.m25425r(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f87146oc & 4) != 0) {
            this.f39646z.nn86(this);
        } else {
            m25441z(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f87146oc |= 16;
        } else {
            this.f87146oc &= -17;
        }
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f87132fu4 = 0;
        this.f87144ni7 = drawable;
        this.f87127d3 = true;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public MenuItem setIconTintList(@dd ColorStateList colorStateList) {
        this.f87124a9 = colorStateList;
        this.f87136jp0y = true;
        this.f87127d3 = true;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f87131fti = mode;
        this.f87133gvn7 = true;
        this.f87127d3 = true;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f87137ki = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f87148t8r == c2) {
            return this;
        }
        this.f87148t8r = c2;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f87128dd = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f39645t = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f87148t8r = c2;
        this.f87130fn3e = Character.toLowerCase(c3);
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f87129eqxt = i2;
        this.f39646z.d2ok(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f39641h = charSequence;
        this.f39646z.m25425r(false);
        SubMenuC7046n subMenuC7046n = this.f87145o1t;
        if (subMenuC7046n != null) {
            subMenuC7046n.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f87125cdj = charSequence;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (fti(z2)) {
            this.f39646z.lvui(this);
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    void m25440t(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f87134hyr = contextMenuInfo;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public p024h.toq setActionView(int i2) {
        Context contextFu4 = this.f39646z.fu4();
        setActionView(LayoutInflater.from(contextFu4).inflate(i2, (ViewGroup) new LinearLayout(contextFu4), false));
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f39641h;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p024h.toq
    public boolean toq() {
        return (this.f87129eqxt & 2) == 2;
    }

    public void wvg(boolean z2) {
        if (z2) {
            this.f87146oc |= 32;
        } else {
            this.f87146oc &= -33;
        }
    }

    String x2() {
        char cLd6 = ld6();
        if (cLd6 == 0) {
            return "";
        }
        Resources resources = this.f39646z.fu4().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f39646z.fu4()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C7397k.ld6.f92440ki));
        }
        int i2 = this.f39646z.oc() ? this.f87152zurt : this.f39642i;
        m25433g(sb, i2, 65536, resources.getString(C7397k.ld6.f92443n7h));
        m25433g(sb, i2, 4096, resources.getString(C7397k.ld6.f42380p));
        m25433g(sb, i2, 2, resources.getString(C7397k.ld6.f42382s));
        m25433g(sb, i2, 1, resources.getString(C7397k.ld6.f92441kja0));
        m25433g(sb, i2, 4, resources.getString(C7397k.ld6.f92436cdj));
        m25433g(sb, i2, 8, resources.getString(C7397k.ld6.f92446qrj));
        if (cLd6 == '\b') {
            sb.append(resources.getString(C7397k.ld6.f92442ld6));
        } else if (cLd6 == '\n') {
            sb.append(resources.getString(C7397k.ld6.f92450x2));
        } else if (cLd6 != ' ') {
            sb.append(cLd6);
        } else {
            sb.append(resources.getString(C7397k.ld6.f42376h));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    void m25441z(boolean z2) {
        int i2 = this.f87146oc;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f87146oc = i3;
        if (i2 != i3) {
            this.f39646z.m25425r(false);
        }
    }

    public void zurt(boolean z2) {
        ni7(z2, 2);
    }

    @Override // p024h.toq
    @lvui
    public p024h.toq zy(androidx.core.view.toq toqVar) {
        androidx.core.view.toq toqVar2 = this.f39644r;
        if (toqVar2 != null) {
            toqVar2.m3511p();
        }
        this.f87126d2ok = null;
        this.f39644r = toqVar;
        this.f39646z.m25425r(true);
        androidx.core.view.toq toqVar3 = this.f39644r;
        if (toqVar3 != null) {
            toqVar3.x2(new C7048k());
        }
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public p024h.toq setContentDescription(CharSequence charSequence) {
        this.f87140mcp = charSequence;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public p024h.toq setTooltipText(CharSequence charSequence) {
        this.f87135jk = charSequence;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f87130fn3e == c2 && this.f87152zurt == i2) {
            return this;
        }
        this.f87130fn3e = Character.toLowerCase(c2);
        this.f87152zurt = KeyEvent.normalizeMetaState(i2);
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f87148t8r == c2 && this.f39642i == i2) {
            return this;
        }
        this.f87148t8r = c2;
        this.f39642i = KeyEvent.normalizeMetaState(i2);
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    @lvui
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f87148t8r = c2;
        this.f39642i = KeyEvent.normalizeMetaState(i2);
        this.f87130fn3e = Character.toLowerCase(c3);
        this.f87152zurt = KeyEvent.normalizeMetaState(i3);
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f87144ni7 = null;
        this.f87132fu4 = i2;
        this.f87127d3 = true;
        this.f39646z.m25425r(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f39646z.fu4().getString(i2));
    }
}

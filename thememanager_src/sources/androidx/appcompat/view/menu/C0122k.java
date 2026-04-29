package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0498q;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.k */
/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0122k implements p024h.toq {

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f46733d3 = 8;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f46734fti = 1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f46735gvn7 = 4;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f46736jp0y = 2;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f46737oc = 16;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Intent f46739cdj;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f46741fu4;

    /* JADX INFO: renamed from: h */
    private CharSequence f466h;

    /* JADX INFO: renamed from: i */
    private char f467i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private char f46743ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private CharSequence f46744kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f46746n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private Context f46747ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private CharSequence f46748o1t;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f46749qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f46752x2;

    /* JADX INFO: renamed from: z */
    private CharSequence f469z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private Drawable f46753zurt;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f46750t8r = 4096;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f46740fn3e = 4096;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private ColorStateList f46751wvg = null;

    /* JADX INFO: renamed from: t */
    private PorterDuff.Mode f468t = null;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f46745mcp = false;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f46742jk = false;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private int f46738a9 = 16;

    public C0122k(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f46747ni7 = context;
        this.f46752x2 = i3;
        this.f46749qrj = i2;
        this.f46746n7h = i5;
        this.f46744kja0 = charSequence;
    }

    /* JADX INFO: renamed from: n */
    private void m343n() {
        Drawable drawable = this.f46753zurt;
        if (drawable != null) {
            if (this.f46745mcp || this.f46742jk) {
                Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(drawable);
                this.f46753zurt = drawableKi;
                Drawable drawableMutate = drawableKi.mutate();
                this.f46753zurt = drawableMutate;
                if (this.f46745mcp) {
                    androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f46751wvg);
                }
                if (this.f46742jk) {
                    androidx.core.graphics.drawable.zy.m2442h(this.f46753zurt, this.f468t);
                }
            }
        }
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p024h.toq, android.view.MenuItem
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public p024h.toq setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public boolean m344g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f46741fu4;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f46739cdj;
        if (intent == null) {
            return false;
        }
        this.f46747ni7.startActivity(intent);
        return true;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p024h.toq, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p024h.toq, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46740fn3e;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f467i;
    }

    @Override // p024h.toq, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f469z;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46749qrj;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f46753zurt;
    }

    @Override // p024h.toq, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46751wvg;
    }

    @Override // p024h.toq, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f468t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46739cdj;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f46752x2;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p024h.toq, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46750t8r;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46743ki;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46746n7h;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f46744kja0;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f466h;
        return charSequence != null ? charSequence : this.f46744kja0;
    }

    @Override // p024h.toq, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46748o1t;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p024h.toq, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f46738a9 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f46738a9 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f46738a9 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f46738a9 & 8) == 0;
    }

    @Override // p024h.toq
    /* JADX INFO: renamed from: k */
    public androidx.core.view.toq mo345k() {
        return null;
    }

    @Override // p024h.toq, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p024h.toq setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // p024h.toq
    /* JADX INFO: renamed from: q */
    public boolean mo347q() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public C0122k m348s(boolean z2) {
        this.f46738a9 = (z2 ? 4 : 0) | (this.f46738a9 & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f467i = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f46738a9 = (z2 ? 1 : 0) | (this.f46738a9 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f46738a9 = (z2 ? 2 : 0) | (this.f46738a9 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f46738a9 = (z2 ? 16 : 0) | (this.f46738a9 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46753zurt = drawable;
        m343n();
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setIconTintList(@dd ColorStateList colorStateList) {
        this.f46751wvg = colorStateList;
        this.f46745mcp = true;
        m343n();
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f468t = mode;
        this.f46742jk = true;
        m343n();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46739cdj = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f46743ki = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46741fu4 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f46743ki = c2;
        this.f467i = Character.toLowerCase(c3);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46744kja0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f466h = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f46738a9 = (this.f46738a9 & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // p024h.toq
    public boolean toq() {
        return true;
    }

    @Override // p024h.toq, android.view.MenuItem
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public p024h.toq setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p024h.toq
    public p024h.toq zy(androidx.core.view.toq toqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f467i = Character.toLowerCase(c2);
        this.f46740fn3e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public p024h.toq setContentDescription(CharSequence charSequence) {
        this.f469z = charSequence;
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f46743ki = c2;
        this.f46750t8r = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f46744kja0 = this.f46747ni7.getResources().getString(i2);
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public p024h.toq setTooltipText(CharSequence charSequence) {
        this.f46748o1t = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f46753zurt = C0498q.m2259s(this.f46747ni7, i2);
        m343n();
        return this;
    }

    @Override // p024h.toq, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f46743ki = c2;
        this.f46750t8r = KeyEvent.normalizeMetaState(i2);
        this.f467i = Character.toLowerCase(c3);
        this.f46740fn3e = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}

package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.k */
/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes3.dex */
public class MenuItemC7021k implements MenuItem {

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f86990mcp = 16;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f86991o1t = 2;

    /* JADX INFO: renamed from: t */
    private static final int f39486t = 8;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f86992wvg = 4;

    /* JADX INFO: renamed from: z */
    private static final int f39487z = 1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private CharSequence f86993cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private Drawable f86994fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f86995fu4 = 16;

    /* JADX INFO: renamed from: h */
    private CharSequence f39488h;

    /* JADX INFO: renamed from: i */
    private char f39489i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Intent f86996ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f86997kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int f86998n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f86999ni7;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int f87000qrj;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private char f87001t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int f87002x2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private Context f87003zurt;

    public MenuItemC7021k(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f87003zurt = context;
        this.f87002x2 = i3;
        this.f87000qrj = i2;
        this.f86998n7h = i4;
        this.f86997kja0 = i5;
        this.f39488h = charSequence;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public MenuItemC7021k f7l8(boolean z2) {
        this.f86995fu4 = (z2 ? 4 : 0) | (this.f86995fu4 & (-5));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public boolean m25312g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f86999ni7;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f86996ki;
        if (intent == null) {
            return false;
        }
        this.f87003zurt.startActivity(intent);
        return true;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f39489i;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f87000qrj;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f86994fn3e;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f86996ki;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f87002x2;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f87001t8r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f86997kja0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f39488h;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f86993cdj;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f86995fu4 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f86995fu4 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f86995fu4 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f86995fu4 & 8) == 0;
    }

    /* JADX INFO: renamed from: n */
    public ActionProvider m25313n() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public MenuItem m25314s(MenuItem.OnActionExpandListener onActionExpandListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f39489i = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f86995fu4 = (z2 ? 1 : 0) | (this.f86995fu4 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f86995fu4 = (z2 ? 2 : 0) | (this.f86995fu4 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f86995fu4 = (z2 ? 16 : 0) | (this.f86995fu4 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f86994fn3e = drawable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f86996ki = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f87001t8r = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f86999ni7 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f87001t8r = c2;
        this.f39489i = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f39488h = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f86993cdj = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f86995fu4 = (this.f86995fu4 & 8) | (z2 ? 0 : 8);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public MenuItem m25315y(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f86994fn3e = this.f87003zurt.getResources().getDrawable(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f39488h = this.f87003zurt.getResources().getString(i2);
        return this;
    }
}

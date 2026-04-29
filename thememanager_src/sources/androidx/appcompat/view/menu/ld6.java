package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.toq;
import java.lang.reflect.Method;
import zy.hyr;
import zy.uv6;

/* JADX INFO: compiled from: MenuItemWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ld6 extends androidx.appcompat.view.menu.zy implements MenuItem {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final String f46754cdj = "MenuItemWrapper";

    /* JADX INFO: renamed from: h */
    private Method f493h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final p024h.toq f46755kja0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ld6$k */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class C0125k extends androidx.core.view.toq {

        /* JADX INFO: renamed from: n */
        final ActionProvider f495n;

        C0125k(Context context, ActionProvider actionProvider) {
            super(context);
            this.f495n = actionProvider;
        }

        @Override // androidx.core.view.toq
        public void f7l8(SubMenu subMenu) {
            this.f495n.onPrepareSubMenu(ld6.this.m392g(subMenu));
        }

        @Override // androidx.core.view.toq
        /* JADX INFO: renamed from: g */
        public boolean mo359g() {
            return this.f495n.onPerformDefaultAction();
        }

        @Override // androidx.core.view.toq
        /* JADX INFO: renamed from: q */
        public View mo360q() {
            return this.f495n.onCreateActionView();
        }

        @Override // androidx.core.view.toq
        public boolean toq() {
            return this.f495n.hasSubMenu();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ld6$n */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class MenuItemOnMenuItemClickListenerC0126n implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: k */
        private final MenuItem.OnMenuItemClickListener f496k;

        MenuItemOnMenuItemClickListenerC0126n(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f496k = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f496k.onMenuItemClick(ld6.this.m393n(menuItem));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ld6$q */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    private class MenuItemOnActionExpandListenerC0127q implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: k */
        private final MenuItem.OnActionExpandListener f498k;

        MenuItemOnActionExpandListenerC0127q(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f498k = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f498k.onMenuItemActionCollapse(ld6.this.m393n(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f498k.onMenuItemActionExpand(ld6.this.m393n(menuItem));
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    @hyr(16)
    private class toq extends C0125k implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private toq.InterfaceC7873toq f46757f7l8;

        toq(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.toq
        /* JADX INFO: renamed from: n */
        public View mo361n(MenuItem menuItem) {
            return this.f495n.onCreateActionView(menuItem);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            toq.InterfaceC7873toq interfaceC7873toq = this.f46757f7l8;
            if (interfaceC7873toq != null) {
                interfaceC7873toq.onActionProviderVisibilityChanged(z2);
            }
        }

        @Override // androidx.core.view.toq
        /* JADX INFO: renamed from: s */
        public void mo362s() {
            this.f495n.refreshVisibility();
        }

        @Override // androidx.core.view.toq
        public void x2(toq.InterfaceC7873toq interfaceC7873toq) {
            this.f46757f7l8 = interfaceC7873toq;
            this.f495n.setVisibilityListener(interfaceC7873toq != null ? this : null);
        }

        @Override // androidx.core.view.toq
        /* JADX INFO: renamed from: y */
        public boolean mo363y() {
            return this.f495n.overridesItemVisibility();
        }

        @Override // androidx.core.view.toq
        public boolean zy() {
            return this.f495n.isVisible();
        }
    }

    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    static class zy extends FrameLayout implements androidx.appcompat.view.zy {

        /* JADX INFO: renamed from: k */
        final CollapsibleActionView f500k;

        /* JADX WARN: Multi-variable type inference failed */
        zy(View view) {
            super(view.getContext());
            this.f500k = (CollapsibleActionView) view;
            addView(view);
        }

        /* JADX INFO: renamed from: k */
        View m364k() {
            return (View) this.f500k;
        }

        @Override // androidx.appcompat.view.zy
        public void onActionViewCollapsed() {
            this.f500k.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.zy
        public void onActionViewExpanded() {
            this.f500k.onActionViewExpanded();
        }
    }

    public ld6(Context context, p024h.toq toqVar) {
        super(context);
        if (toqVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f46755kja0 = toqVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f46755kja0.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f46755kja0.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.toq toqVarMo345k = this.f46755kja0.mo345k();
        if (toqVarMo345k instanceof C0125k) {
            return ((C0125k) toqVarMo345k).f495n;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f46755kja0.getActionView();
        return actionView instanceof zy ? ((zy) actionView).m364k() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46755kja0.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46755kja0.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46755kja0.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46755kja0.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f46755kja0.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46755kja0.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46755kja0.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46755kja0.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f46755kja0.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f46755kja0.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46755kja0.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46755kja0.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46755kja0.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m392g(this.f46755kja0.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f46755kja0.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f46755kja0.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46755kja0.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f46755kja0.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f46755kja0.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f46755kja0.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f46755kja0.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f46755kja0.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f46755kja0.isVisible();
    }

    /* JADX INFO: renamed from: p */
    public void m358p(boolean z2) {
        try {
            if (this.f493h == null) {
                this.f493h = this.f46755kja0.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f493h.invoke(this.f46755kja0, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.w(f46754cdj, "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        toq toqVar = new toq(this.f46803x2, actionProvider);
        p024h.toq toqVar2 = this.f46755kja0;
        if (actionProvider == null) {
            toqVar = null;
        }
        toqVar2.zy(toqVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new zy(view);
        }
        this.f46755kja0.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f46755kja0.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f46755kja0.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f46755kja0.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f46755kja0.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f46755kja0.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46755kja0.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46755kja0.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46755kja0.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46755kja0.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f46755kja0.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f46755kja0.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0127q(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46755kja0.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC0126n(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f46755kja0.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f46755kja0.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f46755kja0.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46755kja0.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46755kja0.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f46755kja0.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        return this.f46755kja0.setVisible(z2);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f46755kja0.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f46755kja0.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f46755kja0.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f46755kja0.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f46755kja0.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f46755kja0.setActionView(i2);
        View actionView = this.f46755kja0.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f46755kja0.setActionView(new zy(actionView));
        }
        return this;
    }
}

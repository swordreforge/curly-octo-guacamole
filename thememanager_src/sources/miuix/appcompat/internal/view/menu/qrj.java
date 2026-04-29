package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import miuix.appcompat.internal.view.menu.f7l8;

/* JADX INFO: compiled from: SubMenuBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj extends f7l8 implements SubMenu {

    /* JADX INFO: renamed from: l */
    private MenuItemC7036s f39561l;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private f7l8 f87035ncyb;

    public qrj(Context context, f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        super(context);
        this.f87035ncyb = f7l8Var;
        this.f39561l = menuItemC7036s;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public void bf2(boolean z2) {
        this.f87035ncyb.bf2(z2);
    }

    public void ch(f7l8 f7l8Var) {
        this.f87035ncyb = f7l8Var;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8, android.view.SubMenu
    public void clearHeader() {
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public boolean d3() {
        return this.f87035ncyb.d3();
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public boolean f7l8(MenuItemC7036s menuItemC7036s) {
        return this.f87035ncyb.f7l8(menuItemC7036s);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f39561l;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public f7l8 jp0y() {
        return this.f87035ncyb;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public void lrht(f7l8.toq toqVar) {
        this.f87035ncyb.lrht(toqVar);
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public boolean oc() {
        return this.f87035ncyb.oc();
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public boolean qrj(MenuItemC7036s menuItemC7036s) {
        return this.f87035ncyb.qrj(menuItemC7036s);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m25342j(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.ek5k(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.yz(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f39561l.setIcon(drawable);
        return this;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f87035ncyb.setQwertyMode(z2);
    }

    /* JADX INFO: renamed from: x */
    public Menu m25367x() {
        return this.f87035ncyb;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    /* JADX INFO: renamed from: y */
    public boolean mo25350y(f7l8 f7l8Var, MenuItem menuItem) {
        return super.mo25350y(f7l8Var, menuItem) || this.f87035ncyb.mo25350y(f7l8Var, menuItem);
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8
    public String zurt() {
        MenuItemC7036s menuItemC7036s = this.f39561l;
        int itemId = menuItemC7036s != null ? menuItemC7036s.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.zurt() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        super.m25342j(fu4().getResources().getDrawable(i2));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        super.ek5k(fu4().getResources().getString(i2));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f39561l.setIcon(i2);
        return this;
    }
}

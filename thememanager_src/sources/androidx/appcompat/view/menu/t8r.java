package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f7l8;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: SubMenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class t8r extends f7l8 implements SubMenu {

    /* JADX INFO: renamed from: l */
    private C0130p f565l;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private f7l8 f46800ncyb;

    public t8r(Context context, f7l8 f7l8Var, C0130p c0130p) {
        super(context);
        this.f46800ncyb = f7l8Var;
        this.f565l = c0130p;
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public void bf2(boolean z2) {
        this.f46800ncyb.bf2(z2);
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public boolean d3() {
        return this.f46800ncyb.d3();
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public boolean eqxt() {
        return this.f46800ncyb.eqxt();
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public boolean f7l8(C0130p c0130p) {
        return this.f46800ncyb.f7l8(c0130p);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f565l;
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public f7l8 jp0y() {
        return this.f46800ncyb.jp0y();
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public boolean n7h(C0130p c0130p) {
        return this.f46800ncyb.n7h(c0130p);
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public String ni7() {
        C0130p c0130p = this.f565l;
        int itemId = c0130p != null ? c0130p.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.ni7() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public boolean oc() {
        return this.f46800ncyb.oc();
    }

    @Override // androidx.appcompat.view.menu.f7l8
    /* JADX INFO: renamed from: s */
    boolean mo337s(@lvui f7l8 f7l8Var, @lvui MenuItem menuItem) {
        return super.mo337s(f7l8Var, menuItem) || this.f46800ncyb.mo337s(f7l8Var, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f7l8, p024h.InterfaceMenuC6069k, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f46800ncyb.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m331j(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.ek5k(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.yz(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f565l.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f7l8, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f46800ncyb.setQwertyMode(z2);
    }

    @Override // androidx.appcompat.view.menu.f7l8
    public void uv6(f7l8.InterfaceC0118k interfaceC0118k) {
        this.f46800ncyb.uv6(interfaceC0118k);
    }

    public Menu zp() {
        return this.f46800ncyb;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.hb(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.m333m(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f565l.setIcon(i2);
        return this;
    }
}

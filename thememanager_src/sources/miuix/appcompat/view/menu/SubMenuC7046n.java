package miuix.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import miuix.appcompat.view.menu.C7045k;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: miuix.appcompat.view.menu.n */
/* JADX INFO: compiled from: SubMenuBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class SubMenuC7046n extends C7045k implements SubMenu {

    /* JADX INFO: renamed from: l */
    private toq f39636l;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private C7045k f87118ncyb;

    public SubMenuC7046n(Context context, C7045k c7045k, toq toqVar) {
        super(context);
        this.f87118ncyb = c7045k;
        this.f39636l = toqVar;
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public void bf2(boolean z2) {
        this.f87118ncyb.bf2(z2);
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public boolean d3() {
        return this.f87118ncyb.d3();
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public boolean eqxt() {
        return this.f87118ncyb.eqxt();
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public boolean f7l8(toq toqVar) {
        return this.f87118ncyb.f7l8(toqVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f39636l;
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public C7045k jp0y() {
        return this.f87118ncyb.jp0y();
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public boolean n7h(toq toqVar) {
        return this.f87118ncyb.n7h(toqVar);
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public String ni7() {
        toq toqVar = this.f39636l;
        int itemId = toqVar != null ? toqVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.ni7() + ":" + itemId;
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public boolean oc() {
        return this.f87118ncyb.oc();
    }

    @Override // miuix.appcompat.view.menu.C7045k
    /* JADX INFO: renamed from: s */
    boolean mo25426s(@lvui C7045k c7045k, @lvui MenuItem menuItem) {
        return super.mo25426s(c7045k, menuItem) || this.f87118ncyb.mo25426s(c7045k, menuItem);
    }

    @Override // miuix.appcompat.view.menu.C7045k, p024h.InterfaceMenuC6069k, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f87118ncyb.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m25420j(drawable);
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
        this.f39636l.setIcon(drawable);
        return this;
    }

    @Override // miuix.appcompat.view.menu.C7045k, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f87118ncyb.setQwertyMode(z2);
    }

    @Override // miuix.appcompat.view.menu.C7045k
    public void uv6(C7045k.k kVar) {
        this.f87118ncyb.uv6(kVar);
    }

    public Menu zp() {
        return this.f87118ncyb;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        return (SubMenu) super.hb(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        return (SubMenu) super.m25422m(i2);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f39636l.setIcon(i2);
        return this;
    }
}

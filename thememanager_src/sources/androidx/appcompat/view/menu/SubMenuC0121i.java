package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: compiled from: SubMenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class SubMenuC0121i extends MenuC0120h implements SubMenu {

    /* JADX INFO: renamed from: h */
    private final p024h.zy f465h;

    SubMenuC0121i(Context context, p024h.zy zyVar) {
        super(context, zyVar);
        this.f465h = zyVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f465h.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m393n(this.f465h.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        this.f465h.setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        this.f465h.setHeaderTitle(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f465h.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f465h.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f465h.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f465h.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f465h.setIcon(drawable);
        return this;
    }
}

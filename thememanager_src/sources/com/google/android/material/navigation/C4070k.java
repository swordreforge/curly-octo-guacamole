package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.f7l8;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.navigation.k */
/* JADX INFO: compiled from: NavigationBarMenu.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class C4070k extends f7l8 {

    /* JADX INFO: renamed from: l */
    private final int f24750l;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    @lvui
    private final Class<?> f67736ncyb;

    public C4070k(@lvui Context context, @lvui Class<?> cls, int i2) {
        super(context);
        this.f67736ncyb = cls;
        this.f24750l = i2;
    }

    @Override // androidx.appcompat.view.menu.f7l8, android.view.Menu
    @lvui
    public SubMenu addSubMenu(int i2, int i3, int i4, @lvui CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f67736ncyb.getSimpleName() + " does not support submenus");
    }

    @Override // androidx.appcompat.view.menu.f7l8
    @lvui
    /* JADX INFO: renamed from: k */
    protected MenuItem mo332k(int i2, int i3, int i4, @lvui CharSequence charSequence) {
        if (size() + 1 <= this.f24750l) {
            m323a();
            MenuItem menuItemMo332k = super.mo332k(i2, i3, i4, charSequence);
            if (menuItemMo332k instanceof C0130p) {
                ((C0130p) menuItemMo332k).ni7(true);
            }
            a98o();
            return menuItemMo332k;
        }
        String simpleName = this.f67736ncyb.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f24750l + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    public int zp() {
        return this.f24750l;
    }
}

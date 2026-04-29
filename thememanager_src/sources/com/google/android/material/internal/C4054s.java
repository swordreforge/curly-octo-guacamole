package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0130p;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.s */
/* JADX INFO: compiled from: NavigationMenu.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4054s extends androidx.appcompat.view.menu.f7l8 {
    public C4054s(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.f7l8, android.view.Menu
    @lvui
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0130p c0130p = (C0130p) mo332k(i2, i3, i4, charSequence);
        ld6 ld6Var = new ld6(fu4(), this, c0130p);
        c0130p.wvg(ld6Var);
        return ld6Var;
    }
}

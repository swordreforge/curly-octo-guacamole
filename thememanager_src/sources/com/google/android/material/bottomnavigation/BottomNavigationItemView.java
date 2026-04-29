package com.google.android.material.bottomnavigation;

import android.content.Context;
import com.google.android.material.navigation.NavigationBarItemView;
import ij.C6095k;
import zy.InterfaceC7829h;
import zy.gvn7;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(@lvui Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @InterfaceC7829h
    protected int getItemDefaultMarginResId() {
        return C6095k.g.f79036z4;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @gvn7
    protected int getItemLayoutResId() {
        return C6095k.ld6.f79311jk;
    }
}

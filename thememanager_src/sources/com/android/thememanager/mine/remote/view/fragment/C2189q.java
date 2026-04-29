package com.android.thememanager.mine.remote.view.fragment;

import android.os.Bundle;
import android.view.Menu;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.thememanager.mine.remote.presenter.LargeIconPackagePurchasePresenter;
import com.android.thememanager.mine.remote.view.activity.MineRemotePackageLargeIconActivity;
import com.android.thememanager.mine.remote.view.listview.adapter.PackageLargeIconPurchasedAdapter;
import i9jn.InterfaceC6094k;
import java.util.Set;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.q */
/* JADX INFO: compiled from: LargeIconPackagePurchasedTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2189q extends f7l8 {
    private boolean az = false;
    private String bg;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.remote.view.fragment.f7l8, com.android.thememanager.mine.remote.view.fragment.zy
    /* JADX INFO: renamed from: lk, reason: merged with bridge method [inline-methods] */
    public PackageLargeIconPurchasedAdapter r6ty() {
        return new PackageLargeIconPurchasedAdapter(this, wt(), kiv());
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.f7l8, com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @InterfaceC7396q
    @lvui
    /* JADX INFO: renamed from: mi1u */
    public InterfaceC6094k.q uv6() {
        return new LargeIconPackagePurchasePresenter(wt(), this.bg);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((MineRemotePackageLargeIconActivity) getActivity()).setImmersionMenuEnabled(false);
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy
    public boolean ovdh(Menu menu) {
        return true;
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.f7l8, i9jn.InterfaceC6094k.g
    public void xwq3(boolean hide, Set<String> itemIds) {
        super.xwq3(hide, itemIds);
        this.az = true;
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy, com.android.thememanager.basemodule.base.f7l8
    protected void z4t() {
        super.z4t();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.bg = arguments.getString(MineRemotePackageLargeIconActivity.f12838d, null);
        }
    }

    public boolean z617() {
        return this.az;
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy
    public GridLayoutManager zff0() {
        return new GridLayoutManager(getActivity(), 3);
    }
}

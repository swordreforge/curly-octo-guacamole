package com.android.thememanager.mine.remote.view.fragment;

import com.android.thememanager.mine.remote.presenter.RemoteResourceLikePresenter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceLikeAdapter;
import i9jn.InterfaceC6094k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.g */
/* JADX INFO: compiled from: RemoteResourceLikeTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2186g extends C2188n {
    @Override // com.android.thememanager.mine.remote.view.fragment.C2188n, com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: mi1u */
    public InterfaceC6094k.q uv6() {
        return new RemoteResourceLikePresenter(wt());
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.C2188n, com.android.thememanager.mine.remote.view.fragment.zy
    protected BaseRemoteResourceAdapter r6ty() {
        return new RemoteResourceLikeAdapter(this, wt(), kiv());
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.C2188n
    protected void vwb(boolean success) {
    }
}

package com.android.thememanager.mine.local.view.fragment;

import com.android.thememanager.C2320q;
import com.android.thememanager.mine.local.presenter.LocalLauncherPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLauncherAdapter;
import gbni.InterfaceC6058k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLauncherFragment extends LocalResourceFragment {
    @Override // com.android.thememanager.mine.local.view.fragment.LocalResourceFragment, com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: bqie, reason: merged with bridge method [inline-methods] */
    public InterfaceC6058k.k uv6() {
        return new LocalLauncherPresenter(true, C2320q.ncyb(getActivity().getIntent()));
    }

    @Override // com.android.thememanager.mine.local.view.fragment.LocalResourceFragment, com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        return new LocalLauncherAdapter(this, "launcher", (InterfaceC6058k.k) kiv());
    }
}

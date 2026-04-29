package com.android.thememanager.recommend.view.fragment;

import android.os.Bundle;
import com.android.thememanager.recommend.presenter.RecommendSearchHintPresenter;
import w831.InterfaceC7729k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.s */
/* JADX INFO: compiled from: RecommendSearchHintFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2355s extends AbstractC2352n {
    public static C2355s ovdh(String resourceCode, boolean needRefresh) {
        C2355s c2355s = new C2355s();
        Bundle bundle = new Bundle();
        bundle.putString("res_code", resourceCode);
        bundle.putBoolean("need_refresh", needRefresh);
        c2355s.setArguments(bundle);
        return c2355s;
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: exv8, reason: merged with bridge method [inline-methods] */
    public InterfaceC7729k.k uv6() {
        return new RecommendSearchHintPresenter(this.f13655a);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n, com.android.thememanager.basemodule.base.f7l8
    public void z4t() {
        super.z4t();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13655a = arguments.getString("res_code");
            this.f13661j = 1;
        }
    }
}

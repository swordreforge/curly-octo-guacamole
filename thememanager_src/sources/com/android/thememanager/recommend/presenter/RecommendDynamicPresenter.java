package com.android.thememanager.recommend.presenter;

import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;
import retrofit2.toq;
import w831.InterfaceC7729k;
import z4.zy;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendDynamicPresenter extends BasePresenter<InterfaceC7729k.toq> implements InterfaceC7729k.k {

    /* JADX INFO: renamed from: q */
    private String f13583q;

    public RecommendDynamicPresenter(String listUrl) {
        this.f13583q = listUrl;
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return ((zy) f7l8.m6882h().qrj(zy.class)).m28207n(this.f13583q, cardStart);
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getRefreshCall() {
        return ((zy) f7l8.m6882h().qrj(zy.class)).m28207n(this.f13583q, 0);
    }
}

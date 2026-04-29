package com.android.thememanager.recommend.presenter;

import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;
import retrofit2.toq;
import w831.InterfaceC7729k;
import z4.zy;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendCategoryPresenter extends BasePresenter<InterfaceC7729k.toq> implements InterfaceC7729k.k {

    /* JADX INFO: renamed from: n */
    private String f13581n;

    /* JADX INFO: renamed from: q */
    private String f13582q;

    public RecommendCategoryPresenter(String tabType, String subTabType) {
        this.f13582q = tabType;
        this.f13581n = subTabType;
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return ((zy) f7l8.m6882h().toq(zy.class)).m28209s(z4.toq.f45964k.get(this.f13581n), cardStart, 1);
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getRefreshCall() {
        return ((zy) f7l8.m6882h().toq(zy.class)).m28209s(z4.toq.f45964k.get(this.f13581n), 0, Integer.MAX_VALUE);
    }
}

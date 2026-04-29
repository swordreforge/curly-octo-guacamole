package com.android.thememanager.recommend.presenter;

import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.toq;
import com.google.gson.kja0;
import w831.InterfaceC7729k;
import z4.zy;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendHomepageAodIconPresenter extends BasePresenter<InterfaceC7729k.toq> implements InterfaceC7729k.k {

    /* JADX INFO: renamed from: n */
    private int f13584n = toq.toq();

    /* JADX INFO: renamed from: q */
    private String f13585q;

    public RecommendHomepageAodIconPresenter(String subTabType) {
        this.f13585q = subTabType;
    }

    @Override // w831.InterfaceC7729k.k
    public retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return ((zy) f7l8.m6882h().toq(zy.class)).zy(z4.toq.f45964k.get(this.f13585q), cardStart, 1, this.f13584n);
    }

    @Override // w831.InterfaceC7729k.k
    public retrofit2.toq<CommonResponse<kja0>> getRefreshCall() {
        this.f13584n = toq.toq();
        return ((zy) f7l8.m6882h().toq(zy.class)).zy(z4.toq.f45964k.get(this.f13585q), 0, Integer.MAX_VALUE, this.f13584n);
    }
}

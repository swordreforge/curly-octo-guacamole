package com.android.thememanager.recommend.presenter;

import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;
import retrofit2.toq;
import w831.InterfaceC7729k;
import z4.zy;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendSearchHintPresenter extends BasePresenter<InterfaceC7729k.toq> implements InterfaceC7729k.k {

    /* JADX INFO: renamed from: n */
    private static final int f13592n = 6;

    /* JADX INFO: renamed from: q */
    private String f13593q;

    public RecommendSearchHintPresenter(String resourceCode) {
        this.f13593q = resourceCode;
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return ((zy) f7l8.m6882h().qrj(zy.class)).m28205g(this.f13593q, cardStart, 6);
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getRefreshCall() {
        return ((zy) f7l8.m6882h().qrj(zy.class)).m28205g(this.f13593q, 0, 6);
    }
}

package com.android.thememanager.recommend.presenter;

import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;
import retrofit2.toq;
import w831.InterfaceC7729k;
import z4.zy;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendSearchPresenter extends BasePresenter<InterfaceC7729k.toq> implements InterfaceC7729k.k {

    /* JADX INFO: renamed from: g */
    private String f13594g;

    /* JADX INFO: renamed from: n */
    private String f13595n;

    /* JADX INFO: renamed from: p */
    private int f13596p;

    /* JADX INFO: renamed from: q */
    private String f13597q;

    /* JADX INFO: renamed from: s */
    private int f13598s;

    /* JADX INFO: renamed from: y */
    private int f13599y;

    public RecommendSearchPresenter(String url, String searchKey, String orderType, int leftPrice, int rightPrice, int cardStart) {
        this.f13597q = url;
        this.f13595n = searchKey;
        this.f13594g = orderType;
        this.f13599y = leftPrice;
        this.f13598s = rightPrice;
        this.f13596p = cardStart;
    }

    public void d2ok(int rightPrice) {
        this.f13598s = rightPrice;
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return ((zy) f7l8.m6882h().qrj(zy.class)).toq(this.f13597q, this.f13595n, this.f13594g, this.f13599y, this.f13598s, cardStart);
    }

    @Override // w831.InterfaceC7729k.k
    public toq<CommonResponse<kja0>> getRefreshCall() {
        return ((zy) f7l8.m6882h().qrj(zy.class)).toq(this.f13597q, this.f13595n, this.f13594g, this.f13599y, this.f13598s, this.f13596p);
    }

    public void jk(int leftPrice) {
        this.f13599y = leftPrice;
    }

    public void lvui(String searchKey) {
        this.f13595n = searchKey;
    }

    public String mcp() {
        return this.f13595n;
    }

    public void oc(String mOrderType) {
        this.f13594g = mOrderType;
    }
}

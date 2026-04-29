package com.android.thememanager.recommend.presenter;

import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.toq;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.google.gson.kja0;
import w831.InterfaceC7729k;
import z4.zy;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendHomepagePresenter extends BasePresenter<InterfaceC7729k.toq> implements InterfaceC7729k.k {

    /* JADX INFO: renamed from: y */
    private static final int f13586y = 12;

    /* JADX INFO: renamed from: g */
    private int f13587g = toq.toq();

    /* JADX INFO: renamed from: n */
    private String f13588n;

    /* JADX INFO: renamed from: q */
    private String f13589q;

    public RecommendHomepagePresenter(String tabType, String subTabType) {
        this.f13589q = tabType;
        this.f13588n = subTabType;
    }

    @Override // w831.InterfaceC7729k.k
    public retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        zy zyVar = (zy) f7l8.m6882h().toq(zy.class);
        String str = z4.toq.f45964k.get(this.f13588n);
        return zyVar.m28206k(str, cardStart, InterfaceC1789q.fd23.equals(str) ? 12 : 1);
    }

    @Override // w831.InterfaceC7729k.k
    public retrofit2.toq<CommonResponse<kja0>> getRefreshCall() {
        this.f13587g = toq.toq();
        zy zyVar = (zy) f7l8.m6882h().toq(zy.class);
        String str = z4.toq.f45964k.get(this.f13588n);
        return "RINGTONE".equals(str) ? zyVar.zy(str, 0, Integer.MAX_VALUE, this.f13587g) : zyVar.m28206k(str, 0, InterfaceC1789q.fd23.equals(str) ? 12 : Integer.MAX_VALUE);
    }
}

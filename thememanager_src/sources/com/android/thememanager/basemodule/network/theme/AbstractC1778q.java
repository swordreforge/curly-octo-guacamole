package com.android.thememanager.basemodule.network.theme;

import com.android.thememanager.basemodule.network.theme.model.OrderResponse;
import com.android.thememanager.router.detail.entity.RewardData;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.q */
/* JADX INFO: compiled from: OrderCommonCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1778q<T> implements InterfaceC7648q<OrderResponse<T>> {
    /* JADX INFO: renamed from: k */
    public abstract void mo6891k(int httpCode, int errorCode, Exception e2);

    @Override // retrofit2.InterfaceC7648q
    public void onFailure(retrofit2.toq<OrderResponse<T>> call, Throwable t2) {
        mo6891k(0, -1, new Exception(t2));
    }

    @Override // retrofit2.InterfaceC7648q
    public void onResponse(retrofit2.toq<OrderResponse<T>> toqVar, C7639i<OrderResponse<T>> c7639i) {
        if (c7639i == null) {
            mo6891k(0, -1, new Exception("null response"));
            return;
        }
        if (!c7639i.f7l8()) {
            mo6891k(c7639i.toq(), -1, new Exception("response code is not success"));
            return;
        }
        if (c7639i.m27986k() == null) {
            mo6891k(c7639i.toq(), -1, new Exception("null response body"));
            return;
        }
        if (c7639i.m27986k().errcode != 200) {
            if (c7639i.m27986k().errcode != 1010) {
                mo6891k(c7639i.toq(), c7639i.m27986k().errcode, null);
                return;
            } else {
                ((RewardData) c7639i.m27986k().data).errCode = c7639i.m27986k().errcode;
            }
        }
        if (c7639i.m27986k().data == null) {
            mo6891k(c7639i.toq(), c7639i.m27986k().errcode, null);
        } else {
            toq(c7639i.m27986k().data);
        }
    }

    public abstract void toq(@lvui T response);
}

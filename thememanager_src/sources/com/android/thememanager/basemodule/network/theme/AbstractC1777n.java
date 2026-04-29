package com.android.thememanager.basemodule.network.theme;

import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import yz.C7794k;
import zy.InterfaceC7842s;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.n */
/* JADX INFO: compiled from: ThemeCommonCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1777n<T> implements InterfaceC7648q<CommonResponse<T>> {
    private static final String TAG = "ThemeCommonCallback";

    @Override // retrofit2.InterfaceC7648q
    public final void onFailure(retrofit2.toq<CommonResponse<T>> call, Throwable t2) {
        onFailure(0, -1, null, new Exception(t2));
    }

    public abstract void onResponse(@lvui T response);

    @Override // retrofit2.InterfaceC7648q
    public final void onResponse(retrofit2.toq<CommonResponse<T>> call, C7639i<CommonResponse<T>> response) {
        if (response == null) {
            onFailure(0, -1, null, new Exception("null response"));
            return;
        }
        if (!response.f7l8()) {
            onFailure(response.toq(), -1, null, new Exception("response code is not success"));
            return;
        }
        if (response.m27986k() == null) {
            onFailure(response.toq(), -1, null, new Exception("null response body"));
            return;
        }
        if (response.m27986k().apiCode != 0) {
            onFailure(response.toq(), response.m27986k().apiCode, response.m27986k().apiMessage, null);
            return;
        }
        if (response.m27986k().apiData != null) {
            onResponse(response.m27986k().apiData);
            return;
        }
        onFailure(response.toq(), response.m27986k().apiCode, "apiData=null,msg=" + response.m27986k().apiMessage, null);
    }

    @InterfaceC7842s
    public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
        C7794k.zy(TAG, "onFailure httpCode=" + httpCode + ",apiCode=" + apiCode + ",message=" + message, e2);
    }
}

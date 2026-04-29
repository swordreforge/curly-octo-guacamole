package com.android.thememanager.basemodule.network.theme;

import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.g */
/* JADX INFO: compiled from: ThemeEmptyCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1770g implements InterfaceC7648q<EmptyResponse> {

    /* JADX INFO: renamed from: g */
    private static final int f10076g = 1;

    /* JADX INFO: renamed from: k */
    private static final String f10077k = "ThemeEmptyCallback";

    /* JADX INFO: renamed from: n */
    private static final int f10078n = 0;

    /* JADX INFO: renamed from: q */
    private static final int f10079q = -1;

    /* JADX INFO: renamed from: k */
    protected void mo6885k(int httpCode, int apiCode, String apiMessage, Exception e2) {
        C7794k.zy(f10077k, "onFailure httpCode=" + httpCode + ",apiCode=" + apiCode + ",apiMessage=" + apiMessage, e2);
    }

    @Override // retrofit2.InterfaceC7648q
    public final void onFailure(retrofit2.toq<EmptyResponse> call, Throwable t2) {
        mo6885k(0, -1, null, new Exception(t2));
    }

    @Override // retrofit2.InterfaceC7648q
    public final void onResponse(retrofit2.toq<EmptyResponse> call, C7639i<EmptyResponse> response) {
        if (response == null) {
            mo6885k(0, -1, null, new Exception("null response"));
            return;
        }
        if (!response.f7l8()) {
            mo6885k(response.toq(), -1, null, new Exception("response code is not success"));
            return;
        }
        if (response.m27986k() == null) {
            mo6885k(response.toq(), -1, null, new Exception("null response body"));
        } else if (response.m27986k().apiCode != 0) {
            mo6885k(0, response.m27986k().apiCode, response.m27986k().apiMessage, null);
        } else {
            toq(call, response);
        }
    }

    protected void toq(retrofit2.toq<EmptyResponse> call, C7639i<EmptyResponse> response) {
    }
}

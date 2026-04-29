package com.market.sdk;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public class DesktopRecommendCallbackAdapter extends ResultReceiver {
    private static final String KEY_JSON = "json";

    /* JADX INFO: renamed from: k */
    private static final int f27934k = 0;

    /* JADX INFO: renamed from: q */
    private static final int f27935q = 1;
    private final f7l8 mAdaptee;

    /* JADX INFO: renamed from: com.market.sdk.DesktopRecommendCallbackAdapter$k */
    public static class C4941k implements f7l8 {

        /* JADX INFO: renamed from: k */
        private final ResultReceiver f27936k;

        public C4941k(ResultReceiver resultReceiver) {
            this.f27936k = resultReceiver;
        }

        @Override // com.market.sdk.f7l8
        public void onLoadFailed() {
            this.f27936k.send(1, null);
        }

        @Override // com.market.sdk.f7l8
        public void onLoadSuccess(DesktopRecommendInfo desktopRecommendInfo) {
            Bundle bundle = new Bundle(1);
            bundle.putString("json", desktopRecommendInfo.convertToJson());
            this.f27936k.send(0, bundle);
        }
    }

    public DesktopRecommendCallbackAdapter(f7l8 f7l8Var) {
        super(null);
        this.mAdaptee = f7l8Var;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i2, Bundle bundle) {
        super.onReceiveResult(i2, bundle);
        if (i2 == 0) {
            this.mAdaptee.onLoadSuccess(DesktopRecommendInfo.m17261k(bundle.getString("json")));
        } else {
            if (i2 != 1) {
                return;
            }
            this.mAdaptee.onLoadFailed();
        }
    }
}

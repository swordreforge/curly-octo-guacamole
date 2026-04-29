package com.market.sdk;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public class DesktopFolderConfigCallbackAdapter extends ResultReceiver {
    private static final String KEY_DATA = "key_data";

    /* JADX INFO: renamed from: k */
    private static final int f27931k = 1;

    /* JADX INFO: renamed from: q */
    private static final int f27932q = 2;
    private final InterfaceC4970h mAdaptee;

    /* JADX INFO: renamed from: com.market.sdk.DesktopFolderConfigCallbackAdapter$k */
    public static class C4940k implements InterfaceC4970h {

        /* JADX INFO: renamed from: k */
        private final ResultReceiver f27933k;

        public C4940k(ResultReceiver resultReceiver) {
            this.f27933k = resultReceiver;
        }

        @Override // com.market.sdk.InterfaceC4970h
        /* JADX INFO: renamed from: k */
        public void mo17260k(String str) {
            Bundle bundle = new Bundle(1);
            bundle.putString(DesktopFolderConfigCallbackAdapter.KEY_DATA, str);
            this.f27933k.send(1, bundle);
        }

        @Override // com.market.sdk.InterfaceC4970h
        public void toq(String str) {
            Bundle bundle = new Bundle(1);
            bundle.putString(DesktopFolderConfigCallbackAdapter.KEY_DATA, str);
            this.f27933k.send(2, bundle);
        }
    }

    public DesktopFolderConfigCallbackAdapter(InterfaceC4970h interfaceC4970h) {
        super(null);
        this.mAdaptee = interfaceC4970h;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            this.mAdaptee.mo17260k(bundle.getString(KEY_DATA));
        } else {
            if (i2 != 2) {
                return;
            }
            this.mAdaptee.toq(bundle.getString(KEY_DATA));
        }
    }
}

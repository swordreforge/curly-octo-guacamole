package com.market.pm.api;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public class MarketInstallObserver extends ResultReceiver implements toq {
    private static final String KEY_PACKAGE_NAME = "packageName";
    private static final String KEY_RETURN_CODE = "returnCode";

    /* JADX INFO: renamed from: k */
    private static final int f27880k = 0;

    /* JADX INFO: renamed from: n */
    private static final int f27881n = 2;

    /* JADX INFO: renamed from: q */
    private static final int f27882q = 1;
    private final InterfaceC4935n mListener;

    /* JADX INFO: renamed from: com.market.pm.api.MarketInstallObserver$k */
    public static class C4932k implements InterfaceC4935n {

        /* JADX INFO: renamed from: k */
        private final ResultReceiver f27883k;

        public C4932k(ResultReceiver resultReceiver) {
            this.f27883k = resultReceiver;
        }

        @Override // com.market.pm.api.InterfaceC4935n
        /* JADX INFO: renamed from: k */
        public void mo17250k(String str, int i2) {
            this.f27883k.send(0, MarketInstallObserver.m17248p(str, i2));
        }

        @Override // com.market.pm.api.InterfaceC4935n
        public void toq() {
            this.f27883k.send(2, null);
        }

        @Override // com.market.pm.api.InterfaceC4935n
        public void zy(String str, int i2) {
            this.f27883k.send(1, MarketInstallObserver.m17248p(str, i2));
        }
    }

    public MarketInstallObserver(InterfaceC4935n interfaceC4935n) {
        super(null);
        this.mListener = interfaceC4935n;
    }

    private static int f7l8(Bundle bundle) {
        return bundle.getInt(KEY_RETURN_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static Bundle m17248p(String str, int i2) {
        Bundle bundle = new Bundle(2);
        bundle.putString("packageName", str);
        bundle.putInt(KEY_RETURN_CODE, i2);
        return bundle;
    }

    /* JADX INFO: renamed from: y */
    private static String m17249y(Bundle bundle) {
        return bundle.getString("packageName");
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i2, Bundle bundle) {
        super.onReceiveResult(i2, bundle);
        InterfaceC4935n interfaceC4935n = this.mListener;
        if (interfaceC4935n != null) {
            if (i2 == 0) {
                interfaceC4935n.mo17250k(m17249y(bundle), f7l8(bundle));
            } else if (i2 == 1) {
                interfaceC4935n.zy(m17249y(bundle), f7l8(bundle));
            } else {
                if (i2 != 2) {
                    return;
                }
                interfaceC4935n.toq();
            }
        }
    }
}

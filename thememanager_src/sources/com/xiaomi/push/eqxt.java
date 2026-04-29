package com.xiaomi.push;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes3.dex */
class eqxt extends ConnectivityManager.NetworkCallback {
    eqxt() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        oc.fn3e();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        oc.fn3e();
    }
}

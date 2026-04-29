package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
class d2ok implements Callable<lvui> {
    d2ok() {
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public lvui call() {
        NetworkInfo activeNetworkInfo;
        Context qVar = wu.toq();
        if (qVar == null) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) qVar.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return null;
            }
            return new lvui(activeNetworkInfo);
        } catch (Exception unused) {
            return null;
        }
    }
}

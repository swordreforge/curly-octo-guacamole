package com.market.sdk;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.market.sdk.p */
/* JADX INFO: compiled from: DirectMailManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4983p {

    /* JADX INFO: renamed from: k */
    private static final String f28111k = "DirectMailManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile C4983p f68917toq;

    /* JADX INFO: renamed from: k */
    public static C4983p m17340k() {
        if (f68917toq == null) {
            synchronized (C4983p.class) {
                if (f68917toq == null) {
                    f68917toq = new C4983p();
                }
            }
        }
        return f68917toq;
    }

    public void toq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            PreloadAppDetailService.openService().preloadAppDetail(str);
        } catch (Exception e2) {
            Log.e(f28111k, e2.toString());
        }
    }
}

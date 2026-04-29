package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.nn86;
import com.xiaomi.push.C5892r;

/* JADX INFO: loaded from: classes3.dex */
public class a9 {
    /* JADX INFO: renamed from: k */
    public static InterfaceC5654k m19382k(Context context, hyr hyrVar) {
        return toq(context, hyrVar);
    }

    private static InterfaceC5654k toq(Context context, hyr hyrVar) {
        nn86.C5659k qVar = nn86.toq(hyrVar);
        if (qVar == null || TextUtils.isEmpty(qVar.f31420k) || TextUtils.isEmpty(qVar.f73192toq)) {
            return null;
        }
        return (InterfaceC5654k) C5892r.f7l8(qVar.f31420k, qVar.f73192toq, context);
    }
}

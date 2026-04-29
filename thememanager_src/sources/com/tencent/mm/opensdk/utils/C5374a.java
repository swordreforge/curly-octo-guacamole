package com.tencent.mm.opensdk.utils;

import android.os.Bundle;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5374a {
    /* JADX INFO: renamed from: a */
    public static int m18257a(Bundle bundle, String str) {
        if (bundle == null) {
            return -1;
        }
        try {
            return bundle.getInt(str, -1);
        } catch (Exception e2) {
            Log.m18253e("MicroMsg.IntentUtil", "getIntExtra exception:" + e2.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m18258b(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e2) {
            Log.m18253e("MicroMsg.IntentUtil", "getStringExtra exception:" + e2.getMessage());
            return null;
        }
    }
}

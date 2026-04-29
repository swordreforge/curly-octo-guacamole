package com.tencent.mm.opensdk.diffdev;

import com.tencent.mm.opensdk.diffdev.p008a.C5364a;
import com.tencent.mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes3.dex */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    private static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    private static IDiffDevOAuth v1Instance;

    private DiffDevOAuthFactory() {
    }

    public static IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }

    public static IDiffDevOAuth getDiffDevOAuth(int i2) {
        Log.m18255v(TAG, "getDiffDevOAuth, version = " + i2);
        if (i2 > 1) {
            Log.m18253e(TAG, "getDiffDevOAuth fail, unsupported version = " + i2);
            return null;
        }
        if (i2 != 1) {
            return null;
        }
        if (v1Instance == null) {
            v1Instance = new C5364a();
        }
        return v1Instance;
    }
}

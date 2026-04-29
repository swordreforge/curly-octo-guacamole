package com.market.sdk;

import com.market.sdk.utils.C5013p;

/* JADX INFO: loaded from: classes3.dex */
public class Patcher {

    /* JADX INFO: renamed from: k */
    private static final String f28017k = "MarketPatcher";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f68862toq = "sdk_patcher_jni";

    /* JADX INFO: renamed from: k */
    public static int m17282k(String str, String str2, String str3) {
        return new Patcher().applyPatch(str, str2, str3);
    }

    public static boolean toq() {
        try {
            System.loadLibrary(f68862toq);
            return true;
        } catch (Throwable th) {
            C5013p.m17465q(f28017k, "load patcher library failed : " + th.toString());
            return false;
        }
    }

    public native int applyPatch(String str, String str2, String str3);
}

package com.xiaomi.mipush.sdk;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.r */
/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class C5663r {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ int[] f31426k;

    static {
        int[] iArr = new int[dd.values().length];
        f31426k = iArr;
        try {
            iArr[dd.DISABLE_PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31426k[dd.ENABLE_PUSH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f31426k[dd.UPLOAD_HUAWEI_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f31426k[dd.UPLOAD_FCM_TOKEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f31426k[dd.UPLOAD_COS_TOKEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f31426k[dd.UPLOAD_FTOS_TOKEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

package com.xiaomi.mipush.sdk;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.e */
/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class C5647e {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ int[] f31343k;

    static {
        int[] iArr = new int[hyr.values().length];
        f31343k = iArr;
        try {
            iArr[hyr.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31343k[hyr.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f31343k[hyr.ASSEMBLE_PUSH_COS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f31343k[hyr.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

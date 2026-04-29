package com.xiaomi.push.service;

import com.xiaomi.push.le7;
import com.xiaomi.push.mub;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class jp0y {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ int[] f33821k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final /* synthetic */ int[] f73625toq;

    static {
        int[] iArr = new int[mub.values().length];
        f73625toq = iArr;
        try {
            iArr[mub.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f73625toq[mub.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f73625toq[mub.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f73625toq[mub.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[le7.values().length];
        f33821k = iArr2;
        try {
            iArr2[le7.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33821k[le7.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

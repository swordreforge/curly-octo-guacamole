package com.xiaomi.mipush.sdk;

import com.xiaomi.push.wwp;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class gvn7 {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ int[] f31362k;

    static {
        int[] iArr = new int[wwp.values().length];
        f31362k = iArr;
        try {
            iArr[wwp.SendMessage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31362k[wwp.Registration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f31362k[wwp.UnRegistration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f31362k[wwp.Subscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f31362k[wwp.UnSubscription.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f31362k[wwp.Command.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f31362k[wwp.Notification.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}

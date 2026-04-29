package com.xiaomi.push.service;

import com.xiaomi.push.wwp;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class a98o {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ int[] f33718k;

    static {
        int[] iArr = new int[wwp.values().length];
        f33718k = iArr;
        try {
            iArr[wwp.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33718k[wwp.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33718k[wwp.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33718k[wwp.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33718k[wwp.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33718k[wwp.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f33718k[wwp.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f33718k[wwp.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f33718k[wwp.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f33718k[wwp.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}

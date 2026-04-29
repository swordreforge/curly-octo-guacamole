package com.xiaomi.push;

import android.os.Looper;

/* JADX INFO: renamed from: com.xiaomi.push.h */
/* JADX INFO: loaded from: classes3.dex */
public class C5866h {
    /* JADX INFO: renamed from: k */
    public static void m20945k() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException("can't do this on ui thread");
        }
    }
}

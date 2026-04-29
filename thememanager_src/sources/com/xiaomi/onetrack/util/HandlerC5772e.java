package com.xiaomi.onetrack.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.e */
/* JADX INFO: loaded from: classes3.dex */
class HandlerC5772e extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5771d f32303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC5772e(C5771d c5771d, Looper looper) {
        super(looper);
        this.f32303a = c5771d;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 100) {
            return;
        }
        this.f32303a.m20255c(message.getData().getString("hint"));
    }
}

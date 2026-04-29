package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.qrj;

/* JADX INFO: loaded from: classes3.dex */
class n7h extends Handler {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ qrj f33437k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n7h(qrj qrjVar, Looper looper) {
        super(looper);
        this.f33437k = qrjVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        qrj.toq toqVar = (qrj.toq) message.obj;
        int i2 = message.what;
        if (i2 == 0) {
            toqVar.m21408k();
        } else if (i2 == 1) {
            toqVar.zy();
        }
        super.handleMessage(message);
    }
}

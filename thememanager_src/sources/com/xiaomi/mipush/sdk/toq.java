package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class toq extends Service {

    /* JADX INFO: renamed from: a */
    private HandlerC5666k f31428a;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.toq$k */
    public static class HandlerC5666k extends Handler {

        /* JADX INFO: renamed from: k */
        private WeakReference<toq> f31429k;

        public HandlerC5666k(WeakReference<toq> weakReference) {
            this.f31429k = weakReference;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<toq> weakReference;
            toq toqVar;
            if (message.what != 1001 || (weakReference = this.f31429k) == null || (toqVar = weakReference.get()) == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19300t("TimeoutHandler " + toqVar.toString() + " kill self");
            if (!toqVar.mo19360a()) {
                toqVar.stopSelf();
            } else {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000L);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m19556k() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000L);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo19360a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        super.onStart(intent, i2);
        if (this.f31428a == null) {
            this.f31428a = new HandlerC5666k(new WeakReference(this));
        }
        this.f31428a.m19556k();
    }
}

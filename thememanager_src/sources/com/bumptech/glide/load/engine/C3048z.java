package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.z */
/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes2.dex */
class C3048z {

    /* JADX INFO: renamed from: k */
    private boolean f18531k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Handler f62823toq = new Handler(Looper.getMainLooper(), new k());

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.z$k */
    /* JADX INFO: compiled from: ResourceRecycler.java */
    private static final class k implements Handler.Callback {

        /* JADX INFO: renamed from: k */
        static final int f18532k = 1;

        k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((zurt) message.obj).toq();
            return true;
        }
    }

    C3048z() {
    }

    /* JADX INFO: renamed from: k */
    synchronized void m10837k(zurt<?> zurtVar, boolean z2) {
        if (this.f18531k || z2) {
            this.f62823toq.obtainMessage(1, zurtVar).sendToTarget();
        } else {
            this.f18531k = true;
            zurtVar.toq();
            this.f18531k = false;
        }
    }
}

package miuix.graphics.gif;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import miuix.graphics.gif.toq;
import miuix.io.C7184k;

/* JADX INFO: renamed from: miuix.graphics.gif.k */
/* JADX INFO: compiled from: DecodeGifImageHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class HandlerC7108k extends Handler {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f87462f7l8 = 1;

    /* JADX INFO: renamed from: g */
    protected static final String f40006g = "DecodeGifFrames";

    /* JADX INFO: renamed from: k */
    private Handler f40007k;

    /* JADX INFO: renamed from: n */
    HandlerThread f40008n;

    /* JADX INFO: renamed from: q */
    toq.C8104toq f40009q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C7184k f87463toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f87464zy;

    public HandlerC7108k(HandlerThread handlerThread, C7184k c7184k, long j2, Handler handler) {
        super(handlerThread.getLooper());
        this.f40008n = handlerThread;
        this.f87464zy = j2;
        this.f87463toq = c7184k;
        this.f40007k = handler;
    }

    /* JADX INFO: renamed from: k */
    public static HandlerC7108k m25723k(C7184k c7184k, long j2, Handler handler) {
        HandlerThread handlerThread = new HandlerThread("handler thread to decode GIF frames");
        handlerThread.start();
        return new HandlerC7108k(handlerThread, c7184k, j2, handler);
    }

    protected void finalize() throws Throwable {
        this.f40008n.quit();
        super.finalize();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            toq.C8104toq c8104toqZy = toq.zy(this.f87463toq, this.f87464zy, message.arg1);
            toq.C8104toq c8104toq = this.f40009q;
            c8104toq.f40017k = c8104toqZy.f40017k;
            c8104toq.f87468toq = c8104toqZy.f87468toq;
            this.f40007k.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: q */
    public toq.C8104toq m25724q() {
        toq.C8104toq c8104toq = this.f40009q;
        this.f40009q = null;
        return c8104toq;
    }

    public void toq(int i2) {
        if (this.f40009q != null) {
            return;
        }
        this.f40009q = new toq.C8104toq();
        sendMessage(obtainMessage(1, i2, 0));
    }

    public void zy() {
        this.f40008n.quit();
    }
}

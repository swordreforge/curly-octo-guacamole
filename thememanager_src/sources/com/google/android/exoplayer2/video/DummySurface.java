package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.C3844k;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes2.dex */
@hyr(17)
public final class DummySurface extends Surface {
    private static final String TAG = "DummySurface";

    /* JADX INFO: renamed from: g */
    private static boolean f23364g;

    /* JADX INFO: renamed from: n */
    private static int f23365n;

    /* JADX INFO: renamed from: k */
    public final boolean f23366k;

    /* JADX INFO: renamed from: q */
    private boolean f23367q;
    private final toq thread;

    private static class toq extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: p */
        private static final int f23368p = 2;

        /* JADX INFO: renamed from: s */
        private static final int f23369s = 1;

        /* JADX INFO: renamed from: g */
        @dd
        private RuntimeException f23370g;

        /* JADX INFO: renamed from: k */
        private com.google.android.exoplayer2.util.x2 f23371k;

        /* JADX INFO: renamed from: n */
        @dd
        private Error f23372n;

        /* JADX INFO: renamed from: q */
        private Handler f23373q;

        /* JADX INFO: renamed from: y */
        @dd
        private DummySurface f23374y;

        public toq() {
            super("ExoPlayer:DummySurface");
        }

        /* JADX INFO: renamed from: q */
        private void m13785q() {
            C3844k.f7l8(this.f23371k);
            this.f23371k.m13757s();
        }

        private void toq(int i2) {
            C3844k.f7l8(this.f23371k);
            this.f23371k.m13758y(i2);
            this.f23374y = new DummySurface(this, this.f23371k.f7l8(), i2 != 0);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        m13785q();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    toq(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    com.google.android.exoplayer2.util.ni7.m13700n(DummySurface.TAG, "Failed to initialize dummy surface", e2);
                    this.f23372n = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    com.google.android.exoplayer2.util.ni7.m13700n(DummySurface.TAG, "Failed to initialize dummy surface", e3);
                    this.f23370g = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public DummySurface m13786k(int i2) {
            boolean z2;
            start();
            this.f23373q = new Handler(getLooper(), this);
            this.f23371k = new com.google.android.exoplayer2.util.x2(this.f23373q);
            synchronized (this) {
                z2 = false;
                this.f23373q.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f23374y == null && this.f23370g == null && this.f23372n == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f23370g;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f23372n;
            if (error == null) {
                return (DummySurface) C3844k.f7l8(this.f23374y);
            }
            throw error;
        }

        public void zy() {
            C3844k.f7l8(this.f23373q);
            this.f23373q.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m13784k(Context context) {
        if (com.google.android.exoplayer2.util.cdj.kja0(context)) {
            return com.google.android.exoplayer2.util.cdj.m13544h() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean toq(Context context) {
        if (!f23364g) {
            f23365n = m13784k(context);
            f23364g = true;
        }
        return f23365n != 0;
    }

    public static DummySurface zy(Context context, boolean z2) {
        C3844k.m13633s(!z2 || toq(context));
        return new toq().m13786k(z2 ? f23365n : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.f23367q) {
                this.thread.zy();
                this.f23367q = true;
            }
        }
    }

    private DummySurface(toq toqVar, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.thread = toqVar;
        this.f23366k = z2;
    }
}

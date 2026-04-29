package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.decoder.C3293n;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3862y;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import zy.dd;
import zy.hyr;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.n */
/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(23)
class C3462n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64939f7l8 = 0;

    /* JADX INFO: renamed from: s */
    private static final int f20676s = 2;

    /* JADX INFO: renamed from: y */
    private static final int f20677y = 1;

    /* JADX INFO: renamed from: g */
    private boolean f20678g;

    /* JADX INFO: renamed from: k */
    private final MediaCodec f20679k;

    /* JADX INFO: renamed from: n */
    private final C3862y f20680n;

    /* JADX INFO: renamed from: q */
    private final AtomicReference<RuntimeException> f20681q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HandlerThread f64941toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Handler f64942zy;

    /* JADX INFO: renamed from: p */
    @zy.o1t("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<toq> f20675p = new ArrayDeque<>();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final Object f64940ld6 = new Object();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.n$k */
    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    class k extends Handler {
        k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C3462n.this.m12218g(message);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.n$toq */
    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    private static class toq {

        /* JADX INFO: renamed from: g */
        public int f20683g;

        /* JADX INFO: renamed from: k */
        public int f20684k;

        /* JADX INFO: renamed from: n */
        public long f20685n;

        /* JADX INFO: renamed from: q */
        public final MediaCodec.CryptoInfo f20686q = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f64943toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f64944zy;

        toq() {
        }

        /* JADX INFO: renamed from: k */
        public void m12226k(int i2, int i3, int i4, long j2, int i5) {
            this.f20684k = i2;
            this.f64943toq = i3;
            this.f64944zy = i4;
            this.f20685n = j2;
            this.f20683g = i5;
        }
    }

    public C3462n(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C3862y());
    }

    private void f7l8(int i2, int i3, int i4, long j2, int i5) {
        try {
            this.f20679k.queueInputBuffer(i2, i3, i4, j2, i5);
        } catch (RuntimeException e2) {
            androidx.lifecycle.zurt.m4493k(this.f20681q, null, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m12218g(Message message) {
        int i2 = message.what;
        toq toqVar = null;
        if (i2 == 0) {
            toqVar = (toq) message.obj;
            f7l8(toqVar.f20684k, toqVar.f64943toq, toqVar.f64944zy, toqVar.f20685n, toqVar.f20683g);
        } else if (i2 == 1) {
            toqVar = (toq) message.obj;
            m12223y(toqVar.f20684k, toqVar.f64943toq, toqVar.f20686q, toqVar.f20685n, toqVar.f20683g);
        } else if (i2 != 2) {
            androidx.lifecycle.zurt.m4493k(this.f20681q, null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f20680n.m13762g();
        }
        if (toqVar != null) {
            kja0(toqVar);
        }
    }

    private static void kja0(toq toqVar) {
        ArrayDeque<toq> arrayDeque = f20675p;
        synchronized (arrayDeque) {
            arrayDeque.add(toqVar);
        }
    }

    private static toq ld6() {
        ArrayDeque<toq> arrayDeque = f20675p;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new toq();
            }
            return arrayDeque.removeFirst();
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static int[] m12220n(@dd int[] iArr, @dd int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: renamed from: p */
    private void m12221p() throws InterruptedException {
        ((Handler) C3844k.f7l8(this.f64942zy)).removeCallbacksAndMessages(null);
        toq();
    }

    @dd
    /* JADX INFO: renamed from: q */
    private static byte[] m12222q(@dd byte[] bArr, @dd byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void toq() throws InterruptedException {
        this.f20680n.m13765q();
        ((Handler) C3844k.f7l8(this.f64942zy)).obtainMessage(2).sendToTarget();
        this.f20680n.m13763k();
    }

    private void x2() {
        RuntimeException andSet = this.f20681q.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m12223y(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j2, int i4) {
        try {
            synchronized (f64940ld6) {
                this.f20679k.queueSecureInputBuffer(i2, i3, cryptoInfo, j2, i4);
            }
        } catch (RuntimeException e2) {
            androidx.lifecycle.zurt.m4493k(this.f20681q, null, e2);
        }
    }

    private static void zy(C3293n c3293n, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c3293n.f19589g;
        cryptoInfo.numBytesOfClearData = m12220n(c3293n.f19593q, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m12220n(c3293n.f19591n, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C3844k.f7l8(m12222q(c3293n.f63572toq, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C3844k.f7l8(m12222q(c3293n.f19590k, cryptoInfo.iv));
        cryptoInfo.mode = c3293n.f63573zy;
        if (lrht.f23230k >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c3293n.f63571f7l8, c3293n.f19595y));
        }
    }

    public void cdj() {
        if (this.f20678g) {
            m12225s();
            this.f64941toq.quit();
        }
        this.f20678g = false;
    }

    @yz(otherwise = 5)
    /* JADX INFO: renamed from: h */
    void m12224h(RuntimeException runtimeException) {
        this.f20681q.set(runtimeException);
    }

    public void ki() {
        if (this.f20678g) {
            return;
        }
        this.f64941toq.start();
        this.f64942zy = new k(this.f64941toq.getLooper());
        this.f20678g = true;
    }

    public void n7h(int i2, int i3, C3293n c3293n, long j2, int i4) {
        x2();
        toq toqVarLd6 = ld6();
        toqVarLd6.m12226k(i2, i3, 0, j2, i4);
        zy(c3293n, toqVarLd6.f20686q);
        ((Handler) lrht.ld6(this.f64942zy)).obtainMessage(1, toqVarLd6).sendToTarget();
    }

    public void qrj(int i2, int i3, int i4, long j2, int i5) {
        x2();
        toq toqVarLd6 = ld6();
        toqVarLd6.m12226k(i2, i3, i4, j2, i5);
        ((Handler) lrht.ld6(this.f64942zy)).obtainMessage(0, toqVarLd6).sendToTarget();
    }

    /* JADX INFO: renamed from: s */
    public void m12225s() {
        if (this.f20678g) {
            try {
                m12221p();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public void t8r() throws InterruptedException {
        toq();
    }

    @yz
    C3462n(MediaCodec mediaCodec, HandlerThread handlerThread, C3862y c3862y) {
        this.f20679k = mediaCodec;
        this.f64941toq = handlerThread;
        this.f20680n = c3862y;
        this.f20681q = new AtomicReference<>();
    }
}

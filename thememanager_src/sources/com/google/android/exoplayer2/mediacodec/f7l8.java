package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.thememanager.util.yz;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayDeque;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: AsynchronousMediaCodecCallback.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(23)
final class f7l8 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.o1t(yz.xk5)
    private long f64929ld6;

    /* JADX INFO: renamed from: p */
    @zy.o1t(yz.xk5)
    @dd
    private MediaCodec.CodecException f20647p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @zy.o1t(yz.xk5)
    @dd
    private IllegalStateException f64930qrj;

    /* JADX INFO: renamed from: s */
    @zy.o1t(yz.xk5)
    @dd
    private MediaFormat f20649s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HandlerThread f64931toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.o1t(yz.xk5)
    private boolean f64932x2;

    /* JADX INFO: renamed from: y */
    @zy.o1t(yz.xk5)
    @dd
    private MediaFormat f20650y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Handler f64933zy;

    /* JADX INFO: renamed from: k */
    private final Object f20645k = new Object();

    /* JADX INFO: renamed from: q */
    @zy.o1t(yz.xk5)
    private final ld6 f20648q = new ld6();

    /* JADX INFO: renamed from: n */
    @zy.o1t(yz.xk5)
    private final ld6 f20646n = new ld6();

    /* JADX INFO: renamed from: g */
    @zy.o1t(yz.xk5)
    private final ArrayDeque<MediaCodec.BufferInfo> f20644g = new ArrayDeque<>();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.o1t(yz.xk5)
    private final ArrayDeque<MediaFormat> f64928f7l8 = new ArrayDeque<>();

    f7l8(HandlerThread handlerThread) {
        this.f64931toq = handlerThread;
    }

    @zy.o1t(yz.xk5)
    /* JADX INFO: renamed from: g */
    private void m12190g() {
        if (!this.f64928f7l8.isEmpty()) {
            this.f20649s = this.f64928f7l8.getLast();
        }
        this.f20648q.zy();
        this.f20646n.zy();
        this.f20644g.clear();
        this.f64928f7l8.clear();
        this.f20647p = null;
    }

    private void kja0(IllegalStateException illegalStateException) {
        synchronized (this.f20645k) {
            this.f64930qrj = illegalStateException;
        }
    }

    @zy.o1t(yz.xk5)
    private void ld6() {
        x2();
        qrj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public void m12192p(@dd MediaCodec mediaCodec) {
        synchronized (this.f20645k) {
            if (this.f64932x2) {
                return;
            }
            long j2 = this.f64929ld6 - 1;
            this.f64929ld6 = j2;
            if (j2 > 0) {
                return;
            }
            if (j2 < 0) {
                kja0(new IllegalStateException());
                return;
            }
            m12190g();
            if (mediaCodec != null) {
                try {
                    mediaCodec.start();
                } catch (IllegalStateException e2) {
                    kja0(e2);
                } catch (Exception e3) {
                    kja0(new IllegalStateException(e3));
                }
            }
        }
    }

    @zy.o1t(yz.xk5)
    private void qrj() {
        MediaCodec.CodecException codecException = this.f20647p;
        if (codecException == null) {
            return;
        }
        this.f20647p = null;
        throw codecException;
    }

    @zy.o1t(yz.xk5)
    /* JADX INFO: renamed from: s */
    private boolean m12193s() {
        return this.f64929ld6 > 0 || this.f64932x2;
    }

    @zy.o1t(yz.xk5)
    private void toq(MediaFormat mediaFormat) {
        this.f20646n.m12216k(-2);
        this.f64928f7l8.add(mediaFormat);
    }

    @zy.o1t(yz.xk5)
    private void x2() {
        IllegalStateException illegalStateException = this.f64930qrj;
        if (illegalStateException == null) {
            return;
        }
        this.f64930qrj = null;
        throw illegalStateException;
    }

    public MediaFormat f7l8() {
        MediaFormat mediaFormat;
        synchronized (this.f20645k) {
            mediaFormat = this.f20650y;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: h */
    public void m12194h() {
        synchronized (this.f20645k) {
            this.f64932x2 = true;
            this.f64931toq.quit();
            m12190g();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m12195n(@dd final MediaCodec mediaCodec) {
        synchronized (this.f20645k) {
            this.f64929ld6++;
            ((Handler) lrht.ld6(this.f64933zy)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20651k.m12192p(mediaCodec);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f20645k) {
            this.f20647p = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f20645k) {
            this.f20648q.m12216k(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f20645k) {
            MediaFormat mediaFormat = this.f20649s;
            if (mediaFormat != null) {
                toq(mediaFormat);
                this.f20649s = null;
            }
            this.f20646n.m12216k(i2);
            this.f20644g.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f20645k) {
            toq(mediaFormat);
            this.f20649s = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public int m12196q(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f20645k) {
            if (m12193s()) {
                return -1;
            }
            ld6();
            if (this.f20646n.m12217n()) {
                return -1;
            }
            int iM12215g = this.f20646n.m12215g();
            if (iM12215g >= 0) {
                C3844k.ld6(this.f20650y);
                MediaCodec.BufferInfo bufferInfoRemove = this.f20644g.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iM12215g == -2) {
                this.f20650y = this.f64928f7l8.remove();
            }
            return iM12215g;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m12197y(MediaCodec mediaCodec) {
        C3844k.m13633s(this.f64933zy == null);
        this.f64931toq.start();
        Handler handler = new Handler(this.f64931toq.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f64933zy = handler;
    }

    public int zy() {
        synchronized (this.f20645k) {
            int iM12215g = -1;
            if (m12193s()) {
                return -1;
            }
            ld6();
            if (!this.f20648q.m12217n()) {
                iM12215g = this.f20648q.m12215g();
            }
            return iM12215g;
        }
    }
}

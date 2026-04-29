package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.C3293n;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.n5r1;
import java.io.IOException;
import java.nio.ByteBuffer;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.t */
/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3470t implements x2 {

    /* JADX INFO: renamed from: k */
    private final MediaCodec f20711k;

    /* JADX INFO: renamed from: q */
    @dd
    private ByteBuffer[] f20712q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final Surface f64963toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private ByteBuffer[] f64964zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.t$toq */
    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    @hyr(18)
    private static final class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static Surface m12269k(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }

        @InterfaceC7830i
        public static void toq(MediaCodec mediaCodec) {
            mediaCodec.signalEndOfInputStream();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.t$zy */
    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static class zy implements x2.toq {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.t$k] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.google.android.exoplayer2.mediacodec.x2.toq
        /* JADX INFO: renamed from: k */
        public x2 mo12255k(x2.C3472k c3472k) throws Throwable {
            MediaCodec qVar;
            Surface surfaceM12269k;
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
                qVar = toq(c3472k);
                try {
                    n5r1.m13686k("configureCodec");
                    qVar.configure(c3472k.f64973toq, c3472k.f20726q, c3472k.f20725n, c3472k.f20723g);
                    n5r1.zy();
                    if (!c3472k.f64972f7l8) {
                        surfaceM12269k = null;
                    } else {
                        if (lrht.f23230k < 18) {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                        surfaceM12269k = toq.m12269k(qVar);
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
                try {
                    n5r1.m13686k("startCodec");
                    qVar.start();
                    n5r1.zy();
                    return new C3470t(qVar, surfaceM12269k);
                } catch (IOException | RuntimeException e4) {
                    r0 = surfaceM12269k;
                    e = e4;
                    if (r0 != 0) {
                        r0.release();
                    }
                    if (qVar != null) {
                        qVar.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e6) {
                e = e6;
                qVar = null;
            }
        }

        protected MediaCodec toq(x2.C3472k c3472k) throws IOException {
            C3844k.f7l8(c3472k.f20724k);
            String str = c3472k.f20724k.f20688k;
            String strValueOf = String.valueOf(str);
            n5r1.m13686k(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            n5r1.zy();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ki(x2.zy zyVar, MediaCodec mediaCodec, long j2, long j3) {
        zyVar.mo12279k(this, j2, j3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void f7l8(int i2, int i3, int i4, long j2, int i5) {
        this.f20711k.queueInputBuffer(i2, i3, i4, j2, i5);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void flush() {
        this.f20711k.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: g */
    public void mo12261g(int i2) {
        this.f20711k.setVideoScalingMode(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @dd
    /* JADX INFO: renamed from: h */
    public ByteBuffer mo12262h(int i2) {
        return lrht.f23230k >= 21 ? this.f20711k.getOutputBuffer(i2) : ((ByteBuffer[]) lrht.ld6(this.f20712q))[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: k */
    public void mo12263k(int i2, int i3, C3293n c3293n, long j2, int i4) {
        this.f20711k.queueSecureInputBuffer(i2, i3, c3293n.m11569k(), j2, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void kja0(int i2, boolean z2) {
        this.f20711k.releaseOutputBuffer(i2, z2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @hyr(18)
    public void ld6() {
        toq.toq(this.f20711k);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @hyr(23)
    /* JADX INFO: renamed from: n */
    public void mo12264n(Surface surface) {
        this.f20711k.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public int n7h(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f20711k.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && lrht.f23230k < 21) {
                this.f20712q = this.f20711k.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @hyr(19)
    /* JADX INFO: renamed from: p */
    public void mo12265p(Bundle bundle) {
        this.f20711k.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @dd
    /* JADX INFO: renamed from: q */
    public ByteBuffer mo12266q(int i2) {
        return lrht.f23230k >= 21 ? this.f20711k.getInputBuffer(i2) : ((ByteBuffer[]) lrht.ld6(this.f64964zy))[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public int qrj() {
        return this.f20711k.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void release() {
        this.f64964zy = null;
        this.f20712q = null;
        Surface surface = this.f64963toq;
        if (surface != null) {
            surface.release();
        }
        this.f20711k.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: s */
    public boolean mo12267s() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public MediaFormat toq() {
        return this.f20711k.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @hyr(21)
    public void x2(int i2, long j2) {
        this.f20711k.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @dd
    /* JADX INFO: renamed from: y */
    public Surface mo12268y() {
        return this.f64963toq;
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @hyr(23)
    public void zy(final x2.zy zyVar, Handler handler) {
        this.f20711k.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.wvg
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                this.f20722k.ki(zyVar, mediaCodec, j2, j3);
            }
        }, handler);
    }

    private C3470t(MediaCodec mediaCodec, @dd Surface surface) {
        this.f20711k = mediaCodec;
        this.f64963toq = surface;
        if (lrht.f23230k < 21) {
            this.f64964zy = mediaCodec.getInputBuffers();
            this.f20712q = mediaCodec.getOutputBuffers();
        }
    }
}

package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.C3293n;
import com.google.android.exoplayer2.mediacodec.toq;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.util.n5r1;
import com.google.common.base.lvui;
import com.miui.maml.elements.video.VideoElement;
import java.nio.ByteBuffer;
import zy.dd;
import zy.hyr;
import zy.yz;

/* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(23)
final class toq implements x2 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f64965ld6 = 2;

    /* JADX INFO: renamed from: p */
    private static final int f20713p = 1;

    /* JADX INFO: renamed from: s */
    private static final int f20714s = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f64966f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f20715g;

    /* JADX INFO: renamed from: k */
    private final MediaCodec f20716k;

    /* JADX INFO: renamed from: n */
    private final boolean f20717n;

    /* JADX INFO: renamed from: q */
    private final boolean f20718q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final f7l8 f64967toq;

    /* JADX INFO: renamed from: y */
    @dd
    private Surface f20719y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C3462n f64968zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
    public static final class C7956toq implements x2.toq {

        /* JADX INFO: renamed from: n */
        private final boolean f20720n;

        /* JADX INFO: renamed from: q */
        private final boolean f20721q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final lvui<HandlerThread> f64969toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final lvui<HandlerThread> f64970zy;

        public C7956toq(final int i2, boolean z2, boolean z3) {
            this(new lvui() { // from class: com.google.android.exoplayer2.mediacodec.zy
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return toq.C7956toq.m12275n(i2);
                }
            }, new lvui() { // from class: com.google.android.exoplayer2.mediacodec.q
                @Override // com.google.common.base.lvui
                public final Object get() {
                    return toq.C7956toq.m12274g(i2);
                }
            }, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ HandlerThread m12274g(int i2) {
            return new HandlerThread(toq.zurt(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ HandlerThread m12275n(int i2) {
            return new HandlerThread(toq.fn3e(i2));
        }

        @Override // com.google.android.exoplayer2.mediacodec.x2.toq
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public toq mo12255k(x2.C3472k c3472k) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            toq toqVar;
            String str = c3472k.f20724k.f20688k;
            toq toqVar2 = null;
            try {
                String strValueOf = String.valueOf(str);
                n5r1.m13686k(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    toqVar = new toq(mediaCodecCreateByCodecName, this.f64969toq.get(), this.f64970zy.get(), this.f20721q, this.f20720n);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
            try {
                n5r1.zy();
                toqVar.fu4(c3472k.f64973toq, c3472k.f20726q, c3472k.f20725n, c3472k.f20723g, c3472k.f64972f7l8);
                return toqVar;
            } catch (Exception e4) {
                e = e4;
                toqVar2 = toqVar;
                if (toqVar2 != null) {
                    toqVar2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }

        @yz
        C7956toq(lvui<HandlerThread> lvuiVar, lvui<HandlerThread> lvuiVar2, boolean z2, boolean z3) {
            this.f64969toq = lvuiVar;
            this.f64970zy = lvuiVar2;
            this.f20721q = z2;
            this.f20720n = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fn3e(int i2) {
        return ni7(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fu4(@dd MediaFormat mediaFormat, @dd Surface surface, @dd MediaCrypto mediaCrypto, int i2, boolean z2) {
        this.f64967toq.m12197y(this.f20716k);
        n5r1.m13686k("configureCodec");
        this.f20716k.configure(mediaFormat, surface, mediaCrypto, i2);
        n5r1.zy();
        if (z2) {
            this.f20719y = this.f20716k.createInputSurface();
        }
        this.f64968zy.ki();
        n5r1.m13686k("startCodec");
        this.f20716k.start();
        n5r1.zy();
        this.f64966f7l8 = 1;
    }

    private static String ni7(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append(VideoElement.TAG_NAME);
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    private void o1t() {
        if (this.f20718q) {
            try {
                this.f64968zy.t8r();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m12272z(x2.zy zyVar, MediaCodec mediaCodec, long j2, long j3) {
        zyVar.mo12279k(this, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zurt(int i2) {
        return ni7(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void f7l8(int i2, int i3, int i4, long j2, int i5) {
        this.f64968zy.qrj(i2, i3, i4, j2, i5);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void flush() {
        this.f64968zy.m12225s();
        this.f20716k.flush();
        if (!this.f20717n) {
            this.f64967toq.m12195n(this.f20716k);
        } else {
            this.f64967toq.m12195n(null);
            this.f20716k.start();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: g */
    public void mo12261g(int i2) {
        o1t();
        this.f20716k.setVideoScalingMode(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @dd
    /* JADX INFO: renamed from: h */
    public ByteBuffer mo12262h(int i2) {
        return this.f20716k.getOutputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: k */
    public void mo12263k(int i2, int i3, C3293n c3293n, long j2, int i4) {
        this.f64968zy.n7h(i2, i3, c3293n, j2, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void kja0(int i2, boolean z2) {
        this.f20716k.releaseOutputBuffer(i2, z2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void ld6() {
        o1t();
        this.f20716k.signalEndOfInputStream();
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: n */
    public void mo12264n(Surface surface) {
        o1t();
        this.f20716k.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public int n7h(MediaCodec.BufferInfo bufferInfo) {
        return this.f64967toq.m12196q(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: p */
    public void mo12265p(Bundle bundle) {
        o1t();
        this.f20716k.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @dd
    /* JADX INFO: renamed from: q */
    public ByteBuffer mo12266q(int i2) {
        return this.f20716k.getInputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public int qrj() {
        return this.f64967toq.zy();
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void release() {
        try {
            if (this.f64966f7l8 == 1) {
                this.f64968zy.cdj();
                this.f64967toq.m12194h();
            }
            this.f64966f7l8 = 2;
        } finally {
            Surface surface = this.f20719y;
            if (surface != null) {
                surface.release();
            }
            if (!this.f20715g) {
                this.f20716k.release();
                this.f20715g = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    /* JADX INFO: renamed from: s */
    public boolean mo12267s() {
        return false;
    }

    @yz
    /* JADX INFO: renamed from: t */
    void m12273t(MediaFormat mediaFormat) {
        this.f64967toq.onOutputFormatChanged(this.f20716k, mediaFormat);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public MediaFormat toq() {
        return this.f64967toq.f7l8();
    }

    @yz
    void wvg(MediaCodec.CodecException codecException) {
        this.f64967toq.onError(this.f20716k, codecException);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void x2(int i2, long j2) {
        this.f20716k.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    @dd
    /* JADX INFO: renamed from: y */
    public Surface mo12268y() {
        return this.f20719y;
    }

    @Override // com.google.android.exoplayer2.mediacodec.x2
    public void zy(final x2.zy zyVar, Handler handler) {
        o1t();
        this.f20716k.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.k
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                this.f20653k.m12272z(zyVar, mediaCodec, j2, j3);
            }
        }, handler);
    }

    private toq(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z2, boolean z3) {
        this.f20716k = mediaCodec;
        this.f64967toq = new f7l8(handlerThread);
        this.f64968zy = new C3462n(mediaCodec, handlerThread2);
        this.f20718q = z2;
        this.f20717n = z3;
        this.f64966f7l8 = 0;
    }
}

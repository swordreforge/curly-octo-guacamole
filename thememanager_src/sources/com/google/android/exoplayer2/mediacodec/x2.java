package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.C3293n;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.nio.ByteBuffer;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface x2 {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.x2$k */
    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public static final class C3472k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final boolean f64972f7l8;

        /* JADX INFO: renamed from: g */
        public final int f20723g;

        /* JADX INFO: renamed from: k */
        public final n7h f20724k;

        /* JADX INFO: renamed from: n */
        @dd
        public final MediaCrypto f20725n;

        /* JADX INFO: renamed from: q */
        @dd
        public final Surface f20726q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final MediaFormat f64973toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final xwq3 f64974zy;

        private C3472k(n7h n7hVar, MediaFormat mediaFormat, xwq3 xwq3Var, @dd Surface surface, @dd MediaCrypto mediaCrypto, int i2, boolean z2) {
            this.f20724k = n7hVar;
            this.f64973toq = mediaFormat;
            this.f64974zy = xwq3Var;
            this.f20726q = surface;
            this.f20725n = mediaCrypto;
            this.f20723g = i2;
            this.f64972f7l8 = z2;
        }

        /* JADX INFO: renamed from: k */
        public static C3472k m12277k(n7h n7hVar, MediaFormat mediaFormat, xwq3 xwq3Var, @dd MediaCrypto mediaCrypto) {
            return new C3472k(n7hVar, mediaFormat, xwq3Var, null, mediaCrypto, 0, false);
        }

        @hyr(18)
        /* JADX INFO: renamed from: q */
        public static C3472k m12278q(n7h n7hVar, MediaFormat mediaFormat, xwq3 xwq3Var) {
            return new C3472k(n7hVar, mediaFormat, xwq3Var, null, null, 1, true);
        }

        public static C3472k toq(n7h n7hVar, MediaFormat mediaFormat, xwq3 xwq3Var) {
            return new C3472k(n7hVar, mediaFormat, xwq3Var, null, null, 1, false);
        }

        public static C3472k zy(n7h n7hVar, MediaFormat mediaFormat, xwq3 xwq3Var, @dd Surface surface, @dd MediaCrypto mediaCrypto) {
            return new C3472k(n7hVar, mediaFormat, xwq3Var, surface, mediaCrypto, 0, false);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface toq {

        /* JADX INFO: renamed from: k */
        public static final toq f20727k = new C3467p();

        /* JADX INFO: renamed from: k */
        x2 mo12255k(C3472k c3472k) throws IOException;
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo12279k(x2 x2Var, long j2, long j3);
    }

    void f7l8(int i2, int i3, int i4, long j2, int i5);

    void flush();

    /* JADX INFO: renamed from: g */
    void mo12261g(int i2);

    @dd
    /* JADX INFO: renamed from: h */
    ByteBuffer mo12262h(int i2);

    /* JADX INFO: renamed from: k */
    void mo12263k(int i2, int i3, C3293n c3293n, long j2, int i4);

    void kja0(int i2, boolean z2);

    @hyr(18)
    void ld6();

    @hyr(23)
    /* JADX INFO: renamed from: n */
    void mo12264n(Surface surface);

    int n7h(MediaCodec.BufferInfo bufferInfo);

    @hyr(19)
    /* JADX INFO: renamed from: p */
    void mo12265p(Bundle bundle);

    @dd
    /* JADX INFO: renamed from: q */
    ByteBuffer mo12266q(int i2);

    int qrj();

    void release();

    /* JADX INFO: renamed from: s */
    boolean mo12267s();

    MediaFormat toq();

    @hyr(21)
    void x2(int i2, long j2);

    @dd
    /* JADX INFO: renamed from: y */
    Surface mo12268y();

    @hyr(23)
    void zy(zy zyVar, Handler handler);
}

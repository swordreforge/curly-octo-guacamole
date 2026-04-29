package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.n */
/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3293n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public int f63571f7l8;

    /* JADX INFO: renamed from: g */
    public int f19589g;

    /* JADX INFO: renamed from: k */
    @dd
    public byte[] f19590k;

    /* JADX INFO: renamed from: n */
    @dd
    public int[] f19591n;

    /* JADX INFO: renamed from: p */
    @dd
    private final toq f19592p;

    /* JADX INFO: renamed from: q */
    @dd
    public int[] f19593q;

    /* JADX INFO: renamed from: s */
    private final MediaCodec.CryptoInfo f19594s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    public byte[] f63572toq;

    /* JADX INFO: renamed from: y */
    public int f19595y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f63573zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.n$toq */
    /* JADX INFO: compiled from: CryptoInfo.java */
    @hyr(24)
    private static final class toq {

        /* JADX INFO: renamed from: k */
        private final MediaCodec.CryptoInfo f19596k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f63574toq;

        /* JADX INFO: Access modifiers changed from: private */
        public void toq(int i2, int i3) {
            this.f63574toq.set(i2, i3);
            this.f19596k.setPattern(this.f63574toq);
        }

        private toq(MediaCodec.CryptoInfo cryptoInfo) {
            this.f19596k = cryptoInfo;
            this.f63574toq = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3293n() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f19594s = cryptoInfo;
        this.f19592p = lrht.f23230k >= 24 ? new toq(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoInfo m11569k() {
        return this.f19594s;
    }

    public void toq(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f19593q == null) {
            int[] iArr = new int[1];
            this.f19593q = iArr;
            this.f19594s.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f19593q;
        iArr2[0] = iArr2[0] + i2;
    }

    public void zy(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f19589g = i2;
        this.f19593q = iArr;
        this.f19591n = iArr2;
        this.f63572toq = bArr;
        this.f19590k = bArr2;
        this.f63573zy = i3;
        this.f63571f7l8 = i4;
        this.f19595y = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f19594s;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (lrht.f23230k >= 24) {
            ((toq) C3844k.f7l8(this.f19592p)).toq(i4, i5);
        }
    }
}

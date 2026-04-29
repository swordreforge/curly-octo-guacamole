package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.audio.x9kr;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.s */
/* JADX INFO: compiled from: C2Mp3TimestampTracker.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3469s {

    /* JADX INFO: renamed from: n */
    private static final String f20708n = "C2Mp3TimestampTracker";

    /* JADX INFO: renamed from: q */
    private static final long f20709q = 529;

    /* JADX INFO: renamed from: k */
    private long f20710k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f64961toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64962zy;

    C3469s() {
    }

    /* JADX INFO: renamed from: k */
    private long m12259k(long j2) {
        return this.f20710k + Math.max(0L, ((this.f64961toq - f20709q) * 1000000) / j2);
    }

    /* JADX INFO: renamed from: q */
    public long m12260q(xwq3 xwq3Var, C3297s c3297s) {
        if (this.f64961toq == 0) {
            this.f20710k = c3297s.f19618s;
        }
        if (this.f64962zy) {
            return c3297s.f19618s;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C3844k.f7l8(c3297s.f19612g);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
        }
        int iQrj = x9kr.qrj(i2);
        if (iQrj != -1) {
            long jM12259k = m12259k(xwq3Var.f23668d);
            this.f64961toq += (long) iQrj;
            return jM12259k;
        }
        this.f64962zy = true;
        this.f64961toq = 0L;
        this.f20710k = c3297s.f19618s;
        com.google.android.exoplayer2.util.ni7.qrj(f20708n, "MPEG audio header is invalid.");
        return c3297s.f19618s;
    }

    public long toq(xwq3 xwq3Var) {
        return m12259k(xwq3Var.f23668d);
    }

    public void zy() {
        this.f20710k = 0L;
        this.f64961toq = 0L;
        this.f64962zy = false;
    }
}

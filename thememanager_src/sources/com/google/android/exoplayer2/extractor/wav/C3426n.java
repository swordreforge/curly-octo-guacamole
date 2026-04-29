package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.wav.n */
/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3426n implements o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final long f64694f7l8;

    /* JADX INFO: renamed from: g */
    private final long f20429g;

    /* JADX INFO: renamed from: n */
    private final int f20430n;

    /* JADX INFO: renamed from: q */
    private final zy f20431q;

    /* JADX INFO: renamed from: y */
    private final long f20432y;

    public C3426n(zy zyVar, int i2, long j2, long j3) {
        this.f20431q = zyVar;
        this.f20430n = i2;
        this.f20429g = j2;
        long j4 = (j3 - j2) / ((long) zyVar.f20456n);
        this.f64694f7l8 = j4;
        this.f20432y = m12041k(j4);
    }

    /* JADX INFO: renamed from: k */
    private long m12041k(long j2) {
        return lrht.ktq(j2 * ((long) this.f20430n), 1000000L, this.f20431q.f64717zy);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        long jM13660i = lrht.m13660i((((long) this.f20431q.f64717zy) * j2) / (((long) this.f20430n) * 1000000), 0L, this.f64694f7l8 - 1);
        long j3 = this.f20429g + (((long) this.f20431q.f20456n) * jM13660i);
        long jM12041k = m12041k(jM13660i);
        wvg wvgVar = new wvg(jM12041k, j3);
        if (jM12041k >= j2 || jM13660i == this.f64694f7l8 - 1) {
            return new o1t.C3388k(wvgVar);
        }
        long j4 = jM13660i + 1;
        return new o1t.C3388k(wvgVar, new wvg(m12041k(j4), this.f20429g + (((long) this.f20431q.f20456n) * j4)));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f20432y;
    }
}

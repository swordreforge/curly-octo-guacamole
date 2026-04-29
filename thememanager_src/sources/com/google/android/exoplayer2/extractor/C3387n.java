package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.o1t;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.n */
/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3387n implements o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final long f64329f7l8;

    /* JADX INFO: renamed from: g */
    private final int f20098g;

    /* JADX INFO: renamed from: n */
    private final long f20099n;

    /* JADX INFO: renamed from: p */
    private final boolean f20100p;

    /* JADX INFO: renamed from: q */
    private final long f20101q;

    /* JADX INFO: renamed from: s */
    private final long f20102s;

    /* JADX INFO: renamed from: y */
    private final int f20103y;

    public C3387n(long j2, long j3, int i2, int i3) {
        this(j2, j3, i2, i3, false);
    }

    /* JADX INFO: renamed from: k */
    private long m11895k(long j2) {
        long j3 = (j2 * ((long) this.f20103y)) / 8000000;
        int i2 = this.f20098g;
        long jMin = (j3 / ((long) i2)) * ((long) i2);
        long j4 = this.f64329f7l8;
        if (j4 != -1) {
            jMin = Math.min(jMin, j4 - ((long) i2));
        }
        return this.f20099n + Math.max(jMin, 0L);
    }

    private static long zy(long j2, long j3, int i2) {
        return ((Math.max(0L, j2 - j3) * 8) * 1000000) / ((long) i2);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return this.f64329f7l8 != -1 || this.f20100p;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        if (this.f64329f7l8 == -1 && !this.f20100p) {
            return new o1t.C3388k(new wvg(0L, this.f20099n));
        }
        long jM11895k = m11895k(j2);
        long qVar = toq(jM11895k);
        wvg wvgVar = new wvg(qVar, jM11895k);
        if (this.f64329f7l8 != -1 && qVar < j2) {
            int i2 = this.f20098g;
            if (((long) i2) + jM11895k < this.f20101q) {
                long j3 = jM11895k + ((long) i2);
                return new o1t.C3388k(wvgVar, new wvg(toq(j3), j3));
            }
        }
        return new o1t.C3388k(wvgVar);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f20102s;
    }

    public long toq(long j2) {
        return zy(j2, this.f20099n, this.f20103y);
    }

    public C3387n(long j2, long j3, int i2, int i3, boolean z2) {
        this.f20101q = j2;
        this.f20099n = j3;
        this.f20098g = i3 == -1 ? 1 : i3;
        this.f20103y = i2;
        this.f20100p = z2;
        if (j2 == -1) {
            this.f64329f7l8 = -1L;
            this.f20102s = C3548p.f65257toq;
        } else {
            this.f64329f7l8 = j2 - j3;
            this.f20102s = zy(j2, j3, i2);
        }
    }
}

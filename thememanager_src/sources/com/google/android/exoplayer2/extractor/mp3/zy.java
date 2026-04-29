package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy implements f7l8 {

    /* JADX INFO: renamed from: g */
    private final long f19956g;

    /* JADX INFO: renamed from: n */
    private final long[] f19957n;

    /* JADX INFO: renamed from: q */
    private final long[] f19958q;

    private zy(long[] jArr, long[] jArr2, long j2) {
        this.f19958q = jArr;
        this.f19957n = jArr2;
        this.f19956g = j2 == C3548p.f65257toq ? lrht.v0af(jArr2[jArr2.length - 1]) : j2;
    }

    /* JADX INFO: renamed from: k */
    public static zy m11826k(long j2, MlltFrame mlltFrame, long j3) {
        int length = mlltFrame.f20814y.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += (long) (mlltFrame.f20811n + mlltFrame.f20814y[i4]);
            j4 += (long) (mlltFrame.f20810g + mlltFrame.f20813s[i4]);
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new zy(jArr, jArr2, j3);
    }

    private static Pair<Long, Long> toq(long j2, long[] jArr, long[] jArr2) {
        int iM13667p = lrht.m13667p(jArr, j2, true, true);
        long j3 = jArr[iM13667p];
        long j4 = jArr2[iM13667p];
        int i2 = iM13667p + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? 0.0d : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: g */
    public long mo11813g() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        Pair<Long, Long> qVar = toq(lrht.zwy(lrht.m13660i(j2, 0L, this.f19956g)), this.f19957n, this.f19958q);
        return new o1t.C3388k(new wvg(lrht.v0af(((Long) qVar.first).longValue()), ((Long) qVar.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f19956g;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: y */
    public long mo11814y(long j2) {
        return lrht.v0af(((Long) toq(j2, this.f19958q, this.f19957n).second).longValue());
    }
}

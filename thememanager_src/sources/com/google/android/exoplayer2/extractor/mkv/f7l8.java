package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ld6;
import java.io.IOException;

/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class f7l8 {

    /* JADX INFO: renamed from: g */
    private static final long[] f19872g = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: n */
    private static final int f19873n = 1;

    /* JADX INFO: renamed from: q */
    private static final int f19874q = 0;

    /* JADX INFO: renamed from: k */
    private final byte[] f19875k = new byte[8];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f63799toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f63800zy;

    /* JADX INFO: renamed from: k */
    public static long m11783k(byte[] bArr, int i2, boolean z2) {
        long j2 = ((long) bArr[0]) & 255;
        if (z2) {
            j2 &= ~f19872g[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    public static int zy(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = f19872g;
            if (i3 >= jArr.length) {
                return -1;
            }
            if ((jArr[i3] & ((long) i2)) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11784n() {
        this.f63799toq = 0;
        this.f63800zy = 0;
    }

    /* JADX INFO: renamed from: q */
    public long m11785q(ld6 ld6Var, boolean z2, boolean z3, int i2) throws IOException {
        if (this.f63799toq == 0) {
            if (!ld6Var.mo11729p(this.f19875k, 0, 1, z2)) {
                return -1L;
            }
            int iZy = zy(this.f19875k[0] & 255);
            this.f63800zy = iZy;
            if (iZy == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f63799toq = 1;
        }
        int i3 = this.f63800zy;
        if (i3 > i2) {
            this.f63799toq = 0;
            return -2L;
        }
        if (i3 != 1) {
            ld6Var.readFully(this.f19875k, 1, i3 - 1);
        }
        this.f63799toq = 0;
        return m11783k(this.f19875k, this.f63800zy, z3);
    }

    public int toq() {
        return this.f63800zy;
    }
}

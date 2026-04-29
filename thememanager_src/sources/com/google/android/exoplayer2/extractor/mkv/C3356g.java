package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.g */
/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3356g {

    /* JADX INFO: renamed from: q */
    private static final int f19876q = 440786851;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f63801zy = 1024;

    /* JADX INFO: renamed from: k */
    private final gvn7 f19877k = new gvn7(8);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f63802toq;

    /* JADX INFO: renamed from: k */
    private long m11786k(ld6 ld6Var) throws IOException {
        int i2 = 0;
        ld6Var.fn3e(this.f19877k.m13598q(), 0, 1);
        int i3 = this.f19877k.m13598q()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        ld6Var.fn3e(this.f19877k.m13598q(), 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f19877k.m13598q()[i2] & 255) + (i6 << 8);
        }
        this.f63802toq += i5 + 1;
        return i6;
    }

    public boolean toq(ld6 ld6Var) throws IOException {
        long length = ld6Var.getLength();
        long j2 = 1024;
        if (length != -1 && length <= 1024) {
            j2 = length;
        }
        int i2 = (int) j2;
        ld6Var.fn3e(this.f19877k.m13598q(), 0, 4);
        long jD3 = this.f19877k.d3();
        this.f63802toq = 4;
        while (jD3 != 440786851) {
            int i3 = this.f63802toq + 1;
            this.f63802toq = i3;
            if (i3 == i2) {
                return false;
            }
            ld6Var.fn3e(this.f19877k.m13598q(), 0, 1);
            jD3 = ((jD3 << 8) & (-256)) | ((long) (this.f19877k.m13598q()[0] & 255));
        }
        long jM11786k = m11786k(ld6Var);
        long j3 = this.f63802toq;
        if (jM11786k == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j3 + jM11786k >= length) {
            return false;
        }
        while (true) {
            int i4 = this.f63802toq;
            long j4 = j3 + jM11786k;
            if (i4 >= j4) {
                return ((long) i4) == j4;
            }
            if (m11786k(ld6Var) == Long.MIN_VALUE) {
                return false;
            }
            long jM11786k2 = m11786k(ld6Var);
            if (jM11786k2 < 0 || jM11786k2 > 2147483647L) {
                break;
            }
            if (jM11786k2 != 0) {
                int i5 = (int) jM11786k2;
                ld6Var.qrj(i5);
                this.f63802toq += i5;
            }
        }
        return false;
    }
}

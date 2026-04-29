package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.g */
/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3347g implements ld6 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63759ld6 = 4096;

    /* JADX INFO: renamed from: p */
    private static final int f19819p = 524288;

    /* JADX INFO: renamed from: s */
    private static final int f19820s = 65536;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63760f7l8;

    /* JADX INFO: renamed from: n */
    private long f19822n;

    /* JADX INFO: renamed from: q */
    private final long f19823q;

    /* JADX INFO: renamed from: y */
    private int f19824y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.x2 f63762zy;

    /* JADX INFO: renamed from: g */
    private byte[] f19821g = new byte[65536];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final byte[] f63761toq = new byte[4096];

    static {
        c8jq.m11556k("goog.exo.extractor");
    }

    public C3347g(com.google.android.exoplayer2.upstream.x2 x2Var, long j2, long j3) {
        this.f63762zy = x2Var;
        this.f19822n = j2;
        this.f19823q = j3;
    }

    private int fu4(byte[] bArr, int i2, int i3) {
        int i4 = this.f19824y;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f19821g, 0, bArr, i2, iMin);
        wvg(iMin);
        return iMin;
    }

    private void ni7(int i2) {
        int i3 = this.f63760f7l8 + i2;
        byte[] bArr = this.f19821g;
        if (i3 > bArr.length) {
            this.f19821g = Arrays.copyOf(this.f19821g, lrht.t8r(bArr.length * 2, 65536 + i3, i3 + 524288));
        }
    }

    private int o1t(int i2) {
        int iMin = Math.min(this.f19824y, i2);
        wvg(iMin);
        return iMin;
    }

    private void wvg(int i2) {
        int i3 = this.f19824y - i2;
        this.f19824y = i3;
        this.f63760f7l8 = 0;
        byte[] bArr = this.f19821g;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f19821g = bArr2;
    }

    /* JADX INFO: renamed from: z */
    private int m11726z(byte[] bArr, int i2, int i3, int i4, boolean z2) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i5 = this.f63762zy.read(bArr, i2 + i4, i3 - i4);
        if (i5 != -1) {
            return i4 + i5;
        }
        if (i4 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    private void zurt(int i2) {
        if (i2 != -1) {
            this.f19822n += (long) i2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void cdj(int i2) throws IOException {
        mo11727g(i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public boolean f7l8(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        if (!t8r(i3, z2)) {
            return false;
        }
        System.arraycopy(this.f19821g, this.f63760f7l8 - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void fn3e(byte[] bArr, int i2, int i3) throws IOException {
        f7l8(bArr, i2, i3, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: g */
    public boolean mo11727g(int i2, boolean z2) throws IOException {
        int iO1t = o1t(i2);
        while (iO1t < i2 && iO1t != -1) {
            iO1t = m11726z(this.f63761toq, -iO1t, Math.min(i2, this.f63761toq.length + iO1t), iO1t, z2);
        }
        zurt(iO1t);
        return iO1t != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public long getLength() {
        return this.f19823q;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public long getPosition() {
        return this.f19822n;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: h */
    public int mo11728h(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        ni7(i3);
        int i4 = this.f19824y;
        int i5 = this.f63760f7l8;
        int i6 = i4 - i5;
        if (i6 == 0) {
            iMin = m11726z(this.f19821g, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f19824y += iMin;
        } else {
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(this.f19821g, this.f63760f7l8, bArr, i2, iMin);
        this.f63760f7l8 += iMin;
        return iMin;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.google.android.exoplayer2.extractor.ld6
    public <E extends Throwable> void kja0(long j2, E e2) throws Throwable {
        C3844k.m13629k(j2 >= 0);
        this.f19822n = j2;
        throw e2;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: p */
    public boolean mo11729p(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        int iFu4 = fu4(bArr, i2, i3);
        while (iFu4 < i3 && iFu4 != -1) {
            iFu4 = m11726z(bArr, i2, i3, iFu4, z2);
        }
        zurt(iFu4);
        return iFu4 != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void qrj(int i2) throws IOException {
        t8r(i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6, com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int iFu4 = fu4(bArr, i2, i3);
        if (iFu4 == 0) {
            iFu4 = m11726z(bArr, i2, i3, 0, true);
        }
        zurt(iFu4);
        return iFu4;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        mo11729p(bArr, i2, i3, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public boolean t8r(int i2, boolean z2) throws IOException {
        ni7(i2);
        int iM11726z = this.f19824y - this.f63760f7l8;
        while (iM11726z < i2) {
            iM11726z = m11726z(this.f19821g, this.f63760f7l8, i2, iM11726z, z2);
            if (iM11726z == -1) {
                return false;
            }
            this.f19824y = this.f63760f7l8 + iM11726z;
        }
        this.f63760f7l8 += i2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public long x2() {
        return this.f19822n + ((long) this.f63760f7l8);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: y */
    public void mo11730y() {
        this.f63760f7l8 = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public int zy(int i2) throws IOException {
        int iO1t = o1t(i2);
        if (iO1t == 0) {
            byte[] bArr = this.f63761toq;
            iO1t = m11726z(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        zurt(iO1t);
        return iO1t;
    }
}

package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.i */
/* JADX INFO: compiled from: ForwardingExtractorInput.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3349i implements ld6 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ld6 f63763toq;

    public C3349i(ld6 ld6Var) {
        this.f63763toq = ld6Var;
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void cdj(int i2) throws IOException {
        this.f63763toq.cdj(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public boolean f7l8(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        return this.f63763toq.f7l8(bArr, i2, i3, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void fn3e(byte[] bArr, int i2, int i3) throws IOException {
        this.f63763toq.fn3e(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: g */
    public boolean mo11727g(int i2, boolean z2) throws IOException {
        return this.f63763toq.mo11727g(i2, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public long getLength() {
        return this.f63763toq.getLength();
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public long getPosition() {
        return this.f63763toq.getPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: h */
    public int mo11728h(byte[] bArr, int i2, int i3) throws IOException {
        return this.f63763toq.mo11728h(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public <E extends Throwable> void kja0(long j2, E e2) throws Throwable {
        this.f63763toq.kja0(j2, e2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: p */
    public boolean mo11729p(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        return this.f63763toq.mo11729p(bArr, i2, i3, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void qrj(int i2) throws IOException {
        this.f63763toq.qrj(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6, com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f63763toq.read(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        this.f63763toq.readFully(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public boolean t8r(int i2, boolean z2) throws IOException {
        return this.f63763toq.t8r(i2, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public long x2() {
        return this.f63763toq.x2();
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    /* JADX INFO: renamed from: y */
    public void mo11730y() {
        this.f63763toq.mo11730y();
    }

    @Override // com.google.android.exoplayer2.extractor.ld6
    public int zy(int i2) throws IOException {
        return this.f63763toq.zy(i2);
    }
}

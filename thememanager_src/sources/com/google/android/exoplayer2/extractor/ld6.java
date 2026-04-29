package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes2.dex */
public interface ld6 extends com.google.android.exoplayer2.upstream.x2 {
    void cdj(int i2) throws IOException;

    boolean f7l8(byte[] bArr, int i2, int i3, boolean z2) throws IOException;

    void fn3e(byte[] bArr, int i2, int i3) throws IOException;

    /* JADX INFO: renamed from: g */
    boolean mo11727g(int i2, boolean z2) throws IOException;

    long getLength();

    long getPosition();

    /* JADX INFO: renamed from: h */
    int mo11728h(byte[] bArr, int i2, int i3) throws IOException;

    <E extends Throwable> void kja0(long j2, E e2) throws Throwable;

    /* JADX INFO: renamed from: p */
    boolean mo11729p(byte[] bArr, int i2, int i3, boolean z2) throws IOException;

    void qrj(int i2) throws IOException;

    @Override // com.google.android.exoplayer2.upstream.x2
    int read(byte[] bArr, int i2, int i3) throws IOException;

    void readFully(byte[] bArr, int i2, int i3) throws IOException;

    boolean t8r(int i2, boolean z2) throws IOException;

    long x2();

    /* JADX INFO: renamed from: y */
    void mo11730y();

    int zy(int i2) throws IOException;
}

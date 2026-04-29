package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C3844k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.y */
/* JADX INFO: compiled from: ByteArrayDataSink.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3826y implements n7h {

    /* JADX INFO: renamed from: k */
    private ByteArrayOutputStream f23125k;

    @Override // com.google.android.exoplayer2.upstream.n7h
    public void close() throws IOException {
        ((ByteArrayOutputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23125k)).close();
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    /* JADX INFO: renamed from: k */
    public void mo13416k(t8r t8rVar) {
        long j2 = t8rVar.f23108y;
        if (j2 == -1) {
            this.f23125k = new ByteArrayOutputStream();
        } else {
            C3844k.m13629k(j2 <= 2147483647L);
            this.f23125k = new ByteArrayOutputStream((int) t8rVar.f23108y);
        }
    }

    @zy.dd
    public byte[] toq() {
        ByteArrayOutputStream byteArrayOutputStream = this.f23125k;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    public void write(byte[] bArr, int i2, int i3) {
        ((ByteArrayOutputStream) com.google.android.exoplayer2.util.lrht.ld6(this.f23125k)).write(bArr, i2, i3);
    }
}

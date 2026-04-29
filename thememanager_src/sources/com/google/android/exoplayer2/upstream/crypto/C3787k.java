package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.upstream.n7h;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.crypto.k */
/* JADX INFO: compiled from: AesCipherDataSink.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3787k implements n7h {

    /* JADX INFO: renamed from: k */
    private final n7h f22990k;

    /* JADX INFO: renamed from: q */
    @dd
    private zy f22991q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final byte[] f66827toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private final byte[] f66828zy;

    public C3787k(byte[] bArr, n7h n7hVar) {
        this(bArr, n7hVar, null);
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    public void close() throws IOException {
        this.f22991q = null;
        this.f22990k.close();
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    /* JADX INFO: renamed from: k */
    public void mo13416k(t8r t8rVar) throws IOException {
        this.f22990k.mo13416k(t8rVar);
        this.f22991q = new zy(1, this.f66827toq, t8rVar.f23107s, t8rVar.f66911f7l8 + t8rVar.f66913toq);
    }

    @Override // com.google.android.exoplayer2.upstream.n7h
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f66828zy == null) {
            ((zy) lrht.ld6(this.f22991q)).m13451n(bArr, i2, i3);
            this.f22990k.write(bArr, i2, i3);
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            int iMin = Math.min(i3 - i4, this.f66828zy.length);
            ((zy) lrht.ld6(this.f22991q)).m13452q(bArr, i2 + i4, iMin, this.f66828zy, 0);
            this.f22990k.write(this.f66828zy, 0, iMin);
            i4 += iMin;
        }
    }

    public C3787k(byte[] bArr, n7h n7hVar, @dd byte[] bArr2) {
        this.f22990k = n7hVar;
        this.f66827toq = bArr;
        this.f66828zy = bArr2;
    }
}

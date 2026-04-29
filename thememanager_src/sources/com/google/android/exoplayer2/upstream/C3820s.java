package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.s */
/* JADX INFO: compiled from: ByteArrayDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3820s extends AbstractC3795g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private Uri f66902f7l8;

    /* JADX INFO: renamed from: g */
    private final byte[] f23092g;

    /* JADX INFO: renamed from: p */
    private boolean f23093p;

    /* JADX INFO: renamed from: s */
    private int f23094s;

    /* JADX INFO: renamed from: y */
    private int f23095y;

    public C3820s(byte[] bArr) {
        super(false);
        C3844k.f7l8(bArr);
        C3844k.m13629k(bArr.length > 0);
        this.f23092g = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() {
        if (this.f23093p) {
            this.f23093p = false;
            ni7();
        }
        this.f66902f7l8 = null;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66902f7l8;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        this.f66902f7l8 = t8rVar.f23103k;
        fu4(t8rVar);
        long j2 = t8rVar.f66911f7l8;
        byte[] bArr = this.f23092g;
        if (j2 > bArr.length) {
            throw new C3796h(2008);
        }
        this.f23095y = (int) j2;
        int length = bArr.length - ((int) j2);
        this.f23094s = length;
        long j3 = t8rVar.f23108y;
        if (j3 != -1) {
            this.f23094s = (int) Math.min(length, j3);
        }
        this.f23093p = true;
        m13463z(t8rVar);
        long j4 = t8rVar.f23108y;
        return j4 != -1 ? j4 : this.f23094s;
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f23094s;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(this.f23092g, this.f23095y, bArr, i2, iMin);
        this.f23095y += iMin;
        this.f23094s -= iMin;
        zurt(iMin);
        return iMin;
    }
}

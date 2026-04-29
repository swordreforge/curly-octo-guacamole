package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
final class zurt implements com.google.android.exoplayer2.upstream.kja0 {

    /* JADX INFO: renamed from: g */
    private int f21768g;

    /* JADX INFO: renamed from: n */
    private final byte[] f21769n;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3635k f21770q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.kja0 f65471toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f65472zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.zurt$k */
    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface InterfaceC3635k {
        void toq(com.google.android.exoplayer2.util.gvn7 gvn7Var);
    }

    public zurt(com.google.android.exoplayer2.upstream.kja0 kja0Var, int i2, InterfaceC3635k interfaceC3635k) {
        C3844k.m13629k(i2 > 0);
        this.f65471toq = kja0Var;
        this.f65472zy = i2;
        this.f21770q = interfaceC3635k;
        this.f21769n = new byte[1];
        this.f21768g = i2;
    }

    private boolean zurt() throws IOException {
        if (this.f65471toq.read(this.f21769n, 0, 1) == -1) {
            return false;
        }
        int i2 = (this.f21769n[0] & 255) << 4;
        if (i2 == 0) {
            return true;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i4 = 0;
        while (i3 > 0) {
            int i5 = this.f65471toq.read(bArr, i4, i3);
            if (i5 == -1) {
                return false;
            }
            i4 += i5;
            i3 -= i5;
        }
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        if (i2 > 0) {
            this.f21770q.toq(new com.google.android.exoplayer2.util.gvn7(bArr, i2));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f65471toq.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(com.google.android.exoplayer2.upstream.t8r t8rVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f65471toq.mo7271n(uv6Var);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f21768g == 0) {
            if (!zurt()) {
                return -1;
            }
            this.f21768g = this.f65472zy;
        }
        int i4 = this.f65471toq.read(bArr, i2, Math.min(this.f21768g, i3));
        if (i4 != -1) {
            this.f21768g -= i4;
        }
        return i4;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return this.f65471toq.toq();
    }
}

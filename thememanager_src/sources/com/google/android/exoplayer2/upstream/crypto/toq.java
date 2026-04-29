package com.google.android.exoplayer2.upstream.crypto;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.upstream.uv6;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: compiled from: AesCipherDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements kja0 {

    /* JADX INFO: renamed from: q */
    @dd
    private zy f22992q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f66829toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final byte[] f66830zy;

    public toq(byte[] bArr, kja0 kja0Var) {
        this.f66829toq = kja0Var;
        this.f66830zy = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        this.f22992q = null;
        this.f66829toq.close();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @dd
    public Uri getUri() {
        return this.f66829toq.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        long jMo7270k = this.f66829toq.mo7270k(t8rVar);
        this.f22992q = new zy(2, this.f66830zy, t8rVar.f23107s, t8rVar.f66911f7l8 + t8rVar.f66913toq);
        return jMo7270k;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f66829toq.mo7271n(uv6Var);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f66829toq.read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        ((zy) lrht.ld6(this.f22992q)).m13451n(bArr, i2, i4);
        return i4;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return this.f66829toq.toq();
    }
}

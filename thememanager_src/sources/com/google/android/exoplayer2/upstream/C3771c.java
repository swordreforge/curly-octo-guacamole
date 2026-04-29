package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c */
/* JADX INFO: compiled from: TeeDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3771c implements kja0 {

    /* JADX INFO: renamed from: n */
    private long f22889n;

    /* JADX INFO: renamed from: q */
    private boolean f22890q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f66754toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final n7h f66755zy;

    public C3771c(kja0 kja0Var, n7h n7hVar) {
        this.f66754toq = (kja0) C3844k.f7l8(kja0Var);
        this.f66755zy = (n7h) C3844k.f7l8(n7hVar);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        try {
            this.f66754toq.close();
        } finally {
            if (this.f22890q) {
                this.f22890q = false;
                this.f66755zy.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66754toq.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        long jMo7270k = this.f66754toq.mo7270k(t8rVar);
        this.f22889n = jMo7270k;
        if (jMo7270k == 0) {
            return 0L;
        }
        if (t8rVar.f23108y == -1 && jMo7270k != -1) {
            t8rVar = t8rVar.m13512g(0L, jMo7270k);
        }
        this.f22890q = true;
        this.f66755zy.mo13416k(t8rVar);
        return this.f22889n;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f66754toq.mo7271n(uv6Var);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f22889n == 0) {
            return -1;
        }
        int i4 = this.f66754toq.read(bArr, i2, i3);
        if (i4 > 0) {
            this.f66755zy.write(bArr, i2, i4);
            long j2 = this.f22889n;
            if (j2 != -1) {
                this.f22889n = j2 - ((long) i4);
            }
        }
        return i4;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return this.f66754toq.toq();
    }
}

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.f */
/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3794f implements kja0 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f66841toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f66842zy;

    /* JADX INFO: renamed from: q */
    private Uri f23007q = Uri.EMPTY;

    /* JADX INFO: renamed from: n */
    private Map<String, List<String>> f23006n = Collections.emptyMap();

    public C3794f(kja0 kja0Var) {
        this.f66841toq = (kja0) C3844k.f7l8(kja0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        this.f66841toq.close();
    }

    public Map<String, List<String>> fu4() {
        return this.f23006n;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66841toq.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        this.f23007q = t8rVar.f23103k;
        this.f23006n = Collections.emptyMap();
        long jMo7270k = this.f66841toq.mo7270k(t8rVar);
        this.f23007q = (Uri) C3844k.f7l8(getUri());
        this.f23006n = toq();
        return jMo7270k;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f66841toq.mo7271n(uv6Var);
    }

    public Uri ni7() {
        return this.f23007q;
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f66841toq.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f66842zy += (long) i4;
        }
        return i4;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return this.f66841toq.toq();
    }

    /* JADX INFO: renamed from: z */
    public void m13461z() {
        this.f66842zy = 0L;
    }

    public long zurt() {
        return this.f66842zy;
    }
}

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PriorityDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class lvui implements kja0 {

    /* JADX INFO: renamed from: q */
    private final int f23036q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f66868toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.oc f66869zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.lvui$k */
    /* JADX INFO: compiled from: PriorityDataSource.java */
    public static final class C3807k implements kja0.InterfaceC3804k {

        /* JADX INFO: renamed from: k */
        private final kja0.InterfaceC3804k f23037k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.oc f66870toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f66871zy;

        public C3807k(kja0.InterfaceC3804k interfaceC3804k, com.google.android.exoplayer2.util.oc ocVar, int i2) {
            this.f23037k = interfaceC3804k;
            this.f66870toq = ocVar;
            this.f66871zy = i2;
        }

        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public lvui mo7265k() {
            return new lvui(this.f23037k.mo7265k(), this.f66870toq, this.f66871zy);
        }
    }

    public lvui(kja0 kja0Var, com.google.android.exoplayer2.util.oc ocVar, int i2) {
        this.f66868toq = (kja0) C3844k.f7l8(kja0Var);
        this.f66869zy = (com.google.android.exoplayer2.util.oc) C3844k.f7l8(ocVar);
        this.f23036q = i2;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        this.f66868toq.close();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f66868toq.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        this.f66869zy.m13714q(this.f23036q);
        return this.f66868toq.mo7270k(t8rVar);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f66868toq.mo7271n(uv6Var);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        this.f66869zy.m13714q(this.f23036q);
        return this.f66868toq.read(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return this.f66868toq.toq();
    }
}

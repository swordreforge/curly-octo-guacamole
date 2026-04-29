package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ResolvingDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ncyb implements kja0 {

    /* JADX INFO: renamed from: q */
    private boolean f23040q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f66874toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final toq f66875zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.ncyb$k */
    /* JADX INFO: compiled from: ResolvingDataSource.java */
    public static final class C3810k implements kja0.InterfaceC3804k {

        /* JADX INFO: renamed from: k */
        private final kja0.InterfaceC3804k f23041k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final toq f66876toq;

        public C3810k(kja0.InterfaceC3804k interfaceC3804k, toq toqVar) {
            this.f23041k = interfaceC3804k;
            this.f66876toq = toqVar;
        }

        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public ncyb mo7265k() {
            return new ncyb(this.f23041k.mo7265k(), this.f66876toq);
        }
    }

    /* JADX INFO: compiled from: ResolvingDataSource.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        t8r m13493k(t8r t8rVar) throws IOException;

        default Uri toq(Uri uri) {
            return uri;
        }
    }

    public ncyb(kja0 kja0Var, toq toqVar) {
        this.f66874toq = kja0Var;
        this.f66875zy = toqVar;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        if (this.f23040q) {
            this.f23040q = false;
            this.f66874toq.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        Uri uri = this.f66874toq.getUri();
        if (uri == null) {
            return null;
        }
        return this.f66875zy.toq(uri);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        t8r t8rVarM13493k = this.f66875zy.m13493k(t8rVar);
        this.f23040q = true;
        return this.f66874toq.mo7270k(t8rVarM13493k);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f66874toq.mo7271n(uv6Var);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f66874toq.read(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return this.f66874toq.toq();
    }
}

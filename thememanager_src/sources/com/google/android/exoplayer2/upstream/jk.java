package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.kja0;
import java.io.IOException;

/* JADX INFO: compiled from: DummyDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jk implements kja0 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final jk f66862toq = new jk();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final kja0.InterfaceC3804k f66863zy = new kja0.InterfaceC3804k() { // from class: com.google.android.exoplayer2.upstream.mcp
        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: k */
        public final kja0 mo7265k() {
            return jk.zurt();
        }
    };

    private jk() {
    }

    public static /* synthetic */ jk zurt() {
        return new jk();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException();
    }
}

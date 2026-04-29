package com.android.thememanager.basemodule.video;

import android.net.Uri;
import com.android.thememanager.basemodule.video.InterfaceC1836n;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.upstream.uv6;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: compiled from: NetworkAppreciableDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements kja0 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final kja0 f57825toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC1836n f57826zy;

    public zy(kja0 delegate, InterfaceC1836n sniffer) {
        this.f57825toq = delegate;
        this.f57826zy = sniffer;
    }

    private void zurt() throws IOException {
        InterfaceC1836n interfaceC1836n = this.f57826zy;
        if (interfaceC1836n != null && !interfaceC1836n.zy()) {
            throw InterfaceC1836n.toq.createDisconnectedException();
        }
        InterfaceC1836n interfaceC1836n2 = this.f57826zy;
        if (interfaceC1836n2 != null && !interfaceC1836n2.mo6439k() && !this.f57826zy.toq()) {
            throw InterfaceC1836n.toq.createRejectMobileNetworkException();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        this.f57825toq.close();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Uri getUri() {
        return this.f57825toq.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(@lvui t8r dataSpec) throws IOException {
        zurt();
        return this.f57825toq.mo7270k(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(@lvui uv6 transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(@lvui byte[] buffer, int offset, int readLength) throws IOException {
        zurt();
        return this.f57825toq.read(buffer, offset, readLength);
    }
}

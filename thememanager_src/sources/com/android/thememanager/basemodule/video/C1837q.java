package com.android.thememanager.basemodule.video;

import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.upstream.kja0;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.video.q */
/* JADX INFO: compiled from: NetworkAppreciableDataSourceFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C1837q implements kja0.InterfaceC3804k {

    /* JADX INFO: renamed from: k */
    private final jp0y.zy f10455k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC1836n f57824toq;

    public C1837q(jp0y.zy delegateFactory) {
        this(delegateFactory, InterfaceC1836n.f10454k);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
    /* JADX INFO: renamed from: k */
    public kja0 mo7265k() {
        return new zy(this.f10455k.mo7265k(), this.f57824toq);
    }

    public C1837q(jp0y.zy delegateFactory, InterfaceC1836n sniffer) {
        this.f10455k = delegateFactory;
        this.f57824toq = sniffer == null ? InterfaceC1836n.f10454k : sniffer;
    }
}

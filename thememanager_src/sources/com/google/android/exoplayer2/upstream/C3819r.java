package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.kja0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.r */
/* JADX INFO: compiled from: PriorityDataSourceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C3819r implements kja0.InterfaceC3804k {

    /* JADX INFO: renamed from: k */
    private final kja0.InterfaceC3804k f23091k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.oc f66900toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f66901zy;

    public C3819r(kja0.InterfaceC3804k interfaceC3804k, com.google.android.exoplayer2.util.oc ocVar, int i2) {
        this.f23091k = interfaceC3804k;
        this.f66900toq = ocVar;
        this.f66901zy = i2;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public lvui mo7265k() {
        return new lvui(this.f23091k.mo7265k(), this.f66900toq, this.f66901zy);
    }
}

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.InterfaceC3622o;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
public interface jk extends InterfaceC3622o {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.jk$k */
    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface InterfaceC3604k extends InterfaceC3622o.k<jk> {
        void ld6(jk jkVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    void f7l8(long j2);

    C3629x fn3e();

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    long mo12595g();

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    boolean mo12596k();

    long kja0(InterfaceC3715s[] interfaceC3715sArr, boolean[] zArr, InterfaceC3603j[] interfaceC3603jArr, boolean[] zArr2, long j2);

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    boolean mo12597n(long j2);

    void n7h(InterfaceC3604k interfaceC3604k, long j2);

    /* JADX INFO: renamed from: p */
    default List<StreamKey> mo12598p(List<InterfaceC3715s> list) {
        return Collections.emptyList();
    }

    /* JADX INFO: renamed from: q */
    long mo12599q(long j2, mbx mbxVar);

    long qrj();

    void t8r() throws IOException;

    long x2(long j2);

    void zurt(long j2, boolean z2);

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    long zy();
}

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.C3564a;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.p */
/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3712p extends zy {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private final Object f66062ld6;

    /* JADX INFO: renamed from: p */
    private final int f22338p;

    public C3712p(C3564a c3564a, int i2) {
        this(c3564a, i2, 0);
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public int fn3e() {
        return this.f22338p;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: k */
    public int mo12414k() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public void ki(long j2, long j3, long j4, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list, com.google.android.exoplayer2.source.chunk.kja0[] kja0VarArr) {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    @dd
    /* JADX INFO: renamed from: p */
    public Object mo12415p() {
        return this.f66062ld6;
    }

    public C3712p(C3564a c3564a, int i2, int i3) {
        this(c3564a, i2, i3, 0, null);
    }

    public C3712p(C3564a c3564a, int i2, int i3, int i4, @dd Object obj) {
        super(c3564a, new int[]{i2}, i3);
        this.f22338p = i4;
        this.f66062ld6 = obj;
    }
}

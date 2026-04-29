package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.chunk.AbstractC3581g;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.xwq3;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.s */
/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3715s extends n7h {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.s$k */
    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        public final C3564a f22341k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int[] f66064toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f66065zy;

        public k(C3564a c3564a, int... iArr) {
            this(c3564a, iArr, 0);
        }

        public k(C3564a c3564a, int[] iArr, int i2) {
            this.f22341k = c3564a;
            this.f66064toq = iArr;
            this.f66065zy = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.s$toq */
    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        InterfaceC3715s[] mo12416k(k[] kVarArr, InterfaceC3808n interfaceC3808n, fti.C3596k c3596k, pc pcVar);
    }

    int fn3e();

    /* JADX INFO: renamed from: g */
    default boolean m13150g(long j2, AbstractC3581g abstractC3581g, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    int mo13134h(long j2, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list);

    /* JADX INFO: renamed from: i */
    xwq3 mo13151i();

    /* JADX INFO: renamed from: k */
    int mo12414k();

    void ki(long j2, long j3, long j4, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list, com.google.android.exoplayer2.source.chunk.kja0[] kja0VarArr);

    void kja0();

    default void ld6() {
    }

    /* JADX INFO: renamed from: n */
    boolean mo13152n(int i2, long j2);

    default void n7h(boolean z2) {
    }

    @dd
    /* JADX INFO: renamed from: p */
    Object mo12415p();

    /* JADX INFO: renamed from: q */
    void mo13135q();

    /* JADX INFO: renamed from: s */
    void mo13136s(float f2);

    int t8r();

    default void zurt() {
    }

    boolean zy(int i2, long j2);
}

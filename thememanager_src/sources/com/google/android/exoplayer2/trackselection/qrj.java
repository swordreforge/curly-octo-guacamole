package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.trackselection.fn3e;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import java.util.List;
import java.util.Random;
import zy.dd;

/* JADX INFO: compiled from: RandomTrackSelection.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj extends zy {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f66063ld6;

    /* JADX INFO: renamed from: p */
    private final Random f22339p;

    public qrj(C3564a c3564a, int[] iArr, int i2, Random random) {
        super(c3564a, iArr, i2);
        this.f22339p = random;
        this.f66063ld6 = random.nextInt(this.f22346q);
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public int fn3e() {
        return 3;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    /* JADX INFO: renamed from: k */
    public int mo12414k() {
        return this.f66063ld6;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    public void ki(long j2, long j3, long j4, List<? extends com.google.android.exoplayer2.source.chunk.n7h> list, com.google.android.exoplayer2.source.chunk.kja0[] kja0VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f22346q; i3++) {
            if (!mo13152n(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        this.f66063ld6 = this.f22339p.nextInt(i2);
        if (i2 != this.f22346q) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f22346q; i5++) {
                if (!mo13152n(i5, jElapsedRealtime)) {
                    int i6 = i4 + 1;
                    if (this.f66063ld6 == i4) {
                        this.f66063ld6 = i5;
                        return;
                    }
                    i4 = i6;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s
    @dd
    /* JADX INFO: renamed from: p */
    public Object mo12415p() {
        return null;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.qrj$k */
    /* JADX INFO: compiled from: RandomTrackSelection.java */
    public static final class C3714k implements InterfaceC3715s.toq {

        /* JADX INFO: renamed from: k */
        private final Random f22340k;

        public C3714k() {
            this.f22340k = new Random();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ InterfaceC3715s zy(InterfaceC3715s.k kVar) {
            return new qrj(kVar.f22341k, kVar.f66064toq, kVar.f66065zy, this.f22340k);
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3715s.toq
        /* JADX INFO: renamed from: k */
        public InterfaceC3715s[] mo12416k(InterfaceC3715s.k[] kVarArr, InterfaceC3808n interfaceC3808n, fti.C3596k c3596k, pc pcVar) {
            return fn3e.toq(kVarArr, new fn3e.InterfaceC3704k() { // from class: com.google.android.exoplayer2.trackselection.x2
                @Override // com.google.android.exoplayer2.trackselection.fn3e.InterfaceC3704k
                /* JADX INFO: renamed from: k */
                public final InterfaceC3715s mo13084k(InterfaceC3715s.k kVar) {
                    return this.f22342k.zy(kVar);
                }
            });
        }

        public C3714k(int i2) {
            this.f22340k = new Random(i2);
        }
    }
}

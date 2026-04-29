package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.trackselection.C3705g;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.upstream.d3;
import zy.dd;

/* JADX INFO: compiled from: TrackSelectionUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class fn3e {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.fn3e$k */
    /* JADX INFO: compiled from: TrackSelectionUtil.java */
    public interface InterfaceC3704k {
        /* JADX INFO: renamed from: k */
        InterfaceC3715s mo13084k(InterfaceC3715s.k kVar);
    }

    private fn3e() {
    }

    /* JADX INFO: renamed from: k */
    public static d3.C3790k m13083k(InterfaceC3715s interfaceC3715s) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC3715s.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (interfaceC3715s.mo13152n(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        return new d3.C3790k(1, 0, length, i2);
    }

    public static InterfaceC3715s[] toq(InterfaceC3715s.k[] kVarArr, InterfaceC3704k interfaceC3704k) {
        InterfaceC3715s[] interfaceC3715sArr = new InterfaceC3715s[kVarArr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < kVarArr.length; i2++) {
            InterfaceC3715s.k kVar = kVarArr[i2];
            if (kVar != null) {
                int[] iArr = kVar.f66064toq;
                if (iArr.length <= 1 || z2) {
                    interfaceC3715sArr[i2] = new C3712p(kVar.f22341k, iArr[0], kVar.f66065zy);
                } else {
                    interfaceC3715sArr[i2] = interfaceC3704k.mo13084k(kVar);
                    z2 = true;
                }
            }
        }
        return interfaceC3715sArr;
    }

    public static C3705g.q zy(C3705g.q qVar, int i2, C3629x c3629x, boolean z2, @dd C3705g.g gVar) {
        C3705g.n nVarB3e = qVar.zy().c8jq(i2).b3e(i2, z2);
        if (gVar != null) {
            nVarB3e.cv06(i2, c3629x, gVar);
        }
        return nVarB3e.mo13111z();
    }
}

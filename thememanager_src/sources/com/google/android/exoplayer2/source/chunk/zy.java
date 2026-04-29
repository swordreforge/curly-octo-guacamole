package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.C3400s;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.source.chunk.f7l8;
import com.google.android.exoplayer2.source.hb;
import com.google.android.exoplayer2.util.ni7;

/* JADX INFO: compiled from: BaseMediaChunkOutput.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements f7l8.toq {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f65361zy = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: k */
    private final int[] f21425k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final hb[] f65362toq;

    public zy(int[] iArr, hb[] hbVarArr) {
        this.f21425k = iArr;
        this.f65362toq = hbVarArr;
    }

    /* JADX INFO: renamed from: k */
    public int[] m12678k() {
        int[] iArr = new int[this.f65362toq.length];
        int i2 = 0;
        while (true) {
            hb[] hbVarArr = this.f65362toq;
            if (i2 >= hbVarArr.length) {
                return iArr;
            }
            iArr[i2] = hbVarArr[i2].gvn7();
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8.toq
    public InterfaceC3401t toq(int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f21425k;
            if (i4 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i3);
                ni7.m13702q(f65361zy, sb.toString());
                return new C3400s();
            }
            if (i3 == iArr[i4]) {
                return this.f65362toq[i4];
            }
            i4++;
        }
    }

    public void zy(long j2) {
        for (hb hbVar : this.f65362toq) {
            hbVar.hb(j2);
        }
    }
}

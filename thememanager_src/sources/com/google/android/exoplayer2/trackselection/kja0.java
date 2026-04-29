package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;
import zy.dd;

/* JADX INFO: compiled from: TrackSelectionArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 {

    /* JADX INFO: renamed from: k */
    public final int f22326k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final n7h[] f66052toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f66053zy;

    public kja0(n7h... n7hVarArr) {
        this.f66052toq = n7hVarArr;
        this.f22326k = n7hVarArr.length;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kja0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f66052toq, ((kja0) obj).f66052toq);
    }

    public int hashCode() {
        if (this.f66053zy == 0) {
            this.f66053zy = 527 + Arrays.hashCode(this.f66052toq);
        }
        return this.f66053zy;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public n7h m13137k(int i2) {
        return this.f66052toq[i2];
    }

    public n7h[] toq() {
        return (n7h[]) this.f66052toq.clone();
    }
}

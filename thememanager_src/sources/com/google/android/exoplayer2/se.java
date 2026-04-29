package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class se implements InterfaceC3555s {

    /* JADX INFO: renamed from: g */
    public static final se f21212g = new se(1.0f);

    /* JADX INFO: renamed from: p */
    public static final InterfaceC3555s.k<se> f21213p = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.bwp
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return se.m12549q(bundle);
        }
    };

    /* JADX INFO: renamed from: s */
    private static final int f21214s = 1;

    /* JADX INFO: renamed from: y */
    private static final int f21215y = 0;

    /* JADX INFO: renamed from: k */
    public final float f21216k;

    /* JADX INFO: renamed from: n */
    private final int f21217n;

    /* JADX INFO: renamed from: q */
    public final float f21218q;

    public se(float f2) {
        this(f2, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ se m12549q(Bundle bundle) {
        return new se(bundle.getFloat(zy(0), 1.0f), bundle.getFloat(zy(1), 1.0f));
    }

    private static String zy(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || se.class != obj.getClass()) {
            return false;
        }
        se seVar = (se) obj;
        return this.f21216k == seVar.f21216k && this.f21218q == seVar.f21218q;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f21216k)) * 31) + Float.floatToRawIntBits(this.f21218q);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: n */
    public se m12550n(@zy.zurt(from = 0.0d, fromInclusive = false) float f2) {
        return new se(f2, this.f21218q);
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(zy(0), this.f21216k);
        bundle.putFloat(zy(1), this.f21218q);
        return bundle;
    }

    public String toString() {
        return com.google.android.exoplayer2.util.lrht.gvn7("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f21216k), Float.valueOf(this.f21218q));
    }

    public long toq(long j2) {
        return j2 * ((long) this.f21217n);
    }

    public se(@zy.zurt(from = 0.0d, fromInclusive = false) float f2, @zy.zurt(from = 0.0d, fromInclusive = false) float f3) {
        C3844k.m13629k(f2 > 0.0f);
        C3844k.m13629k(f3 > 0.0f);
        this.f21216k = f2;
        this.f21218q = f3;
        this.f21217n = Math.round(f2 * 1000.0f);
    }
}

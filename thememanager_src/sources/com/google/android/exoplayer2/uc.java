package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.base.C4280z;

/* JADX INFO: compiled from: StarRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class uc extends b3e {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3555s.k<uc> f22351c = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.yl
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return uc.m13155g(bundle);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final int f22352f = 2;

    /* JADX INFO: renamed from: l */
    private static final int f22353l = 1;

    /* JADX INFO: renamed from: r */
    private static final int f22354r = 5;

    /* JADX INFO: renamed from: t */
    private static final int f22355t = 2;

    /* JADX INFO: renamed from: i */
    @zy.a9(from = 1)
    private final int f22356i;

    /* JADX INFO: renamed from: z */
    private final float f22357z;

    public uc(@zy.a9(from = 1) int i2) {
        C3844k.toq(i2 > 0, "maxStars must be a positive integer");
        this.f22356i = i2;
        this.f22357z = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static uc m13155g(Bundle bundle) {
        C3844k.m13629k(bundle.getInt(m13157q(0), -1) == 2);
        int i2 = bundle.getInt(m13157q(1), 5);
        float f2 = bundle.getFloat(m13157q(2), -1.0f);
        return f2 == -1.0f ? new uc(i2) : new uc(i2, f2);
    }

    /* JADX INFO: renamed from: q */
    private static String m13157q(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return this.f22356i == ucVar.f22356i && this.f22357z == ucVar.f22357z;
    }

    @zy.a9(from = 1)
    public int f7l8() {
        return this.f22356i;
    }

    public int hashCode() {
        return C4280z.toq(Integer.valueOf(this.f22356i), Float.valueOf(this.f22357z));
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m13157q(0), 2);
        bundle.putInt(m13157q(1), this.f22356i);
        bundle.putFloat(m13157q(2), this.f22357z);
        return bundle;
    }

    /* JADX INFO: renamed from: y */
    public float m13158y() {
        return this.f22357z;
    }

    @Override // com.google.android.exoplayer2.b3e
    public boolean zy() {
        return this.f22357z != -1.0f;
    }

    public uc(@zy.a9(from = 1) int i2, @zy.zurt(from = 0.0d) float f2) {
        C3844k.toq(i2 > 0, "maxStars must be a positive integer");
        C3844k.toq(f2 >= 0.0f && f2 <= ((float) i2), "starRating is out of range [0, maxStars]");
        this.f22356i = i2;
        this.f22357z = f2;
    }
}

package com.google.android.exoplayer2.audio;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.z */
/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3271z {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63533zy = 0;

    /* JADX INFO: renamed from: k */
    public final int f19514k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final float f63534toq;

    public C3271z(int i2, float f2) {
        this.f19514k = i2;
        this.f63534toq = f2;
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3271z.class != obj.getClass()) {
            return false;
        }
        C3271z c3271z = (C3271z) obj;
        return this.f19514k == c3271z.f19514k && Float.compare(c3271z.f63534toq, this.f63534toq) == 0;
    }

    public int hashCode() {
        return ((527 + this.f19514k) * 31) + Float.floatToIntBits(this.f63534toq);
    }
}

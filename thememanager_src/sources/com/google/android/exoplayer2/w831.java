package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.base.C4280z;

/* JADX INFO: compiled from: PercentageRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w831 extends b3e {

    /* JADX INFO: renamed from: r */
    public static final InterfaceC3555s.k<w831> f23596r = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.cfr
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return w831.m13878g(bundle);
        }
    };

    /* JADX INFO: renamed from: t */
    private static final int f23597t = 1;

    /* JADX INFO: renamed from: z */
    private static final int f23598z = 1;

    /* JADX INFO: renamed from: i */
    private final float f23599i;

    public w831() {
        this.f23599i = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static w831 m13878g(Bundle bundle) {
        C3844k.m13629k(bundle.getInt(m13880q(0), -1) == 1);
        float f2 = bundle.getFloat(m13880q(1), -1.0f);
        return f2 == -1.0f ? new w831() : new w831(f2);
    }

    /* JADX INFO: renamed from: q */
    private static String m13880q(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        return (obj instanceof w831) && this.f23599i == ((w831) obj).f23599i;
    }

    public float f7l8() {
        return this.f23599i;
    }

    public int hashCode() {
        return C4280z.toq(Float.valueOf(this.f23599i));
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m13880q(0), 1);
        bundle.putFloat(m13880q(1), this.f23599i);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.b3e
    public boolean zy() {
        return this.f23599i != -1.0f;
    }

    public w831(@zy.zurt(from = 0.0d, to = 100.0d) float f2) {
        C3844k.toq(f2 >= 0.0f && f2 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f23599i = f2;
    }
}

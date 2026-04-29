package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;

/* JADX INFO: compiled from: Rating.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b3e implements InterfaceC3555s {

    /* JADX INFO: renamed from: g */
    static final int f19525g = 1;

    /* JADX INFO: renamed from: h */
    public static final InterfaceC3555s.k<b3e> f19526h = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.ktq
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return b3e.toq(bundle);
        }
    };

    /* JADX INFO: renamed from: k */
    public static final float f19527k = -1.0f;

    /* JADX INFO: renamed from: n */
    static final int f19528n = 0;

    /* JADX INFO: renamed from: p */
    static final int f19529p = 0;

    /* JADX INFO: renamed from: q */
    static final int f19530q = -1;

    /* JADX INFO: renamed from: s */
    static final int f19531s = 3;

    /* JADX INFO: renamed from: y */
    static final int f19532y = 2;

    b3e() {
    }

    /* JADX INFO: renamed from: q */
    private static String m11547q(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b3e toq(Bundle bundle) {
        int i2 = bundle.getInt(m11547q(0), -1);
        if (i2 == 0) {
            return (b3e) mu.f20894f.mo11492k(bundle);
        }
        if (i2 == 1) {
            return (b3e) w831.f23596r.mo11492k(bundle);
        }
        if (i2 == 2) {
            return (b3e) uc.f22351c.mo11492k(bundle);
        }
        if (i2 == 3) {
            return (b3e) ukdy.f22879f.mo11492k(bundle);
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Encountered unknown rating type: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract boolean zy();
}

package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.base.C4280z;

/* JADX INFO: compiled from: HeartRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class mu extends b3e {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3555s.k<mu> f20894f = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.d
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return mu.m12346g(bundle);
        }
    };

    /* JADX INFO: renamed from: l */
    private static final int f20895l = 2;

    /* JADX INFO: renamed from: r */
    private static final int f20896r = 1;

    /* JADX INFO: renamed from: t */
    private static final int f20897t = 0;

    /* JADX INFO: renamed from: i */
    private final boolean f20898i;

    /* JADX INFO: renamed from: z */
    private final boolean f20899z;

    public mu() {
        this.f20898i = false;
        this.f20899z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static mu m12346g(Bundle bundle) {
        C3844k.m13629k(bundle.getInt(m12348q(0), -1) == 0);
        return bundle.getBoolean(m12348q(1), false) ? new mu(bundle.getBoolean(m12348q(2), false)) : new mu();
    }

    /* JADX INFO: renamed from: q */
    private static String m12348q(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (!(obj instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj;
        return this.f20899z == muVar.f20899z && this.f20898i == muVar.f20898i;
    }

    public boolean f7l8() {
        return this.f20899z;
    }

    public int hashCode() {
        return C4280z.toq(Boolean.valueOf(this.f20898i), Boolean.valueOf(this.f20899z));
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m12348q(0), 0);
        bundle.putBoolean(m12348q(1), this.f20898i);
        bundle.putBoolean(m12348q(2), this.f20899z);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.b3e
    public boolean zy() {
        return this.f20898i;
    }

    public mu(boolean z2) {
        this.f20898i = true;
        this.f20899z = z2;
    }
}

package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.base.C4280z;

/* JADX INFO: compiled from: ThumbRating.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ukdy extends b3e {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3555s.k<ukdy> f22879f = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.do
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return ukdy.m13357g(bundle);
        }
    };

    /* JADX INFO: renamed from: l */
    private static final int f22880l = 2;

    /* JADX INFO: renamed from: r */
    private static final int f22881r = 1;

    /* JADX INFO: renamed from: t */
    private static final int f22882t = 3;

    /* JADX INFO: renamed from: i */
    private final boolean f22883i;

    /* JADX INFO: renamed from: z */
    private final boolean f22884z;

    public ukdy() {
        this.f22883i = false;
        this.f22884z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static ukdy m13357g(Bundle bundle) {
        C3844k.m13629k(bundle.getInt(m13359q(0), -1) == 3);
        return bundle.getBoolean(m13359q(1), false) ? new ukdy(bundle.getBoolean(m13359q(2), false)) : new ukdy();
    }

    /* JADX INFO: renamed from: q */
    private static String m13359q(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (!(obj instanceof ukdy)) {
            return false;
        }
        ukdy ukdyVar = (ukdy) obj;
        return this.f22884z == ukdyVar.f22884z && this.f22883i == ukdyVar.f22883i;
    }

    public boolean f7l8() {
        return this.f22884z;
    }

    public int hashCode() {
        return C4280z.toq(Boolean.valueOf(this.f22883i), Boolean.valueOf(this.f22884z));
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m13359q(0), 3);
        bundle.putBoolean(m13359q(1), this.f22883i);
        bundle.putBoolean(m13359q(2), this.f22884z);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.b3e
    public boolean zy() {
        return this.f22883i;
    }

    public ukdy(boolean z2) {
        this.f22883i = true;
        this.f22884z = z2;
    }
}

package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3853q;
import com.google.common.collect.se;
import com.google.common.collect.wlev;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.x */
/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3629x implements InterfaceC3555s {

    /* JADX INFO: renamed from: g */
    public static final C3629x f21698g = new C3629x(new C3564a[0]);

    /* JADX INFO: renamed from: s */
    public static final InterfaceC3555s.k<C3629x> f21699s = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.source.zp
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return C3629x.m12818g(bundle);
        }
    };

    /* JADX INFO: renamed from: y */
    private static final int f21700y = 0;

    /* JADX INFO: renamed from: k */
    public final int f21701k;

    /* JADX INFO: renamed from: n */
    private int f21702n;

    /* JADX INFO: renamed from: q */
    private final C3564a[] f21703q;

    public C3629x(C3564a... c3564aArr) {
        this.f21703q = c3564aArr;
        this.f21701k = c3564aArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C3629x m12818g(Bundle bundle) {
        return new C3629x((C3564a[]) C3853q.zy(C3564a.f21220s, bundle.getParcelableArrayList(m12820n(0)), se.of()).toArray(new C3564a[0]));
    }

    /* JADX INFO: renamed from: n */
    private static String m12820n(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3629x.class != obj.getClass()) {
            return false;
        }
        C3629x c3629x = (C3629x) obj;
        return this.f21701k == c3629x.f21701k && Arrays.equals(this.f21703q, c3629x.f21703q);
    }

    public int hashCode() {
        if (this.f21702n == 0) {
            this.f21702n = Arrays.hashCode(this.f21703q);
        }
        return this.f21702n;
    }

    /* JADX INFO: renamed from: q */
    public boolean m12821q() {
        return this.f21701k == 0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m12820n(0), C3853q.f7l8(wlev.m16057i(this.f21703q)));
        return bundle;
    }

    public C3564a toq(int i2) {
        return this.f21703q[i2];
    }

    public int zy(C3564a c3564a) {
        for (int i2 = 0; i2 < this.f21701k; i2++) {
            if (this.f21703q[i2] == c3564a) {
                return i2;
            }
        }
        return -1;
    }
}

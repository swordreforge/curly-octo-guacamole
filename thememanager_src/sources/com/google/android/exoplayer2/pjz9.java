package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import com.google.common.primitives.C4739k;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: TracksInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class pjz9 implements InterfaceC3555s {

    /* JADX INFO: renamed from: n */
    private static final int f21161n = 0;

    /* JADX INFO: renamed from: k */
    private final com.google.common.collect.se<C3551k> f21163k;

    /* JADX INFO: renamed from: q */
    public static final pjz9 f21162q = new pjz9(com.google.common.collect.se.of());

    /* JADX INFO: renamed from: g */
    public static final InterfaceC3555s.k<pjz9> f21160g = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.zwy
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return pjz9.m12503g(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.pjz9$k */
    /* JADX INFO: compiled from: TracksInfo.java */
    public static final class C3551k implements InterfaceC3555s {

        /* JADX INFO: renamed from: h */
        private static final int f21164h = 3;

        /* JADX INFO: renamed from: i */
        public static final InterfaceC3555s.k<C3551k> f21165i = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.n2t
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return pjz9.C3551k.ld6(bundle);
            }
        };

        /* JADX INFO: renamed from: p */
        private static final int f21166p = 2;

        /* JADX INFO: renamed from: s */
        private static final int f21167s = 1;

        /* JADX INFO: renamed from: y */
        private static final int f21168y = 0;

        /* JADX INFO: renamed from: g */
        private final boolean[] f21169g;

        /* JADX INFO: renamed from: k */
        private final C3564a f21170k;

        /* JADX INFO: renamed from: n */
        private final int f21171n;

        /* JADX INFO: renamed from: q */
        private final int[] f21172q;

        public C3551k(C3564a c3564a, int[] iArr, int i2, boolean[] zArr) {
            int i3 = c3564a.f21222k;
            C3844k.m13629k(i3 == iArr.length && i3 == zArr.length);
            this.f21170k = c3564a;
            this.f21172q = (int[]) iArr.clone();
            this.f21171n = i2;
            this.f21169g = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C3551k ld6(Bundle bundle) {
            C3564a c3564a = (C3564a) C3853q.m13718n(C3564a.f21220s, bundle.getBundle(m12508p(0)));
            C3844k.f7l8(c3564a);
            return new C3551k(c3564a, (int[]) com.google.common.base.fu4.m15351k(bundle.getIntArray(m12508p(1)), new int[c3564a.f21222k]), bundle.getInt(m12508p(2), -1), (boolean[]) com.google.common.base.fu4.m15351k(bundle.getBooleanArray(m12508p(3)), new boolean[c3564a.f21222k]));
        }

        /* JADX INFO: renamed from: p */
        private static String m12508p(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3551k.class != obj.getClass()) {
                return false;
            }
            C3551k c3551k = (C3551k) obj;
            return this.f21171n == c3551k.f21171n && this.f21170k.equals(c3551k.f21170k) && Arrays.equals(this.f21172q, c3551k.f21172q) && Arrays.equals(this.f21169g, c3551k.f21169g);
        }

        public boolean f7l8() {
            for (int i2 = 0; i2 < this.f21172q.length; i2++) {
                if (m12512s(i2)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public boolean m12509g() {
            return C4739k.m16643g(this.f21169g, true);
        }

        public int hashCode() {
            return (((((this.f21170k.hashCode() * 31) + Arrays.hashCode(this.f21172q)) * 31) + this.f21171n) * 31) + Arrays.hashCode(this.f21169g);
        }

        /* JADX INFO: renamed from: n */
        public int m12510n() {
            return this.f21171n;
        }

        /* JADX INFO: renamed from: q */
        public int m12511q(int i2) {
            return this.f21172q[i2];
        }

        /* JADX INFO: renamed from: s */
        public boolean m12512s(int i2) {
            return this.f21172q[i2] == 4;
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(m12508p(0), this.f21170k.toBundle());
            bundle.putIntArray(m12508p(1), this.f21172q);
            bundle.putInt(m12508p(2), this.f21171n);
            bundle.putBooleanArray(m12508p(3), this.f21169g);
            return bundle;
        }

        /* JADX INFO: renamed from: y */
        public boolean m12513y(int i2) {
            return this.f21169g[i2];
        }

        public C3564a zy() {
            return this.f21170k;
        }
    }

    public pjz9(List<C3551k> list) {
        this.f21163k = com.google.common.collect.se.copyOf((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ pjz9 m12503g(Bundle bundle) {
        return new pjz9(C3853q.zy(C3551k.f21165i, bundle.getParcelableArrayList(m12505n(0)), com.google.common.collect.se.of()));
    }

    /* JADX INFO: renamed from: n */
    private static String m12505n(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pjz9.class != obj.getClass()) {
            return false;
        }
        return this.f21163k.equals(((pjz9) obj).f21163k);
    }

    public int hashCode() {
        return this.f21163k.hashCode();
    }

    /* JADX INFO: renamed from: q */
    public boolean m12506q(int i2) {
        boolean z2 = true;
        for (int i3 = 0; i3 < this.f21163k.size(); i3++) {
            if (this.f21163k.get(i3).f21171n == i2) {
                if (this.f21163k.get(i3).f7l8()) {
                    return true;
                }
                z2 = false;
            }
        }
        return z2;
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m12505n(0), C3853q.f7l8(this.f21163k));
        return bundle;
    }

    public com.google.common.collect.se<C3551k> toq() {
        return this.f21163k;
    }

    public boolean zy(int i2) {
        for (int i3 = 0; i3 < this.f21163k.size(); i3++) {
            C3551k c3551k = this.f21163k.get(i3);
            if (c3551k.m12509g() && c3551k.m12510n() == i2) {
                return true;
            }
        }
        return false;
    }
}

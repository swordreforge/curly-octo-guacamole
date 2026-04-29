package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.source.ads.zy;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import zy.InterfaceC7839p;
import zy.a9;
import zy.dd;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements InterfaceC3555s {

    /* JADX INFO: renamed from: c */
    private static final int f21289c = 2;

    /* JADX INFO: renamed from: e */
    private static final int f21290e = 3;

    /* JADX INFO: renamed from: f */
    private static final int f21291f = 1;

    /* JADX INFO: renamed from: h */
    public static final int f21292h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f21293i = 2;

    /* JADX INFO: renamed from: j */
    private static final int f21294j = 4;

    /* JADX INFO: renamed from: p */
    public static final int f21297p = 0;

    /* JADX INFO: renamed from: t */
    public static final int f21299t = 4;

    /* JADX INFO: renamed from: z */
    public static final int f21300z = 3;

    /* JADX INFO: renamed from: g */
    public final long f21301g;

    /* JADX INFO: renamed from: k */
    @dd
    public final Object f21302k;

    /* JADX INFO: renamed from: n */
    public final long f21303n;

    /* JADX INFO: renamed from: q */
    public final int f21304q;

    /* JADX INFO: renamed from: s */
    private final C3576k[] f21305s;

    /* JADX INFO: renamed from: y */
    public final int f21306y;

    /* JADX INFO: renamed from: r */
    public static final zy f21298r = new zy(null, new C3576k[0], 0, C3548p.f65257toq, 0);

    /* JADX INFO: renamed from: l */
    private static final C3576k f21295l = new C3576k(0).m12626p(0);

    /* JADX INFO: renamed from: o */
    public static final InterfaceC3555s.k<zy> f21296o = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.source.ads.k
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return zy.zy(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.zy$k */
    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class C3576k implements InterfaceC3555s {

        /* JADX INFO: renamed from: c */
        public static final InterfaceC3555s.k<C3576k> f21307c = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.source.ads.toq
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return zy.C3576k.m12621q(bundle);
            }
        };

        /* JADX INFO: renamed from: f */
        private static final int f21308f = 6;

        /* JADX INFO: renamed from: h */
        private static final int f21309h = 0;

        /* JADX INFO: renamed from: i */
        private static final int f21310i = 1;

        /* JADX INFO: renamed from: l */
        private static final int f21311l = 5;

        /* JADX INFO: renamed from: r */
        private static final int f21312r = 4;

        /* JADX INFO: renamed from: t */
        private static final int f21313t = 3;

        /* JADX INFO: renamed from: z */
        private static final int f21314z = 2;

        /* JADX INFO: renamed from: g */
        public final int[] f21315g;

        /* JADX INFO: renamed from: k */
        public final long f21316k;

        /* JADX INFO: renamed from: n */
        public final Uri[] f21317n;

        /* JADX INFO: renamed from: p */
        public final boolean f21318p;

        /* JADX INFO: renamed from: q */
        public final int f21319q;

        /* JADX INFO: renamed from: s */
        public final long f21320s;

        /* JADX INFO: renamed from: y */
        public final long[] f21321y;

        public C3576k(long j2) {
            this(j2, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static C3576k m12621q(Bundle bundle) {
            long j2 = bundle.getLong(m12622y(0));
            int i2 = bundle.getInt(m12622y(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m12622y(2));
            int[] intArray = bundle.getIntArray(m12622y(3));
            long[] longArray = bundle.getLongArray(m12622y(4));
            long j3 = bundle.getLong(m12622y(5));
            boolean z2 = bundle.getBoolean(m12622y(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C3576k(j2, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j3, z2);
        }

        @InterfaceC7839p
        private static long[] toq(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = Math.max(i2, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C3548p.f65257toq);
            return jArrCopyOf;
        }

        /* JADX INFO: renamed from: y */
        private static String m12622y(int i2) {
            return Integer.toString(i2, 36);
        }

        @InterfaceC7839p
        private static int[] zy(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = Math.max(i2, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        @InterfaceC7839p
        public C3576k cdj(long j2) {
            return new C3576k(j2, this.f21319q, this.f21315g, this.f21317n, this.f21321y, this.f21320s, this.f21318p);
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3576k.class != obj.getClass()) {
                return false;
            }
            C3576k c3576k = (C3576k) obj;
            return this.f21316k == c3576k.f21316k && this.f21319q == c3576k.f21319q && Arrays.equals(this.f21317n, c3576k.f21317n) && Arrays.equals(this.f21315g, c3576k.f21315g) && Arrays.equals(this.f21321y, c3576k.f21321y) && this.f21320s == c3576k.f21320s && this.f21318p == c3576k.f21318p;
        }

        public boolean f7l8() {
            if (this.f21319q == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.f21319q; i2++) {
                int i3 = this.f21315g[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m12623g(@a9(from = -1) int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.f21315g;
                if (i4 >= iArr.length || this.f21318p || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        @InterfaceC7839p
        /* JADX INFO: renamed from: h */
        public C3576k m12624h(boolean z2) {
            return new C3576k(this.f21316k, this.f21319q, this.f21315g, this.f21317n, this.f21321y, this.f21320s, z2);
        }

        public int hashCode() {
            int i2 = this.f21319q * 31;
            long j2 = this.f21316k;
            int iHashCode = (((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f21317n)) * 31) + Arrays.hashCode(this.f21315g)) * 31) + Arrays.hashCode(this.f21321y)) * 31;
            long j3 = this.f21320s;
            return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f21318p ? 1 : 0);
        }

        @InterfaceC7839p
        public C3576k kja0(long j2) {
            return new C3576k(this.f21316k, this.f21319q, this.f21315g, this.f21317n, this.f21321y, j2, this.f21318p);
        }

        @InterfaceC7839p
        public C3576k ld6(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f21317n;
            if (length < uriArr.length) {
                jArr = toq(jArr, uriArr.length);
            } else if (this.f21319q != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new C3576k(this.f21316k, this.f21319q, this.f21315g, this.f21317n, jArr, this.f21320s, this.f21318p);
        }

        /* JADX INFO: renamed from: n */
        public int m12625n() {
            return m12623g(-1);
        }

        @InterfaceC7839p
        public C3576k n7h() {
            if (this.f21319q == -1) {
                return new C3576k(this.f21316k, 0, new int[0], new Uri[0], new long[0], this.f21320s, this.f21318p);
            }
            int[] iArr = this.f21315g;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArrCopyOf[i2];
                if (i3 == 1 || i3 == 0) {
                    iArrCopyOf[i2] = 2;
                }
            }
            return new C3576k(this.f21316k, length, iArrCopyOf, this.f21317n, this.f21321y, this.f21320s, this.f21318p);
        }

        @InterfaceC7839p
        /* JADX INFO: renamed from: p */
        public C3576k m12626p(int i2) {
            int[] iArrZy = zy(this.f21315g, i2);
            long[] qVar = toq(this.f21321y, i2);
            return new C3576k(this.f21316k, i2, iArrZy, (Uri[]) Arrays.copyOf(this.f21317n, i2), qVar, this.f21320s, this.f21318p);
        }

        @InterfaceC7839p
        public C3576k qrj(Uri uri, @a9(from = 0) int i2) {
            int[] iArrZy = zy(this.f21315g, i2 + 1);
            long[] qVar = this.f21321y;
            if (qVar.length != iArrZy.length) {
                qVar = toq(qVar, iArrZy.length);
            }
            long[] jArr = qVar;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f21317n, iArrZy.length);
            uriArr[i2] = uri;
            iArrZy[i2] = 1;
            return new C3576k(this.f21316k, this.f21319q, iArrZy, uriArr, jArr, this.f21320s, this.f21318p);
        }

        /* JADX INFO: renamed from: s */
        public boolean m12627s() {
            return this.f21319q == -1 || m12625n() < this.f21319q;
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(m12622y(0), this.f21316k);
            bundle.putInt(m12622y(1), this.f21319q);
            bundle.putParcelableArrayList(m12622y(2), new ArrayList<>(Arrays.asList(this.f21317n)));
            bundle.putIntArray(m12622y(3), this.f21315g);
            bundle.putLongArray(m12622y(4), this.f21321y);
            bundle.putLong(m12622y(5), this.f21320s);
            bundle.putBoolean(m12622y(6), this.f21318p);
            return bundle;
        }

        @InterfaceC7839p
        public C3576k x2(int i2, @a9(from = 0) int i3) {
            int i4 = this.f21319q;
            C3844k.m13629k(i4 == -1 || i3 < i4);
            int[] iArrZy = zy(this.f21315g, i3 + 1);
            int i5 = iArrZy[i3];
            C3844k.m13629k(i5 == 0 || i5 == 1 || i5 == i2);
            long[] qVar = this.f21321y;
            if (qVar.length != iArrZy.length) {
                qVar = toq(qVar, iArrZy.length);
            }
            long[] jArr = qVar;
            Uri[] uriArr = this.f21317n;
            if (uriArr.length != iArrZy.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrZy.length);
            }
            iArrZy[i3] = i2;
            return new C3576k(this.f21316k, this.f21319q, iArrZy, uriArr, jArr, this.f21320s, this.f21318p);
        }

        private C3576k(long j2, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z2) {
            C3844k.m13629k(iArr.length == uriArr.length);
            this.f21316k = j2;
            this.f21319q = i2;
            this.f21315g = iArr;
            this.f21317n = uriArr;
            this.f21321y = jArr;
            this.f21320s = j3;
            this.f21318p = z2;
        }
    }

    /* JADX INFO: compiled from: AdPlaybackState.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    public zy(Object obj, long... jArr) {
        this(obj, toq(jArr), 0L, C3548p.f65257toq, 0);
    }

    /* JADX INFO: renamed from: s */
    private static String m12612s(int i2) {
        return Integer.toString(i2, 36);
    }

    private static C3576k[] toq(long[] jArr) {
        int length = jArr.length;
        C3576k[] c3576kArr = new C3576k[length];
        for (int i2 = 0; i2 < length; i2++) {
            c3576kArr[i2] = new C3576k(jArr[i2]);
        }
        return c3576kArr;
    }

    /* JADX INFO: renamed from: y */
    private boolean m12613y(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        long j4 = m12619q(i2).f21316k;
        return j4 == Long.MIN_VALUE ? j3 == C3548p.f65257toq || j2 < j3 : j2 < j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zy zy(Bundle bundle) {
        C3576k[] c3576kArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m12612s(1));
        if (parcelableArrayList == null) {
            c3576kArr = new C3576k[0];
        } else {
            C3576k[] c3576kArr2 = new C3576k[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                c3576kArr2[i2] = (C3576k) C3576k.f21307c.mo11492k((Bundle) parcelableArrayList.get(i2));
            }
            c3576kArr = c3576kArr2;
        }
        return new zy(null, c3576kArr, bundle.getLong(m12612s(2), 0L), bundle.getLong(m12612s(3), C3548p.f65257toq), bundle.getInt(m12612s(4)));
    }

    @InterfaceC7839p
    public zy cdj(long j2) {
        return this.f21301g == j2 ? this : new zy(this.f21302k, this.f21305s, this.f21303n, j2, this.f21306y);
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy.class != obj.getClass()) {
            return false;
        }
        zy zyVar = (zy) obj;
        return lrht.zy(this.f21302k, zyVar.f21302k) && this.f21304q == zyVar.f21304q && this.f21303n == zyVar.f21303n && this.f21301g == zyVar.f21301g && this.f21306y == zyVar.f21306y && Arrays.equals(this.f21305s, zyVar.f21305s);
    }

    public boolean f7l8(@a9(from = 0) int i2, @a9(from = 0) int i3) {
        C3576k c3576kM12619q;
        int i4;
        return i2 < this.f21304q && (i4 = (c3576kM12619q = m12619q(i2)).f21319q) != -1 && i3 < i4 && c3576kM12619q.f21315g[i3] == 4;
    }

    @InterfaceC7839p
    public zy fn3e(@a9(from = 0) int i2, @a9(from = 0) int i3) {
        int i4 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i4] = c3576kArr2[i4].x2(3, i3);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy fu4(@a9(from = 0) int i2) {
        int i3 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i3] = c3576kArr2[i3].n7h();
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    /* JADX INFO: renamed from: g */
    public int m12614g(long j2, long j3) {
        int i2 = this.f21304q - 1;
        while (i2 >= 0 && m12613y(j2, j3, i2)) {
            i2--;
        }
        if (i2 < 0 || !m12619q(i2).f7l8()) {
            return -1;
        }
        return i2;
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: h */
    public zy m12615h(@a9(from = 0) int i2, @a9(from = 0) int i3, Uri uri) {
        int i4 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i4] = c3576kArr2[i4].qrj(uri, i3);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    public int hashCode() {
        int i2 = this.f21304q * 31;
        Object obj = this.f21302k;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f21303n)) * 31) + ((int) this.f21301g)) * 31) + this.f21306y) * 31) + Arrays.hashCode(this.f21305s);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: i */
    public zy m12616i(@a9(from = 0) int i2, long j2) {
        int i3 = i2 - this.f21306y;
        C3576k c3576k = new C3576k(j2);
        C3576k[] c3576kArr = (C3576k[]) lrht.cfr(this.f21305s, c3576k);
        System.arraycopy(c3576kArr, i3, c3576kArr, i3 + 1, this.f21305s.length - i3);
        c3576kArr[i3] = c3576k;
        return new zy(this.f21302k, c3576kArr, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy ki(@a9(from = 0) int i2, long j2) {
        int i3 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        if (c3576kArr[i3].f21320s == j2) {
            return this;
        }
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i3] = c3576kArr2[i3].kja0(j2);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy kja0(long j2) {
        return this.f21303n == j2 ? this : new zy(this.f21302k, this.f21305s, j2, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy ld6(@a9(from = 0) int i2, long... jArr) {
        int i3 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i3] = c3576kArr2[i3].ld6(jArr);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    /* JADX INFO: renamed from: n */
    public int m12617n(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != C3548p.f65257toq && j2 >= j3) {
            return -1;
        }
        int i2 = this.f21306y;
        while (i2 < this.f21304q && ((m12619q(i2).f21316k != Long.MIN_VALUE && m12619q(i2).f21316k <= j2) || !m12619q(i2).m12627s())) {
            i2++;
        }
        if (i2 < this.f21304q) {
            return i2;
        }
        return -1;
    }

    @InterfaceC7839p
    public zy n7h(@a9(from = 0) int i2, @a9(from = 0) int i3) {
        int i4 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i4] = c3576kArr2[i4].x2(4, i3);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy ni7(@a9(from = 0) int i2, @a9(from = 0) int i3) {
        int i4 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i4] = c3576kArr2[i4].x2(2, i3);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: p */
    public zy m12618p(@a9(from = 0) int i2, @a9(from = 1) int i3) {
        C3844k.m13629k(i3 > 0);
        int i4 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        if (c3576kArr[i4].f21319q == i3) {
            return this;
        }
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i4] = this.f21305s[i4].m12626p(i3);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    /* JADX INFO: renamed from: q */
    public C3576k m12619q(@a9(from = 0) int i2) {
        int i3 = this.f21306y;
        return i2 < i3 ? f21295l : this.f21305s[i2 - i3];
    }

    @InterfaceC7839p
    public zy qrj(@a9(from = 0) int i2, long j2) {
        int i3 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i3] = this.f21305s[i3].cdj(j2);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy t8r(@a9(from = 0) int i2, boolean z2) {
        int i3 = i2 - this.f21306y;
        C3576k[] c3576kArr = this.f21305s;
        if (c3576kArr[i3].f21318p == z2) {
            return this;
        }
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        c3576kArr2[i3] = c3576kArr2[i3].m12624h(z2);
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C3576k c3576k : this.f21305s) {
            arrayList.add(c3576k.toBundle());
        }
        bundle.putParcelableArrayList(m12612s(1), arrayList);
        bundle.putLong(m12612s(2), this.f21303n);
        bundle.putLong(m12612s(3), this.f21301g);
        bundle.putInt(m12612s(4), this.f21306y);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f21302k);
        sb.append(", adResumePositionUs=");
        sb.append(this.f21303n);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f21305s.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f21305s[i2].f21316k);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.f21305s[i2].f21315g.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.f21305s[i2].f21315g[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f21305s[i2].f21321y[i3]);
                sb.append(')');
                if (i3 < this.f21305s[i2].f21315g.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.f21305s.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    @InterfaceC7839p
    public zy x2(long[][] jArr) {
        C3844k.m13633s(this.f21306y == 0);
        C3576k[] c3576kArr = this.f21305s;
        C3576k[] c3576kArr2 = (C3576k[]) lrht.z4(c3576kArr, c3576kArr.length);
        for (int i2 = 0; i2 < this.f21304q; i2++) {
            c3576kArr2[i2] = c3576kArr2[i2].ld6(jArr[i2]);
        }
        return new zy(this.f21302k, c3576kArr2, this.f21303n, this.f21301g, this.f21306y);
    }

    @InterfaceC7839p
    public zy zurt(@a9(from = 0) int i2) {
        int i3 = this.f21306y;
        if (i3 == i2) {
            return this;
        }
        C3844k.m13629k(i2 > i3);
        int i4 = this.f21304q - i2;
        C3576k[] c3576kArr = new C3576k[i4];
        System.arraycopy(this.f21305s, i2 - this.f21306y, c3576kArr, 0, i4);
        return new zy(this.f21302k, c3576kArr, this.f21303n, this.f21301g, i2);
    }

    private zy(@dd Object obj, C3576k[] c3576kArr, long j2, long j3, int i2) {
        this.f21302k = obj;
        this.f21303n = j2;
        this.f21301g = j3;
        this.f21304q = c3576kArr.length + i2;
        this.f21305s = c3576kArr;
        this.f21306y = i2;
    }
}

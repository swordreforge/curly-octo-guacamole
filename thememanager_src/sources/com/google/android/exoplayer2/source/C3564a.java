package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.se;
import com.google.common.collect.wlev;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.a */
/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3564a implements InterfaceC3555s {

    /* JADX INFO: renamed from: g */
    private static final String f21219g = "TrackGroup";

    /* JADX INFO: renamed from: s */
    public static final InterfaceC3555s.k<C3564a> f21220s = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.source.a98o
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return C3564a.m12553n(bundle);
        }
    };

    /* JADX INFO: renamed from: y */
    private static final int f21221y = 0;

    /* JADX INFO: renamed from: k */
    public final int f21222k;

    /* JADX INFO: renamed from: n */
    private int f21223n;

    /* JADX INFO: renamed from: q */
    private final xwq3[] f21224q;

    public C3564a(xwq3... xwq3VarArr) {
        C3844k.m13629k(xwq3VarArr.length > 0);
        this.f21224q = xwq3VarArr;
        this.f21222k = xwq3VarArr.length;
        m12555s();
    }

    private static String f7l8(@zy.dd String str) {
        return (str == null || str.equals(C3548p.f65138bwp)) ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    private static void m12551g(String str, @zy.dd String str2, @zy.dd String str3, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i2);
        sb.append(")");
        com.google.android.exoplayer2.util.ni7.m13700n(f21219g, "", new IllegalStateException(sb.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C3564a m12553n(Bundle bundle) {
        return new C3564a((xwq3[]) C3853q.zy(xwq3.hp, bundle.getParcelableArrayList(m12554q(0)), se.of()).toArray(new xwq3[0]));
    }

    /* JADX INFO: renamed from: q */
    private static String m12554q(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: renamed from: s */
    private void m12555s() {
        String strF7l8 = f7l8(this.f21224q[0].f23678n);
        int iM12556y = m12556y(this.f21224q[0].f23689y);
        int i2 = 1;
        while (true) {
            xwq3[] xwq3VarArr = this.f21224q;
            if (i2 >= xwq3VarArr.length) {
                return;
            }
            if (!strF7l8.equals(f7l8(xwq3VarArr[i2].f23678n))) {
                xwq3[] xwq3VarArr2 = this.f21224q;
                m12551g("languages", xwq3VarArr2[0].f23678n, xwq3VarArr2[i2].f23678n, i2);
                return;
            } else {
                if (iM12556y != m12556y(this.f21224q[i2].f23689y)) {
                    m12551g("role flags", Integer.toBinaryString(this.f21224q[0].f23689y), Integer.toBinaryString(this.f21224q[i2].f23689y), i2);
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static int m12556y(int i2) {
        return i2 | 16384;
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3564a.class != obj.getClass()) {
            return false;
        }
        C3564a c3564a = (C3564a) obj;
        return this.f21222k == c3564a.f21222k && Arrays.equals(this.f21224q, c3564a.f21224q);
    }

    public int hashCode() {
        if (this.f21223n == 0) {
            this.f21223n = 527 + Arrays.hashCode(this.f21224q);
        }
        return this.f21223n;
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m12554q(0), C3853q.f7l8(wlev.m16057i(this.f21224q)));
        return bundle;
    }

    public xwq3 toq(int i2) {
        return this.f21224q[i2];
    }

    public int zy(xwq3 xwq3Var) {
        int i2 = 0;
        while (true) {
            xwq3[] xwq3VarArr = this.f21224q;
            if (i2 >= xwq3VarArr.length) {
                return -1;
            }
            if (xwq3Var == xwq3VarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }
}

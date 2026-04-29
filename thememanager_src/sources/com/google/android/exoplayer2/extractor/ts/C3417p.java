package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.ts.d3;
import com.google.android.exoplayer2.util.C3838g;
import com.google.android.exoplayer2.xwq3;
import com.google.common.collect.se;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.p */
/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3417p implements d3.zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f64603f7l8 = 16;

    /* JADX INFO: renamed from: g */
    public static final int f20351g = 8;

    /* JADX INFO: renamed from: n */
    public static final int f20352n = 4;

    /* JADX INFO: renamed from: p */
    private static final int f20353p = 134;

    /* JADX INFO: renamed from: q */
    public static final int f20354q = 2;

    /* JADX INFO: renamed from: s */
    public static final int f20355s = 64;

    /* JADX INFO: renamed from: y */
    public static final int f20356y = 32;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f64604zy = 1;

    /* JADX INFO: renamed from: k */
    private final int f20357k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<xwq3> f64605toq;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.p$k */
    /* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3417p() {
        this(0);
    }

    /* JADX INFO: renamed from: g */
    private boolean m12007g(int i2) {
        return (i2 & this.f20357k) != 0;
    }

    /* JADX INFO: renamed from: n */
    private List<xwq3> m12008n(d3.toq toqVar) {
        String str;
        int i2;
        if (m12007g(32)) {
            return this.f64605toq;
        }
        com.google.android.exoplayer2.util.gvn7 gvn7Var = new com.google.android.exoplayer2.util.gvn7(toqVar.f20204q);
        List<xwq3> arrayList = this.f64605toq;
        while (gvn7Var.m13594k() > 0) {
            int iJp0y = gvn7Var.jp0y();
            int iM13596n = gvn7Var.m13596n() + gvn7Var.jp0y();
            if (iJp0y == 134) {
                arrayList = new ArrayList<>();
                int iJp0y2 = gvn7Var.jp0y() & 31;
                for (int i3 = 0; i3 < iJp0y2; i3++) {
                    String strJk = gvn7Var.jk(3);
                    int iJp0y3 = gvn7Var.jp0y();
                    boolean z2 = (iJp0y3 & 128) != 0;
                    if (z2) {
                        i2 = iJp0y3 & 63;
                        str = com.google.android.exoplayer2.util.wvg.f67119lv5;
                    } else {
                        str = com.google.android.exoplayer2.util.wvg.f67127nmn5;
                        i2 = 1;
                    }
                    byte bJp0y = (byte) gvn7Var.jp0y();
                    gvn7Var.hyr(1);
                    List<byte[]> qVar = null;
                    if (z2) {
                        qVar = C3838g.toq((bJp0y & 64) != 0);
                    }
                    arrayList.add(new xwq3.toq().m13945m(str).m13940c(strJk).fti(i2).hyr(qVar).a9());
                }
            }
            gvn7Var.n5r1(iM13596n);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    private eqxt m12009q(d3.toq toqVar) {
        return new eqxt(m12008n(toqVar));
    }

    private jk zy(d3.toq toqVar) {
        return new jk(m12008n(toqVar));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3.zy
    /* JADX INFO: renamed from: k */
    public SparseArray<d3> mo11953k() {
        return new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.d3.zy
    @dd
    public d3 toq(int i2, d3.toq toqVar) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new ni7(new C3412i(toqVar.f64436toq));
            }
            if (i2 == 21) {
                return new ni7(new ki());
            }
            if (i2 == 27) {
                if (m12007g(4)) {
                    return null;
                }
                return new ni7(new C3411h(zy(toqVar), m12007g(1), m12007g(8)));
            }
            if (i2 == 36) {
                return new ni7(new cdj(zy(toqVar)));
            }
            if (i2 == 89) {
                return new ni7(new x2(toqVar.f64437zy));
            }
            if (i2 != 138) {
                if (i2 == 172) {
                    return new ni7(new C3409g(toqVar.f64436toq));
                }
                if (i2 == 257) {
                    return new mcp(new zurt(com.google.android.exoplayer2.util.wvg.f67103fnq8));
                }
                if (i2 == 134) {
                    if (m12007g(16)) {
                        return null;
                    }
                    return new mcp(new zurt(com.google.android.exoplayer2.util.wvg.f23316v));
                }
                if (i2 != 135) {
                    switch (i2) {
                        case 15:
                            if (!m12007g(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!m12007g(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i2) {
                                case 130:
                                    if (!m12007g(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new ni7(new zy(toqVar.f64436toq));
            }
            return new ni7(new ld6(toqVar.f64436toq));
        }
        return new ni7(new n7h(m12009q(toqVar)));
    }

    public C3417p(int i2) {
        this(i2, se.of());
    }

    public C3417p(int i2, List<xwq3> list) {
        this.f20357k = i2;
        this.f64605toq = list;
    }
}

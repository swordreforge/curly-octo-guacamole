package kotlin.time;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.time.C6467n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class qrj {
    private static final long f7l8(long j2, long j3, EnumC6474y enumC6474y) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return f7l8.zp(j4, enumC6474y);
        }
        EnumC6474y enumC6474y2 = EnumC6474y.MILLISECONDS;
        if (enumC6474y.compareTo(enumC6474y2) >= 0) {
            return C6467n.dr(toq(j4));
        }
        long qVar = C6468p.toq(1L, enumC6474y2, enumC6474y);
        long j5 = (j2 / qVar) - (j3 / qVar);
        long j6 = (j2 % qVar) - (j3 % qVar);
        C6467n.k kVar = C6467n.f36743q;
        return C6467n.y9n(f7l8.zp(j5, enumC6474y2), f7l8.zp(j6, enumC6474y));
    }

    /* JADX INFO: renamed from: g */
    public static final long m23752g(long j2, long j3, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        return ((1 | (j3 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j3 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? C6467n.dr(toq(j3)) : f7l8(j2, j3, unit);
    }

    /* JADX INFO: renamed from: k */
    private static final long m23753k(long j2, long j3, long j4) {
        if (!C6467n.m23712o(j3) || (j2 ^ j4) >= 0) {
            return j2;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* JADX INFO: renamed from: n */
    private static final long m23754n(long j2, EnumC6474y enumC6474y, long j3) {
        long jKja0 = C6467n.kja0(j3, 2);
        long jLv5 = C6467n.lv5(jKja0, enumC6474y);
        return ((1 | (jLv5 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (jLv5 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? jLv5 : m23755q(m23755q(j2, enumC6474y, jKja0), enumC6474y, C6467n.yz(j3, jKja0));
    }

    /* JADX INFO: renamed from: q */
    public static final long m23755q(long j2, @InterfaceC7396q EnumC6474y unit, long j3) {
        d2ok.m23075h(unit, "unit");
        long jLv5 = C6467n.lv5(j3, unit);
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return m23753k(j2, j3, jLv5);
        }
        if ((1 | (jLv5 - 1)) == Long.MAX_VALUE) {
            return m23754n(j2, unit, j3);
        }
        long j4 = j2 + jLv5;
        return ((j2 ^ j4) & (jLv5 ^ j4)) < 0 ? j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j4;
    }

    private static final long toq(long j2) {
        return j2 < 0 ? C6467n.f36743q.oc() : C6467n.f36743q.cdj();
    }

    /* JADX INFO: renamed from: y */
    public static final long m23756y(long j2, long j3, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            return j2 == j3 ? C6467n.f36743q.lrht() : C6467n.dr(toq(j3));
        }
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? toq(j2) : f7l8(j2, j3, unit);
    }

    public static final boolean zy(long j2) {
        return ((j2 - 1) | 1) == Long.MAX_VALUE;
    }
}

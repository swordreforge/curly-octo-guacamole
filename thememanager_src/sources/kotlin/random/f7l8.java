package kotlin.random;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.ranges.kja0;
import kotlin.ranges.x2;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public final class f7l8 {
    public static final int f7l8(int i2) {
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m23269g(long j2, long j3) {
        if (!(j3 > j2)) {
            throw new IllegalArgumentException(zy(Long.valueOf(j2), Long.valueOf(j3)).toString());
        }
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static final AbstractC6332g m23270k(int i2) {
        return new C6336s(i2, i2 >> 31);
    }

    /* JADX INFO: renamed from: n */
    public static final void m23271n(int i2, int i3) {
        if (!(i3 > i2)) {
            throw new IllegalArgumentException(zy(Integer.valueOf(i2), Integer.valueOf(i3)).toString());
        }
    }

    /* JADX INFO: renamed from: p */
    public static final int m23272p(int i2, int i3) {
        return (i2 >>> (32 - i3)) & ((-i3) >> 31);
    }

    /* JADX INFO: renamed from: q */
    public static final void m23273q(double d2, double d4) {
        if (!(d4 > d2)) {
            throw new IllegalArgumentException(zy(Double.valueOf(d2), Double.valueOf(d4)).toString());
        }
    }

    @yz(version = "1.3")
    /* JADX INFO: renamed from: s */
    public static final long m23274s(@InterfaceC7396q AbstractC6332g abstractC6332g, @InterfaceC7396q kja0 range) {
        d2ok.m23075h(abstractC6332g, "<this>");
        d2ok.m23075h(range, "range");
        if (!range.isEmpty()) {
            return range.m23360y() < Long.MAX_VALUE ? abstractC6332g.nextLong(range.f7l8(), range.m23360y() + 1) : range.f7l8() > Long.MIN_VALUE ? abstractC6332g.nextLong(range.f7l8() - 1, range.m23360y()) + 1 : abstractC6332g.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    public static final AbstractC6332g toq(long j2) {
        return new C6336s((int) j2, (int) (j2 >> 32));
    }

    @yz(version = "1.3")
    /* JADX INFO: renamed from: y */
    public static final int m23275y(@InterfaceC7396q AbstractC6332g abstractC6332g, @InterfaceC7396q x2 range) {
        d2ok.m23075h(abstractC6332g, "<this>");
        d2ok.m23075h(range, "range");
        if (!range.isEmpty()) {
            return range.m23353y() < Integer.MAX_VALUE ? abstractC6332g.nextInt(range.f7l8(), range.m23353y() + 1) : range.f7l8() > Integer.MIN_VALUE ? abstractC6332g.nextInt(range.f7l8() - 1, range.m23353y()) + 1 : abstractC6332g.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @InterfaceC7396q
    public static final String zy(@InterfaceC7396q Object from, @InterfaceC7396q Object until) {
        d2ok.m23075h(from, "from");
        d2ok.m23075h(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }
}

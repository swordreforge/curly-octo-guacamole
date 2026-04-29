package kotlin.random;

import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.ranges.fu4;
import kotlin.ranges.wvg;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.random.y */
/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class C6338y {
    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final int f7l8(@InterfaceC7396q AbstractC6332g abstractC6332g) {
        d2ok.m23075h(abstractC6332g, "<this>");
        return gyi.ld6(abstractC6332g.nextInt());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ byte[] m23279g(AbstractC6332g abstractC6332g, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bo.n7h(bArr);
        }
        return m23281n(abstractC6332g, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public static final void m23280k(int i2, int i3) {
        if (!(Integer.compareUnsigned(i3, i2) > 0)) {
            throw new IllegalArgumentException(f7l8.zy(gyi.zy(i2), gyi.zy(i3)).toString());
        }
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long ld6(@InterfaceC7396q AbstractC6332g abstractC6332g) {
        d2ok.m23075h(abstractC6332g, "<this>");
        return ikck.ld6(abstractC6332g.nextLong());
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: n */
    public static final byte[] m23281n(@InterfaceC7396q AbstractC6332g nextUBytes, @InterfaceC7396q byte[] array, int i2, int i3) {
        d2ok.m23075h(nextUBytes, "$this$nextUBytes");
        d2ok.m23075h(array, "array");
        nextUBytes.nextBytes(array, i2, i3);
        return array;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long n7h(@InterfaceC7396q AbstractC6332g nextULong, long j2, long j3) {
        d2ok.m23075h(nextULong, "$this$nextULong");
        toq(j2, j3);
        return ikck.ld6(nextULong.nextLong(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: p */
    public static final int m23282p(@InterfaceC7396q AbstractC6332g nextUInt, int i2) {
        d2ok.m23075h(nextUInt, "$this$nextUInt");
        return m23284s(nextUInt, 0, i2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: q */
    public static final byte[] m23283q(@InterfaceC7396q AbstractC6332g nextUBytes, @InterfaceC7396q byte[] array) {
        d2ok.m23075h(nextUBytes, "$this$nextUBytes");
        d2ok.m23075h(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long qrj(@InterfaceC7396q AbstractC6332g nextULong, long j2) {
        d2ok.m23075h(nextULong, "$this$nextULong");
        return n7h(nextULong, 0L, j2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: s */
    public static final int m23284s(@InterfaceC7396q AbstractC6332g nextUInt, int i2, int i3) {
        d2ok.m23075h(nextUInt, "$this$nextUInt");
        m23280k(i2, i3);
        return gyi.ld6(nextUInt.nextInt(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    public static final void toq(long j2, long j3) {
        if (!(Long.compareUnsigned(j3, j2) > 0)) {
            throw new IllegalArgumentException(f7l8.zy(ikck.zy(j2), ikck.zy(j3)).toString());
        }
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final long x2(@InterfaceC7396q AbstractC6332g abstractC6332g, @InterfaceC7396q wvg range) {
        d2ok.m23075h(abstractC6332g, "<this>");
        d2ok.m23075h(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compareUnsigned(range.m23370y(), -1L) < 0) {
            return n7h(abstractC6332g, range.f7l8(), ikck.ld6(range.m23370y() + ikck.ld6(((long) 1) & 4294967295L)));
        }
        if (Long.compareUnsigned(range.f7l8(), 0L) <= 0) {
            return ld6(abstractC6332g);
        }
        long j2 = ((long) 1) & 4294967295L;
        return ikck.ld6(n7h(abstractC6332g, ikck.ld6(range.f7l8() - ikck.ld6(j2)), range.m23370y()) + ikck.ld6(j2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: y */
    public static final int m23285y(@InterfaceC7396q AbstractC6332g abstractC6332g, @InterfaceC7396q fu4 range) {
        d2ok.m23075h(abstractC6332g, "<this>");
        d2ok.m23075h(range, "range");
        if (!range.isEmpty()) {
            return Integer.compareUnsigned(range.m23373y(), -1) < 0 ? m23284s(abstractC6332g, range.f7l8(), gyi.ld6(range.m23373y() + 1)) : Integer.compareUnsigned(range.f7l8(), 0) > 0 ? gyi.ld6(m23284s(abstractC6332g, gyi.ld6(range.f7l8() - 1), range.m23373y()) + 1) : f7l8(abstractC6332g);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final byte[] zy(@InterfaceC7396q AbstractC6332g abstractC6332g, int i2) {
        d2ok.m23075h(abstractC6332g, "<this>");
        return bo.m22412g(abstractC6332g.nextBytes(i2));
    }
}

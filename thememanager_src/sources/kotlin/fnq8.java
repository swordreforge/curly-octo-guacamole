package kotlin;

import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6769y;

/* JADX INFO: compiled from: UNumbers.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "UNumbersKt")
public final class fnq8 {
    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long cdj(long j2, int i2) {
        return ikck.ld6(Long.rotateRight(j2, i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int f7l8(int i2) {
        return Integer.bitCount(i2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final byte fn3e(byte b2) {
        return C6475u.ld6((byte) Integer.highestOneBit(b2 & 255));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final short fu4(short s2) {
        return qo.ld6((short) Integer.highestOneBit(s2 & qo.f36486g));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: g */
    private static final int m22814g(long j2) {
        return Long.bitCount(j2);
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    /* JADX INFO: renamed from: h */
    private static final short m22815h(short s2, int i2) {
        return qo.ld6(ncyb.yqrt(s2, i2));
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    /* JADX INFO: renamed from: i */
    private static final short m22816i(short s2, int i2) {
        return qo.ld6(ncyb.bwp(s2, i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: k */
    private static final int m22817k(byte b2) {
        return Integer.numberOfLeadingZeros(b2 & 255) - 24;
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final byte ki(byte b2, int i2) {
        return C6475u.ld6(ncyb.kcsr(b2, i2));
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final int kja0(int i2, int i3) {
        return gyi.ld6(Integer.rotateLeft(i2, i3));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int ld6(int i2) {
        return Integer.numberOfTrailingZeros(i2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: n */
    private static final int m22818n(byte b2) {
        return Integer.bitCount(gyi.ld6(b2 & 255));
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final byte n7h(byte b2, int i2) {
        return C6475u.ld6(ncyb.z4(b2, i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int ni7(int i2) {
        return gyi.ld6(Integer.highestOneBit(i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long o1t(long j2) {
        return ikck.ld6(Long.lowestOneBit(j2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: p */
    private static final int m22819p(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: q */
    private static final int m22820q(short s2) {
        return Integer.numberOfLeadingZeros(s2 & qo.f36486g) - 16;
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long qrj(long j2, int i2) {
        return ikck.ld6(Long.rotateLeft(j2, i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: s */
    private static final int m22821s(byte b2) {
        return Integer.numberOfTrailingZeros(b2 | 256);
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: t */
    private static final short m22822t(short s2) {
        return qo.ld6((short) Integer.lowestOneBit(s2 & qo.f36486g));
    }

    @i9jn(markerClass = {ki.class, InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final int t8r(int i2, int i3) {
        return gyi.ld6(Integer.rotateRight(i2, i3));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int toq(long j2) {
        return Long.numberOfLeadingZeros(j2);
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int wvg(int i2) {
        return gyi.ld6(Integer.lowestOneBit(i2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int x2(short s2) {
        return Integer.numberOfTrailingZeros(s2 | 65536);
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: y */
    private static final int m22823y(short s2) {
        return Integer.bitCount(gyi.ld6(s2 & qo.f36486g));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: z */
    private static final byte m22824z(byte b2) {
        return C6475u.ld6((byte) Integer.lowestOneBit(b2 & 255));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long zurt(long j2) {
        return ikck.ld6(Long.highestOneBit(j2));
    }

    @i9jn(markerClass = {InterfaceC6232i.class, ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int zy(int i2) {
        return Integer.numberOfLeadingZeros(i2);
    }
}

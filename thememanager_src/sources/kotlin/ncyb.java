package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: Numbers.kt */
/* JADX INFO: loaded from: classes3.dex */
class ncyb extends x9kr {
    @i9jn(markerClass = {ki.class})
    @yz(version = "1.6")
    public static final short bwp(short s2, int i2) {
        int i3 = i2 & 15;
        return (short) (((s2 & 65535) >>> i3) | (s2 << (16 - i3)));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final short bz2(short s2) {
        return (short) Integer.lowestOneBit(s2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int cfr(byte b2) {
        return Integer.numberOfTrailingZeros(b2 | 256);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int etdu(byte b2) {
        return Integer.bitCount(b2 & 255);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final short gc3c(short s2) {
        return (short) Integer.highestOneBit(s2 & qo.f36486g);
    }

    @i9jn(markerClass = {ki.class})
    @yz(version = "1.6")
    public static final byte kcsr(byte b2, int i2) {
        int i3 = i2 & 7;
        return (byte) (((b2 & 255) >>> i3) | (b2 << (8 - i3)));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int m4(byte b2) {
        return Integer.numberOfLeadingZeros(b2 & 255) - 24;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final byte se(byte b2) {
        return (byte) Integer.highestOneBit(b2 & 255);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int sok(short s2) {
        return Integer.bitCount(s2 & qo.f36486g);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int v0af(short s2) {
        return Integer.numberOfLeadingZeros(s2 & qo.f36486g) - 16;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int w831(short s2) {
        return Integer.numberOfTrailingZeros(s2 | 65536);
    }

    @i9jn(markerClass = {ki.class})
    @yz(version = "1.6")
    public static final short yqrt(short s2, int i2) {
        int i3 = i2 & 15;
        return (short) (((s2 & 65535) >>> (16 - i3)) | (s2 << i3));
    }

    @i9jn(markerClass = {ki.class})
    @yz(version = "1.6")
    public static final byte z4(byte b2, int i2) {
        int i3 = i2 & 7;
        return (byte) (((b2 & 255) >>> (8 - i3)) | (b2 << i3));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final byte zkd(byte b2) {
        return (byte) Integer.lowestOneBit(b2);
    }
}

package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: NumbersJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
class x9kr extends dd {
    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int bo(long j2) {
        return Long.numberOfLeadingZeros(j2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int c8jq(long j2) {
        return Long.bitCount(j2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: d */
    private static final boolean m23804d(float f2) {
        return (Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true;
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long d8wk(long j2, int i2) {
        return Long.rotateRight(j2, i2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int dr(long j2) {
        return Long.numberOfTrailingZeros(j2);
    }

    @InterfaceC6234g
    private static final boolean fnq8(float f2) {
        return Float.isNaN(f2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int g1(int i2) {
        return Integer.highestOneBit(i2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int gbni(int i2) {
        return Integer.lowestOneBit(i2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int gyi(int i2) {
        return Integer.numberOfTrailingZeros(i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final long i9jn(double d2) {
        return Double.doubleToLongBits(d2);
    }

    @InterfaceC6234g
    private static final boolean ikck(double d2) {
        return (Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final int ltg8(float f2) {
        return Float.floatToRawIntBits(f2);
    }

    @InterfaceC6234g
    private static final boolean mu(double d2) {
        return Double.isInfinite(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final int py(float f2) {
        return Float.floatToIntBits(f2);
    }

    @InterfaceC6234g
    private static final boolean qkj8(double d2) {
        return Double.isNaN(d2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final int qo(int i2, int i3) {
        return Integer.rotateLeft(i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final long r8s8(double d2) {
        return Double.doubleToRawLongBits(d2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long tfm(long j2, int i2) {
        return Long.rotateLeft(j2, i2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: u */
    private static final int m23805u(int i2) {
        return Integer.numberOfLeadingZeros(i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: v */
    private static final float m23806v(kotlin.jvm.internal.wvg wvgVar, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(wvgVar, "<this>");
        return Float.intBitsToFloat(i2);
    }

    @InterfaceC6234g
    private static final boolean vq(float f2) {
        return Float.isInfinite(f2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final long was(long j2) {
        return Long.highestOneBit(j2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final int wo(int i2, int i3) {
        return Integer.rotateRight(i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double xwq3(kotlin.jvm.internal.fu4 fu4Var, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(fu4Var, "<this>");
        return Double.longBitsToDouble(j2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final int y2(int i2) {
        return Integer.bitCount(i2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final long zsr0(long j2) {
        return Long.lowestOneBit(j2);
    }
}

package com.google.common.primitives;

import com.google.common.base.jk;
import java.math.BigInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.primitives.h */
/* JADX INFO: compiled from: UnsignedInteger.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class C4737h extends Number implements Comparable<C4737h> {
    private final int value;
    public static final C4737h ZERO = fromIntBits(0);
    public static final C4737h ONE = fromIntBits(1);
    public static final C4737h MAX_VALUE = fromIntBits(-1);

    private C4737h(int i2) {
        this.value = i2 & (-1);
    }

    public static C4737h fromIntBits(int i2) {
        return new C4737h(i2);
    }

    public static C4737h valueOf(long j2) {
        jk.m15374h((4294967295L & j2) == j2, "value (%s) is outside the range for an unsigned integer value", j2);
        return fromIntBits((int) j2);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    public C4737h dividedBy(C4737h c4737h) {
        return fromIntBits(cdj.m16628q(this.value, ((C4737h) jk.a9(c4737h)).value));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof C4737h) && this.value == ((C4737h) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.value;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return cdj.ki(this.value);
    }

    public C4737h minus(C4737h c4737h) {
        return fromIntBits(this.value - ((C4737h) jk.a9(c4737h)).value);
    }

    public C4737h mod(C4737h c4737h) {
        return fromIntBits(cdj.x2(this.value, ((C4737h) jk.a9(c4737h)).value));
    }

    public C4737h plus(C4737h c4737h) {
        return fromIntBits(this.value + ((C4737h) jk.a9(c4737h)).value);
    }

    @wlev.zy
    public C4737h times(C4737h c4737h) {
        return fromIntBits(this.value * ((C4737h) jk.a9(c4737h)).value);
    }

    public String toString() {
        return toString(10);
    }

    @Override // java.lang.Comparable
    public int compareTo(C4737h c4737h) {
        jk.a9(c4737h);
        return cdj.toq(this.value, c4737h.value);
    }

    public String toString(int i2) {
        return cdj.m16624i(this.value, i2);
    }

    public static C4737h valueOf(BigInteger bigInteger) {
        jk.a9(bigInteger);
        jk.fn3e(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return fromIntBits(bigInteger.intValue());
    }

    public static C4737h valueOf(String str) {
        return valueOf(str, 10);
    }

    public static C4737h valueOf(String str, int i2) {
        return fromIntBits(cdj.ld6(str, i2));
    }
}

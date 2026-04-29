package com.google.common.primitives;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.math.BigInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: UnsignedLong.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
public final class ki extends Number implements Comparable<ki>, Serializable {

    /* JADX INFO: renamed from: k */
    private static final long f27284k = Long.MAX_VALUE;
    private final long value;
    public static final ki ZERO = new ki(0);
    public static final ki ONE = new ki(1);
    public static final ki MAX_VALUE = new ki(-1);

    private ki(long j2) {
        this.value = j2;
    }

    public static ki fromLongBits(long j2) {
        return new ki(j2);
    }

    @CanIgnoreReturnValue
    public static ki valueOf(long j2) {
        jk.m15374h(j2 >= 0, "value (%s) is outside the range for an unsigned long value", j2);
        return fromLongBits(j2);
    }

    public BigInteger bigIntegerValue() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.value & Long.MAX_VALUE);
        return this.value < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    public ki dividedBy(ki kiVar) {
        return fromLongBits(t8r.zy(this.value, ((ki) jk.a9(kiVar)).value));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j2 = this.value;
        double d2 = Long.MAX_VALUE & j2;
        return j2 < 0 ? d2 + 9.223372036854776E18d : d2;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof ki) && this.value == ((ki) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j2 = this.value;
        float f2 = Long.MAX_VALUE & j2;
        return j2 < 0 ? f2 + 9.223372E18f : f2;
    }

    public int hashCode() {
        return C4743p.ld6(this.value);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public ki minus(ki kiVar) {
        return fromLongBits(this.value - ((ki) jk.a9(kiVar)).value);
    }

    public ki mod(ki kiVar) {
        return fromLongBits(t8r.ld6(this.value, ((ki) jk.a9(kiVar)).value));
    }

    public ki plus(ki kiVar) {
        return fromLongBits(this.value + ((ki) jk.a9(kiVar)).value);
    }

    public ki times(ki kiVar) {
        return fromLongBits(this.value * ((ki) jk.a9(kiVar)).value);
    }

    public String toString() {
        return t8r.m16724h(this.value);
    }

    @Override // java.lang.Comparable
    public int compareTo(ki kiVar) {
        jk.a9(kiVar);
        return t8r.m16725k(this.value, kiVar.value);
    }

    public String toString(int i2) {
        return t8r.cdj(this.value, i2);
    }

    @CanIgnoreReturnValue
    public static ki valueOf(BigInteger bigInteger) {
        jk.a9(bigInteger);
        jk.fn3e(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    @CanIgnoreReturnValue
    public static ki valueOf(String str) {
        return valueOf(str, 10);
    }

    @CanIgnoreReturnValue
    public static ki valueOf(String str, int i2) {
        return fromLongBits(t8r.m16727p(str, i2));
    }
}

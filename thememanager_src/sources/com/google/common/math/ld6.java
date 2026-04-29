package com.google.common.math;

import com.google.common.base.C4280z;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.primitives.C4744q;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Stats.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class ld6 implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    ld6(long j2, double d2, double d4, double d5, double d6) {
        this.count = j2;
        this.mean = d2;
        this.sumOfSquaresOfDeltas = d4;
        this.min = d5;
        this.max = d6;
    }

    public static ld6 fromByteArray(byte[] bArr) {
        jk.a9(bArr);
        jk.qrj(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static ld6 of(Iterable<? extends Number> iterable) {
        x2 x2Var = new x2();
        x2Var.zy(iterable);
        return x2Var.cdj();
    }

    static ld6 readFrom(ByteBuffer byteBuffer) {
        jk.a9(byteBuffer);
        jk.qrj(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new ld6(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long count() {
        return this.count;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || ld6.class != obj.getClass()) {
            return false;
        }
        ld6 ld6Var = (ld6) obj;
        return this.count == ld6Var.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(ld6Var.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(ld6Var.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(ld6Var.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(ld6Var.max);
    }

    public int hashCode() {
        return C4280z.toq(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public double max() {
        jk.yz(this.count != 0);
        return this.max;
    }

    public double mean() {
        jk.yz(this.count != 0);
        return this.mean;
    }

    public double min() {
        jk.yz(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        jk.yz(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return zy.toq(this.sumOfSquaresOfDeltas) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        jk.yz(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return zy.toq(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public double sum() {
        return this.mean * this.count;
    }

    double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? fu4.zy(this).m15359n("count", this.count).toq("mean", this.mean).toq("populationStandardDeviation", populationStandardDeviation()).toq("min", this.min).toq("max", this.max).toString() : fu4.zy(this).m15359n("count", this.count).toString();
    }

    void writeTo(ByteBuffer byteBuffer) {
        jk.a9(byteBuffer);
        jk.qrj(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static double meanOf(Iterator<? extends Number> it) {
        jk.m15383q(it.hasNext());
        double dDoubleValue = it.next().doubleValue();
        long j2 = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            j2++;
            dDoubleValue = (C4744q.n7h(dDoubleValue2) && C4744q.n7h(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j2) : x2.m16566y(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public static ld6 of(Iterator<? extends Number> it) {
        x2 x2Var = new x2();
        x2Var.m16572q(it);
        return x2Var.cdj();
    }

    public static ld6 of(double... dArr) {
        x2 x2Var = new x2();
        x2Var.m16570n(dArr);
        return x2Var.cdj();
    }

    public static double meanOf(double... dArr) {
        jk.m15383q(dArr.length > 0);
        double dM16566y = dArr[0];
        for (int i2 = 1; i2 < dArr.length; i2++) {
            double d2 = dArr[i2];
            dM16566y = (C4744q.n7h(d2) && C4744q.n7h(dM16566y)) ? dM16566y + ((d2 - dM16566y) / ((double) (i2 + 1))) : x2.m16566y(dM16566y, d2);
        }
        return dM16566y;
    }

    public static ld6 of(int... iArr) {
        x2 x2Var = new x2();
        x2Var.m16567g(iArr);
        return x2Var.cdj();
    }

    public static ld6 of(long... jArr) {
        x2 x2Var = new x2();
        x2Var.f7l8(jArr);
        return x2Var.cdj();
    }

    public static double meanOf(int... iArr) {
        jk.m15383q(iArr.length > 0);
        double dM16566y = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            double d2 = iArr[i2];
            dM16566y = (C4744q.n7h(d2) && C4744q.n7h(dM16566y)) ? dM16566y + ((d2 - dM16566y) / ((double) (i2 + 1))) : x2.m16566y(dM16566y, d2);
        }
        return dM16566y;
    }

    public static double meanOf(long... jArr) {
        jk.m15383q(jArr.length > 0);
        double dM16566y = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            double d2 = jArr[i2];
            dM16566y = (C4744q.n7h(d2) && C4744q.n7h(dM16566y)) ? dM16566y + ((d2 - dM16566y) / ((double) (i2 + 1))) : x2.m16566y(dM16566y, d2);
        }
        return dM16566y;
    }
}

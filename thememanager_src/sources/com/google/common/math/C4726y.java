package com.google.common.math;

import com.google.common.base.C4280z;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.math.y */
/* JADX INFO: compiled from: PairedStats.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4726y implements Serializable {

    /* JADX INFO: renamed from: k */
    private static final int f27190k = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final ld6 xStats;
    private final ld6 yStats;

    C4726y(ld6 ld6Var, ld6 ld6Var2, double d2) {
        this.xStats = ld6Var;
        this.yStats = ld6Var2;
        this.sumOfProductsOfDeltas = d2;
    }

    public static C4726y fromByteArray(byte[] bArr) {
        jk.a9(bArr);
        jk.qrj(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new C4726y(ld6.readFrom(byteBufferOrder), ld6.readFrom(byteBufferOrder), byteBufferOrder.getDouble());
    }

    /* JADX INFO: renamed from: k */
    private static double m16574k(double d2) {
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        if (d2 <= -1.0d) {
            return -1.0d;
        }
        return d2;
    }

    private static double toq(double d2) {
        if (d2 > 0.0d) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    public long count() {
        return this.xStats.count();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || C4726y.class != obj.getClass()) {
            return false;
        }
        C4726y c4726y = (C4726y) obj;
        return this.xStats.equals(c4726y.xStats) && this.yStats.equals(c4726y.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(c4726y.sumOfProductsOfDeltas);
    }

    public int hashCode() {
        return C4280z.toq(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public AbstractC4721n leastSquaresFit() {
        jk.yz(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return AbstractC4721n.m16517k();
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (dSumOfSquaresOfDeltas > 0.0d) {
            return this.yStats.sumOfSquaresOfDeltas() > 0.0d ? AbstractC4721n.m16516g(this.xStats.mean(), this.yStats.mean()).toq(this.sumOfProductsOfDeltas / dSumOfSquaresOfDeltas) : AbstractC4721n.toq(this.yStats.mean());
        }
        jk.yz(this.yStats.sumOfSquaresOfDeltas() > 0.0d);
        return AbstractC4721n.m16518s(this.xStats.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        jk.yz(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        jk.yz(dSumOfSquaresOfDeltas > 0.0d);
        jk.yz(dSumOfSquaresOfDeltas2 > 0.0d);
        return m16574k(this.sumOfProductsOfDeltas / Math.sqrt(toq(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public double populationCovariance() {
        jk.yz(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        jk.yz(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(byteBufferOrder);
        this.yStats.writeTo(byteBufferOrder);
        byteBufferOrder.putDouble(this.sumOfProductsOfDeltas);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? fu4.zy(this).m15356g("xStats", this.xStats).m15356g("yStats", this.yStats).toq("populationCovariance", populationCovariance()).toString() : fu4.zy(this).m15356g("xStats", this.xStats).m15356g("yStats", this.yStats).toString();
    }

    public ld6 xStats() {
        return this.xStats;
    }

    public ld6 yStats() {
        return this.yStats;
    }
}

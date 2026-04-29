package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: BigDecimals.kt */
/* JADX INFO: loaded from: classes3.dex */
class lvui {
    @InterfaceC6234g
    private static final BigDecimal f7l8(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalMultiply, "this.multiply(other)");
        return bigDecimalMultiply;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final BigDecimal m23182g(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalRemainder, "this.remainder(other)");
        return bigDecimalRemainder;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final BigDecimal m23183h(BigDecimal bigDecimal) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        kotlin.jvm.internal.d2ok.kja0(bigDecimalNegate, "this.negate()");
        return bigDecimalNegate;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: k */
    private static final BigDecimal m23184k(BigDecimal bigDecimal) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalSubtract, "this.subtract(BigDecimal.ONE)");
        return bigDecimalSubtract;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal kja0(long j2, MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(j2, mathContext);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal ld6(float f2, MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f2), mathContext);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final BigDecimal m23185n(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(other);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalAdd, "this.add(other)");
        return bigDecimalAdd;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal n7h(long j2) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this)");
        return bigDecimalValueOf;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: p */
    private static final BigDecimal m23186p(float f2) {
        return new BigDecimal(String.valueOf(f2));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final BigDecimal m23187q(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalSubtract, "this.subtract(other)");
        return bigDecimalSubtract;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal qrj(int i2, MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(i2, mathContext);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: s */
    private static final BigDecimal m23188s(double d2, MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d2), mathContext);
    }

    @InterfaceC6234g
    private static final BigDecimal toq(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalDivide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return bigDecimalDivide;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal x2(int i2) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i2);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        return bigDecimalValueOf;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: y */
    private static final BigDecimal m23189y(double d2) {
        return new BigDecimal(String.valueOf(d2));
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal zy(BigDecimal bigDecimal) {
        kotlin.jvm.internal.d2ok.m23075h(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalAdd, "this.add(BigDecimal.ONE)");
        return bigDecimalAdd;
    }
}

package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: renamed from: kotlin.r */
/* JADX INFO: compiled from: BigIntegers.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6331r extends lvui {
    static /* synthetic */ BigDecimal a9(BigInteger bigInteger, int i2, MathContext mathContext, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.d2ok.kja0(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i2, mathContext);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger cdj(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerAnd = bigInteger.and(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerAnd, "this.and(other)");
        return bigIntegerAnd;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger d3(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerXor = bigInteger.xor(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerXor, "this.xor(other)");
        return bigIntegerXor;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger fn3e(BigInteger bigInteger) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        kotlin.jvm.internal.d2ok.kja0(bigIntegerNot, "this.not()");
        return bigIntegerNot;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger fti(int i2) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i2);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        return bigIntegerValueOf;
    }

    @InterfaceC6234g
    private static final BigInteger fu4(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerAdd = bigInteger.add(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerAdd, "this.add(other)");
        return bigIntegerAdd;
    }

    @InterfaceC6234g
    private static final BigInteger gvn7(BigInteger bigInteger) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        kotlin.jvm.internal.d2ok.kja0(bigIntegerNegate, "this.negate()");
        return bigIntegerNegate;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: i */
    private static final BigInteger m23266i(BigInteger bigInteger) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerAdd, "this.add(BigInteger.ONE)");
        return bigIntegerAdd;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal jk(BigInteger bigInteger, int i2, MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i2, mathContext);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger jp0y(long j2) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this)");
        return bigIntegerValueOf;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger ki(BigInteger bigInteger) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerSubtract, "this.subtract(BigInteger.ONE)");
        return bigIntegerSubtract;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal mcp(BigInteger bigInteger) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger ni7(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerOr = bigInteger.or(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerOr, "this.or(other)");
        return bigIntegerOr;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger o1t(BigInteger bigInteger, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i2);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerShiftLeft, "this.shiftLeft(n)");
        return bigIntegerShiftLeft;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final BigInteger m23267t(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerMultiply, "this.multiply(other)");
        return bigIntegerMultiply;
    }

    @InterfaceC6234g
    private static final BigInteger t8r(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerDivide, "this.divide(other)");
        return bigIntegerDivide;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger wvg(BigInteger bigInteger, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i2);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerShiftRight, "this.shiftRight(n)");
        return bigIntegerShiftRight;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: z */
    private static final BigInteger m23268z(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerRemainder, "this.remainder(other)");
        return bigIntegerRemainder;
    }

    @InterfaceC6234g
    private static final BigInteger zurt(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.d2ok.m23075h(bigInteger, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerSubtract, "this.subtract(other)");
        return bigIntegerSubtract;
    }
}

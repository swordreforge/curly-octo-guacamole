package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
class mcp extends C6455t {
    private static final <T> T bo(String str, cyoe.x2<? super String, ? extends T> x2Var) {
        try {
            if (fn3e.f81919toq.matches(str)) {
                return x2Var.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal c8jq(String str, MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @InterfaceC7395n
    @yz(version = "1.2")
    /* JADX INFO: renamed from: d */
    public static final BigInteger m23579d(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        C6452q.m23604k(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i3 = str.charAt(0) == '-' ? 1 : 0; i3 < length; i3++) {
                if (C6452q.toq(str.charAt(i3), i2) < 0) {
                    return null;
                }
            }
        } else if (C6452q.toq(str.charAt(0), i2) < 0) {
            return null;
        }
        return new BigInteger(str, C6452q.m23604k(i2));
    }

    @InterfaceC6234g
    private static final int d8wk(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Integer.parseInt(str);
    }

    @InterfaceC7395n
    @yz(version = "1.2")
    public static final BigDecimal dr(@InterfaceC7396q String str, @InterfaceC7396q MathContext mathContext) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(mathContext, "mathContext");
        try {
            if (fn3e.f81919toq.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC6234g
    private static final double fnq8(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Double.parseDouble(str);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final int g1(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Integer.parseInt(str, C6452q.m23604k(i2));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final long gbni(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Long.parseLong(str, C6452q.m23604k(i2));
    }

    @InterfaceC7395n
    @yz(version = "1.2")
    public static final BigDecimal gyi(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        try {
            if (fn3e.f81919toq.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final String i9jn(byte b2, int i2) {
        String string = Integer.toString(b2, C6452q.m23604k(C6452q.m23604k(i2)));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC7395n
    @yz(version = "1.2")
    public static final BigInteger ikck(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return m23579d(str, 10);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final String ltg8(int i2, int i3) {
        String string = Integer.toString(i2, C6452q.m23604k(i3));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final String m4(short s2, int i2) {
        String string = Integer.toString(s2, C6452q.m23604k(C6452q.m23604k(i2)));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final boolean mu(String str) {
        return Boolean.parseBoolean(str);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final short py(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Short.parseShort(str, C6452q.m23604k(i2));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final byte qkj8(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Byte.parseByte(str, C6452q.m23604k(i2));
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Double qo(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        try {
            if (fn3e.f81919toq.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final String r8s8(long j2, int i2) {
        String string = Long.toString(j2, C6452q.m23604k(i2));
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC6234g
    private static final float tfm(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Float.parseFloat(str);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: v */
    private static final BigInteger m23580v(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return new BigInteger(str, C6452q.m23604k(i2));
    }

    @InterfaceC6234g
    private static final byte vq(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Byte.parseByte(str);
    }

    @InterfaceC6234g
    private static final long was(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Long.parseLong(str);
    }

    @InterfaceC7395n
    @yz(version = "1.1")
    public static final Float wo(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        try {
            if (fn3e.f81919toq.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigInteger xwq3(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return new BigInteger(str);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final BigDecimal y2(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return new BigDecimal(str);
    }

    @InterfaceC6234g
    private static final short zsr0(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return Short.parseShort(str);
    }
}

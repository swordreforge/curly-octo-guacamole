package kotlin.text;

import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.text.n */
/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
class C6450n extends C6452q {
    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.5")
    public static final char a9(int i2, int i3) {
        if (!new kotlin.ranges.x2(2, 36).x2(i3)) {
            throw new IllegalArgumentException("Invalid radix: " + i3 + ". Valid radix values are in range 2..36");
        }
        if (i2 >= 0 && i2 < i3) {
            return (char) (i2 < 10 ? i2 + 48 : ((char) (i2 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i2 + " does not represent a valid digit in radix " + i3);
    }

    public static final boolean d2ok(char c2) {
        return new kotlin.ranges.zy((char) 55296, (char) 57343).x2(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final Integer d3(char c2, int i2) {
        C6452q.m23604k(i2);
        Integer numValueOf = Integer.valueOf(C6452q.toq(c2, i2));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static /* synthetic */ boolean eqxt(char c2, char c3, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return oc(c2, c3, z2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.5")
    public static final int fti(char c2) {
        int qVar = C6452q.toq(c2, 10);
        if (qVar >= 0) {
            return qVar;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final Integer gvn7(char c2) {
        Integer numValueOf = Integer.valueOf(C6452q.toq(c2, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.5")
    public static final char jk(int i2) {
        if (new kotlin.ranges.x2(0, 9).x2(i2)) {
            return (char) (i2 + 48);
        }
        throw new IllegalArgumentException("Int " + i2 + " is not a decimal digit");
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.5")
    public static final int jp0y(char c2, int i2) {
        Integer numD3 = d3(c2, i2);
        if (numD3 != null) {
            return numD3.intValue();
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a digit in the given radix=" + i2);
    }

    @InterfaceC6234g
    private static final String lvui(char c2, String other) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return c2 + other;
    }

    public static final boolean oc(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: r */
    public static final String m23581r(char c2) {
        return C6453r.m23616k(c2);
    }
}

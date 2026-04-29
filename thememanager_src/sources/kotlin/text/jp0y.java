package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.n5r1;
import kotlin.hb;
import kotlin.hyr;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
class jp0y extends fti {
    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character dm(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        n5r1 it = new kotlin.ranges.x2(1, iKt06).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character j1s(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return gvn7.da(charSequence, comparator);
    }

    @InterfaceC7396q
    public static final SortedSet<Character> km9o(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return (SortedSet) gvn7.jcwh(charSequence, new TreeSet());
    }

    @InterfaceC6234g
    private static final char krto(CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.charAt(i2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character t8fp(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return gvn7.nrys(charSequence);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal tvn8(CharSequence charSequence, cyoe.x2<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i2))));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Character xzk4(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return gvn7.ek(charSequence);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character yvs(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return gvn7.eh(charSequence, comparator);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger ze(CharSequence charSequence, cyoe.x2<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i2))));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character zidq(CharSequence charSequence, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iKt06 = fti.kt06(charSequence);
        if (iKt06 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        n5r1 it = new kotlin.ranges.x2(1, iKt06).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }
}

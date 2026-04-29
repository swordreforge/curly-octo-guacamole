package kotlin.text;

import java.util.Locale;
import kotlin.hb;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.nn86;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.text.q */
/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6452q {
    @InterfaceC6234g
    private static final boolean cdj(char c2) {
        return Character.isUpperCase(c2);
    }

    @InterfaceC6234g
    private static final boolean f7l8(char c2) {
        return Character.isHighSurrogate(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final char fn3e(char c2) {
        return Character.toLowerCase(c2);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use lowercaseChar() instead.", replaceWith = @hb(expression = "lowercaseChar()", imports = {}))
    private static final char fu4(char c2) {
        return Character.toLowerCase(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final boolean m23601g(char c2) {
        return Character.isDigit(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final boolean m23602h(char c2) {
        return Character.isTitleCase(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: i */
    public static final String m23603i(char c2, @InterfaceC7396q Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String strValueOf = String.valueOf(c2);
        kotlin.jvm.internal.d2ok.n7h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @nn86
    /* JADX INFO: renamed from: k */
    public static int m23604k(int i2) {
        if (new kotlin.ranges.x2(2, 36).x2(i2)) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new kotlin.ranges.x2(2, 36));
    }

    public static final boolean ki(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    @InterfaceC6234g
    private static final boolean kja0(char c2) {
        return Character.isLowerCase(c2);
    }

    @InterfaceC6234g
    private static final boolean ld6(char c2) {
        return Character.isJavaIdentifierStart(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final char mcp(char c2) {
        return Character.toUpperCase(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final boolean m23605n(char c2) {
        return Character.isDefined(c2);
    }

    @InterfaceC6234g
    private static final boolean n7h(char c2) {
        return Character.isLowSurrogate(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final char ni7(char c2) {
        return Character.toTitleCase(c2);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use uppercaseChar() instead.", replaceWith = @hb(expression = "uppercaseChar()", imports = {}))
    private static final char o1t(char c2) {
        return Character.toUpperCase(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final boolean m23606p(char c2) {
        return Character.isJavaIdentifierPart(c2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final toq m23607q(char c2) {
        return toq.Companion.toq(Character.getDirectionality(c2));
    }

    @InterfaceC6234g
    private static final boolean qrj(char c2) {
        return Character.isLetterOrDigit(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final boolean m23608s(char c2) {
        return Character.isIdentifierIgnorable(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: t */
    public static final String m23609t(char c2, @InterfaceC7396q Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String strValueOf = String.valueOf(c2);
        kotlin.jvm.internal.d2ok.n7h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final String t8r(char c2) {
        String strValueOf = String.valueOf(c2);
        kotlin.jvm.internal.d2ok.n7h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final int toq(char c2, int i2) {
        return Character.digit((int) c2, i2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final String wvg(char c2) {
        String strValueOf = String.valueOf(c2);
        kotlin.jvm.internal.d2ok.n7h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @InterfaceC6234g
    private static final boolean x2(char c2) {
        return Character.isLetter(c2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final boolean m23610y(char c2) {
        return Character.isISOControl(c2);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use titlecaseChar() instead.", replaceWith = @hb(expression = "titlecaseChar()", imports = {}))
    /* JADX INFO: renamed from: z */
    private static final char m23611z(char c2) {
        return Character.toTitleCase(c2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final String zurt(char c2, @InterfaceC7396q Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String strM23609t = m23609t(c2, locale);
        if (strM23609t.length() <= 1) {
            String strValueOf = String.valueOf(c2);
            kotlin.jvm.internal.d2ok.n7h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !kotlin.jvm.internal.d2ok.f7l8(strM23609t, upperCase) ? strM23609t : String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return strM23609t;
        }
        char cCharAt = strM23609t.charAt(0);
        kotlin.jvm.internal.d2ok.n7h(strM23609t, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strM23609t.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        kotlin.jvm.internal.d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }

    @InterfaceC7396q
    public static final EnumC6441k zy(char c2) {
        return EnumC6441k.Companion.m23537k(Character.getType(c2));
    }
}

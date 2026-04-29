package kotlin.text;

import java.util.Locale;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.text.r */
/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6453r {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final String m23616k(char c2) {
        String strValueOf = String.valueOf(c2);
        kotlin.jvm.internal.d2ok.n7h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        kotlin.jvm.internal.d2ok.n7h(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        kotlin.jvm.internal.d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return cCharAt + lowerCase;
    }
}

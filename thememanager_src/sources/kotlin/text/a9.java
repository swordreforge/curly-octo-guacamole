package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.n5r1;
import kotlin.hb;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.InterfaceC6244y;
import kotlin.jvm.internal.C6311u;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,805:1\n1174#2,2:806\n1#3:808\n1726#4,3:809\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:806,2\n600#1:809,3\n*E\n"})
public class a9 extends jk {
    @InterfaceC6234g
    private static final String a5id(String str, Object... args) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(args, "args");
        String str2 = String.format(str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.d2ok.kja0(str2, "format(this, *args)");
        return str2;
    }

    @InterfaceC6234g
    private static final String b3e(char[] chars, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        return new String(chars, i2, i3);
    }

    @InterfaceC6234g
    private static final int b8(String str, char c2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.indexOf(c2, i2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final String b9ub(String str, Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final byte[] bap7(@InterfaceC7396q String str, int i2, int i3, boolean z2) throws CharacterCodingException {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.collections.zy.Companion.m22681k(i2, i3, str.length());
        if (!z2) {
            String strSubstring = str.substring(i2, i3);
            kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C6433g.f81921toq;
            kotlin.jvm.internal.d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer byteBufferEncode = C6433g.f81921toq.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i2, i3));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.d2ok.qrj(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.d2ok.kja0(bArrArray2, "{\n        byteBuffer.array()\n    }");
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @InterfaceC6234g
    private static final String bek6(int[] codePoints, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(codePoints, "codePoints");
        return new String(codePoints, i2, i3);
    }

    public static /* synthetic */ String bih(String str, char c2, char c3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return kiv(str, c2, c3, z2);
    }

    @InterfaceC6234g
    private static final char[] bqie(String str, char[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        str.getChars(i3, i4, destination, i2);
        return destination;
    }

    static /* synthetic */ Pattern btvn(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i2);
        kotlin.jvm.internal.d2ok.kja0(patternCompile, "compile(this, flags)");
        return patternCompile;
    }

    @InterfaceC6234g
    private static final String bz2(byte[] bytes, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        return new String(bytes, i2, i3, C6433g.f81921toq);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final String cn02(String str, Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final String cnbm(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @InterfaceC7396q
    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use replaceFirstChar instead.", replaceWith = @hb(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    public static final String cv06(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.d2ok.kja0(locale, "getDefault()");
        return h7am(str, locale);
    }

    public static /* synthetic */ boolean cyoe(String str, String str2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return rp(str, str2, i2, z2);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static /* synthetic */ String m28291do(char[] cArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = cArr.length;
        }
        return ixz(cArr, i2, i3);
    }

    public static /* synthetic */ boolean dxef(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return e5(str, str2, z2);
    }

    public static boolean e5(@InterfaceC7395n String str, @InterfaceC7395n String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @yz(version = "1.5")
    public static final boolean ebn(@InterfaceC7395n CharSequence charSequence, @InterfaceC7395n CharSequence charSequence2, boolean z2) {
        return z2 ? fti.z617(charSequence, charSequence2) : ukdy(charSequence, charSequence2);
    }

    public static /* synthetic */ String ec(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return z4t(str, str2, str3, z2);
    }

    @InterfaceC6234g
    private static final byte[] el(String str, Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC6234g
    private static final int ew(String str, String str2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(str2, "str");
        return str.lastIndexOf(str2, i2);
    }

    public static /* synthetic */ char[] f1bi(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return imd(str, i2, i3);
    }

    @InterfaceC6234g
    private static final char[] g0ad(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.d2ok.kja0(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    public static /* synthetic */ boolean ga(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return wlev(str, str2, z2);
    }

    @InterfaceC6234g
    private static final Pattern gb(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i2);
        kotlin.jvm.internal.d2ok.kja0(patternCompile, "compile(this, flags)");
        return patternCompile;
    }

    @InterfaceC6234g
    private static final String gc3c(StringBuilder stringBuilder) {
        kotlin.jvm.internal.d2ok.m23075h(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final String gcp(C6311u c6311u, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.d2ok.m23075h(c6311u, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        kotlin.jvm.internal.d2ok.m23075h(args, "args");
        String str = String.format(locale, format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.d2ok.kja0(str, "format(locale, format, *args)");
        return str;
    }

    public static /* synthetic */ byte[] h4b(String str, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return bap7(str, i2, i3, z2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6244y
    @kotlin.x2(warningSince = "1.5")
    @InterfaceC7396q
    @kotlin.ld6(message = "Use replaceFirstChar instead.", replaceWith = @hb(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @yz(version = "1.4")
    public static final String h7am(@InterfaceC7396q String str, @InterfaceC7396q Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            kotlin.jvm.internal.d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC6234g
    private static final boolean ij(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final char[] imd(@InterfaceC7396q String str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.collections.zy.Companion.m22681k(i2, i3, str.length());
        char[] cArr = new char[i3 - i2];
        str.getChars(i2, i3, cArr, 0);
        return cArr;
    }

    @InterfaceC6234g
    private static final int ix(String str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.offsetByCodePoints(i2, i3);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static String ixz(@InterfaceC7396q char[] cArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.collections.zy.Companion.m22681k(i2, i3, cArr.length);
        return new String(cArr, i2, i3 - i2);
    }

    @InterfaceC6234g
    private static final int jbh(String str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.codePointCount(i2, i3);
    }

    @InterfaceC6234g
    private static final String jz5(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return new String(bytes, charset);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use lowercase() instead.", replaceWith = @hb(expression = "lowercase(locale)", imports = {}))
    private static final String kbj(String str, Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @InterfaceC7396q
    public static final String kiv(@InterfaceC7396q String str, char c2, char c3, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        int iSc = fti.sc(str, c2, 0, z2, 2, null);
        return iSc < 0 ? str : fti.a3dw(str, iSc, iSc + 1, String.valueOf(c3)).toString();
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use uppercase() instead.", replaceWith = @hb(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    private static final String kq2f(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @InterfaceC6234g
    private static final String ktq(char[] chars) {
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        return new String(chars);
    }

    public static final boolean kx3(@InterfaceC7396q CharSequence charSequence, int i2, @InterfaceC7396q CharSequence other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? m23503w((String) charSequence, i2, (String) other, i3, i4, z2) : fti.oaex(charSequence, i2, other, i3, i4, z2);
    }

    public static boolean l05(@InterfaceC7396q String str, @InterfaceC7396q String prefix, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : m23503w(str, 0, prefix, 0, prefix.length(), z2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final byte[] lh(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        byte[] bytes = str.getBytes(C6433g.f81921toq);
        kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC6234g
    private static final String lw(C6311u c6311u, String format, Object... args) {
        kotlin.jvm.internal.d2ok.m23075h(c6311u, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(format, "format");
        kotlin.jvm.internal.d2ok.m23075h(args, "args");
        String str = String.format(format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.d2ok.kja0(str, "format(format, *args)");
        return str;
    }

    public static /* synthetic */ boolean m2t(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z2 = false;
        }
        return kx3(charSequence, i2, charSequence2, i3, i4, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m58i(@mub.InterfaceC7396q java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.d2ok.m23075h(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            kotlin.ranges.x2 r0 = kotlin.text.fti.kz28(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L20
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L20
        L1e:
            r4 = r2
            goto L3c
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            r3 = r0
            kotlin.collections.n5r1 r3 = (kotlin.collections.n5r1) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.text.C6452q.ki(r3)
            if (r3 != 0) goto L24
            r4 = r1
        L3c:
            if (r4 == 0) goto L3f
        L3e:
            r1 = r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.a9.m58i(java.lang.CharSequence):boolean");
    }

    @InterfaceC6234g
    private static final int mbx(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.codePointBefore(i2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final String mj(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final String n2t(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return new String(bArr, C6433g.f81921toq);
    }

    public static /* synthetic */ String ngy(byte[] bArr, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return pjz9(bArr, i2, i3, z2);
    }

    @InterfaceC6234g
    private static final int nme(String str, String str2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(str2, "str");
        return str.indexOf(str2, i2);
    }

    public static /* synthetic */ String nnh(String str, char c2, char c3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return v5yj(str, c2, c3, z2);
    }

    @InterfaceC7396q
    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use replaceFirstChar instead.", replaceWith = @hb(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    public static final String nsb(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        kotlin.jvm.internal.d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase();
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @InterfaceC6234g
    private static final String o05(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String strIntern = str.intern();
        kotlin.jvm.internal.d2ok.kja0(strIntern, "this as java.lang.String).intern()");
        return strIntern;
    }

    @InterfaceC7396q
    public static final List<String> o5(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Pattern regex, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        fti.xouc(i2);
        if (i2 == 0) {
            i2 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i2);
        kotlin.jvm.internal.d2ok.kja0(strArrSplit, "regex.split(this, if (limit == 0) -1 else limit)");
        return kotlin.collections.kja0.m22514i(strArrSplit);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use lowercase() instead.", replaceWith = @hb(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    private static final String ob(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @InterfaceC7396q
    public static Comparator<String> oki(@InterfaceC7396q C6311u c6311u) {
        kotlin.jvm.internal.d2ok.m23075h(c6311u, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.d2ok.kja0(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @InterfaceC6234g
    private static final boolean pc(String str, CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static final String pjz9(@InterfaceC7396q byte[] bArr, int i2, int i3, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.collections.zy.Companion.m22681k(i2, i3, bArr.length);
        if (!z2) {
            return new String(bArr, i2, i3 - i2, C6433g.f81921toq);
        }
        String string = C6433g.f81921toq.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i2, i3 - i2)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return string;
    }

    @InterfaceC7396q
    public static String ps(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 == 0) {
            return "";
        }
        if (i2 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i2);
        n5r1 it = new kotlin.ranges.x2(1, i2).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(charSequence);
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "{\n                    va…tring()\n                }");
        return string;
    }

    @InterfaceC6234g
    private static final int r25n(String str, char c2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }

    public static /* synthetic */ boolean r6ty(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return l05(str, str2, z2);
    }

    @InterfaceC7396q
    public static final String ra(@InterfaceC7396q String str, @InterfaceC7396q String oldValue, @InterfaceC7396q String newValue, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(oldValue, "oldValue");
        kotlin.jvm.internal.d2ok.m23075h(newValue, "newValue");
        int i2 = 0;
        int iUla6 = fti.ula6(str, oldValue, 0, z2);
        if (iUla6 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iFn3e = kotlin.ranges.fn3e.fn3e(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, iUla6);
            sb.append(newValue);
            i2 = iUla6 + length;
            if (iUla6 >= str.length()) {
                break;
            }
            iUla6 = fti.ula6(str, oldValue, iUla6 + iFn3e, z2);
        } while (iUla6 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static boolean rp(@InterfaceC7396q String str, @InterfaceC7396q String prefix, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return !z2 ? str.startsWith(prefix, i2) : m23503w(str, i2, prefix, 0, prefix.length(), z2);
    }

    @InterfaceC6234g
    private static final String se(StringBuffer stringBuffer) {
        kotlin.jvm.internal.d2ok.m23075h(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    static /* synthetic */ char[] tww7(String str, char[] destination, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = str.length();
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        str.getChars(i3, i4, destination, i2);
        return destination;
    }

    public static /* synthetic */ boolean u38j(String str, int i2, String str2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z2 = false;
        }
        return m23503w(str, i2, str2, i3, i4, z2);
    }

    public static /* synthetic */ int uc(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return yl(str, str2, z2);
    }

    public static /* synthetic */ String uf(String str, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return ra(str, str2, str3, z2);
    }

    @InterfaceC6234g
    private static final String uj2j(byte[] bytes, int i2, int i3, Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return new String(bytes, i2, i3, charset);
    }

    @yz(version = "1.5")
    public static final boolean ukdy(@InterfaceC7395n CharSequence charSequence, @InterfaceC7395n CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? fti.xzl(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @InterfaceC7396q
    public static final String v5yj(@InterfaceC7396q String str, char c2, char c3, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (!z2) {
            String strReplace = str.replace(c2, c3);
            kotlin.jvm.internal.d2ok.kja0(strReplace, "this as java.lang.String…replace(oldChar, newChar)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (C6450n.oc(cCharAt, c2, z2)) {
                cCharAt = c3;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @InterfaceC6234g
    private static final int vep5(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.codePointAt(i2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final String vy(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(args, "args");
        String str2 = String.format(locale, str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.d2ok.kja0(str2, "format(locale, this, *args)");
        return str2;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m23503w(@InterfaceC7396q String str, int i2, @InterfaceC7396q String other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return !z2 ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z2, i2, other, i3, i4);
    }

    public static boolean wlev(@InterfaceC7396q String str, @InterfaceC7396q String suffix, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : m23503w(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    static /* synthetic */ byte[] wt(String str, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C6433g.f81921toq;
        }
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @yz(version = "1.4")
    public static String wx16(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return new String(cArr);
    }

    @kotlin.x2(warningSince = "1.5")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use uppercase() instead.", replaceWith = @hb(expression = "uppercase(locale)", imports = {}))
    private static final String xm(String str, Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.d2ok.kja0(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final int yl(@InterfaceC7396q String str, @InterfaceC7396q String other, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return z2 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    @InterfaceC6234g
    private static final String yp31(String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String strSubstring = str.substring(i2);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static /* synthetic */ List yw(CharSequence charSequence, Pattern pattern, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return o5(charSequence, pattern, i2);
    }

    @InterfaceC7396q
    public static final String z4t(@InterfaceC7396q String str, @InterfaceC7396q String oldValue, @InterfaceC7396q String newValue, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(oldValue, "oldValue");
        kotlin.jvm.internal.d2ok.m23075h(newValue, "newValue");
        int iB7 = fti.b7(str, oldValue, 0, z2, 2, null);
        return iB7 < 0 ? str : fti.a3dw(str, iB7, oldValue.length() + iB7, newValue).toString();
    }

    @InterfaceC6234g
    private static final String zff0(String str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        String strSubstring = str.substring(i2, i3);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6234g
    private static final String zkd(byte[] bytes) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        return new String(bytes, C6433g.f81921toq);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6244y
    @kotlin.x2(warningSince = "1.5")
    @InterfaceC7396q
    @kotlin.ld6(message = "Use replaceFirstChar instead.", replaceWith = @hb(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @yz(version = "1.4")
    public static final String zwy(@InterfaceC7396q String str, @InterfaceC7396q Locale locale) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        kotlin.jvm.internal.d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }
}

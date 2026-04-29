package kotlin.text;

import com.miui.maml.elements.MusicLyricParser;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6227f;
import kotlin.collections.AbstractC6145i;
import kotlin.collections.C6144h;
import kotlin.collections.n5r1;
import kotlin.hb;
import kotlin.hyr;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import kotlin.ranges.C6349p;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
public class fti extends a9 {

    /* JADX INFO: renamed from: kotlin.text.fti$k */
    /* JADX INFO: compiled from: Strings.kt */
    public static final class C6429k extends AbstractC6145i {

        /* JADX INFO: renamed from: k */
        private int f36681k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ CharSequence f36682q;

        C6429k(CharSequence charSequence) {
            this.f36682q = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36681k < this.f36682q.length();
        }

        @Override // kotlin.collections.AbstractC6145i
        public char toq() {
            CharSequence charSequence = this.f36682q;
            int i2 = this.f36681k;
            this.f36681k = i2 + 1;
            return charSequence.charAt(i2);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.fti$n */
    /* JADX INFO: compiled from: Strings.kt */
    static final class C6430n extends AbstractC6308r implements cyoe.x2<kotlin.ranges.x2, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6430n(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q kotlin.ranges.x2 it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return fti.c2(this.$this_splitToSequence, it);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.fti$q */
    /* JADX INFO: compiled from: Strings.kt */
    static final class C6431q extends AbstractC6308r implements cyoe.x2<kotlin.ranges.x2, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6431q(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q kotlin.ranges.x2 it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            return fti.c2(this.$this_splitToSequence, it);
        }
    }

    /* JADX INFO: compiled from: Strings.kt */
    @lv5({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    static final class toq extends AbstractC6308r implements InterfaceC5979h<CharSequence, Integer, C6227f<? extends Integer, ? extends Integer>> {
        final /* synthetic */ char[] $delimiters;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(char[] cArr, boolean z2) {
            super(2);
            this.$delimiters = cArr;
            this.$ignoreCase = z2;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ C6227f<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return invoke(charSequence, num.intValue());
        }

        @InterfaceC7395n
        public final C6227f<Integer, Integer> invoke(@InterfaceC7396q CharSequence $receiver, int i2) {
            kotlin.jvm.internal.d2ok.m23075h($receiver, "$this$$receiver");
            int iOph = fti.oph($receiver, this.$delimiters, i2, this.$ignoreCase);
            if (iOph < 0) {
                return null;
            }
            return nmn5.m23230k(Integer.valueOf(iOph), 1);
        }
    }

    /* JADX INFO: compiled from: Strings.kt */
    @lv5({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    static final class zy extends AbstractC6308r implements InterfaceC5979h<CharSequence, Integer, C6227f<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List<String> $delimitersList;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(List<String> list, boolean z2) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z2;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ C6227f<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return invoke(charSequence, num.intValue());
        }

        @InterfaceC7395n
        public final C6227f<Integer, Integer> invoke(@InterfaceC7396q CharSequence $receiver, int i2) {
            kotlin.jvm.internal.d2ok.m23075h($receiver, "$this$$receiver");
            C6227f c6227fI3x9 = fti.i3x9($receiver, this.$delimitersList, i2, this.$ignoreCase, false);
            if (c6227fI3x9 != null) {
                return nmn5.m23230k(c6227fI3x9.getFirst(), Integer.valueOf(((String) c6227fI3x9.getSecond()).length()));
            }
            return null;
        }
    }

    @InterfaceC7396q
    public static final CharSequence a3dw(@InterfaceC7396q CharSequence charSequence, int i2, int i3, @InterfaceC7396q CharSequence replacement) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        if (i3 >= i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i2);
            kotlin.jvm.internal.d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
            sb.append(replacement);
            sb.append(charSequence, i3, charSequence.length());
            kotlin.jvm.internal.d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
    }

    public static /* synthetic */ String a7zh(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return p6(str, c2, str2);
    }

    private static final kotlin.sequences.qrj<kotlin.ranges.x2> a8p6(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3) {
        xouc(i3);
        return new C6458y(charSequence, i2, i3, new zy(kotlin.collections.kja0.m22514i(strArr), z2));
    }

    public static final boolean ab(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence suffix, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        return (!z2 && (charSequence instanceof String) && (suffix instanceof String)) ? a9.ga((String) charSequence, (String) suffix, false, 2, null) : oaex(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z2);
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<String> ae4(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char[] delimiters, boolean z2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiters, "delimiters");
        return kotlin.sequences.fn3e.b3e(uv(charSequence, delimiters, 0, z2, i2, 2, null), new C6430n(charSequence));
    }

    @yz(version = "1.5")
    public static final boolean ahb(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (kotlin.jvm.internal.d2ok.f7l8(str, "true")) {
            return true;
        }
        if (kotlin.jvm.internal.d2ok.f7l8(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static /* synthetic */ String alcv(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return eu(str, str2, str3, str4);
    }

    @InterfaceC6234g
    private static final boolean anhx(CharSequence charSequence) {
        return charSequence == null || a9.m58i(charSequence);
    }

    private static final kotlin.sequences.qrj<kotlin.ranges.x2> anw(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3) {
        xouc(i3);
        return new C6458y(charSequence, i2, i3, new toq(cArr, z2));
    }

    @InterfaceC7396q
    public static final CharSequence ap23(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence suffix) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && zaso(charSequence, prefix, false, 2, null) && tjz5(charSequence, suffix, false, 2, null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final int b2(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q String string, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        return (z2 || !(charSequence instanceof String)) ? wwp(charSequence, string, i2, 0, z2, true) : ((String) charSequence).lastIndexOf(string, i2);
    }

    @InterfaceC7396q
    public static final String b3fl(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iB7 = b7(str, delimiter, 0, false, 6, null);
        if (iB7 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iB7);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private static final List<String> b6(CharSequence charSequence, String str, boolean z2, int i2) {
        xouc(i2);
        int length = 0;
        int iUla6 = ula6(charSequence, str, 0, z2);
        if (iUla6 == -1 || i2 == 1) {
            return kotlin.collections.zurt.ld6(charSequence.toString());
        }
        boolean z3 = i2 > 0;
        ArrayList arrayList = new ArrayList(z3 ? kotlin.ranges.fn3e.m23305t(i2, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iUla6).toString());
            length = str.length() + iUla6;
            if (z3 && arrayList.size() == i2 - 1) {
                break;
            }
            iUla6 = ula6(charSequence, str, length, z2);
        } while (iUla6 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ int b7(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return ula6(charSequence, str, i2, z2);
    }

    @InterfaceC7395n
    @yz(version = "1.5")
    public static final Boolean bb(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (kotlin.jvm.internal.d2ok.f7l8(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.d2ok.f7l8(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    @InterfaceC7396q
    public static final String bf5(@InterfaceC7396q String str, char c2, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iX7o = x7o(str, c2, 0, false, 6, null);
        return iX7o == -1 ? missingDelimiterValue : a3dw(str, 0, iX7o, replacement).toString();
    }

    @InterfaceC7396q
    public static final String bmt3(@InterfaceC7396q String str, @InterfaceC7396q kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        String strSubstring = str.substring(range.mo2951k().intValue(), range.zy().intValue() + 1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String brv(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return z1r(str, c2, str2, str3);
    }

    @InterfaceC7396q
    public static final String c2(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        return charSequence.subSequence(range.mo2951k().intValue(), range.zy().intValue() + 1).toString();
    }

    public static /* synthetic */ boolean c25(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return wtop(charSequence, c2, z2);
    }

    public static /* synthetic */ List cb(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return zt(charSequence, strArr, z2, i2);
    }

    @InterfaceC7396q
    public static final String cjaj(@InterfaceC7396q String str, char c2, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iX7o = x7o(str, c2, 0, false, 6, null);
        return iX7o == -1 ? missingDelimiterValue : a3dw(str, iX7o + 1, str.length(), replacement).toString();
    }

    @InterfaceC6234g
    @kotlin.ld6(message = "Use parameters named startIndex and endIndex.", replaceWith = @hb(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final CharSequence cp(String str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return str.subSequence(i2, i3);
    }

    public static /* synthetic */ String cr3(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return verb(str, str2, str3, str4);
    }

    public static /* synthetic */ String cyg(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return iw(str, c2, str2);
    }

    public static final boolean d1ts(@InterfaceC7396q CharSequence charSequence, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return new kotlin.ranges.x2(0, charSequence.length() + (-2)).x2(i2) && Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i2 + 1));
    }

    @InterfaceC7396q
    public static final CharSequence d6c(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        return vddr(charSequence, range.mo2951k().intValue(), range.zy().intValue() + 1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "replaceFirstCharWithChar")
    private static final String d6od(String str, cyoe.x2<? super Character, Character> transform) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        return cCharValue + strSubstring;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final kotlin.sequences.qrj<String> d9i(CharSequence charSequence, ki regex, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        return regex.splitToSequence(charSequence, i2);
    }

    @InterfaceC7396q
    public static final String dbf(@InterfaceC7396q String str, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence suffix) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !zaso(str, prefix, false, 2, null) || !tjz5(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    public static final String drpy(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iZ8 = z8(str, delimiter, 0, false, 6, null);
        if (iZ8 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iZ8 + delimiter.length(), str.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ CharSequence e4e(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return erbd(charSequence, i2, c2);
    }

    @InterfaceC7396q
    public static final CharSequence e9s(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!C6452q.ki(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return "";
    }

    @InterfaceC6234g
    private static final String eklw(String str, kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        return d6c(str, range).toString();
    }

    @InterfaceC7396q
    public static final CharSequence erbd(@InterfaceC7396q CharSequence charSequence, int i2, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        }
        if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(charSequence);
        n5r1 it = new kotlin.ranges.x2(1, i2 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c2);
        }
        return sb;
    }

    @InterfaceC6234g
    private static final String es7(CharSequence charSequence, ki regex, cyoe.x2<? super InterfaceC6439h, ? extends CharSequence> transform) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    @InterfaceC7396q
    public static final String eu(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iZ8 = z8(str, delimiter, 0, false, 6, null);
        return iZ8 == -1 ? missingDelimiterValue : a3dw(str, iZ8 + delimiter.length(), str.length(), replacement).toString();
    }

    @InterfaceC7396q
    public static final String exv8(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence other, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i2 = 0;
        while (i2 < iMin && C6450n.oc(charSequence.charAt(i2), other.charAt(i2), z2)) {
            i2++;
        }
        int i3 = i2 - 1;
        if (d1ts(charSequence, i3) || d1ts(other, i3)) {
            i2--;
        }
        return charSequence.subSequence(0, i2).toString();
    }

    @InterfaceC6234g
    private static final String f26p(String str, int i2, int i3, CharSequence replacement) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        return a3dw(str, i2, i3, replacement).toString();
    }

    @InterfaceC7395n
    public static final C6227f<Integer, String> f3f(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Collection<String> strings, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(strings, "strings");
        return i3x9(charSequence, strings, i2, z2, false);
    }

    @InterfaceC6234g
    private static final boolean f7z0(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @InterfaceC6234g
    private static final String fbr(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return e9s(str).toString();
    }

    public static /* synthetic */ CharSequence ff(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return rf(charSequence, i2, c2);
    }

    @InterfaceC6234g
    private static final boolean fh(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return !a9.m58i(charSequence);
    }

    public static /* synthetic */ String fupf(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return wkrb(str, str2, str3);
    }

    @InterfaceC7396q
    public static final CharSequence g41(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC7396q
    public static final AbstractC6145i ge(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return new C6429k(charSequence);
    }

    public static /* synthetic */ String gw(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return cjaj(str, c2, str2, str3);
    }

    @InterfaceC7396q
    public static final String hyow(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence other, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, other.length());
        int i2 = 0;
        while (i2 < iMin && C6450n.oc(charSequence.charAt((length - i2) - 1), other.charAt((r1 - i2) - 1), z2)) {
            i2++;
        }
        if (d1ts(charSequence, (length - i2) - 1) || d1ts(other, (r1 - i2) - 1)) {
            i2--;
        }
        return charSequence.subSequence(length - i2, length).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <C extends CharSequence & R, R> R i1an(C c2, InterfaceC5981k<? extends R> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return a9.m58i(c2) ? defaultValue.invoke() : c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6227f<Integer, String> i3x9(CharSequence charSequence, Collection<String> collection, int i2, boolean z2, boolean z3) {
        Object next;
        Object next2;
        if (!z2 && collection.size() == 1) {
            String str = (String) kotlin.collections.a9.xo(collection);
            int iB7 = !z3 ? b7(charSequence, str, i2, false, 4, null) : z8(charSequence, str, i2, false, 4, null);
            if (iB7 < 0) {
                return null;
            }
            return nmn5.m23230k(Integer.valueOf(iB7), str);
        }
        C6349p x2Var = !z3 ? new kotlin.ranges.x2(kotlin.ranges.fn3e.fn3e(i2, 0), charSequence.length()) : kotlin.ranges.fn3e.i1(kotlin.ranges.fn3e.m23305t(i2, kt06(charSequence)), 0);
        if (charSequence instanceof String) {
            int iF7l8 = x2Var.f7l8();
            int iM23353y = x2Var.m23353y();
            int iM23352s = x2Var.m23352s();
            if ((iM23352s > 0 && iF7l8 <= iM23353y) || (iM23352s < 0 && iM23353y <= iF7l8)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (a9.m23503w(str2, 0, (String) charSequence, iF7l8, str2.length(), z2)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (iF7l8 == iM23353y) {
                            break;
                        }
                        iF7l8 += iM23352s;
                    } else {
                        return nmn5.m23230k(Integer.valueOf(iF7l8), str3);
                    }
                }
            }
        } else {
            int iF7l82 = x2Var.f7l8();
            int iM23353y2 = x2Var.m23353y();
            int iM23352s2 = x2Var.m23352s();
            if ((iM23352s2 > 0 && iF7l82 <= iM23353y2) || (iM23352s2 < 0 && iM23353y2 <= iF7l82)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (oaex(str4, 0, charSequence, iF7l82, str4.length(), z2)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (iF7l82 == iM23353y2) {
                            break;
                        }
                        iF7l82 += iM23352s2;
                    } else {
                        return nmn5.m23230k(Integer.valueOf(iF7l82), str5);
                    }
                }
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final String i8(@InterfaceC7396q String str, @InterfaceC7396q char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!C6144h.fl(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<String> ie(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q String[] delimiters, boolean z2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiters, "delimiters");
        return kotlin.sequences.fn3e.b3e(qla(charSequence, delimiters, 0, z2, i2, 2, null), new C6431q(charSequence));
    }

    @InterfaceC7396q
    public static String ip(@InterfaceC7396q String str, @InterfaceC7396q CharSequence delimiter) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        return dbf(str, delimiter, delimiter);
    }

    @InterfaceC7396q
    public static final String is(@InterfaceC7396q String str, @InterfaceC7396q char... chars) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zFl = C6144h.fl(chars, str.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zFl) {
                    break;
                }
                length--;
            } else if (zFl) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    @InterfaceC7396q
    public static final String iw(@InterfaceC7396q String str, char c2, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iX7o = x7o(str, c2, 0, false, 6, null);
        if (iX7o == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iX7o);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String iz(String str, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return sj(str, i2, c2);
    }

    @InterfaceC7396q
    public static final CharSequence izu(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence delimiter) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        return ap23(charSequence, delimiter, delimiter);
    }

    @InterfaceC7396q
    public static final String j3px(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @InterfaceC6234g
    private static final boolean j3y2(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @InterfaceC6234g
    private static final List<String> jb9(CharSequence charSequence, ki regex, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        return regex.split(charSequence, i2);
    }

    public static /* synthetic */ String je1q(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return py7(str, c2, str2);
    }

    public static final boolean jglj(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence prefix, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return (!z2 && (charSequence instanceof String) && (prefix instanceof String)) ? a9.r6ty((String) charSequence, (String) prefix, false, 2, null) : oaex(charSequence, 0, prefix, 0, prefix.length(), z2);
    }

    static /* synthetic */ kotlin.sequences.qrj jog(CharSequence charSequence, ki regex, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        return regex.splitToSequence(charSequence, i2);
    }

    public static /* synthetic */ String jre(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return wh(str, str2, str3);
    }

    @InterfaceC7396q
    public static String jyr(@InterfaceC7396q String str, @InterfaceC7396q CharSequence prefix) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        if (!zaso(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    public static final CharSequence k2b8(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!C6452q.ki(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC7396q
    public static final List<String> k4jz(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return kotlin.sequences.fn3e.nyj(m28(charSequence));
    }

    public static /* synthetic */ int kjd(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = kt06(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return mete(charSequence, cArr, i2, z2);
    }

    public static final int kl7m(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Collection<String> strings, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(strings, "strings");
        C6227f<Integer, String> c6227fI3x9 = i3x9(charSequence, strings, i2, z2, false);
        if (c6227fI3x9 != null) {
            return c6227fI3x9.getFirst().intValue();
        }
        return -1;
    }

    @InterfaceC7396q
    public static final String koj(@InterfaceC7396q String str, char c2, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iSc = sc(str, c2, 0, false, 6, null);
        return iSc == -1 ? missingDelimiterValue : a3dw(str, iSc + 1, str.length(), replacement).toString();
    }

    @InterfaceC6234g
    private static final boolean kq(CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    public static int kt06(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @InterfaceC7396q
    public static final kotlin.ranges.x2 kz28(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return new kotlin.ranges.x2(0, charSequence.length() - 1);
    }

    public static /* synthetic */ kotlin.sequences.qrj l0(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return ae4(charSequence, cArr, z2, i2);
    }

    @InterfaceC7396q
    public static final String l7o(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iZ8 = z8(str, delimiter, 0, false, 6, null);
        return iZ8 == -1 ? missingDelimiterValue : a3dw(str, 0, iZ8, replacement).toString();
    }

    @InterfaceC7396q
    public static CharSequence l92(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zKi = C6452q.ki(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zKi) {
                    break;
                }
                length--;
            } else if (zKi) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static /* synthetic */ int le7(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return kl7m(charSequence, collection, i2, z2);
    }

    @InterfaceC7396q
    public static final String le9(@InterfaceC7396q String str, @InterfaceC7396q char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!C6144h.fl(chars, str.charAt(i2))) {
                charSequenceSubSequence = str.subSequence(i2, str.length());
                break;
            }
            i2++;
        }
        return charSequenceSubSequence.toString();
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @hyr
    @InterfaceC6234g
    @yz(version = "1.5")
    @InterfaceC6769y(name = "replaceFirstCharWithCharSequence")
    private static final String lg4k(String str, cyoe.x2<? super Character, ? extends CharSequence> transform) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static /* synthetic */ boolean lk(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return xtb7(charSequence, charSequence2, z2);
    }

    @InterfaceC6234g
    private static final String lm(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return k2b8(str).toString();
    }

    static /* synthetic */ List ln(CharSequence charSequence, ki regex, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        return regex.split(charSequence, i2);
    }

    @InterfaceC7396q
    public static final kotlin.sequences.qrj<String> m28(@InterfaceC7396q CharSequence charSequence) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return rig(charSequence, new String[]{MusicLyricParser.CRLF, "\n", "\r"}, false, 0, 6, null);
    }

    public static final int m8(@InterfaceC7396q CharSequence charSequence, char c2, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? oph(charSequence, new char[]{c2}, i2, z2) : ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ String ma8k(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return b3fl(str, str2, str3);
    }

    public static final int mete(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char[] chars, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C6144h.s7(chars), i2);
        }
        for (int iM23305t = kotlin.ranges.fn3e.m23305t(i2, kt06(charSequence)); -1 < iM23305t; iM23305t--) {
            char cCharAt = charSequence.charAt(iM23305t);
            int length = chars.length;
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (C6450n.oc(chars[i3], cCharAt, z2)) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (z3) {
                return iM23305t;
            }
        }
        return -1;
    }

    @InterfaceC6234g
    private static final boolean mi1u(CharSequence charSequence, ki regex) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    @InterfaceC7396q
    public static final CharSequence mkmm(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q kotlin.ranges.x2 range) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        return charSequence.subSequence(range.mo2951k().intValue(), range.zy().intValue() + 1);
    }

    public static /* synthetic */ String mla(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return bf5(str, c2, str2, str3);
    }

    static /* synthetic */ String mq(CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = charSequence.length();
        }
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.subSequence(i2, i3).toString();
    }

    public static /* synthetic */ int mub(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return oph(charSequence, cArr, i2, z2);
    }

    @InterfaceC6234g
    private static final String mxh(String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return l92(str).toString();
    }

    @InterfaceC6234g
    private static final String nc(String str) {
        return str == null ? "" : str;
    }

    public static /* synthetic */ String nod(String str, int i2, char c2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c2 = ' ';
        }
        return zxq(str, i2, c2);
    }

    public static /* synthetic */ C6227f nyj(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return f3f(charSequence, collection, i2, z2);
    }

    public static final boolean oaex(@InterfaceC7396q CharSequence charSequence, int i2, @InterfaceC7396q CharSequence other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!C6450n.oc(charSequence.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final String oei(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iB7 = b7(str, delimiter, 0, false, 6, null);
        return iB7 == -1 ? missingDelimiterValue : a3dw(str, iB7 + delimiter.length(), str.length(), replacement).toString();
    }

    public static final int oph(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char[] chars, int i2, boolean z2) {
        boolean z3;
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C6144h.s7(chars), i2);
        }
        n5r1 it = new kotlin.ranges.x2(kotlin.ranges.fn3e.fn3e(i2, 0), kt06(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            int length = chars.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z3 = false;
                    break;
                }
                if (C6450n.oc(chars[i3], cCharAt, z2)) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (z3) {
                return iNextInt;
            }
        }
        return -1;
    }

    public static /* synthetic */ String owi(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return oei(str, str2, str3, str4);
    }

    @InterfaceC7396q
    public static final String p6(@InterfaceC7396q String str, char c2, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iSc = sc(str, c2, 0, false, 6, null);
        if (iSc == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iSc);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    public static final String p996(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(str.charAt(!z2 ? i2 : length))).booleanValue();
            if (z2) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    @InterfaceC7396q
    public static final CharSequence pi(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(!z2 ? i2 : length))).booleanValue();
            if (z2) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean pnt2(@InterfaceC7396q CharSequence charSequence, char c2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return sc(charSequence, c2, 0, z2, 2, null) >= 0;
    }

    @InterfaceC7396q
    public static String py7(@InterfaceC7396q String str, char c2, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iX7o = x7o(str, c2, 0, false, 6, null);
        if (iX7o == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iX7o + 1, str.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ List qexj(CharSequence charSequence, char[] cArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return x3b(charSequence, cArr, z2, i2);
    }

    public static /* synthetic */ String qh4d(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return exv8(charSequence, charSequence2, z2);
    }

    static /* synthetic */ kotlin.sequences.qrj qla(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return a8p6(charSequence, strArr, i2, z2, i3);
    }

    @InterfaceC6234g
    private static final String qppo(String str, kotlin.ranges.x2 range, CharSequence replacement) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        return ydj3(str, range, replacement).toString();
    }

    @InterfaceC7396q
    public static final CharSequence rf(@InterfaceC7396q CharSequence charSequence, int i2, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        }
        if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i2);
        n5r1 it = new kotlin.ranges.x2(1, i2 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c2);
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ kotlin.sequences.qrj rig(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return ie(charSequence, strArr, z2, i2);
    }

    @InterfaceC7396q
    public static final CharSequence rlj(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char... chars) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!C6144h.fl(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return "";
    }

    public static /* synthetic */ String s31(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return koj(str, c2, str2, str3);
    }

    @InterfaceC6234g
    private static final String sb(String str, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return vddr(str, i2, i3).toString();
    }

    public static final int sb1e(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Collection<String> strings, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(strings, "strings");
        C6227f<Integer, String> c6227fI3x9 = i3x9(charSequence, strings, i2, z2, true);
        if (c6227fI3x9 != null) {
            return c6227fI3x9.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ int sc(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return m8(charSequence, c2, i2, z2);
    }

    @InterfaceC7396q
    public static String sj(@InterfaceC7396q String str, int i2, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return rf(str, i2, c2).toString();
    }

    public static final boolean sm(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence prefix, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return (!z2 && (charSequence instanceof String) && (prefix instanceof String)) ? a9.cyoe((String) charSequence, (String) prefix, i2, false, 4, null) : oaex(charSequence, i2, prefix, 0, prefix.length(), z2);
    }

    public static /* synthetic */ boolean tjz5(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return ab(charSequence, charSequence2, z2);
    }

    @InterfaceC7396q
    public static final CharSequence u0z(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char... chars) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!C6144h.fl(chars, charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    public static final int ula6(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q String string, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        return (z2 || !(charSequence instanceof String)) ? zuf(charSequence, string, i2, charSequence.length(), z2, false, 16, null) : ((String) charSequence).indexOf(string, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <C extends CharSequence & R, R> R uo(C c2, InterfaceC5981k<? extends R> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return c2.length() == 0 ? defaultValue.invoke() : c2;
    }

    static /* synthetic */ kotlin.sequences.qrj uv(CharSequence charSequence, char[] cArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return anw(charSequence, cArr, i2, z2, i3);
    }

    @InterfaceC7396q
    public static final CharSequence vahq(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence suffix) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        return tjz5(charSequence, suffix, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC7396q
    public static String vc(@InterfaceC7396q String str, @InterfaceC7396q CharSequence suffix) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(suffix, "suffix");
        if (!tjz5(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    public static final CharSequence vddr(@InterfaceC7396q CharSequence charSequence, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        }
        if (i3 == i2) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i3 - i2));
        sb.append(charSequence, 0, i2);
        kotlin.jvm.internal.d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
        sb.append(charSequence, i3, charSequence.length());
        kotlin.jvm.internal.d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @InterfaceC7396q
    public static final String verb(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iB7 = b7(str, delimiter, 0, false, 6, null);
        return iB7 == -1 ? missingDelimiterValue : a3dw(str, 0, iB7, replacement).toString();
    }

    @InterfaceC6234g
    private static final boolean vg(CharSequence charSequence, ki regex) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        return regex.matches(charSequence);
    }

    @InterfaceC7396q
    public static final CharSequence vh(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence prefix) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        return zaso(charSequence, prefix, false, 2, null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC7395n
    public static final C6227f<Integer, String> vss1(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q Collection<String> strings, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(strings, "strings");
        return i3x9(charSequence, strings, i2, z2, true);
    }

    public static /* synthetic */ boolean vwb(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return pnt2(charSequence, c2, z2);
    }

    public static /* synthetic */ String vymi(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return xnu(str, c2, str2);
    }

    @InterfaceC7396q
    public static final CharSequence wen(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char... chars) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(chars, "chars");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zFl = C6144h.fl(chars, charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zFl) {
                    break;
                }
                length--;
            } else if (zFl) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @InterfaceC7396q
    public static final String wh(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iB7 = b7(str, delimiter, 0, false, 6, null);
        if (iB7 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB7 + delimiter.length(), str.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    public static final String wkrb(@InterfaceC7396q String str, @InterfaceC7396q String delimiter, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiter, "delimiter");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iZ8 = z8(str, delimiter, 0, false, 6, null);
        if (iZ8 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iZ8);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6234g
    private static final String wqp(CharSequence charSequence, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.subSequence(i2, i3).toString();
    }

    @InterfaceC7396q
    public static final String wr(@InterfaceC7396q String str, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(i2, str.length());
                break;
            }
            i2++;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean wtop(@InterfaceC7396q CharSequence charSequence, char c2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length() > 0 && C6450n.oc(charSequence.charAt(kt06(charSequence)), c2, z2);
    }

    public static /* synthetic */ String wu(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return l7o(str, str2, str3, str4);
    }

    private static final int wwp(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        C6349p x2Var = !z3 ? new kotlin.ranges.x2(kotlin.ranges.fn3e.fn3e(i2, 0), kotlin.ranges.fn3e.m23305t(i3, charSequence.length())) : kotlin.ranges.fn3e.i1(kotlin.ranges.fn3e.m23305t(i2, kt06(charSequence)), kotlin.ranges.fn3e.fn3e(i3, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iF7l8 = x2Var.f7l8();
            int iM23353y = x2Var.m23353y();
            int iM23352s = x2Var.m23352s();
            if ((iM23352s <= 0 || iF7l8 > iM23353y) && (iM23352s >= 0 || iM23353y > iF7l8)) {
                return -1;
            }
            while (!a9.m23503w((String) charSequence2, 0, (String) charSequence, iF7l8, charSequence2.length(), z2)) {
                if (iF7l8 == iM23353y) {
                    return -1;
                }
                iF7l8 += iM23352s;
            }
            return iF7l8;
        }
        int iF7l82 = x2Var.f7l8();
        int iM23353y2 = x2Var.m23353y();
        int iM23352s2 = x2Var.m23352s();
        if ((iM23352s2 <= 0 || iF7l82 > iM23353y2) && (iM23352s2 >= 0 || iM23353y2 > iF7l82)) {
            return -1;
        }
        while (!oaex(charSequence2, 0, charSequence, iF7l82, charSequence2.length(), z2)) {
            if (iF7l82 == iM23353y2) {
                return -1;
            }
            iF7l82 += iM23352s2;
        }
        return iF7l82;
    }

    @InterfaceC7396q
    public static final List<String> x3b(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q char[] delimiters, boolean z2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return b6(charSequence, String.valueOf(delimiters[0]), z2, i2);
        }
        Iterable iterableM23431r = kotlin.sequences.fn3e.m23431r(uv(charSequence, delimiters, 0, z2, i2, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(iterableM23431r, 10));
        Iterator it = iterableM23431r.iterator();
        while (it.hasNext()) {
            arrayList.add(c2(charSequence, (kotlin.ranges.x2) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ int x7o(CharSequence charSequence, char c2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = kt06(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return z5(charSequence, c2, i2, z2);
    }

    public static /* synthetic */ String xblq(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return hyow(charSequence, charSequence2, z2);
    }

    @InterfaceC7396q
    public static final CharSequence xh(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q cyoe.x2<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i2 = length - 1;
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i2 < 0) {
                return "";
            }
            length = i2;
        }
    }

    @InterfaceC7396q
    public static final String xnu(@InterfaceC7396q String str, char c2, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iSc = sc(str, c2, 0, false, 6, null);
        if (iSc == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iSc + 1, str.length());
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ boolean xo(CharSequence charSequence, CharSequence charSequence2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return sm(charSequence, charSequence2, i2, z2);
    }

    public static final void xouc(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    public static final boolean xtb7(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q CharSequence other, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        if (other instanceof String) {
            if (b7(charSequence, (String) other, 0, z2, 2, null) >= 0) {
                return true;
            }
        } else if (zuf(charSequence, other, 0, charSequence.length(), z2, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean xzl(@InterfaceC7395n CharSequence charSequence, @InterfaceC7395n CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.d2ok.f7l8(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    private static final String y3(CharSequence charSequence, ki regex, String replacement) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    public static /* synthetic */ boolean ybb(CharSequence charSequence, char c2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return zi4o(charSequence, c2, z2);
    }

    @InterfaceC7396q
    public static final CharSequence ydj3(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q kotlin.ranges.x2 range, @InterfaceC7396q CharSequence replacement) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(range, "range");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        return a3dw(charSequence, range.mo2951k().intValue(), range.zy().intValue() + 1, replacement);
    }

    @InterfaceC7396q
    public static final String z1r(@InterfaceC7396q String str, char c2, @InterfaceC7396q String replacement, @InterfaceC7396q String missingDelimiterValue) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        kotlin.jvm.internal.d2ok.m23075h(missingDelimiterValue, "missingDelimiterValue");
        int iSc = sc(str, c2, 0, false, 6, null);
        return iSc == -1 ? missingDelimiterValue : a3dw(str, 0, iSc, replacement).toString();
    }

    public static /* synthetic */ C6227f z4j7(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = kt06(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return vss1(charSequence, collection, i2, z2);
    }

    public static final int z5(@InterfaceC7396q CharSequence charSequence, char c2, int i2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? mete(charSequence, new char[]{c2}, i2, z2) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    public static final boolean z617(@InterfaceC7395n CharSequence charSequence, @InterfaceC7395n CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return a9.e5((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!C6450n.oc(charSequence.charAt(i2), charSequence2.charAt(i2), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int z8(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = kt06(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return b2(charSequence, str, i2, z2);
    }

    @InterfaceC6234g
    private static final String zah1(CharSequence charSequence, ki regex, String replacement) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(regex, "regex");
        kotlin.jvm.internal.d2ok.m23075h(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    public static /* synthetic */ boolean zaso(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return jglj(charSequence, charSequence2, z2);
    }

    public static final boolean zi4o(@InterfaceC7396q CharSequence charSequence, char c2, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        return charSequence.length() > 0 && C6450n.oc(charSequence.charAt(0), c2, z2);
    }

    public static /* synthetic */ int zma(CharSequence charSequence, Collection collection, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = kt06(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return sb1e(charSequence, collection, i2, z2);
    }

    @InterfaceC7396q
    public static final List<String> zt(@InterfaceC7396q CharSequence charSequence, @InterfaceC7396q String[] delimiters, boolean z2, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(charSequence, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return b6(charSequence, str, z2, i2);
            }
        }
        Iterable iterableM23431r = kotlin.sequences.fn3e.m23431r(qla(charSequence, delimiters, 0, z2, i2, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(iterableM23431r, 10));
        Iterator it = iterableM23431r.iterator();
        while (it.hasNext()) {
            arrayList.add(c2(charSequence, (kotlin.ranges.x2) it.next()));
        }
        return arrayList;
    }

    static /* synthetic */ int zuf(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z3 = false;
        }
        return wwp(charSequence, charSequence2, i2, i3, z2, z3);
    }

    public static /* synthetic */ String zxa9(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return drpy(str, str2, str3);
    }

    @InterfaceC7396q
    public static final String zxq(@InterfaceC7396q String str, int i2, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return erbd(str, i2, c2).toString();
    }
}

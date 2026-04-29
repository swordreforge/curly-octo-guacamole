package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
public class fu4 extends ni7 {

    /* JADX INFO: renamed from: kotlin.text.fu4$k */
    /* JADX INFO: compiled from: Indent.kt */
    static final class C6432k extends AbstractC6308r implements cyoe.x2<String, String> {
        public static final C6432k INSTANCE = new C6432k();

        C6432k() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q String line) {
            kotlin.jvm.internal.d2ok.m23075h(line, "line");
            return line;
        }
    }

    /* JADX INFO: compiled from: Indent.kt */
    static final class toq extends AbstractC6308r implements cyoe.x2<String, String> {
        final /* synthetic */ String $indent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(String str) {
            super(1);
            this.$indent = str;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q String line) {
            kotlin.jvm.internal.d2ok.m23075h(line, "line");
            return this.$indent + line;
        }
    }

    /* JADX INFO: compiled from: Indent.kt */
    static final class zy extends AbstractC6308r implements cyoe.x2<String, String> {
        final /* synthetic */ String $indent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(String str) {
            super(1);
            this.$indent = str;
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q String it) {
            kotlin.jvm.internal.d2ok.m23075h(it, "it");
            if (a9.m58i(it)) {
                return it.length() < this.$indent.length() ? this.$indent : it;
            }
            return this.$indent + it;
        }
    }

    @InterfaceC7396q
    @kotlin.internal.f7l8
    public static final String cdj(@InterfaceC7396q String str, @InterfaceC7396q String marginPrefix) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(marginPrefix, "marginPrefix");
        return n7h(str, "", marginPrefix);
    }

    private static final cyoe.x2<String, String> f7l8(String str) {
        return str.length() == 0 ? C6432k.INSTANCE : new toq(str);
    }

    @InterfaceC7396q
    @kotlin.internal.f7l8
    /* JADX INFO: renamed from: h */
    public static String m23524h(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return x2(str, "");
    }

    public static /* synthetic */ String ki(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return cdj(str, str2);
    }

    public static /* synthetic */ String kja0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        if ((i2 & 2) != 0) {
            str3 = "|";
        }
        return n7h(str, str2, str3);
    }

    private static final String ld6(List<String> list, int i2, cyoe.x2<? super String, String> x2Var, cyoe.x2<? super String, String> x2Var2) {
        String strInvoke;
        int iJp0y = kotlin.collections.ni7.jp0y(list);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.ni7.lrht();
            }
            String str = (String) obj;
            if ((i3 == 0 || i3 == iJp0y) && a9.m58i(str)) {
                str = null;
            } else {
                String strInvoke2 = x2Var2.invoke(str);
                if (strInvoke2 != null && (strInvoke = x2Var.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i3 = i4;
        }
        String string = ((StringBuilder) kotlin.collections.a9.kt06(arrayList, new StringBuilder(i2), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    @InterfaceC7396q
    public static final String n7h(@InterfaceC7396q String str, @InterfaceC7396q String newIndent, @InterfaceC7396q String marginPrefix) {
        int i2;
        String strInvoke;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(newIndent, "newIndent");
        kotlin.jvm.internal.d2ok.m23075h(marginPrefix, "marginPrefix");
        if (!(!a9.m58i(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listK4jz = fti.k4jz(str);
        int length = str.length() + (newIndent.length() * listK4jz.size());
        cyoe.x2<String, String> x2VarF7l8 = f7l8(newIndent);
        int iJp0y = kotlin.collections.ni7.jp0y(listK4jz);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : listK4jz) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.ni7.lrht();
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i3 == 0 || i3 == iJp0y) && a9.m58i(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (!C6452q.ki(str2.charAt(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = i2;
                    if (a9.cyoe(str2, marginPrefix, i2, false, 4, null)) {
                        int length3 = i6 + marginPrefix.length();
                        kotlin.jvm.internal.d2ok.n7h(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null && (strInvoke = x2VarF7l8.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i3 = i4;
        }
        String string = ((StringBuilder) kotlin.collections.a9.kt06(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m23525p(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "    ";
        }
        return m23526s(str, str2);
    }

    public static /* synthetic */ String qrj(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        return x2(str, str2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final String m23526s(@InterfaceC7396q String str, @InterfaceC7396q String indent) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indent, "indent");
        return kotlin.sequences.fn3e.gc3c(kotlin.sequences.fn3e.b3e(fti.m28(str), new zy(indent)), "\n", null, null, 0, null, null, 62, null);
    }

    @InterfaceC7396q
    public static final String x2(@InterfaceC7396q String str, @InterfaceC7396q String newIndent) {
        String strInvoke;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(newIndent, "newIndent");
        List<String> listK4jz = fti.k4jz(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK4jz) {
            if (!a9.m58i((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.fu4.vyq(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m23527y((String) it.next())));
        }
        Integer num = (Integer) kotlin.collections.a9.eklw(arrayList2);
        int i2 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listK4jz.size());
        cyoe.x2<String, String> x2VarF7l8 = f7l8(newIndent);
        int iJp0y = kotlin.collections.ni7.jp0y(listK4jz);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listK4jz) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.ni7.lrht();
            }
            String str2 = (String) obj2;
            if ((i2 == 0 || i2 == iJp0y) && a9.m58i(str2)) {
                str2 = null;
            } else {
                String strFpn = gvn7.fpn(str2, iIntValue);
                if (strFpn != null && (strInvoke = x2VarF7l8.invoke(strFpn)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i2 = i3;
        }
        String string = ((StringBuilder) kotlin.collections.a9.kt06(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: y */
    private static final int m23527y(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!C6452q.ki(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return i2 == -1 ? str.length() : i2;
    }
}

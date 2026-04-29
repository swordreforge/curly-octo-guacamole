package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class fu4 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f93827f7l8 = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final String f42951g = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f42955k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final String[] f42956q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final String f93828toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final String f93829zy;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final C7434k f42952n = new C7434k(null);

    /* JADX INFO: renamed from: y */
    private static final Pattern f42954y = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: s */
    private static final Pattern f42953s = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: okhttp3.fu4$k */
    /* JADX INFO: compiled from: MediaType.kt */
    @lv5({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class C7434k {
        private C7434k() {
        }

        public /* synthetic */ C7434k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @InterfaceC6769y(name = "-deprecated_get")
        /* JADX INFO: renamed from: k */
        public final fu4 m26908k(@InterfaceC7396q String mediaType) {
            d2ok.m23075h(mediaType, "mediaType");
            return zy(mediaType);
        }

        @InterfaceC7395n
        @InterfaceC6769y(name = "parse")
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final fu4 m26909q(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<this>");
            try {
                return zy(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @InterfaceC6769y(name = "-deprecated_parse")
        public final fu4 toq(@InterfaceC7396q String mediaType) {
            d2ok.m23075h(mediaType, "mediaType");
            return m26909q(mediaType);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        @l05.qrj
        public final fu4 zy(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<this>");
            Matcher matcher = fu4.f42954y.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + kotlin.text.eqxt.f81913toq).toString());
            }
            String strGroup = matcher.group(1);
            d2ok.kja0(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            d2ok.kja0(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            d2ok.kja0(strGroup2, "typeSubtype.group(2)");
            d2ok.kja0(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            d2ok.kja0(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = fu4.f42953s.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(kotlin.text.eqxt.f81913toq);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (kotlin.text.a9.r6ty(strGroup4, "'", false, 2, null) && kotlin.text.a9.ga(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        d2ok.kja0(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new fu4(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }
    }

    private fu4(String str, String str2, String str3, String[] strArr) {
        this.f42955k = str;
        this.f93828toq = str2;
        this.f93829zy = str3;
        this.f42956q = strArr;
    }

    public /* synthetic */ fu4(String str, String str2, String str3, String[] strArr, kotlin.jvm.internal.ni7 ni7Var) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset f7l8(fu4 fu4Var, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = null;
        }
        return fu4Var.m26904g(charset);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "parse")
    @l05.qrj
    /* JADX INFO: renamed from: p */
    public static final fu4 m26901p(@InterfaceC7396q String str) {
        return f42952n.m26909q(str);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    @l05.qrj
    /* JADX INFO: renamed from: y */
    public static final fu4 m26903y(@InterfaceC7396q String str) {
        return f42952n.zy(str);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof fu4) && d2ok.f7l8(((fu4) obj).f42955k, this.f42955k);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final Charset m26904g(@InterfaceC7395n Charset charset) {
        String strM26907s = m26907s("charset");
        if (strM26907s == null) {
            return charset;
        }
        try {
            return Charset.forName(strM26907s);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public int hashCode() {
        return this.f42955k.hashCode();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "subtype", imports = {}))
    @InterfaceC6769y(name = "-deprecated_subtype")
    /* JADX INFO: renamed from: k */
    public final String m26905k() {
        return this.f93829zy;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "subtype")
    public final String ld6() {
        return this.f93829zy;
    }

    @InterfaceC6768s
    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Charset m26906n() {
        return f7l8(this, null, 1, null);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final String m26907s(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        int i2 = 0;
        int iZy = kotlin.internal.n7h.zy(0, this.f42956q.length - 1, 2);
        if (iZy < 0) {
            return null;
        }
        while (!kotlin.text.a9.e5(this.f42956q[i2], name, true)) {
            if (i2 == iZy) {
                return null;
            }
            i2 += 2;
        }
        return this.f42956q[i2 + 1];
    }

    @InterfaceC7396q
    public String toString() {
        return this.f42955k;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "type", imports = {}))
    @InterfaceC6769y(name = "-deprecated_type")
    public final String toq() {
        return this.f93828toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "type")
    public final String x2() {
        return this.f93828toq;
    }
}

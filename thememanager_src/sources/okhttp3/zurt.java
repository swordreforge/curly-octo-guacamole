package okhttp3;

import b7.C1359g;
import b7.C1360k;
import com.miui.clock.module.toq;
import com.xiaomi.onetrack.api.C5693g;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.a98o;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.ranges.C6349p;
import l05.InterfaceC6769y;
import miuix.view.C7385p;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.C7571o;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class zurt {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94235cdj = " \"'<>#";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94236fn3e = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    public static final String f43629h = "[]";

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    public static final String f43630i = "\\^`{|}";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94237ki = " \"'<>#&=";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94238kja0 = " \"<>^`{}|/\\?#";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94240n7h = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94241ni7 = " \"#<>\\^`{|}";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94242qrj = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94243t8r = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94245zurt = "";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private final List<String> f94246f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final List<String> f43631g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f43632k;

    /* JADX INFO: renamed from: n */
    private final int f43633n;

    /* JADX INFO: renamed from: p */
    private final boolean f43634p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final String f43635q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final String f43636s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final String f94247toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private final String f43637y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final String f94248zy;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f94239ld6 = new toq(null);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    private static final char[] f94244x2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: okhttp3.zurt$k */
    /* JADX INFO: compiled from: HttpUrl.kt */
    @lv5({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class C7535k {

        /* JADX INFO: renamed from: p */
        @InterfaceC7396q
        public static final String f43638p = "Invalid URL host";

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        public static final k f43639s = new k(null);

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7395n
        private List<String> f94249f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final List<String> f43640g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private String f43641k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private String f43643q;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private String f43644y;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private String f94250toq = "";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private String f94251zy = "";

        /* JADX INFO: renamed from: n */
        private int f43642n = -1;

        /* JADX INFO: renamed from: okhttp3.zurt$k$k */
        /* JADX INFO: compiled from: HttpUrl.kt */
        public static final class k {
            private k() {
            }

            public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f7l8(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i2);
                if ((d2ok.m23076i(cCharAt, 97) >= 0 && d2ok.m23076i(cCharAt, 122) <= 0) || (d2ok.m23076i(cCharAt, 65) >= 0 && d2ok.m23076i(cCharAt, 90) <= 0)) {
                    for (int i4 = i2 + 1; i4 < i3; i4++) {
                        char cCharAt2 = str.charAt(i4);
                        if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                            if (cCharAt2 == ':') {
                                return i4;
                            }
                            return -1;
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: g */
            public final int m27540g(String str, int i2, int i3) {
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '[') {
                        do {
                            i2++;
                            if (i2 < i3) {
                            }
                        } while (str.charAt(i2) != ']');
                    } else if (cCharAt == ':') {
                        return i2;
                    }
                    i2++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: n */
            public final int m27542n(String str, int i2, int i3) {
                try {
                    int i4 = Integer.parseInt(toq.m27545g(zurt.f94239ld6, str, i2, i3, "", false, false, false, false, null, 248, null));
                    boolean z2 = false;
                    if (1 <= i4 && i4 < 65536) {
                        z2 = true;
                    }
                    if (z2) {
                        return i4;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: y */
            public final int m27544y(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }
        }

        public C7535k() {
            ArrayList arrayList = new ArrayList();
            this.f43640g = arrayList;
            arrayList.add("");
        }

        private final void a9(String str, int i2, int i3, boolean z2, boolean z3) {
            String strM27545g = toq.m27545g(zurt.f94239ld6, str, i2, i3, zurt.f94238kja0, z3, false, false, false, null, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, null);
            if (m27527z(strM27545g)) {
                return;
            }
            if (o1t(strM27545g)) {
                mcp();
                return;
            }
            List<String> list = this.f43640g;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f43640g;
                list2.set(list2.size() - 1, strM27545g);
            } else {
                this.f43640g.add(strM27545g);
            }
            if (z2) {
                this.f43640g.add("");
            }
        }

        private final void d2ok(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f43640g.clear();
                this.f43640g.add("");
                i2++;
            } else {
                List<String> list = this.f43640g;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                while (i4 < i3) {
                    i2 = C1359g.m5755i(str, "/\\", i4, i3);
                    boolean z2 = i2 < i3;
                    a9(str, i4, i2, z2, true);
                    if (z2) {
                        i4 = i2 + 1;
                    }
                }
                return;
            }
        }

        /* JADX INFO: renamed from: g */
        private final C7535k m27525g(String str, boolean z2) {
            int i2 = 0;
            do {
                int iM5755i = C1359g.m5755i(str, "/\\", i2, str.length());
                a9(str, i2, iM5755i, iM5755i < str.length(), z2);
                i2 = iM5755i + 1;
            } while (i2 <= str.length());
            return this;
        }

        private final void gvn7(String str) {
            List<String> list = this.f94249f7l8;
            d2ok.qrj(list);
            int size = list.size() - 2;
            int iZy = kotlin.internal.n7h.zy(size, 0, -2);
            if (iZy > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.f94249f7l8;
                d2ok.qrj(list2);
                if (d2ok.f7l8(str, list2.get(size))) {
                    List<String> list3 = this.f94249f7l8;
                    d2ok.qrj(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.f94249f7l8;
                    d2ok.qrj(list4);
                    list4.remove(size);
                    List<String> list5 = this.f94249f7l8;
                    d2ok.qrj(list5);
                    if (list5.isEmpty()) {
                        this.f94249f7l8 = null;
                        return;
                    }
                }
                if (size == iZy) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void mcp() {
            List<String> list = this.f43640g;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f43640g.isEmpty())) {
                this.f43640g.add("");
            } else {
                List<String> list2 = this.f43640g;
                list2.set(list2.size() - 1, "");
            }
        }

        private final boolean o1t(String str) {
            return d2ok.f7l8(str, "..") || kotlin.text.a9.e5(str, "%2e.", true) || kotlin.text.a9.e5(str, ".%2e", true) || kotlin.text.a9.e5(str, "%2e%2e", true);
        }

        /* JADX INFO: renamed from: s */
        private final int m27526s() {
            int i2 = this.f43642n;
            if (i2 != -1) {
                return i2;
            }
            toq toqVar = zurt.f94239ld6;
            String str = this.f43641k;
            d2ok.qrj(str);
            return toqVar.f7l8(str);
        }

        /* JADX INFO: renamed from: z */
        private final boolean m27527z(String str) {
            return d2ok.f7l8(str, ".") || kotlin.text.a9.e5(str, "%2e", true);
        }

        /* JADX INFO: renamed from: c */
        public final void m27528c(int i2) {
            this.f43642n = i2;
        }

        @InterfaceC7396q
        public final String cdj() {
            return this.f94251zy;
        }

        @InterfaceC7396q
        public final C7535k d3(@InterfaceC7396q String encodedName) {
            d2ok.m23075h(encodedName, "encodedName");
            if (this.f94249f7l8 == null) {
                return this;
            }
            gvn7(toq.m27545g(zurt.f94239ld6, encodedName, 0, 0, zurt.f94237ki, true, false, true, false, null, toq.zy.f72004x2, null));
            return this;
        }

        public final void dd(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<set-?>");
            this.f94251zy = str;
        }

        @InterfaceC7396q
        public final C7535k eqxt(int i2) {
            this.f43640g.remove(i2);
            if (this.f43640g.isEmpty()) {
                this.f43640g.add("");
            }
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: f */
        public final C7535k m27529f(int i2, @InterfaceC7396q String pathSegment) {
            d2ok.m23075h(pathSegment, "pathSegment");
            String strM27545g = toq.m27545g(zurt.f94239ld6, pathSegment, 0, 0, zurt.f94238kja0, false, false, false, false, null, 251, null);
            if ((m27527z(strM27545g) || o1t(strM27545g)) ? false : true) {
                this.f43640g.set(i2, strM27545g);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        @InterfaceC7396q
        public final C7535k f7l8(@InterfaceC7396q String name, @InterfaceC7395n String str) {
            d2ok.m23075h(name, "name");
            if (this.f94249f7l8 == null) {
                this.f94249f7l8 = new ArrayList();
            }
            List<String> list = this.f94249f7l8;
            d2ok.qrj(list);
            toq toqVar = zurt.f94239ld6;
            list.add(toq.m27545g(toqVar, name, 0, 0, zurt.f94243t8r, false, false, true, false, null, 219, null));
            List<String> list2 = this.f94249f7l8;
            d2ok.qrj(list2);
            list2.add(str != null ? toq.m27545g(toqVar, str, 0, 0, zurt.f94243t8r, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @InterfaceC7395n
        public final String fn3e() {
            return this.f43643q;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @mub.InterfaceC7396q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.zurt.C7535k fti(@mub.InterfaceC7395n java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.zurt$toq r12 = okhttp3.zurt.f94239ld6
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.zurt.toq.m27545g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.m27546h(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.f94249f7l8 = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.zurt.C7535k.fti(java.lang.String):okhttp3.zurt$k");
        }

        @InterfaceC7396q
        public final C7535k fu4(@InterfaceC7396q String host) {
            d2ok.m23075h(host, "host");
            String strM5771n = C1360k.m5771n(toq.n7h(zurt.f94239ld6, host, 0, 0, false, 7, null));
            if (strM5771n != null) {
                this.f43643q = strM5771n;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: h */
        public final String m27530h() {
            return this.f43644y;
        }

        public final void hyr(@InterfaceC7395n String str) {
            this.f43643q = str;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: i */
        public final String m27531i() {
            return this.f94250toq;
        }

        @InterfaceC7396q
        public final C7535k jk(int i2) {
            boolean z2 = false;
            if (1 <= i2 && i2 < 65536) {
                z2 = true;
            }
            if (z2) {
                this.f43642n = i2;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i2).toString());
        }

        @InterfaceC7396q
        public final C7535k jp0y() {
            String str = this.f43643q;
            this.f43643q = str != null ? new kotlin.text.ki("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f43640g.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list = this.f43640g;
                list.set(i2, toq.m27545g(zurt.f94239ld6, list.get(i2), 0, 0, zurt.f43629h, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f94249f7l8;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = list2.get(i3);
                    list2.set(i3, str2 != null ? toq.m27545g(zurt.f94239ld6, str2, 0, 0, zurt.f43630i, true, true, true, false, null, C7385p.f42281z, null) : null);
                }
            }
            String str3 = this.f43644y;
            this.f43644y = str3 != null ? toq.m27545g(zurt.f94239ld6, str3, 0, 0, zurt.f94241ni7, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7535k m27532k(@InterfaceC7396q String encodedPathSegment) {
            d2ok.m23075h(encodedPathSegment, "encodedPathSegment");
            a9(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @InterfaceC7396q
        public final List<String> ki() {
            return this.f43640g;
        }

        @InterfaceC7396q
        public final C7535k kja0(@InterfaceC7395n String str) {
            this.f43644y = str != null ? toq.m27545g(zurt.f94239ld6, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: l */
        public final C7535k m27533l(@InterfaceC7396q String encodedName, @InterfaceC7395n String str) {
            d2ok.m23075h(encodedName, "encodedName");
            d3(encodedName);
            zy(encodedName, str);
            return this;
        }

        @InterfaceC7396q
        public final C7535k ld6(@InterfaceC7396q String encodedPassword) {
            d2ok.m23075h(encodedPassword, "encodedPassword");
            this.f94251zy = toq.m27545g(zurt.f94239ld6, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @InterfaceC7396q
        public final C7535k lrht(@InterfaceC7396q String name, @InterfaceC7395n String str) {
            d2ok.m23075h(name, "name");
            oc(name);
            f7l8(name, str);
            return this;
        }

        @InterfaceC7396q
        public final C7535k lvui(@InterfaceC7396q String scheme) {
            d2ok.m23075h(scheme, "scheme");
            if (kotlin.text.a9.e5(scheme, "http", true)) {
                this.f43641k = "http";
            } else {
                if (!kotlin.text.a9.e5(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.f43641k = "https";
            }
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final C7535k m27534n(@InterfaceC7396q String pathSegments) {
            d2ok.m23075h(pathSegments, "pathSegments");
            return m27525g(pathSegments, false);
        }

        public final void n5r1(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<set-?>");
            this.f94250toq = str;
        }

        @InterfaceC7396q
        public final C7535k n7h(@InterfaceC7396q String encodedUsername) {
            d2ok.m23075h(encodedUsername, "encodedUsername");
            this.f94250toq = toq.m27545g(zurt.f94239ld6, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final void ncyb(@InterfaceC7395n List<String> list) {
            this.f94249f7l8 = list;
        }

        @InterfaceC7395n
        public final String ni7() {
            return this.f43641k;
        }

        @InterfaceC7396q
        public final C7535k oc(@InterfaceC7396q String name) {
            d2ok.m23075h(name, "name");
            if (this.f94249f7l8 == null) {
                return this;
            }
            gvn7(toq.m27545g(zurt.f94239ld6, name, 0, 0, zurt.f94243t8r, false, false, true, false, null, 219, null));
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public final C7535k m27535p(@InterfaceC7395n String str) {
            this.f43644y = str != null ? toq.m27545g(zurt.f94239ld6, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C7535k m27536q(@InterfaceC7396q String pathSegment) {
            d2ok.m23075h(pathSegment, "pathSegment");
            a9(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @mub.InterfaceC7396q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.zurt.C7535k qrj(@mub.InterfaceC7395n java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.zurt$toq r12 = okhttp3.zurt.f94239ld6
                r2 = 0
                r3 = 0
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                java.lang.String r4 = " \"'<>#"
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.zurt.toq.m27545g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.m27546h(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.f94249f7l8 = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.zurt.C7535k.qrj(java.lang.String):okhttp3.zurt$k");
        }

        /* JADX INFO: renamed from: r */
        public final void m27537r(@InterfaceC7395n String str) {
            this.f43644y = str;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: t */
        public final C7535k m27538t(@InterfaceC7396q String password) {
            d2ok.m23075h(password, "password");
            this.f94251zy = toq.m27545g(zurt.f94239ld6, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @InterfaceC7395n
        public final List<String> t8r() {
            return this.f94249f7l8;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
        @mub.InterfaceC7396q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.zurt.C7535k.toString():java.lang.String");
        }

        @InterfaceC7396q
        public final C7535k toq(@InterfaceC7396q String encodedPathSegments) {
            d2ok.m23075h(encodedPathSegments, "encodedPathSegments");
            return m27525g(encodedPathSegments, true);
        }

        public final void uv6(@InterfaceC7395n String str) {
            this.f43641k = str;
        }

        @InterfaceC7396q
        public final C7535k vyq(@InterfaceC7396q String username) {
            d2ok.m23075h(username, "username");
            this.f94250toq = toq.m27545g(zurt.f94239ld6, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @InterfaceC7396q
        public final C7535k wvg(@InterfaceC7395n zurt zurtVar, @InterfaceC7396q String str) {
            int iM5755i;
            int i2;
            int i3;
            String str2;
            boolean z2;
            int i4;
            String str3;
            int i5;
            boolean z3;
            String input = str;
            d2ok.m23075h(input, "input");
            int iJp0y = C1359g.jp0y(input, 0, 0, 3, null);
            int iD3 = C1359g.d3(input, iJp0y, 0, 2, null);
            k kVar = f43639s;
            int iF7l8 = kVar.f7l8(input, iJp0y, iD3);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            byte b2 = -1;
            boolean z5 = true;
            if (iF7l8 != -1) {
                if (kotlin.text.a9.rp(input, "https:", iJp0y, true)) {
                    this.f43641k = "https";
                    iJp0y += 6;
                } else {
                    if (!kotlin.text.a9.rp(input, "http:", iJp0y, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iF7l8);
                        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f43641k = "http";
                    iJp0y += 5;
                }
            } else {
                if (zurtVar == null) {
                    if (str.length() > 6) {
                        input = kotlin.text.gvn7.fjxh(input, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
                }
                this.f43641k = zurtVar.uv6();
            }
            int iM27544y = kVar.m27544y(input, iJp0y, iD3);
            byte b3 = C7571o.f43818k;
            byte b4 = 35;
            if (iM27544y >= 2 || zurtVar == null || !d2ok.f7l8(zurtVar.uv6(), this.f43641k)) {
                int i6 = iJp0y + iM27544y;
                boolean z6 = false;
                boolean z7 = false;
                while (true) {
                    iM5755i = C1359g.m5755i(input, "@/\\?#", i6, iD3);
                    byte bCharAt = iM5755i != iD3 ? input.charAt(iM5755i) : b2;
                    if (bCharAt == b2 || bCharAt == b4 || bCharAt == 47 || bCharAt == 92 || bCharAt == b3) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z6) {
                            z2 = z5;
                            i4 = iD3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f94251zy);
                            sb2.append("%40");
                            str3 = str4;
                            i5 = iM5755i;
                            sb2.append(toq.m27545g(zurt.f94239ld6, str, i6, iM5755i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, null));
                            this.f94251zy = sb2.toString();
                        } else {
                            int iT8r = C1359g.t8r(input, ':', i6, iM5755i);
                            toq toqVar = zurt.f94239ld6;
                            z2 = z5;
                            i4 = iD3;
                            String str5 = str4;
                            String strM27545g = toq.m27545g(toqVar, str, i6, iT8r, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, null);
                            if (z7) {
                                strM27545g = this.f94250toq + "%40" + strM27545g;
                            }
                            this.f94250toq = strM27545g;
                            if (iT8r != iM5755i) {
                                this.f94251zy = toq.m27545g(toqVar, str, iT8r + 1, iM5755i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, null);
                                z3 = z2;
                            } else {
                                z3 = z6;
                            }
                            z6 = z3;
                            str3 = str5;
                            z7 = z2;
                            i5 = iM5755i;
                        }
                        i6 = i5 + 1;
                        str4 = str3;
                        z5 = z2;
                        iD3 = i4;
                        b4 = 35;
                        b3 = C7571o.f43818k;
                        b2 = -1;
                    }
                }
                boolean z8 = z5;
                String str6 = str4;
                i2 = iD3;
                k kVar2 = f43639s;
                int iM27540g = kVar2.m27540g(input, i6, iM5755i);
                int i7 = iM27540g + 1;
                if (i7 < iM5755i) {
                    i3 = i6;
                    this.f43643q = C1360k.m5771n(toq.n7h(zurt.f94239ld6, str, i6, iM27540g, false, 4, null));
                    int iM27542n = kVar2.m27542n(input, i7, iM5755i);
                    this.f43642n = iM27542n;
                    if (!(iM27542n != -1 ? z8 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i7, iM5755i);
                        d2ok.kja0(strSubstring2, str6);
                        sb3.append(strSubstring2);
                        sb3.append(kotlin.text.eqxt.f81913toq);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i3 = i6;
                    str2 = str6;
                    toq toqVar2 = zurt.f94239ld6;
                    this.f43643q = C1360k.m5771n(toq.n7h(toqVar2, str, i3, iM27540g, false, 4, null));
                    String str7 = this.f43641k;
                    d2ok.qrj(str7);
                    this.f43642n = toqVar2.f7l8(str7);
                }
                if (!(this.f43643q != null ? z8 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i3, iM27540g);
                    d2ok.kja0(strSubstring3, str2);
                    sb4.append(strSubstring3);
                    sb4.append(kotlin.text.eqxt.f81913toq);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iJp0y = iM5755i;
            } else {
                this.f94250toq = zurtVar.wvg();
                this.f94251zy = zurtVar.ni7();
                this.f43643q = zurtVar.fti();
                this.f43642n = zurtVar.m27520r();
                this.f43640g.clear();
                this.f43640g.addAll(zurtVar.m27524z());
                if (iJp0y == iD3 || input.charAt(iJp0y) == '#') {
                    qrj(zurtVar.o1t());
                }
                i2 = iD3;
            }
            int i8 = i2;
            int iM5755i2 = C1359g.m5755i(input, "?#", iJp0y, i8);
            d2ok(input, iJp0y, iM5755i2);
            if (iM5755i2 < i8 && input.charAt(iM5755i2) == '?') {
                int iT8r2 = C1359g.t8r(input, '#', iM5755i2, i8);
                toq toqVar3 = zurt.f94239ld6;
                this.f94249f7l8 = toqVar3.m27546h(toq.m27545g(toqVar3, str, iM5755i2 + 1, iT8r2, zurt.f94235cdj, true, false, true, false, null, toq.zy.f29239s, null));
                iM5755i2 = iT8r2;
            }
            if (iM5755i2 < i8 && input.charAt(iM5755i2) == '#') {
                this.f43644y = toq.m27545g(zurt.f94239ld6, str, iM5755i2 + 1, i8, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @InterfaceC7396q
        public final C7535k x2(@InterfaceC7396q String encodedPath) {
            d2ok.m23075h(encodedPath, "encodedPath");
            if (kotlin.text.a9.r6ty(encodedPath, "/", false, 2, null)) {
                d2ok(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        @InterfaceC7396q
        public final C7535k x9kr(int i2, @InterfaceC7396q String encodedPathSegment) {
            d2ok.m23075h(encodedPathSegment, "encodedPathSegment");
            String strM27545g = toq.m27545g(zurt.f94239ld6, encodedPathSegment, 0, 0, zurt.f94238kja0, true, false, false, false, null, 243, null);
            this.f43640g.set(i2, strM27545g);
            if ((m27527z(strM27545g) || o1t(strM27545g)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final zurt m27539y() {
            ArrayList arrayList;
            String str = this.f43641k;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            toq toqVar = zurt.f94239ld6;
            String strN7h = toq.n7h(toqVar, this.f94250toq, 0, 0, false, 7, null);
            String strN7h2 = toq.n7h(toqVar, this.f94251zy, 0, 0, false, 7, null);
            String str2 = this.f43643q;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM27526s = m27526s();
            List<String> list = this.f43640g;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.fu4.vyq(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toq.n7h(zurt.f94239ld6, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f94249f7l8;
            if (list2 != null) {
                arrayList = new ArrayList(kotlin.collections.fu4.vyq(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? toq.n7h(zurt.f94239ld6, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f43644y;
            return new zurt(str, strN7h, strN7h2, str2, iM27526s, arrayList2, arrayList, str4 != null ? toq.n7h(zurt.f94239ld6, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final int zurt() {
            return this.f43642n;
        }

        @InterfaceC7396q
        public final C7535k zy(@InterfaceC7396q String encodedName, @InterfaceC7395n String str) {
            d2ok.m23075h(encodedName, "encodedName");
            if (this.f94249f7l8 == null) {
                this.f94249f7l8 = new ArrayList();
            }
            List<String> list = this.f94249f7l8;
            d2ok.qrj(list);
            toq toqVar = zurt.f94239ld6;
            list.add(toq.m27545g(toqVar, encodedName, 0, 0, zurt.f94237ki, true, false, true, false, null, toq.zy.f72004x2, null));
            List<String> list2 = this.f94249f7l8;
            d2ok.qrj(list2);
            list2.add(str != null ? toq.m27545g(toqVar, str, 0, 0, zurt.f94237ki, true, false, true, false, null, toq.zy.f72004x2, null) : null);
            return this;
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ String m27545g(toq toqVar, String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z5, boolean z6, Charset charset, int i4, Object obj) {
            return toqVar.m27548n(str, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? str.length() : i3, str2, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? false : z5, (i4 & 64) != 0 ? false : z6, (i4 & 128) != 0 ? null : charset);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0090 A[LOOP:1: B:49:0x008a->B:51:0x0090, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void ki(okio.x2 r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.lrht(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.zurt.vwb(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.ld6(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.ni7(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                okio.x2 r6 = new okio.x2
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.d2ok.f7l8(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.c8jq(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.ni7(r7)
            L8a:
                boolean r10 = r6.py()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.zurt.m27509i()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.zurt.m27509i()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.zurt.toq.ki(okio.x2, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final boolean ld6(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && C1359g.m5758l(str.charAt(i2 + 1)) != -1 && C1359g.m5758l(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String n7h(toq toqVar, String str, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z2 = false;
            }
            return toqVar.qrj(str, i2, i3, z2);
        }

        private final void t8r(okio.x2 x2Var, String str, int i2, int i3, boolean z2) {
            int i4;
            while (i2 < i3) {
                int iCodePointAt = str.codePointAt(i2);
                if (iCodePointAt == 37 && (i4 = i2 + 2) < i3) {
                    int iM5758l = C1359g.m5758l(str.charAt(i2 + 1));
                    int iM5758l2 = C1359g.m5758l(str.charAt(i4));
                    if (iM5758l == -1 || iM5758l2 == -1) {
                        x2Var.ni7(iCodePointAt);
                        i2 += Character.charCount(iCodePointAt);
                    } else {
                        x2Var.writeByte((iM5758l << 4) + iM5758l2);
                        i2 = Character.charCount(iCodePointAt) + i4;
                    }
                } else if (iCodePointAt == 43 && z2) {
                    x2Var.writeByte(32);
                    i2++;
                } else {
                    x2Var.ni7(iCodePointAt);
                    i2 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final void cdj(@InterfaceC7396q List<String> list, @InterfaceC7396q StringBuilder out) {
            d2ok.m23075h(list, "<this>");
            d2ok.m23075h(out, "out");
            C6349p c6349pZwy = kotlin.ranges.fn3e.zwy(kotlin.ranges.fn3e.nme(0, list.size()), 2);
            int iF7l8 = c6349pZwy.f7l8();
            int iM23353y = c6349pZwy.m23353y();
            int iM23352s = c6349pZwy.m23352s();
            if ((iM23352s <= 0 || iF7l8 > iM23353y) && (iM23352s >= 0 || iM23353y > iF7l8)) {
                return;
            }
            while (true) {
                String str = list.get(iF7l8);
                String str2 = list.get(iF7l8 + 1);
                if (iF7l8 > 0) {
                    out.append(kotlin.text.eqxt.f36674q);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iF7l8 == iM23353y) {
                    return;
                } else {
                    iF7l8 += iM23352s;
                }
            }
        }

        @l05.qrj
        public final int f7l8(@InterfaceC7396q String scheme) {
            d2ok.m23075h(scheme, "scheme");
            if (d2ok.f7l8(scheme, "http")) {
                return 80;
            }
            return d2ok.f7l8(scheme, "https") ? 443 : -1;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: h */
        public final List<String> m27546h(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int iSc = kotlin.text.fti.sc(str, kotlin.text.eqxt.f36674q, i2, false, 4, null);
                if (iSc == -1) {
                    iSc = str.length();
                }
                int i3 = iSc;
                int iSc2 = kotlin.text.fti.sc(str, '=', i2, false, 4, null);
                if (iSc2 == -1 || iSc2 > i3) {
                    String strSubstring = str.substring(i2, i3);
                    d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i2, iSc2);
                    d2ok.kja0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iSc2 + 1, i3);
                    d2ok.kja0(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i2 = i3 + 1;
            }
            return arrayList;
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @InterfaceC6769y(name = "-deprecated_get")
        /* JADX INFO: renamed from: k */
        public final zurt m27547k(@InterfaceC7396q String url) {
            d2ok.m23075h(url, "url");
            return m27552y(url);
        }

        public final void kja0(@InterfaceC7396q List<String> list, @InterfaceC7396q StringBuilder out) {
            d2ok.m23075h(list, "<this>");
            d2ok.m23075h(out, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                out.append('/');
                out.append(list.get(i2));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        @mub.InterfaceC7396q
        /* JADX INFO: renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String m27548n(@mub.InterfaceC7396q java.lang.String r14, int r15, int r16, @mub.InterfaceC7396q java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, @mub.InterfaceC7395n java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.d2ok.m23075h(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.d2ok.m23075h(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L6f
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L4c
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L4c
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L24
                if (r21 == 0) goto L4c
            L24:
                char r1 = (char) r0
                r6 = 0
                r7 = 2
                r8 = 0
                boolean r1 = kotlin.text.zurt.vwb(r5, r1, r6, r7, r8)
                if (r1 != 0) goto L4c
                r1 = 37
                if (r0 != r1) goto L3e
                if (r18 == 0) goto L4c
                if (r19 == 0) goto L3e
                r11 = r13
                boolean r1 = r13.ld6(r14, r3, r4)
                if (r1 == 0) goto L4d
                goto L3f
            L3e:
                r11 = r13
            L3f:
                r1 = 43
                if (r0 != r1) goto L46
                if (r20 == 0) goto L46
                goto L4d
            L46:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4c:
                r11 = r13
            L4d:
                okio.x2 r12 = new okio.x2
                r12.<init>()
                r0 = r15
                r12.mo27639m(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.ki(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.jbh()
                return r0
            L6f:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.d2ok.kja0(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.zurt.toq.m27548n(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        @InterfaceC7395n
        @InterfaceC6769y(name = "get")
        @l05.qrj
        /* JADX INFO: renamed from: p */
        public final zurt m27549p(@InterfaceC7396q URL url) {
            d2ok.m23075h(url, "<this>");
            String string = url.toString();
            d2ok.kja0(string, "toString()");
            return x2(string);
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC6769y(name = "-deprecated_parse")
        /* JADX INFO: renamed from: q */
        public final zurt m27550q(@InterfaceC7396q String url) {
            d2ok.m23075h(url, "url");
            return x2(url);
        }

        @InterfaceC7396q
        public final String qrj(@InterfaceC7396q String str, int i2, int i3, boolean z2) {
            d2ok.m23075h(str, "<this>");
            for (int i4 = i2; i4 < i3; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                    okio.x2 x2Var = new okio.x2();
                    x2Var.mo27639m(str, i2, i4);
                    t8r(x2Var, str, i4, i3, z2);
                    return x2Var.jbh();
                }
            }
            String strSubstring = str.substring(i2, i3);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @InterfaceC7395n
        @InterfaceC6769y(name = "get")
        @l05.qrj
        /* JADX INFO: renamed from: s */
        public final zurt m27551s(@InterfaceC7396q URI uri) {
            d2ok.m23075h(uri, "<this>");
            String string = uri.toString();
            d2ok.kja0(string, "toString()");
            return x2(string);
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC6769y(name = "-deprecated_get")
        public final zurt toq(@InterfaceC7396q URI uri) {
            d2ok.m23075h(uri, "uri");
            return m27551s(uri);
        }

        @InterfaceC7395n
        @InterfaceC6769y(name = "parse")
        @l05.qrj
        public final zurt x2(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<this>");
            try {
                return m27552y(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        @l05.qrj
        /* JADX INFO: renamed from: y */
        public final zurt m27552y(@InterfaceC7396q String str) {
            d2ok.m23075h(str, "<this>");
            return new C7535k().wvg(null, str).m27539y();
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to extension function", replaceWith = @hb(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @InterfaceC6769y(name = "-deprecated_get")
        public final zurt zy(@InterfaceC7396q URL url) {
            d2ok.m23075h(url, "url");
            return m27549p(url);
        }
    }

    public zurt(@InterfaceC7396q String scheme, @InterfaceC7396q String username, @InterfaceC7396q String password, @InterfaceC7396q String host, int i2, @InterfaceC7396q List<String> pathSegments, @InterfaceC7395n List<String> list, @InterfaceC7395n String str, @InterfaceC7396q String url) {
        d2ok.m23075h(scheme, "scheme");
        d2ok.m23075h(username, "username");
        d2ok.m23075h(password, "password");
        d2ok.m23075h(host, "host");
        d2ok.m23075h(pathSegments, "pathSegments");
        d2ok.m23075h(url, "url");
        this.f43632k = scheme;
        this.f94247toq = username;
        this.f94248zy = password;
        this.f43635q = host;
        this.f43633n = i2;
        this.f43631g = pathSegments;
        this.f94246f7l8 = list;
        this.f43637y = str;
        this.f43636s = url;
        this.f43634p = d2ok.f7l8(scheme, "https");
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "get")
    @l05.qrj
    public static final zurt a9(@InterfaceC7396q URL url) {
        return f94239ld6.m27549p(url);
    }

    @l05.qrj
    public static final int fn3e(@InterfaceC7396q String str) {
        return f94239ld6.f7l8(str);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "get")
    @l05.qrj
    public static final zurt jk(@InterfaceC7396q URI uri) {
        return f94239ld6.m27551s(uri);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    @l05.qrj
    public static final zurt mcp(@InterfaceC7396q String str) {
        return f94239ld6.m27552y(str);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "parse")
    @l05.qrj
    public static final zurt oc(@InterfaceC7396q String str) {
        return f94239ld6.x2(str);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: c */
    public final String m27510c() {
        C7535k c7535kD3 = d3("/...");
        d2ok.qrj(c7535kD3);
        return c7535kD3.vyq("").m27538t("").m27539y().toString();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to toUri()", replaceWith = @hb(expression = "toUri()", imports = {}))
    @InterfaceC6769y(name = "-deprecated_uri")
    public final URI cdj() {
        return m27511e();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "pathSegments")
    public final List<String> d2ok() {
        return this.f43631g;
    }

    @InterfaceC7395n
    public final C7535k d3(@InterfaceC7396q String link) {
        d2ok.m23075h(link, "link");
        try {
            return new C7535k().wvg(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "query")
    public final String dd() {
        if (this.f94246f7l8 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f94239ld6.cdj(this.f94246f7l8, sb);
        return sb.toString();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "uri")
    /* JADX INFO: renamed from: e */
    public final URI m27511e() {
        String string = gvn7().jp0y().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                URI uriCreate = URI.create(new kotlin.text.ki("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                d2ok.kja0(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof zurt) && d2ok.f7l8(((zurt) obj).f43636s, this.f43636s);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "password")
    public final String eqxt() {
        return this.f94248zy;
    }

    @InterfaceC6769y(name = "querySize")
    /* JADX INFO: renamed from: f */
    public final int m27512f() {
        List<String> list = this.f94246f7l8;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "fragment", imports = {}))
    @InterfaceC6769y(name = "-deprecated_fragment")
    public final String f7l8() {
        return this.f43637y;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "host")
    public final String fti() {
        return this.f43635q;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "encodedPath")
    public final String fu4() {
        int iSc = kotlin.text.fti.sc(this.f43636s, '/', this.f43632k.length() + 3, false, 4, null);
        String str = this.f43636s;
        String strSubstring = this.f43636s.substring(iSc, C1359g.m5755i(str, "?#", iSc, str.length()));
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "encodedUsername", imports = {}))
    @InterfaceC6769y(name = "-deprecated_encodedUsername")
    /* JADX INFO: renamed from: g */
    public final String m27513g() {
        return wvg();
    }

    @InterfaceC7396q
    public final C7535k gvn7() {
        C7535k c7535k = new C7535k();
        c7535k.uv6(this.f43632k);
        c7535k.n5r1(wvg());
        c7535k.dd(ni7());
        c7535k.hyr(this.f43635q);
        c7535k.m27528c(this.f43633n != f94239ld6.f7l8(this.f43632k) ? this.f43633n : -1);
        c7535k.ki().clear();
        c7535k.ki().addAll(m27524z());
        c7535k.qrj(o1t());
        c7535k.m27537r(zurt());
        return c7535k;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C5693g.f31761C, imports = {}))
    @InterfaceC6769y(name = "-deprecated_scheme")
    /* JADX INFO: renamed from: h */
    public final String m27514h() {
        return this.f43632k;
    }

    public int hashCode() {
        return this.f43636s.hashCode();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "username")
    public final String hb() {
        return this.f94247toq;
    }

    @InterfaceC7396q
    public final List<String> hyr(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        if (this.f94246f7l8 == null) {
            return kotlin.collections.ni7.a9();
        }
        ArrayList arrayList = new ArrayList();
        C6349p c6349pZwy = kotlin.ranges.fn3e.zwy(kotlin.ranges.fn3e.nme(0, this.f94246f7l8.size()), 2);
        int iF7l8 = c6349pZwy.f7l8();
        int iM23353y = c6349pZwy.m23353y();
        int iM23352s = c6349pZwy.m23352s();
        if ((iM23352s > 0 && iF7l8 <= iM23353y) || (iM23352s < 0 && iM23353y <= iF7l8)) {
            while (true) {
                if (d2ok.f7l8(name, this.f94246f7l8.get(iF7l8))) {
                    arrayList.add(this.f94246f7l8.get(iF7l8 + 1));
                }
                if (iF7l8 == iM23353y) {
                    break;
                }
                iF7l8 += iM23352s;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        d2ok.kja0(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final boolean jp0y() {
        return this.f43634p;
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "encodedFragment", imports = {}))
    @InterfaceC6769y(name = "-deprecated_encodedFragment")
    /* JADX INFO: renamed from: k */
    public final String m27515k() {
        return zurt();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to toUrl()", replaceWith = @hb(expression = "toUrl()", imports = {}))
    @InterfaceC6769y(name = "-deprecated_url")
    public final URL ki() {
        return nn86();
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "querySize", imports = {}))
    @InterfaceC6769y(name = "-deprecated_querySize")
    public final int kja0() {
        return m27512f();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "queryParameterNames")
    /* JADX INFO: renamed from: l */
    public final Set<String> m27516l() {
        if (this.f94246f7l8 == null) {
            return a98o.ld6();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C6349p c6349pZwy = kotlin.ranges.fn3e.zwy(kotlin.ranges.fn3e.nme(0, this.f94246f7l8.size()), 2);
        int iF7l8 = c6349pZwy.f7l8();
        int iM23353y = c6349pZwy.m23353y();
        int iM23352s = c6349pZwy.m23352s();
        if ((iM23352s > 0 && iF7l8 <= iM23353y) || (iM23352s < 0 && iM23353y <= iF7l8)) {
            while (true) {
                String str = this.f94246f7l8.get(iF7l8);
                d2ok.qrj(str);
                linkedHashSet.add(str);
                if (iF7l8 == iM23353y) {
                    break;
                }
                iF7l8 += iM23352s;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        d2ok.kja0(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "pathSize", imports = {}))
    @InterfaceC6769y(name = "-deprecated_pathSize")
    public final int ld6() {
        return lvui();
    }

    @InterfaceC7395n
    public final zurt lrht(@InterfaceC7396q String link) {
        d2ok.m23075h(link, "link");
        C7535k c7535kD3 = d3(link);
        if (c7535kD3 != null) {
            return c7535kD3.m27539y();
        }
        return null;
    }

    @InterfaceC6769y(name = "pathSize")
    public final int lvui() {
        return this.f43631g.size();
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "encodedQuery", imports = {}))
    @InterfaceC6769y(name = "-deprecated_encodedQuery")
    /* JADX INFO: renamed from: n */
    public final String m27517n() {
        return o1t();
    }

    @InterfaceC7395n
    public final String n5r1(int i2) {
        List<String> list = this.f94246f7l8;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "queryParameterNames", imports = {}))
    @InterfaceC6769y(name = "-deprecated_queryParameterNames")
    public final Set<String> n7h() {
        return m27516l();
    }

    @InterfaceC7396q
    public final String ncyb(int i2) {
        List<String> list = this.f94246f7l8;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i2 * 2);
        d2ok.qrj(str);
        return str;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "encodedPassword")
    public final String ni7() {
        if (this.f94248zy.length() == 0) {
            return "";
        }
        String strSubstring = this.f43636s.substring(kotlin.text.fti.sc(this.f43636s, ':', this.f43632k.length() + 3, false, 4, null) + 1, kotlin.text.fti.sc(this.f43636s, '@', 0, false, 6, null));
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "url")
    public final URL nn86() {
        try {
            return new URL(this.f43636s);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "encodedQuery")
    public final String o1t() {
        if (this.f94246f7l8 == null) {
            return null;
        }
        int iSc = kotlin.text.fti.sc(this.f43636s, '?', 0, false, 6, null) + 1;
        String str = this.f43636s;
        String strSubstring = this.f43636s.substring(iSc, C1359g.t8r(str, '#', iSc, str.length()));
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "pathSegments", imports = {}))
    @InterfaceC6769y(name = "-deprecated_pathSegments")
    /* JADX INFO: renamed from: p */
    public final List<String> m27518p() {
        return this.f43631g;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "encodedPathSegments", imports = {}))
    @InterfaceC6769y(name = "-deprecated_encodedPathSegments")
    /* JADX INFO: renamed from: q */
    public final List<String> m27519q() {
        return m27524z();
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "query", imports = {}))
    @InterfaceC6769y(name = "-deprecated_query")
    public final String qrj() {
        return dd();
    }

    @InterfaceC6769y(name = C5693g.f31763E)
    /* JADX INFO: renamed from: r */
    public final int m27520r() {
        return this.f43633n;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "password", imports = {}))
    @InterfaceC6769y(name = "-deprecated_password")
    /* JADX INFO: renamed from: s */
    public final String m27521s() {
        return this.f94248zy;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "fragment")
    /* JADX INFO: renamed from: t */
    public final String m27522t() {
        return this.f43637y;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "username", imports = {}))
    @InterfaceC6769y(name = "-deprecated_username")
    public final String t8r() {
        return this.f94247toq;
    }

    @InterfaceC7396q
    public String toString() {
        return this.f43636s;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "encodedPassword", imports = {}))
    @InterfaceC6769y(name = "-deprecated_encodedPassword")
    public final String toq() {
        return ni7();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = C5693g.f31761C)
    public final String uv6() {
        return this.f43632k;
    }

    @InterfaceC7395n
    public final String vyq() {
        if (C1359g.ld6(this.f43635q)) {
            return null;
        }
        return PublicSuffixDatabase.f43382n.zy().zy(this.f43635q);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "encodedUsername")
    public final String wvg() {
        if (this.f94247toq.length() == 0) {
            return "";
        }
        int length = this.f43632k.length() + 3;
        String str = this.f43636s;
        String strSubstring = this.f43636s.substring(length, C1359g.m5755i(str, ":@", length, str.length()));
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = C5693g.f31763E, imports = {}))
    @InterfaceC6769y(name = "-deprecated_port")
    public final int x2() {
        return this.f43633n;
    }

    @InterfaceC7395n
    public final String x9kr(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        List<String> list = this.f94246f7l8;
        if (list == null) {
            return null;
        }
        C6349p c6349pZwy = kotlin.ranges.fn3e.zwy(kotlin.ranges.fn3e.nme(0, list.size()), 2);
        int iF7l8 = c6349pZwy.f7l8();
        int iM23353y = c6349pZwy.m23353y();
        int iM23352s = c6349pZwy.m23352s();
        if ((iM23352s > 0 && iF7l8 <= iM23353y) || (iM23352s < 0 && iM23353y <= iF7l8)) {
            while (!d2ok.f7l8(name, this.f94246f7l8.get(iF7l8))) {
                if (iF7l8 != iM23353y) {
                    iF7l8 += iM23352s;
                }
            }
            return this.f94246f7l8.get(iF7l8 + 1);
        }
        return null;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "host", imports = {}))
    @InterfaceC6769y(name = "-deprecated_host")
    /* JADX INFO: renamed from: y */
    public final String m27523y() {
        return this.f43635q;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "encodedPathSegments")
    /* JADX INFO: renamed from: z */
    public final List<String> m27524z() {
        int iSc = kotlin.text.fti.sc(this.f43636s, '/', this.f43632k.length() + 3, false, 4, null);
        String str = this.f43636s;
        int iM5755i = C1359g.m5755i(str, "?#", iSc, str.length());
        ArrayList arrayList = new ArrayList();
        while (iSc < iM5755i) {
            int i2 = iSc + 1;
            int iT8r = C1359g.t8r(this.f43636s, '/', i2, iM5755i);
            String strSubstring = this.f43636s.substring(i2, iT8r);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iSc = iT8r;
        }
        return arrayList;
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "encodedFragment")
    public final String zurt() {
        if (this.f43637y == null) {
            return null;
        }
        String strSubstring = this.f43636s.substring(kotlin.text.fti.sc(this.f43636s, '#', 0, false, 6, null) + 1);
        d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "encodedPath", imports = {}))
    @InterfaceC6769y(name = "-deprecated_encodedPath")
    public final String zy() {
        return fu4();
    }
}

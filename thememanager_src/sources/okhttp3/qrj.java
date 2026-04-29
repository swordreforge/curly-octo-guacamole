package okhttp3;

import b7.C1359g;
import b7.C1360k;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f94084f7l8;

    /* JADX INFO: renamed from: g */
    private final boolean f43529g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String f43530k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final String f43531n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final String f43532q;

    /* JADX INFO: renamed from: s */
    private final boolean f43533s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final String f94085toq;

    /* JADX INFO: renamed from: y */
    private final boolean f43534y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f94086zy;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final toq f43528p = new toq(null);

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final Pattern f94080ld6 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Pattern f94083x2 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final Pattern f94082qrj = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final Pattern f94081n7h = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: okhttp3.qrj$k */
    /* JADX INFO: compiled from: Cookie.kt */
    @lv5({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class C7527k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f94087f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f43535g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private String f43536k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private String f43538q;

        /* JADX INFO: renamed from: s */
        private boolean f43539s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private String f94088toq;

        /* JADX INFO: renamed from: y */
        private boolean f43540y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f94089zy = okhttp3.internal.http.zy.f43155k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private String f43537n = "/";

        private final C7527k zy(String str, boolean z2) {
            String strM5771n = C1360k.m5771n(str);
            if (strM5771n != null) {
                this.f43538q = strM5771n;
                this.f43539s = z2;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        @InterfaceC7396q
        public final C7527k f7l8(@InterfaceC7396q String name) {
            d2ok.m23075h(name, "name");
            if (!d2ok.f7l8(kotlin.text.fti.l92(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.f43536k = name;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final C7527k m27405g() {
            this.f94087f7l8 = true;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final qrj m27406k() {
            String str = this.f43536k;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f94088toq;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j2 = this.f94089zy;
            String str3 = this.f43538q;
            if (str3 != null) {
                return new qrj(str, str2, j2, str3, this.f43537n, this.f43535g, this.f94087f7l8, this.f43540y, this.f43539s, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final C7527k m27407n(@InterfaceC7396q String domain) {
            d2ok.m23075h(domain, "domain");
            return zy(domain, true);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public final C7527k m27408p(@InterfaceC7396q String value) {
            d2ok.m23075h(value, "value");
            if (!d2ok.f7l8(kotlin.text.fti.l92(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.f94088toq = value;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C7527k m27409q(long j2) {
            if (j2 <= 0) {
                j2 = Long.MIN_VALUE;
            }
            if (j2 > okhttp3.internal.http.zy.f43155k) {
                j2 = 253402300799999L;
            }
            this.f94089zy = j2;
            this.f43540y = true;
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final C7527k m27410s() {
            this.f43535g = true;
            return this;
        }

        @InterfaceC7396q
        public final C7527k toq(@InterfaceC7396q String domain) {
            d2ok.m23075h(domain, "domain");
            return zy(domain, false);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final C7527k m27411y(@InterfaceC7396q String path) {
            d2ok.m23075h(path, "path");
            if (!kotlin.text.a9.r6ty(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.f43537n = path;
            return this;
        }
    }

    /* JADX INFO: compiled from: Cookie.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean ld6(zurt zurtVar, String str) {
            String strFu4 = zurtVar.fu4();
            if (d2ok.f7l8(strFu4, str)) {
                return true;
            }
            return kotlin.text.a9.r6ty(strFu4, str, false, 2, null) && (kotlin.text.a9.ga(str, "/", false, 2, null) || strFu4.charAt(str.length()) == '/');
        }

        /* JADX INFO: renamed from: p */
        private final long m27413p(String str) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j2;
            } catch (NumberFormatException e2) {
                if (new kotlin.text.ki("-?\\d+").matches(str)) {
                    return kotlin.text.a9.r6ty(str, C5658n.f73185t8r, false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public final boolean m27414q(String str, String str2) {
            if (d2ok.f7l8(str, str2)) {
                return true;
            }
            return kotlin.text.a9.ga(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C1359g.ld6(str);
        }

        /* JADX INFO: renamed from: s */
        private final long m27415s(String str, int i2, int i3) {
            int iZy = zy(str, i2, i3, false);
            Matcher matcher = qrj.f94081n7h.matcher(str);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int iB7 = -1;
            int i7 = -1;
            int i8 = -1;
            while (iZy < i3) {
                int iZy2 = zy(str, iZy + 1, i3, true);
                matcher.region(iZy, iZy2);
                if (i5 == -1 && matcher.usePattern(qrj.f94081n7h).matches()) {
                    String strGroup = matcher.group(1);
                    d2ok.kja0(strGroup, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    d2ok.kja0(strGroup2, "matcher.group(2)");
                    i7 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    d2ok.kja0(strGroup3, "matcher.group(3)");
                    i8 = Integer.parseInt(strGroup3);
                } else if (i6 == -1 && matcher.usePattern(qrj.f94082qrj).matches()) {
                    String strGroup4 = matcher.group(1);
                    d2ok.kja0(strGroup4, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup4);
                } else if (iB7 == -1 && matcher.usePattern(qrj.f94083x2).matches()) {
                    String strGroup5 = matcher.group(1);
                    d2ok.kja0(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    d2ok.kja0(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = qrj.f94083x2.pattern();
                    d2ok.kja0(strPattern, "MONTH_PATTERN.pattern()");
                    iB7 = kotlin.text.fti.b7(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i4 == -1 && matcher.usePattern(qrj.f94080ld6).matches()) {
                    String strGroup6 = matcher.group(1);
                    d2ok.kja0(strGroup6, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup6);
                }
                iZy = zy(str, iZy2 + 1, i3, false);
            }
            if (70 <= i4 && i4 < 100) {
                i4 += 1900;
            }
            if (i4 >= 0 && i4 < 70) {
                i4 += 2000;
            }
            if (!(i4 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iB7 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i6 && i6 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && i5 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && i7 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i8 >= 0 && i8 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C1359g.f7239g);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, iB7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX INFO: renamed from: y */
        private final String m27416y(String str) {
            if (!(!kotlin.text.a9.ga(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strM5771n = C1360k.m5771n(kotlin.text.fti.jyr(str, "."));
            if (strM5771n != null) {
                return strM5771n;
            }
            throw new IllegalArgumentException();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final int zy(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L46
                char r0 = r6.charAt(r7)
                r1 = 32
                r2 = 1
                r3 = 0
                if (r0 >= r1) goto L10
                r1 = 9
                if (r0 != r1) goto L3d
            L10:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L3d
                r1 = 48
                r4 = 58
                if (r1 > r0) goto L1e
                if (r0 >= r4) goto L1e
                r1 = r2
                goto L1f
            L1e:
                r1 = r3
            L1f:
                if (r1 != 0) goto L3d
                r1 = 97
                if (r1 > r0) goto L2b
                r1 = 123(0x7b, float:1.72E-43)
                if (r0 >= r1) goto L2b
                r1 = r2
                goto L2c
            L2b:
                r1 = r3
            L2c:
                if (r1 != 0) goto L3d
                r1 = 65
                if (r1 > r0) goto L38
                r1 = 91
                if (r0 >= r1) goto L38
                r1 = r2
                goto L39
            L38:
                r1 = r3
            L39:
                if (r1 != 0) goto L3d
                if (r0 != r4) goto L3e
            L3d:
                r3 = r2
            L3e:
                r0 = r9 ^ 1
                if (r3 != r0) goto L43
                return r7
            L43:
                int r7 = r7 + 1
                goto L0
            L46:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.qrj.toq.zy(java.lang.String, int, int, boolean):int");
        }

        @InterfaceC7396q
        @l05.qrj
        public final List<qrj> f7l8(@InterfaceC7396q zurt url, @InterfaceC7396q fn3e headers) {
            d2ok.m23075h(url, "url");
            d2ok.m23075h(headers, "headers");
            List<String> listKja0 = headers.kja0(com.google.common.net.zy.f68493c8jq);
            int size = listKja0.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                qrj qrjVarM27418n = m27418n(url, listKja0.get(i2));
                if (qrjVarM27418n != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(qrjVarM27418n);
                }
            }
            if (arrayList == null) {
                return kotlin.collections.ni7.a9();
            }
            List<qrj> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            d2ok.kja0(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[PHI: r1
          0x00dc: PHI (r1v24 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.qrj m27417g(long r26, @mub.InterfaceC7396q okhttp3.zurt r28, @mub.InterfaceC7396q java.lang.String r29) {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.qrj.toq.m27417g(long, okhttp3.zurt, java.lang.String):okhttp3.qrj");
        }

        @InterfaceC7395n
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final qrj m27418n(@InterfaceC7396q zurt url, @InterfaceC7396q String setCookie) {
            d2ok.m23075h(url, "url");
            d2ok.m23075h(setCookie, "setCookie");
            return m27417g(System.currentTimeMillis(), url, setCookie);
        }
    }

    private qrj(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z5, boolean z6) {
        this.f43530k = str;
        this.f94085toq = str2;
        this.f94086zy = j2;
        this.f43532q = str3;
        this.f43531n = str4;
        this.f43529g = z2;
        this.f94084f7l8 = z3;
        this.f43534y = z5;
        this.f43533s = z6;
    }

    public /* synthetic */ qrj(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z5, boolean z6, kotlin.jvm.internal.ni7 ni7Var) {
        this(str, str2, j2, str3, str4, z2, z3, z5, z6);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final List<qrj> fn3e(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q fn3e fn3eVar) {
        return f43528p.f7l8(zurtVar, fn3eVar);
    }

    @InterfaceC7395n
    @l05.qrj
    /* JADX INFO: renamed from: i */
    public static final qrj m27395i(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q String str) {
        return f43528p.m27418n(zurtVar, str);
    }

    @InterfaceC6769y(name = "httpOnly")
    public final boolean cdj() {
        return this.f94084f7l8;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj instanceof qrj) {
            qrj qrjVar = (qrj) obj;
            if (d2ok.f7l8(qrjVar.f43530k, this.f43530k) && d2ok.f7l8(qrjVar.f94085toq, this.f94085toq) && qrjVar.f94086zy == this.f94086zy && d2ok.f7l8(qrjVar.f43532q, this.f43532q) && d2ok.f7l8(qrjVar.f43531n, this.f43531n) && qrjVar.f43529g == this.f43529g && qrjVar.f94084f7l8 == this.f94084f7l8 && qrjVar.f43534y == this.f43534y && qrjVar.f43533s == this.f43533s) {
                return true;
            }
        }
        return false;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "persistent", imports = {}))
    @InterfaceC6769y(name = "-deprecated_persistent")
    public final boolean f7l8() {
        return this.f43534y;
    }

    @InterfaceC6769y(name = "secure")
    public final boolean fu4() {
        return this.f43529g;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "path", imports = {}))
    @InterfaceC6769y(name = "-deprecated_path")
    /* JADX INFO: renamed from: g */
    public final String m27397g() {
        return this.f43531n;
    }

    @InterfaceC6769y(name = "hostOnly")
    /* JADX INFO: renamed from: h */
    public final boolean m27398h() {
        return this.f43533s;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f43530k.hashCode()) * 31) + this.f94085toq.hashCode()) * 31) + Long.hashCode(this.f94086zy)) * 31) + this.f43532q.hashCode()) * 31) + this.f43531n.hashCode()) * 31) + Boolean.hashCode(this.f43529g)) * 31) + Boolean.hashCode(this.f94084f7l8)) * 31) + Boolean.hashCode(this.f43534y)) * 31) + Boolean.hashCode(this.f43533s);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "domain", imports = {}))
    @InterfaceC6769y(name = "-deprecated_domain")
    /* JADX INFO: renamed from: k */
    public final String m27399k() {
        return this.f43532q;
    }

    public final boolean ki(@InterfaceC7396q zurt url) {
        d2ok.m23075h(url, "url");
        if ((this.f43533s ? d2ok.f7l8(url.fti(), this.f43532q) : f43528p.m27414q(url.fti(), this.f43532q)) && f43528p.ld6(url, this.f43531n)) {
            return !this.f43529g || url.jp0y();
        }
        return false;
    }

    @InterfaceC6769y(name = "expiresAt")
    public final long kja0() {
        return this.f94086zy;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "name", imports = {}))
    @InterfaceC6769y(name = "-deprecated_name")
    /* JADX INFO: renamed from: n */
    public final String m27400n() {
        return this.f43530k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "domain")
    public final String n7h() {
        return this.f43532q;
    }

    @InterfaceC6769y(name = "persistent")
    public final boolean ni7() {
        return this.f43534y;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "value")
    public final String o1t() {
        return this.f94085toq;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "httpOnly", imports = {}))
    @InterfaceC6769y(name = "-deprecated_httpOnly")
    /* JADX INFO: renamed from: q */
    public final boolean m27401q() {
        return this.f94084f7l8;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "value", imports = {}))
    @InterfaceC6769y(name = "-deprecated_value")
    /* JADX INFO: renamed from: s */
    public final String m27402s() {
        return this.f94085toq;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "name")
    public final String t8r() {
        return this.f43530k;
    }

    @InterfaceC7396q
    public String toString() {
        return m27404z(false);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "expiresAt", imports = {}))
    @InterfaceC6769y(name = "-deprecated_expiresAt")
    public final long toq() {
        return this.f94086zy;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "secure", imports = {}))
    @InterfaceC6769y(name = "-deprecated_secure")
    /* JADX INFO: renamed from: y */
    public final boolean m27403y() {
        return this.f43529g;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public final String m27404z(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f43530k);
        sb.append('=');
        sb.append(this.f94085toq);
        if (this.f43534y) {
            if (this.f94086zy == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(okhttp3.internal.http.zy.toq(new Date(this.f94086zy)));
            }
        }
        if (!this.f43533s) {
            sb.append("; domain=");
            if (z2) {
                sb.append(".");
            }
            sb.append(this.f43532q);
        }
        sb.append("; path=");
        sb.append(this.f43531n);
        if (this.f43529g) {
            sb.append("; secure");
        }
        if (this.f94084f7l8) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        d2ok.kja0(string, "toString()");
        return string;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "path")
    public final String zurt() {
        return this.f43531n;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "hostOnly", imports = {}))
    @InterfaceC6769y(name = "-deprecated_hostOnly")
    public final boolean zy() {
        return this.f43533s;
    }
}

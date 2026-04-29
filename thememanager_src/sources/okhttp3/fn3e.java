package okhttp3;

import b7.C1359g;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.C6227f;
import kotlin.collections.C6163t;
import kotlin.hb;
import kotlin.jvm.internal.C6309s;
import kotlin.jvm.internal.C6311u;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class fn3e implements Iterable<C6227f<? extends String, ? extends String>>, InterfaceC7625k {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final toq f42927q = new toq(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final String[] f42928k;

    /* JADX INFO: renamed from: okhttp3.fn3e$k */
    /* JADX INFO: compiled from: Headers.kt */
    @lv5({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class C7432k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final List<String> f42929k = new ArrayList(20);

        @InterfaceC7396q
        public final C7432k f7l8(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            this.f42929k.add(name);
            this.f42929k.add(kotlin.text.fti.l92(value).toString());
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final C7432k m26865g(@InterfaceC7396q String line) {
            d2ok.m23075h(line, "line");
            int iSc = kotlin.text.fti.sc(line, ':', 1, false, 4, null);
            if (iSc != -1) {
                String strSubstring = line.substring(0, iSc);
                d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iSc + 1);
                d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
                f7l8(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                d2ok.kja0(strSubstring3, "this as java.lang.String).substring(startIndex)");
                f7l8("", strSubstring3);
            } else {
                f7l8("", line);
            }
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C7432k m26866k(@InterfaceC7396q String line) {
            d2ok.m23075h(line, "line");
            int iSc = kotlin.text.fti.sc(line, ':', 0, false, 6, null);
            if (!(iSc != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iSc);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = kotlin.text.fti.l92(strSubstring).toString();
            String strSubstring2 = line.substring(iSc + 1);
            d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
            toq(string, strSubstring2);
            return this;
        }

        @InterfaceC7396q
        public final C7432k kja0(@InterfaceC7396q String name, @InterfaceC7396q Date value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            qrj(name, okhttp3.internal.http.zy.toq(value));
            return this;
        }

        @InterfaceC7396q
        public final List<String> ld6() {
            return this.f42929k;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final C7432k m26867n(@InterfaceC7396q fn3e headers) {
            d2ok.m23075h(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                f7l8(headers.m26864y(i2), headers.n7h(i2));
            }
            return this;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        public final C7432k n7h(@InterfaceC7396q String name, @InterfaceC7396q Instant value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            return kja0(name, new Date(value.toEpochMilli()));
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: p */
        public final String m26868p(@InterfaceC7396q String name) {
            d2ok.m23075h(name, "name");
            int size = this.f42929k.size() - 2;
            int iZy = kotlin.internal.n7h.zy(size, 0, -2);
            if (iZy > size) {
                return null;
            }
            while (!kotlin.text.a9.e5(name, this.f42929k.get(size), true)) {
                if (size == iZy) {
                    return null;
                }
                size -= 2;
            }
            return this.f42929k.get(size + 1);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C7432k m26869q(@InterfaceC7396q String name, @InterfaceC7396q Date value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            toq(name, okhttp3.internal.http.zy.toq(value));
            return this;
        }

        @InterfaceC7396q
        public final C7432k qrj(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            toq toqVar = fn3e.f42927q;
            toqVar.m26872g(name);
            toqVar.f7l8(value, name);
            x2(name);
            f7l8(name, value);
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: s */
        public final fn3e m26870s() {
            return new fn3e((String[]) this.f42929k.toArray(new String[0]), null);
        }

        @InterfaceC7396q
        public final C7432k toq(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            toq toqVar = fn3e.f42927q;
            toqVar.m26872g(name);
            toqVar.f7l8(value, name);
            f7l8(name, value);
            return this;
        }

        @InterfaceC7396q
        public final C7432k x2(@InterfaceC7396q String name) {
            d2ok.m23075h(name, "name");
            int i2 = 0;
            while (i2 < this.f42929k.size()) {
                if (kotlin.text.a9.e5(name, this.f42929k.get(i2), true)) {
                    this.f42929k.remove(i2);
                    this.f42929k.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final C7432k m26871y(@InterfaceC7396q String name, @InterfaceC7396q String value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            fn3e.f42927q.m26872g(name);
            f7l8(name, value);
            return this;
        }

        @InterfaceC7396q
        @IgnoreJRERequirement
        public final C7432k zy(@InterfaceC7396q String name, @InterfaceC7396q Instant value) {
            d2ok.m23075h(name, "name");
            d2ok.m23075h(value, "value");
            m26869q(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    @lv5({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void f7l8(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                int r0 = r7.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L72
                char r3 = r7.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L21
                r4 = 32
                if (r4 > r3) goto L1b
                r4 = 127(0x7f, float:1.78E-43)
                if (r3 >= r4) goto L1b
                r4 = r5
                goto L1c
            L1b:
                r4 = r1
            L1c:
                if (r4 == 0) goto L1f
                goto L21
            L1f:
                r4 = r1
                goto L22
            L21:
                r4 = r5
            L22:
                if (r4 != 0) goto L6f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r4[r5] = r1
                r1 = 2
                r4[r1] = r8
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = b7.C1359g.m5769z(r1, r4)
                r0.append(r1)
                boolean r8 = b7.C1359g.dd(r8)
                if (r8 == 0) goto L4d
                java.lang.String r7 = ""
                goto L5e
            L4d:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = ": "
                r8.append(r1)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
            L5e:
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L6f:
                int r2 = r2 + 1
                goto L6
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.fn3e.toq.f7l8(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final void m26872g(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(C1359g.m5769z("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public final String m26875y(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iZy = kotlin.internal.n7h.zy(length, 0, -2);
            if (iZy > length) {
                return null;
            }
            while (!kotlin.text.a9.e5(str, strArr[length], true)) {
                if (length == iZy) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "function moved to extension", replaceWith = @hb(expression = "headers.toHeaders()", imports = {}))
        @InterfaceC6769y(name = "-deprecated_of")
        /* JADX INFO: renamed from: k */
        public final fn3e m26876k(@InterfaceC7396q Map<String, String> headers) {
            d2ok.m23075h(headers, "headers");
            return m26878s(headers);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "of")
        @l05.qrj
        /* JADX INFO: renamed from: p */
        public final fn3e m26877p(@InterfaceC7396q String... namesAndValues) {
            d2ok.m23075h(namesAndValues, "namesAndValues");
            int i2 = 0;
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                String str = strArr[i3];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i3] = kotlin.text.fti.l92(str).toString();
            }
            int iZy = kotlin.internal.n7h.zy(0, strArr.length - 1, 2);
            if (iZy >= 0) {
                while (true) {
                    String str2 = strArr[i2];
                    String str3 = strArr[i2 + 1];
                    m26872g(str2);
                    f7l8(str3, str2);
                    if (i2 == iZy) {
                        break;
                    }
                    i2 += 2;
                }
            }
            return new fn3e(strArr, null);
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "of")
        @l05.qrj
        /* JADX INFO: renamed from: s */
        public final fn3e m26878s(@InterfaceC7396q Map<String, String> map) {
            d2ok.m23075h(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = kotlin.text.fti.l92(key).toString();
                String string2 = kotlin.text.fti.l92(value).toString();
                m26872g(string);
                f7l8(string2, string);
                strArr[i2] = string;
                strArr[i2 + 1] = string2;
                i2 += 2;
            }
            return new fn3e(strArr, null);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "function name changed", replaceWith = @hb(expression = "headersOf(*namesAndValues)", imports = {}))
        @InterfaceC6769y(name = "-deprecated_of")
        public final fn3e toq(@InterfaceC7396q String... namesAndValues) {
            d2ok.m23075h(namesAndValues, "namesAndValues");
            return m26877p((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }
    }

    private fn3e(String[] strArr) {
        this.f42928k = strArr;
    }

    public /* synthetic */ fn3e(String[] strArr, kotlin.jvm.internal.ni7 ni7Var) {
        this(strArr);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "of")
    @l05.qrj
    public static final fn3e ld6(@InterfaceC7396q Map<String, String> map) {
        return f42927q.m26878s(map);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "of")
    @l05.qrj
    public static final fn3e x2(@InterfaceC7396q String... strArr) {
        return f42927q.m26877p(strArr);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof fn3e) && Arrays.equals(this.f42928k, ((fn3e) obj).f42928k);
    }

    @InterfaceC7395n
    @IgnoreJRERequirement
    public final Instant f7l8(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        Date dateM26860g = m26860g(name);
        if (dateM26860g != null) {
            return dateM26860g.toInstant();
        }
        return null;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final Date m26860g(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        String strZy = zy(name);
        if (strZy != null) {
            return okhttp3.internal.http.zy.m27095k(strZy);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f42928k);
    }

    @Override // java.lang.Iterable
    @InterfaceC7396q
    public Iterator<C6227f<? extends String, ? extends String>> iterator() {
        int size = size();
        C6227f[] c6227fArr = new C6227f[size];
        for (int i2 = 0; i2 < size; i2++) {
            c6227fArr[i2] = nmn5.m23230k(m26864y(i2), n7h(i2));
        }
        return C6309s.m23145k(c6227fArr);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @hb(expression = "size", imports = {}))
    @InterfaceC6769y(name = "-deprecated_size")
    /* JADX INFO: renamed from: k */
    public final int m26861k() {
        return size();
    }

    @InterfaceC7396q
    public final List<String> kja0(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (kotlin.text.a9.e5(name, m26864y(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(n7h(i2));
            }
        }
        if (arrayList == null) {
            return kotlin.collections.ni7.a9();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        d2ok.kja0(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    @InterfaceC7396q
    public final String n7h(int i2) {
        return this.f42928k[(i2 * 2) + 1];
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final C7432k m26862p() {
        C7432k c7432k = new C7432k();
        C6163t.ch(c7432k.ld6(), this.f42928k);
        return c7432k;
    }

    @InterfaceC7396q
    public final Map<String, List<String>> qrj() {
        TreeMap treeMap = new TreeMap(kotlin.text.a9.oki(C6311u.f36447k));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM26864y = m26864y(i2);
            Locale US = Locale.US;
            d2ok.kja0(US, "US");
            String lowerCase = strM26864y.toLowerCase(US);
            d2ok.kja0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(n7h(i2));
        }
        return treeMap;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final Set<String> m26863s() {
        TreeSet treeSet = new TreeSet(kotlin.text.a9.oki(C6311u.f36447k));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(m26864y(i2));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        d2ok.kja0(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @InterfaceC6769y(name = "size")
    public final int size() {
        return this.f42928k.length / 2;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM26864y = m26864y(i2);
            String strN7h = n7h(i2);
            sb.append(strM26864y);
            sb.append(": ");
            if (C1359g.dd(strM26864y)) {
                strN7h = "██";
            }
            sb.append(strN7h);
            sb.append("\n");
        }
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final long toq() {
        String[] strArr = this.f42928k;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            length += (long) this.f42928k[i2].length();
        }
        return length;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final String m26864y(int i2) {
        return this.f42928k[i2 * 2];
    }

    @InterfaceC7395n
    public final String zy(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        return f42927q.m26875y(this.f42928k, name);
    }
}

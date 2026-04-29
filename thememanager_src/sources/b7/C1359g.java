package b7;

import cyoe.InterfaceC5981k;
import cyoe.x2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C6231h;
import kotlin.collections.C6144h;
import kotlin.collections.fu4;
import kotlin.collections.n5r1;
import kotlin.collections.ni7;
import kotlin.collections.nn86;
import kotlin.jvm.internal.C6309s;
import kotlin.jvm.internal.C6311u;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import kotlin.text.fti;
import kotlin.text.ki;
import kotlin.was;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.InterfaceC7519n;
import okhttp3.a9;
import okhttp3.fn3e;
import okhttp3.internal.io.InterfaceC7483k;
import okhttp3.jp0y;
import okhttp3.ki;
import okhttp3.zurt;
import okio.dd;
import okio.kja0;
import okio.n7h;
import okio.qrj;
import okio.vyq;

/* JADX INFO: renamed from: b7.g */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
@InterfaceC6769y(name = "Util")
public final class C1359g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final ki f53991f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final TimeZone f7239g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final byte[] f7240k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final dd f7241n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    public static final String f7242p = "okhttp/4.12.0";

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final a9 f7243q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final String f7244s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final fn3e f53992toq = fn3e.f42927q.m26877p(new String[0]);

    /* JADX INFO: renamed from: y */
    @InterfaceC6765n
    public static final boolean f7245y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final jp0y f53993zy;

    static {
        byte[] bArr = new byte[0];
        f7240k = bArr;
        f53993zy = jp0y.toq.x2(jp0y.f43469q, bArr, null, 1, null);
        f7243q = a9.C7427k.ki(a9.f42917k, bArr, null, 0, 0, 7, null);
        dd.C7542k c7542k = dd.f43697n;
        kja0.C7563k c7563k = kja0.Companion;
        f7241n = c7542k.m27604q(c7563k.m27782s("efbbbf"), c7563k.m27782s("feff"), c7563k.m27782s("fffe"), c7563k.m27782s("0000ffff"), c7563k.m27782s("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        d2ok.qrj(timeZone);
        f7239g = timeZone;
        f53991f7l8 = new ki("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f7245y = false;
        String name = C7529t.class.getName();
        d2ok.kja0(name, "OkHttpClient::class.java.name");
        f7244s = fti.vc(fti.jyr(name, "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m5748a(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return a98o(str, i2, i3);
    }

    public static final int a9(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<this>");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (d2ok.m23076i(cCharAt, 31) <= 0 || d2ok.m23076i(cCharAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final String a98o(@InterfaceC7396q String str, int i2, int i3) {
        d2ok.m23075h(str, "<this>");
        int iFti = fti(str, i2, i3);
        String strSubstring = str.substring(iFti, gvn7(str, iFti, i3));
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: b */
    public static final <K, V> Map<K, V> m5749b(@InterfaceC7396q Map<K, ? extends V> map) {
        d2ok.m23075h(map, "<this>");
        if (map.isEmpty()) {
            return nn86.o1t();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        d2ok.kja0(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long bf2(@InterfaceC7396q String str, long j2) {
        d2ok.m23075h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m5750c(@InterfaceC7396q n7h n7hVar) throws IOException {
        d2ok.m23075h(n7hVar, "<this>");
        return m5763q(n7hVar.readByte(), 255) | (m5763q(n7hVar.readByte(), 255) << 16) | (m5763q(n7hVar.readByte(), 255) << 8);
    }

    public static final void cdj(@InterfaceC7396q Socket socket) {
        d2ok.m23075h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!d2ok.f7l8(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final void ch(@InterfaceC7396q qrj qrjVar, int i2) throws IOException {
        d2ok.m23075h(qrjVar, "<this>");
        qrjVar.writeByte((i2 >>> 16) & 255);
        qrjVar.writeByte((i2 >>> 8) & 255);
        qrjVar.writeByte(i2 & 255);
    }

    @InterfaceC7396q
    public static final String[] d2ok(@InterfaceC7396q String[] strArr, @InterfaceC7396q String[] other, @InterfaceC7396q Comparator<? super String> comparator) {
        d2ok.m23075h(strArr, "<this>");
        d2ok.m23075h(other, "other");
        d2ok.m23075h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static /* synthetic */ int d3(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return gvn7(str, i2, i3);
    }

    public static final boolean dd(@InterfaceC7396q String name) {
        d2ok.m23075h(name, "name");
        return kotlin.text.a9.e5(name, com.google.common.net.zy.f68534n7h, true) || kotlin.text.a9.e5(name, "Cookie", true) || kotlin.text.a9.e5(name, com.google.common.net.zy.f68508fti, true) || kotlin.text.a9.e5(name, com.google.common.net.zy.f68493c8jq, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final Thread m5751e(String name, boolean z2, Runnable runnable) {
        d2ok.m23075h(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z2);
        return thread;
    }

    @InterfaceC7396q
    public static final String ek5k(@InterfaceC7396q zurt zurtVar, boolean z2) {
        String strFti;
        d2ok.m23075h(zurtVar, "<this>");
        if (fti.lk(zurtVar.fti(), ":", false, 2, null)) {
            strFti = '[' + zurtVar.fti() + ']';
        } else {
            strFti = zurtVar.fti();
        }
        if (!z2 && zurtVar.m27520r() == zurt.f94239ld6.f7l8(zurtVar.uv6())) {
            return strFti;
        }
        return strFti + ':' + zurtVar.m27520r();
    }

    public static /* synthetic */ int eqxt(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return oc(str, i2);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: f */
    public static final <T> T m5752f(@InterfaceC7396q Object instance, @InterfaceC7396q Class<T> fieldType, @InterfaceC7396q String fieldName) {
        T tCast;
        Object objM5752f;
        d2ok.m23075h(instance, "instance");
        d2ok.m23075h(fieldType, "fieldType");
        d2ok.m23075h(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (d2ok.f7l8(superclass, Object.class)) {
                if (d2ok.f7l8(fieldName, "delegate") || (objM5752f = m5752f(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) m5752f(objM5752f, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                d2ok.kja0(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    @InterfaceC7396q
    public static final ki.zy f7l8(@InterfaceC7396q final okhttp3.ki kiVar) {
        d2ok.m23075h(kiVar, "<this>");
        return new ki.zy() { // from class: b7.n
            @Override // okhttp3.ki.zy
            /* JADX INFO: renamed from: k */
            public final okhttp3.ki mo5773k(InterfaceC7519n interfaceC7519n) {
                return C1359g.m5768y(kiVar, interfaceC7519n);
            }
        };
    }

    public static /* synthetic */ int fn3e(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return t8r(str, c2, i2, i3);
    }

    public static final int fti(@InterfaceC7396q String str, int i2, int i3) {
        d2ok.m23075h(str, "<this>");
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    @InterfaceC7396q
    public static final <T> List<T> fu4(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q x2<? super T, Boolean> predicate) {
        d2ok.m23075h(iterable, "<this>");
        d2ok.m23075h(predicate, "predicate");
        List<T> listA9 = ni7.a9();
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                if (listA9.isEmpty()) {
                    listA9 = new ArrayList<>();
                }
                d2ok.n7h(listA9, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                bo.f7l8(listA9).add(t2);
            }
        }
        return listA9;
    }

    /* JADX INFO: renamed from: g */
    public static final long m5753g(int i2, long j2) {
        return ((long) i2) & j2;
    }

    public static final int gvn7(@InterfaceC7396q String str, int i2, int i3) {
        d2ok.m23075h(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                char cCharAt = str.charAt(i4);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static final void m5754h(@InterfaceC7396q ServerSocket serverSocket) {
        d2ok.m23075h(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    @InterfaceC7396q
    public static final List<okhttp3.internal.http2.zy> hb(@InterfaceC7396q fn3e fn3eVar) {
        d2ok.m23075h(fn3eVar, "<this>");
        kotlin.ranges.x2 x2VarNme = kotlin.ranges.fn3e.nme(0, fn3eVar.size());
        ArrayList arrayList = new ArrayList(fu4.vyq(x2VarNme, 10));
        Iterator<Integer> it = x2VarNme.iterator();
        while (it.hasNext()) {
            int iNextInt = ((n5r1) it).nextInt();
            arrayList.add(new okhttp3.internal.http2.zy(fn3eVar.m26864y(iNextInt), fn3eVar.n7h(iNextInt)));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final Charset hyr(@InterfaceC7396q n7h n7hVar, @InterfaceC7396q Charset charset) throws IOException {
        d2ok.m23075h(n7hVar, "<this>");
        d2ok.m23075h(charset, "default");
        int iLh = n7hVar.lh(f7241n);
        if (iLh == -1) {
            return charset;
        }
        if (iLh == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            d2ok.kja0(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iLh == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            d2ok.kja0(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iLh == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            d2ok.kja0(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iLh == 3) {
            return C6433g.f36684k.toq();
        }
        if (iLh == 4) {
            return C6433g.f36684k.zy();
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: i */
    public static final int m5755i(@InterfaceC7396q String str, @InterfaceC7396q String delimiters, int i2, int i3) {
        d2ok.m23075h(str, "<this>");
        d2ok.m23075h(delimiters, "delimiters");
        while (i2 < i3) {
            if (fti.vwb(delimiters, str.charAt(i2), false, 2, null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int i1(@InterfaceC7395n String str, int i2) {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: j */
    public static final fn3e m5756j(@InterfaceC7396q List<okhttp3.internal.http2.zy> list) {
        d2ok.m23075h(list, "<this>");
        fn3e.C7432k c7432k = new fn3e.C7432k();
        for (okhttp3.internal.http2.zy zyVar : list) {
            c7432k.f7l8(zyVar.m27206k().utf8(), zyVar.toq().utf8());
        }
        return c7432k.m26870s();
    }

    public static final int jk(@InterfaceC7396q String[] strArr, @InterfaceC7396q String value, @InterfaceC7396q Comparator<String> comparator) {
        d2ok.m23075h(strArr, "<this>");
        d2ok.m23075h(value, "value");
        d2ok.m23075h(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], value) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ int jp0y(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return fti(str, i2, i3);
    }

    @InterfaceC7396q
    public static final String[] ki(@InterfaceC7396q String[] strArr, @InterfaceC7396q String value) {
        d2ok.m23075h(strArr, "<this>");
        d2ok.m23075h(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        d2ok.kja0(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[C6144h.gjp(strArr2)] = value;
        return strArr2;
    }

    public static final void kja0(@InterfaceC7396q Closeable closeable) {
        d2ok.m23075h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public static final int m5758l(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 < 'g')) {
            c3 = 'A';
            if (!('A' <= c2 && c2 < 'G')) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final boolean ld6(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<this>");
        return f53991f7l8.matches(str);
    }

    public static final int lrht(@InterfaceC7396q okio.x2 x2Var, byte b2) throws EOFException {
        d2ok.m23075h(x2Var, "<this>");
        int i2 = 0;
        while (!x2Var.py() && x2Var.g1(0L) == b2) {
            i2++;
            x2Var.readByte();
        }
        return i2;
    }

    public static final boolean lvui(@InterfaceC7396q InterfaceC7483k interfaceC7483k, @InterfaceC7396q File file) throws IOException {
        d2ok.m23075h(interfaceC7483k, "<this>");
        d2ok.m23075h(file, "file");
        vyq vyqVarMo27207g = interfaceC7483k.mo27207g(file);
        try {
            try {
                interfaceC7483k.mo27211y(file);
                kotlin.io.zy.m23032k(vyqVarMo27207g, null);
                return true;
            } catch (IOException unused) {
                was wasVar = was.f36763k;
                kotlin.io.zy.m23032k(vyqVarMo27207g, null);
                interfaceC7483k.mo27211y(file);
                return false;
            }
        } finally {
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public static final String m5759m(long j2) {
        String hexString = Long.toHexString(j2);
        d2ok.kja0(hexString, "toHexString(this)");
        return hexString;
    }

    @SafeVarargs
    @InterfaceC7396q
    public static final <T> List<T> mcp(@InterfaceC7396q T... elements) {
        d2ok.m23075h(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(ni7.d2ok(Arrays.copyOf(objArr, objArr.length)));
        d2ok.kja0(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: n */
    public static final int m5760n(short s2, int i2) {
        return s2 & i2;
    }

    @InterfaceC7396q
    public static final String n5r1(@InterfaceC7396q Socket socket) {
        d2ok.m23075h(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        d2ok.kja0(hostName, "address.hostName");
        return hostName;
    }

    public static final void n7h(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void ncyb(@InterfaceC7396q Object obj) {
        d2ok.m23075h(obj, "<this>");
        obj.notifyAll();
    }

    public static final boolean ni7(@InterfaceC7396q okio.nn86 nn86Var, int i2, @InterfaceC7396q TimeUnit timeUnit) {
        d2ok.m23075h(nn86Var, "<this>");
        d2ok.m23075h(timeUnit, "timeUnit");
        try {
            return uv6(nn86Var, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void nn86(@InterfaceC7396q String name, @InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(block, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
        } finally {
            d3.m23090q(1);
            threadCurrentThread.setName(name2);
            d3.zy(1);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: o */
    public static final String m5761o(int i2) {
        String hexString = Integer.toHexString(i2);
        d2ok.kja0(hexString, "toHexString(this)");
        return hexString;
    }

    public static final boolean o1t(@InterfaceC7396q String[] strArr, @InterfaceC7395n String[] strArr2, @InterfaceC7396q Comparator<? super String> comparator) {
        d2ok.m23075h(strArr, "<this>");
        d2ok.m23075h(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    Iterator itM23145k = C6309s.m23145k(strArr2);
                    while (itM23145k.hasNext()) {
                        if (comparator.compare(str, (String) itM23145k.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final int oc(@InterfaceC7396q String str, int i2) {
        d2ok.m23075h(str, "<this>");
        int length = str.length();
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    /* JADX INFO: renamed from: p */
    public static final void m5762p(@InterfaceC7396q Object obj) {
        d2ok.m23075h(obj, "<this>");
        if (!f7245y || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    /* JADX INFO: renamed from: q */
    public static final int m5763q(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int qrj(@InterfaceC7396q String name, long j2, @InterfaceC7395n TimeUnit timeUnit) {
        d2ok.m23075h(name, "name");
        boolean z2 = true;
        if (!(j2 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis == 0 && j2 > 0) {
            z2 = false;
        }
        if (z2) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m5764r(@InterfaceC7396q Socket socket, @InterfaceC7396q n7h source) {
        d2ok.m23075h(socket, "<this>");
        d2ok.m23075h(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z2 = !source.py();
                socket.setSoTimeout(soTimeout);
                return z2;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m5765s(@InterfaceC7396q Object obj) {
        d2ok.m23075h(obj, "<this>");
        if (f7245y && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m5766t(@InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    public static final int t8r(@InterfaceC7396q String str, char c2, int i2, int i3) {
        d2ok.m23075h(str, "<this>");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[PHI: r12
      0x005b: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:23:0x007d, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean uv6(@mub.InterfaceC7396q okio.nn86 r11, int r12, @mub.InterfaceC7396q java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.d2ok.m23075h(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.d2ok.m23075h(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.j r2 = r11.toq()
            boolean r2 = r2.f7l8()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.j r2 = r11.toq()
            long r5 = r2.mo27757n()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.j r2 = r11.toq()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo27755g(r12)
            okio.x2 r12 = new okio.x2     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.wx16(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.m27873y()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            okio.j r11 = r11.toq()
            r11.toq()
            goto L80
        L5b:
            okio.j r11 = r11.toq()
            long r0 = r0 + r5
            r11.mo27755g(r0)
            goto L80
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
            okio.j r11 = r11.toq()
            r11.toq()
            goto L79
        L71:
            okio.j r11 = r11.toq()
            long r0 = r0 + r5
            r11.mo27755g(r0)
        L79:
            throw r12
        L7a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L80:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C1359g.uv6(okio.nn86, int, java.util.concurrent.TimeUnit):boolean");
    }

    @InterfaceC7396q
    public static final ThreadFactory vyq(@InterfaceC7396q final String name, final boolean z2) {
        d2ok.m23075h(name, "name");
        return new ThreadFactory() { // from class: b7.q
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C1359g.m5751e(name, z2, runnable);
            }
        };
    }

    public static final long wvg(@InterfaceC7396q okhttp3.fti ftiVar) {
        d2ok.m23075h(ftiVar, "<this>");
        String strZy = ftiVar.ltg8().zy(com.google.common.net.zy.f68551toq);
        if (strZy != null) {
            return bf2(strZy, -1L);
        }
        return -1L;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: x */
    public static final Throwable m5767x(@InterfaceC7396q Exception exc, @InterfaceC7396q List<? extends Exception> suppressed) {
        d2ok.m23075h(exc, "<this>");
        d2ok.m23075h(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            C6231h.m22845k(exc, it.next());
        }
        return exc;
    }

    public static final boolean x2(@InterfaceC7396q zurt zurtVar, @InterfaceC7396q zurt other) {
        d2ok.m23075h(zurtVar, "<this>");
        d2ok.m23075h(other, "other");
        return d2ok.f7l8(zurtVar.fti(), other.fti()) && zurtVar.m27520r() == other.m27520r() && d2ok.f7l8(zurtVar.uv6(), other.uv6());
    }

    public static final void x9kr(@InterfaceC7396q Object obj) {
        d2ok.m23075h(obj, "<this>");
        obj.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final okhttp3.ki m5768y(okhttp3.ki this_asFactory, InterfaceC7519n it) {
        d2ok.m23075h(this_asFactory, "$this_asFactory");
        d2ok.m23075h(it, "it");
        return this_asFactory;
    }

    @InterfaceC7396q
    public static final <T> List<T> y9n(@InterfaceC7396q List<? extends T> list) {
        d2ok.m23075h(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(kotlin.collections.a9.xzk4(list));
        d2ok.kja0(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static /* synthetic */ String yz(zurt zurtVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ek5k(zurtVar, z2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final String m5769z(@InterfaceC7396q String format, @InterfaceC7396q Object... args) {
        d2ok.m23075h(format, "format");
        d2ok.m23075h(args, "args");
        C6311u c6311u = C6311u.f36447k;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        d2ok.kja0(str, "format(locale, format, *args)");
        return str;
    }

    public static final void zp(@InterfaceC7396q Object obj) throws InterruptedException {
        d2ok.m23075h(obj, "<this>");
        obj.wait();
    }

    public static /* synthetic */ int zurt(String str, String str2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return m5755i(str, str2, i2, i3);
    }

    public static final <E> void zy(@InterfaceC7396q List<E> list, E e2) {
        d2ok.m23075h(list, "<this>");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }
}

package com.google.common.net;

import com.google.common.base.d3;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.collect.nsb;
import com.google.common.hash.cdj;
import com.google.common.io.C4717y;
import com.google.common.primitives.C4746s;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.qo;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.net.q */
/* JADX INFO: compiled from: InetAddresses.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4730q {

    /* JADX INFO: renamed from: k */
    private static final int f27235k = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f68482toq = 8;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final d3 f68483zy = d3.m15307y('.').m15308g(4);

    /* JADX INFO: renamed from: q */
    private static final d3 f27237q = d3.m15307y(':').m15308g(10);

    /* JADX INFO: renamed from: n */
    private static final Inet4Address f27236n = (Inet4Address) f7l8("127.0.0.1");

    /* JADX INFO: renamed from: g */
    private static final Inet4Address f27234g = (Inet4Address) f7l8("0.0.0.0");

    /* JADX INFO: renamed from: com.google.common.net.q$k */
    /* JADX INFO: compiled from: InetAddresses.java */
    @InterfaceC7731k
    public static final class k {

        /* JADX INFO: renamed from: k */
        private final Inet4Address f27238k;

        /* JADX INFO: renamed from: q */
        private final int f27239q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Inet4Address f68484toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f68485zy;

        public k(@NullableDecl Inet4Address inet4Address, @NullableDecl Inet4Address inet4Address2, int i2, int i3) {
            jk.ld6(i2 >= 0 && i2 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i2);
            jk.ld6(i3 >= 0 && i3 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", i3);
            this.f27238k = (Inet4Address) fu4.m15351k(inet4Address, C4730q.f27234g);
            this.f68484toq = (Inet4Address) fu4.m15351k(inet4Address2, C4730q.f27234g);
            this.f68485zy = i2;
            this.f27239q = i3;
        }

        /* JADX INFO: renamed from: k */
        public Inet4Address m16618k() {
            return this.f68484toq;
        }

        /* JADX INFO: renamed from: q */
        public Inet4Address m16619q() {
            return this.f27238k;
        }

        public int toq() {
            return this.f27239q;
        }

        public int zy() {
            return this.f68485zy;
        }
    }

    private C4730q() {
    }

    public static boolean a9(String str) {
        return m16614s(str) != null;
    }

    private static Inet4Address cdj(byte[] bArr) {
        jk.ld6(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) toq(bArr);
    }

    @NullableDecl
    private static byte[] d3(String str) {
        int size;
        int size2;
        List<String> listKja0 = f27237q.kja0(str);
        if (listKja0.size() < 3 || listKja0.size() > 9) {
            return null;
        }
        int i2 = -1;
        for (int i3 = 1; i3 < listKja0.size() - 1; i3++) {
            if (listKja0.get(i3).length() == 0) {
                if (i2 >= 0) {
                    return null;
                }
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            size2 = (listKja0.size() - i2) - 1;
            if (listKja0.get(0).length() == 0) {
                size = i2 - 1;
                if (size != 0) {
                    return null;
                }
            } else {
                size = i2;
            }
            if (((String) nsb.ni7(listKja0)).length() == 0 && size2 - 1 != 0) {
                return null;
            }
        } else {
            size = listKja0.size();
            size2 = 0;
        }
        int i4 = 8 - (size + size2);
        if (i2 < 0 ? i4 != 0 : i4 < 1) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        for (int i5 = 0; i5 < size; i5++) {
            try {
                byteBufferAllocate.putShort(fti(listKja0.get(i5)));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        for (int i6 = 0; i6 < i4; i6++) {
            byteBufferAllocate.putShort((short) 0);
        }
        while (size2 > 0) {
            byteBufferAllocate.putShort(fti(listKja0.get(listKja0.size() - size2)));
            size2--;
        }
        return byteBufferAllocate.array();
    }

    public static String eqxt(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return oc(inetAddress);
        }
        return "[" + oc(inetAddress) + "]";
    }

    public static InetAddress f7l8(String str) {
        byte[] bArrNi7 = ni7(str);
        if (bArrNi7 != null) {
            return toq(bArrNi7);
        }
        throw m16612p("'%s' is not an IP string literal.", str);
    }

    private static String fn3e(int[] iArr) {
        StringBuilder sb = new StringBuilder(39);
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iArr.length) {
            boolean z3 = iArr[i2] >= 0;
            if (z3) {
                if (z2) {
                    sb.append(':');
                }
                sb.append(Integer.toHexString(iArr[i2]));
            } else if (i2 == 0 || z2) {
                sb.append("::");
            }
            i2++;
            z2 = z3;
        }
        return sb.toString();
    }

    private static short fti(String str) {
        int i2 = Integer.parseInt(str, 16);
        if (i2 <= 65535) {
            return (short) i2;
        }
        throw new NumberFormatException();
    }

    public static boolean fu4(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    /* JADX INFO: renamed from: g */
    public static InetAddress m16607g(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        jk.fn3e(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return toq(address);
    }

    @NullableDecl
    private static byte[] gvn7(String str) {
        byte[] bArr = new byte[4];
        try {
            Iterator<String> it = f68483zy.n7h(str).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                bArr[i2] = jp0y(it.next());
                i2 = i3;
            }
            if (i2 == 4) {
                return bArr;
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Inet4Address m16608h(Inet6Address inet6Address) {
        if (m16617z(inet6Address)) {
            return kja0(inet6Address);
        }
        if (fu4(inet6Address)) {
            return qrj(inet6Address);
        }
        if (jk(inet6Address)) {
            return t8r(inet6Address).m16618k();
        }
        throw m16612p("'%s' has no embedded IPv4 address.", oc(inet6Address));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16609i(Inet6Address inet6Address) {
        return m16617z(inet6Address) || fu4(inet6Address) || jk(inet6Address);
    }

    public static boolean jk(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    private static byte jp0y(String str) {
        int i2 = Integer.parseInt(str);
        if (i2 > 255 || (str.startsWith("0") && str.length() > 1)) {
            throw new NumberFormatException();
        }
        return (byte) i2;
    }

    public static Inet4Address ki(Inet6Address inet6Address) {
        jk.fn3e(wvg(inet6Address), "Address '%s' is not an ISATAP address.", oc(inet6Address));
        return cdj(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address kja0(Inet6Address inet6Address) {
        jk.fn3e(m16617z(inet6Address), "Address '%s' is not IPv4-compatible.", oc(inet6Address));
        return cdj(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address ld6(int i2) {
        return cdj(C4746s.mcp(i2));
    }

    public static boolean mcp(InetAddress inetAddress) {
        for (byte b2 : inetAddress.getAddress()) {
            if (b2 != -1) {
                return false;
            }
        }
        return true;
    }

    @NullableDecl
    /* JADX INFO: renamed from: n */
    private static String m16611n(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrGvn7 = gvn7(str.substring(iLastIndexOf));
        if (bArrGvn7 == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrGvn7[0] & 255) << 8) | (bArrGvn7[1] & 255)) + ":" + Integer.toHexString((bArrGvn7[3] & 255) | ((bArrGvn7[2] & 255) << 8));
    }

    public static Inet4Address n7h(InetAddress inetAddress) {
        boolean z2;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i2 = 0;
        while (true) {
            if (i2 >= 15) {
                z2 = true;
                break;
            }
            if (address[i2] != 0) {
                z2 = false;
                break;
            }
            i2++;
        }
        if (z2 && address[15] == 1) {
            return f27236n;
        }
        if (z2 && address[15] == 0) {
            return f27234g;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int iAsInt = cdj.m16331z().hashLong(m16609i(inet6Address) ? m16608h(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt() | (-536870912);
        if (iAsInt == -1) {
            iAsInt = -2;
        }
        return cdj(C4746s.mcp(iAsInt));
    }

    @NullableDecl
    private static byte[] ni7(String str) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '.') {
                z3 = true;
            } else if (cCharAt == ':') {
                if (z3) {
                    return null;
                }
                z2 = true;
            } else if (Character.digit(cCharAt, 16) == -1) {
                return null;
            }
        }
        if (!z2) {
            if (z3) {
                return gvn7(str);
            }
            return null;
        }
        if (z3 && (str = m16611n(str)) == null) {
            return null;
        }
        return d3(str);
    }

    public static boolean o1t(String str) {
        return ni7(str) != null;
    }

    public static String oc(InetAddress inetAddress) {
        jk.a9(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        jk.m15383q(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 2;
            iArr[i2] = C4746s.ld6((byte) 0, (byte) 0, address[i3], address[i3 + 1]);
        }
        m16613q(iArr);
        return fn3e(iArr);
    }

    /* JADX INFO: renamed from: p */
    private static IllegalArgumentException m16612p(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    /* JADX INFO: renamed from: q */
    private static void m16613q(int[] iArr) {
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length + 1; i5++) {
            if (i5 >= iArr.length || iArr[i5] != 0) {
                if (i4 >= 0) {
                    int i6 = i5 - i4;
                    if (i6 > i2) {
                        i3 = i4;
                        i2 = i6;
                    }
                    i4 = -1;
                }
            } else if (i4 < 0) {
                i4 = i5;
            }
        }
        if (i2 >= 2) {
            Arrays.fill(iArr, i3, i2 + i3, -1);
        }
    }

    public static Inet4Address qrj(Inet6Address inet6Address) {
        jk.fn3e(fu4(inet6Address), "Address '%s' is not a 6to4 address.", oc(inet6Address));
        return cdj(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    @NullableDecl
    /* JADX INFO: renamed from: s */
    private static InetAddress m16614s(String str) {
        int i2;
        jk.a9(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            i2 = 4;
        }
        byte[] bArrNi7 = ni7(str);
        if (bArrNi7 == null || bArrNi7.length != i2) {
            return null;
        }
        return toq(bArrNi7);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m16615t(String str) {
        byte[] bArrNi7 = ni7(str);
        if (bArrNi7 == null || bArrNi7.length != 16) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 10) {
                for (int i3 = 10; i3 < 12; i3++) {
                    if (bArrNi7[i3] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrNi7[i2] != 0) {
                return false;
            }
            i2++;
        }
    }

    public static k t8r(Inet6Address inet6Address) {
        jk.fn3e(jk(inet6Address), "Address '%s' is not a Teredo address.", oc(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4AddressCdj = cdj(Arrays.copyOfRange(address, 4, 8));
        int i2 = C4717y.m16488s(address, 8).readShort() & qo.f36486g;
        int i3 = 65535 & (~C4717y.m16488s(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) (~bArrCopyOfRange[i4]);
        }
        return new k(inet4AddressCdj, cdj(bArrCopyOfRange), i3, i2);
    }

    private static InetAddress toq(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean wvg(Inet6Address inet6Address) {
        if (jk(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static InetAddress x2(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = bArr[(bArr.length - i2) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    /* JADX INFO: renamed from: y */
    public static InetAddress m16616y(String str) {
        InetAddress inetAddressM16614s = m16614s(str);
        if (inetAddressM16614s != null) {
            return inetAddressM16614s;
        }
        throw m16612p("Not a valid URI IP literal: '%s'", str);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m16617z(Inet6Address inet6Address) {
        byte b2;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b2 = address[15]) == 0 || b2 == 1)) ? false : true;
    }

    public static InetAddress zurt(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        jk.fn3e(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return toq(address);
    }

    public static int zy(InetAddress inetAddress) {
        return C4717y.m16489y(n7h(inetAddress).getAddress()).readInt();
    }
}

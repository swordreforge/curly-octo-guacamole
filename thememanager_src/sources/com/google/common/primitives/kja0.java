package com.google.common.primitives;

import com.google.common.base.jk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import sun.misc.Unsafe;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: UnsignedBytes.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class kja0 {

    /* JADX INFO: renamed from: k */
    public static final byte f27285k = -128;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final byte f68577toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f68578zy = 255;

    /* JADX INFO: renamed from: com.google.common.primitives.kja0$k */
    /* JADX INFO: compiled from: UnsignedBytes.java */
    @InterfaceC7732q
    static class C4740k {

        /* JADX INFO: renamed from: k */
        static final String f27286k = C4740k.class.getName() + "$UnsafeComparator";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final Comparator<byte[]> f68579toq = m16660k();

        /* JADX INFO: renamed from: com.google.common.primitives.kja0$k$k */
        /* JADX INFO: compiled from: UnsignedBytes.java */
        enum k implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i2 = 0; i2 < iMin; i2++) {
                    int qVar = kja0.toq(bArr[i2], bArr2[i2]);
                    if (qVar != 0) {
                        return qVar;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        /* JADX INFO: renamed from: com.google.common.primitives.kja0$k$toq */
        /* JADX INFO: compiled from: UnsignedBytes.java */
        @InterfaceC7732q
        enum toq implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            /* JADX INFO: renamed from: com.google.common.primitives.kja0$k$toq$k */
            /* JADX INFO: compiled from: UnsignedBytes.java */
            static class k implements PrivilegedExceptionAction<Unsafe> {
                k() {
                }

                @Override // java.security.PrivilegedExceptionAction
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            }

            static {
                Unsafe qVar = toq();
                theUnsafe = qVar;
                int iArrayBaseOffset = qVar.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || qVar.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe toq() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e2) {
                        throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new k());
                }
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i2 = iMin & (-8);
                int i3 = 0;
                while (i3 < i2) {
                    Unsafe unsafe = theUnsafe;
                    int i4 = BYTE_ARRAY_BASE_OFFSET;
                    long j2 = i3;
                    long j3 = unsafe.getLong(bArr, ((long) i4) + j2);
                    long j4 = unsafe.getLong(bArr2, ((long) i4) + j2);
                    if (j3 != j4) {
                        if (BIG_ENDIAN) {
                            return t8r.m16725k(j3, j4);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3 ^ j4) & (-8);
                        return ((int) ((j3 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j4 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i3 += 8;
                }
                while (i3 < iMin) {
                    int qVar = kja0.toq(bArr[i3], bArr2[i3]);
                    if (qVar != 0) {
                        return qVar;
                    }
                    i3++;
                }
                return bArr.length - bArr2.length;
            }
        }

        C4740k() {
        }

        /* JADX INFO: renamed from: k */
        static Comparator<byte[]> m16660k() {
            try {
                return (Comparator) Class.forName(f27286k).getEnumConstants()[0];
            } catch (Throwable unused) {
                return kja0.m16652g();
            }
        }
    }

    private kja0() {
    }

    @InterfaceC7731k
    public static String cdj(byte b2) {
        return ki(b2, 10);
    }

    public static byte f7l8(byte... bArr) {
        jk.m15383q(bArr.length > 0);
        int iM16653h = m16653h(bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            int iM16653h2 = m16653h(bArr[i2]);
            if (iM16653h2 > iM16653h) {
                iM16653h = iM16653h2;
            }
        }
        return (byte) iM16653h;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: g */
    static Comparator<byte[]> m16652g() {
        return C4740k.k.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static int m16653h(byte b2) {
        return b2 & 255;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public static byte m16654k(long j2) {
        jk.m15374h((j2 >> 8) == 0, "out of range: %s", j2);
        return (byte) j2;
    }

    @InterfaceC7731k
    public static String ki(byte b2, int i2) {
        jk.ld6(i2 >= 2 && i2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i2);
        return Integer.toString(m16653h(b2), i2);
    }

    public static void kja0(byte[] bArr, int i2, int i3) {
        jk.a9(bArr);
        jk.ek5k(i2, i3, bArr.length);
        for (int i4 = i2; i4 < i3; i4++) {
            bArr[i4] = (byte) (bArr[i4] ^ 127);
        }
        Arrays.sort(bArr, i2, i3);
        while (i2 < i3) {
            bArr[i2] = (byte) (bArr[i2] ^ 127);
            i2++;
        }
    }

    public static byte ld6(long j2) {
        if (j2 > m16653h((byte) -1)) {
            return (byte) -1;
        }
        if (j2 < 0) {
            return (byte) 0;
        }
        return (byte) j2;
    }

    /* JADX INFO: renamed from: n */
    public static Comparator<byte[]> m16655n() {
        return C4740k.f68579toq;
    }

    public static void n7h(byte[] bArr) {
        jk.a9(bArr);
        kja0(bArr, 0, bArr.length);
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static byte m16656p(String str, int i2) {
        int i3 = Integer.parseInt((String) jk.a9(str), i2);
        if ((i3 >> 8) == 0) {
            return (byte) i3;
        }
        throw new NumberFormatException("out of range: " + i3);
    }

    /* JADX INFO: renamed from: q */
    public static String m16657q(String str, byte... bArr) {
        jk.a9(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * (str.length() + 3));
        sb.append(m16653h(bArr[0]));
        for (int i2 = 1; i2 < bArr.length; i2++) {
            sb.append(str);
            sb.append(cdj(bArr[i2]));
        }
        return sb.toString();
    }

    public static void qrj(byte[] bArr, int i2, int i3) {
        jk.a9(bArr);
        jk.ek5k(i2, i3, bArr.length);
        for (int i4 = i2; i4 < i3; i4++) {
            bArr[i4] = zy(bArr[i4]);
        }
        Arrays.sort(bArr, i2, i3);
        while (i2 < i3) {
            bArr[i2] = zy(bArr[i2]);
            i2++;
        }
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static byte m16658s(String str) {
        return m16656p(str, 10);
    }

    public static int toq(byte b2, byte b3) {
        return m16653h(b2) - m16653h(b3);
    }

    public static void x2(byte[] bArr) {
        jk.a9(bArr);
        qrj(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: y */
    public static byte m16659y(byte... bArr) {
        jk.m15383q(bArr.length > 0);
        int iM16653h = m16653h(bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            int iM16653h2 = m16653h(bArr[i2]);
            if (iM16653h2 < iM16653h) {
                iM16653h = iM16653h2;
            }
        }
        return (byte) iM16653h;
    }

    private static byte zy(byte b2) {
        return (byte) (b2 ^ 128);
    }
}

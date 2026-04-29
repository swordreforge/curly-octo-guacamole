package com.google.common.hash;

import com.google.common.primitives.C4743p;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: LittleEndianByteArray.java */
/* JADX INFO: loaded from: classes2.dex */
final class fn3e {

    /* JADX INFO: renamed from: k */
    private static final zy f26997k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final /* synthetic */ boolean f68304toq = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.hash.fn3e$q */
    /* JADX INFO: compiled from: LittleEndianByteArray.java */
    private static abstract class EnumC4660q implements zy {
        public static final EnumC4660q UNSAFE_BIG_ENDIAN;
        public static final EnumC4660q UNSAFE_LITTLE_ENDIAN;

        /* JADX INFO: renamed from: k */
        private static final Unsafe f26998k;

        /* JADX INFO: renamed from: n */
        private static final /* synthetic */ EnumC4660q[] f26999n;

        /* JADX INFO: renamed from: q */
        private static final int f27000q;

        /* JADX INFO: renamed from: com.google.common.hash.fn3e$q$k */
        /* JADX INFO: compiled from: LittleEndianByteArray.java */
        enum k extends EnumC4660q {
            k(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.hash.fn3e.zy
            public long getLongLittleEndian(byte[] bArr, int i2) {
                return EnumC4660q.f26998k.getLong(bArr, ((long) i2) + ((long) EnumC4660q.f27000q));
            }

            @Override // com.google.common.hash.fn3e.zy
            public void putLongLittleEndian(byte[] bArr, int i2, long j2) {
                EnumC4660q.f26998k.putLong(bArr, ((long) i2) + ((long) EnumC4660q.f27000q), j2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.fn3e$q$toq */
        /* JADX INFO: compiled from: LittleEndianByteArray.java */
        enum toq extends EnumC4660q {
            toq(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.hash.fn3e.zy
            public long getLongLittleEndian(byte[] bArr, int i2) {
                return Long.reverseBytes(EnumC4660q.f26998k.getLong(bArr, ((long) i2) + ((long) EnumC4660q.f27000q)));
            }

            @Override // com.google.common.hash.fn3e.zy
            public void putLongLittleEndian(byte[] bArr, int i2, long j2) {
                EnumC4660q.f26998k.putLong(bArr, ((long) i2) + ((long) EnumC4660q.f27000q), Long.reverseBytes(j2));
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.fn3e$q$zy */
        /* JADX INFO: compiled from: LittleEndianByteArray.java */
        static class zy implements PrivilegedExceptionAction<Unsafe> {
            zy() {
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
            k kVar = new k("UNSAFE_LITTLE_ENDIAN", 0);
            UNSAFE_LITTLE_ENDIAN = kVar;
            toq toqVar = new toq("UNSAFE_BIG_ENDIAN", 1);
            UNSAFE_BIG_ENDIAN = toqVar;
            f26999n = new EnumC4660q[]{kVar, toqVar};
            Unsafe qVar = toq();
            f26998k = qVar;
            f27000q = qVar.arrayBaseOffset(byte[].class);
            if (qVar.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private EnumC4660q(String str, int i2) {
        }

        private static Unsafe toq() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new zy());
            }
        }

        public static EnumC4660q valueOf(String str) {
            return (EnumC4660q) Enum.valueOf(EnumC4660q.class, str);
        }

        public static EnumC4660q[] values() {
            return (EnumC4660q[]) f26999n.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LittleEndianByteArray.java */
    private static abstract class toq implements zy {
        public static final toq INSTANCE;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ toq[] f27001k;

        /* JADX INFO: renamed from: com.google.common.hash.fn3e$toq$k */
        /* JADX INFO: compiled from: LittleEndianByteArray.java */
        enum C4661k extends toq {
            C4661k(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.hash.fn3e.zy
            public long getLongLittleEndian(byte[] bArr, int i2) {
                return C4743p.m16684p(bArr[i2 + 7], bArr[i2 + 6], bArr[i2 + 5], bArr[i2 + 4], bArr[i2 + 3], bArr[i2 + 2], bArr[i2 + 1], bArr[i2]);
            }

            @Override // com.google.common.hash.fn3e.zy
            public void putLongLittleEndian(byte[] bArr, int i2, long j2) {
                long j3 = 255;
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i2 + i3] = (byte) ((j2 & j3) >> (i3 * 8));
                    j3 <<= 8;
                }
            }
        }

        static {
            C4661k c4661k = new C4661k("INSTANCE", 0);
            INSTANCE = c4661k;
            f27001k = new toq[]{c4661k};
        }

        private toq(String str, int i2) {
        }

        public static toq valueOf(String str) {
            return (toq) Enum.valueOf(toq.class, str);
        }

        public static toq[] values() {
            return (toq[]) f27001k.clone();
        }
    }

    /* JADX INFO: compiled from: LittleEndianByteArray.java */
    private interface zy {
        long getLongLittleEndian(byte[] bArr, int i2);

        void putLongLittleEndian(byte[] bArr, int i2, long j2);
    }

    static {
        zy zyVar = toq.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                zyVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? EnumC4660q.UNSAFE_LITTLE_ENDIAN : EnumC4660q.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f26997k = zyVar;
    }

    private fn3e() {
    }

    /* JADX INFO: renamed from: k */
    static int m16333k(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: n */
    static boolean m16334n() {
        return f26997k instanceof EnumC4660q;
    }

    /* JADX INFO: renamed from: q */
    static void m16335q(byte[] bArr, int i2, long j2) {
        f26997k.putLongLittleEndian(bArr, i2, j2);
    }

    static long toq(byte[] bArr, int i2) {
        return f26997k.getLongLittleEndian(bArr, i2);
    }

    static long zy(byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, 8);
        long j2 = 0;
        for (int i4 = 0; i4 < iMin; i4++) {
            j2 |= (((long) bArr[i2 + i4]) & 255) << (i4 * 8);
        }
        return j2;
    }
}

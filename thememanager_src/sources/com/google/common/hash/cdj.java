package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;
import miuix.security.C7323k;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Hashing.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class cdj {

    /* JADX INFO: renamed from: k */
    static final int f26989k = (int) System.currentTimeMillis();

    /* JADX INFO: compiled from: Hashing.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        static final kja0 f26990k = new o1t("SHA-256", "Hashing.sha256()");

        private f7l8() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.cdj$g */
    /* JADX INFO: compiled from: Hashing.java */
    private static class C4651g {

        /* JADX INFO: renamed from: k */
        static final kja0 f26991k = new o1t(C7323k.f90062zy, "Hashing.sha1()");

        private C4651g() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.cdj$n */
    /* JADX INFO: compiled from: Hashing.java */
    private static class C4653n {

        /* JADX INFO: renamed from: k */
        static final kja0 f26992k = new o1t(C7323k.f90061toq, "Hashing.md5()");

        private C4653n() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.cdj$q */
    /* JADX INFO: compiled from: Hashing.java */
    private static final class C4654q {

        /* JADX INFO: renamed from: k */
        private long f26993k;

        public C4654q(long j2) {
            this.f26993k = j2;
        }

        /* JADX INFO: renamed from: k */
        public double m16332k() {
            long j2 = (this.f26993k * 2862933555777941757L) + 1;
            this.f26993k = j2;
            return ((double) (((int) (j2 >>> 33)) + 1)) / 2.147483648E9d;
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.cdj$s */
    /* JADX INFO: compiled from: Hashing.java */
    private static class C4655s {

        /* JADX INFO: renamed from: k */
        static final kja0 f26994k = new o1t("SHA-512", "Hashing.sha512()");

        private C4655s() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Hashing.java */
    @Immutable
    static abstract class toq implements InterfaceC4664i<Checksum> {
        public static final toq ADLER_32;
        public static final toq CRC_32;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ toq[] f26995k;
        public final kja0 hashFunction;

        /* JADX INFO: renamed from: com.google.common.hash.cdj$toq$k */
        /* JADX INFO: compiled from: Hashing.java */
        enum C4656k extends toq {
            C4656k(String str, int i2, String str2) {
                super(str, i2, str2);
            }

            @Override // com.google.common.base.lvui
            public Checksum get() {
                return new CRC32();
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.cdj$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Hashing.java */
        enum C8009toq extends toq {
            C8009toq(String str, int i2, String str2) {
                super(str, i2, str2);
            }

            @Override // com.google.common.base.lvui
            public Checksum get() {
                return new Adler32();
            }
        }

        static {
            C4656k c4656k = new C4656k("CRC_32", 0, "Hashing.crc32()");
            CRC_32 = c4656k;
            C8009toq c8009toq = new C8009toq("ADLER_32", 1, "Hashing.adler32()");
            ADLER_32 = c8009toq;
            f26995k = new toq[]{c4656k, c8009toq};
        }

        public static toq valueOf(String str) {
            return (toq) Enum.valueOf(toq.class, str);
        }

        public static toq[] values() {
            return (toq[]) f26995k.clone();
        }

        private toq(String str, int i2, String str2) {
            this.hashFunction = new C4677s(this, 32, str2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.cdj$y */
    /* JADX INFO: compiled from: Hashing.java */
    private static class C4657y {

        /* JADX INFO: renamed from: k */
        static final kja0 f26996k = new o1t("SHA-384", "Hashing.sha384()");

        private C4657y() {
        }
    }

    /* JADX INFO: compiled from: Hashing.java */
    private static final class zy extends com.google.common.hash.toq {
        @Override // com.google.common.hash.kja0
        public int bits() {
            int iBits = 0;
            for (kja0 kja0Var : this.f27035k) {
                iBits += kja0Var.bits();
            }
            return iBits;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof zy) {
                return Arrays.equals(this.f27035k, ((zy) obj).f27035k);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f27035k);
        }

        @Override // com.google.common.hash.toq
        n7h toq(InterfaceC4663h[] interfaceC4663hArr) {
            byte[] bArr = new byte[bits() / 8];
            int iWriteBytesTo = 0;
            for (InterfaceC4663h interfaceC4663h : interfaceC4663hArr) {
                n7h n7hVarKja0 = interfaceC4663h.kja0();
                iWriteBytesTo += n7hVarKja0.writeBytesTo(bArr, iWriteBytesTo, n7hVarKja0.bits() / 8);
            }
            return n7h.fromBytesNoCopy(bArr);
        }

        private zy(kja0... kja0VarArr) {
            super(kja0VarArr);
            for (kja0 kja0Var : kja0VarArr) {
                com.google.common.base.jk.kja0(kja0Var.bits() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", kja0Var.bits(), kja0Var);
            }
        }
    }

    private cdj() {
    }

    public static kja0 a9() {
        return jk.SIP_HASH_24;
    }

    public static kja0 cdj(Key key) {
        return new C4682z("HmacSHA256", key, fn3e("hmacSha256", key));
    }

    public static int f7l8(long j2, int i2) {
        int i3 = 0;
        com.google.common.base.jk.ld6(i2 > 0, "buckets must be positive: %s", i2);
        C4654q c4654q = new C4654q(j2);
        while (true) {
            int iM16332k = (int) (((double) (i3 + 1)) / c4654q.m16332k());
            if (iM16332k < 0 || iM16332k >= i2) {
                break;
            }
            i3 = iM16332k;
        }
        return i3;
    }

    private static String fn3e(String str, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", str, key.getAlgorithm(), key.getFormat());
    }

    public static kja0 fti(long j2, long j3) {
        return new jk(2, 4, j2, j3);
    }

    public static kja0 fu4(int i2) {
        return new wvg(i2);
    }

    /* JADX INFO: renamed from: g */
    public static kja0 m16321g(Iterable<kja0> iterable) {
        com.google.common.base.jk.a9(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator<kja0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        com.google.common.base.jk.ld6(arrayList.size() > 0, "number of hash functions (%s) must be > 0", arrayList.size());
        return new zy((kja0[]) arrayList.toArray(new kja0[0]));
    }

    /* JADX INFO: renamed from: h */
    public static kja0 m16322h(byte[] bArr) {
        return kja0(new SecretKeySpec((byte[]) com.google.common.base.jk.a9(bArr), "HmacSHA1"));
    }

    /* JADX INFO: renamed from: i */
    public static kja0 m16323i(byte[] bArr) {
        return t8r(new SecretKeySpec((byte[]) com.google.common.base.jk.a9(bArr), "HmacSHA512"));
    }

    public static kja0 jk() {
        return C4655s.f26994k;
    }

    /* JADX INFO: renamed from: k */
    public static kja0 m16324k() {
        return toq.ADLER_32.hashFunction;
    }

    public static kja0 ki(byte[] bArr) {
        return cdj(new SecretKeySpec((byte[]) com.google.common.base.jk.a9(bArr), "HmacSHA256"));
    }

    public static kja0 kja0(Key key) {
        return new C4682z("HmacSHA1", key, fn3e("hmacSha1", key));
    }

    public static kja0 ld6() {
        return ld6.f27014k;
    }

    public static kja0 mcp() {
        return C4657y.f26996k;
    }

    /* JADX INFO: renamed from: n */
    public static kja0 m16325n(kja0 kja0Var, kja0 kja0Var2, kja0... kja0VarArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kja0Var);
        arrayList.add(kja0Var2);
        arrayList.addAll(Arrays.asList(kja0VarArr));
        return new zy((kja0[]) arrayList.toArray(new kja0[0]));
    }

    public static kja0 n7h(byte[] bArr) {
        return qrj(new SecretKeySpec((byte[]) com.google.common.base.jk.a9(bArr), "HmacMD5"));
    }

    public static kja0 ni7() {
        return wvg.MURMUR3_128;
    }

    public static kja0 o1t(int i2) {
        return new C4678t(i2);
    }

    /* JADX INFO: renamed from: p */
    public static kja0 m16326p() {
        return C4671p.f27021k;
    }

    /* JADX INFO: renamed from: q */
    public static n7h m16327q(Iterable<n7h> iterable) {
        Iterator<n7h> it = iterable.iterator();
        com.google.common.base.jk.m15380n(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<n7h> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] bArrAsBytes = it2.next().asBytes();
            com.google.common.base.jk.m15380n(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < bArrAsBytes.length; i2++) {
                bArr[i2] = (byte) (bArr[i2] + bArrAsBytes[i2]);
            }
        }
        return n7h.fromBytesNoCopy(bArr);
    }

    public static kja0 qrj(Key key) {
        return new C4682z("HmacMD5", key, fn3e("hmacMd5", key));
    }

    /* JADX INFO: renamed from: s */
    public static kja0 m16328s() {
        return toq.CRC_32.hashFunction;
    }

    /* JADX INFO: renamed from: t */
    public static kja0 m16329t() {
        return f7l8.f26990k;
    }

    public static kja0 t8r(Key key) {
        return new C4682z("HmacSHA512", key, fn3e("hmacSha512", key));
    }

    static int toq(int i2) {
        com.google.common.base.jk.m15380n(i2 > 0, "Number of bits must be positive");
        return (i2 + 31) & (-32);
    }

    @Deprecated
    public static kja0 wvg() {
        return C4651g.f26991k;
    }

    public static kja0 x2(int i2) {
        int qVar = toq(i2);
        if (qVar == 32) {
            return C4678t.GOOD_FAST_HASH_32;
        }
        if (qVar <= 128) {
            return wvg.GOOD_FAST_HASH_128;
        }
        int i3 = (qVar + 127) / 128;
        kja0[] kja0VarArr = new kja0[i3];
        kja0VarArr[0] = wvg.GOOD_FAST_HASH_128;
        int i4 = f26989k;
        for (int i5 = 1; i5 < i3; i5++) {
            i4 += 1500450271;
            kja0VarArr[i5] = fu4(i4);
        }
        return new zy(kja0VarArr);
    }

    /* JADX INFO: renamed from: y */
    public static int m16330y(n7h n7hVar, int i2) {
        return f7l8(n7hVar.padToLong(), i2);
    }

    /* JADX INFO: renamed from: z */
    public static kja0 m16331z() {
        return C4678t.MURMUR3_32;
    }

    @Deprecated
    public static kja0 zurt() {
        return C4653n.f26992k;
    }

    public static n7h zy(Iterable<n7h> iterable) {
        Iterator<n7h> it = iterable.iterator();
        com.google.common.base.jk.m15380n(it.hasNext(), "Must be at least 1 hash code to combine.");
        int iBits = it.next().bits() / 8;
        byte[] bArr = new byte[iBits];
        Iterator<n7h> it2 = iterable.iterator();
        while (it2.hasNext()) {
            byte[] bArrAsBytes = it2.next().asBytes();
            com.google.common.base.jk.m15380n(bArrAsBytes.length == iBits, "All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < bArrAsBytes.length; i2++) {
                bArr[i2] = (byte) ((bArr[i2] * 37) ^ bArrAsBytes[i2]);
            }
        }
        return n7h.fromBytesNoCopy(bArr);
    }
}

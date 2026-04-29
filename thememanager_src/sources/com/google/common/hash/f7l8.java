package com.google.common.hash;

import com.google.common.base.C4280z;
import com.google.common.hash.EnumC4681y;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: BloomFilter.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class f7l8<T> implements com.google.common.base.a9<T>, Serializable {
    private final EnumC4681y.zy bits;
    private final x2<? super T> funnel;
    private final int numHashFunctions;
    private final zy strategy;

    /* JADX INFO: compiled from: BloomFilter.java */
    private static class toq<T> implements Serializable {
        private static final long serialVersionUID = 1;
        final long[] data;
        final x2<? super T> funnel;
        final int numHashFunctions;
        final zy strategy;

        toq(f7l8<T> f7l8Var) {
            this.data = EnumC4681y.zy.f7l8(((f7l8) f7l8Var).bits.f27043k);
            this.numHashFunctions = ((f7l8) f7l8Var).numHashFunctions;
            this.funnel = ((f7l8) f7l8Var).funnel;
            this.strategy = ((f7l8) f7l8Var).strategy;
        }

        Object readResolve() {
            return new f7l8(new EnumC4681y.zy(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    /* JADX INFO: compiled from: BloomFilter.java */
    interface zy extends Serializable {
        <T> boolean mightContain(T t2, x2<? super T> x2Var, int i2, EnumC4681y.zy zyVar);

        int ordinal();

        <T> boolean put(T t2, x2<? super T> x2Var, int i2, EnumC4681y.zy zyVar);
    }

    public static <T> f7l8<T> create(x2<? super T> x2Var, int i2, double d2) {
        return create(x2Var, i2, d2);
    }

    @InterfaceC7732q
    static long optimalNumOfBits(long j2, double d2) {
        if (d2 == 0.0d) {
            d2 = Double.MIN_VALUE;
        }
        return (long) (((-j2) * Math.log(d2)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @InterfaceC7732q
    static int optimalNumOfHashFunctions(long j2, long j3) {
        return Math.max(1, (int) Math.round((j3 / j2) * Math.log(2.0d)));
    }

    public static <T> f7l8<T> readFrom(InputStream inputStream, x2<? super T> x2Var) throws IOException {
        int i2;
        int iM16653h;
        com.google.common.base.jk.fti(inputStream, "InputStream");
        com.google.common.base.jk.fti(x2Var, "Funnel");
        int i3 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte b2 = dataInputStream.readByte();
            try {
                iM16653h = com.google.common.primitives.kja0.m16653h(dataInputStream.readByte());
            } catch (RuntimeException e2) {
                e = e2;
                iM16653h = -1;
                i3 = b2;
                i2 = -1;
            }
            try {
                i3 = dataInputStream.readInt();
                EnumC4681y enumC4681y = EnumC4681y.values()[b2];
                long[] jArr = new long[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    jArr[i4] = dataInputStream.readLong();
                }
                return new f7l8<>(new EnumC4681y.zy(jArr), iM16653h, x2Var, enumC4681y);
            } catch (RuntimeException e3) {
                e = e3;
                int i5 = i3;
                i3 = b2;
                i2 = i5;
                throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + i3 + " numHashFunctions: " + iM16653h + " dataLength: " + i2, e);
            }
        } catch (RuntimeException e4) {
            e = e4;
            i2 = -1;
            iM16653h = -1;
        }
    }

    private Object writeReplace() {
        return new toq(this);
    }

    @Override // com.google.common.base.a9
    @Deprecated
    public boolean apply(T t2) {
        return mightContain(t2);
    }

    public long approximateElementCount() {
        double qVar = this.bits.toq();
        return com.google.common.math.toq.cdj(((-Math.log1p(-(this.bits.m16374k() / qVar))) * qVar) / ((double) this.numHashFunctions), RoundingMode.HALF_UP);
    }

    @InterfaceC7732q
    long bitSize() {
        return this.bits.toq();
    }

    public f7l8<T> copy() {
        return new f7l8<>(this.bits.zy(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // com.google.common.base.a9
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7l8)) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        return this.numHashFunctions == f7l8Var.numHashFunctions && this.funnel.equals(f7l8Var.funnel) && this.bits.equals(f7l8Var.bits) && this.strategy.equals(f7l8Var.strategy);
    }

    public double expectedFpp() {
        return Math.pow(this.bits.m16374k() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return C4280z.toq(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(f7l8<T> f7l8Var) {
        com.google.common.base.jk.a9(f7l8Var);
        return this != f7l8Var && this.numHashFunctions == f7l8Var.numHashFunctions && bitSize() == f7l8Var.bitSize() && this.strategy.equals(f7l8Var.strategy) && this.funnel.equals(f7l8Var.funnel);
    }

    public boolean mightContain(T t2) {
        return this.strategy.mightContain(t2, this.funnel, this.numHashFunctions, this.bits);
    }

    @CanIgnoreReturnValue
    public boolean put(T t2) {
        return this.strategy.put(t2, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(f7l8<T> f7l8Var) {
        com.google.common.base.jk.a9(f7l8Var);
        com.google.common.base.jk.m15380n(this != f7l8Var, "Cannot combine a BloomFilter with itself.");
        int i2 = this.numHashFunctions;
        int i3 = f7l8Var.numHashFunctions;
        com.google.common.base.jk.qrj(i2 == i3, "BloomFilters must have the same number of hash functions (%s != %s)", i2, i3);
        com.google.common.base.jk.t8r(bitSize() == f7l8Var.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), f7l8Var.bitSize());
        com.google.common.base.jk.m15391z(this.strategy.equals(f7l8Var.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, f7l8Var.strategy);
        com.google.common.base.jk.m15391z(this.funnel.equals(f7l8Var.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, f7l8Var.funnel);
        this.bits.m16375n(f7l8Var.bits);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(com.google.common.primitives.n7h.m16674k(this.strategy.ordinal()));
        dataOutputStream.writeByte(com.google.common.primitives.kja0.m16654k(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.f27043k.length());
        for (int i2 = 0; i2 < this.bits.f27043k.length(); i2++) {
            dataOutputStream.writeLong(this.bits.f27043k.get(i2));
        }
    }

    private f7l8(EnumC4681y.zy zyVar, int i2, x2<? super T> x2Var, zy zyVar2) {
        com.google.common.base.jk.ld6(i2 > 0, "numHashFunctions (%s) must be > 0", i2);
        com.google.common.base.jk.ld6(i2 <= 255, "numHashFunctions (%s) must be <= 255", i2);
        this.bits = (EnumC4681y.zy) com.google.common.base.jk.a9(zyVar);
        this.numHashFunctions = i2;
        this.funnel = (x2) com.google.common.base.jk.a9(x2Var);
        this.strategy = (zy) com.google.common.base.jk.a9(zyVar2);
    }

    public static <T> f7l8<T> create(x2<? super T> x2Var, long j2, double d2) {
        return create(x2Var, j2, d2, EnumC4681y.MURMUR128_MITZ_64);
    }

    @InterfaceC7732q
    static <T> f7l8<T> create(x2<? super T> x2Var, long j2, double d2, zy zyVar) {
        com.google.common.base.jk.a9(x2Var);
        com.google.common.base.jk.m15374h(j2 >= 0, "Expected insertions (%s) must be >= 0", j2);
        com.google.common.base.jk.fn3e(d2 > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d2));
        com.google.common.base.jk.fn3e(d2 < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d2));
        com.google.common.base.jk.a9(zyVar);
        if (j2 == 0) {
            j2 = 1;
        }
        long jOptimalNumOfBits = optimalNumOfBits(j2, d2);
        try {
            return new f7l8<>(new EnumC4681y.zy(jOptimalNumOfBits), optimalNumOfHashFunctions(j2, jOptimalNumOfBits), x2Var, zyVar);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + jOptimalNumOfBits + " bits", e2);
        }
    }

    public static <T> f7l8<T> create(x2<? super T> x2Var, int i2) {
        return create(x2Var, i2);
    }

    public static <T> f7l8<T> create(x2<? super T> x2Var, long j2) {
        return create(x2Var, j2, 0.03d);
    }
}

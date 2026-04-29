package com.google.common.collect;

import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.common.collect.c */
/* JADX INFO: compiled from: DiscreteDomain.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4324c<C extends Comparable> {
    final boolean supportsFastOffset;

    /* JADX INFO: renamed from: com.google.common.collect.c$q */
    /* JADX INFO: compiled from: DiscreteDomain.java */
    private static final class q extends AbstractC4324c<Long> implements Serializable {

        /* JADX INFO: renamed from: k */
        private static final q f26014k = new q();
        private static final long serialVersionUID = 0;

        q() {
            super(true);
        }

        private Object readResolve() {
            return f26014k;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // com.google.common.collect.AbstractC4324c
        public long distance(Long l2, Long l3) {
            long jLongValue = l3.longValue() - l2.longValue();
            if (l3.longValue() > l2.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l3.longValue() >= l2.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Long next(Long l2) {
            long jLongValue = l2.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4324c
        public Long offset(Long l2, long j2) {
            C4524t.zy(j2, "distance");
            long jLongValue = l2.longValue() + j2;
            if (jLongValue < 0) {
                com.google.common.base.jk.m15380n(l2.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Long previous(Long l2) {
            long jLongValue = l2.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.c$toq */
    /* JADX INFO: compiled from: DiscreteDomain.java */
    private static final class toq extends AbstractC4324c<BigInteger> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: k */
        private static final toq f26015k = new toq();

        /* JADX INFO: renamed from: q */
        private static final BigInteger f26017q = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: n */
        private static final BigInteger f26016n = BigInteger.valueOf(Long.MAX_VALUE);

        toq() {
            super(true);
        }

        private Object readResolve() {
            return f26015k;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // com.google.common.collect.AbstractC4324c
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f26017q).min(f26016n).longValue();
        }

        @Override // com.google.common.collect.AbstractC4324c
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4324c
        public BigInteger offset(BigInteger bigInteger, long j2) {
            C4524t.zy(j2, "distance");
            return bigInteger.add(BigInteger.valueOf(j2));
        }

        @Override // com.google.common.collect.AbstractC4324c
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.c$zy */
    /* JADX INFO: compiled from: DiscreteDomain.java */
    private static final class zy extends AbstractC4324c<Integer> implements Serializable {

        /* JADX INFO: renamed from: k */
        private static final zy f26018k = new zy();
        private static final long serialVersionUID = 0;

        zy() {
            super(true);
        }

        private Object readResolve() {
            return f26018k;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // com.google.common.collect.AbstractC4324c
        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4324c
        public Integer offset(Integer num, long j2) {
            C4524t.zy(j2, "distance");
            return Integer.valueOf(C4746s.m16718q(num.longValue() + j2));
        }

        @Override // com.google.common.collect.AbstractC4324c
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    public static AbstractC4324c<BigInteger> bigIntegers() {
        return toq.f26015k;
    }

    public static AbstractC4324c<Integer> integers() {
        return zy.f26018k;
    }

    public static AbstractC4324c<Long> longs() {
        return q.f26014k;
    }

    public abstract long distance(C c2, C c3);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c2);

    C offset(C c2, long j2) {
        C4524t.zy(j2, "distance");
        for (long j3 = 0; j3 < j2; j3++) {
            c2 = (C) next(c2);
        }
        return c2;
    }

    public abstract C previous(C c2);

    protected AbstractC4324c() {
        this(false);
    }

    private AbstractC4324c(boolean z2) {
        this.supportsFastOffset = z2;
    }
}

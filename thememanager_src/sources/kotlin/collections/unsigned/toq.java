package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.C6220d;
import kotlin.C6475u;
import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.collections.C6144h;
import kotlin.collections.n5r1;
import kotlin.dr;
import kotlin.gyi;
import kotlin.hb;
import kotlin.hyr;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.ld6;
import kotlin.py;
import kotlin.qo;
import kotlin.tfm;
import kotlin.x2;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
class toq {

    /* JADX INFO: renamed from: kotlin.collections.unsigned.toq$k */
    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class C6167k extends kotlin.collections.zy<gyi> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int[] f36198k;

        C6167k(int[] iArr) {
            this.f36198k = iArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof gyi) {
                return m22634k(((gyi) obj).a98o());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22633g(int i2) {
            return C6144h.f5k(this.f36198k, i2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
            return gyi.zy(toq(i2));
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return dr.n7h(this.f36198k);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof gyi) {
                return zy(((gyi) obj).a98o());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return dr.cdj(this.f36198k);
        }

        /* JADX INFO: renamed from: k */
        public boolean m22634k(int i2) {
            return dr.m22807y(this.f36198k, i2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof gyi) {
                return m22633g(((gyi) obj).a98o());
            }
            return -1;
        }

        public int toq(int i2) {
            return dr.x2(this.f36198k, i2);
        }

        public int zy(int i2) {
            return C6144h.wj7e(this.f36198k, i2);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.unsigned.toq$q */
    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class C6168q extends kotlin.collections.zy<qo> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ short[] f36199k;

        C6168q(short[] sArr) {
            this.f36199k = sArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof qo) {
                return m22636k(((qo) obj).bf2());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22635g(short s2) {
            return C6144h.fyt(this.f36199k, s2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
            return qo.zy(toq(i2));
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return tfm.n7h(this.f36199k);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof qo) {
                return zy(((qo) obj).bf2());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return tfm.cdj(this.f36199k);
        }

        /* JADX INFO: renamed from: k */
        public boolean m22636k(short s2) {
            return tfm.m23656y(this.f36199k, s2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof qo) {
                return m22635g(((qo) obj).bf2());
            }
            return -1;
        }

        public short toq(int i2) {
            return tfm.x2(this.f36199k, i2);
        }

        public int zy(short s2) {
            return C6144h.kes(this.f36199k, s2);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.unsigned.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class C8052toq extends kotlin.collections.zy<ikck> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long[] f36200k;

        C8052toq(long[] jArr) {
            this.f36200k = jArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof ikck) {
                return m22638k(((ikck) obj).a98o());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22637g(long j2) {
            return C6144h.mxfl(this.f36200k, j2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
            return ikck.zy(toq(i2));
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return C6220d.n7h(this.f36200k);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof ikck) {
                return zy(((ikck) obj).a98o());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return C6220d.cdj(this.f36200k);
        }

        /* JADX INFO: renamed from: k */
        public boolean m22638k(long j2) {
            return C6220d.m22784y(this.f36200k, j2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof ikck) {
                return m22637g(((ikck) obj).a98o());
            }
            return -1;
        }

        public long toq(int i2) {
            return C6220d.x2(this.f36200k, i2);
        }

        public int zy(long j2) {
            return C6144h.que(this.f36200k, j2);
        }
    }

    /* JADX INFO: compiled from: _UArraysJvm.kt */
    public static final class zy extends kotlin.collections.zy<C6475u> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ byte[] f36201k;

        zy(byte[] bArr) {
            this.f36201k = bArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C6475u) {
                return m22640k(((C6475u) obj).bf2());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22639g(byte b2) {
            return C6144h.pwca(this.f36201k, b2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
            return C6475u.zy(toq(i2));
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return bo.n7h(this.f36201k);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C6475u) {
                return zy(((C6475u) obj).bf2());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return bo.cdj(this.f36201k);
        }

        /* JADX INFO: renamed from: k */
        public boolean m22640k(byte b2) {
            return bo.m22417y(this.f36201k, b2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C6475u) {
                return m22639g(((C6475u) obj).bf2());
            }
            return -1;
        }

        public byte toq(int i2) {
            return bo.x2(this.f36201k, i2);
        }

        public int zy(byte b2) {
            return C6144h.m7(this.f36201k, b2);
        }
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ ikck a9(long[] min) {
        d2ok.m23075h(min, "$this$min");
        return kotlin.collections.unsigned.zy.bbg(min);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    @InterfaceC6232i
    /* JADX INFO: renamed from: c */
    private static final BigInteger m22618c(short[] sumOf, cyoe.x2<? super qo, ? extends BigInteger> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        int iN7h = tfm.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(qo.zy(tfm.x2(sumOf, i2))));
            d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ gyi cdj(int[] max) {
        d2ok.m23075h(max, "$this$max");
        return kotlin.collections.unsigned.zy.t8o(max);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minWithOrNull instead.", replaceWith = @hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ gyi d2ok(int[] minWith, Comparator comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.mru(minWith, comparator);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use minByOrNull instead.", replaceWith = @hb(expression = "this.minByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> gyi d3(int[] minBy, cyoe.x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(minBy)) {
            return null;
        }
        int iX2 = dr.x2(minBy, 0);
        int iSrpc = C6144h.srpc(minBy);
        if (iSrpc != 0) {
            R rInvoke = selector.invoke(gyi.zy(iX2));
            n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
            while (it.hasNext()) {
                int iX22 = dr.x2(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(gyi.zy(iX22));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iX2 = iX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return gyi.zy(iX2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    @InterfaceC6232i
    private static final BigDecimal dd(byte[] sumOf, cyoe.x2<? super C6475u, ? extends BigDecimal> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        int iN7h = bo.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(C6475u.zy(bo.x2(sumOf, i2))));
            d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minWithOrNull instead.", replaceWith = @hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ C6475u eqxt(byte[] minWith, Comparator comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.hzl(minWith, comparator);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    @InterfaceC6232i
    /* JADX INFO: renamed from: f */
    private static final BigInteger m22619f(long[] sumOf, cyoe.x2<? super ikck, ? extends BigInteger> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        int iN7h = C6220d.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))));
            d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int f7l8(@InterfaceC7396q short[] binarySearch, short s2, int i2, int i3) {
        d2ok.m23075h(binarySearch, "$this$binarySearch");
        kotlin.collections.zy.Companion.m22683q(i2, i3, tfm.n7h(binarySearch));
        int i4 = s2 & qo.f36486g;
        int i5 = i3 - 1;
        while (i2 <= i5) {
            int i6 = (i2 + i5) >>> 1;
            int iZy = py.zy(binarySearch[i6], i4);
            if (iZy < 0) {
                i2 = i6 + 1;
            } else {
                if (iZy <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i2 + 1);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use maxByOrNull instead.", replaceWith = @hb(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> C6475u fn3e(byte[] maxBy, cyoe.x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(maxBy)) {
            return null;
        }
        byte bX2 = bo.x2(maxBy, 0);
        int iVl = C6144h.vl(maxBy);
        if (iVl != 0) {
            R rInvoke = selector.invoke(C6475u.zy(bX2));
            n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
            while (it.hasNext()) {
                byte bX22 = bo.x2(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(C6475u.zy(bX22));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bX2 = bX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C6475u.zy(bX2);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ qo fti(short[] min) {
        d2ok.m23075h(min, "$this$min");
        return kotlin.collections.unsigned.zy.jut(min);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use maxByOrNull instead.", replaceWith = @hb(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> qo fu4(short[] maxBy, cyoe.x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(maxBy)) {
            return null;
        }
        short sX2 = tfm.x2(maxBy, 0);
        int iOrxw = C6144h.orxw(maxBy);
        if (iOrxw != 0) {
            R rInvoke = selector.invoke(qo.zy(sX2));
            n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
            while (it.hasNext()) {
                short sX22 = tfm.x2(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(qo.zy(sX22));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sX2 = sX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return qo.zy(sX2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m22620g(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = dr.n7h(iArr);
        }
        return m22625n(iArr, i2, i3, i4);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use minByOrNull instead.", replaceWith = @hb(expression = "this.minByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> ikck gvn7(long[] minBy, cyoe.x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(minBy)) {
            return null;
        }
        long jX2 = C6220d.x2(minBy, 0);
        int iHmvj = C6144h.hmvj(minBy);
        if (iHmvj != 0) {
            R rInvoke = selector.invoke(ikck.zy(jX2));
            n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
            while (it.hasNext()) {
                long jX22 = C6220d.x2(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(ikck.zy(jX22));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jX2 = jX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return ikck.zy(jX2);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: h */
    private static final long m22621h(long[] elementAt, int i2) {
        d2ok.m23075h(elementAt, "$this$elementAt");
        return C6220d.x2(elementAt, i2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    @InterfaceC6232i
    private static final BigInteger hyr(int[] sumOf, cyoe.x2<? super gyi, ? extends BigInteger> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        int iN7h = dr.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(gyi.zy(dr.x2(sumOf, i2))));
            d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qo m22622i(short[] max) {
        d2ok.m23075h(max, "$this$max");
        return kotlin.collections.unsigned.zy.jp(max);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ C6475u jk(byte[] min) {
        d2ok.m23075h(min, "$this$min");
        return kotlin.collections.unsigned.zy.wutb(min);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use minByOrNull instead.", replaceWith = @hb(expression = "this.minByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> C6475u jp0y(byte[] minBy, cyoe.x2<? super C6475u, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (bo.cdj(minBy)) {
            return null;
        }
        byte bX2 = bo.x2(minBy, 0);
        int iVl = C6144h.vl(minBy);
        if (iVl != 0) {
            R rInvoke = selector.invoke(C6475u.zy(bX2));
            n5r1 it = new kotlin.ranges.x2(1, iVl).iterator();
            while (it.hasNext()) {
                byte bX22 = bo.x2(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(C6475u.zy(bX22));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bX2 = bX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C6475u.zy(bX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: k */
    public static final List<gyi> m22623k(@InterfaceC7396q int[] asList) {
        d2ok.m23075h(asList, "$this$asList");
        return new C6167k(asList);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ C6475u ki(byte[] max) {
        d2ok.m23075h(max, "$this$max");
        return kotlin.collections.unsigned.zy.ym(max);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final int kja0(int[] elementAt, int i2) {
        d2ok.m23075h(elementAt, "$this$elementAt");
        return dr.x2(elementAt, i2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    @InterfaceC6232i
    /* JADX INFO: renamed from: l */
    private static final BigDecimal m22624l(short[] sumOf, cyoe.x2<? super qo, ? extends BigDecimal> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        int iN7h = tfm.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(qo.zy(tfm.x2(sumOf, i2))));
            d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    public static final int ld6(@InterfaceC7396q byte[] binarySearch, byte b2, int i2, int i3) {
        d2ok.m23075h(binarySearch, "$this$binarySearch");
        kotlin.collections.zy.Companion.m22683q(i2, i3, bo.n7h(binarySearch));
        int i4 = b2 & 255;
        int i5 = i3 - 1;
        while (i2 <= i5) {
            int i6 = (i2 + i5) >>> 1;
            int iZy = py.zy(binarySearch[i6], i4);
            if (iZy < 0) {
                i2 = i6 + 1;
            } else {
                if (iZy <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i2 + 1);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minWithOrNull instead.", replaceWith = @hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ qo lvui(short[] minWith, Comparator comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.g6i(minWith, comparator);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ gyi mcp(int[] min) {
        d2ok.m23075h(min, "$this$min");
        return kotlin.collections.unsigned.zy.lz(min);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: n */
    public static final int m22625n(@InterfaceC7396q int[] binarySearch, int i2, int i3, int i4) {
        d2ok.m23075h(binarySearch, "$this$binarySearch");
        kotlin.collections.zy.Companion.m22683q(i3, i4, dr.n7h(binarySearch));
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int iZy = py.zy(binarySearch[i6], i2);
            if (iZy < 0) {
                i3 = i6 + 1;
            } else {
                if (iZy <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    @InterfaceC6232i
    private static final BigInteger n5r1(byte[] sumOf, cyoe.x2<? super C6475u, ? extends BigInteger> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        int iN7h = bo.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(C6475u.zy(bo.x2(sumOf, i2))));
            d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final short n7h(short[] elementAt, int i2) {
        d2ok.m23075h(elementAt, "$this$elementAt");
        return tfm.x2(elementAt, i2);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    @InterfaceC6232i
    private static final BigDecimal ncyb(long[] sumOf, cyoe.x2<? super ikck, ? extends BigDecimal> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        int iN7h = C6220d.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(ikck.zy(C6220d.x2(sumOf, i2))));
            d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use maxByOrNull instead.", replaceWith = @hb(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> gyi ni7(int[] maxBy, cyoe.x2<? super gyi, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (dr.cdj(maxBy)) {
            return null;
        }
        int iX2 = dr.x2(maxBy, 0);
        int iSrpc = C6144h.srpc(maxBy);
        if (iSrpc != 0) {
            R rInvoke = selector.invoke(gyi.zy(iX2));
            n5r1 it = new kotlin.ranges.x2(1, iSrpc).iterator();
            while (it.hasNext()) {
                int iX22 = dr.x2(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(gyi.zy(iX22));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iX2 = iX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return gyi.zy(iX2);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxWithOrNull instead.", replaceWith = @hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ gyi o1t(int[] maxWith, Comparator comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.olj(maxWith, comparator);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use minByOrNull instead.", replaceWith = @hb(expression = "this.minByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> qo oc(short[] minBy, cyoe.x2<? super qo, ? extends R> selector) {
        d2ok.m23075h(minBy, "$this$minBy");
        d2ok.m23075h(selector, "selector");
        if (tfm.cdj(minBy)) {
            return null;
        }
        short sX2 = tfm.x2(minBy, 0);
        int iOrxw = C6144h.orxw(minBy);
        if (iOrxw != 0) {
            R rInvoke = selector.invoke(qo.zy(sX2));
            n5r1 it = new kotlin.ranges.x2(1, iOrxw).iterator();
            while (it.hasNext()) {
                short sX22 = tfm.x2(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(qo.zy(sX22));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sX2 = sX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return qo.zy(sX2);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m22626p(long[] jArr, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C6220d.n7h(jArr);
        }
        return m22629s(jArr, j2, i2, i3);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: q */
    public static final List<qo> m22627q(@InterfaceC7396q short[] asList) {
        d2ok.m23075h(asList, "$this$asList");
        return new C6168q(asList);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final byte qrj(byte[] elementAt, int i2) {
        d2ok.m23075h(elementAt, "$this$elementAt");
        return bo.x2(elementAt, i2);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use minWithOrNull instead.", replaceWith = @hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ ikck m22628r(long[] minWith, Comparator comparator) {
        d2ok.m23075h(minWith, "$this$minWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.u4(minWith, comparator);
    }

    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: s */
    public static final int m22629s(@InterfaceC7396q long[] binarySearch, long j2, int i2, int i3) {
        d2ok.m23075h(binarySearch, "$this$binarySearch");
        kotlin.collections.zy.Companion.m22683q(i2, i3, C6220d.n7h(binarySearch));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iF7l8 = py.f7l8(binarySearch[i5], j2);
            if (iF7l8 < 0) {
                i2 = i5 + 1;
            } else {
                if (iF7l8 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxWithOrNull instead.", replaceWith = @hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ ikck m22630t(long[] maxWith, Comparator comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.rq(maxWith, comparator);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ ikck t8r(long[] max) {
        d2ok.m23075h(max, "$this$max");
        return kotlin.collections.unsigned.zy.qyk(max);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<C6475u> toq(@InterfaceC7396q byte[] asList) {
        d2ok.m23075h(asList, "$this$asList");
        return new zy(asList);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxWithOrNull instead.", replaceWith = @hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final /* synthetic */ qo wvg(short[] maxWith, Comparator comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.i0(maxWith, comparator);
    }

    public static /* synthetic */ int x2(byte[] bArr, byte b2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bo.n7h(bArr);
        }
        return ld6(bArr, b2, i2, i3);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    @InterfaceC6232i
    private static final BigDecimal x9kr(int[] sumOf, cyoe.x2<? super gyi, ? extends BigDecimal> selector) {
        d2ok.m23075h(sumOf, "$this$sumOf");
        d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        int iN7h = dr.n7h(sumOf);
        for (int i2 = 0; i2 < iN7h; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(gyi.zy(dr.x2(sumOf, i2))));
            d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m22631y(short[] sArr, short s2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = tfm.n7h(sArr);
        }
        return f7l8(sArr, s2, i2, i3);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @ld6(message = "Use maxWithOrNull instead.", replaceWith = @hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C6475u m22632z(byte[] maxWith, Comparator comparator) {
        d2ok.m23075h(maxWith, "$this$maxWith");
        d2ok.m23075h(comparator, "comparator");
        return kotlin.collections.unsigned.zy.fpn(maxWith, comparator);
    }

    @x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @ld6(message = "Use maxByOrNull instead.", replaceWith = @hb(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz(version = "1.3")
    @InterfaceC6232i
    private static final /* synthetic */ <R extends Comparable<? super R>> ikck zurt(long[] maxBy, cyoe.x2<? super ikck, ? extends R> selector) {
        d2ok.m23075h(maxBy, "$this$maxBy");
        d2ok.m23075h(selector, "selector");
        if (C6220d.cdj(maxBy)) {
            return null;
        }
        long jX2 = C6220d.x2(maxBy, 0);
        int iHmvj = C6144h.hmvj(maxBy);
        if (iHmvj != 0) {
            R rInvoke = selector.invoke(ikck.zy(jX2));
            n5r1 it = new kotlin.ranges.x2(1, iHmvj).iterator();
            while (it.hasNext()) {
                long jX22 = C6220d.x2(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(ikck.zy(jX22));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jX2 = jX22;
                    rInvoke = rInvoke2;
                }
            }
        }
        return ikck.zy(jX2);
    }

    @InterfaceC7396q
    @yz(version = "1.3")
    @InterfaceC6232i
    public static final List<ikck> zy(@InterfaceC7396q long[] asList) {
        d2ok.m23075h(asList, "$this$asList");
        return new C8052toq(asList);
    }
}

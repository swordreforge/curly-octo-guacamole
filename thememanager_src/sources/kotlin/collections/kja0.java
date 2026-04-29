package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.InterfaceC6244y;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n13896#2,14:3043\n13919#2,14:3057\n13942#2,14:3071\n13965#2,14:3085\n13988#2,14:3099\n14011#2,14:3113\n14034#2,14:3127\n14057#2,14:3141\n14080#2,14:3155\n16482#2,14:3169\n16505#2,14:3183\n16528#2,14:3197\n16551#2,14:3211\n16574#2,14:3225\n16597#2,14:3239\n16620#2,14:3253\n16643#2,14:3267\n16666#2,14:3281\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2434#1:3043,14\n2441#1:3057,14\n2448#1:3071,14\n2455#1:3085,14\n2462#1:3099,14\n2469#1:3113,14\n2476#1:3127,14\n2483#1:3141,14\n2490#1:3155,14\n2632#1:3169,14\n2639#1:3183,14\n2646#1:3197,14\n2653#1:3211,14\n2660#1:3225,14\n2667#1:3239,14\n2674#1:3253,14\n2681#1:3267,14\n2688#1:3281,14\n*E\n"})
public class kja0 extends n7h {

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class f7l8 extends kotlin.collections.zy<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean[] f36162k;

        f7l8(boolean[] zArr) {
            this.f36162k = zArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return m22527k(((Boolean) obj).booleanValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22526g(boolean z2) {
            return C6144h.zq(this.f36162k, z2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36162k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return zy(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36162k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22527k(boolean z2) {
            return C6144h.t0(this.f36162k, z2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return m22526g(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i2) {
            return Boolean.valueOf(this.f36162k[i2]);
        }

        public int zy(boolean z2) {
            return C6144h.l8s(this.f36162k, z2);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.kja0$g */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @kotlin.jvm.internal.lv5({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12534#2,2:3043\n1699#2,6:3045\n1807#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"})
    public static final class C6148g extends kotlin.collections.zy<Double> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ double[] f36163k;

        C6148g(double[] dArr) {
            this.f36163k = dArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return m22529k(((Number) obj).doubleValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22528g(double d2) {
            double[] dArr = this.f36163k;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i2 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d2)) {
                    return length;
                }
                if (i2 < 0) {
                    return -1;
                }
                length = i2;
            }
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36163k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return zy(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36163k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22529k(double d2) {
            for (double d4 : this.f36163k) {
                if (Double.doubleToLongBits(d4) == Double.doubleToLongBits(d2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return m22528g(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Double get(int i2) {
            return Double.valueOf(this.f36163k[i2]);
        }

        public int zy(double d2) {
            double[] dArr = this.f36163k;
            int length = dArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (Double.doubleToLongBits(dArr[i2]) == Double.doubleToLongBits(d2)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.kja0$k */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class C6149k extends kotlin.collections.zy<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ byte[] f36164k;

        C6149k(byte[] bArr) {
            this.f36164k = bArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return m22531k(((Number) obj).byteValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22530g(byte b2) {
            return C6144h.pwca(this.f36164k, b2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36164k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return zy(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36164k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22531k(byte b2) {
            return C6144h.ih(this.f36164k, b2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return m22530g(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Byte get(int i2) {
            return Byte.valueOf(this.f36164k[i2]);
        }

        public int zy(byte b2) {
            return C6144h.m7(this.f36164k, b2);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.kja0$n */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    @kotlin.jvm.internal.lv5({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12524#2,2:3043\n1687#2,6:3045\n1795#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3043,2\n201#1:3045,6\n202#1:3051,6\n*E\n"})
    public static final class C6150n extends kotlin.collections.zy<Float> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float[] f36165k;

        C6150n(float[] fArr) {
            this.f36165k = fArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return m22533k(((Number) obj).floatValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22532g(float f2) {
            float[] fArr = this.f36165k;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i2 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f2)) {
                    return length;
                }
                if (i2 < 0) {
                    return -1;
                }
                length = i2;
            }
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36165k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return zy(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36165k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22533k(float f2) {
            for (float f3 : this.f36165k) {
                if (Float.floatToIntBits(f3) == Float.floatToIntBits(f2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return m22532g(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Float get(int i2) {
            return Float.valueOf(this.f36165k[i2]);
        }

        public int zy(float f2) {
            float[] fArr = this.f36165k;
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (Float.floatToIntBits(fArr[i2]) == Float.floatToIntBits(f2)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.kja0$q */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class C6151q extends kotlin.collections.zy<Long> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long[] f36166k;

        C6151q(long[] jArr) {
            this.f36166k = jArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return m22535k(((Number) obj).longValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22534g(long j2) {
            return C6144h.mxfl(this.f36166k, j2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36166k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return zy(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36166k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22535k(long j2) {
            return C6144h.p2sg(this.f36166k, j2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return m22534g(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Long get(int i2) {
            return Long.valueOf(this.f36166k[i2]);
        }

        public int zy(long j2) {
            return C6144h.que(this.f36166k, j2);
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class toq extends kotlin.collections.zy<Short> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ short[] f36167k;

        toq(short[] sArr) {
            this.f36167k = sArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return m22537k(((Number) obj).shortValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22536g(short s2) {
            return C6144h.fyt(this.f36167k, s2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36167k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return zy(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36167k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22537k(short s2) {
            return C6144h.x0c(this.f36167k, s2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return m22536g(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Short get(int i2) {
            return Short.valueOf(this.f36167k[i2]);
        }

        public int zy(short s2) {
            return C6144h.kes(this.f36167k, s2);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.kja0$y */
    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class C6152y extends kotlin.collections.zy<Character> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ char[] f36168k;

        C6152y(char[] cArr) {
            this.f36168k = cArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return m22539k(((Character) obj).charValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22538g(char c2) {
            return C6144h.lb(this.f36168k, c2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36168k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return zy(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36168k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22539k(char c2) {
            return C6144h.fl(this.f36168k, c2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return m22538g(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Character get(int i2) {
            return Character.valueOf(this.f36168k[i2]);
        }

        public int zy(char c2) {
            return C6144h.s4pb(this.f36168k, c2);
        }
    }

    /* JADX INFO: compiled from: _ArraysJvm.kt */
    public static final class zy extends kotlin.collections.zy<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int[] f36169k;

        zy(int[] iArr) {
            this.f36169k = iArr;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return m22541k(((Number) obj).intValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m22540g(int i2) {
            return C6144h.f5k(this.f36169k, i2);
        }

        @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
        public int getSize() {
            return this.f36169k.length;
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return zy(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC6147k, java.util.Collection
        public boolean isEmpty() {
            return this.f36169k.length == 0;
        }

        /* JADX INFO: renamed from: k */
        public boolean m22541k(int i2) {
            return C6144h.i03a(this.f36169k, i2);
        }

        @Override // kotlin.collections.zy, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return m22540g(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.zy, java.util.List
        @InterfaceC7396q
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Integer get(int i2) {
            return Integer.valueOf(this.f36169k[i2]);
        }

        public int zy(int i2) {
            return C6144h.wj7e(this.f36169k, i2);
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: a */
    private static final String m22507a(byte[] bArr) {
        String string = Arrays.toString(bArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @InterfaceC7396q
    public static final SortedSet<Integer> a3dw(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return (SortedSet) C6144h.a7on(iArr, new TreeSet());
    }

    public static void a5id(@InterfaceC7396q short[] sArr, short s2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        Arrays.fill(sArr, i2, i3, s2);
    }

    public static final <T> void a8p6(@InterfaceC7396q T[] tArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        Arrays.sort(tArr, i2, i3);
    }

    public static final int a9(@InterfaceC7396q short[] sArr, short s2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return Arrays.binarySearch(sArr, i2, i3, s2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int a98o(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character ab(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.u0t(cArr, comparator);
    }

    @InterfaceC7396q
    public static final Short[] ae4(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            shArr[i2] = Short.valueOf(sArr[i2]);
        }
        return shArr;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger alcv(char[] cArr, cyoe.x2<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (char c2 : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(c2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC7396q
    public static final <T> T[] anhx(@InterfaceC7396q T[] tArr, @InterfaceC7396q Collection<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    public static final <T> void anw(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void ap23(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Arrays.sort(tArr, i2, i3, comparator);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: b */
    private static final int m22508b(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @InterfaceC7396q
    public static short[] b2(@InterfaceC7396q short[] sArr, @InterfaceC7396q short[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] result = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static long[] b3e(@InterfaceC7396q long[] jArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        qrj.zy(i3, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(jArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return jArrCopyOfRange;
    }

    @InterfaceC7396q
    public static final Character[] b6(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            chArr[i2] = Character.valueOf(cArr[i2]);
        }
        return chArr;
    }

    @InterfaceC7396q
    public static final float[] b7(@InterfaceC7396q float[] fArr, @InterfaceC7396q float[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] result = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    public static /* synthetic */ void b8(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        vy(objArr, obj, i2, i3);
    }

    public static /* synthetic */ void b9ub(long[] jArr, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = jArr.length;
        }
        dxef(jArr, j2, i2, i3);
    }

    public static void bap7(@InterfaceC7396q byte[] bArr, byte b2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        Arrays.fill(bArr, i2, i3, b2);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static <T> T[] bek6(@InterfaceC7396q T[] tArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        qrj.zy(i3, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> int bf2(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final <T> BigInteger bf5(T[] tArr, cyoe.x2<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (T t2 : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(t2));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte bih(byte[] bArr, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int iVl = C6144h.vl(bArr);
        if (iVl == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iVl).iterator();
        while (n5r1VarM23351p.hasNext()) {
            byte b3 = bArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b2 = b3;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final String bo(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long bqie(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.dxb(jArr, comparator);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger brv(int[] iArr, cyoe.x2<? super Integer, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (int i2 : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Integer.valueOf(i2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Double btvn(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return C6144h.dgf(dArr);
    }

    @InterfaceC6234g
    private static final short[] bwp(short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i2);
        kotlin.jvm.internal.d2ok.kja0(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static final char[] bz2(@InterfaceC7396q char[] cArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        qrj.zy(i3, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(cArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return cArrCopyOfRange;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: c */
    private static final boolean m22509c(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double c25(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.yj1(dArr, comparator);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final char[] c8jq(@InterfaceC7396q char[] cArr, @InterfaceC7396q char[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(cArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @InterfaceC7396q
    public static final Integer[] cb(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    @InterfaceC7396q
    public static final List<Float> cdj(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return new C6150n(fArr);
    }

    @InterfaceC6234g
    private static final long[] cfr(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.d2ok.kja0(jArrCopyOf, "copyOf(this, size)");
        return jArrCopyOf;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final String ch(float[] fArr) {
        String string = Arrays.toString(fArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal cjaj(short[] sArr, cyoe.x2<? super Short, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (short s2 : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Short.valueOf(s2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Integer cn02(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return C6144h.t146(iArr);
    }

    public static /* synthetic */ void cnbm(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = iArr.length;
        }
        e5(iArr, i2, i3, i4);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger cr3(long[] jArr, cyoe.x2<? super Long, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (long j2 : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Long.valueOf(j2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static short[] cv06(@InterfaceC7396q short[] sArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        qrj.zy(i3, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(sArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return sArrCopyOfRange;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T cyoe(T[] tArr, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        int iGjp = C6144h.gjp(tArr);
        if (iGjp != 0) {
            R rInvoke = selector.invoke(t2);
            n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iGjp).iterator();
            while (n5r1VarM23351p.hasNext()) {
                T t3 = tArr[n5r1VarM23351p.nextInt()];
                R rInvoke2 = selector.invoke(t3);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t2 = t3;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t2;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: d */
    public static short[] m22510d(@InterfaceC7396q short[] sArr, @InterfaceC7396q short[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(sArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @InterfaceC7396q
    public static final char[] d1ts(@InterfaceC7396q char[] cArr, char c2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, length + 1);
        result[length] = c2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    public static /* synthetic */ int d2ok(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        return mcp(objArr, obj, i2, i3);
    }

    public static /* synthetic */ int d3(float[] fArr, float f2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = fArr.length;
        }
        return o1t(fArr, f2, i2, i3);
    }

    public static /* synthetic */ void d6c(int[] iArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = iArr.length;
        }
        nod(iArr, i2, i3);
    }

    @InterfaceC7396q
    public static final SortedSet<Double> d6od(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return (SortedSet) C6144h.ae9n(dArr, new TreeSet());
    }

    public static /* synthetic */ Object[] d8wk(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        return ikck(objArr, objArr2, i2, i3, i4);
    }

    @InterfaceC7396q
    public static final Long[] d9i(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal dbf(byte[] bArr, cyoe.x2<? super Byte, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (byte b2 : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Byte.valueOf(b2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6244y
    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    @InterfaceC6769y(name = "contentDeepEqualsInline")
    private static final <T> boolean dd(T[] tArr, T[] other) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return n7h.f7l8(tArr, other);
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final short[] m28276do(short[] sArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return cv06(sArr, i2, i3);
        }
        if (i3 <= sArr.length) {
            short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(sArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return sArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + sArr.length);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final float[] dr(@InterfaceC7396q float[] fArr, @InterfaceC7396q float[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(fArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    public static void dxef(@InterfaceC7396q long[] jArr, long j2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        Arrays.fill(jArr, i2, i3, j2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: e */
    private static final boolean m22511e(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static final void e4e(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void e5(@InterfaceC7396q int[] iArr, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        Arrays.fill(iArr, i3, i4, i2);
    }

    @InterfaceC6234g
    private static final byte ebn(byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return bArr[i2];
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character ec(char[] cArr, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int iJ59a = C6144h.j59a(cArr);
        if (iJ59a == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = selector.invoke(Character.valueOf(c2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iJ59a).iterator();
        while (n5r1VarM23351p.hasNext()) {
            char c3 = cArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c2 = c3;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int ek5k(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    public static /* synthetic */ void eklw(Comparable[] comparableArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = comparableArr.length;
        }
        iz(comparableArr, i2, i3);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character el(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.ay(cArr, comparator);
    }

    public static /* synthetic */ int eqxt(long[] jArr, long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = jArr.length;
        }
        return m22520t(jArr, j2, i2, i3);
    }

    public static final void erbd(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal es7(char[] cArr, cyoe.x2<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (char c2 : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(c2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6234g
    private static final int[] etdu(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.d2ok.kja0(iArrCopyOf, "copyOf(this, size)");
        return iArrCopyOf;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal eu(boolean[] zArr, cyoe.x2<? super Boolean, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (boolean z2 : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Boolean.valueOf(z2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC7396q
    public static final <R> List<R> ew(@InterfaceC7396q Object[] objArr, @InterfaceC7396q Class<R> klass) {
        kotlin.jvm.internal.d2ok.m23075h(objArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(klass, "klass");
        return (List) ix(objArr, new ArrayList(), klass);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Short exv8(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return C6144h.pp(sArr);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: f */
    private static final boolean m22512f(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object f1bi(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(objArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.hx(objArr, comparator);
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> SortedSet<T> f26p(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (SortedSet) C6144h.mp7a(tArr, new TreeSet());
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer f3f(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.dbvq(iArr, comparator);
    }

    @InterfaceC7396q
    public static final long[] f7z0(@InterfaceC7396q long[] jArr, @InterfaceC7396q Collection<Long> elements) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    private static final <T extends Comparable<? super T>> void ff(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        anw(tArr);
    }

    @InterfaceC7396q
    public static long[] fh(@InterfaceC7396q long[] jArr, @InterfaceC7396q long[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] result = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC7396q
    public static final List<Short> fn3e(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return new toq(sArr);
    }

    public static /* synthetic */ double[] fnq8(double[] dArr, double[] dArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = dArr.length;
        }
        return gyi(dArr, dArr2, i2, i3, i4);
    }

    public static /* synthetic */ int fti(byte[] bArr, byte b2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return ni7(bArr, b2, i2, i3);
    }

    public static final int fu4(@InterfaceC7396q char[] cArr, char c2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return Arrays.binarySearch(cArr, i2, i3, c2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float g0ad(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.ob6y(fArr, comparator);
    }

    public static /* synthetic */ short[] g1(short[] sArr, short[] sArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = sArr.length;
        }
        return m22510d(sArr, sArr2, i2, i3, i4);
    }

    public static final void ga(@InterfaceC7396q float[] fArr, float f2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        Arrays.fill(fArr, i2, i3, f2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable gb(Comparable[] comparableArr) {
        kotlin.jvm.internal.d2ok.m23075h(comparableArr, "<this>");
        return C6144h.qf(comparableArr);
    }

    @InterfaceC6234g
    private static final byte[] gbni(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC6234g
    private static final boolean[] gc3c(boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i2);
        kotlin.jvm.internal.d2ok.kja0(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    public static /* synthetic */ void gcp(byte[] bArr, byte b2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        bap7(bArr, b2, i2, i3);
    }

    @InterfaceC7396q
    public static final short[] ge(@InterfaceC7396q short[] sArr, @InterfaceC7396q Collection<Short> elements) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    public static /* synthetic */ int gvn7(double[] dArr, double d2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = dArr.length;
        }
        return m22525z(dArr, d2, i2, i3);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger gw(byte[] bArr, cyoe.x2<? super Byte, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (byte b2 : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Byte.valueOf(b2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final double[] gyi(@InterfaceC7396q double[] dArr, @InterfaceC7396q double[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(dArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static List<Double> m22513h(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return new C6148g(dArr);
    }

    public static final void h4b(@InterfaceC7396q char[] cArr, char c2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        Arrays.fill(cArr, i2, i3, c2);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static final boolean[] h7am(@InterfaceC7396q boolean[] zArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        qrj.zy(i3, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(zArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return zArrCopyOfRange;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final boolean hb(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte hyow(byte[] bArr, cyoe.x2<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int iVl = C6144h.vl(bArr);
        if (iVl == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iVl).iterator();
        while (n5r1VarM23351p.hasNext()) {
            byte b3 = bArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Byte.valueOf(b3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b2 = b3;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "contentDeepToStringNullable")
    private static final <T> String hyr(T[] tArr) {
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return n7h.m22562y(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        kotlin.jvm.internal.d2ok.kja0(strDeepToString, "deepToString(this)");
        return strDeepToString;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static <T> List<T> m22514i(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        List<T> listM22469k = cdj.m22469k(tArr);
        kotlin.jvm.internal.d2ok.kja0(listM22469k, "asList(this)");
        return listM22469k;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int i1(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @InterfaceC7396q
    public static final char[] i1an(@InterfaceC7396q char[] cArr, @InterfaceC7396q Collection<Character> elements) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long i3x9(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.mam(jArr, comparator);
    }

    @InterfaceC6234g
    private static final char[] i9jn(char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i2);
        kotlin.jvm.internal.d2ok.kja0(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    @InterfaceC6234g
    private static final double ij(double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return dArr[i2];
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static <T> T[] ikck(@InterfaceC7396q T[] tArr, @InterfaceC7396q T[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(tArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer imd(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.zne(iArr, comparator);
    }

    public static /* synthetic */ void ip(Object[] objArr, Comparator comparator, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        ap23(objArr, comparator, i2, i3);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super R>, R> C ix(@InterfaceC7396q Object[] objArr, @InterfaceC7396q C destination, @InterfaceC7396q Class<R> klass) {
        kotlin.jvm.internal.d2ok.m23075h(objArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final <T> T[] ixz(T[] tArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return (T[]) bek6(tArr, i2, i3);
        }
        if (i3 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + tArr.length);
    }

    @kotlin.yz(version = "1.4")
    public static final <T extends Comparable<? super T>> void iz(@InterfaceC7396q T[] tArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        Arrays.sort(tArr, i2, i3);
    }

    public static <T> void izu(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: j */
    private static final boolean m22515j(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @InterfaceC7396q
    public static final <T> T[] j3y2(@InterfaceC7396q T[] tArr, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC7396q
    public static final SortedSet<Boolean> jb9(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return (SortedSet) C6144h.p7p2(zArr, new TreeSet());
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final double[] jbh(double[] dArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return uj2j(dArr, i2, i3);
        }
        if (i3 <= dArr.length) {
            double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(dArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return dArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + dArr.length);
    }

    public static final <T> int jk(@InterfaceC7396q T[] tArr, T t2, @InterfaceC7396q Comparator<? super T> comparator, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return Arrays.binarySearch(tArr, i2, i3, t2, comparator);
    }

    public static /* synthetic */ int jp0y(char[] cArr, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = cArr.length;
        }
        return fu4(cArr, c2, i2, i3);
    }

    public static /* synthetic */ void jyr(double[] dArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = dArr.length;
        }
        nc(dArr, i2, i3);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static final float[] jz5(@InterfaceC7396q float[] fArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        qrj.zy(i3, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(fArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return fArrCopyOfRange;
    }

    public static final void k4jz(@InterfaceC7396q char[] cArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        Arrays.sort(cArr, i2, i3);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character kbj(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return C6144h.nv(cArr);
    }

    @InterfaceC6234g
    private static final short[] kcsr(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.d2ok.kja0(sArrCopyOf, "copyOf(this, size)");
        return sArrCopyOf;
    }

    @InterfaceC7396q
    public static List<Integer> ki(@InterfaceC7396q int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return new zy(iArr);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Short kiv(short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return C6144h.iq(sArr);
    }

    @InterfaceC7396q
    public static final List<Character> kja0(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return new C6152y(cArr);
    }

    public static final void kjd(@InterfaceC7396q byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        Arrays.sort(bArr, i2, i3);
    }

    @InterfaceC7396q
    public static int[] kl7m(@InterfaceC7396q int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, length + 1);
        result[length] = i2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal koj(float[] fArr, cyoe.x2<? super Float, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (float f2 : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Float.valueOf(f2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC7396q
    public static <T> T[] kq(@InterfaceC7396q T[] tArr, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Double kq2f(Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return C6144h.upj2(dArr);
    }

    @InterfaceC7396q
    public static byte[] kt06(@InterfaceC7396q byte[] bArr, @InterfaceC7396q byte[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] result = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static int[] ktq(@InterfaceC7396q int[] iArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        qrj.zy(i3, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(iArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return iArrCopyOfRange;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Byte kx3(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return C6144h.sly(bArr);
    }

    @InterfaceC7396q
    public static final byte[] kz28(@InterfaceC7396q byte[] bArr, @InterfaceC7396q Collection<Byte> elements) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "contentDeepHashCodeNullable")
    /* JADX INFO: renamed from: l */
    private static final <T> int m22516l(T[] tArr) {
        return kotlin.internal.qrj.m22878k(1, 3, 0) ? qrj.toq(tArr) : Arrays.deepHashCode(tArr);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long l05(long[] jArr, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int iHmvj = C6144h.hmvj(jArr);
        if (iHmvj == 0) {
            return Long.valueOf(j2);
        }
        R rInvoke = selector.invoke(Long.valueOf(j2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (n5r1VarM23351p.hasNext()) {
            long j3 = jArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger l7o(short[] sArr, cyoe.x2<? super Short, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (short s2 : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Short.valueOf(s2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC7396q
    public static int[] le7(@InterfaceC7396q int[] iArr, @InterfaceC7396q int[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] result = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC7396q
    public static final SortedSet<Float> lg4k(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return (SortedSet) C6144h.xk9p(fArr, new TreeSet());
    }

    @InterfaceC6234g
    private static final boolean lh(boolean[] zArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return zArr[i2];
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T lk(T[] tArr, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t2 = tArr[0];
        int iGjp = C6144h.gjp(tArr);
        if (iGjp != 0) {
            R rInvoke = selector.invoke(t2);
            n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iGjp).iterator();
            while (n5r1VarM23351p.hasNext()) {
                T t3 = tArr[n5r1VarM23351p.nextInt()];
                R rInvoke2 = selector.invoke(t3);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t2 = t3;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t2;
    }

    @InterfaceC7396q
    public static final Double[] ln(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final boolean lrht(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @InterfaceC6234g
    private static final double[] ltg8(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.d2ok.kja0(dArrCopyOf, "copyOf(this, size)");
        return dArrCopyOf;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final String lv5(long[] jArr) {
        String string = Arrays.toString(jArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    public static /* synthetic */ int lvui(Object[] objArr, Object obj, Comparator comparator, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return jk(objArr, obj, comparator, i2, i3);
    }

    public static final void lw(@InterfaceC7396q boolean[] zArr, boolean z2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        Arrays.fill(zArr, i2, i3, z2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: m */
    private static final int m22517m(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    public static final void m28(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable m2t(Comparable[] comparableArr) {
        kotlin.jvm.internal.d2ok.m23075h(comparableArr, "<this>");
        return C6144h.yi(comparableArr);
    }

    @InterfaceC6234g
    private static final float[] m4(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.d2ok.kja0(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void m58i(float[] fArr, float f2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = fArr.length;
        }
        ga(fArr, f2, i2, i3);
    }

    @InterfaceC7396q
    public static final double[] m8(@InterfaceC7396q double[] dArr, double d2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, length + 1);
        result[length] = d2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final char[] mbx(char[] cArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return bz2(cArr, i2, i3);
        }
        if (i3 <= cArr.length) {
            char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(cArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return cArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + cArr.length);
    }

    public static final <T> int mcp(@InterfaceC7396q T[] tArr, T t2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return Arrays.binarySearch(tArr, i2, i3, t2);
    }

    @InterfaceC6234g
    private static final <T> T[] mete(T[] tArr, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return (T[]) kq(tArr, t2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer mi1u(int[] iArr, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int iSrpc = C6144h.srpc(iArr);
        if (iSrpc == 0) {
            return Integer.valueOf(i2);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (n5r1VarM23351p.hasNext()) {
            int i3 = iArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i2 = i3;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Float mj(Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return C6144h.vc7p(fArr);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger mla(boolean[] zArr, cyoe.x2<? super Boolean, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (boolean z2 : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Boolean.valueOf(z2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final boolean[] mu(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q boolean[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(zArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @InterfaceC7396q
    public static long[] mub(@InterfaceC7396q long[] jArr, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, length + 1);
        result[length] = j2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    private static final long n2t(long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return jArr[i2];
    }

    @InterfaceC6244y
    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    @InterfaceC6769y(name = "contentDeepToStringInline")
    private static final <T> String n5r1(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return n7h.m22562y(tArr);
    }

    @InterfaceC7396q
    public static final List<Byte> n7h(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return new C6149k(bArr);
    }

    public static final void nc(@InterfaceC7396q double[] dArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        Arrays.sort(dArr, i2, i3);
    }

    @InterfaceC6244y
    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    @InterfaceC6769y(name = "contentDeepHashCodeInline")
    private static final <T> int ncyb(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return qrj.toq(tArr);
    }

    @InterfaceC6234g
    private static final short ngy(short[] sArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return sArr[i2];
    }

    public static final int ni7(@InterfaceC7396q byte[] bArr, byte b2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return Arrays.binarySearch(bArr, i2, i3, b2);
    }

    public static /* synthetic */ void nme(short[] sArr, short s2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = sArr.length;
        }
        a5id(sArr, s2, i2, i3);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final String nmn5(int[] iArr) {
        String string = Arrays.toString(iArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> boolean nn86(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Integer nnh(int[] iArr) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return C6144h.gu(iArr);
    }

    public static final void nod(@InterfaceC7396q int[] iArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        Arrays.sort(iArr, i2, i3);
    }

    @InterfaceC6234g
    private static final float nsb(float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return fArr[i2];
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object nyj(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(objArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.ogyu(objArr, comparator);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: o */
    private static final int m22518o(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static /* synthetic */ void o05(double[] dArr, double d2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = dArr.length;
        }
        wlev(dArr, d2, i2, i3);
    }

    public static final int o1t(@InterfaceC7396q float[] fArr, float f2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return Arrays.binarySearch(fArr, i2, i3, f2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double o5(double[] dArr, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int iF14 = C6144h.f14(dArr);
        if (iF14 == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iF14).iterator();
        while (n5r1VarM23351p.hasNext()) {
            double d4 = dArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d4));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                d2 = d4;
            }
        }
        return Double.valueOf(d2);
    }

    public static /* synthetic */ void oaex(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        kjd(bArr, i2, i3);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Byte ob(byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return C6144h.o3u0(bArr);
    }

    public static /* synthetic */ int oc(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = iArr.length;
        }
        return wvg(iArr, i2, i3, i4);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal oei(int[] iArr, cyoe.x2<? super Integer, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (int i2 : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Integer.valueOf(i2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    public static /* synthetic */ void oki(char[] cArr, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = cArr.length;
        }
        h4b(cArr, c2, i2, i3);
    }

    @InterfaceC7396q
    public static final int[] oph(@InterfaceC7396q int[] iArr, @InterfaceC7396q Collection<Integer> elements) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Long ovdh(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return C6144h.jz7r(jArr);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final <T> BigDecimal owi(T[] tArr, cyoe.x2<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (T t2 : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(t2));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6234g
    private static final char pc(char[] cArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return cArr[i2];
    }

    @InterfaceC6234g
    private static final <T> T pjz9(T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return tArr[i2];
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double pnt2(double[] dArr, cyoe.x2<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int iF14 = C6144h.f14(dArr);
        if (iF14 == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = selector.invoke(Double.valueOf(d2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iF14).iterator();
        while (n5r1VarM23351p.hasNext()) {
            double d4 = dArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Double.valueOf(d4));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                d2 = d4;
            }
        }
        return Double.valueOf(d2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Double ps(Double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return C6144h.yy(dArr);
    }

    @InterfaceC6234g
    private static final char[] py(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.d2ok.kja0(cArrCopyOf, "copyOf(this, size)");
        return cArrCopyOf;
    }

    @InterfaceC7396q
    public static final Float[] qexj(@InterfaceC7396q float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean qh4d(boolean[] zArr, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z2 = zArr[0];
        int iRl = C6144h.rl(zArr);
        if (iRl == 0) {
            return Boolean.valueOf(z2);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iRl).iterator();
        while (n5r1VarM23351p.hasNext()) {
            boolean z3 = zArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z2 = z3;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static /* synthetic */ char[] qkj8(char[] cArr, char[] cArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = cArr.length;
        }
        return c8jq(cArr, cArr2, i2, i3, i4);
    }

    public static final void qla(@InterfaceC7396q short[] sArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        Arrays.sort(sArr, i2, i3);
    }

    public static /* synthetic */ float[] qo(float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = fArr.length;
        }
        return dr(fArr, fArr2, i2, i3, i4);
    }

    @InterfaceC7396q
    public static final <T> SortedSet<T> qppo(@InterfaceC7396q T[] tArr, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (SortedSet) C6144h.mp7a(tArr, new TreeSet(comparator));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m22519r(short[] sArr, short s2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = sArr.length;
        }
        return a9(sArr, s2, i2, i3);
    }

    public static /* synthetic */ void r25n(boolean[] zArr, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = zArr.length;
        }
        lw(zArr, z2, i2, i3);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short r6ty(short[] sArr, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int iOrxw = C6144h.orxw(sArr);
        if (iOrxw == 0) {
            return Short.valueOf(s2);
        }
        R rInvoke = selector.invoke(Short.valueOf(s2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (n5r1VarM23351p.hasNext()) {
            short s3 = sArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s2 = s3;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC6234g
    private static final double[] r8s8(double[] dArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i2);
        kotlin.jvm.internal.d2ok.kja0(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Float ra(Float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return C6144h.ow0(fArr);
    }

    public static final void rf(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer rp(int[] iArr, cyoe.x2<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int iSrpc = C6144h.srpc(iArr);
        if (iSrpc == 0) {
            return Integer.valueOf(i2);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iSrpc).iterator();
        while (n5r1VarM23351p.hasNext()) {
            int i3 = iArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Integer.valueOf(i3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i2 = i3;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i2);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal s31(long[] jArr, cyoe.x2<? super Long, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (long j2 : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Long.valueOf(j2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    public static /* synthetic */ void sb(long[] jArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = jArr.length;
        }
        sj(jArr, i2, i3);
    }

    @InterfaceC7396q
    public static final boolean[] sb1e(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q boolean[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] result = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC7396q
    public static final float[] sc(@InterfaceC7396q float[] fArr, @InterfaceC7396q Collection<Float> elements) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    private static final boolean[] se(boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.d2ok.kja0(zArrCopyOf, "copyOf(this, size)");
        return zArrCopyOf;
    }

    public static final void sj(@InterfaceC7396q long[] jArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        Arrays.sort(jArr, i2, i3);
    }

    @InterfaceC6234g
    private static final int[] sok(int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
        kotlin.jvm.internal.d2ok.kja0(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: t */
    public static final int m22520t(@InterfaceC7396q long[] jArr, long j2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return Arrays.binarySearch(jArr, i2, i3, j2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> String t8iq(T[] tArr) {
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @InterfaceC7396q
    public static List<Long> t8r(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return new C6151q(jArr);
    }

    public static /* synthetic */ int[] tfm(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = iArr.length;
        }
        return xwq3(iArr, iArr2, i2, i3, i4);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float tjz5(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.s4y(fArr, comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short tww7(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.ss2(sArr, comparator);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: u */
    private static final String m22521u(short[] sArr) {
        String string = Arrays.toString(sArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Double u38j(double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return C6144h.cph(dArr);
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final int[] uc(int[] iArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return ktq(iArr, i2, i3);
        }
        if (i3 <= iArr.length) {
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(iArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return iArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + iArr.length);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Long uf(long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return C6144h.mnxh(jArr);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static final double[] uj2j(@InterfaceC7396q double[] dArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        qrj.zy(i3, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(dArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return dArrCopyOfRange;
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final boolean[] ukdy(boolean[] zArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return h7am(zArr, i2, i3);
        }
        if (i3 <= zArr.length) {
            boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(zArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return zArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + zArr.length);
    }

    @InterfaceC7396q
    public static final double[] ula6(@InterfaceC7396q double[] dArr, @InterfaceC7396q Collection<Double> elements) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC7396q
    public static final char[] uo(@InterfaceC7396q char[] cArr, @InterfaceC7396q char[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] result = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    public static final void uv(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final boolean uv6(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: v */
    public static long[] m22522v(@InterfaceC7396q long[] jArr, @InterfaceC7396q long[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(jArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @InterfaceC6234g
    private static final float[] v0af(float[] fArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i2);
        kotlin.jvm.internal.d2ok.kja0(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Float v5yj(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return C6144h.l8y(fArr);
    }

    public static /* synthetic */ void vahq(Object[] objArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = objArr.length;
        }
        a8p6(objArr, i2, i3);
    }

    public static /* synthetic */ void vc(short[] sArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = sArr.length;
        }
        qla(sArr, i2, i3);
    }

    public static /* synthetic */ void vddr(float[] fArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = fArr.length;
        }
        zxq(fArr, i2, i3);
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final byte[] vep5(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return zkd(bArr, i2, i3);
        }
        if (i3 <= bArr.length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(bArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + bArr.length);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger verb(float[] fArr, cyoe.x2<? super Float, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (float f2 : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Float.valueOf(f2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    public static final void vg(@InterfaceC7396q double[] dArr) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void vh(char[] cArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = cArr.length;
        }
        k4jz(cArr, i2, i3);
    }

    public static /* synthetic */ byte[] vq(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        return y2(bArr, bArr2, i2, i3, i4);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short vss1(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.ef(sArr, comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long vwb(long[] jArr, cyoe.x2<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j2 = jArr[0];
        int iHmvj = C6144h.hmvj(jArr);
        if (iHmvj == 0) {
            return Long.valueOf(j2);
        }
        R rInvoke = selector.invoke(Long.valueOf(j2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iHmvj).iterator();
        while (n5r1VarM23351p.hasNext()) {
            long j3 = jArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Long.valueOf(j3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                j2 = j3;
            }
        }
        return Long.valueOf(j2);
    }

    public static <T> void vy(@InterfaceC7396q T[] tArr, T t2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        Arrays.fill(tArr, i2, i3, t2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final boolean vyq(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ Character m22523w(char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return C6144h.b5(cArr);
    }

    @InterfaceC6234g
    private static final long[] w831(long[] jArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        kotlin.jvm.internal.d2ok.kja0(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }

    public static /* synthetic */ boolean[] was(boolean[] zArr, boolean[] zArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = zArr.length;
        }
        return mu(zArr, zArr2, i2, i3, i4);
    }

    public static final void wlev(@InterfaceC7396q double[] dArr, double d2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        Arrays.fill(dArr, i2, i3, d2);
    }

    public static /* synthetic */ long[] wo(long[] jArr, long[] jArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = jArr.length;
        }
        return m22522v(jArr, jArr2, i2, i3, i4);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double wt(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.t7(dArr, comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte wtop(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.y9i5(bArr, comparator);
    }

    @InterfaceC7396q
    public static final SortedSet<Byte> wu(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return (SortedSet) C6144h.ads1(bArr, new TreeSet());
    }

    public static final int wvg(@InterfaceC7396q int[] iArr, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return Arrays.binarySearch(iArr, i3, i4, i2);
    }

    @InterfaceC7396q
    public static final double[] wwp(@InterfaceC7396q double[] dArr, @InterfaceC7396q double[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] result = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final long[] wx16(long[] jArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return b3e(jArr, i2, i3);
        }
        if (i3 <= jArr.length) {
            long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(jArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return jArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + jArr.length);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: x */
    private static final String m22524x(double[] dArr) {
        String string = Arrays.toString(dArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @InterfaceC7396q
    public static final Boolean[] x3b(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolArr[i2] = Boolean.valueOf(zArr[i2]);
        }
        return boolArr;
    }

    @InterfaceC7396q
    public static final boolean[] x7o(@InterfaceC7396q boolean[] zArr, @InterfaceC7396q Collection<Boolean> elements) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "contentDeepEqualsNullable")
    private static final <T> boolean x9kr(T[] tArr, T[] tArr2) {
        return kotlin.internal.qrj.m22878k(1, 3, 0) ? n7h.f7l8(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character xblq(char[] cArr, cyoe.x2<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int iJ59a = C6144h.j59a(cArr);
        if (iJ59a == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = selector.invoke(Character.valueOf(c2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iJ59a).iterator();
        while (n5r1VarM23351p.hasNext()) {
            char c3 = cArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Character.valueOf(c3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c2 = c3;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c2);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Float xm(float[] fArr) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        return C6144h.ny6p(fArr);
    }

    @InterfaceC7396q
    public static final SortedSet<Short> xouc(@InterfaceC7396q short[] sArr) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        return (SortedSet) C6144h.l0e(sArr, new TreeSet());
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float xtb7(float[] fArr, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int iGto = C6144h.gto(fArr);
        if (iGto == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = selector.invoke(Float.valueOf(f2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iGto).iterator();
        while (n5r1VarM23351p.hasNext()) {
            float f3 = fArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f2 = f3;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f2);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static int[] xwq3(@InterfaceC7396q int[] iArr, @InterfaceC7396q int[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(iArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean xzl(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.p9k9(zArr, comparator);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static byte[] y2(@InterfaceC7396q byte[] bArr, @InterfaceC7396q byte[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        System.arraycopy(bArr, i3, destination, i2, i4 - i3);
        return destination;
    }

    @InterfaceC7396q
    public static final SortedSet<Character> y3(@InterfaceC7396q char[] cArr) {
        kotlin.jvm.internal.d2ok.m23075h(cArr, "<this>");
        return (SortedSet) C6144h.kff(cArr, new TreeSet());
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int y9n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @InterfaceC7396q
    public static final SortedSet<Long> ydj3(@InterfaceC7396q long[] jArr) {
        kotlin.jvm.internal.d2ok.m23075h(jArr, "<this>");
        return (SortedSet) C6144h.gb1(jArr, new TreeSet());
    }

    @InterfaceC6234g
    @InterfaceC6769y(name = "copyOfRangeInline")
    private static final float[] yl(float[] fArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        if (kotlin.internal.qrj.m22878k(1, 3, 0)) {
            return jz5(fArr, i2, i3);
        }
        if (i3 <= fArr.length) {
            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i2, i3);
            kotlin.jvm.internal.d2ok.kja0(fArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return fArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i3 + ", size: " + fArr.length);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean yp31(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.v70n(zArr, comparator);
    }

    @InterfaceC6234g
    private static final <T> T[] yqrt(T[] tArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i2);
        kotlin.jvm.internal.d2ok.kja0(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float yw(float[] fArr, cyoe.x2<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int iGto = C6144h.gto(fArr);
        if (iGto == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = selector.invoke(Float.valueOf(f2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iGto).iterator();
        while (n5r1VarM23351p.hasNext()) {
            float f3 = fArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Float.valueOf(f3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f2 = f3;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f2);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final int yz(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: z */
    public static final int m22525z(@InterfaceC7396q double[] dArr, double d2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        return Arrays.binarySearch(dArr, i2, i3, d2);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final BigInteger z1r(double[] dArr, cyoe.x2<? super Double, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        for (double d2 : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Double.valueOf(d2)));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6234g
    private static final <T> T[] z4(T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.d2ok.kja0(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    @InterfaceC7396q
    public static byte[] z4j7(@InterfaceC7396q byte[] bArr, byte b2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, length + 1);
        result[length] = b2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean z4t(boolean[] zArr, cyoe.x2<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z2 = zArr[0];
        int iRl = C6144h.rl(zArr);
        if (iRl == 0) {
            return Boolean.valueOf(z2);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iRl).iterator();
        while (n5r1VarM23351p.hasNext()) {
            boolean z3 = zArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Boolean.valueOf(z3));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z2 = z3;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z2);
    }

    @InterfaceC7396q
    public static short[] z5(@InterfaceC7396q short[] sArr, short s2) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, length + 1);
        result[length] = s2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short z617(short[] sArr, cyoe.x2<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(sArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s2 = sArr[0];
        int iOrxw = C6144h.orxw(sArr);
        if (iOrxw == 0) {
            return Short.valueOf(s2);
        }
        R rInvoke = selector.invoke(Short.valueOf(s2));
        n5r1 n5r1VarM23351p = new kotlin.ranges.x2(1, iOrxw).iterator();
        while (n5r1VarM23351p.hasNext()) {
            short s3 = sArr[n5r1VarM23351p.nextInt()];
            R rInvoke2 = selector.invoke(Short.valueOf(s3));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s2 = s3;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s2);
    }

    @InterfaceC7396q
    public static final boolean[] z8(@InterfaceC7396q boolean[] zArr, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, length + 1);
        result[length] = z2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final BigDecimal zah1(double[] dArr, cyoe.x2<? super Double, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(dArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        for (double d2 : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Double.valueOf(d2)));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte zff0(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return C6144h.ua(bArr, comparator);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "copyOfRange")
    public static byte[] zkd(@InterfaceC7396q byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        qrj.zy(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    public static final void zma(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final String zp(char[] cArr) {
        String string = Arrays.toString(cArr);
        kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
        return string;
    }

    @InterfaceC6234g
    private static final byte[] zsr0(byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @InterfaceC7396q
    public static final Byte[] zt(@InterfaceC7396q byte[] bArr) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = Byte.valueOf(bArr[i2]);
        }
        return bArr2;
    }

    @InterfaceC7396q
    public static final float[] zuf(@InterfaceC7396q float[] fArr, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, length + 1);
        result[length] = f2;
        kotlin.jvm.internal.d2ok.kja0(result, "result");
        return result;
    }

    @InterfaceC7396q
    public static final List<Boolean> zurt(@InterfaceC7396q boolean[] zArr) {
        kotlin.jvm.internal.d2ok.m23075h(zArr, "<this>");
        return new f7l8(zArr);
    }

    @InterfaceC6234g
    private static final int zwy(int[] iArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iArr, "<this>");
        return iArr[i2];
    }

    public static final void zxq(@InterfaceC7396q float[] fArr, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(fArr, "<this>");
        Arrays.sort(fArr, i2, i3);
    }
}

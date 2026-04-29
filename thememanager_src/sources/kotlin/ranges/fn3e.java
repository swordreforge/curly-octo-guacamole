package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.random.AbstractC6332g;
import kotlin.ranges.C6345k;
import kotlin.ranges.C6349p;
import kotlin.ranges.qrj;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
public class fn3e extends C6344i {
    @InterfaceC7396q
    /* JADX INFO: renamed from: a */
    public static final C6349p m23291a(short s2, byte b2) {
        return C6349p.f36534g.m23354k(s2, b2, -1);
    }

    @InterfaceC7395n
    public static final Short a5id(double d2) {
        boolean z2 = false;
        if (-32768.0d <= d2 && d2 <= 32767.0d) {
            z2 = true;
        }
        if (z2) {
            return Short.valueOf((short) d2);
        }
        return null;
    }

    public static final short a9(short s2, short s3) {
        return s2 > s3 ? s3 : s2;
    }

    @InterfaceC7396q
    public static final C6349p a98o(int i2, short s2) {
        return C6349p.f36534g.m23354k(i2, s2, -1);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: b */
    public static final C6349p m23292b(byte b2, short s2) {
        return C6349p.f36534g.m23354k(b2, s2, -1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Character b3e(@InterfaceC7396q zy zyVar, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(zyVar, "<this>");
        d2ok.m23075h(random, "random");
        if (zyVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(zyVar.f7l8(), zyVar.m23324y() + 1));
    }

    @InterfaceC7396q
    public static final x2 b8(int i2, byte b2) {
        return new x2(i2, b2 - 1);
    }

    @InterfaceC7396q
    public static final x2 b9ub(byte b2, short s2) {
        return new x2(b2, s2 - 1);
    }

    @InterfaceC7395n
    public static final Byte bap7(long j2) {
        if (new kja0(-128L, 127L).x2(j2)) {
            return Byte.valueOf((byte) j2);
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final Integer bek6(x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        return cv06(x2Var, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final C6349p bf2(int i2, byte b2) {
        return C6349p.f36534g.m23354k(i2, b2, -1);
    }

    @InterfaceC7396q
    public static final qrj bo(long j2, short s2) {
        return qrj.f36540g.m23361k(j2, s2, -1L);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "longRangeContains")
    public static final boolean bwp(@InterfaceC7396q ki<Long> kiVar, short s2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Long.valueOf(s2));
    }

    @yz(version = "1.3")
    public static final int bz2(@InterfaceC7396q x2 x2Var, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(random, "random");
        try {
            return kotlin.random.f7l8.m23275y(random, x2Var);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: c */
    private static final boolean m23293c(kja0 kja0Var, byte b2) {
        d2ok.m23075h(kja0Var, "<this>");
        return etdu(kja0Var, b2);
    }

    @yz(version = "1.7")
    public static final char c8jq(@InterfaceC7396q C6345k c6345k) {
        d2ok.m23075h(c6345k, "<this>");
        if (!c6345k.isEmpty()) {
            return c6345k.f7l8();
        }
        throw new NoSuchElementException("Progression " + c6345k + " is empty.");
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "byteRangeContains")
    public static final boolean cdj(@InterfaceC7396q ki<Byte> kiVar, short s2) {
        d2ok.m23075h(kiVar, "<this>");
        Byte bH4b = h4b(s2);
        if (bH4b != null) {
            return kiVar.contains(bH4b);
        }
        return false;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "longRangeContains")
    public static final /* synthetic */ boolean cfr(f7l8 f7l8Var, float f2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Long lVy = vy(f2);
        if (lVy != null) {
            return f7l8Var.contains(lVy);
        }
        return false;
    }

    @InterfaceC7396q
    public static final qrj ch(byte b2, long j2) {
        return qrj.f36540g.m23361k(b2, j2, -1L);
    }

    @InterfaceC7396q
    public static final x2 cnbm(byte b2, int i2) {
        return i2 <= Integer.MIN_VALUE ? x2.f36553y.m23368k() : new x2(b2, i2 - 1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Integer cv06(@InterfaceC7396q x2 x2Var, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(random, "random");
        if (x2Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.f7l8.m23275y(random, x2Var));
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "floatRangeContains")
    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean m23294d(f7l8 f7l8Var, byte b2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Float.valueOf(b2));
    }

    public static long d2ok(long j2, @InterfaceC7396q f7l8<Long> range) {
        d2ok.m23075h(range, "range");
        if (range instanceof InterfaceC6342g) {
            return ((Number) m23304r(Long.valueOf(j2), (InterfaceC6342g) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j2 < ((Number) range.mo2951k()).longValue() ? ((Number) range.mo2951k()).longValue() : j2 > ((Number) range.zy()).longValue() ? ((Number) range.zy()).longValue() : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static int d3(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    @InterfaceC6769y(name = "intRangeContains")
    public static boolean d8wk(@InterfaceC7396q f7l8<Integer> f7l8Var, long j2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Integer numE5 = e5(j2);
        if (numE5 != null) {
            return f7l8Var.contains(numE5);
        }
        return false;
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> T dd(@InterfaceC7396q T t2, @InterfaceC7396q f7l8<T> range) {
        d2ok.m23075h(t2, "<this>");
        d2ok.m23075h(range, "range");
        if (range instanceof InterfaceC6342g) {
            return (T) m23304r(t2, (InterfaceC6342g) range);
        }
        if (!range.isEmpty()) {
            return t2.compareTo(range.mo2951k()) < 0 ? (T) range.mo2951k() : t2.compareTo(range.zy()) > 0 ? (T) range.zy() : t2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC6769y(name = "shortRangeContains")
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final boolean m28289do(@InterfaceC7396q f7l8<Short> f7l8Var, int i2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Short shGcp = gcp(i2);
        if (shGcp != null) {
            return f7l8Var.contains(shGcp);
        }
        return false;
    }

    @yz(version = "1.7")
    public static final long dr(@InterfaceC7396q qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        if (!qrjVar.isEmpty()) {
            return qrjVar.f7l8();
        }
        throw new NoSuchElementException("Progression " + qrjVar + " is empty.");
    }

    @InterfaceC7395n
    public static final Long dxef(double d2) {
        boolean z2 = false;
        if (-9.223372036854776E18d <= d2 && d2 <= 9.223372036854776E18d) {
            z2 = true;
        }
        if (z2) {
            return Long.valueOf((long) d2);
        }
        return null;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "doubleRangeContains")
    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ boolean m23295e(f7l8 f7l8Var, byte b2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Double.valueOf(b2));
    }

    @InterfaceC7395n
    public static final Integer e5(long j2) {
        if (new kja0(-2147483648L, 2147483647L).x2(j2)) {
            return Integer.valueOf((int) j2);
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "shortRangeContains")
    public static final boolean ebn(@InterfaceC7396q ki<Short> kiVar, byte b2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Short.valueOf(b2));
    }

    @InterfaceC7396q
    public static final C6345k ek5k(char c2, char c3) {
        return C6345k.f36510g.m23325k(c2, c3, -1);
    }

    public static long eqxt(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    @InterfaceC6769y(name = "longRangeContains")
    public static final boolean etdu(@InterfaceC7396q f7l8<Long> f7l8Var, byte b2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Long.valueOf(b2));
    }

    @InterfaceC7396q
    public static final x2 ew(short s2, byte b2) {
        return new x2(s2, b2 - 1);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: f */
    private static final boolean m23296f(x2 x2Var, short s2) {
        d2ok.m23075h(x2Var, "<this>");
        return g1(x2Var, s2);
    }

    public static int fn3e(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "floatRangeContains")
    public static final /* synthetic */ boolean fnq8(f7l8 f7l8Var, short s2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Float.valueOf(s2));
    }

    public static final byte fti(byte b2, byte b3, byte b4) {
        if (b3 <= b4) {
            return b2 < b3 ? b3 : b2 > b4 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b4) + " is less than minimum " + ((int) b3) + '.');
    }

    public static final short fu4(short s2, short s3) {
        return s2 < s3 ? s3 : s2;
    }

    @InterfaceC6769y(name = "intRangeContains")
    public static final boolean g1(@InterfaceC7396q f7l8<Integer> f7l8Var, short s2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Integer.valueOf(s2));
    }

    @InterfaceC7395n
    public static final Integer ga(float f2) {
        boolean z2 = false;
        if (-2.1474836E9f <= f2 && f2 <= 2.1474836E9f) {
            z2 = true;
        }
        if (z2) {
            return Integer.valueOf((int) f2);
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "intRangeContains")
    public static final boolean gbni(@InterfaceC7396q ki<Integer> kiVar, long j2) {
        d2ok.m23075h(kiVar, "<this>");
        Integer numE5 = e5(j2);
        if (numE5 != null) {
            return kiVar.contains(numE5);
        }
        return false;
    }

    @yz(version = "1.3")
    public static final char gc3c(@InterfaceC7396q zy zyVar, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(zyVar, "<this>");
        d2ok.m23075h(random, "random");
        try {
            return (char) random.nextInt(zyVar.f7l8(), zyVar.m23324y() + 1);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @InterfaceC7395n
    public static final Short gcp(int i2) {
        if (new x2(-32768, 32767).x2(i2)) {
            return Short.valueOf((short) i2);
        }
        return null;
    }

    public static final float gvn7(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    @yz(version = "1.7")
    public static final int gyi(@InterfaceC7396q C6349p c6349p) {
        d2ok.m23075h(c6349p, "<this>");
        if (!c6349p.isEmpty()) {
            return c6349p.f7l8();
        }
        throw new NoSuchElementException("Progression " + c6349p + " is empty.");
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "byteRangeContains")
    /* JADX INFO: renamed from: h */
    public static final boolean m23297h(@InterfaceC7396q ki<Byte> kiVar, long j2) {
        d2ok.m23075h(kiVar, "<this>");
        Byte bBap7 = bap7(j2);
        if (bBap7 != null) {
            return kiVar.contains(bBap7);
        }
        return false;
    }

    @InterfaceC7395n
    public static final Byte h4b(short s2) {
        if (g1(new x2(-128, 127), s2)) {
            return Byte.valueOf((byte) s2);
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final Long h7am(kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        return vep5(kja0Var, AbstractC6332g.Default);
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "doubleRangeContains")
    public static final /* synthetic */ boolean hb(f7l8 f7l8Var, int i2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Double.valueOf(i2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final boolean hyr(x2 x2Var, Integer num) {
        d2ok.m23075h(x2Var, "<this>");
        return num != null && x2Var.x2(num.intValue());
    }

    /* JADX INFO: renamed from: i */
    public static float m23298i(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    @InterfaceC7396q
    public static C6349p i1(int i2, int i3) {
        return C6349p.f36534g.m23354k(i2, i3, -1);
    }

    @yz(version = "1.7")
    public static final int i9jn(@InterfaceC7396q C6349p c6349p) {
        d2ok.m23075h(c6349p, "<this>");
        if (!c6349p.isEmpty()) {
            return c6349p.m23353y();
        }
        throw new NoSuchElementException("Progression " + c6349p + " is empty.");
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "shortRangeContains")
    public static final boolean ij(@InterfaceC7396q ki<Short> kiVar, long j2) {
        d2ok.m23075h(kiVar, "<this>");
        Short shOki = oki(j2);
        if (shOki != null) {
            return kiVar.contains(shOki);
        }
        return false;
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final Long ikck(@InterfaceC7396q qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        if (qrjVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(qrjVar.f7l8());
    }

    @InterfaceC7396q
    public static final x2 ix(short s2, int i2) {
        return i2 <= Integer.MIN_VALUE ? x2.f36553y.m23368k() : new x2(s2, i2 - 1);
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "shortRangeContains")
    public static final /* synthetic */ boolean ixz(f7l8 f7l8Var, float f2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Short shLw = lw(f2);
        if (shLw != null) {
            return f7l8Var.contains(shLw);
        }
        return false;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "doubleRangeContains")
    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ boolean m23299j(f7l8 f7l8Var, long j2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Double.valueOf(j2));
    }

    @InterfaceC7396q
    public static final C6349p jbh(@InterfaceC7396q C6349p c6349p) {
        d2ok.m23075h(c6349p, "<this>");
        return C6349p.f36534g.m23354k(c6349p.m23353y(), c6349p.f7l8(), -c6349p.m23352s());
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> T jk(@InterfaceC7396q T t2, @InterfaceC7396q T maximumValue) {
        d2ok.m23075h(t2, "<this>");
        d2ok.m23075h(maximumValue, "maximumValue");
        return t2.compareTo(maximumValue) > 0 ? maximumValue : t2;
    }

    public static final double jp0y(double d2, double d4, double d5) {
        if (d4 <= d5) {
            return d2 < d4 ? d4 : d2 > d5 ? d5 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d5 + " is less than minimum " + d4 + '.');
    }

    @yz(version = "1.3")
    public static final long jz5(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(random, "random");
        try {
            return kotlin.random.f7l8.m23274s(random, kja0Var);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "longRangeContains")
    public static final boolean kcsr(@InterfaceC7396q ki<Long> kiVar, int i2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Long.valueOf(i2));
    }

    public static final byte ki(byte b2, byte b3) {
        return b2 < b3 ? b3 : b2;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "byteRangeContains")
    public static final boolean kja0(@InterfaceC7396q ki<Byte> kiVar, int i2) {
        d2ok.m23075h(kiVar, "<this>");
        Byte bLh = lh(i2);
        if (bLh != null) {
            return kiVar.contains(bLh);
        }
        return false;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @yz(version = "1.4")
    private static final Character ktq(zy zyVar) {
        d2ok.m23075h(zyVar, "<this>");
        return b3e(zyVar, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final x2 kx3(short s2, short s3) {
        return new x2(s2, s3 - 1);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: l */
    private static final boolean m23300l(x2 x2Var, byte b2) {
        d2ok.m23075h(x2Var, "<this>");
        return qo(x2Var, b2);
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "byteRangeContains")
    public static final /* synthetic */ boolean ld6(f7l8 f7l8Var, float f2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Byte bNgy = ngy(f2);
        if (bNgy != null) {
            return f7l8Var.contains(bNgy);
        }
        return false;
    }

    @InterfaceC7395n
    public static final Byte lh(int i2) {
        if (new x2(-128, 127).x2(i2)) {
            return Byte.valueOf((byte) i2);
        }
        return null;
    }

    @InterfaceC6234g
    private static final boolean lrht(kja0 kja0Var, int i2) {
        d2ok.m23075h(kja0Var, "<this>");
        return w831(kja0Var, i2);
    }

    @yz(version = "1.7")
    public static final long ltg8(@InterfaceC7396q qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        if (!qrjVar.isEmpty()) {
            return qrjVar.m23360y();
        }
        throw new NoSuchElementException("Progression " + qrjVar + " is empty.");
    }

    @InterfaceC7396q
    public static final qrj lv5(long j2, byte b2) {
        return qrj.f36540g.m23361k(j2, b2, -1L);
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> T lvui(@InterfaceC7396q T t2, @InterfaceC7395n T t3, @InterfaceC7395n T t4) {
        d2ok.m23075h(t2, "<this>");
        if (t3 == null || t4 == null) {
            if (t3 != null && t2.compareTo(t3) < 0) {
                return t3;
            }
            if (t4 != null && t2.compareTo(t4) > 0) {
                return t4;
            }
        } else {
            if (t3.compareTo(t4) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t4 + " is less than minimum " + t3 + '.');
            }
            if (t2.compareTo(t3) < 0) {
                return t3;
            }
            if (t2.compareTo(t4) > 0) {
                return t4;
            }
        }
        return t2;
    }

    @InterfaceC7395n
    public static final Short lw(float f2) {
        boolean z2 = false;
        if (-32768.0f <= f2 && f2 <= 32767.0f) {
            z2 = true;
        }
        if (z2) {
            return Short.valueOf((short) f2);
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "doubleRangeContains")
    /* JADX INFO: renamed from: m */
    public static final boolean m23301m(@InterfaceC7396q ki<Double> kiVar, float f2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Double.valueOf(f2));
    }

    @InterfaceC7396q
    public static final kja0 m2t(int i2, long j2) {
        return j2 <= Long.MIN_VALUE ? kja0.f36515y.m23328k() : new kja0(i2, j2 - 1);
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final Integer m4(@InterfaceC7396q C6349p c6349p) {
        d2ok.m23075h(c6349p, "<this>");
        if (c6349p.isEmpty()) {
            return null;
        }
        return Integer.valueOf(c6349p.m23353y());
    }

    @InterfaceC7396q
    public static final x2 m58i(byte b2, byte b3) {
        return new x2(b2, b3 - 1);
    }

    @InterfaceC7396q
    public static final C6345k mbx(@InterfaceC7396q C6345k c6345k) {
        d2ok.m23075h(c6345k, "<this>");
        return C6345k.f36510g.m23325k(c6345k.m23324y(), c6345k.f7l8(), -c6345k.m23323s());
    }

    public static long mcp(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    @InterfaceC6769y(name = "floatRangeContains")
    public static final boolean mu(@InterfaceC7396q f7l8<Float> f7l8Var, double d2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Float.valueOf((float) d2));
    }

    @InterfaceC7396q
    public static final qrj n2t(@InterfaceC7396q qrj qrjVar, long j2) {
        d2ok.m23075h(qrjVar, "<this>");
        C6344i.m23317k(j2 > 0, Long.valueOf(j2));
        qrj.C6351k c6351k = qrj.f36540g;
        long jF7l8 = qrjVar.f7l8();
        long jM23360y = qrjVar.m23360y();
        if (qrjVar.m23359s() <= 0) {
            j2 = -j2;
        }
        return c6351k.m23361k(jF7l8, jM23360y, j2);
    }

    @InterfaceC6234g
    private static final boolean n5r1(x2 x2Var, long j2) {
        d2ok.m23075h(x2Var, "<this>");
        return d8wk(x2Var, j2);
    }

    @InterfaceC6769y(name = "byteRangeContains")
    public static final boolean n7h(@InterfaceC7396q f7l8<Byte> f7l8Var, short s2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Byte bH4b = h4b(s2);
        if (bH4b != null) {
            return f7l8Var.contains(bH4b);
        }
        return false;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final boolean ncyb(zy zyVar, Character ch2) {
        d2ok.m23075h(zyVar, "<this>");
        return ch2 != null && zyVar.x2(ch2.charValue());
    }

    @InterfaceC7395n
    public static final Byte ngy(float f2) {
        boolean z2 = false;
        if (-128.0f <= f2 && f2 <= 127.0f) {
            z2 = true;
        }
        if (z2) {
            return Byte.valueOf((byte) f2);
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> T ni7(@InterfaceC7396q T t2, @InterfaceC7396q T minimumValue) {
        d2ok.m23075h(t2, "<this>");
        d2ok.m23075h(minimumValue, "minimumValue");
        return t2.compareTo(minimumValue) < 0 ? minimumValue : t2;
    }

    @InterfaceC7396q
    public static x2 nme(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? x2.f36553y.m23368k() : new x2(i2, i3 - 1);
    }

    @InterfaceC7396q
    public static final qrj nmn5(int i2, long j2) {
        return qrj.f36540g.m23361k(i2, j2, -1L);
    }

    @InterfaceC6769y(name = "doubleRangeContains")
    public static final boolean nn86(@InterfaceC7396q f7l8<Double> f7l8Var, float f2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Double.valueOf(f2));
    }

    @InterfaceC7396q
    public static final kja0 nnh(short s2, long j2) {
        return j2 <= Long.MIN_VALUE ? kja0.f36515y.m23328k() : new kja0(s2, j2 - 1);
    }

    @InterfaceC7396q
    public static final C6345k nsb(@InterfaceC7396q C6345k c6345k, int i2) {
        d2ok.m23075h(c6345k, "<this>");
        C6344i.m23317k(i2 > 0, Integer.valueOf(i2));
        C6345k.k kVar = C6345k.f36510g;
        char cF7l8 = c6345k.f7l8();
        char cM23324y = c6345k.m23324y();
        if (c6345k.m23323s() <= 0) {
            i2 = -i2;
        }
        return kVar.m23325k(cF7l8, cM23324y, i2);
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "doubleRangeContains")
    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ boolean m23302o(f7l8 f7l8Var, short s2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Double.valueOf(s2));
    }

    @InterfaceC7396q
    public static final zy o05(char c2, char c3) {
        return d2ok.m23076i(c3, 0) <= 0 ? zy.f36565y.m23376k() : new zy(c2, (char) (c3 - 1));
    }

    public static final double o1t(double d2, double d4) {
        return d2 > d4 ? d4 : d2;
    }

    public static final int oc(int i2, @InterfaceC7396q f7l8<Integer> range) {
        d2ok.m23075h(range, "range");
        if (range instanceof InterfaceC6342g) {
            return ((Number) m23304r(Integer.valueOf(i2), (InterfaceC6342g) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i2 < ((Number) range.mo2951k()).intValue() ? ((Number) range.mo2951k()).intValue() : i2 > ((Number) range.zy()).intValue() ? ((Number) range.zy()).intValue() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC7395n
    public static final Short oki(long j2) {
        if (new kja0(-32768L, 32767L).x2(j2)) {
            return Short.valueOf((short) j2);
        }
        return null;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "byteRangeContains")
    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ boolean m23303p(f7l8 f7l8Var, double d2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Byte bPjz9 = pjz9(d2);
        if (bPjz9 != null) {
            return f7l8Var.contains(bPjz9);
        }
        return false;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "shortRangeContains")
    public static final boolean pc(@InterfaceC7396q ki<Short> kiVar, int i2) {
        d2ok.m23075h(kiVar, "<this>");
        Short shGcp = gcp(i2);
        if (shGcp != null) {
            return kiVar.contains(shGcp);
        }
        return false;
    }

    @InterfaceC7395n
    public static final Byte pjz9(double d2) {
        boolean z2 = false;
        if (-128.0d <= d2 && d2 <= 127.0d) {
            z2 = true;
        }
        if (z2) {
            return Byte.valueOf((byte) d2);
        }
        return null;
    }

    @InterfaceC7396q
    public static final kja0 ps(long j2, int i2) {
        return new kja0(j2, ((long) i2) - 1);
    }

    @yz(version = "1.7")
    public static final char py(@InterfaceC7396q C6345k c6345k) {
        d2ok.m23075h(c6345k, "<this>");
        if (!c6345k.isEmpty()) {
            return c6345k.m23324y();
        }
        throw new NoSuchElementException("Progression " + c6345k + " is empty.");
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "floatRangeContains")
    public static final /* synthetic */ boolean qkj8(f7l8 f7l8Var, long j2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Float.valueOf(j2));
    }

    @InterfaceC6769y(name = "intRangeContains")
    public static final boolean qo(@InterfaceC7396q f7l8<Integer> f7l8Var, byte b2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Integer.valueOf(b2));
    }

    @InterfaceC6769y(name = "byteRangeContains")
    public static final boolean qrj(@InterfaceC7396q f7l8<Byte> f7l8Var, long j2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Byte bBap7 = bap7(j2);
        if (bBap7 != null) {
            return f7l8Var.contains(bBap7);
        }
        return false;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    /* JADX INFO: renamed from: r */
    public static final <T extends Comparable<? super T>> T m23304r(@InterfaceC7396q T t2, @InterfaceC7396q InterfaceC6342g<T> range) {
        d2ok.m23075h(t2, "<this>");
        d2ok.m23075h(range, "range");
        if (!range.isEmpty()) {
            return (!range.toq(t2, range.mo2951k()) || range.toq(range.mo2951k(), t2)) ? (!range.toq(range.zy(), t2) || range.toq(t2, range.zy())) ? t2 : range.zy() : range.mo2951k();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC7396q
    public static final x2 r25n(int i2, short s2) {
        return new x2(i2, s2 - 1);
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final Character r8s8(@InterfaceC7396q C6345k c6345k) {
        d2ok.m23075h(c6345k, "<this>");
        if (c6345k.isEmpty()) {
            return null;
        }
        return Character.valueOf(c6345k.m23324y());
    }

    @InterfaceC7396q
    public static final kja0 ra(long j2, short s2) {
        return new kja0(j2, ((long) s2) - 1);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final char se(zy zyVar) {
        d2ok.m23075h(zyVar, "<this>");
        return gc3c(zyVar, AbstractC6332g.Default);
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "longRangeContains")
    public static final /* synthetic */ boolean sok(f7l8 f7l8Var, double d2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Long lDxef = dxef(d2);
        if (lDxef != null) {
            return f7l8Var.contains(lDxef);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static int m23305t(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    @InterfaceC7396q
    public static final qrj t8iq(long j2, int i2) {
        return qrj.f36540g.m23361k(j2, i2, -1L);
    }

    public static final double t8r(double d2, double d4) {
        return d2 < d4 ? d4 : d2;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "intRangeContains")
    public static final /* synthetic */ boolean tfm(f7l8 f7l8Var, double d2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Integer numWlev = wlev(d2);
        if (numWlev != null) {
            return f7l8Var.contains(numWlev);
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: u */
    public static final qrj m23306u(long j2, long j3) {
        return qrj.f36540g.m23361k(j2, j3, -1L);
    }

    @InterfaceC7396q
    public static final kja0 u38j(long j2, byte b2) {
        return new kja0(j2, ((long) b2) - 1);
    }

    @InterfaceC6769y(name = "shortRangeContains")
    public static final boolean uc(@InterfaceC7396q f7l8<Short> f7l8Var, byte b2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Short.valueOf(b2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final long uj2j(kja0 kja0Var) {
        d2ok.m23075h(kja0Var, "<this>");
        return jz5(kja0Var, AbstractC6332g.Default);
    }

    @InterfaceC6769y(name = "shortRangeContains")
    public static final boolean ukdy(@InterfaceC7396q f7l8<Short> f7l8Var, long j2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Short shOki = oki(j2);
        if (shOki != null) {
            return f7l8Var.contains(shOki);
        }
        return false;
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final boolean uv6(kja0 kja0Var, Long l2) {
        d2ok.m23075h(kja0Var, "<this>");
        return l2 != null && kja0Var.x2(l2.longValue());
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    /* JADX INFO: renamed from: v */
    public static final Integer m23307v(@InterfaceC7396q C6349p c6349p) {
        d2ok.m23075h(c6349p, "<this>");
        if (c6349p.isEmpty()) {
            return null;
        }
        return Integer.valueOf(c6349p.f7l8());
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final Long v0af(@InterfaceC7396q qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        if (qrjVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(qrjVar.m23360y());
    }

    @InterfaceC7396q
    public static final kja0 v5yj(long j2, long j3) {
        return j3 <= Long.MIN_VALUE ? kja0.f36515y.m23328k() : new kja0(j2, j3 - 1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final Long vep5(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q AbstractC6332g random) {
        d2ok.m23075h(kja0Var, "<this>");
        d2ok.m23075h(random, "random");
        if (kja0Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.f7l8.m23274s(random, kja0Var));
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "floatRangeContains")
    public static final /* synthetic */ boolean vq(f7l8 f7l8Var, int i2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Float.valueOf(i2));
    }

    @InterfaceC7395n
    public static final Long vy(float f2) {
        boolean z2 = false;
        if (-9.223372E18f <= f2 && f2 <= 9.223372E18f) {
            z2 = true;
        }
        if (z2) {
            return Long.valueOf((long) f2);
        }
        return null;
    }

    @InterfaceC6234g
    private static final boolean vyq(kja0 kja0Var, short s2) {
        d2ok.m23075h(kja0Var, "<this>");
        return z4(kja0Var, s2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: w */
    public static final kja0 m23308w(byte b2, long j2) {
        return j2 <= Long.MIN_VALUE ? kja0.f36515y.m23328k() : new kja0(b2, j2 - 1);
    }

    @InterfaceC6769y(name = "longRangeContains")
    public static final boolean w831(@InterfaceC7396q f7l8<Long> f7l8Var, int i2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Long.valueOf(i2));
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "intRangeContains")
    public static final boolean was(@InterfaceC7396q ki<Integer> kiVar, byte b2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Integer.valueOf(b2));
    }

    @InterfaceC7395n
    public static final Integer wlev(double d2) {
        boolean z2 = false;
        if (-2.147483648E9d <= d2 && d2 <= 2.147483647E9d) {
            z2 = true;
        }
        if (z2) {
            return Integer.valueOf((int) d2);
        }
        return null;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "intRangeContains")
    public static final /* synthetic */ boolean wo(f7l8 f7l8Var, float f2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Integer numGa = ga(f2);
        if (numGa != null) {
            return f7l8Var.contains(numGa);
        }
        return false;
    }

    public static float wvg(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    @kotlin.x2(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @kotlin.ld6(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC6769y(name = "shortRangeContains")
    public static final /* synthetic */ boolean wx16(f7l8 f7l8Var, double d2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Short shA5id = a5id(d2);
        if (shA5id != null) {
            return f7l8Var.contains(shA5id);
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: x */
    public static final C6349p m23309x(short s2, short s3) {
        return C6349p.f36534g.m23354k(s2, s3, -1);
    }

    @InterfaceC6769y(name = "byteRangeContains")
    public static final boolean x2(@InterfaceC7396q f7l8<Byte> f7l8Var, int i2) {
        d2ok.m23075h(f7l8Var, "<this>");
        Byte bLh = lh(i2);
        if (bLh != null) {
            return f7l8Var.contains(bLh);
        }
        return false;
    }

    public static final short x9kr(short s2, short s3, short s4) {
        if (s3 <= s4) {
            return s2 < s3 ? s3 : s2 > s4 ? s4 : s2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s4) + " is less than minimum " + ((int) s3) + '.');
    }

    @InterfaceC7395n
    @yz(version = "1.7")
    public static final Character xwq3(@InterfaceC7396q C6345k c6345k) {
        d2ok.m23075h(c6345k, "<this>");
        if (c6345k.isEmpty()) {
            return null;
        }
        return Character.valueOf(c6345k.f7l8());
    }

    @InterfaceC7396q
    public static final qrj y2(short s2, long j2) {
        return qrj.f36540g.m23361k(s2, j2, -1L);
    }

    @InterfaceC7396q
    public static final C6349p y9n(byte b2, int i2) {
        return C6349p.f36534g.m23354k(b2, i2, -1);
    }

    @InterfaceC7396q
    public static final qrj yl(@InterfaceC7396q qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return qrj.f36540g.m23361k(qrjVar.m23360y(), qrjVar.f7l8(), -qrjVar.m23359s());
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "longRangeContains")
    public static final boolean yqrt(@InterfaceC7396q ki<Long> kiVar, byte b2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Long.valueOf(b2));
    }

    @InterfaceC7396q
    public static final C6349p yz(byte b2, byte b3) {
        return C6349p.f36534g.m23354k(b2, b3, -1);
    }

    /* JADX INFO: renamed from: z */
    public static final byte m23310z(byte b2, byte b3) {
        return b2 > b3 ? b3 : b2;
    }

    @InterfaceC6769y(name = "longRangeContains")
    public static final boolean z4(@InterfaceC7396q f7l8<Long> f7l8Var, short s2) {
        d2ok.m23075h(f7l8Var, "<this>");
        return f7l8Var.contains(Long.valueOf(s2));
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final int zkd(x2 x2Var) {
        d2ok.m23075h(x2Var, "<this>");
        return bz2(x2Var, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final C6349p zp(short s2, int i2) {
        return C6349p.f36534g.m23354k(s2, i2, -1);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @yz(version = "1.9")
    @InterfaceC6769y(name = "intRangeContains")
    public static final boolean zsr0(@InterfaceC7396q ki<Integer> kiVar, short s2) {
        d2ok.m23075h(kiVar, "<this>");
        return kiVar.contains(Integer.valueOf(s2));
    }

    public static long zurt(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    @InterfaceC7396q
    public static C6349p zwy(@InterfaceC7396q C6349p c6349p, int i2) {
        d2ok.m23075h(c6349p, "<this>");
        C6344i.m23317k(i2 > 0, Integer.valueOf(i2));
        C6349p.k kVar = C6349p.f36534g;
        int iF7l8 = c6349p.f7l8();
        int iM23353y = c6349p.m23353y();
        if (c6349p.m23352s() <= 0) {
            i2 = -i2;
        }
        return kVar.m23354k(iF7l8, iM23353y, i2);
    }
}

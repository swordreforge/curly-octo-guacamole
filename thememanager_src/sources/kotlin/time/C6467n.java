package kotlin.time;

import cyoe.InterfaceC5979h;
import kotlin.comparisons.C6190y;
import kotlin.hb;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.math.C6321q;
import kotlin.nn86;
import kotlin.ranges.fn3e;
import kotlin.text.fti;
import kotlin.yz;
import l05.InterfaceC6761g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlin.time.n */
/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {x2.class})
@lv5({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
@InterfaceC6761g
@yz(version = "1.6")
public final class C6467n implements Comparable<C6467n> {

    /* JADX INFO: renamed from: k */
    private final long f36745k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f36743q = new k(null);

    /* JADX INFO: renamed from: n */
    private static final long f36742n = x2(0);

    /* JADX INFO: renamed from: g */
    private static final long f36741g = f7l8.m23675p(f7l8.f81943zy);

    /* JADX INFO: renamed from: y */
    private static final long f36744y = f7l8.m23675p(-4611686018427387903L);

    /* JADX INFO: renamed from: kotlin.time.n$k */
    /* JADX INFO: compiled from: Duration.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        private final long a9(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.MINUTES);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m23721c(long j2) {
        }

        private final long d2ok(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.NANOSECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void d3(long j2) {
        }

        @InterfaceC6234g
        public static /* synthetic */ void dd(int i2) {
        }

        private final long eqxt(double d2) {
            return f7l8.a98o(d2, EnumC6474y.NANOSECONDS);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m23722f(int i2) {
        }

        private final long f7l8(long j2) {
            return f7l8.zp(j2, EnumC6474y.DAYS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void fn3e(double d2) {
        }

        private final long fti(long j2) {
            return f7l8.zp(j2, EnumC6474y.MINUTES);
        }

        private final long fu4(double d2) {
            return f7l8.a98o(d2, EnumC6474y.MILLISECONDS);
        }

        /* JADX INFO: renamed from: g */
        private final long m23723g(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.DAYS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void gvn7(int i2) {
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m23724h(long j2) {
        }

        @InterfaceC6234g
        public static /* synthetic */ void hyr(double d2) {
        }

        /* JADX INFO: renamed from: i */
        private final long m23725i(long j2) {
            return f7l8.zp(j2, EnumC6474y.MICROSECONDS);
        }

        private final long jk(double d2) {
            return f7l8.a98o(d2, EnumC6474y.MINUTES);
        }

        @InterfaceC6234g
        public static /* synthetic */ void jp0y(double d2) {
        }

        private final long ki(double d2) {
            return f7l8.a98o(d2, EnumC6474y.MICROSECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void kja0(int i2) {
        }

        /* JADX INFO: renamed from: l */
        private final long m23726l(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.SECONDS);
        }

        private final long ld6(double d2) {
            return f7l8.a98o(d2, EnumC6474y.HOURS);
        }

        private final long lvui(long j2) {
            return f7l8.zp(j2, EnumC6474y.NANOSECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void mcp(long j2) {
        }

        /* JADX INFO: renamed from: n */
        private final long m23727n(double d2) {
            return f7l8.a98o(d2, EnumC6474y.DAYS);
        }

        private final long n5r1(long j2) {
            return f7l8.zp(j2, EnumC6474y.SECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void n7h(double d2) {
        }

        private final long ncyb(double d2) {
            return f7l8.a98o(d2, EnumC6474y.SECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void ni7(long j2) {
        }

        private final long o1t(long j2) {
            return f7l8.zp(j2, EnumC6474y.MILLISECONDS);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m23728p(long j2) {
        }

        private final long qrj(long j2) {
            return f7l8.zp(j2, EnumC6474y.HOURS);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m23729r(double d2) {
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m23730s(int i2) {
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: t */
        public static /* synthetic */ void m23731t(int i2) {
        }

        private final long t8r(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.MICROSECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void wvg(double d2) {
        }

        private final long x2(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.HOURS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void x9kr(long j2) {
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: y */
        public static /* synthetic */ void m23732y(double d2) {
        }

        /* JADX INFO: renamed from: z */
        private final long m23733z(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.MILLISECONDS);
        }

        @InterfaceC6234g
        public static /* synthetic */ void zurt(int i2) {
        }

        /* JADX INFO: renamed from: a */
        public final long m23734a(@InterfaceC7396q String value) {
            d2ok.m23075h(value, "value");
            try {
                return f7l8.ek5k(value, false);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e2);
            }
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long a98o(long j2) {
            return f7l8.zp(j2, EnumC6474y.NANOSECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @yz(version = "1.5")
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long m23735b(long j2) {
            return f7l8.zp(j2, EnumC6474y.MINUTES);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long bf2(double d2) {
            return f7l8.a98o(d2, EnumC6474y.NANOSECONDS);
        }

        public final long cdj() {
            return C6467n.f36741g;
        }

        @InterfaceC7395n
        public final C6467n ch(@InterfaceC7396q String value) {
            d2ok.m23075h(value, "value");
            try {
                return C6467n.m23715s(f7l8.ek5k(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @yz(version = "1.5")
        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long m23736e(long j2) {
            return f7l8.zp(j2, EnumC6474y.HOURS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long ek5k(long j2) {
            return f7l8.zp(j2, EnumC6474y.MILLISECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long hb(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.MICROSECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long i1(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.NANOSECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @yz(version = "1.5")
        /* JADX INFO: renamed from: j */
        public final /* synthetic */ long m23737j(long j2) {
            return f7l8.zp(j2, EnumC6474y.MICROSECONDS);
        }

        @x2
        /* JADX INFO: renamed from: k */
        public final double m23738k(double d2, @InterfaceC7396q EnumC6474y sourceUnit, @InterfaceC7396q EnumC6474y targetUnit) {
            d2ok.m23075h(sourceUnit, "sourceUnit");
            d2ok.m23075h(targetUnit, "targetUnit");
            return C6468p.m23747k(d2, sourceUnit, targetUnit);
        }

        public final long lrht() {
            return C6467n.f36742n;
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long lv5(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.SECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @yz(version = "1.5")
        /* JADX INFO: renamed from: m */
        public final /* synthetic */ long m23739m(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.MILLISECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long nmn5(double d2) {
            return f7l8.a98o(d2, EnumC6474y.SECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long nn86(double d2) {
            return f7l8.a98o(d2, EnumC6474y.MICROSECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @yz(version = "1.5")
        /* JADX INFO: renamed from: o */
        public final /* synthetic */ long m23740o(double d2) {
            return f7l8.a98o(d2, EnumC6474y.MILLISECONDS);
        }

        public final long oc() {
            return C6467n.f36744y;
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @yz(version = "1.5")
        /* JADX INFO: renamed from: q */
        public final /* synthetic */ long m23741q(long j2) {
            return f7l8.zp(j2, EnumC6474y.DAYS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @yz(version = "1.5")
        public final /* synthetic */ long t8iq(long j2) {
            return f7l8.zp(j2, EnumC6474y.SECONDS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @yz(version = "1.5")
        public final /* synthetic */ long toq(double d2) {
            return f7l8.a98o(d2, EnumC6474y.DAYS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @yz(version = "1.5")
        public final /* synthetic */ long uv6(double d2) {
            return f7l8.a98o(d2, EnumC6474y.HOURS);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @yz(version = "1.5")
        public final /* synthetic */ long vyq(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.HOURS);
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: x */
        public final C6467n m23742x(@InterfaceC7396q String value) {
            d2ok.m23075h(value, "value");
            try {
                return C6467n.m23715s(f7l8.ek5k(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @yz(version = "1.5")
        public final /* synthetic */ long y9n(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.MINUTES);
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @yz(version = "1.5")
        public final /* synthetic */ long yz(double d2) {
            return f7l8.a98o(d2, EnumC6474y.MINUTES);
        }

        public final long zp(@InterfaceC7396q String value) {
            d2ok.m23075h(value, "value");
            try {
                return f7l8.ek5k(value, true);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e2);
            }
        }

        @x2
        @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @kotlin.ld6(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @yz(version = "1.5")
        public final /* synthetic */ long zy(int i2) {
            return f7l8.m23661a(i2, EnumC6474y.DAYS);
        }
    }

    private /* synthetic */ C6467n(long j2) {
        this.f36745k = j2;
    }

    /* JADX INFO: renamed from: a */
    public static final <T> T m23701a(long j2, @InterfaceC7396q cyoe.ki<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        d2ok.m23075h(action, "action");
        return action.invoke(Long.valueOf(eqxt(j2)), Integer.valueOf(m23709l(j2)), Integer.valueOf(m23703c(j2)), Integer.valueOf(hyr(j2)));
    }

    public static final <T> T a98o(long j2, @InterfaceC7396q cyoe.cdj<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        d2ok.m23075h(action, "action");
        return action.invoke(Long.valueOf(m23714r(j2)), Integer.valueOf(m23703c(j2)), Integer.valueOf(hyr(j2)));
    }

    /* JADX INFO: renamed from: b */
    public static final long m23702b(long j2, double d2) {
        int iD8wk = C6321q.d8wk(d2);
        if (((double) iD8wk) == d2) {
            return bf2(j2, iD8wk);
        }
        EnumC6474y enumC6474yLrht = lrht(j2);
        return f7l8.a98o(m23718x(j2, enumC6474yLrht) * d2, enumC6474yLrht);
    }

    public static final long bf2(long j2, int i2) {
        if (m23712o(j2)) {
            if (i2 != 0) {
                return i2 > 0 ? j2 : dr(j2);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i2 == 0) {
            return f36742n;
        }
        long jVyq = vyq(j2);
        long j3 = i2;
        long j4 = jVyq * j3;
        if (!m23708j(j2)) {
            return j4 / j3 == jVyq ? f7l8.m23675p(fn3e.d2ok(j4, new kotlin.ranges.kja0(-4611686018427387903L, f7l8.f81943zy))) : C6321q.m23201c(jVyq) * C6321q.m23204f(i2) > 0 ? f36741g : f36744y;
        }
        if (new kotlin.ranges.kja0(-2147483647L, 2147483647L).x2(jVyq)) {
            return f7l8.x2(j4);
        }
        if (j4 / j3 == jVyq) {
            return f7l8.qrj(j4);
        }
        long jM23672m = f7l8.m23672m(jVyq);
        long j5 = jM23672m * j3;
        long jM23672m2 = f7l8.m23672m((jVyq - f7l8.m23674o(jM23672m)) * j3) + j5;
        return (j5 / j3 != jM23672m || (jM23672m2 ^ j5) < 0) ? C6321q.m23201c(jVyq) * C6321q.m23204f(i2) > 0 ? f36741g : f36744y : f7l8.m23675p(fn3e.d2ok(jM23672m2, new kotlin.ranges.kja0(-4611686018427387903L, f7l8.f81943zy)));
    }

    @InterfaceC7396q
    public static String bo(long j2) {
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f36741g) {
            return "Infinity";
        }
        if (j2 == f36744y) {
            return "-Infinity";
        }
        boolean zM23710m = m23710m(j2);
        StringBuilder sb = new StringBuilder();
        if (zM23710m) {
            sb.append('-');
        }
        long jKi = ki(j2);
        long jOc = oc(jKi);
        int iFn3e = fn3e(jKi);
        int iM23709l = m23709l(jKi);
        int iM23703c = m23703c(jKi);
        int iHyr = hyr(jKi);
        int i2 = 0;
        boolean z2 = jOc != 0;
        boolean z3 = iFn3e != 0;
        boolean z5 = iM23709l != 0;
        boolean z6 = (iM23703c == 0 && iHyr == 0) ? false : true;
        if (z2) {
            sb.append(jOc);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z5 || z6))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iFn3e);
            sb.append('h');
            i2 = i3;
        }
        if (z5 || (z6 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM23709l);
            sb.append('m');
            i2 = i4;
        }
        if (z6) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iM23703c != 0 || z2 || z3 || z5) {
                f7l8(j2, sb, iM23703c, iHyr, 9, C7704k.y.toq.f44691k, false);
            } else if (iHyr >= 1000000) {
                f7l8(j2, sb, iHyr / 1000000, iHyr % 1000000, 6, "ms", false);
            } else if (iHyr >= 1000) {
                f7l8(j2, sb, iHyr / 1000, iHyr % 1000, 3, "us", false);
            } else {
                sb.append(iHyr);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (zM23710m && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static final int m23703c(long j2) {
        if (m23712o(j2)) {
            return 0;
        }
        return (int) (x9kr(j2) % ((long) 60));
    }

    public static /* synthetic */ String c8jq(long j2, EnumC6474y enumC6474y, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return y2(j2, enumC6474y, i2);
    }

    public static final boolean cdj(long j2, long j3) {
        return j2 == j3;
    }

    public static final int ch(long j2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        return (int) fn3e.eqxt(lv5(j2, unit), -2147483648L, 2147483647L);
    }

    public static final long d2ok(long j2) {
        return lv5(j2, EnumC6474y.MICROSECONDS);
    }

    public static final long dd(long j2) {
        long jVyq = vyq(j2);
        if (m23708j(j2)) {
            return jVyq;
        }
        if (jVyq > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jVyq < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return f7l8.m23674o(jVyq);
    }

    public static final long dr(long j2) {
        return f7l8.m23678s(-vyq(j2), ((int) j2) & 1);
    }

    /* JADX INFO: renamed from: e */
    public static int m23704e(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean ek5k(long j2) {
        return j2 > 0;
    }

    public static final long eqxt(long j2) {
        return lv5(j2, EnumC6474y.HOURS);
    }

    @nn86
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m23705f() {
    }

    private static final void f7l8(long j2, StringBuilder sb, int i2, int i3, int i4, String str, boolean z2) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strSj = fti.sj(String.valueOf(i3), i4, '0');
            int i5 = -1;
            int length = strSj.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strSj.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z2 || i7 >= 3) {
                sb.append((CharSequence) strSj, 0, ((i7 + 2) / 3) * 3);
                d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) strSj, 0, i7);
                d2ok.kja0(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    public static final int fn3e(long j2) {
        if (m23712o(j2)) {
            return 0;
        }
        return (int) (eqxt(j2) % ((long) 24));
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    public static /* synthetic */ void fti() {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    public static /* synthetic */ void fu4() {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    public static /* synthetic */ void gvn7() {
    }

    public static final long gyi(long j2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        EnumC6474y enumC6474yLrht = lrht(j2);
        if (unit.compareTo(enumC6474yLrht) <= 0 || m23712o(j2)) {
            return j2;
        }
        return f7l8.zp(vyq(j2) - (vyq(j2) % C6468p.toq(1L, unit, enumC6474yLrht)), enumC6474yLrht);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23706h(long j2, Object obj) {
        return (obj instanceof C6467n) && j2 == ((C6467n) obj).xwq3();
    }

    private static final boolean hb(long j2) {
        return (((int) j2) & 1) == 1;
    }

    public static final int hyr(long j2) {
        if (m23712o(j2)) {
            return 0;
        }
        return (int) (hb(j2) ? f7l8.m23674o(vyq(j2) % ((long) 1000)) : vyq(j2) % ((long) 1000000000));
    }

    @nn86
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m23707i() {
    }

    public static final <T> T i1(long j2, @InterfaceC7396q InterfaceC5979h<? super Long, ? super Integer, ? extends T> action) {
        d2ok.m23075h(action, "action");
        return action.invoke(Long.valueOf(x9kr(j2)), Integer.valueOf(hyr(j2)));
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m23708j(long j2) {
        return (((int) j2) & 1) == 0;
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    public static /* synthetic */ void jk() {
    }

    public static final long ki(long j2) {
        return m23710m(j2) ? dr(j2) : j2;
    }

    public static final long kja0(long j2, int i2) {
        if (i2 == 0) {
            if (ek5k(j2)) {
                return f36741g;
            }
            if (m23710m(j2)) {
                return f36744y;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m23708j(j2)) {
            return f7l8.x2(vyq(j2) / ((long) i2));
        }
        if (m23712o(j2)) {
            return bf2(j2, C6321q.m23204f(i2));
        }
        long j3 = i2;
        long jVyq = vyq(j2) / j3;
        if (!new kotlin.ranges.kja0(-4611686018426L, 4611686018426L).x2(jVyq)) {
            return f7l8.m23675p(jVyq);
        }
        return f7l8.x2(f7l8.m23674o(jVyq) + (f7l8.m23674o(vyq(j2) - (jVyq * j3)) / j3));
    }

    /* JADX INFO: renamed from: l */
    public static final int m23709l(long j2) {
        if (m23712o(j2)) {
            return 0;
        }
        return (int) (m23714r(j2) % ((long) 60));
    }

    public static int ld6(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return d2ok.fn3e(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        return m23710m(j2) ? -i2 : i2;
    }

    private static final EnumC6474y lrht(long j2) {
        return m23708j(j2) ? EnumC6474y.NANOSECONDS : EnumC6474y.MILLISECONDS;
    }

    public static final long lv5(long j2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        if (j2 == f36741g) {
            return Long.MAX_VALUE;
        }
        if (j2 == f36744y) {
            return Long.MIN_VALUE;
        }
        return C6468p.toq(vyq(j2), lrht(j2), unit);
    }

    public static final long lvui(long j2) {
        return (hb(j2) && nn86(j2)) ? vyq(j2) : lv5(j2, EnumC6474y.MILLISECONDS);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m23710m(long j2) {
        return j2 < 0;
    }

    /* JADX INFO: renamed from: n */
    private static final long m23711n(long j2, long j3, long j4) {
        long jM23672m = f7l8.m23672m(j4);
        long j5 = j3 + jM23672m;
        if (!new kotlin.ranges.kja0(-4611686018426L, 4611686018426L).x2(j5)) {
            return f7l8.m23675p(fn3e.eqxt(j5, -4611686018427387903L, f7l8.f81943zy));
        }
        return f7l8.x2(f7l8.m23674o(j5) + (j4 - f7l8.m23674o(jM23672m)));
    }

    @nn86
    public static /* synthetic */ void n5r1() {
    }

    public static final long n7h(long j2, double d2) {
        int iD8wk = C6321q.d8wk(d2);
        if ((((double) iD8wk) == d2) && iD8wk != 0) {
            return kja0(j2, iD8wk);
        }
        EnumC6474y enumC6474yLrht = lrht(j2);
        return f7l8.a98o(m23718x(j2, enumC6474yLrht) / d2, enumC6474yLrht);
    }

    @nn86
    public static /* synthetic */ void ncyb() {
    }

    @InterfaceC7396q
    public static final String nmn5(long j2) {
        StringBuilder sb = new StringBuilder();
        if (m23710m(j2)) {
            sb.append('-');
        }
        sb.append("PT");
        long jKi = ki(j2);
        long jEqxt = eqxt(jKi);
        int iM23709l = m23709l(jKi);
        int iM23703c = m23703c(jKi);
        int iHyr = hyr(jKi);
        if (m23712o(j2)) {
            jEqxt = 9999999999999L;
        }
        boolean z2 = true;
        boolean z3 = jEqxt != 0;
        boolean z5 = (iM23703c == 0 && iHyr == 0) ? false : true;
        if (iM23709l == 0 && (!z5 || !z3)) {
            z2 = false;
        }
        if (z3) {
            sb.append(jEqxt);
            sb.append('H');
        }
        if (z2) {
            sb.append(iM23709l);
            sb.append('M');
        }
        if (z5 || (!z3 && !z2)) {
            f7l8(j2, sb, iM23703c, iHyr, 9, "S", true);
        }
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final boolean nn86(long j2) {
        return !m23712o(j2);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m23712o(long j2) {
        return j2 == f36741g || j2 == f36744y;
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    public static /* synthetic */ void o1t() {
    }

    public static final long oc(long j2) {
        return lv5(j2, EnumC6474y.DAYS);
    }

    public static final double qrj(long j2, long j3) {
        EnumC6474y enumC6474y = (EnumC6474y) C6190y.uv6(lrht(j2), lrht(j3));
        return m23718x(j2, enumC6474y) / m23718x(j3, enumC6474y);
    }

    /* JADX INFO: renamed from: r */
    public static final long m23714r(long j2) {
        return lv5(j2, EnumC6474y.MINUTES);
    }

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ C6467n m23715s(long j2) {
        return new C6467n(j2);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m23716t() {
    }

    private static final int uv6(long j2) {
        return ((int) j2) & 1;
    }

    private static final long vyq(long j2) {
        return j2 >> 1;
    }

    /* JADX INFO: renamed from: x */
    public static final double m23718x(long j2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        if (j2 == f36741g) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == f36744y) {
            return Double.NEGATIVE_INFINITY;
        }
        return C6468p.m23747k(vyq(j2), lrht(j2), unit);
    }

    public static long x2(long j2) {
        if (C6461g.m23683q()) {
            if (m23708j(j2)) {
                if (!new kotlin.ranges.kja0(-4611686018426999999L, f7l8.f81942toq).x2(vyq(j2))) {
                    throw new AssertionError(vyq(j2) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new kotlin.ranges.kja0(-4611686018427387903L, f7l8.f81943zy).x2(vyq(j2))) {
                    throw new AssertionError(vyq(j2) + " ms is out of milliseconds range");
                }
                if (new kotlin.ranges.kja0(-4611686018426L, 4611686018426L).x2(vyq(j2))) {
                    throw new AssertionError(vyq(j2) + " ms is denormalized");
                }
            }
        }
        return j2;
    }

    public static final long x9kr(long j2) {
        return lv5(j2, EnumC6474y.SECONDS);
    }

    @InterfaceC7396q
    public static final String y2(long j2, @InterfaceC7396q EnumC6474y unit, int i2) {
        d2ok.m23075h(unit, "unit");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i2).toString());
        }
        double dM23718x = m23718x(j2, unit);
        if (Double.isInfinite(dM23718x)) {
            return String.valueOf(dM23718x);
        }
        return C6461g.toq(dM23718x, fn3e.m23305t(i2, 12)) + ld6.m23700y(unit);
    }

    public static final long y9n(long j2, long j3) {
        if (m23712o(j2)) {
            if (nn86(j3) || (j3 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m23712o(j3)) {
            return j3;
        }
        if ((((int) j2) & 1) != (((int) j3) & 1)) {
            return hb(j2) ? m23711n(j2, vyq(j2), vyq(j3)) : m23711n(j2, vyq(j3), vyq(j2));
        }
        long jVyq = vyq(j2) + vyq(j3);
        return m23708j(j2) ? f7l8.qrj(jVyq) : f7l8.ld6(jVyq);
    }

    public static final long yz(long j2, long j3) {
        return y9n(j2, dr(j3));
    }

    public static final <T> T zp(long j2, @InterfaceC7396q cyoe.t8r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        d2ok.m23075h(action, "action");
        return action.invoke(Long.valueOf(oc(j2)), Integer.valueOf(fn3e(j2)), Integer.valueOf(m23709l(j2)), Integer.valueOf(m23703c(j2)), Integer.valueOf(hyr(j2)));
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @hb(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    public static /* synthetic */ void zurt() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C6467n c6467n) {
        return m23720p(c6467n.xwq3());
    }

    public boolean equals(Object obj) {
        return m23706h(this.f36745k, obj);
    }

    public int hashCode() {
        return m23704e(this.f36745k);
    }

    /* JADX INFO: renamed from: p */
    public int m23720p(long j2) {
        return ld6(this.f36745k, j2);
    }

    @InterfaceC7396q
    public String toString() {
        return bo(this.f36745k);
    }

    public final /* synthetic */ long xwq3() {
        return this.f36745k;
    }
}

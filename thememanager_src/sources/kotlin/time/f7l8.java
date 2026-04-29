package kotlin.time;

import kotlin.hb;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.math.C6321q;
import kotlin.ranges.fn3e;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    public static final int f36733k = 1000000;

    /* JADX INFO: renamed from: q */
    private static final long f36734q = 4611686018426L;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final long f81942toq = 4611686018426999999L;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final long f81943zy = 4611686018427387903L;

    @i9jn(markerClass = {x2.class})
    @yz(version = "1.6")
    /* JADX INFO: renamed from: a */
    public static final long m23661a(int i2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        return unit.compareTo(EnumC6474y.SECONDS) <= 0 ? x2(C6468p.zy(i2, unit, EnumC6474y.NANOSECONDS)) : zp(i2, unit);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void a9(long j2) {
    }

    @i9jn(markerClass = {x2.class})
    @yz(version = "1.6")
    public static final long a98o(double d2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        double dM23747k = C6468p.m23747k(d2, unit, EnumC6474y.NANOSECONDS);
        if (!(!Double.isNaN(dM23747k))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jWas = C6321q.was(dM23747k);
        return new kotlin.ranges.kja0(-4611686018426999999L, f81942toq).x2(jWas) ? x2(jWas) : ld6(C6321q.was(C6468p.m23747k(d2, unit, EnumC6474y.MILLISECONDS)));
    }

    /* JADX INFO: renamed from: b */
    private static final String m23662b(String str, int i2, cyoe.x2<? super Character, Boolean> x2Var) {
        int i3 = i2;
        while (i3 < str.length() && x2Var.invoke(Character.valueOf(str.charAt(i3))).booleanValue()) {
            i3++;
        }
        d2ok.n7h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long bf2(double d2, long j2) {
        return C6467n.m23702b(j2, d2);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @yz(version = "1.3")
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m23663c(int i2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @yz(version = "1.3")
    public static /* synthetic */ void cdj(double d2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void d3(double d2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @yz(version = "1.3")
    public static /* synthetic */ void dd(double d2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a6 A[EDGE_INSN: B:170:0x00a6->B:49:0x00a6 BREAK  A[LOOP:1: B:36:0x006c->B:47:0x0098], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098 A[LOOP:1: B:36:0x006c->B:47:0x0098, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long ek5k(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.f7l8.ek5k(java.lang.String, boolean):long");
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void eqxt(long j2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @yz(version = "1.3")
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m23665f(double d2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @yz(version = "1.3")
    public static /* synthetic */ void fu4(int i2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void hb(int i2) {
    }

    @i9jn(markerClass = {x2.class})
    @InterfaceC6234g
    @yz(version = "1.6")
    private static final long i1(int i2, long j2) {
        return C6467n.bf2(j2, i2);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @yz(version = "1.3")
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m23669j(long j2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void jk(int i2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @yz(version = "1.3")
    public static /* synthetic */ void ki(int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ld6(long j2) {
        return new kotlin.ranges.kja0(-4611686018426L, f36734q).x2(j2) ? x2(m23674o(j2)) : m23675p(fn3e.eqxt(j2, -4611686018427387903L, f81943zy));
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void lrht(long j2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final long m23672m(long j2) {
        return j2 / ((long) 1000000);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void mcp(double d2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @yz(version = "1.3")
    public static /* synthetic */ void ncyb(long j2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @yz(version = "1.3")
    public static /* synthetic */ void ni7(double d2) {
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void nn86(double d2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final long m23674o(long j2) {
        return j2 * ((long) 1000000);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @yz(version = "1.3")
    public static /* synthetic */ void oc(int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final long m23675p(long j2) {
        return C6467n.x2((j2 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long qrj(long j2) {
        return new kotlin.ranges.kja0(-4611686018426999999L, f81942toq).x2(j2) ? x2(j2) : m23675p(m23672m(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final long m23678s(long j2, int i2) {
        return C6467n.x2((j2 << 1) + ((long) i2));
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @yz(version = "1.3")
    public static /* synthetic */ void t8r(long j2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long x2(long j2) {
        return C6467n.x2(j2 << 1);
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @yz(version = "1.3")
    public static /* synthetic */ void x9kr(int i2) {
    }

    private static final int y9n(String str, int i2, cyoe.x2<? super Character, Boolean> x2Var) {
        while (i2 < str.length() && x2Var.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long yz(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            char r5 = r9.charAt(r4)
            java.lang.String r6 = "+-"
            boolean r5 = kotlin.text.zurt.vwb(r6, r5, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6e
            kotlin.ranges.x2 r0 = new kotlin.ranges.x2
            int r6 = kotlin.text.zurt.kt06(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L36
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L36
        L34:
            r0 = r3
            goto L5b
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            r5 = r0
            kotlin.collections.n5r1 r5 = (kotlin.collections.n5r1) r5
            int r5 = r5.nextInt()
            kotlin.ranges.zy r6 = new kotlin.ranges.zy
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.x2(r5)
            if (r5 != 0) goto L3a
            r0 = r4
        L5b:
            if (r0 == 0) goto L6e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L68
            r0 = -9223372036854775808
            goto L6d
        L68:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6d:
            return r0
        L6e:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.zurt.r6ty(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = kotlin.text.zurt.fpn(r9, r3)
        L7a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.f7l8.yz(java.lang.String):long");
    }

    @x2
    @kotlin.x2(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.ld6(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @hb(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @yz(version = "1.3")
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m23681z(long j2) {
    }

    @i9jn(markerClass = {x2.class})
    @yz(version = "1.6")
    public static final long zp(long j2, @InterfaceC7396q EnumC6474y unit) {
        d2ok.m23075h(unit, "unit");
        EnumC6474y enumC6474y = EnumC6474y.NANOSECONDS;
        long jZy = C6468p.zy(f81942toq, enumC6474y, unit);
        return new kotlin.ranges.kja0(-jZy, jZy).x2(j2) ? x2(C6468p.zy(j2, unit, enumC6474y)) : m23675p(fn3e.eqxt(C6468p.toq(j2, unit, EnumC6474y.MILLISECONDS), -4611686018427387903L, f81943zy));
    }
}

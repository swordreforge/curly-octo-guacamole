package kotlin;

import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@InterfaceC6761g
@yz(version = "1.5")
public final class ikck implements Comparable<ikck> {

    /* JADX INFO: renamed from: g */
    public static final long f36283g = -1;

    /* JADX INFO: renamed from: n */
    public static final long f36284n = 0;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6233k f36285q = new C6233k(null);

    /* JADX INFO: renamed from: s */
    public static final int f36286s = 64;

    /* JADX INFO: renamed from: y */
    public static final int f36287y = 8;

    /* JADX INFO: renamed from: k */
    private final long f36288k;

    /* JADX INFO: renamed from: kotlin.ikck$k */
    /* JADX INFO: compiled from: ULong.kt */
    public static final class C6233k {
        private C6233k() {
        }

        public /* synthetic */ C6233k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    @nn86
    @kotlin.internal.f7l8
    private /* synthetic */ ikck(long j2) {
        this.f36288k = j2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: a */
    private static final long m22850a(long j2, long j3) {
        return ld6(j2 ^ j3);
    }

    @InterfaceC6234g
    private static final long a9(long j2, short s2) {
        return ld6(j2 - ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: b */
    private static final int m22851b(long j2) {
        return gyi.ld6((int) j2);
    }

    @InterfaceC6234g
    private static final long bf2(long j2) {
        return j2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: c */
    private static final long m22852c(long j2, int i2) {
        return ld6(j2 >>> i2);
    }

    public static boolean cdj(long j2, Object obj) {
        return (obj instanceof ikck) && j2 == ((ikck) obj).a98o();
    }

    @InterfaceC6234g
    private static final long d2ok(long j2, long j3) {
        return ld6(j2 + j3);
    }

    @InterfaceC6234g
    private static final short d3(long j2, short s2) {
        return qo.ld6((short) Long.remainderUnsigned(j2, ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i)));
    }

    @InterfaceC6234g
    private static final kotlin.ranges.wvg dd(long j2, long j3) {
        return new kotlin.ranges.wvg(j2, j3, null);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: e */
    private static final long m22853e(long j2, short s2) {
        return ld6(j2 * ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    private static final short ek5k(long j2) {
        return (short) j2;
    }

    @InterfaceC6234g
    private static final long eqxt(long j2, byte b2) {
        return ld6(j2 + ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: f */
    private static final long m22854f(long j2, int i2) {
        return ld6(j2 << i2);
    }

    @InterfaceC6234g
    private static int f7l8(long j2, long j3) {
        return py.f7l8(j2, j3);
    }

    @InterfaceC6234g
    private static final long fn3e(long j2, long j3) {
        return Long.divideUnsigned(j2, j3);
    }

    @InterfaceC6234g
    private static final byte fti(long j2, byte b2) {
        return C6475u.ld6((byte) Long.remainderUnsigned(j2, ld6(((long) b2) & 255)));
    }

    @nn86
    public static /* synthetic */ void fu4() {
    }

    @InterfaceC6234g
    private static final int gvn7(long j2, int i2) {
        return gyi.ld6((int) Long.remainderUnsigned(j2, ld6(((long) i2) & 4294967295L)));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final long m22855h(long j2, short s2) {
        return Long.divideUnsigned(j2, ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    private static final double hb(long j2) {
        return py.m23244p(j2);
    }

    @InterfaceC6234g
    private static final long hyr(long j2, short s2) {
        return Long.remainderUnsigned(j2, ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final long m22856i(long j2, byte b2) {
        return Long.divideUnsigned(j2, ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    private static final short i1(long j2) {
        return qo.ld6((short) j2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: j */
    private static final float m22857j(long j2) {
        return (float) py.m23244p(j2);
    }

    @InterfaceC6234g
    private static final long jk(long j2, int i2) {
        return ld6(j2 - ld6(((long) i2) & 4294967295L));
    }

    @InterfaceC6234g
    private static final long jp0y(long j2, long j3) {
        return Long.remainderUnsigned(j2, j3);
    }

    public static final boolean ki(long j2, long j3) {
        return j2 == j3;
    }

    @InterfaceC6234g
    private static final long kja0(long j2, int i2) {
        return Long.divideUnsigned(j2, ld6(((long) i2) & 4294967295L));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: l */
    private static final long m22858l(long j2, long j3) {
        return py.m23246s(j2, j3);
    }

    @nn86
    @kotlin.internal.f7l8
    public static long ld6(long j2) {
        return j2;
    }

    @InterfaceC6234g
    private static final long lrht(long j2, byte b2) {
        return ld6(j2 * ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    private static final long lvui(long j2, int i2) {
        return ld6(j2 + ld6(((long) i2) & 4294967295L));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: m */
    private static final long m22859m(long j2) {
        return j2;
    }

    @InterfaceC6234g
    private static final long mcp(long j2, long j3) {
        return ld6(j2 - j3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private int m22860n(long j2) {
        return py.f7l8(a98o(), j2);
    }

    @InterfaceC6234g
    private static final long n5r1(long j2, int i2) {
        return Long.remainderUnsigned(j2, ld6(((long) i2) & 4294967295L));
    }

    @InterfaceC6234g
    private static final long n7h(long j2, long j3) {
        return py.m23247y(j2, j3);
    }

    @InterfaceC6234g
    private static final long ncyb(long j2, byte b2) {
        return Long.remainderUnsigned(j2, ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    private static final long ni7(long j2, short s2) {
        return Long.divideUnsigned(j2, ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    private static final byte nn86(long j2) {
        return (byte) j2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: o */
    private static final int m22861o(long j2) {
        return (int) j2;
    }

    @InterfaceC6234g
    private static final long o1t(long j2) {
        return ld6(j2 + 1);
    }

    @InterfaceC6234g
    private static final long oc(long j2, long j3) {
        return ld6(j2 | j3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final int m22862p(long j2, short s2) {
        return Long.compareUnsigned(j2, ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final int m22863q(long j2, byte b2) {
        return Long.compareUnsigned(j2, ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    private static final long qrj(long j2, byte b2) {
        return Long.divideUnsigned(j2, ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: r */
    private static final long m22864r(long j2, short s2) {
        return ld6(j2 + ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final int m22865s(long j2, int i2) {
        return Long.compareUnsigned(j2, ld6(((long) i2) & 4294967295L));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final long m22866t(long j2, byte b2) {
        return ld6(j2 - ld6(((long) b2) & 255));
    }

    @InterfaceC6234g
    private static final long toq(long j2, long j3) {
        return ld6(j2 & j3);
    }

    @InterfaceC6234g
    private static final long uv6(long j2, long j3) {
        return ld6(j2 * j3);
    }

    @InterfaceC6234g
    private static final long vyq(long j2, int i2) {
        return ld6(j2 * ld6(((long) i2) & 4294967295L));
    }

    @InterfaceC6234g
    private static final long wvg(long j2) {
        return ld6(~j2);
    }

    @InterfaceC6234g
    private static final long x2(long j2) {
        return ld6(j2 - 1);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final kotlin.ranges.wvg x9kr(long j2, long j3) {
        return kotlin.ranges.mcp.uv6(j2, j3);
    }

    @InterfaceC6234g
    private static final byte y9n(long j2) {
        return C6475u.ld6((byte) j2);
    }

    @InterfaceC7396q
    public static String yz(long j2) {
        return py.ld6(j2);
    }

    /* JADX INFO: renamed from: z */
    public static int m22867z(long j2) {
        return Long.hashCode(j2);
    }

    @InterfaceC6234g
    private static final long zurt(long j2, int i2) {
        return Long.divideUnsigned(j2, ld6(((long) i2) & 4294967295L));
    }

    public static final /* synthetic */ ikck zy(long j2) {
        return new ikck(j2);
    }

    public final /* synthetic */ long a98o() {
        return this.f36288k;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ikck ikckVar) {
        return py.f7l8(a98o(), ikckVar.a98o());
    }

    public boolean equals(Object obj) {
        return cdj(this.f36288k, obj);
    }

    public int hashCode() {
        return m22867z(this.f36288k);
    }

    @InterfaceC7396q
    public String toString() {
        return yz(this.f36288k);
    }
}

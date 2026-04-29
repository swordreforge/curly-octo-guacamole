package kotlin;

import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@InterfaceC6761g
@yz(version = "1.5")
public final class gyi implements Comparable<gyi> {

    /* JADX INFO: renamed from: g */
    public static final int f36277g = -1;

    /* JADX INFO: renamed from: n */
    public static final int f36278n = 0;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6230k f36279q = new C6230k(null);

    /* JADX INFO: renamed from: s */
    public static final int f36280s = 32;

    /* JADX INFO: renamed from: y */
    public static final int f36281y = 4;

    /* JADX INFO: renamed from: k */
    private final int f36282k;

    /* JADX INFO: renamed from: kotlin.gyi$k */
    /* JADX INFO: compiled from: UInt.kt */
    public static final class C6230k {
        private C6230k() {
        }

        public /* synthetic */ C6230k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    @nn86
    @kotlin.internal.f7l8
    private /* synthetic */ gyi(int i2) {
        this.f36282k = i2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: a */
    private static final int m22826a(int i2, int i3) {
        return ld6(i2 ^ i3);
    }

    @InterfaceC6234g
    private static final int a9(int i2, short s2) {
        return ld6(i2 - ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: b */
    private static final int m22827b(int i2) {
        return i2;
    }

    @InterfaceC6234g
    private static final long bf2(int i2) {
        return ikck.ld6(((long) i2) & 4294967295L);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: c */
    private static final int m22828c(int i2, int i3) {
        return ld6(i2 >>> i3);
    }

    public static boolean cdj(int i2, Object obj) {
        return (obj instanceof gyi) && i2 == ((gyi) obj).a98o();
    }

    @InterfaceC6234g
    private static final long d2ok(int i2, long j2) {
        return ikck.ld6(ikck.ld6(((long) i2) & 4294967295L) + j2);
    }

    @InterfaceC6234g
    private static final short d3(int i2, short s2) {
        return qo.ld6((short) Integer.remainderUnsigned(i2, ld6(s2 & qo.f36486g)));
    }

    @InterfaceC6234g
    private static final kotlin.ranges.fu4 dd(int i2, int i3) {
        return new kotlin.ranges.fu4(i2, i3, null);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: e */
    private static final int m22829e(int i2, short s2) {
        return ld6(i2 * ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    private static final short ek5k(int i2) {
        return (short) i2;
    }

    @InterfaceC6234g
    private static final int eqxt(int i2, byte b2) {
        return ld6(i2 + ld6(b2 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: f */
    private static final int m22830f(int i2, int i3) {
        return ld6(i2 << i3);
    }

    @InterfaceC6234g
    private int f7l8(int i2) {
        return py.zy(a98o(), i2);
    }

    @InterfaceC6234g
    private static final long fn3e(int i2, long j2) {
        return Long.divideUnsigned(ikck.ld6(((long) i2) & 4294967295L), j2);
    }

    @InterfaceC6234g
    private static final byte fti(int i2, byte b2) {
        return C6475u.ld6((byte) Integer.remainderUnsigned(i2, ld6(b2 & 255)));
    }

    @nn86
    public static /* synthetic */ void fu4() {
    }

    @InterfaceC6234g
    private static final int gvn7(int i2, int i3) {
        return Integer.remainderUnsigned(i2, i3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final int m22831h(int i2, short s2) {
        return Integer.divideUnsigned(i2, ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    private static final double hb(int i2) {
        return py.m23241g(i2);
    }

    @InterfaceC6234g
    private static final int hyr(int i2, short s2) {
        return Integer.remainderUnsigned(i2, ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final int m22832i(int i2, byte b2) {
        return Integer.divideUnsigned(i2, ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final short i1(int i2) {
        return qo.ld6((short) i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: j */
    private static final float m22833j(int i2) {
        return (float) py.m23241g(i2);
    }

    @InterfaceC6234g
    private static final int jk(int i2, int i3) {
        return ld6(i2 - i3);
    }

    @InterfaceC6234g
    private static final long jp0y(int i2, long j2) {
        return Long.remainderUnsigned(ikck.ld6(((long) i2) & 4294967295L), j2);
    }

    public static final boolean ki(int i2, int i3) {
        return i2 == i3;
    }

    @InterfaceC6234g
    private static final int kja0(int i2, int i3) {
        return py.m23245q(i2, i3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: l */
    private static final long m22834l(int i2, long j2) {
        return Long.remainderUnsigned(ikck.ld6(((long) i2) & 4294967295L), j2);
    }

    @nn86
    @kotlin.internal.f7l8
    public static int ld6(int i2) {
        return i2;
    }

    @InterfaceC6234g
    private static final int lrht(int i2, byte b2) {
        return ld6(i2 * ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final int lvui(int i2, int i3) {
        return ld6(i2 + i3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: m */
    private static final long m22835m(int i2) {
        return ((long) i2) & 4294967295L;
    }

    @InterfaceC6234g
    private static final long mcp(int i2, long j2) {
        return ikck.ld6(ikck.ld6(((long) i2) & 4294967295L) - j2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final int m22836n(int i2, long j2) {
        return Long.compareUnsigned(ikck.ld6(((long) i2) & 4294967295L), j2);
    }

    @InterfaceC6234g
    private static final int n5r1(int i2, int i3) {
        return py.m23243n(i2, i3);
    }

    @InterfaceC6234g
    private static final long n7h(int i2, long j2) {
        return Long.divideUnsigned(ikck.ld6(((long) i2) & 4294967295L), j2);
    }

    @InterfaceC6234g
    private static final int ncyb(int i2, byte b2) {
        return Integer.remainderUnsigned(i2, ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final int ni7(int i2, short s2) {
        return Integer.divideUnsigned(i2, ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    private static final byte nn86(int i2) {
        return (byte) i2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: o */
    private static final int m22837o(int i2) {
        return i2;
    }

    @InterfaceC6234g
    private static final int o1t(int i2) {
        return ld6(i2 + 1);
    }

    @InterfaceC6234g
    private static final int oc(int i2, int i3) {
        return ld6(i2 | i3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final int m22838p(int i2, short s2) {
        return Integer.compareUnsigned(i2, ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final int m22839q(int i2, byte b2) {
        return Integer.compareUnsigned(i2, ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final int qrj(int i2, byte b2) {
        return Integer.divideUnsigned(i2, ld6(b2 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: r */
    private static final int m22840r(int i2, short s2) {
        return ld6(i2 + ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static int m22841s(int i2, int i3) {
        return py.zy(i2, i3);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final int m22842t(int i2, byte b2) {
        return ld6(i2 - ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final int toq(int i2, int i3) {
        return ld6(i2 & i3);
    }

    @InterfaceC6234g
    private static final long uv6(int i2, long j2) {
        return ikck.ld6(ikck.ld6(((long) i2) & 4294967295L) * j2);
    }

    @InterfaceC6234g
    private static final int vyq(int i2, int i3) {
        return ld6(i2 * i3);
    }

    @InterfaceC6234g
    private static final int wvg(int i2) {
        return ld6(~i2);
    }

    @InterfaceC6234g
    private static final int x2(int i2) {
        return ld6(i2 - 1);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final kotlin.ranges.fu4 x9kr(int i2, int i3) {
        return kotlin.ranges.mcp.m23330c(i2, i3);
    }

    @InterfaceC6234g
    private static final byte y9n(int i2) {
        return C6475u.ld6((byte) i2);
    }

    @InterfaceC7396q
    public static String yz(int i2) {
        return String.valueOf(((long) i2) & 4294967295L);
    }

    /* JADX INFO: renamed from: z */
    public static int m22843z(int i2) {
        return Integer.hashCode(i2);
    }

    @InterfaceC6234g
    private static final int zurt(int i2, int i3) {
        return Integer.divideUnsigned(i2, i3);
    }

    public static final /* synthetic */ gyi zy(int i2) {
        return new gyi(i2);
    }

    public final /* synthetic */ int a98o() {
        return this.f36282k;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(gyi gyiVar) {
        return py.zy(a98o(), gyiVar.a98o());
    }

    public boolean equals(Object obj) {
        return cdj(this.f36282k, obj);
    }

    public int hashCode() {
        return m22843z(this.f36282k);
    }

    @InterfaceC7396q
    public String toString() {
        return yz(this.f36282k);
    }
}

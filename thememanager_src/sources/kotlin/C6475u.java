package kotlin;

import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.u */
/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@InterfaceC6761g
@yz(version = "1.5")
public final class C6475u implements Comparable<C6475u> {

    /* JADX INFO: renamed from: g */
    public static final byte f36757g = -1;

    /* JADX INFO: renamed from: n */
    public static final byte f36758n = 0;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final k f36759q = new k(null);

    /* JADX INFO: renamed from: s */
    public static final int f36760s = 8;

    /* JADX INFO: renamed from: y */
    public static final int f36761y = 1;

    /* JADX INFO: renamed from: k */
    private final byte f36762k;

    /* JADX INFO: renamed from: kotlin.u$k */
    /* JADX INFO: compiled from: UByte.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    @nn86
    @kotlin.internal.f7l8
    private /* synthetic */ C6475u(byte b2) {
        this.f36762k = b2;
    }

    @InterfaceC6234g
    private static final int a9(byte b2, short s2) {
        return gyi.ld6(gyi.ld6(b2 & 255) - gyi.ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: b */
    private static final short m23766b(byte b2) {
        return qo.ld6((short) (b2 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: c */
    private static final long m23767c(byte b2, long j2) {
        return ikck.ld6(ikck.ld6(((long) b2) & 255) * j2);
    }

    public static boolean cdj(byte b2, Object obj) {
        return (obj instanceof C6475u) && b2 == ((C6475u) obj).bf2();
    }

    @InterfaceC6234g
    private static final long d2ok(byte b2, long j2) {
        return ikck.ld6(ikck.ld6(((long) b2) & 255) + j2);
    }

    @InterfaceC6234g
    private static final short d3(byte b2, short s2) {
        return qo.ld6((short) Integer.remainderUnsigned(gyi.ld6(b2 & 255), gyi.ld6(s2 & qo.f36486g)));
    }

    @InterfaceC6234g
    private static final kotlin.ranges.fu4 dd(byte b2, byte b3) {
        return new kotlin.ranges.fu4(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255), null);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: e */
    private static final double m23768e(byte b2) {
        return b2 & 255;
    }

    @InterfaceC6234g
    private static final byte ek5k(byte b2) {
        return b2;
    }

    @InterfaceC6234g
    private static final int eqxt(byte b2, byte b3) {
        return gyi.ld6(gyi.ld6(b2 & 255) + gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: f */
    private static final int m23769f(byte b2, byte b3) {
        return gyi.ld6(gyi.ld6(b2 & 255) * gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    private static final int f7l8(byte b2, long j2) {
        return Long.compareUnsigned(ikck.ld6(((long) b2) & 255), j2);
    }

    @InterfaceC6234g
    private static final long fn3e(byte b2, long j2) {
        return Long.divideUnsigned(ikck.ld6(((long) b2) & 255), j2);
    }

    @InterfaceC6234g
    private static final byte fti(byte b2, byte b3) {
        return ld6((byte) Integer.remainderUnsigned(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255)));
    }

    @nn86
    public static /* synthetic */ void fu4() {
    }

    @InterfaceC6234g
    private static final int gvn7(byte b2, int i2) {
        return Integer.remainderUnsigned(gyi.ld6(b2 & 255), i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final int m23770h(byte b2, short s2) {
        return Integer.divideUnsigned(gyi.ld6(b2 & 255), gyi.ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    private static final int hb(byte b2) {
        return b2 & 255;
    }

    @InterfaceC6234g
    private static final int hyr(byte b2, short s2) {
        return Integer.remainderUnsigned(gyi.ld6(b2 & 255), gyi.ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final int m23771i(byte b2, byte b3) {
        return Integer.divideUnsigned(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    private static final byte i1(byte b2, byte b3) {
        return ld6((byte) (b2 ^ b3));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: j */
    private static final long m23772j(byte b2) {
        return ((long) b2) & 255;
    }

    @InterfaceC6234g
    private static final int jk(byte b2, int i2) {
        return gyi.ld6(gyi.ld6(b2 & 255) - i2);
    }

    @InterfaceC6234g
    private static final long jp0y(byte b2, long j2) {
        return Long.remainderUnsigned(ikck.ld6(((long) b2) & 255), j2);
    }

    public static final boolean ki(byte b2, byte b3) {
        return b2 == b3;
    }

    @InterfaceC6234g
    private static final int kja0(byte b2, int i2) {
        return Integer.divideUnsigned(gyi.ld6(b2 & 255), i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: l */
    private static final long m23773l(byte b2, long j2) {
        return Long.remainderUnsigned(ikck.ld6(((long) b2) & 255), j2);
    }

    @nn86
    @kotlin.internal.f7l8
    public static byte ld6(byte b2) {
        return b2;
    }

    @InterfaceC6234g
    private static final int lrht(byte b2, int i2) {
        return gyi.ld6(gyi.ld6(b2 & 255) * i2);
    }

    @InterfaceC6234g
    private static final int lvui(byte b2, int i2) {
        return gyi.ld6(gyi.ld6(b2 & 255) + i2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public static String m23774m(byte b2) {
        return String.valueOf(b2 & 255);
    }

    @InterfaceC6234g
    private static final long mcp(byte b2, long j2) {
        return ikck.ld6(ikck.ld6(((long) b2) & 255) - j2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static int m23775n(byte b2, byte b3) {
        return kotlin.jvm.internal.d2ok.m23076i(b2 & 255, b3 & 255);
    }

    @InterfaceC6234g
    private static final int n5r1(byte b2, int i2) {
        return Integer.remainderUnsigned(gyi.ld6(b2 & 255), i2);
    }

    @InterfaceC6234g
    private static final long n7h(byte b2, long j2) {
        return Long.divideUnsigned(ikck.ld6(((long) b2) & 255), j2);
    }

    @InterfaceC6234g
    private static final int ncyb(byte b2, byte b3) {
        return Integer.remainderUnsigned(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    private static final int ni7(byte b2, short s2) {
        return Integer.divideUnsigned(gyi.ld6(b2 & 255), gyi.ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    private static final float nn86(byte b2) {
        return b2 & 255;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: o */
    private static final short m23776o(byte b2) {
        return (short) (b2 & 255);
    }

    @InterfaceC6234g
    private static final byte o1t(byte b2) {
        return ld6((byte) (b2 + 1));
    }

    @InterfaceC6234g
    private static final byte oc(byte b2, byte b3) {
        return ld6((byte) (b2 | b3));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final int m23777p(byte b2, short s2) {
        return kotlin.jvm.internal.d2ok.m23076i(b2 & 255, s2 & qo.f36486g);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private int m23778q(byte b2) {
        return kotlin.jvm.internal.d2ok.m23076i(bf2() & 255, b2 & 255);
    }

    @InterfaceC6234g
    private static final int qrj(byte b2, byte b3) {
        return Integer.divideUnsigned(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: r */
    private static final int m23779r(byte b2, short s2) {
        return gyi.ld6(gyi.ld6(b2 & 255) + gyi.ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final int m23780s(byte b2, int i2) {
        return Integer.compareUnsigned(gyi.ld6(b2 & 255), i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final int m23781t(byte b2, byte b3) {
        return gyi.ld6(gyi.ld6(b2 & 255) - gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    private static final byte toq(byte b2, byte b3) {
        return ld6((byte) (b2 & b3));
    }

    @InterfaceC6234g
    private static final int uv6(byte b2, short s2) {
        return gyi.ld6(gyi.ld6(b2 & 255) * gyi.ld6(s2 & qo.f36486g));
    }

    @InterfaceC6234g
    private static final byte vyq(byte b2) {
        return b2;
    }

    @InterfaceC6234g
    private static final byte wvg(byte b2) {
        return ld6((byte) (~b2));
    }

    @InterfaceC6234g
    private static final byte x2(byte b2) {
        return ld6((byte) (b2 - 1));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final kotlin.ranges.fu4 x9kr(byte b2, byte b3) {
        return kotlin.ranges.mcp.m23330c(gyi.ld6(b2 & 255), gyi.ld6(b3 & 255));
    }

    @InterfaceC6234g
    private static final long y9n(byte b2) {
        return ikck.ld6(((long) b2) & 255);
    }

    @InterfaceC6234g
    private static final int yz(byte b2) {
        return gyi.ld6(b2 & 255);
    }

    /* JADX INFO: renamed from: z */
    public static int m23782z(byte b2) {
        return Byte.hashCode(b2);
    }

    @InterfaceC6234g
    private static final int zurt(byte b2, int i2) {
        return Integer.divideUnsigned(gyi.ld6(b2 & 255), i2);
    }

    public static final /* synthetic */ C6475u zy(byte b2) {
        return new C6475u(b2);
    }

    public final /* synthetic */ byte bf2() {
        return this.f36762k;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C6475u c6475u) {
        return kotlin.jvm.internal.d2ok.m23076i(bf2() & 255, c6475u.bf2() & 255);
    }

    public boolean equals(Object obj) {
        return cdj(this.f36762k, obj);
    }

    public int hashCode() {
        return m23782z(this.f36762k);
    }

    @InterfaceC7396q
    public String toString() {
        return m23774m(this.f36762k);
    }
}

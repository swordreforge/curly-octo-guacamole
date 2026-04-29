package kotlin;

import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes3.dex */
@i9jn(markerClass = {InterfaceC6232i.class})
@InterfaceC6761g
@yz(version = "1.5")
public final class qo implements Comparable<qo> {

    /* JADX INFO: renamed from: g */
    public static final short f36486g = -1;

    /* JADX INFO: renamed from: n */
    public static final short f36487n = 0;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6330k f36488q = new C6330k(null);

    /* JADX INFO: renamed from: s */
    public static final int f36489s = 16;

    /* JADX INFO: renamed from: y */
    public static final int f36490y = 2;

    /* JADX INFO: renamed from: k */
    private final short f36491k;

    /* JADX INFO: renamed from: kotlin.qo$k */
    /* JADX INFO: compiled from: UShort.kt */
    public static final class C6330k {
        private C6330k() {
        }

        public /* synthetic */ C6330k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    @nn86
    @kotlin.internal.f7l8
    private /* synthetic */ qo(short s2) {
        this.f36491k = s2;
    }

    @InterfaceC6234g
    private static final int a9(short s2, short s3) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) - gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: b */
    private static final short m23249b(short s2) {
        return s2;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: c */
    private static final long m23250c(short s2, long j2) {
        return ikck.ld6(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i) * j2);
    }

    public static boolean cdj(short s2, Object obj) {
        return (obj instanceof qo) && s2 == ((qo) obj).bf2();
    }

    @InterfaceC6234g
    private static final long d2ok(short s2, long j2) {
        return ikck.ld6(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i) + j2);
    }

    @InterfaceC6234g
    private static final short d3(short s2, short s3) {
        return ld6((short) Integer.remainderUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(s3 & f36486g)));
    }

    @InterfaceC6234g
    private static final kotlin.ranges.fu4 dd(short s2, short s3) {
        return new kotlin.ranges.fu4(gyi.ld6(s2 & f36486g), gyi.ld6(s3 & f36486g), null);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: e */
    private static final double m23251e(short s2) {
        return s2 & f36486g;
    }

    @InterfaceC6234g
    private static final byte ek5k(short s2) {
        return C6475u.ld6((byte) s2);
    }

    @InterfaceC6234g
    private static final int eqxt(short s2, byte b2) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) + gyi.ld6(b2 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: f */
    private static final int m23252f(short s2, byte b2) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) * gyi.ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final int f7l8(short s2, int i2) {
        return Integer.compareUnsigned(gyi.ld6(s2 & f36486g), i2);
    }

    @InterfaceC6234g
    private static final long fn3e(short s2, long j2) {
        return Long.divideUnsigned(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i), j2);
    }

    @InterfaceC6234g
    private static final byte fti(short s2, byte b2) {
        return C6475u.ld6((byte) Integer.remainderUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(b2 & 255)));
    }

    @nn86
    public static /* synthetic */ void fu4() {
    }

    @InterfaceC6234g
    private static final int gvn7(short s2, int i2) {
        return Integer.remainderUnsigned(gyi.ld6(s2 & f36486g), i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final int m23253h(short s2, short s3) {
        return Integer.divideUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    private static final int hb(short s2) {
        return s2 & f36486g;
    }

    @InterfaceC6234g
    private static final int hyr(short s2, short s3) {
        return Integer.remainderUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final int m23254i(short s2, byte b2) {
        return Integer.divideUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final short i1(short s2, short s3) {
        return ld6((short) (s2 ^ s3));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: j */
    private static final long m23255j(short s2) {
        return ((long) s2) & okhttp3.internal.ws.f7l8.f43390i;
    }

    @InterfaceC6234g
    private static final int jk(short s2, int i2) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) - i2);
    }

    @InterfaceC6234g
    private static final long jp0y(short s2, long j2) {
        return Long.remainderUnsigned(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i), j2);
    }

    public static final boolean ki(short s2, short s3) {
        return s2 == s3;
    }

    @InterfaceC6234g
    private static final int kja0(short s2, int i2) {
        return Integer.divideUnsigned(gyi.ld6(s2 & f36486g), i2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: l */
    private static final long m23256l(short s2, long j2) {
        return Long.remainderUnsigned(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i), j2);
    }

    @nn86
    @kotlin.internal.f7l8
    public static short ld6(short s2) {
        return s2;
    }

    @InterfaceC6234g
    private static final int lrht(short s2, int i2) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) * i2);
    }

    @InterfaceC6234g
    private static final int lvui(short s2, int i2) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) + i2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public static String m23257m(short s2) {
        return String.valueOf(s2 & f36486g);
    }

    @InterfaceC6234g
    private static final long mcp(short s2, long j2) {
        return ikck.ld6(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i) - j2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final int m23258n(short s2, long j2) {
        return Long.compareUnsigned(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i), j2);
    }

    @InterfaceC6234g
    private static final int n5r1(short s2, int i2) {
        return Integer.remainderUnsigned(gyi.ld6(s2 & f36486g), i2);
    }

    @InterfaceC6234g
    private static final long n7h(short s2, long j2) {
        return Long.divideUnsigned(ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i), j2);
    }

    @InterfaceC6234g
    private static final int ncyb(short s2, byte b2) {
        return Integer.remainderUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final int ni7(short s2, short s3) {
        return Integer.divideUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    private static final float nn86(short s2) {
        return s2 & f36486g;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: o */
    private static final short m23259o(short s2) {
        return s2;
    }

    @InterfaceC6234g
    private static final short o1t(short s2) {
        return ld6((short) (s2 + 1));
    }

    @InterfaceC6234g
    private static final short oc(short s2, short s3) {
        return ld6((short) (s2 | s3));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static int m23260p(short s2, short s3) {
        return kotlin.jvm.internal.d2ok.m23076i(s2 & f36486g, s3 & f36486g);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: q */
    private static final int m23261q(short s2, byte b2) {
        return kotlin.jvm.internal.d2ok.m23076i(s2 & f36486g, b2 & 255);
    }

    @InterfaceC6234g
    private static final int qrj(short s2, byte b2) {
        return Integer.divideUnsigned(gyi.ld6(s2 & f36486g), gyi.ld6(b2 & 255));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: r */
    private static final int m23262r(short s2, short s3) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) + gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private int m23263s(short s2) {
        return kotlin.jvm.internal.d2ok.m23076i(bf2() & f36486g, s2 & f36486g);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final int m23264t(short s2, byte b2) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) - gyi.ld6(b2 & 255));
    }

    @InterfaceC6234g
    private static final short toq(short s2, short s3) {
        return ld6((short) (s2 & s3));
    }

    @InterfaceC6234g
    private static final int uv6(short s2, short s3) {
        return gyi.ld6(gyi.ld6(s2 & f36486g) * gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    private static final byte vyq(short s2) {
        return (byte) s2;
    }

    @InterfaceC6234g
    private static final short wvg(short s2) {
        return ld6((short) (~s2));
    }

    @InterfaceC6234g
    private static final short x2(short s2) {
        return ld6((short) (s2 - 1));
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.9")
    private static final kotlin.ranges.fu4 x9kr(short s2, short s3) {
        return kotlin.ranges.mcp.m23330c(gyi.ld6(s2 & f36486g), gyi.ld6(s3 & f36486g));
    }

    @InterfaceC6234g
    private static final long y9n(short s2) {
        return ikck.ld6(((long) s2) & okhttp3.internal.ws.f7l8.f43390i);
    }

    @InterfaceC6234g
    private static final int yz(short s2) {
        return gyi.ld6(s2 & f36486g);
    }

    /* JADX INFO: renamed from: z */
    public static int m23265z(short s2) {
        return Short.hashCode(s2);
    }

    @InterfaceC6234g
    private static final int zurt(short s2, int i2) {
        return Integer.divideUnsigned(gyi.ld6(s2 & f36486g), i2);
    }

    public static final /* synthetic */ qo zy(short s2) {
        return new qo(s2);
    }

    public final /* synthetic */ short bf2() {
        return this.f36491k;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(qo qoVar) {
        return kotlin.jvm.internal.d2ok.m23076i(bf2() & f36486g, qoVar.bf2() & f36486g);
    }

    public boolean equals(Object obj) {
        return cdj(this.f36491k, obj);
    }

    public int hashCode() {
        return m23265z(this.f36491k);
    }

    @InterfaceC7396q
    public String toString() {
        return m23257m(this.f36491k);
    }
}

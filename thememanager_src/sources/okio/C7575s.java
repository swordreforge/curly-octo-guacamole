package okio;

import kotlin.jvm.internal.lv5;
import kotlin.qo;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;
import okio.x2;

/* JADX INFO: renamed from: okio.s */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
@InterfaceC6769y(name = "-SegmentedByteString")
public final class C7575s {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final x2.C7577k f43833k = new x2.C7577k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f94307toq = -1234567890;

    public static final short cdj(short s2) {
        int i2 = s2 & qo.f36486g;
        return (short) (((i2 & 255) << 8) | ((65280 & i2) >>> 8));
    }

    @InterfaceC7396q
    public static final x2.C7577k f7l8() {
        return f43833k;
    }

    @InterfaceC7396q
    public static final String fn3e(byte b2) {
        return kotlin.text.a9.wx16(new char[]{okio.internal.toq.oc()[(b2 >> 4) & 15], okio.internal.toq.oc()[b2 & com.google.common.base.zy.f68111cdj]});
    }

    public static final byte fu4(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }

    /* JADX INFO: renamed from: g */
    public static final int m27851g() {
        return f94307toq;
    }

    /* JADX INFO: renamed from: h */
    public static final long m27852h(long j2) {
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    /* JADX INFO: renamed from: i */
    public static final int m27853i(byte b2, int i2) {
        return b2 >> i2;
    }

    /* JADX INFO: renamed from: k */
    public static final int m27854k(byte b2, int i2) {
        return b2 & i2;
    }

    public static final long ki(long j2, int i2) {
        return (j2 << (64 - i2)) | (j2 >>> i2);
    }

    public static final int kja0(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final long ld6(long j2, int i2) {
        return Math.min(j2, i2);
    }

    /* JADX INFO: renamed from: n */
    public static final void m27855n(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    @InterfaceC7396q
    public static final x2.C7577k n7h(@InterfaceC7396q x2.C7577k unsafeCursor) {
        kotlin.jvm.internal.d2ok.m23075h(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f43833k ? new x2.C7577k() : unsafeCursor;
    }

    @InterfaceC7396q
    public static final String ni7(long j2) {
        if (j2 == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {okio.internal.toq.oc()[(int) ((j2 >> 60) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 56) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 52) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 48) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 44) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 40) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 36) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 32) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 28) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 24) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 20) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 16) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 12) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 8) & 15)], okio.internal.toq.oc()[(int) ((j2 >> 4) & 15)], okio.internal.toq.oc()[(int) (j2 & 15)]};
        while (i2 < 16 && cArr[i2] == '0') {
            i2++;
        }
        return kotlin.text.a9.ixz(cArr, i2, 16);
    }

    /* JADX INFO: renamed from: p */
    public static final long m27856p(int i2, long j2) {
        return Math.min(i2, j2);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m27857q(@InterfaceC7396q byte[] a2, int i2, @InterfaceC7396q byte[] b2, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(a2, "a");
        kotlin.jvm.internal.d2ok.m23075h(b2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2[i5 + i2] != b2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final int qrj(@InterfaceC7396q byte[] bArr, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        return i2 == f94307toq ? bArr.length : i2;
    }

    /* JADX INFO: renamed from: s */
    public static final int m27858s(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public static final int t8r(byte b2, int i2) {
        return b2 << i2;
    }

    public static final long toq(byte b2, long j2) {
        return ((long) b2) & j2;
    }

    public static final int x2(@InterfaceC7396q kja0 kja0Var, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(kja0Var, "<this>");
        return i2 == f94307toq ? kja0Var.size() : i2;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m27859y() {
    }

    @InterfaceC7396q
    public static final String zurt(int i2) {
        if (i2 == 0) {
            return "0";
        }
        int i3 = 0;
        char[] cArr = {okio.internal.toq.oc()[(i2 >> 28) & 15], okio.internal.toq.oc()[(i2 >> 24) & 15], okio.internal.toq.oc()[(i2 >> 20) & 15], okio.internal.toq.oc()[(i2 >> 16) & 15], okio.internal.toq.oc()[(i2 >> 12) & 15], okio.internal.toq.oc()[(i2 >> 8) & 15], okio.internal.toq.oc()[(i2 >> 4) & 15], okio.internal.toq.oc()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        return kotlin.text.a9.ixz(cArr, i3, 8);
    }

    public static final long zy(int i2, long j2) {
        return ((long) i2) & j2;
    }
}

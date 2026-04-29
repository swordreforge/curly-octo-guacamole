package okio;

import java.util.Arrays;
import kotlin.io.encoding.C6247k;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;

/* JADX INFO: renamed from: okio.k */
/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC6769y(name = "-Base64")
public final class C7562k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final byte[] f43777k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f94290toq;

    static {
        kja0.C7563k c7563k = kja0.Companion;
        f43777k = c7563k.x2("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f94290toq = c7563k.x2("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    public static /* synthetic */ void f7l8() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final byte[] m27771g() {
        return f94290toq;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final byte[] m27772k(@InterfaceC7396q String str) {
        int i2;
        char cCharAt;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 >= length) {
                int i8 = i5 % 4;
                if (i8 == 1) {
                    return null;
                }
                if (i8 == 2) {
                    bArr[i7] = (byte) ((i6 << 12) >> 16);
                    i7++;
                } else if (i8 == 3) {
                    int i9 = i6 << 6;
                    int i10 = i7 + 1;
                    bArr[i7] = (byte) (i9 >> 16);
                    i7 = i10 + 1;
                    bArr[i10] = (byte) (i9 >> 8);
                }
                if (i7 == i3) {
                    return bArr;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
                kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            char cCharAt2 = str.charAt(i4);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i2 = cCharAt2 - 'A';
            } else {
                if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i2 = cCharAt2 - 'G';
                } else {
                    if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i2 = cCharAt2 + 4;
                    } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                        i2 = 62;
                    } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                        i2 = 63;
                    } else {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            return null;
                        }
                        i4++;
                    }
                }
            }
            i6 = (i6 << 6) | i2;
            i5++;
            if (i5 % 4 == 0) {
                int i11 = i7 + 1;
                bArr[i7] = (byte) (i6 >> 16);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i6 >> 8);
                bArr[i12] = (byte) i6;
                i7 = i12 + 1;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m27773n() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final byte[] m27774q() {
        return f43777k;
    }

    @InterfaceC7396q
    public static final String toq(@InterfaceC7396q byte[] bArr, @InterfaceC7396q byte[] map) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i5 + 1;
            byte b4 = bArr[i5];
            int i7 = i3 + 1;
            bArr2[i3] = map[(b2 & 255) >> 2];
            int i8 = i7 + 1;
            bArr2[i7] = map[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr2[i8] = map[((b3 & com.google.common.base.zy.f68111cdj) << 2) | ((b4 & 255) >> 6)];
            i3 = i9 + 1;
            bArr2[i9] = map[b4 & C7571o.f43818k];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            int i10 = i3 + 1;
            bArr2[i3] = map[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr2[i10] = map[(b5 & 3) << 4];
            bArr2[i11] = C6247k.f36300y;
            bArr2[i11 + 1] = C6247k.f36300y;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = bArr[i2];
            byte b9 = bArr[i12];
            int i13 = i3 + 1;
            bArr2[i3] = map[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr2[i13] = map[((b6 & 3) << 4) | ((b9 & 255) >> 4)];
            bArr2[i14] = map[(b9 & com.google.common.base.zy.f68111cdj) << 2];
            bArr2[i14 + 1] = C6247k.f36300y;
        }
        return ek5k.zy(bArr2);
    }

    public static /* synthetic */ String zy(byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr2 = f43777k;
        }
        return toq(bArr, bArr2);
    }
}

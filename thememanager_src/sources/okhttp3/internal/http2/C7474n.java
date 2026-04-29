package okhttp3.internal.http2;

import b7.C1359g;
import kotlin.jvm.internal.d2ok;
import kotlin.text.a9;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import okio.kja0;

/* JADX INFO: renamed from: okhttp3.internal.http2.n */
/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7474n {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f93943cdj = 4;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f93944f7l8 = 3;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f93945fn3e = 32;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @InterfaceC7396q
    private static final String[] f93946fu4;

    /* JADX INFO: renamed from: g */
    public static final int f43254g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f43255h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f43256i = 32;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f93947ki = 4;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f93948kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f93949ld6 = 7;

    /* JADX INFO: renamed from: n */
    public static final int f43258n = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f93950n7h = 0;

    /* JADX INFO: renamed from: p */
    public static final int f43259p = 6;

    /* JADX INFO: renamed from: q */
    public static final int f43260q = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f93952qrj = 9;

    /* JADX INFO: renamed from: s */
    public static final int f43261s = 5;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f93953t8r = 8;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f93955x2 = 8;

    /* JADX INFO: renamed from: y */
    public static final int f43262y = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f93957zy = 16384;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7474n f43257k = new C7474n();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final kja0 f93954toq = kja0.Companion.x2("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @InterfaceC7396q
    private static final String[] f93956zurt = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    @InterfaceC7396q
    private static final String[] f93951ni7 = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            d2ok.kja0(binaryString, "toBinaryString(it)");
            strArr[i2] = a9.nnh(C1359g.m5769z("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f93946fu4 = strArr;
        String[] strArr2 = f93951ni7;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f93951ni7;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = f93951ni7;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f93951ni7;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        int length = f93951ni7.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = f93951ni7;
            if (strArr6[i10] == null) {
                strArr6[i10] = f93946fu4[i10];
            }
        }
    }

    private C7474n() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final String m27139k(int i2, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4 || i2 == 6) {
                return i3 == 1 ? "ACK" : f93946fu4[i3];
            }
            if (i2 != 7 && i2 != 8) {
                String[] strArr = f93951ni7;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    d2ok.qrj(str);
                } else {
                    str = f93946fu4[i3];
                }
                String str2 = str;
                return (i2 != 5 || (i3 & 4) == 0) ? (i2 != 0 || (i3 & 32) == 0) ? str2 : a9.uf(str2, "PRIORITY", "COMPRESSED", false, 4, null) : a9.uf(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f93946fu4[i3];
    }

    @InterfaceC7396q
    public final String toq(int i2) {
        String[] strArr = f93956zurt;
        return i2 < strArr.length ? strArr[i2] : C1359g.m5769z("0x%02x", Integer.valueOf(i2));
    }

    @InterfaceC7396q
    public final String zy(boolean z2, int i2, int i3, int i4, int i5) {
        return C1359g.m5769z("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), toq(i4), m27139k(i4, i5));
    }
}

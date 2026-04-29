package okhttp3.internal.ws;

import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;
import okio.x2;

/* JADX INFO: compiled from: WebSocketProtocol.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final long f94017cdj = 125;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f94018f7l8 = 15;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f94019fn3e = 127;

    /* JADX INFO: renamed from: g */
    public static final int f43388g = 16;

    /* JADX INFO: renamed from: h */
    public static final int f43389h = 10;

    /* JADX INFO: renamed from: i */
    public static final long f43390i = 65535;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final f7l8 f43391k = new f7l8();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final long f94020ki = 123;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f94021kja0 = 9;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f94022ld6 = 0;

    /* JADX INFO: renamed from: n */
    public static final int f43392n = 32;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f94023n7h = 8;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f94024ni7 = 1005;

    /* JADX INFO: renamed from: p */
    public static final int f43393p = 127;

    /* JADX INFO: renamed from: q */
    public static final int f43394q = 64;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f94025qrj = 2;

    /* JADX INFO: renamed from: s */
    public static final int f43395s = 128;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f94026t8r = 126;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f94027toq = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f94028x2 = 1;

    /* JADX INFO: renamed from: y */
    public static final int f43396y = 8;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f94029zurt = 1001;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f94030zy = 128;

    private f7l8() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final String m27270k(@InterfaceC7396q String key) {
        d2ok.m23075h(key, "key");
        return kja0.Companion.x2(key + f94027toq).sha1().base64();
    }

    /* JADX INFO: renamed from: q */
    public final void m27271q(int i2) {
        String qVar = toq(i2);
        if (qVar == null) {
            return;
        }
        d2ok.qrj(qVar);
        throw new IllegalArgumentException(qVar.toString());
    }

    @InterfaceC7395n
    public final String toq(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): " + i2;
        }
        if (!(1004 <= i2 && i2 < 1007)) {
            if (!(1015 <= i2 && i2 < 3000)) {
                return null;
            }
        }
        return "Code " + i2 + " is reserved and may not be used.";
    }

    public final void zy(@InterfaceC7396q x2.C7577k cursor, @InterfaceC7396q byte[] key) {
        d2ok.m23075h(cursor, "cursor");
        d2ok.m23075h(key, "key");
        int length = key.length;
        int i2 = 0;
        do {
            byte[] bArr = cursor.f43854y;
            int i3 = cursor.f43853s;
            int i4 = cursor.f43851p;
            if (bArr != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr[i3] = (byte) (bArr[i3] ^ key[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
        } while (cursor.m27876q() != -1);
    }
}

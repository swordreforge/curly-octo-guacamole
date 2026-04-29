package okhttp3.internal.http2;

import b7.C1359g;
import java.io.IOException;
import kotlin.collections.kja0;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Huffman.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ld6 {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final C7473k f43252q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f93940zy;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ld6 f43251k = new ld6();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final int[] f93939toq = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    static {
        byte[] bArr = {com.google.common.base.zy.f68124kja0, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68120gvn7, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68118fti, 6, 10, 10, com.google.common.base.zy.f68128n7h, com.google.common.base.zy.f68124kja0, 6, 8, com.google.common.base.zy.f68132qrj, 10, 10, 8, com.google.common.base.zy.f68132qrj, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, com.google.common.base.zy.f68111cdj, 6, com.google.common.base.zy.f68128n7h, 10, com.google.common.base.zy.f68124kja0, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, com.google.common.base.zy.f68124kja0, 19, com.google.common.base.zy.f68124kja0, com.google.common.base.zy.f25751h, 6, com.google.common.base.zy.f68111cdj, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, com.google.common.base.zy.f68111cdj, com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f25751h, com.google.common.base.zy.f68124kja0, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25759t, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f25759t, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f25761z, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68119fu4, 19, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68127mcp, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68127mcp, 19, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f25759t, com.google.common.base.zy.f25761z, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68119fu4, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f25761z, com.google.common.base.zy.f25761z, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68130o1t, com.google.common.base.zy.f68127mcp, com.google.common.base.zy.f68127mcp, com.google.common.base.zy.f25759t, com.google.common.base.zy.f25759t, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68135wvg, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68121jk, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68118fti, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68110a9, com.google.common.base.zy.f68121jk};
        f93940zy = bArr;
        f43252q = new C7473k();
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            f43251k.m27136k(i2, f93939toq[i2], f93940zy[i2]);
        }
    }

    private ld6() {
    }

    /* JADX INFO: renamed from: k */
    private final void m27136k(int i2, int i3, int i4) {
        C7473k c7473k = new C7473k(i2, i4);
        C7473k c7473k2 = f43252q;
        while (i4 > 8) {
            i4 -= 8;
            int i5 = (i3 >>> i4) & 255;
            C7473k[] c7473kArrM27138k = c7473k2.m27138k();
            d2ok.qrj(c7473kArrM27138k);
            C7473k c7473k3 = c7473kArrM27138k[i5];
            if (c7473k3 == null) {
                c7473k3 = new C7473k();
                c7473kArrM27138k[i5] = c7473k3;
            }
            c7473k2 = c7473k3;
        }
        int i6 = 8 - i4;
        int i7 = (i3 << i6) & 255;
        C7473k[] c7473kArrM27138k2 = c7473k2.m27138k();
        d2ok.qrj(c7473kArrM27138k2);
        kja0.vy(c7473kArrM27138k2, c7473k, i7, (1 << i6) + i7);
    }

    /* JADX INFO: renamed from: q */
    public final int m27137q(@InterfaceC7396q okio.kja0 bytes) {
        d2ok.m23075h(bytes, "bytes");
        int size = bytes.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 += (long) f93940zy[C1359g.m5763q(bytes.getByte(i2), 255)];
        }
        return (int) ((j2 + ((long) 7)) >> 3);
    }

    public final void toq(@InterfaceC7396q okio.n7h source, long j2, @InterfaceC7396q okio.qrj sink) throws IOException {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(sink, "sink");
        C7473k c7473k = f43252q;
        int iM5763q = 0;
        int iZy = 0;
        for (long j3 = 0; j3 < j2; j3++) {
            iM5763q = (iM5763q << 8) | C1359g.m5763q(source.readByte(), 255);
            iZy += 8;
            while (iZy >= 8) {
                C7473k[] c7473kArrM27138k = c7473k.m27138k();
                d2ok.qrj(c7473kArrM27138k);
                c7473k = c7473kArrM27138k[(iM5763q >>> (iZy - 8)) & 255];
                d2ok.qrj(c7473k);
                if (c7473k.m27138k() == null) {
                    sink.writeByte(c7473k.toq());
                    iZy -= c7473k.zy();
                    c7473k = f43252q;
                } else {
                    iZy -= 8;
                }
            }
        }
        while (iZy > 0) {
            C7473k[] c7473kArrM27138k2 = c7473k.m27138k();
            d2ok.qrj(c7473kArrM27138k2);
            C7473k c7473k2 = c7473kArrM27138k2[(iM5763q << (8 - iZy)) & 255];
            d2ok.qrj(c7473k2);
            if (c7473k2.m27138k() != null || c7473k2.zy() > iZy) {
                return;
            }
            sink.writeByte(c7473k2.toq());
            iZy -= c7473k2.zy();
            c7473k = f43252q;
        }
    }

    public final void zy(@InterfaceC7396q okio.kja0 source, @InterfaceC7396q okio.qrj sink) throws IOException {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(sink, "sink");
        int size = source.size();
        long j2 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iM5763q = C1359g.m5763q(source.getByte(i3), 255);
            int i4 = f93939toq[iM5763q];
            byte b2 = f93940zy[iM5763q];
            j2 = (j2 << b2) | ((long) i4);
            i2 += b2;
            while (i2 >= 8) {
                i2 -= 8;
                sink.writeByte((int) (j2 >> i2));
            }
        }
        if (i2 > 0) {
            sink.writeByte((int) ((j2 << (8 - i2)) | (255 >>> i2)));
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.ld6$k */
    /* JADX INFO: compiled from: Huffman.kt */
    private static final class C7473k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private final C7473k[] f43253k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f93941toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f93942zy;

        public C7473k() {
            this.f43253k = new C7473k[256];
            this.f93941toq = 0;
            this.f93942zy = 0;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final C7473k[] m27138k() {
            return this.f43253k;
        }

        public final int toq() {
            return this.f93941toq;
        }

        public final int zy() {
            return this.f93942zy;
        }

        public C7473k(int i2, int i3) {
            this.f43253k = null;
            this.f93941toq = i2;
            int i4 = i3 & 7;
            this.f93942zy = i4 == 0 ? 8 : i4;
        }
    }
}

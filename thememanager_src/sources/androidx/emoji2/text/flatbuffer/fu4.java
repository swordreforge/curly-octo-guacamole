package androidx.emoji2.text.flatbuffer;

import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import java.nio.ByteBuffer;
import okio.C7571o;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu4 {

    /* JADX INFO: renamed from: k */
    private static fu4 f4443k;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.fu4$k */
    /* JADX INFO: compiled from: Utf8.java */
    static class C0807k {
        C0807k() {
        }

        static boolean f7l8(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: renamed from: g */
        private static boolean m3872g(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: renamed from: k */
        static void m3873k(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws IllegalArgumentException {
            if (m3872g(b3) || (((b2 << com.google.common.base.zy.f68118fti) + (b3 + 112)) >> 30) != 0 || m3872g(b4) || m3872g(b5)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iLd6 = ((b2 & 7) << 18) | (ld6(b3) << 12) | (ld6(b4) << 6) | ld6(b5);
            cArr[i2] = m3874n(iLd6);
            cArr[i2 + 1] = m3875p(iLd6);
        }

        private static int ld6(byte b2) {
            return b2 & C7571o.f43818k;
        }

        /* JADX INFO: renamed from: n */
        private static char m3874n(int i2) {
            return (char) ((i2 >>> 10) + C7571o.f43820q);
        }

        /* JADX INFO: renamed from: p */
        private static char m3875p(int i2) {
            return (char) ((i2 & InterfaceC3239x.f63281ncyb) + C7571o.f43819n);
        }

        /* JADX INFO: renamed from: q */
        static void m3876q(byte b2, byte b3, char[] cArr, int i2) throws IllegalArgumentException {
            if (b2 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (m3872g(b3)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i2] = (char) (((b2 & com.google.common.base.zy.f68113d3) << 6) | ld6(b3));
        }

        /* JADX INFO: renamed from: s */
        static boolean m3877s(byte b2) {
            return b2 < -32;
        }

        static void toq(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX INFO: renamed from: y */
        static boolean m3878y(byte b2) {
            return b2 < -16;
        }

        static void zy(byte b2, byte b3, byte b4, char[] cArr, int i2) throws IllegalArgumentException {
            if (m3872g(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m3872g(b4)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i2] = (char) (((b2 & com.google.common.base.zy.f68111cdj) << 12) | (ld6(b3) << 6) | ld6(b4));
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    static class toq extends IllegalArgumentException {
        toq(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3869n(fu4 fu4Var) {
        f4443k = fu4Var;
    }

    /* JADX INFO: renamed from: q */
    public static fu4 m3870q() {
        if (f4443k == null) {
            f4443k = new wvg();
        }
        return f4443k;
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo3871k(ByteBuffer byteBuffer, int i2, int i3);

    public abstract void toq(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int zy(CharSequence charSequence);
}

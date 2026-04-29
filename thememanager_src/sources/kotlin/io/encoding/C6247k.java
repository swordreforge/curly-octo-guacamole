package kotlin.io.encoding;

import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.C6433g;
import kotlin.yz;
import mub.InterfaceC7396q;
import okio.C7571o;

/* JADX INFO: renamed from: kotlin.io.encoding.k */
/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6246g
@yz(version = "1.8")
public class C6247k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f81792f7l8 = 4;

    /* JADX INFO: renamed from: g */
    public static final int f36295g = 3;

    /* JADX INFO: renamed from: n */
    private static final int f36296n = 6;

    /* JADX INFO: renamed from: p */
    private static final int f36297p = 19;

    /* JADX INFO: renamed from: q */
    private static final int f36298q = 8;

    /* JADX INFO: renamed from: s */
    public static final int f36299s = 76;

    /* JADX INFO: renamed from: y */
    public static final byte f36300y = 61;

    /* JADX INFO: renamed from: k */
    private final boolean f36301k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f81797toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f81796zy = new k(null);

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f81793ld6 = {com.google.common.base.zy.f68124kja0, 10};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6247k f81795x2 = new C6247k(true, false);

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6247k f81794qrj = new C6247k(false, true);

    /* JADX INFO: renamed from: kotlin.io.encoding.k$k */
    /* JADX INFO: compiled from: Base64.kt */
    public static final class k extends C6247k {
        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            boolean z2 = false;
            super(z2, z2, null);
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        public final C6247k d3() {
            return C6247k.f81795x2;
        }

        @InterfaceC7396q
        public final byte[] gvn7() {
            return C6247k.f81793ld6;
        }

        @InterfaceC7396q
        public final C6247k jp0y() {
            return C6247k.f81794qrj;
        }
    }

    private C6247k(boolean z2, boolean z3) {
        this.f36301k = z2;
        this.f81797toq = z3;
        if (!((z2 && z3) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ C6247k(boolean z2, boolean z3, ni7 ni7Var) {
        this(z2, z3);
    }

    private final int cdj(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 == 0) {
            return 0;
        }
        if (i4 == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i2 + ", endIndex: " + i3);
        }
        if (this.f81797toq) {
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i5 = zy.f81798toq[bArr[i2] & 255];
                if (i5 < 0) {
                    if (i5 == -2) {
                        i4 -= i3 - i2;
                        break;
                    }
                    i4--;
                }
                i2++;
            }
        } else if (bArr[i3 - 1] == 61) {
            i4--;
            if (bArr[i3 - 2] == 61) {
                i4--;
            }
        }
        return (int) ((((long) i4) * ((long) 6)) / ((long) 8));
    }

    public static /* synthetic */ int fn3e(C6247k c6247k, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i6 = (i5 & 4) != 0 ? 0 : i2;
        int i7 = (i5 & 8) != 0 ? 0 : i3;
        if ((i5 & 16) != 0) {
            i4 = bArr.length;
        }
        return c6247k.m22895i(bArr, bArr2, i6, i7, i4);
    }

    private final int fti(byte[] bArr, int i2, int i3) {
        if (!this.f81797toq) {
            return i2;
        }
        while (i2 < i3) {
            if (zy.f81798toq[bArr[i2] & 255] != -1) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    private final void m22890g(int i2, int i3, int i4) {
        if (i3 < 0 || i3 > i2) {
            throw new IndexOutOfBoundsException("destination offset: " + i3 + ", destination size: " + i2);
        }
        int i5 = i3 + i4;
        if (i5 < 0 || i5 > i2) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i3 + ", destination size: " + i2 + ", capacity needed: " + i4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m22891h(C6247k c6247k, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i6 = (i5 & 4) != 0 ? 0 : i2;
        int i7 = (i5 & 8) != 0 ? 0 : i3;
        if ((i5 & 16) != 0) {
            i4 = bArr.length;
        }
        return c6247k.n7h(bArr, bArr2, i6, i7, i4);
    }

    public static /* synthetic */ int kja0(C6247k c6247k, CharSequence charSequence, byte[] bArr, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i6 = (i5 & 4) != 0 ? 0 : i2;
        int i7 = (i5 & 8) != 0 ? 0 : i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        return c6247k.qrj(charSequence, bArr, i6, i7, i4);
    }

    public static /* synthetic */ byte[] ld6(C6247k c6247k, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return c6247k.m22898s(bArr, i2, i3);
    }

    private final int mcp(byte[] bArr, int i2, int i3, int i4) {
        if (i4 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i2);
        }
        if (i4 != -6) {
            if (i4 == -4) {
                i2 = fti(bArr, i2 + 1, i3);
                if (i2 == i3 || bArr[i2] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i2);
                }
            } else if (i4 != -2) {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return i2 + 1;
    }

    private final int ni7(int i2) {
        int i3 = ((i2 + 3) - 1) / 3;
        int i4 = (i3 * 4) + ((this.f81797toq ? (i3 - 1) / 19 : 0) * 2);
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ byte[] m22893p(C6247k c6247k, CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = charSequence.length();
        }
        return c6247k.m22900y(charSequence, i2, i3);
    }

    public static /* synthetic */ String t8r(C6247k c6247k, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return c6247k.ki(bArr, i2, i3);
    }

    public static /* synthetic */ byte[] wvg(C6247k c6247k, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = bArr.length;
        }
        return c6247k.o1t(bArr, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r7 == (-2)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r3 = fti(r19, r4, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        if (r3 < r23) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        return r8 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        r1 = r19[r3] & 255;
        r4 = new java.lang.StringBuilder();
        r4.append("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        r1 = java.lang.Integer.toString(r1, kotlin.text.C6452q.m23604k(8));
        kotlin.jvm.internal.d2ok.kja0(r1, "toString(this, checkRadix(radix))");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
    
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int x2(byte[] r19, byte[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.C6247k.x2(byte[], byte[], int, int, int):int");
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Appendable m22894z(C6247k c6247k, byte[] bArr, Appendable appendable, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return c6247k.fu4(bArr, appendable, i2, i3);
    }

    public final boolean a9() {
        return this.f36301k;
    }

    public final void f7l8(int i2, int i3, int i4) {
        kotlin.collections.zy.Companion.m22681k(i3, i4, i2);
    }

    @InterfaceC7396q
    public final <A extends Appendable> A fu4(@InterfaceC7396q byte[] source, @InterfaceC7396q A destination, int i2, int i3) throws IOException {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(destination, "destination");
        destination.append(new String(m22899t(source, i2, i3), C6433g.f81920f7l8));
        return destination;
    }

    /* JADX INFO: renamed from: i */
    public final int m22895i(@InterfaceC7396q byte[] source, @InterfaceC7396q byte[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(destination, "destination");
        return zurt(source, destination, i2, i3, i4);
    }

    public final boolean jk() {
        return this.f81797toq;
    }

    @InterfaceC7396q
    public final String ki(@InterfaceC7396q byte[] source, int i2, int i3) {
        d2ok.m23075h(source, "source");
        return new String(m22899t(source, i2, i3), C6433g.f81920f7l8);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final byte[] m22896n(@InterfaceC7396q CharSequence source, int i2, int i3) {
        d2ok.m23075h(source, "source");
        f7l8(source.length(), i2, i3);
        byte[] bArr = new byte[i3 - i2];
        int i4 = 0;
        while (i2 < i3) {
            char cCharAt = source.charAt(i2);
            if (cCharAt <= 255) {
                bArr[i4] = (byte) cCharAt;
                i4++;
            } else {
                bArr[i4] = C7571o.f43818k;
                i4++;
            }
            i2++;
        }
        return bArr;
    }

    public final int n7h(@InterfaceC7396q byte[] source, @InterfaceC7396q byte[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(destination, "destination");
        f7l8(source.length, i3, i4);
        m22890g(destination.length, i2, cdj(source, i3, i4));
        return x2(source, destination, i2, i3, i4);
    }

    @InterfaceC7396q
    public final byte[] o1t(@InterfaceC7396q byte[] source, int i2, int i3) {
        d2ok.m23075h(source, "source");
        return m22899t(source, i2, i3);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final String m22897q(@InterfaceC7396q byte[] source) {
        d2ok.m23075h(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b2 : source) {
            sb.append((char) b2);
        }
        String string = sb.toString();
        d2ok.kja0(string, "stringBuilder.toString()");
        return string;
    }

    public final int qrj(@InterfaceC7396q CharSequence source, @InterfaceC7396q byte[] destination, int i2, int i3, int i4) {
        byte[] bArrM22896n;
        d2ok.m23075h(source, "source");
        d2ok.m23075h(destination, "destination");
        if (source instanceof String) {
            f7l8(source.length(), i3, i4);
            String strSubstring = ((String) source).substring(i3, i4);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C6433g.f81920f7l8;
            d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrM22896n = strSubstring.getBytes(charset);
            d2ok.kja0(bArrM22896n, "this as java.lang.String).getBytes(charset)");
        } else {
            bArrM22896n = m22896n(source, i3, i4);
        }
        return m22891h(this, bArrM22896n, destination, i2, 0, 0, 24, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final byte[] m22898s(@InterfaceC7396q byte[] source, int i2, int i3) {
        d2ok.m23075h(source, "source");
        f7l8(source.length, i2, i3);
        int iCdj = cdj(source, i2, i3);
        byte[] bArr = new byte[iCdj];
        if (x2(source, bArr, 0, i2, i3) == iCdj) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public final byte[] m22899t(@InterfaceC7396q byte[] source, int i2, int i3) {
        d2ok.m23075h(source, "source");
        f7l8(source.length, i2, i3);
        byte[] bArr = new byte[ni7(i3 - i2)];
        zurt(source, bArr, 0, i2, i3);
        return bArr;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final byte[] m22900y(@InterfaceC7396q CharSequence source, int i2, int i3) {
        byte[] bArrM22896n;
        d2ok.m23075h(source, "source");
        if (source instanceof String) {
            f7l8(source.length(), i2, i3);
            String strSubstring = ((String) source).substring(i2, i3);
            d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C6433g.f81920f7l8;
            d2ok.n7h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrM22896n = strSubstring.getBytes(charset);
            d2ok.kja0(bArrM22896n, "this as java.lang.String).getBytes(charset)");
        } else {
            bArrM22896n = m22896n(source, i2, i3);
        }
        return ld6(this, bArrM22896n, 0, 0, 6, null);
    }

    public final int zurt(@InterfaceC7396q byte[] source, @InterfaceC7396q byte[] destination, int i2, int i3, int i4) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(destination, "destination");
        f7l8(source.length, i3, i4);
        m22890g(destination.length, i2, ni7(i4 - i3));
        byte[] bArr = this.f36301k ? zy.f81799zy : zy.f36318k;
        int i5 = this.f81797toq ? 19 : Integer.MAX_VALUE;
        int i6 = i2;
        while (true) {
            if (i3 + 2 >= i4) {
                break;
            }
            int iMin = Math.min((i4 - i3) / 3, i5);
            int i7 = 0;
            while (i7 < iMin) {
                int i8 = i3 + 1;
                int i9 = i8 + 1;
                int i10 = ((source[i3] & 255) << 16) | ((source[i8] & 255) << 8) | (source[i9] & 255);
                int i11 = i6 + 1;
                destination[i6] = bArr[i10 >>> 18];
                int i12 = i11 + 1;
                destination[i11] = bArr[(i10 >>> 12) & 63];
                int i13 = i12 + 1;
                destination[i12] = bArr[(i10 >>> 6) & 63];
                i6 = i13 + 1;
                destination[i13] = bArr[i10 & 63];
                i7++;
                i3 = i9 + 1;
            }
            if (iMin == i5 && i3 != i4) {
                int i14 = i6 + 1;
                byte[] bArr2 = f81793ld6;
                destination[i6] = bArr2[0];
                i6 = i14 + 1;
                destination[i14] = bArr2[1];
            }
        }
        int i15 = i4 - i3;
        if (i15 == 1) {
            int i16 = i3 + 1;
            int i17 = (source[i3] & 255) << 4;
            int i18 = i6 + 1;
            destination[i6] = bArr[i17 >>> 6];
            int i19 = i18 + 1;
            destination[i18] = bArr[i17 & 63];
            int i20 = i19 + 1;
            destination[i19] = f36300y;
            i6 = i20 + 1;
            destination[i20] = f36300y;
            i3 = i16;
        } else if (i15 == 2) {
            int i21 = i3 + 1;
            int i22 = i21 + 1;
            int i23 = ((source[i21] & 255) << 2) | ((source[i3] & 255) << 10);
            int i24 = i6 + 1;
            destination[i6] = bArr[i23 >>> 12];
            int i25 = i24 + 1;
            destination[i24] = bArr[(i23 >>> 6) & 63];
            int i26 = i25 + 1;
            destination[i25] = bArr[i23 & 63];
            i6 = i26 + 1;
            destination[i26] = f36300y;
            i3 = i22;
        }
        if (i3 == i4) {
            return i6 - i2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

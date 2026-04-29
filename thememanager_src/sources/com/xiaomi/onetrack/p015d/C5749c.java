package com.xiaomi.onetrack.p015d;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.ts.wvg;
import com.google.common.base.zy;
import com.xiaomi.onetrack.util.C5804p;
import java.io.UnsupportedEncodingException;
import kotlin.io.encoding.C6247k;
import okio.C7571o;

/* JADX INFO: renamed from: com.xiaomi.onetrack.d.c */
/* JADX INFO: loaded from: classes3.dex */
public class C5749c {

    /* JADX INFO: renamed from: a */
    private static final String f32079a = "Base64Util";

    /* JADX INFO: renamed from: b */
    private static char[] f32080b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: c */
    private static byte[] f32081c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, C7571o.f43818k, 52, 53, 54, 55, 56, 57, 58, 59, 60, C6247k.f36300y, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, zy.f68132qrj, zy.f68128n7h, zy.f68124kja0, zy.f25751h, zy.f68111cdj, 16, 17, 18, 19, zy.f68119fu4, zy.f25761z, zy.f68130o1t, zy.f68135wvg, zy.f25759t, zy.f68127mcp, -1, -1, -1, -1, -1, -1, zy.f68121jk, zy.f68110a9, zy.f68118fti, zy.f68122jp0y, zy.f68120gvn7, zy.f68113d3, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static String m20012a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = i2 + 1;
            int i4 = bArr[i2] & 255;
            if (i3 == length) {
                stringBuffer.append(f32080b[i4 >>> 2]);
                stringBuffer.append(f32080b[(i4 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            if (i5 == length) {
                stringBuffer.append(f32080b[i4 >>> 2]);
                stringBuffer.append(f32080b[((i4 & 3) << 4) | ((i6 & wvg.f64659wvg) >>> 4)]);
                stringBuffer.append(f32080b[(i6 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i7 = i5 + 1;
            int i8 = bArr[i5] & 255;
            stringBuffer.append(f32080b[i4 >>> 2]);
            stringBuffer.append(f32080b[((i4 & 3) << 4) | ((i6 & wvg.f64659wvg) >>> 4)]);
            stringBuffer.append(f32080b[((i6 & 15) << 2) | ((i8 & wvg.f64653fu4) >>> 6)]);
            stringBuffer.append(f32080b[i8 & 63]);
            i2 = i7;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m20015b(String str) throws UnsupportedEncodingException {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        int i5;
        byte b5;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes(C3548p.f65246qrj);
        int length = bytes.length;
        int i6 = 0;
        while (i6 < length) {
            while (true) {
                i2 = i6 + 1;
                b2 = f32081c[bytes[i6]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i6 = i2;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i3 = i2 + 1;
                b3 = f32081c[bytes[i2]];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) ((b2 << 2) | ((b3 & 48) >>> 4)));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
                b4 = f32081c[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            stringBuffer.append((char) (((b3 & zy.f68111cdj) << 4) | ((b4 & 60) >>> 2)));
            while (true) {
                i5 = i4 + 1;
                byte b9 = bytes[i4];
                if (b9 == 61) {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
                b5 = f32081c[b9];
                if (i5 >= length || b5 != -1) {
                    break;
                }
                i4 = i5;
            }
            if (b5 == -1) {
                break;
            }
            stringBuffer.append((char) (b5 | ((b4 & 3) << 6)));
            i6 = i5;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m20014a(String str) {
        try {
            return m20015b(str);
        } catch (UnsupportedEncodingException e2) {
            C5804p.m20348b(C5804p.m20340a(f32079a), "decode e", e2);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m20013a() {
        return new byte[]{84, 123, 100, 101, 118, 33, 80, 100, 101, 116, 116, 37, 94, 52, 77, 73};
    }
}

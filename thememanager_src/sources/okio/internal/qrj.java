package okio.internal;

import com.google.android.exoplayer2.extractor.ts.wvg;
import java.util.Arrays;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;
import okio.C7571o;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
public final class qrj {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final byte[] m27729k(@InterfaceC7396q String str) {
        int i2;
        int i3;
        d2ok.m23075h(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (d2ok.m23076i(cCharAt, 128) >= 0) {
                int length2 = str.length();
                int i5 = i4;
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    if (d2ok.m23076i(cCharAt2, 128) < 0) {
                        int i6 = i5 + 1;
                        bArr[i5] = (byte) cCharAt2;
                        i4++;
                        while (true) {
                            i5 = i6;
                            if (i4 >= length2 || d2ok.m23076i(str.charAt(i4), 128) >= 0) {
                                break;
                            }
                            i6 = i5 + 1;
                            bArr[i5] = (byte) str.charAt(i4);
                            i4++;
                        }
                    } else {
                        if (d2ok.m23076i(cCharAt2, 2048) < 0) {
                            int i7 = i5 + 1;
                            bArr[i5] = (byte) ((cCharAt2 >> 6) | wvg.f64653fu4);
                            byte b2 = (byte) ((cCharAt2 & '?') | 128);
                            i2 = i7 + 1;
                            bArr[i7] = b2;
                        } else {
                            if (55296 <= cCharAt2 && cCharAt2 < 57344) {
                                if (d2ok.m23076i(cCharAt2, 56319) <= 0 && length2 > (i3 = i4 + 1)) {
                                    char cCharAt3 = str.charAt(i3);
                                    if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                                        int iCharAt = ((cCharAt2 << '\n') + str.charAt(i3)) - 56613888;
                                        int i8 = i5 + 1;
                                        bArr[i5] = (byte) ((iCharAt >> 18) | wvg.f64659wvg);
                                        int i9 = i8 + 1;
                                        bArr[i8] = (byte) (((iCharAt >> 12) & 63) | 128);
                                        int i10 = i9 + 1;
                                        bArr[i9] = (byte) (((iCharAt >> 6) & 63) | 128);
                                        byte b3 = (byte) ((iCharAt & 63) | 128);
                                        i2 = i10 + 1;
                                        bArr[i10] = b3;
                                        i4 += 2;
                                        i5 = i2;
                                    }
                                }
                                i2 = i5 + 1;
                                bArr[i5] = C7571o.f43818k;
                            } else {
                                int i11 = i5 + 1;
                                bArr[i5] = (byte) ((cCharAt2 >> '\f') | 224);
                                int i12 = i11 + 1;
                                bArr[i11] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                                byte b4 = (byte) ((cCharAt2 & '?') | 128);
                                i2 = i12 + 1;
                                bArr[i12] = b4;
                            }
                        }
                        i4++;
                        i5 = i2;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
                d2ok.kja0(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i4] = (byte) cCharAt;
            i4++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        d2ok.kja0(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011c, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L97;
     */
    @mub.InterfaceC7396q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toq(@mub.InterfaceC7396q byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.qrj.toq(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String zy(byte[] bArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = bArr.length;
        }
        return toq(bArr, i2, i3);
    }
}

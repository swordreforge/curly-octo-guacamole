package com.google.common.base;

import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
@InterfaceC7731k
public final class ncyb {
    private ncyb() {
    }

    /* JADX INFO: renamed from: g */
    private static String m15429g(int i2) {
        return "Unpaired surrogate at index " + i2;
    }

    /* JADX INFO: renamed from: k */
    public static int m15430k(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int qVar = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 2048) {
                    qVar += toq(charSequence, i2);
                    break;
                }
                qVar += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (qVar >= length) {
            return qVar;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) qVar) + 4294967296L));
    }

    /* JADX INFO: renamed from: n */
    private static boolean m15431n(byte[] bArr, int i2, int i3) {
        byte b2;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i4 != i3 && b3 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (b3 < -16) {
                    int i5 = i4 + 1;
                    if (i5 < i3 && (b2 = bArr[i4]) <= -65 && ((b3 != -32 || b2 >= -96) && (b3 != -19 || -96 > b2))) {
                        i2 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return false;
                }
                if (i4 + 2 >= i3) {
                    return false;
                }
                int i6 = i4 + 1;
                byte b4 = bArr[i4];
                if (b4 <= -65 && (((b3 << zy.f68118fti) + (b4 + 112)) >> 30) == 0) {
                    int i7 = i6 + 1;
                    if (bArr[i6] <= -65) {
                        i4 = i7 + 1;
                        if (bArr[i7] > -65) {
                        }
                    }
                }
                return false;
            }
            i2 = i4;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m15432q(byte[] bArr, int i2, int i3) {
        int i4 = i3 + i2;
        jk.ek5k(i2, i4, bArr.length);
        while (i2 < i4) {
            if (bArr[i2] < 0) {
                return m15431n(bArr, i2, i4);
            }
            i2++;
        }
        return true;
    }

    private static int toq(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) == cCharAt) {
                        throw new IllegalArgumentException(m15429g(i2));
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    public static boolean zy(byte[] bArr) {
        return m15432q(bArr, 0, bArr.length);
    }
}

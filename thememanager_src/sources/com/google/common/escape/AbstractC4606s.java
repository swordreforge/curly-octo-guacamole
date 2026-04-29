package com.google.common.escape;

import com.google.common.base.jk;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.escape.s */
/* JADX INFO: compiled from: UnicodeEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public abstract class AbstractC4606s extends AbstractC4601g {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f68250toq = 32;

    protected AbstractC4606s() {
    }

    /* JADX INFO: renamed from: g */
    private static char[] m16155g(char[] cArr, int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i3];
        if (i2 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i2);
        }
        return cArr2;
    }

    protected static int zy(CharSequence charSequence, int i2, int i3) {
        jk.a9(charSequence);
        if (i2 >= i3) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i4 = i2 + 1;
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected low surrogate character '");
            sb.append(cCharAt);
            sb.append("' with value ");
            sb.append((int) cCharAt);
            sb.append(" at index ");
            sb.append(i4 - 1);
            sb.append(" in '");
            sb.append((Object) charSequence);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i4 == i3) {
            return -cCharAt;
        }
        char cCharAt2 = charSequence.charAt(i4);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i4 + " in '" + ((Object) charSequence) + "'");
    }

    protected int f7l8(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            int iZy = zy(charSequence, i2, i3);
            if (iZy < 0 || mo16144q(iZy) != null) {
                break;
            }
            i2 += Character.isSupplementaryCodePoint(iZy) ? 2 : 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    protected final String m16156n(String str, int i2) {
        int length = str.length();
        char[] cArrM16158k = C4607y.m16158k();
        int i3 = 0;
        int length2 = 0;
        while (i2 < length) {
            int iZy = zy(str, i2, length);
            if (iZy < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrMo16144q = mo16144q(iZy);
            int i4 = (Character.isSupplementaryCodePoint(iZy) ? 2 : 1) + i2;
            if (cArrMo16144q != null) {
                int i5 = i2 - i3;
                int i6 = length2 + i5;
                int length3 = cArrMo16144q.length + i6;
                if (cArrM16158k.length < length3) {
                    cArrM16158k = m16155g(cArrM16158k, length2, length3 + (length - i2) + 32);
                }
                if (i5 > 0) {
                    str.getChars(i3, i2, cArrM16158k, length2);
                    length2 = i6;
                }
                if (cArrMo16144q.length > 0) {
                    System.arraycopy(cArrMo16144q, 0, cArrM16158k, length2, cArrMo16144q.length);
                    length2 += cArrMo16144q.length;
                }
                i3 = i4;
            }
            i2 = f7l8(str, i4, length);
        }
        int i7 = length - i3;
        if (i7 > 0) {
            int i8 = i7 + length2;
            if (cArrM16158k.length < i8) {
                cArrM16158k = m16155g(cArrM16158k, length2, i8);
            }
            str.getChars(i3, length, cArrM16158k, length2);
            length2 = i8;
        }
        return new String(cArrM16158k, 0, length2);
    }

    /* JADX INFO: renamed from: q */
    protected abstract char[] mo16144q(int i2);

    @Override // com.google.common.escape.AbstractC4601g
    public String toq(String str) {
        jk.a9(str);
        int length = str.length();
        int iF7l8 = f7l8(str, 0, length);
        return iF7l8 == length ? str : m16156n(str, iF7l8);
    }
}

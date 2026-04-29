package com.google.common.escape;

import com.google.common.base.jk;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.escape.q */
/* JADX INFO: compiled from: CharEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public abstract class AbstractC4605q extends AbstractC4601g {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f68249toq = 2;

    protected AbstractC4605q() {
    }

    /* JADX INFO: renamed from: n */
    private static char[] m16153n(char[] cArr, int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i3];
        if (i2 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i2);
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: q */
    protected final String m16154q(String str, int i2) {
        int length = str.length();
        char[] cArrM16158k = C4607y.m16158k();
        int length2 = cArrM16158k.length;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            char[] cArrZy = zy(str.charAt(i2));
            if (cArrZy != null) {
                int length3 = cArrZy.length;
                int i5 = i2 - i3;
                int i6 = i4 + i5;
                int i7 = i6 + length3;
                if (length2 < i7) {
                    length2 = ((length - i2) * 2) + i7;
                    cArrM16158k = m16153n(cArrM16158k, i4, length2);
                }
                if (i5 > 0) {
                    str.getChars(i3, i2, cArrM16158k, i4);
                    i4 = i6;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrZy, 0, cArrM16158k, i4, length3);
                    i4 += length3;
                }
                i3 = i2 + 1;
            }
            i2++;
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (length2 < i9) {
                cArrM16158k = m16153n(cArrM16158k, i4, i9);
            }
            str.getChars(i3, length, cArrM16158k, i4);
            i4 = i9;
        }
        return new String(cArrM16158k, 0, i4);
    }

    @Override // com.google.common.escape.AbstractC4601g
    public String toq(String str) {
        jk.a9(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (zy(str.charAt(i2)) != null) {
                return m16154q(str, i2);
            }
        }
        return str;
    }

    protected abstract char[] zy(char c2);
}

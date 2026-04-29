package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Strings.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class d2ok {
    private d2ok() {
    }

    public static String f7l8(@NullableDecl String str) {
        return mcp.f7l8(str);
    }

    /* JADX INFO: renamed from: g */
    private static String m15294g(@NullableDecl Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e2) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e2);
            return "<" + str + " threw " + e2.getClass().getName() + ">";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m15295k(CharSequence charSequence, CharSequence charSequence2) {
        jk.a9(charSequence);
        jk.a9(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i2 = 0;
        while (i2 < iMin && charSequence.charAt(i2) == charSequence2.charAt(i2)) {
            i2++;
        }
        int i3 = i2 - 1;
        if (ld6(charSequence, i3) || ld6(charSequence2, i3)) {
            i2--;
        }
        return charSequence.subSequence(0, i2).toString();
    }

    @InterfaceC7732q
    static boolean ld6(CharSequence charSequence, int i2) {
        return i2 >= 0 && i2 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i2)) && Character.isLowSurrogate(charSequence.charAt(i2 + 1));
    }

    /* JADX INFO: renamed from: n */
    public static String m15296n(@NullableDecl String str, @NullableDecl Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i2 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i3 = 0; i3 < objArr.length; i3++) {
                objArr[i3] = m15294g(objArr[i3]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m15297p(String str, int i2) {
        jk.a9(str);
        if (i2 <= 1) {
            jk.ld6(i2 >= 0, "invalid count: %s", i2);
            return i2 == 0 ? "" : str;
        }
        int length = str.length();
        long j2 = ((long) length) * ((long) i2);
        int i3 = (int) j2;
        if (i3 != j2) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j2);
        }
        char[] cArr = new char[i3];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i4 = i3 - length;
            if (length >= i4) {
                System.arraycopy(cArr, 0, cArr, length, i4);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m15298q(@NullableDecl String str) {
        return mcp.m15409p(str);
    }

    /* JADX INFO: renamed from: s */
    public static String m15299s(String str, int i2, char c2) {
        jk.a9(str);
        if (str.length() >= i2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i2);
        for (int length = str.length(); length < i2; length++) {
            sb.append(c2);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String toq(CharSequence charSequence, CharSequence charSequence2) {
        jk.a9(charSequence);
        jk.a9(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i2 = 0;
        while (i2 < iMin && charSequence.charAt((charSequence.length() - i2) - 1) == charSequence2.charAt((charSequence2.length() - i2) - 1)) {
            i2++;
        }
        if (ld6(charSequence, (charSequence.length() - i2) - 1) || ld6(charSequence2, (charSequence2.length() - i2) - 1)) {
            i2--;
        }
        return charSequence.subSequence(charSequence.length() - i2, charSequence.length()).toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m15300y(String str, int i2, char c2) {
        jk.a9(str);
        if (str.length() >= i2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        for (int length = str.length(); length < i2; length++) {
            sb.append(c2);
        }
        return sb.toString();
    }

    @NullableDecl
    public static String zy(@NullableDecl String str) {
        return mcp.toq(str);
    }
}

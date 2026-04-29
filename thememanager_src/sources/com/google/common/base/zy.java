package com.google.common.base;

/* JADX INFO: compiled from: Ascii.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class zy {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final byte f68110a9 = 27;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final byte f68111cdj = 15;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final byte f68112d2ok = 127;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final byte f68113d3 = 31;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final char f68114dd = ' ';

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final byte f68115eqxt = 32;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final byte f68116f7l8 = 6;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final byte f68117fn3e = 18;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final byte f68118fti = 28;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final byte f68119fu4 = 20;

    /* JADX INFO: renamed from: g */
    public static final byte f25750g = 5;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final byte f68120gvn7 = 30;

    /* JADX INFO: renamed from: h */
    public static final byte f25751h = 14;

    /* JADX INFO: renamed from: i */
    public static final byte f25752i = 17;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final byte f68121jk = 26;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final byte f68122jp0y = 29;

    /* JADX INFO: renamed from: k */
    public static final byte f25753k = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final byte f68123ki = 16;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final byte f68124kja0 = 13;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final byte f68125ld6 = 10;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final char f68126lvui = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final byte f68127mcp = 25;

    /* JADX INFO: renamed from: n */
    public static final byte f25754n = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final byte f68128n7h = 12;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final byte f68129ni7 = 19;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final byte f68130o1t = 22;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final byte f68131oc = 32;

    /* JADX INFO: renamed from: p */
    public static final byte f25755p = 9;

    /* JADX INFO: renamed from: q */
    public static final byte f25756q = 3;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final byte f68132qrj = 11;

    /* JADX INFO: renamed from: r */
    public static final char f25757r = 127;

    /* JADX INFO: renamed from: s */
    public static final byte f25758s = 8;

    /* JADX INFO: renamed from: t */
    public static final byte f25759t = 24;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final byte f68133t8r = 17;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final byte f68134toq = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final byte f68135wvg = 23;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final byte f68136x2 = 10;

    /* JADX INFO: renamed from: y */
    public static final byte f25760y = 7;

    /* JADX INFO: renamed from: z */
    public static final byte f25761z = 21;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final byte f68137zurt = 19;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final byte f68138zy = 2;

    private zy() {
    }

    public static String f7l8(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (m15460q(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (m15460q(c2)) {
                        charArray[i2] = (char) (c2 ^ f68114dd);
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static String m15456g(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return f7l8((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = m15458n(charSequence.charAt(i2));
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15457k(CharSequence charSequence, CharSequence charSequence2) {
        int qVar;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence2.charAt(i2);
            if (cCharAt != cCharAt2 && ((qVar = toq(cCharAt)) >= 26 || qVar != toq(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static String ld6(CharSequence charSequence, int i2, String str) {
        jk.a9(charSequence);
        int length = i2 - str.length();
        jk.qrj(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i2, str.length());
        int length2 = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length2 <= i2) {
            String string = charSequence.toString();
            int length3 = string.length();
            charSequence2 = string;
            if (length3 <= i2) {
                return string;
            }
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(charSequence2, 0, length);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static char m15458n(char c2) {
        return m15460q(c2) ? (char) (c2 ^ f68114dd) : c2;
    }

    /* JADX INFO: renamed from: p */
    public static String m15459p(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (zy(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (zy(c2)) {
                        charArray[i2] = (char) (c2 ^ f68114dd);
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m15460q(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    /* JADX INFO: renamed from: s */
    public static String m15461s(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return m15459p((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = m15462y(charSequence.charAt(i2));
        }
        return String.valueOf(cArr);
    }

    private static int toq(char c2) {
        return (char) ((c2 | f68114dd) - 97);
    }

    /* JADX INFO: renamed from: y */
    public static char m15462y(char c2) {
        return zy(c2) ? (char) (c2 ^ f68114dd) : c2;
    }

    public static boolean zy(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }
}

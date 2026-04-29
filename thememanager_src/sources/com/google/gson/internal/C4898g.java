package com.google.gson.internal;

/* JADX INFO: renamed from: com.google.gson.internal.g */
/* JADX INFO: compiled from: JavaVersion.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4898g {

    /* JADX INFO: renamed from: k */
    private static final int f27741k = m17162k();

    private C4898g() {
    }

    /* JADX INFO: renamed from: g */
    private static int m17161g(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i2 = Integer.parseInt(strArrSplit[0]);
            return (i2 != 1 || strArrSplit.length <= 1) ? i2 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m17162k() {
        return m17164q(System.getProperty("java.version"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m17163n() {
        return f27741k >= 9;
    }

    /* JADX INFO: renamed from: q */
    static int m17164q(String str) {
        int iM17161g = m17161g(str);
        if (iM17161g == -1) {
            iM17161g = toq(str);
        }
        if (iM17161g == -1) {
            return 6;
        }
        return iM17161g;
    }

    private static int toq(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int zy() {
        return f27741k;
    }
}

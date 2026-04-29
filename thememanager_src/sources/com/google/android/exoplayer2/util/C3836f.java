package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.f */
/* JADX INFO: compiled from: UriUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3836f {

    /* JADX INFO: renamed from: k */
    private static final int f23179k = 4;

    /* JADX INFO: renamed from: n */
    private static final int f23180n = 3;

    /* JADX INFO: renamed from: q */
    private static final int f23181q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f66981toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f66982zy = 1;

    private C3836f() {
    }

    /* JADX INFO: renamed from: g */
    public static Uri m13577g(@zy.dd String str, @zy.dd String str2) {
        return Uri.parse(m13579n(str, str2));
    }

    /* JADX INFO: renamed from: k */
    private static int[] m13578k(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: n */
    public static String m13579n(@zy.dd String str, @zy.dd String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM13578k = m13578k(str2);
        if (iArrM13578k[0] != -1) {
            sb.append(str2);
            zy(sb, iArrM13578k[1], iArrM13578k[2]);
            return sb.toString();
        }
        int[] iArrM13578k2 = m13578k(str);
        if (iArrM13578k[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM13578k2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM13578k[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM13578k2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrM13578k[1];
        if (i2 != 0) {
            int i3 = iArrM13578k2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return zy(sb, iArrM13578k[1] + i3, i3 + iArrM13578k[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrM13578k2[1]);
            sb.append(str2);
            int i4 = iArrM13578k2[1];
            return zy(sb, i4, iArrM13578k[2] + i4);
        }
        int i5 = iArrM13578k2[0] + 2;
        int i6 = iArrM13578k2[1];
        if (i5 >= i6 || i6 != iArrM13578k2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM13578k2[2] - 1);
            int i7 = iLastIndexOf == -1 ? iArrM13578k2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return zy(sb, iArrM13578k2[1], i7 + iArrM13578k[2]);
        }
        sb.append((CharSequence) str, 0, i6);
        sb.append('/');
        sb.append(str2);
        int i8 = iArrM13578k2[1];
        return zy(sb, i8, iArrM13578k[2] + i8 + 1);
    }

    /* JADX INFO: renamed from: q */
    public static Uri m13580q(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static boolean toq(@zy.dd String str) {
        return (str == null || m13578k(str)[0] == -1) ? false : true;
    }

    private static String zy(StringBuilder sb, int i2, int i3) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }
}

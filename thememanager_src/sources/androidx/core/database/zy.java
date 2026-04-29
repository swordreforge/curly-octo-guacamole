package androidx.core.database;

import android.text.TextUtils;

/* JADX INFO: compiled from: DatabaseUtilsCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zy {
    private zy() {
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static String[] m2383k(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Deprecated
    public static String toq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }
}

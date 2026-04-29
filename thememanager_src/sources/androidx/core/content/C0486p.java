package androidx.core.content;

import java.util.ArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.content.p */
/* JADX INFO: compiled from: MimeTypeFilter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0486p {
    private C0486p() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static String m2186k(@dd String str, @lvui String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (m2187n(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m2187n(@lvui String[] strArr, @lvui String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static String[] m2188q(@dd String[] strArr, @lvui String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (m2187n(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @dd
    public static String toq(@dd String[] strArr, @lvui String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (m2187n(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean zy(@dd String str, @lvui String str2) {
        if (str == null) {
            return false;
        }
        return m2187n(str.split("/"), str2.split("/"));
    }
}

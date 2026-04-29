package p029m;

/* JADX INFO: compiled from: TextUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {
    /* JADX INFO: renamed from: k */
    public static boolean m24738k(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null || str.length() != str2.length()) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean toq(String str) {
        return str == null || str.length() == 0;
    }
}

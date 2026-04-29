package miuix.core.util;

/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {

    /* JADX INFO: renamed from: k */
    private static int f39869k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f87349toq = -1;

    private kja0() {
    }

    public static boolean f7l8() {
        if (!m25568g() || zy() >= 14) {
            return x2();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25568g() {
        return miuix.os.toq.f40717k;
    }

    /* JADX INFO: renamed from: k */
    public static int m25569k() {
        if (f87349toq == -1) {
            f87349toq = toq();
        }
        return f87349toq;
    }

    public static boolean kja0() {
        return zy() >= 15;
    }

    public static boolean ld6() {
        return zy() >= 11;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25570n() {
        return m25569k() > 0;
    }

    public static boolean n7h() {
        return zy() >= 8;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m25571p() {
        return zy() >= 10;
    }

    /* JADX INFO: renamed from: q */
    public static int m25572q() {
        return SystemProperties.getInt("ro.miui.ui.version.code", 0);
    }

    public static boolean qrj() {
        return zy() >= 14;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m25573s() {
        return zy() >= 13;
    }

    public static int toq() {
        return SystemProperties.getInt("ro.mi.os.version.code", 0);
    }

    public static boolean x2() {
        return zy() >= 9;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m25574y() {
        return zy() > 0;
    }

    public static int zy() {
        if (f39869k == -1) {
            f39869k = m25572q();
        }
        return f39869k;
    }
}

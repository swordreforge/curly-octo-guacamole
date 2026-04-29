package miuix.os;

import android.os.Build;
import miuix.core.util.SystemProperties;

/* JADX INFO: compiled from: Build.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final boolean f87879f7l8;

    /* JADX INFO: renamed from: g */
    public static final boolean f40716g;

    /* JADX INFO: renamed from: n */
    public static final boolean f40718n;

    /* JADX INFO: renamed from: q */
    public static final boolean f40719q;

    /* JADX INFO: renamed from: y */
    public static final boolean f40720y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final boolean f87881zy;

    /* JADX INFO: renamed from: k */
    public static final boolean f40717k = SystemProperties.get("ro.product.mod_device", "").contains("_global");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f87880toq = m26177k();

    static {
        f40720y = SystemProperties.getInt("ro.debuggable", 0) == 1;
        if (Build.VERSION.SDK_INT > 33) {
            int i2 = SystemProperties.getInt("persist.sys.multi_display_type", 1);
            if (i2 > 1) {
                int i3 = i2 & 15;
                f40716g = i3 == 2;
                f40719q = i3 == 3;
                f40718n = i3 == 4;
                f87879f7l8 = i3 == 5;
            } else {
                int i4 = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0);
                f40716g = i4 == 1;
                f40719q = i4 == 2;
                f40718n = false;
                f87879f7l8 = false;
            }
        } else {
            int i5 = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0);
            f40716g = i5 == 1;
            f40719q = i5 == 2;
            f40718n = false;
            f87879f7l8 = false;
        }
        f87881zy = f40719q || f87879f7l8 || f40718n;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m26177k() {
        return SystemProperties.get("ro.build.characteristics").contains("tablet");
    }
}

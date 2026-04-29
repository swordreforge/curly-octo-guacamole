package bf2;

import android.content.Context;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.scorewall.C1797k;
import ek5k.C6002g;
import java.io.File;

/* JADX INFO: compiled from: AppContextManager.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f54012f7l8 = 1;

    /* JADX INFO: renamed from: g */
    public static final int f7270g = 0;

    /* JADX INFO: renamed from: k */
    private static Context f7271k = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Boolean f54013ld6 = null;

    /* JADX INFO: renamed from: n */
    private static final String f7272n = "/data/system/theme_4qa";

    /* JADX INFO: renamed from: p */
    private static int f7273p = -1;

    /* JADX INFO: renamed from: q */
    private static final String f7274q = "/data/system/theme_preview";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static boolean f54014qrj = false;

    /* JADX INFO: renamed from: s */
    public static final int f7275s = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f54015toq = "/data/system/theme_debug";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static Boolean f54016x2 = Boolean.TRUE;

    /* JADX INFO: renamed from: y */
    public static final int f7276y = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f54017zy = "/data/system/theme_dev";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f7l8() {
        C1724k.m6723p().n7h();
        C1797k.toq().m6982g();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5810g() {
        return f54014qrj;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5812n() {
        if (f54013ld6 == null) {
            f54013ld6 = Boolean.valueOf(new File(f54015toq).exists());
        }
        return f54013ld6.booleanValue();
    }

    /* JADX INFO: renamed from: p */
    public static void m5813p() {
        f54016x2 = Boolean.TRUE;
        C1724k.m6723p().m6726g();
        m5814q();
    }

    /* JADX INFO: renamed from: q */
    public static void m5814q() {
        if (f54016x2 == null || !C1781k.toq(toq())) {
            return;
        }
        C6002g.f7l8(new Runnable() { // from class: bf2.k
            @Override // java.lang.Runnable
            public final void run() {
                toq.f7l8();
            }
        });
        f54016x2 = null;
    }

    /* JADX INFO: renamed from: s */
    public static void m5815s(boolean isSupportWallpaper) {
        f54014qrj = isSupportWallpaper;
    }

    public static Context toq() {
        return f7271k;
    }

    /* JADX INFO: renamed from: y */
    public static void m5816y(Context applicationContext) {
        f7271k = applicationContext;
    }

    public static int zy() {
        if (f7273p == -1) {
            if (new File(f54017zy).exists()) {
                f7273p = 1;
            } else if (new File(f7274q).exists()) {
                f7273p = 2;
            } else if (new File(f7272n).exists()) {
                f7273p = 3;
            } else {
                f7273p = 0;
            }
        }
        return f7273p;
    }
}

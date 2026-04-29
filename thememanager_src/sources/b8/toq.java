package b8;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import miui.os.Build;
import zy.lvui;

/* JADX INFO: compiled from: EffectSystemSettingUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final boolean f53995f7l8 = m5784k();

    /* JADX INFO: renamed from: g */
    private static final String f7248g = "SystemSettingUtils";

    /* JADX INFO: renamed from: k */
    public static final int f7249k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f7250n = 4;

    /* JADX INFO: renamed from: q */
    public static final int f7251q = 3;

    /* JADX INFO: renamed from: s */
    public static final boolean f7252s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f53996toq = 1;

    /* JADX INFO: renamed from: y */
    public static final boolean f7253y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f53997zy = 2;

    static {
        boolean z2 = m5784k() || Build.IS_TABLET;
        f7253y = z2;
        f7252s = z2;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m5784k() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            Log.e(f7248g, "isFoldDevices fail : ", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m5785q(@lvui Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean toq(Context context) {
        return zy(context.getResources().getConfiguration());
    }

    public static boolean zy(Configuration configuration) {
        return (configuration.screenLayout & 15) == 3;
    }
}

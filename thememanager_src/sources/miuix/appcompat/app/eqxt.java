package miuix.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import miuix.core.util.C7085q;

/* JADX INFO: compiled from: LayoutUiModeHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class eqxt {
    /* JADX INFO: renamed from: k */
    public static void m24878k(Activity activity) {
        Window window;
        if (activity instanceof t8r) {
            t8r t8rVar = (t8r) activity;
            if (t8rVar.isFloatingWindowTheme() && t8rVar.isInFloatingWindowMode()) {
                activity.getWindow().addFlags(134217728);
                return;
            }
        }
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        toq(activity, window);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static boolean m24879q(Context context) {
        return C7085q.ki(context);
    }

    public static void toq(Activity activity, Window window) {
        boolean zContains = activity.getResources().getConfiguration().toString().contains("mWindowingMode=freeform");
        if (C7085q.ki(activity) || zContains) {
            window.addFlags(134217728);
        } else {
            window.clearFlags(134217728);
        }
        window.addFlags(67108864);
    }

    public static boolean zy(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "hide_gesture_line", 0) != 0;
    }
}

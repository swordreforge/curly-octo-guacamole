package miuix.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.constraintlayout.core.motion.utils.zurt;

/* JADX INFO: compiled from: MiuixUIUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static final String f39870k = "MiuixUtils";

    /* JADX INFO: renamed from: q */
    private static TypedValue f39871q = new TypedValue();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87350toq = "use_gesture_version_three";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87351zy = "hide_gesture_line";

    @Deprecated
    public static boolean cdj(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    public static int f7l8(Context context) {
        int iM25582s = (ki(context) || !n7h(context)) ? m25582s(context) : 0;
        if (iM25582s < 0) {
            return 0;
        }
        return iM25582s;
    }

    public static int fn3e(Context context, float f2) {
        return m25577i(context.getResources().getConfiguration().densityDpi / 160.0f, f2);
    }

    /* JADX INFO: renamed from: g */
    public static int m25575g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_navBarInteractionMode", zurt.toq.f47469toq, "android");
        if (identifier > 0) {
            return resources.getInteger(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25576h(View view) {
        return (view.getWindowSystemUiVisibility() & 512) != 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m25577i(float f2, float f3) {
        return (int) ((f3 / f2) + 0.5f);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25578k(Context context) {
        String str = SystemProperties.get("qemu.hw.mainkeys");
        if ("1".equals(str)) {
            return false;
        }
        if ("0".equals(str)) {
            return true;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier > 0) {
            return resources.getBoolean(identifier);
        }
        return false;
    }

    public static boolean ki(Context context) {
        return x2(context) && n7h(context) && t8r(context);
    }

    public static boolean kja0(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return toq((Activity) context);
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    public static int ld6(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static int m25579n(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i2, typedValue, true);
        return (int) TypedValue.complexToFloat(typedValue.data);
    }

    public static boolean n7h(Context context) {
        return m25575g(context) == 2;
    }

    /* JADX INFO: renamed from: p */
    public static int[] m25580p(Context context) {
        int[] iArr = new int[2];
        float f2 = context.getResources().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics maximumWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
            iArr[0] = (int) (maximumWindowMetrics.getBounds().width() / f2);
            iArr[1] = (int) (maximumWindowMetrics.getBounds().height() / f2);
        } else {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
            iArr[0] = (int) (r2.widthPixels / f2);
            iArr[1] = (int) (r2.heightPixels / f2);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: q */
    public static int m25581q(Context context, float f2) {
        return zy(context.getResources().getConfiguration().densityDpi / 160.0f, f2);
    }

    @Deprecated
    public static boolean qrj(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        Point pointM25583y = m25583y(context);
        return context.getResources().getConfiguration().toString().contains("mWindowingMode=freeform") && ((((float) point.x) + 0.0f) / ((float) pointM25583y.x) <= 0.9f || (((float) point.y) + 0.0f) / ((float) pointM25583y.y) <= 0.9f);
    }

    /* JADX INFO: renamed from: s */
    public static int m25582s(Context context) {
        Resources resources;
        int identifier;
        if (m25578k(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean t8r(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), f87350toq, 0) != 0;
    }

    private static boolean toq(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean x2(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), f87351zy, 0) == 0;
    }

    /* JADX INFO: renamed from: y */
    private static Point m25583y(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        try {
            Object qVar = miuix.reflect.toq.toq(defaultDisplay, miuix.reflect.toq.zy(defaultDisplay.getClass(), "mDisplayInfo"));
            point.x = ((Integer) miuix.reflect.toq.toq(qVar, miuix.reflect.toq.f7l8(qVar.getClass(), "logicalWidth"))).intValue();
            point.y = ((Integer) miuix.reflect.toq.toq(qVar, miuix.reflect.toq.f7l8(qVar.getClass(), "logicalHeight"))).intValue();
        } catch (Exception e2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            Log.w(f39870k, "catch error! failed to get physical size", e2);
        }
        return point;
    }

    public static int zy(float f2, float f3) {
        return (int) ((f3 * f2) + 0.5f);
    }
}

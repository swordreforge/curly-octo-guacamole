package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: ViewConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ch {

    /* JADX INFO: renamed from: k */
    private static final String f3987k = "ViewConfigCompat";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Method f50754toq;

    /* JADX INFO: renamed from: androidx.core.view.ch$k */
    /* JADX INFO: compiled from: ViewConfigurationCompat.java */
    @zy.hyr(26)
    static class C0679k {
        private C0679k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static float m3145k(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @InterfaceC7830i
        static float toq(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: compiled from: ViewConfigurationCompat.java */
    @zy.hyr(28)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3146k(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @InterfaceC7830i
        static boolean toq(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    private ch() {
    }

    public static boolean f7l8(@zy.lvui ViewConfiguration viewConfiguration, @zy.lvui Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return toq.toq(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static boolean m3141g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    /* JADX INFO: renamed from: k */
    private static float m3142k(ViewConfiguration viewConfiguration, Context context) {
        if (f50754toq != null) {
            try {
                return ((Integer) r0.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(f3987k, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public static float m3143n(@zy.lvui ViewConfiguration viewConfiguration, @zy.lvui Context context) {
        return C0679k.toq(viewConfiguration);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static int m3144q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float toq(@zy.lvui ViewConfiguration viewConfiguration, @zy.lvui Context context) {
        return C0679k.m3145k(viewConfiguration);
    }

    public static int zy(@zy.lvui ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? toq.m3146k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }
}

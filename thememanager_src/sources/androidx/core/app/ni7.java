package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: NavUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class ni7 {

    /* JADX INFO: renamed from: k */
    private static final String f3226k = "NavUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50119toq = "android.support.PARENT_ACTIVITY";

    /* JADX INFO: renamed from: androidx.core.app.ni7$k */
    /* JADX INFO: compiled from: NavUtils.java */
    @zy.hyr(16)
    static class C0442k {
        private C0442k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Intent m1955k(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @InterfaceC7830i
        static boolean toq(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @InterfaceC7830i
        static boolean zy(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    private ni7() {
    }

    public static void f7l8(@zy.lvui Activity activity, @zy.lvui Intent intent) {
        C0442k.toq(activity, intent);
    }

    /* JADX INFO: renamed from: g */
    public static void m1950g(@zy.lvui Activity activity) {
        Intent intentM1951k = m1951k(activity);
        if (intentM1951k != null) {
            f7l8(activity, intentM1951k);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static Intent m1951k(@zy.lvui Activity activity) {
        Intent intentM1955k = C0442k.m1955k(activity);
        if (intentM1955k != null) {
            return intentM1955k;
        }
        String strM1953q = m1953q(activity);
        if (strM1953q == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM1953q);
        try {
            return m1952n(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f3226k, "getParentActivityIntent: bad parentActivityName '" + strM1953q + "' in manifest");
            return null;
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public static String m1952n(@zy.lvui Context context, @zy.lvui ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f50119toq)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    public static String m1953q(@zy.lvui Activity activity) {
        try {
            return m1952n(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @zy.dd
    public static Intent toq(@zy.lvui Context context, @zy.lvui ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM1952n = m1952n(context, componentName);
        if (strM1952n == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM1952n);
        return m1952n(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m1954y(@zy.lvui Activity activity, @zy.lvui Intent intent) {
        return C0442k.zy(activity, intent);
    }

    @zy.dd
    public static Intent zy(@zy.lvui Context context, @zy.lvui Class<?> cls) throws PackageManager.NameNotFoundException {
        String strM1952n = m1952n(context, new ComponentName(context, cls));
        if (strM1952n == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, strM1952n);
        return m1952n(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }
}

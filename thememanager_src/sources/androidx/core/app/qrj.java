package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.content.C0510y;

/* JADX INFO: compiled from: AppLaunchChecker.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class qrj {

    /* JADX INFO: renamed from: k */
    private static final String f3248k = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50125toq = "startedFromLauncher";

    @Deprecated
    public qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1967k(@zy.lvui Context context) {
        return context.getSharedPreferences(f3248k, 0).getBoolean(f50125toq, false);
    }

    public static void toq(@zy.lvui Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f3248k, 0);
        if (sharedPreferences.getBoolean(f50125toq, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C0510y.f3523n)) {
            sharedPreferences.edit().putBoolean(f50125toq, true).apply();
        }
    }
}

package miuix.view;

import android.app.Activity;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: miuix.view.g */
/* JADX INFO: compiled from: CompatViewMethod.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7380g {
    /* JADX INFO: renamed from: k */
    public static void m26779k(Activity activity, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            activity.setTranslucent(z2);
        }
    }

    public static void toq(View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setForceDarkAllowed(z2);
        }
    }
}

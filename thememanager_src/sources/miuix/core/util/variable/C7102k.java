package miuix.core.util.variable;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: miuix.core.util.variable.k */
/* JADX INFO: compiled from: WindowUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7102k {
    private C7102k() {
    }

    /* JADX INFO: renamed from: k */
    public static void m25675k(Activity activity, float f2) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.alpha = f2;
        activity.getWindow().setAttributes(attributes);
    }

    public static void toq(Window window, int i2) {
        toq.m25676k(window, i2);
    }
}

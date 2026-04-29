package miuix.core.util;

import android.content.Intent;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import miuix.reflect.C7320k;

/* JADX INFO: renamed from: miuix.core.util.y */
/* JADX INFO: compiled from: IntentUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7103y {
    /* JADX INFO: renamed from: k */
    public static int m25684k(Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return ((Integer) C7320k.ki(Intent.class, intent, "getMiuiFlags", new Class[0], new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.e("IntentUtils", " getMiuiFlags error: " + e2);
            return 0;
        }
    }

    public static boolean toq(Intent intent) {
        return (m25684k(intent) & 16) != 0;
    }
}

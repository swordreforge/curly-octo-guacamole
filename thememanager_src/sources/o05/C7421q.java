package o05;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: renamed from: o05.q */
/* JADX INFO: loaded from: classes3.dex */
public class C7421q {
    /* JADX INFO: renamed from: k */
    public static int m26817k(ContentResolver contentResolver, String str, int i2, int i3) {
        Class cls = Integer.TYPE;
        return ((Integer) com.miui.lockscreeninfo.toq.toq(Settings.Secure.class, null, "getIntForUser", cls, 0, new Class[]{ContentResolver.class, String.class, cls, cls}, contentResolver, str, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
    }

    public static String toq(ContentResolver contentResolver, String str, int i2) {
        return (String) com.miui.lockscreeninfo.toq.toq(Settings.Secure.class, null, "getStringForUser", String.class, "", new Class[]{ContentResolver.class, String.class, Integer.TYPE}, contentResolver, str, Integer.valueOf(i2));
    }
}

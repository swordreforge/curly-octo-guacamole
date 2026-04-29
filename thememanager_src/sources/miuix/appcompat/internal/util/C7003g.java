package miuix.appcompat.internal.util;

import android.content.Context;
import android.provider.Settings;
import android.widget.TextView;
import com.android.thememanager.basemodule.utils.o1t;
import zy.dd;

/* JADX INFO: renamed from: miuix.appcompat.internal.util.g */
/* JADX INFO: compiled from: EasyModeHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7003g {
    /* JADX INFO: renamed from: k */
    private static boolean m25239k(@dd Context context) {
        return context != null && Settings.System.getInt(context.getContentResolver(), o1t.f57790cdj, 0) == 1;
    }

    public static void toq(@dd TextView textView) {
        if (textView == null || !m25239k(textView.getContext())) {
            return;
        }
        textView.setTextSize(0, 88.0f);
    }
}

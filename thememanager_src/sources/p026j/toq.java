package p026j;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.dd;

/* JADX INFO: compiled from: AllFreeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final long f35795k = 1565884800000L;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f80337toq = "^\\^_\\^ (.*) \\^_\\^$";

    @dd
    /* JADX INFO: renamed from: k */
    public static String m22385k(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip() || !clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain")) {
            return null;
        }
        CharSequence text = clipboardManager.getPrimaryClip().getItemAt(0).getText();
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        Matcher matcher = Pattern.compile(f80337toq).matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean toq() {
        return System.currentTimeMillis() < f35795k;
    }

    public static void zy(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}

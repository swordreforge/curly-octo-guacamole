package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.content.y */
/* JADX INFO: compiled from: IntentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0510y {

    /* JADX INFO: renamed from: k */
    @SuppressLint({"ActionValue"})
    public static final String f3522k = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: n */
    public static final String f3523n = "android.intent.category.LEANBACK_LAUNCHER";

    /* JADX INFO: renamed from: q */
    @SuppressLint({"ActionValue"})
    public static final String f3524q = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50422toq = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f50423zy = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: androidx.core.content.y$k */
    /* JADX INFO: compiled from: IntentCompat.java */
    @hyr(15)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Intent m2370k(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    private C0510y() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Intent m2369k(@lvui Context context, @lvui String str) {
        if (!kja0.m2181k(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent(kja0.f50355toq).setData(Uri.fromParts("package", str, null));
        return i2 >= 30 ? data : data.setPackage((String) androidx.core.util.n7h.x2(kja0.toq(context.getPackageManager())));
    }

    @lvui
    public static Intent toq(@lvui String str, @lvui String str2) {
        return k.m2370k(str, str2);
    }
}

package com.android.thememanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.miuixcompat.C2206g;
import com.android.thememanager.util.nn86;
import java.io.File;
import miui.content.res.ThemeResources;
import miuix.core.util.C7083n;

/* JADX INFO: loaded from: classes.dex */
public class ThemeBugreportDumpReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: k */
    public static final String f8697k;

    /* JADX INFO: renamed from: n */
    private static final String[] f8698n;

    /* JADX INFO: renamed from: q */
    private static final String f8699q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57252toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57253zy = "com.miui.core.intent.ACTION_DUMP_CACHED_LOG";

    /* JADX INFO: renamed from: com.android.thememanager.ThemeBugreportDumpReceiver$k */
    class RunnableC1532k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f8700k;

        RunnableC1532k(final Context val$context) {
            this.f8700k = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : ThemeBugreportDumpReceiver.f8698n) {
                ThemeBugreportDumpReceiver.this.m6316n(str);
            }
            ThemeBugreportDumpReceiver themeBugreportDumpReceiver = ThemeBugreportDumpReceiver.this;
            themeBugreportDumpReceiver.m6316n(themeBugreportDumpReceiver.m6318y(this.f8700k));
            ThemeBugreportDumpReceiver.this.m6314g();
        }
    }

    static {
        String str = ThemeResources.THEME_MAGIC_PATH + "drm.log";
        f8697k = str;
        String str2 = vyq.f10426q + "drm_after_apply.log";
        f57252toq = str2;
        f8699q = C7083n.ld6(bf2.toq.toq().getExternalFilesDir("MIUI").getPath()) + "debug_log/";
        f8698n = new String[]{str, vyq.f10423n, C2206g.f60487kja0, str2};
    }

    private void f7l8() {
        File file = new File(f8699q);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m6314g() {
        try {
            String[] list = new File(nn86.m9914n(null)).list();
            if (list == null || list.length <= 0) {
                Log.i("Theme", "copyLargeIconConfig: No mode list found");
                return;
            }
            f7l8();
            for (String str : list) {
                String strF7l8 = nn86.zy.f7l8(str);
                boolean zExists = new File(strF7l8).exists();
                Log.i("Theme", "copyLargeIconConfig: " + str + "," + (zExists ? C7083n.zy(new File(strF7l8), new File(f8699q + str + "_" + C7083n.m25584g(strF7l8))) : false) + "," + zExists);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m6316n(String path) {
        f7l8();
        C1821p.zy(path, 509);
        C7083n.zy(new File(path), new File(f8699q + C7083n.m25584g(path)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public String m6318y(Context context) {
        return context.getCacheDir().getAbsolutePath() + "/debug_log/com.android.thememanager.log";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (f57253zy.equals(intent.getAction())) {
            new Thread(new RunnableC1532k(context)).start();
        }
    }
}

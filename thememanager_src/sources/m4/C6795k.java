package m4;

import android.content.Context;
import android.content.Intent;
import android.content.res.MiuiConfiguration;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.utils.cdj;
import miui.content.res.ThemeRuntimeManager;

/* JADX INFO: renamed from: m4.k */
/* JADX INFO: compiled from: ModuleApplyUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6795k {

    /* JADX INFO: renamed from: k */
    private static final String f38044k = "ModuleApplyUtils";

    /* JADX INFO: renamed from: n */
    private static final String f38045n = "miui.intent.action.ACTION_THEME_CHANGED";

    /* JADX INFO: renamed from: q */
    private static final long f38046q = 201719808;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final long f84377toq = 16;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final long f84378zy = 58785792;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0017 -> B:29:0x002b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m24739k() throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            java.lang.String r3 = "/data/system/theme/lockscreen"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            java.lang.String r1 = "theme_values.xml"
            java.util.zip.ZipEntry r1 = r2.getEntry(r1)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L2c
            if (r1 == 0) goto L12
            r0 = 1
        L12:
            r2.close()     // Catch: java.io.IOException -> L16
            goto L2b
        L16:
            r1 = move-exception
            r1.printStackTrace()
            goto L2b
        L1b:
            r1 = move-exception
            goto L23
        L1d:
            r0 = move-exception
            goto L2e
        L1f:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L23:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2b
            r2.close()     // Catch: java.io.IOException -> L16
        L2b:
            return r0
        L2c:
            r0 = move-exception
            r1 = r2
        L2e:
            if (r1 == 0) goto L38
            r1.close()     // Catch: java.io.IOException -> L34
            goto L38
        L34:
            r1 = move-exception
            r1.printStackTrace()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C6795k.m24739k():boolean");
    }

    /* JADX INFO: renamed from: q */
    public static void m24740q(long flag, Bundle bundle, boolean inMultiWindow) {
        Log.i(f38044k, "sendMiuiConfiguration. flag = 0x" + Long.toHexString(flag));
        if (inMultiWindow) {
            cdj.zy(flag, null);
        } else if (bundle == null) {
            MiuiConfiguration.sendThemeConfigurationChangeMsg(flag);
        } else {
            MiuiConfiguration.sendThemeConfigurationChangeMsg(flag, bundle);
        }
    }

    public static void toq(Context context, long applyFlag) {
        zy(context, applyFlag, false);
    }

    public static void zy(Context context, long applyFlag, boolean multiWindow) {
        if ((f84378zy & applyFlag) != 0) {
            new ThemeRuntimeManager(context).markGadgetUpdated();
        }
        long j2 = ((applyFlag & 8192) == 0 && (4096 & applyFlag) != 0 && m24739k()) ? 8192 | applyFlag : applyFlag;
        if ((260505600 & j2) != 0) {
            j2 |= 16384;
        }
        m24740q(j2 & 268466329, null, multiWindow);
        context.sendBroadcast(new Intent(f38045n));
        Log.i(f38044k, "Applying theme END:  0x" + Long.toHexString(applyFlag) + ",mW =" + multiWindow);
    }
}

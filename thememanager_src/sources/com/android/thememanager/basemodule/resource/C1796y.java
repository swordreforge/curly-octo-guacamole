package com.android.thememanager.basemodule.resource;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.lrht;
import com.android.thememanager.util.C2755a;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Iterator;
import miui.util.FeatureParser;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.y */
/* JADX INFO: compiled from: ResourcePriorityStorageUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C1796y {

    /* JADX INFO: renamed from: g */
    private static final long f10243g = 33554432;

    /* JADX INFO: renamed from: k */
    private static final String f10244k = "ResourcePrioritySUtil";

    /* JADX INFO: renamed from: q */
    private static final String f10246q = "SECONDARY_STORAGE";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57701toq = "support_dual_sd_card";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57702zy = "is_pad";

    /* JADX INFO: renamed from: n */
    private static final String f10245n = m6976q();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f57700f7l8 = false;

    /* JADX INFO: renamed from: y */
    private static final boolean f10247y = m6974k();

    private C1796y() {
    }

    public static boolean f7l8() {
        return f10247y && f57700f7l8;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6973g() {
        return f57700f7l8;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m6974k() {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        if (!FeatureParser.getBoolean(f57702zy, false) && FeatureParser.getBoolean(f57701toq, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("plugin sdcard path: ");
            String str = f10245n;
            sb.append(str);
            Log.i(f10244k, sb.toString());
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory() && file.canWrite() && m6978y(str)) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            f57700f7l8 = zy.m6979k();
        }
        return z2;
    }

    /* JADX INFO: renamed from: n */
    public static String m6975n() {
        return f7l8() ? C1788k.f10178n : C1788k.f10181q;
    }

    /* JADX INFO: renamed from: q */
    public static String m6976q() {
        StorageVolume next;
        Context qVar = bf2.toq.toq();
        Iterator<StorageVolume> it = ((StorageManager) qVar.getSystemService("storage")).getStorageVolumes().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.isRemovable() && "mounted".equals(next.getState())) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Log.i(f10244k, "found pluginSdcard. " + next.getUuid() + "," + next.getDescription(qVar));
        if (Build.VERSION.SDK_INT >= 30) {
            File directory = next.getDirectory();
            if (directory == null) {
                return null;
            }
            return directory.getPath();
        }
        Method methodM7118n = lrht.m7118n(StorageVolume.class, "getPath", new Class[0]);
        if (methodM7118n != null) {
            return (String) lrht.f7l8(methodM7118n, next, new Object[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m6977s() {
        return f10247y;
    }

    public static String toq() {
        File externalFilesDir = bf2.toq.toq().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            Log.d(C2755a.f16307g, "getFontAdDownloadDir: fail get path");
            return null;
        }
        return externalFilesDir.getAbsolutePath() + "/.fontstyle";
    }

    /* JADX INFO: renamed from: y */
    private static boolean m6978y(String path) {
        if (path == null) {
            return false;
        }
        long availableBytes = 0;
        try {
            availableBytes = new StatFs(path).getAvailableBytes();
            C7794k.m28195n(f10244k, "Available sdcard storage is: " + (availableBytes / 1048576) + " MB");
        } catch (Exception e2) {
            C7794k.zy(f10244k, "Fail to access external storage", e2);
        }
        return availableBytes > 33554432;
    }

    public static String zy() {
        String str;
        if (!f10247y || (str = f10245n) == null) {
            return null;
        }
        return str + "/MIUI/";
    }
}

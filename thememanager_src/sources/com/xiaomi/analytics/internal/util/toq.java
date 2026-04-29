package com.xiaomi.analytics.internal.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.Signature;
import com.android.thememanager.clockmessage.model.C1873k;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: AndroidUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static Context m19255k(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19256q(Context context) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(C1873k.f10652g)).getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                if (runningTasks.get(0).topActivity.getPackageName().equals(context.getPackageName())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static Signature[] toq(Context context, File file) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(file.getPath(), 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Signature[] zy(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }
}

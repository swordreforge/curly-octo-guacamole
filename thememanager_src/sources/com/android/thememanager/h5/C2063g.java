package com.android.thememanager.h5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.thememanager.C2082k;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: renamed from: com.android.thememanager.h5.g */
/* JADX INFO: compiled from: WebResourceDebugHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2063g {

    /* JADX INFO: renamed from: k */
    public static final String f12209k = "/etc/hosts";

    /* JADX INFO: renamed from: q */
    private static Boolean f12210q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60285toq = "/sdcard/MIUI/theme-web-res-debug/";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60286zy = "/sdcard/MIUI/theme-web-res-debug/page.config";

    /* JADX INFO: renamed from: k */
    public static boolean m7949k() {
        if (f12210q == null) {
            f12210q = Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(C2082k.zy().toq()).getBoolean("theme_web_res_debug", false));
        }
        return f12210q.booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7950n(String path, toq config) {
        new File(path).getParentFile().mkdirs();
        return m7951q(path, config.t8r());
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7951q(String fileName, String message) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(new File(fileName));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(message);
            try {
                fileWriter.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return true;
        } catch (Exception e4) {
            e = e4;
            fileWriter2 = fileWriter;
            e.printStackTrace();
            if (fileWriter2 == null) {
                return false;
            }
            try {
                fileWriter2.close();
                return false;
            } catch (IOException e6) {
                e6.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static toq toq() {
        return f7l8.ki(f60286zy);
    }

    public static void zy(boolean value) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C2082k.zy().toq()).edit();
        editorEdit.putBoolean("theme_web_res_debug", value);
        editorEdit.apply();
        f12210q = Boolean.valueOf(value);
    }
}

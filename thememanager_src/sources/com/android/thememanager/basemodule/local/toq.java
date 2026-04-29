package com.android.thememanager.basemodule.local;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import zy.lvui;

/* JADX INFO: compiled from: DownloadCompact.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static String m6855k(@lvui String path) {
        return (Build.VERSION.SDK_INT == 29 && path.contains("/MIUI/")) ? path.replaceFirst("/MIUI/", "/Download/") : path;
    }

    /* JADX INFO: renamed from: q */
    public static String m6856q(@lvui String path) {
        return (Build.VERSION.SDK_INT == 29 && path.contains("/Download/")) ? path.replaceFirst("/Download/", "/MIUI/") : path;
    }

    public static String toq(@lvui String file) {
        try {
            return Os.lstat(file).toString();
        } catch (ErrnoException e2) {
            return e2.toString();
        }
    }

    public static String zy(@lvui String filePath) {
        if (Build.VERSION.SDK_INT == 29) {
            File file = new File(filePath);
            String path = file.getPath();
            if (path.contains("/Download/")) {
                File file2 = new File(path.replaceFirst("/Download/", "/MIUI/"));
                C1821p.m7191y(file2.getPath());
                try {
                    Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    return file2.getPath();
                } catch (IOException e2) {
                    Log.e("DownloadCompact", "fail move. " + e2);
                }
            }
        }
        return filePath;
    }
}

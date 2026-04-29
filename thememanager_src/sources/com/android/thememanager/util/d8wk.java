package com.android.thememanager.util;

import android.miui.Shell;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import miui.content.res.ThemeNativeUtils;

/* JADX INFO: compiled from: ThemeFileUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class d8wk {

    /* JADX INFO: renamed from: k */
    private static final String f16401k = "ThemeFileUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61227toq = "set_theme_path_permission";

    /* JADX INFO: renamed from: com.android.thememanager.util.d8wk$k */
    /* JADX INFO: compiled from: ThemeFileUtils.java */
    public interface InterfaceC2773k {
        /* JADX INFO: renamed from: k */
        void m9703k(File file);
    }

    private static String f7l8(String filePath) throws Throwable {
        FileInputStream fileInputStream;
        if (!TextUtils.isEmpty(filePath)) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(filePath);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[20];
                fileInputStream.read(bArr, 0, 20);
                String strM9697k = m9697k(bArr);
                try {
                    fileInputStream.close();
                    return strM9697k;
                } catch (IOException unused2) {
                    return strM9697k;
                }
            } catch (IOException unused3) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9696g(String filePath) {
        return f7l8(filePath).startsWith("FFD8FF");
    }

    /* JADX INFO: renamed from: k */
    private static String m9697k(byte[] src) {
        if (src == null || src.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : src) {
            String upperCase = Integer.toHexString(b2 & 255).toUpperCase();
            if (upperCase.length() < 2) {
                sb.append("0");
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static void ld6(@zy.dd String path) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        File file = new File(path);
        if (!file.isDirectory()) {
            qrj(file.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            ld6(file2.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m9698n() {
        if (!com.android.thememanager.basemodule.utils.y9n.toq(30) || new File(C1788k.f10175k).canWrite()) {
            return;
        }
        Log.w(f16401k, "Download dir cannot access, so fix it!");
        com.android.thememanager.basemodule.utils.y9n.t8r();
    }

    public static void n7h(String fileName, String data) throws IOException {
        if (Build.VERSION.SDK_INT > 27) {
            C1821p.m7185i(fileName, data);
        } else {
            Shell.write(fileName, data);
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9699p(String path) {
        if (Build.VERSION.SDK_INT <= 27) {
            return Shell.mkdirs(path) && qrj(path);
        }
        int iFu4 = com.android.thememanager.basemodule.utils.y9n.fu4();
        return iFu4 != -1 && C1821p.qrj(new File(path), 509, iFu4, iFu4);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9700q(File source, File target, InterfaceC2773k listener) {
        try {
            if (source.isFile()) {
                target.getParentFile().mkdirs();
                if (!C1821p.m7183g(source, target)) {
                    Log.e(f16401k, "copyFile fail. src: " + source.getAbsolutePath() + " target: " + target.getAbsolutePath());
                    return false;
                }
                if (target.exists()) {
                    if (listener == null) {
                        return true;
                    }
                    listener.m9703k(target);
                    return true;
                }
                Log.e(f16401k, "target does not exists after copyFile: " + target.getAbsolutePath());
                return false;
            }
            if (!source.isDirectory()) {
                Log.e(f16401k, "source is not a file or directory: " + source.getAbsolutePath());
                return false;
            }
            if (!target.exists()) {
                if (!target.mkdirs()) {
                    Log.e(f16401k, "targetFolder mkdirs fail: " + target.getAbsolutePath());
                    return false;
                }
                if (!target.exists()) {
                    Log.e(f16401k, "target does not exists after mkdirs: " + target.getAbsolutePath());
                    return false;
                }
            }
            File[] fileArrListFiles = source.listFiles();
            if (fileArrListFiles == null) {
                Log.e(f16401k, "copying folder is empty: " + source.getAbsolutePath());
                return true;
            }
            for (File file : fileArrListFiles) {
                if (!m9700q(file, new File(target, file.getName()), listener)) {
                    Log.e(f16401k, "copyFolder fail. src: " + file.getAbsolutePath());
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            Log.e(f16401k, "copyFolder throw exception : " + e2);
            return false;
        }
    }

    public static boolean qrj(@zy.lvui String path) {
        if ("prada".equals(Build.DEVICE) && Build.VERSION.SDK_INT <= 27) {
            boolean z2 = false;
            if (TextUtils.isEmpty(path)) {
                return false;
            }
            path = new File(path).getAbsolutePath();
            if (path.equals(new File("/data/system/theme/").getAbsolutePath()) && !g1.x2(f61227toq, false)) {
                int iFu4 = com.android.thememanager.basemodule.utils.y9n.fu4();
                boolean z3 = Shell.chmod(path, 509) && (iFu4 != -1 && Shell.chown(path, iFu4, iFu4));
                if (Shell.setfilecon(path, "u:object_r:theme_data_file:s0") && z3) {
                    z2 = true;
                }
                if (z2) {
                    g1.gyi(f61227toq, true);
                }
                return z2;
            }
        }
        return ThemeNativeUtils.updateFilePermissionWithThemeContext(path);
    }

    /* JADX INFO: renamed from: s */
    public static void m9701s(String oldPath, String newPath) throws IOException {
        if (Build.VERSION.SDK_INT <= 27) {
            Shell.link(oldPath, newPath);
        } else {
            Files.createSymbolicLink(FileSystems.getDefault().getPath(newPath, new String[0]), FileSystems.getDefault().getPath(oldPath, new String[0]), new FileAttribute[0]);
        }
    }

    public static boolean toq(String src, String dest) {
        return Build.VERSION.SDK_INT > 27 ? C1821p.m7183g(new File(src), new File(dest)) : Shell.copy(src, dest);
    }

    public static boolean x2(String path) {
        return Build.VERSION.SDK_INT > 27 ? C1821p.ki(path) : Shell.remove(path);
    }

    /* JADX INFO: renamed from: y */
    public static String m9702y(String path) {
        if (TextUtils.isEmpty(path)) {
            return "";
        }
        int iLastIndexOf = path.lastIndexOf(File.separatorChar);
        if (iLastIndexOf > -1) {
            path = path.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = path.lastIndexOf(46);
        return iLastIndexOf2 > -1 ? path.substring(0, iLastIndexOf2) : path;
    }

    public static boolean zy(File source, File target) {
        return m9700q(source, target, null);
    }
}

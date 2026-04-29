package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.miui.Shell;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0498q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.p */
/* JADX INFO: compiled from: FileUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1821p {

    /* JADX INFO: renamed from: k */
    private static final String f10398k = "bFileUtils";

    public static boolean cdj(String path) {
        return Build.VERSION.SDK_INT > 27 ? ki(path) : Shell.remove(path);
    }

    public static boolean f7l8(InputStream inputStream, File destFile) {
        if (inputStream == null) {
            return false;
        }
        try {
            if (destFile.exists() && !destFile.delete()) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 < 0) {
                        fileOutputStream.close();
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } finally {
            }
        } catch (IOException e2) {
            Log.e(f10398k, "copyToFile: " + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7183g(File srcFile, File destFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            try {
                boolean zF7l8 = f7l8(fileInputStream, destFile);
                fileInputStream.close();
                return zF7l8;
            } finally {
            }
        } catch (IOException e2) {
            Log.d(f10398k, "copyFile: " + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m7184h(String path) throws IOException {
        return new String(kja0(path), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: i */
    public static void m7185i(String filename, String string) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        try {
            fileWriter.write(string);
            fileWriter.close();
        } catch (Throwable th) {
            try {
                fileWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7186k(Context context, String permission) {
        return C0498q.m2255k(context, permission) == 0;
    }

    public static boolean ki(String path) {
        if (path == null || path.length() < 1) {
            return false;
        }
        File file = new File(path);
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length < 1) {
                return file.delete();
            }
            for (File file2 : fileArrListFiles) {
                ki(file2.getPath());
            }
            if (y9n.m7250l()) {
                C7794k.f7l8("delete folder should on WorkThread");
            }
        }
        return file.delete();
    }

    private static byte[] kja0(String path) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) randomAccessFile.length());
            byte[] bArr = new byte[8192];
            while (true) {
                int i2 = randomAccessFile.read(bArr);
                if (i2 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    randomAccessFile.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String ld6(@zy.dd String path) {
        if (path == null || path.length() == 0) {
            return "";
        }
        int iLastIndexOf = path.lastIndexOf(File.separatorChar);
        return iLastIndexOf > -1 ? path.substring(iLastIndexOf + 1) : path;
    }

    /* JADX INFO: renamed from: n */
    public static void m7187n(String path, int mode) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        try {
            File file = new File(path);
            if (file.exists()) {
                zy(path, mode);
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                    for (File file2 : fileArrListFiles) {
                        toq(file2, mode);
                        if (file2.isDirectory()) {
                            m7187n(file2.getAbsolutePath(), mode);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String n7h(String path) {
        if (path.charAt(path.length() - 1) == File.separatorChar) {
            return path;
        }
        return path + File.separator;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m7188p(String path) {
        return !TextUtils.isEmpty(path) && new File(path).exists();
    }

    /* JADX INFO: renamed from: q */
    public static int m7189q(File path, int mode) {
        return 0;
    }

    public static boolean qrj(@zy.dd File file, int mode, int uid, int gid) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        if (!qrj(file.getParentFile(), mode, uid, gid)) {
            return false;
        }
        try {
            boolean zMkdir = file.mkdir();
            Os.chmod(file.getPath(), mode);
            Os.chown(file.getPath(), uid, gid);
            return zMkdir;
        } catch (Exception e2) {
            Log.e("FileUtils", "mkdirs failed. ", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7190s(String path) {
        if (path == null || path.length() == 0) {
            return false;
        }
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
            m7189q(file, 493);
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        m7189q(file, 493);
        return true;
    }

    public static File t8r(File parent, String targetFile) {
        File[] fileArrListFiles = parent.listFiles();
        File fileT8r = null;
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.getName().equals(targetFile)) {
                    fileT8r = file;
                }
            }
            if (fileT8r == null) {
                for (File file2 : fileArrListFiles) {
                    fileT8r = t8r(file2, targetFile);
                    if (fileT8r != null) {
                        break;
                    }
                }
            }
        }
        return fileT8r;
    }

    private static int toq(File path, int mode) {
        if (!path.exists()) {
            return -1;
        }
        try {
            Os.chmod(path.getPath(), mode);
            return 0;
        } catch (ErrnoException e2) {
            Log.e(f10398k, "chmod. fail: " + e2);
            return 0;
        }
    }

    @zy.dd
    public static String x2(String path) {
        if (path == null || path.length() < 1) {
            return null;
        }
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path.lastIndexOf(46);
        return iLastIndexOf != -1 ? iLastIndexOf2 != -1 ? iLastIndexOf < iLastIndexOf2 ? path.substring(iLastIndexOf + 1, iLastIndexOf2) : path.substring(iLastIndexOf + 1) : path.substring(iLastIndexOf + 1) : iLastIndexOf2 != -1 ? path.substring(0, iLastIndexOf2) : path;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m7191y(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static int zy(String path, int mode) {
        if (path == null || path.length() < 1) {
            return -1;
        }
        return toq(new File(path), mode);
    }
}

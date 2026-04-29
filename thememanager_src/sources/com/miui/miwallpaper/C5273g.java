package com.miui.miwallpaper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: com.miui.miwallpaper.g */
/* JADX INFO: compiled from: MiuiWallpaperFileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5273g {

    /* JADX INFO: renamed from: k */
    private static final String f29489k = "MiuiWallpaperFileUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f72136toq = 511;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f72137zy = 509;

    public static void f7l8(File file) {
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    f7l8(file2);
                }
            }
            file.delete();
        } catch (Exception e2) {
            Log.e(f29489k, "delete folder failed " + e2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17857g(@lvui File file, int i2) {
        boolean zCreateNewFile;
        if (file.exists()) {
            Log.i(f29489k, "createNewFile file already exists");
        }
        if (file.getParentFile() != null && !file.getParentFile().isDirectory()) {
            m17862s(file.getParentFile(), 511);
        }
        try {
            zCreateNewFile = file.createNewFile();
        } catch (IOException e2) {
            e = e2;
            zCreateNewFile = false;
        }
        try {
            toq(file, i2);
        } catch (IOException e3) {
            e = e3;
            Log.e(f29489k, "createNewFile fail", e);
        }
        return zCreateNewFile;
    }

    public static void kja0(Bitmap bitmap, String str) {
        if (bitmap == null) {
            Log.e(f29489k, "writeToFile fail, bitmap is null");
            return;
        }
        File file = new File(str);
        file.delete();
        if (file.getParent() != null) {
            File file2 = new File(file.getParent());
            if (!file2.exists()) {
                m17862s(file2, 511);
                Log.d(f29489k, "writeToFile, path = " + file.getAbsolutePath());
                toq(file2, 511);
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e2) {
            Log.e(f29489k, "WriteToFile fail : ", e2);
        }
        zy(str, 511);
    }

    public static Bitmap ld6(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[2048];
                while (bufferedInputStream.read(bArr) != -1) {
                    byteArrayOutputStream.write(bArr);
                }
                Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteArrayOutputStream.toByteArray()), new ImageDecoder.OnHeaderDecodedListener() { // from class: com.miui.miwallpaper.n
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        imageDecoder.setMutableRequired(true);
                    }
                });
                bufferedInputStream.close();
                return bitmapDecodeBitmap;
            } finally {
            }
        } catch (Exception e2) {
            Log.w(f29489k, "Can't decode file", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m17859n(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            Log.e(f29489k, "copyStreamToWallpaperFile fail, param error: inputStream = " + inputStream + ", outPath = " + str);
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            qrj(str);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                Class<?> cls = Class.forName("android.os.FileUtils");
                cls.getMethod("copy", InputStream.class, OutputStream.class).invoke(cls, inputStream, fileOutputStream);
                zy(str, 511);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e2) {
            Log.e(f29489k, "WriteToFile fail : ", e2);
        }
    }

    public static void n7h(@lvui List<String> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            qrj(list.get(i2));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m17860p(String str, String str2) {
        try {
            new File(str).renameTo(new File(str2));
        } catch (Exception e2) {
            Log.e(f29489k, "move fail : ", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m17861q(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(f29489k, "copyFile fail, param error: oriPath = " + str + ", copyPath = " + str2);
            return;
        }
        if (new File(str2).exists()) {
            qrj(str2);
        }
        try {
            Files.copy(Paths.get(str, new String[0]), Paths.get(str2, new String[0]), StandardCopyOption.REPLACE_EXISTING);
            zy(str2, 511);
        } catch (IOException e2) {
            Log.e(f29489k, "Failed to copy( " + str + " to + " + str2 + " ): " + e2);
        }
    }

    public static void qrj(@lvui String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Exception e2) {
            Log.e(f29489k, "removeFile failed: ", e2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m17862s(@lvui File file, int i2) {
        if (file.exists()) {
            return file.isDirectory();
        }
        boolean zMkdir = false;
        if (!m17862s(file.getParentFile(), i2)) {
            return false;
        }
        try {
            zMkdir = file.mkdir();
            Log.d(f29489k, "mkdirs::result = " + zMkdir + " file = " + file);
            toq(file, i2);
            return zMkdir;
        } catch (Exception e2) {
            Log.e(f29489k, "mkdirs failed: ", e2);
            return zMkdir;
        }
    }

    private static boolean toq(@lvui File file, int i2) {
        if (file.exists()) {
            return zy(file.getPath(), i2);
        }
        Log.e(f29489k, "chmod param error file does not exist: file = " + file);
        return false;
    }

    public static Bitmap x2(ParcelFileDescriptor parcelFileDescriptor, Bitmap bitmap) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, new Rect(-1, -1, -1, -1), options);
            if (bitmap != null && !bitmap.isRecycled() && bitmap.isMutable() && options.outWidth <= bitmap.getWidth() && options.outHeight <= bitmap.getHeight()) {
                options.inBitmap = bitmap;
            }
            options.inJustDecodeBounds = false;
            options.inMutable = true;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, new Rect(-1, -1, -1, -1), options);
        } catch (Exception e2) {
            Log.w(f29489k, "Can't decode file", e2);
            return null;
        }
    }

    public static boolean zy(@lvui String str, int i2) {
        if (str.length() < 1) {
            Log.e(f29489k, "chmod param error: path = " + str);
            return false;
        }
        try {
            Os.chmod(str, i2);
            return true;
        } catch (ErrnoException e2) {
            Log.e(f29489k, "chmod fail: mode = " + i2, e2);
            return false;
        }
    }
}
